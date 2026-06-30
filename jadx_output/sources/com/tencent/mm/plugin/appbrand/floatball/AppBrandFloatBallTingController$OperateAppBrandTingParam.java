package com.tencent.mm.plugin.appbrand.floatball;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/floatball/AppBrandFloatBallTingController$OperateAppBrandTingParam", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class AppBrandFloatBallTingController$OperateAppBrandTingParam implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallTingController$OperateAppBrandTingParam> CREATOR = new com.tencent.mm.plugin.appbrand.floatball.e0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f78061d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f78062e;

    public AppBrandFloatBallTingController$OperateAppBrandTingParam(java.lang.String operate, java.lang.String appId) {
        kotlin.jvm.internal.o.g(operate, "operate");
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f78061d = operate;
        this.f78062e = appId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallTingController$OperateAppBrandTingParam)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallTingController$OperateAppBrandTingParam appBrandFloatBallTingController$OperateAppBrandTingParam = (com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallTingController$OperateAppBrandTingParam) obj;
        return kotlin.jvm.internal.o.b(this.f78061d, appBrandFloatBallTingController$OperateAppBrandTingParam.f78061d) && kotlin.jvm.internal.o.b(this.f78062e, appBrandFloatBallTingController$OperateAppBrandTingParam.f78062e);
    }

    public int hashCode() {
        return (this.f78061d.hashCode() * 31) + this.f78062e.hashCode();
    }

    public java.lang.String toString() {
        return "OperateAppBrandTingParam(operate=" + this.f78061d + ", appId=" + this.f78062e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f78061d);
        out.writeString(this.f78062e);
    }
}
