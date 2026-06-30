package com.tencent.mm.plugin.appbrand.jsapi.biz;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/biz/JsApiChooseBizPoi$BizPoiLaunchResponse", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final /* data */ class JsApiChooseBizPoi$BizPoiLaunchResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiLaunchResponse> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.biz.c();

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Intent f79908d;

    public JsApiChooseBizPoi$BizPoiLaunchResponse(android.content.Intent intent) {
        this.f79908d = intent;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiLaunchResponse) && kotlin.jvm.internal.o.b(this.f79908d, ((com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiLaunchResponse) obj).f79908d);
    }

    public int hashCode() {
        android.content.Intent intent = this.f79908d;
        if (intent == null) {
            return 0;
        }
        return intent.hashCode();
    }

    public java.lang.String toString() {
        return "BizPoiLaunchResponse(startIntent=" + this.f79908d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeParcelable(this.f79908d, i17);
    }
}
