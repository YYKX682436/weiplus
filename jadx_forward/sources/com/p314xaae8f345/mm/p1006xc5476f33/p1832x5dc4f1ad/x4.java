package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad;

/* loaded from: classes7.dex */
public final class x4 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        java.util.HashSet hashSet = new java.util.HashSet(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            hashSet.add(parcel.readSerializable());
        }
        int readInt2 = parcel.readInt();
        java.util.HashSet hashSet2 = new java.util.HashSet(readInt2);
        for (int i18 = 0; i18 != readInt2; i18++) {
            hashSet2.add(parcel.readString());
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b(hashSet, hashSet2, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b[i17];
    }
}
