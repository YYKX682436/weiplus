package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd;

/* renamed from: com.google.android.material.internal.ParcelableSparseArray */
/* loaded from: classes7.dex */
public class C2709x80699f16 extends android.util.SparseArray<android.os.Parcelable> implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2709x80699f16> f7860x681a0c0c = new fa.w();

    public C2709x80699f16(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
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
