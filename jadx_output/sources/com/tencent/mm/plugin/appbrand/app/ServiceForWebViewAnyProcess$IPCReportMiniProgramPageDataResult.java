package com.tencent.mm.plugin.appbrand.app;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/app/ServiceForWebViewAnyProcess$IPCReportMiniProgramPageDataResult", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class ServiceForWebViewAnyProcess$IPCReportMiniProgramPageDataResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.app.ServiceForWebViewAnyProcess$IPCReportMiniProgramPageDataResult> CREATOR = new com.tencent.mm.plugin.appbrand.app.u8();

    /* renamed from: d, reason: collision with root package name */
    public final int f74998d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f74999e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f75000f;

    public ServiceForWebViewAnyProcess$IPCReportMiniProgramPageDataResult(int i17, boolean z17, java.lang.String str) {
        this.f74998d = i17;
        this.f74999e = z17;
        this.f75000f = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.app.ServiceForWebViewAnyProcess$IPCReportMiniProgramPageDataResult)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.app.ServiceForWebViewAnyProcess$IPCReportMiniProgramPageDataResult serviceForWebViewAnyProcess$IPCReportMiniProgramPageDataResult = (com.tencent.mm.plugin.appbrand.app.ServiceForWebViewAnyProcess$IPCReportMiniProgramPageDataResult) obj;
        return this.f74998d == serviceForWebViewAnyProcess$IPCReportMiniProgramPageDataResult.f74998d && this.f74999e == serviceForWebViewAnyProcess$IPCReportMiniProgramPageDataResult.f74999e && kotlin.jvm.internal.o.b(this.f75000f, serviceForWebViewAnyProcess$IPCReportMiniProgramPageDataResult.f75000f);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f74998d) * 31) + java.lang.Boolean.hashCode(this.f74999e)) * 31;
        java.lang.String str = this.f75000f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "IPCReportMiniProgramPageDataResult(reportId=" + this.f74998d + ", isSucceed=" + this.f74999e + ", errMsg=" + this.f75000f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f74998d);
        out.writeInt(this.f74999e ? 1 : 0);
        out.writeString(this.f75000f);
    }
}
