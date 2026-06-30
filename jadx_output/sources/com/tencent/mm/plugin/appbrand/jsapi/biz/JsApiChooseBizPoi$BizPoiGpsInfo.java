package com.tencent.mm.plugin.appbrand.jsapi.biz;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/biz/JsApiChooseBizPoi$BizPoiGpsInfo", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final /* data */ class JsApiChooseBizPoi$BizPoiGpsInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiGpsInfo> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.biz.b();

    /* renamed from: d, reason: collision with root package name */
    public final double f79906d;

    /* renamed from: e, reason: collision with root package name */
    public final double f79907e;

    public JsApiChooseBizPoi$BizPoiGpsInfo(double d17, double d18) {
        this.f79906d = d17;
        this.f79907e = d18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiGpsInfo)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiGpsInfo jsApiChooseBizPoi$BizPoiGpsInfo = (com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiGpsInfo) obj;
        return java.lang.Double.compare(this.f79906d, jsApiChooseBizPoi$BizPoiGpsInfo.f79906d) == 0 && java.lang.Double.compare(this.f79907e, jsApiChooseBizPoi$BizPoiGpsInfo.f79907e) == 0;
    }

    public int hashCode() {
        return (java.lang.Double.hashCode(this.f79906d) * 31) + java.lang.Double.hashCode(this.f79907e);
    }

    public java.lang.String toString() {
        return "BizPoiGpsInfo(latitude=" + this.f79906d + ", longitude=" + this.f79907e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeDouble(this.f79906d);
        out.writeDouble(this.f79907e);
    }
}
