package com.tencent.mm.plugin.appbrand.appcache.predownload.export;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.PluginAppBrand.class})
/* loaded from: classes7.dex */
public final class z extends i95.w implements com.tencent.mm.plugin.appbrand.service.n6 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appcache.predownload.export.z f75840d = new com.tencent.mm.plugin.appbrand.appcache.predownload.export.z();

    @Override // com.tencent.mm.plugin.appbrand.service.n6
    public void A7(java.lang.String str, int i17, com.tencent.mm.plugin.appbrand.service.m6 m6Var, com.tencent.mm.plugin.appbrand.service.l6 l6Var) {
        if (!(str == null || str.length() == 0)) {
            uk0.a.b(new com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$DownloadPkgParam(str, i17), com.tencent.mm.plugin.appbrand.appcache.predownload.export.x.f75836d, new com.tencent.mm.plugin.appbrand.appcache.predownload.export.y(m6Var, l6Var));
        } else if (l6Var != null) {
            l6Var.a(-1, "invalid appId");
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.service.n6
    public void Eb(java.lang.String str, java.lang.String str2, int i17) {
        if (str == null || str.length() == 0) {
            return;
        }
        if (str2 == null || str2.length() == 0) {
            return;
        }
        uk0.a.c(new com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$RegisterPkgSpecs(str, str2, i17), com.tencent.mm.plugin.appbrand.appcache.predownload.export.u.f75831d, null, 4, null);
    }

    @Override // com.tencent.mm.plugin.appbrand.service.n6
    public boolean e6(java.lang.String str, int i17) {
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean;
        if ((str == null || str.length() == 0) || (iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) uk0.a.d(new com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$DownloadPkgParam(str, i17), com.tencent.mm.plugin.appbrand.appcache.predownload.export.t.f75830a)) == null) {
            return false;
        }
        return iPCBoolean.f68400d;
    }
}
