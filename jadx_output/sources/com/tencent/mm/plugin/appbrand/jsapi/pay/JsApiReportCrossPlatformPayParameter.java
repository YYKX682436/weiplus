package com.tencent.mm.plugin.appbrand.jsapi.pay;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/pay/JsApiReportCrossPlatformPayParameter;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class JsApiReportCrossPlatformPayParameter implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.pay.JsApiReportCrossPlatformPayParameter> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.pay.y0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f82551d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f82552e;

    public JsApiReportCrossPlatformPayParameter(java.lang.String type, java.lang.String reportId) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(reportId, "reportId");
        this.f82551d = type;
        this.f82552e = reportId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.pay.JsApiReportCrossPlatformPayParameter)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.pay.JsApiReportCrossPlatformPayParameter jsApiReportCrossPlatformPayParameter = (com.tencent.mm.plugin.appbrand.jsapi.pay.JsApiReportCrossPlatformPayParameter) obj;
        return kotlin.jvm.internal.o.b(this.f82551d, jsApiReportCrossPlatformPayParameter.f82551d) && kotlin.jvm.internal.o.b(this.f82552e, jsApiReportCrossPlatformPayParameter.f82552e);
    }

    public int hashCode() {
        return (this.f82551d.hashCode() * 31) + this.f82552e.hashCode();
    }

    public java.lang.String toString() {
        return "JsApiReportCrossPlatformPayParameter(type=" + this.f82551d + ", reportId=" + this.f82552e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f82551d);
        out.writeString(this.f82552e);
    }
}
