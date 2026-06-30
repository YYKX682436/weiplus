package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e;

/* loaded from: classes8.dex */
public final class x1 implements android.os.Parcelable.Creator {
    public x1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.C16599x278bffa0 c16599x278bffa0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.C16599x278bffa0();
        int readInt = parcel.readInt();
        android.graphics.Point point = c16599x278bffa0.f231940d;
        point.x = readInt;
        point.y = parcel.readInt();
        return c16599x278bffa0;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.C16599x278bffa0[i17];
    }
}
