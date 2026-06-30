package com.tencent.mm.plugin.appbrand.pip;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/pip/PipStablePos;", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/appbrand/pip/a1", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final /* data */ class PipStablePos implements android.os.Parcelable {
    public static final com.tencent.mm.plugin.appbrand.pip.a1 CREATOR = new com.tencent.mm.plugin.appbrand.pip.a1(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f87422d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Point f87423e;

    public PipStablePos(java.lang.String appId, android.graphics.Point point) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(point, "point");
        this.f87422d = appId;
        this.f87423e = point;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.pip.PipStablePos)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.pip.PipStablePos pipStablePos = (com.tencent.mm.plugin.appbrand.pip.PipStablePos) obj;
        return kotlin.jvm.internal.o.b(this.f87422d, pipStablePos.f87422d) && kotlin.jvm.internal.o.b(this.f87423e, pipStablePos.f87423e);
    }

    public int hashCode() {
        return (this.f87422d.hashCode() * 31) + this.f87423e.hashCode();
    }

    public java.lang.String toString() {
        return "PipStablePos(appId=" + this.f87422d + ", point=" + this.f87423e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        try {
            parcel.writeString(this.f87422d);
            parcel.writeParcelable(this.f87423e, i17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandPipStablePosLogicWC", "writeToParcel fail since " + e17);
        }
    }
}
