package com.tencent.mm.plugin.appbrand.appcache.predownload.export;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgStorageExportServiceIPC$PkgParams", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final /* data */ class WxaPkgStorageExportServiceIPC$PkgParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceIPC$PkgParams> CREATOR = new com.tencent.mm.plugin.appbrand.appcache.predownload.export.q0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f75770d;

    /* renamed from: e, reason: collision with root package name */
    public final int f75771e;

    /* renamed from: f, reason: collision with root package name */
    public final int f75772f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f75773g;

    public WxaPkgStorageExportServiceIPC$PkgParams(java.lang.String appId, int i17, int i18, java.lang.String str) {
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f75770d = appId;
        this.f75771e = i17;
        this.f75772f = i18;
        this.f75773g = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceIPC$PkgParams)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceIPC$PkgParams wxaPkgStorageExportServiceIPC$PkgParams = (com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceIPC$PkgParams) obj;
        return kotlin.jvm.internal.o.b(this.f75770d, wxaPkgStorageExportServiceIPC$PkgParams.f75770d) && this.f75771e == wxaPkgStorageExportServiceIPC$PkgParams.f75771e && this.f75772f == wxaPkgStorageExportServiceIPC$PkgParams.f75772f && kotlin.jvm.internal.o.b(this.f75773g, wxaPkgStorageExportServiceIPC$PkgParams.f75773g);
    }

    public int hashCode() {
        int hashCode = ((((this.f75770d.hashCode() * 31) + java.lang.Integer.hashCode(this.f75771e)) * 31) + java.lang.Integer.hashCode(this.f75772f)) * 31;
        java.lang.String str = this.f75773g;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "PkgParams(appId=" + this.f75770d + ", versionType=" + this.f75771e + ", version=" + this.f75772f + ", filePath=" + this.f75773g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f75770d);
        out.writeInt(this.f75771e);
        out.writeInt(this.f75772f);
        out.writeString(this.f75773g);
    }

    public /* synthetic */ WxaPkgStorageExportServiceIPC$PkgParams(java.lang.String str, int i17, int i18, java.lang.String str2, int i19, kotlin.jvm.internal.i iVar) {
        this(str, (i19 & 2) != 0 ? 0 : i17, (i19 & 4) != 0 ? 0 : i18, (i19 & 8) != 0 ? null : str2);
    }
}
