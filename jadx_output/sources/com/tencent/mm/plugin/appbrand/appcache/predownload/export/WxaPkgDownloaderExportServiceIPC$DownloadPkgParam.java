package com.tencent.mm.plugin.appbrand.appcache.predownload.export;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgDownloaderExportServiceIPC$DownloadPkgParam", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class WxaPkgDownloaderExportServiceIPC$DownloadPkgParam implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$DownloadPkgParam> CREATOR = new com.tencent.mm.plugin.appbrand.appcache.predownload.export.q();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f75760d;

    /* renamed from: e, reason: collision with root package name */
    public final int f75761e;

    public WxaPkgDownloaderExportServiceIPC$DownloadPkgParam(java.lang.String str, int i17) {
        this.f75760d = str;
        this.f75761e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$DownloadPkgParam)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$DownloadPkgParam wxaPkgDownloaderExportServiceIPC$DownloadPkgParam = (com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$DownloadPkgParam) obj;
        return kotlin.jvm.internal.o.b(this.f75760d, wxaPkgDownloaderExportServiceIPC$DownloadPkgParam.f75760d) && this.f75761e == wxaPkgDownloaderExportServiceIPC$DownloadPkgParam.f75761e;
    }

    public int hashCode() {
        java.lang.String str = this.f75760d;
        return ((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.f75761e);
    }

    public java.lang.String toString() {
        return "DownloadPkgParam(appId=" + this.f75760d + ", versionType=" + this.f75761e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f75760d);
        out.writeInt(this.f75761e);
    }
}
