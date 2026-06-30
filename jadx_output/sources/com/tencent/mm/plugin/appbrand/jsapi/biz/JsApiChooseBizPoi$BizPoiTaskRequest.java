package com.tencent.mm.plugin.appbrand.jsapi.biz;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/biz/JsApiChooseBizPoi$BizPoiTaskRequest", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final /* data */ class JsApiChooseBizPoi$BizPoiTaskRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiTaskRequest> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.biz.e();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f79912d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiGpsInfo f79913e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f79914f;

    public JsApiChooseBizPoi$BizPoiTaskRequest(java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiGpsInfo deviceGpsInfo, java.util.List imgGpsInfoList) {
        kotlin.jvm.internal.o.g(deviceGpsInfo, "deviceGpsInfo");
        kotlin.jvm.internal.o.g(imgGpsInfoList, "imgGpsInfoList");
        this.f79912d = str;
        this.f79913e = deviceGpsInfo;
        this.f79914f = imgGpsInfoList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiTaskRequest)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiTaskRequest jsApiChooseBizPoi$BizPoiTaskRequest = (com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiTaskRequest) obj;
        return kotlin.jvm.internal.o.b(this.f79912d, jsApiChooseBizPoi$BizPoiTaskRequest.f79912d) && kotlin.jvm.internal.o.b(this.f79913e, jsApiChooseBizPoi$BizPoiTaskRequest.f79913e) && kotlin.jvm.internal.o.b(this.f79914f, jsApiChooseBizPoi$BizPoiTaskRequest.f79914f);
    }

    public int hashCode() {
        java.lang.String str = this.f79912d;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.f79913e.hashCode()) * 31) + this.f79914f.hashCode();
    }

    public java.lang.String toString() {
        return "BizPoiTaskRequest(bizUin=" + this.f79912d + ", deviceGpsInfo=" + this.f79913e + ", imgGpsInfoList=" + this.f79914f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f79912d);
        this.f79913e.writeToParcel(out, i17);
        java.util.List list = this.f79914f;
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiGpsInfo) it.next()).writeToParcel(out, i17);
        }
    }
}
