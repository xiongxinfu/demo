package com.seecen.homdwork;

public class Work5 {
    /*Function to sort array using insertion sort*/
    void sort(int arr[]) {

        for (int i = 1; i < arr.length;i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j--;
            }
            arr[j + 1] = key;
        }
    }

    /* A utility function to print array of size n*/
    static void printArray(int arr[]) {

        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6};

        Work5 ob = new Work5();
        ob.sort(arr);

        printArray(arr);


    }
}



