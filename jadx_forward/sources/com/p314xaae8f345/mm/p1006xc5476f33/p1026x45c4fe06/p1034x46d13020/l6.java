package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public final class l6 implements android.os.Parcelable.Creator {
    public l6(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11715x1214f04e(readInt, readInt2 == 1 ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.y5.ASC : readInt2 == 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.y5.DESC : null, parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11715x1214f04e[i17];
    }
}
