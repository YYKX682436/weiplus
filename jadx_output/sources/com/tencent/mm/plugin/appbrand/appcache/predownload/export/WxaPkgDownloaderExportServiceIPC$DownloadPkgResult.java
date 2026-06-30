package com.tencent.mm.plugin.appbrand.appcache.predownload.export;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgDownloaderExportServiceIPC$DownloadPkgResult", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class WxaPkgDownloaderExportServiceIPC$DownloadPkgResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$DownloadPkgResult> CREATOR = new com.tencent.mm.plugin.appbrand.appcache.predownload.export.r();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f75762d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.ContentValues f75763e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f75764f;

    /* renamed from: g, reason: collision with root package name */
    public final int f75765g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f75766h;

    public WxaPkgDownloaderExportServiceIPC$DownloadPkgResult(boolean z17, android.content.ContentValues contentValues, java.lang.String str, int i17, java.lang.String str2) {
        this.f75762d = z17;
        this.f75763e = contentValues;
        this.f75764f = str;
        this.f75765g = i17;
        this.f75766h = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$DownloadPkgResult)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$DownloadPkgResult wxaPkgDownloaderExportServiceIPC$DownloadPkgResult = (com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$DownloadPkgResult) obj;
        return this.f75762d == wxaPkgDownloaderExportServiceIPC$DownloadPkgResult.f75762d && kotlin.jvm.internal.o.b(this.f75763e, wxaPkgDownloaderExportServiceIPC$DownloadPkgResult.f75763e) && kotlin.jvm.internal.o.b(this.f75764f, wxaPkgDownloaderExportServiceIPC$DownloadPkgResult.f75764f) && this.f75765g == wxaPkgDownloaderExportServiceIPC$DownloadPkgResult.f75765g && kotlin.jvm.internal.o.b(this.f75766h, wxaPkgDownloaderExportServiceIPC$DownloadPkgResult.f75766h);
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f75762d) * 31;
        android.content.ContentValues contentValues = this.f75763e;
        int hashCode2 = (hashCode + (contentValues == null ? 0 : contentValues.hashCode())) * 31;
        java.lang.String str = this.f75764f;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f75765g)) * 31;
        java.lang.String str2 = this.f75766h;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "DownloadPkgResult(isSuccess=" + this.f75762d + ", recordContentValues=" + this.f75763e + ", filePath=" + this.f75764f + ", errCode=" + this.f75765g + ", errMsg=" + this.f75766h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f75762d ? 1 : 0);
        out.writeParcelable(this.f75763e, i17);
        out.writeString(this.f75764f);
        out.writeInt(this.f75765g);
        out.writeString(this.f75766h);
    }

    public /* synthetic */ WxaPkgDownloaderExportServiceIPC$DownloadPkgResult(boolean z17, android.content.ContentValues contentValues, java.lang.String str, int i17, java.lang.String str2, int i18, kotlin.jvm.internal.i iVar) {
        this(z17, (i18 & 2) != 0 ? null : contentValues, (i18 & 4) != 0 ? null : str, (i18 & 8) != 0 ? -1 : i17, (i18 & 16) != 0 ? null : str2);
    }
}
