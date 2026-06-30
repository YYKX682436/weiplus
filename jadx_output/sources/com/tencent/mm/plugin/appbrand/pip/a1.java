package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public final class a1 implements android.os.Parcelable.Creator {
    public a1(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.appbrand.pip.PipStablePos pipStablePos;
        kotlin.jvm.internal.o.g(parcel, "parcel");
        try {
            java.lang.String readString = parcel.readString();
            android.graphics.Point point = (android.graphics.Point) parcel.readParcelable(android.graphics.Point.class.getClassLoader());
            if (readString != null && point != null) {
                pipStablePos = new com.tencent.mm.plugin.appbrand.pip.PipStablePos(readString, point);
                return pipStablePos;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandPipStablePosLogicWC", "createFromParcel fail, appId: " + readString + ", point: " + point);
            pipStablePos = com.tencent.mm.plugin.appbrand.pip.y0.f87568a;
            return pipStablePos;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandPipStablePosLogicWC", "createFromParcel fail since " + e17);
            return com.tencent.mm.plugin.appbrand.pip.y0.f87568a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.pip.PipStablePos[i17];
    }
}
