package com.tencent.mm.plugin.appbrand.jsapi.biz;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/biz/JsApiChooseBizPoi$BizPoiResponse", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final /* data */ class JsApiChooseBizPoi$BizPoiResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiResponse> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.biz.d();

    /* renamed from: d, reason: collision with root package name */
    public final int f79909d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiLaunchResponse f79910e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiTaskResponse f79911f;

    public JsApiChooseBizPoi$BizPoiResponse(int i17, com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiLaunchResponse jsApiChooseBizPoi$BizPoiLaunchResponse, com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiTaskResponse jsApiChooseBizPoi$BizPoiTaskResponse) {
        this.f79909d = i17;
        this.f79910e = jsApiChooseBizPoi$BizPoiLaunchResponse;
        this.f79911f = jsApiChooseBizPoi$BizPoiTaskResponse;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiResponse)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiResponse jsApiChooseBizPoi$BizPoiResponse = (com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiResponse) obj;
        return this.f79909d == jsApiChooseBizPoi$BizPoiResponse.f79909d && kotlin.jvm.internal.o.b(this.f79910e, jsApiChooseBizPoi$BizPoiResponse.f79910e) && kotlin.jvm.internal.o.b(this.f79911f, jsApiChooseBizPoi$BizPoiResponse.f79911f);
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f79909d) * 31;
        com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiLaunchResponse jsApiChooseBizPoi$BizPoiLaunchResponse = this.f79910e;
        int hashCode2 = (hashCode + (jsApiChooseBizPoi$BizPoiLaunchResponse == null ? 0 : jsApiChooseBizPoi$BizPoiLaunchResponse.hashCode())) * 31;
        com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiTaskResponse jsApiChooseBizPoi$BizPoiTaskResponse = this.f79911f;
        return hashCode2 + (jsApiChooseBizPoi$BizPoiTaskResponse != null ? jsApiChooseBizPoi$BizPoiTaskResponse.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "BizPoiResponse(responseType=" + this.f79909d + ", launchResponse=" + this.f79910e + ", selectResponse=" + this.f79911f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f79909d);
        com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiLaunchResponse jsApiChooseBizPoi$BizPoiLaunchResponse = this.f79910e;
        if (jsApiChooseBizPoi$BizPoiLaunchResponse == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            jsApiChooseBizPoi$BizPoiLaunchResponse.writeToParcel(out, i17);
        }
        com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiTaskResponse jsApiChooseBizPoi$BizPoiTaskResponse = this.f79911f;
        if (jsApiChooseBizPoi$BizPoiTaskResponse == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            jsApiChooseBizPoi$BizPoiTaskResponse.writeToParcel(out, i17);
        }
    }
}
