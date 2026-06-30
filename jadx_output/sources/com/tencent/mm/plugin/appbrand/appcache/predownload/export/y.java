package com.tencent.mm.plugin.appbrand.appcache.predownload.export;

/* loaded from: classes7.dex */
public final class y implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.m6 f75837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.l6 f75838e;

    public y(com.tencent.mm.plugin.appbrand.service.m6 m6Var, com.tencent.mm.plugin.appbrand.service.l6 l6Var) {
        this.f75837d = m6Var;
        this.f75838e = l6Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$DownloadPkgResult wxaPkgDownloaderExportServiceIPC$DownloadPkgResult = (com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$DownloadPkgResult) obj;
        if (!wxaPkgDownloaderExportServiceIPC$DownloadPkgResult.f75762d) {
            com.tencent.mm.plugin.appbrand.service.l6 l6Var = this.f75838e;
            if (l6Var != null) {
                l6Var.a(wxaPkgDownloaderExportServiceIPC$DownloadPkgResult.f75765g, wxaPkgDownloaderExportServiceIPC$DownloadPkgResult.f75766h);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.appbrand.appcache.n9 n9Var = new com.tencent.mm.plugin.appbrand.appcache.n9();
        android.content.ContentValues contentValues = wxaPkgDownloaderExportServiceIPC$DownloadPkgResult.f75763e;
        kotlin.jvm.internal.o.d(contentValues);
        n9Var.convertFrom(contentValues, true);
        java.lang.String str = wxaPkgDownloaderExportServiceIPC$DownloadPkgResult.f75764f;
        kotlin.jvm.internal.o.d(str);
        com.tencent.mm.plugin.appbrand.service.m6 m6Var = this.f75837d;
        if (m6Var != null) {
            m6Var.a(n9Var, str);
        }
    }
}
