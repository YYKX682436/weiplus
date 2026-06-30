package com.tencent.mm.plugin.appbrand.jsapi.pay;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/pay/JsApiReportCrossPlatformPayResponse;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class JsApiReportCrossPlatformPayResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.pay.JsApiReportCrossPlatformPayResponse> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.pay.z0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f82553d;

    public JsApiReportCrossPlatformPayResponse(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        this.f82553d = sessionId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.appbrand.jsapi.pay.JsApiReportCrossPlatformPayResponse) && kotlin.jvm.internal.o.b(this.f82553d, ((com.tencent.mm.plugin.appbrand.jsapi.pay.JsApiReportCrossPlatformPayResponse) obj).f82553d);
    }

    public int hashCode() {
        return this.f82553d.hashCode();
    }

    public java.lang.String toString() {
        return "JsApiReportCrossPlatformPayResponse(sessionId=" + this.f82553d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f82553d);
    }
}
