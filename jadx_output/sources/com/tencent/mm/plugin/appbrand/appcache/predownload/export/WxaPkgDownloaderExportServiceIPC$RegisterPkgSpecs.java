package com.tencent.mm.plugin.appbrand.appcache.predownload.export;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgDownloaderExportServiceIPC$RegisterPkgSpecs", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class WxaPkgDownloaderExportServiceIPC$RegisterPkgSpecs implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$RegisterPkgSpecs> CREATOR = new com.tencent.mm.plugin.appbrand.appcache.predownload.export.s();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f75767d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f75768e;

    /* renamed from: f, reason: collision with root package name */
    public final int f75769f;

    public WxaPkgDownloaderExportServiceIPC$RegisterPkgSpecs(java.lang.String username, java.lang.String appId, int i17) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f75767d = username;
        this.f75768e = appId;
        this.f75769f = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$RegisterPkgSpecs)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$RegisterPkgSpecs wxaPkgDownloaderExportServiceIPC$RegisterPkgSpecs = (com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$RegisterPkgSpecs) obj;
        return kotlin.jvm.internal.o.b(this.f75767d, wxaPkgDownloaderExportServiceIPC$RegisterPkgSpecs.f75767d) && kotlin.jvm.internal.o.b(this.f75768e, wxaPkgDownloaderExportServiceIPC$RegisterPkgSpecs.f75768e) && this.f75769f == wxaPkgDownloaderExportServiceIPC$RegisterPkgSpecs.f75769f;
    }

    public int hashCode() {
        return (((this.f75767d.hashCode() * 31) + this.f75768e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f75769f);
    }

    public java.lang.String toString() {
        return "RegisterPkgSpecs(username=" + this.f75767d + ", appId=" + this.f75768e + ", scene=" + this.f75769f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f75767d);
        out.writeString(this.f75768e);
        out.writeInt(this.f75769f);
    }
}
