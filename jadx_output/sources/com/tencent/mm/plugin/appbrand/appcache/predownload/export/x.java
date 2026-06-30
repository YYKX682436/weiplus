package com.tencent.mm.plugin.appbrand.appcache.predownload.export;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgDownloaderExportServiceIPC$DownloadPkgParam;", "kotlin.jvm.PlatformType", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgDownloaderExportServiceIPC$DownloadPkgResult;", "callback", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgDownloaderExportServiceIPC$DownloadPkgParam;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class x<InputType, ResultType> implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appcache.predownload.export.x f75836d = new com.tencent.mm.plugin.appbrand.appcache.predownload.export.x();

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$DownloadPkgParam wxaPkgDownloaderExportServiceIPC$DownloadPkgParam = (com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$DownloadPkgParam) obj;
        java.lang.String str = wxaPkgDownloaderExportServiceIPC$DownloadPkgParam.f75760d;
        int i17 = wxaPkgDownloaderExportServiceIPC$DownloadPkgParam.f75761e;
        try {
            com.tencent.mm.plugin.appbrand.appcache.predownload.export.m0 m0Var = (com.tencent.mm.plugin.appbrand.appcache.predownload.export.m0) com.tencent.mm.plugin.appbrand.appcache.predownload.export.m0.f75819d.b();
            if (m0Var != null) {
                m0Var.A7(str, i17, new com.tencent.mm.plugin.appbrand.appcache.predownload.export.v(rVar), new com.tencent.mm.plugin.appbrand.appcache.predownload.export.w(rVar));
            } else {
                if (!gm0.j1.b().f273254q) {
                    throw new c01.c();
                }
                throw null;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgDownloaderExportServiceIPC", "startDownloadPkg(appId:" + str + ", versionType:" + i17 + ") get exception:" + e17);
            if (rVar != null) {
                rVar.a(new com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$DownloadPkgResult(false, null, null, -1, "Exception{" + e17 + '}', 6, null));
            }
        }
    }
}
