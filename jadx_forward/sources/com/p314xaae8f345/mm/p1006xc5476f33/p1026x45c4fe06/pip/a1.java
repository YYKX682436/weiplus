package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip;

/* loaded from: classes7.dex */
public final class a1 implements android.os.Parcelable.Creator {
    public a1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.C12546x36433d62 c12546x36433d62;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        try {
            java.lang.String readString = parcel.readString();
            android.graphics.Point point = (android.graphics.Point) parcel.readParcelable(android.graphics.Point.class.getClassLoader());
            if (readString != null && point != null) {
                c12546x36433d62 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.C12546x36433d62(readString, point);
                return c12546x36433d62;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandPipStablePosLogicWC", "createFromParcel fail, appId: " + readString + ", point: " + point);
            c12546x36433d62 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y0.f169101a;
            return c12546x36433d62;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandPipStablePosLogicWC", "createFromParcel fail since " + e17);
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y0.f169101a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.C12546x36433d62[i17];
    }
}
