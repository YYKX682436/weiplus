package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342;

/* loaded from: classes7.dex */
public final class m implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        java.lang.String readString2 = parcel.readString();
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CloseWhenClickEmptyAreaConfig(readString, k91.s2.m142211xdce0328(readString2 != null ? readString2 : ""));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CloseWhenClickEmptyAreaConfig[i17];
    }
}
