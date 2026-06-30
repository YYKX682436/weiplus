package com.tencent.mm.plugin.appbrand.service;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/service/AppBrandLaunchPreCompileAndGenCodeCacheLogic$IPCPreCompileRequest", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class AppBrandLaunchPreCompileAndGenCodeCacheLogic$IPCPreCompileRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.service.AppBrandLaunchPreCompileAndGenCodeCacheLogic$IPCPreCompileRequest> CREATOR = new com.tencent.mm.plugin.appbrand.service.b();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f88599d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo f88600e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String[] f88601f;

    public AppBrandLaunchPreCompileAndGenCodeCacheLogic$IPCPreCompileRequest(java.lang.String appId, com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo appPkgHolder, java.lang.String[] scriptFilePaths) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(appPkgHolder, "appPkgHolder");
        kotlin.jvm.internal.o.g(scriptFilePaths, "scriptFilePaths");
        this.f88599d = appId;
        this.f88600e = appPkgHolder;
        this.f88601f = scriptFilePaths;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.service.AppBrandLaunchPreCompileAndGenCodeCacheLogic$IPCPreCompileRequest)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.service.AppBrandLaunchPreCompileAndGenCodeCacheLogic$IPCPreCompileRequest appBrandLaunchPreCompileAndGenCodeCacheLogic$IPCPreCompileRequest = (com.tencent.mm.plugin.appbrand.service.AppBrandLaunchPreCompileAndGenCodeCacheLogic$IPCPreCompileRequest) obj;
        return kotlin.jvm.internal.o.b(this.f88599d, appBrandLaunchPreCompileAndGenCodeCacheLogic$IPCPreCompileRequest.f88599d) && kotlin.jvm.internal.o.b(this.f88600e, appBrandLaunchPreCompileAndGenCodeCacheLogic$IPCPreCompileRequest.f88600e) && kotlin.jvm.internal.o.b(this.f88601f, appBrandLaunchPreCompileAndGenCodeCacheLogic$IPCPreCompileRequest.f88601f);
    }

    public int hashCode() {
        return (((this.f88599d.hashCode() * 31) + this.f88600e.hashCode()) * 31) + java.util.Arrays.hashCode(this.f88601f);
    }

    public java.lang.String toString() {
        return "IPCPreCompileRequest(appId=" + this.f88599d + ", appPkgHolder=" + this.f88600e + ", scriptFilePaths=" + java.util.Arrays.toString(this.f88601f) + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f88599d);
        out.writeParcelable(this.f88600e, i17);
        out.writeStringArray(this.f88601f);
    }
}
