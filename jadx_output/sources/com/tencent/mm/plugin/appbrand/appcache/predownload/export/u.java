package com.tencent.mm.plugin.appbrand.appcache.predownload.export;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgDownloaderExportServiceIPC$RegisterPkgSpecs;", "kotlin.jvm.PlatformType", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "callback", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgDownloaderExportServiceIPC$RegisterPkgSpecs;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class u<InputType, ResultType> implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appcache.predownload.export.u f75831d = new com.tencent.mm.plugin.appbrand.appcache.predownload.export.u();

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.appcache.predownload.export.m0 m0Var;
        com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$RegisterPkgSpecs wxaPkgDownloaderExportServiceIPC$RegisterPkgSpecs = (com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$RegisterPkgSpecs) obj;
        java.lang.String str = wxaPkgDownloaderExportServiceIPC$RegisterPkgSpecs.f75767d;
        java.lang.String str2 = wxaPkgDownloaderExportServiceIPC$RegisterPkgSpecs.f75768e;
        int i17 = wxaPkgDownloaderExportServiceIPC$RegisterPkgSpecs.f75769f;
        try {
            m0Var = (com.tencent.mm.plugin.appbrand.appcache.predownload.export.m0) com.tencent.mm.plugin.appbrand.appcache.predownload.export.m0.f75819d.b();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgDownloaderExportServiceIPC", "registerPkgSpecs(username:" + str + ", appId:" + str2 + ", scene:" + i17 + ") get exception:" + e17);
        }
        if (m0Var == null) {
            if (!gm0.j1.b().f273254q) {
                throw new c01.c();
            }
            throw null;
        }
        m0Var.Eb(str, str2, i17);
        if (rVar != null) {
            uk0.a.a(rVar);
        }
    }
}
