package com.tencent.mm.plugin.appbrand.launching.report;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/report/AppBrandRuntimeReloadReportBundle;", "Landroid/os/Parcelable;", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class AppBrandRuntimeReloadReportBundle implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle> CREATOR = new wg1.c();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f85127d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f85128e;

    public AppBrandRuntimeReloadReportBundle(java.lang.String refererInstanceId, java.lang.String str) {
        kotlin.jvm.internal.o.g(refererInstanceId, "refererInstanceId");
        this.f85127d = refererInstanceId;
        this.f85128e = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle appBrandRuntimeReloadReportBundle = (com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle) obj;
        return kotlin.jvm.internal.o.b(this.f85127d, appBrandRuntimeReloadReportBundle.f85127d) && kotlin.jvm.internal.o.b(this.f85128e, appBrandRuntimeReloadReportBundle.f85128e);
    }

    public int hashCode() {
        int hashCode = this.f85127d.hashCode() * 31;
        java.lang.String str = this.f85128e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "AppBrandRuntimeReloadReportBundle(refererInstanceId=" + this.f85127d + ", reloadReason=" + this.f85128e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f85127d);
        out.writeString(this.f85128e);
    }
}
