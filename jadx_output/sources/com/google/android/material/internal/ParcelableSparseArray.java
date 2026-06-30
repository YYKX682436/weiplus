package com.google.android.material.internal;

/* loaded from: classes7.dex */
public class ParcelableSparseArray extends android.util.SparseArray<android.os.Parcelable> implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.material.internal.ParcelableSparseArray> CREATOR = new fa.w();

    public ParcelableSparseArray(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        android.os.Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i17 = 0; i17 < readInt; i17++) {
            put(iArr[i17], readParcelableArray[i17]);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int size = size();
        int[] iArr = new int[size];
        android.os.Parcelable[] parcelableArr = new android.os.Parcelable[size];
        for (int i18 = 0; i18 < size; i18++) {
            iArr[i18] = keyAt(i18);
            parcelableArr[i18] = valueAt(i18);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i17);
    }
}
