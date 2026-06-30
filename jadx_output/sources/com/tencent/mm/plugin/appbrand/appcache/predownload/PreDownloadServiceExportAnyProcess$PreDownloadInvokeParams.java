package com.tencent.mm.plugin.appbrand.appcache.predownload;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/appcache/predownload/PreDownloadServiceExportAnyProcess$PreDownloadInvokeParams", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class PreDownloadServiceExportAnyProcess$PreDownloadInvokeParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.appcache.predownload.PreDownloadServiceExportAnyProcess$PreDownloadInvokeParams> CREATOR = new com.tencent.mm.plugin.appbrand.appcache.predownload.e0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f75727d;

    /* renamed from: e, reason: collision with root package name */
    public final int f75728e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f75729f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f75730g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f75731h;

    public PreDownloadServiceExportAnyProcess$PreDownloadInvokeParams(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f75727d = str;
        this.f75728e = i17;
        this.f75729f = str2;
        this.f75730g = str3;
        this.f75731h = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.appcache.predownload.PreDownloadServiceExportAnyProcess$PreDownloadInvokeParams)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.appcache.predownload.PreDownloadServiceExportAnyProcess$PreDownloadInvokeParams preDownloadServiceExportAnyProcess$PreDownloadInvokeParams = (com.tencent.mm.plugin.appbrand.appcache.predownload.PreDownloadServiceExportAnyProcess$PreDownloadInvokeParams) obj;
        return kotlin.jvm.internal.o.b(this.f75727d, preDownloadServiceExportAnyProcess$PreDownloadInvokeParams.f75727d) && this.f75728e == preDownloadServiceExportAnyProcess$PreDownloadInvokeParams.f75728e && kotlin.jvm.internal.o.b(this.f75729f, preDownloadServiceExportAnyProcess$PreDownloadInvokeParams.f75729f) && kotlin.jvm.internal.o.b(this.f75730g, preDownloadServiceExportAnyProcess$PreDownloadInvokeParams.f75730g) && kotlin.jvm.internal.o.b(this.f75731h, preDownloadServiceExportAnyProcess$PreDownloadInvokeParams.f75731h);
    }

    public int hashCode() {
        java.lang.String str = this.f75727d;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.f75728e)) * 31;
        java.lang.String str2 = this.f75729f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f75730g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f75731h;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "PreDownloadInvokeParams(username=" + this.f75727d + ", scene=" + this.f75728e + ", appId=" + this.f75729f + ", path=" + this.f75730g + ", preferModuleName=" + this.f75731h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f75727d);
        out.writeInt(this.f75728e);
        out.writeString(this.f75729f);
        out.writeString(this.f75730g);
        out.writeString(this.f75731h);
    }

    public /* synthetic */ PreDownloadServiceExportAnyProcess$PreDownloadInvokeParams(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, kotlin.jvm.internal.i iVar) {
        this(str, i17, (i18 & 4) != 0 ? null : str2, (i18 & 8) != 0 ? null : str3, (i18 & 16) != 0 ? null : str4);
    }
}
