package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz;

/* loaded from: classes7.dex */
public final class f implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.Boolean valueOf;
        java.lang.Boolean valueOf2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = java.lang.Boolean.valueOf(parcel.readInt() != 0);
        }
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = java.lang.Boolean.valueOf(parcel.readInt() != 0);
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12026xb4f163e2(valueOf, valueOf2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : java.lang.Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : java.lang.Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12026xb4f163e2[i17];
    }
}
