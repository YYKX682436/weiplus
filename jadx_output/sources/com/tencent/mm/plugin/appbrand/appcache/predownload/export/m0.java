package com.tencent.mm.plugin.appbrand.appcache.predownload.export;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.r9.class})
/* loaded from: classes7.dex */
public final class m0 extends i95.w implements com.tencent.mm.plugin.appbrand.service.n6 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appcache.predownload.export.e0 f75819d;

    static {
        new com.tencent.mm.plugin.appbrand.appcache.predownload.export.f0(null);
        f75819d = new com.tencent.mm.plugin.appbrand.appcache.predownload.export.e0();
    }

    @Override // com.tencent.mm.plugin.appbrand.service.n6
    public void A7(java.lang.String str, int i17, com.tencent.mm.plugin.appbrand.service.m6 m6Var, com.tencent.mm.plugin.appbrand.service.l6 l6Var) {
        if (!(str == null || str.length() == 0)) {
            pq5.h.a().q(new com.tencent.mm.plugin.appbrand.appcache.predownload.export.h0(i17, str, l6Var)).q(new com.tencent.mm.plugin.appbrand.appcache.predownload.export.k0(str, i17, m6Var, l6Var)).a(com.tencent.mm.plugin.appbrand.appcache.predownload.export.l0.f75818a);
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
        k91.e3.f305570a.a(str, str2, i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.service.n6
    public boolean e6(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaPkgDownloaderExportServiceImpl", "deletePkgsForAppId(appId:" + str + ", versionType:" + i17 + "), stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        com.tencent.mm.plugin.appbrand.appcache.qa Di = com.tencent.mm.plugin.appbrand.app.r9.Di();
        if (Di == null) {
            return false;
        }
        int e17 = Di.e(str, i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaPkgDownloaderExportServiceImpl", "deletePkgsForAppId(appId:" + str + ", versionType:" + i17 + "), count:" + e17);
        if (e17 <= 0) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.task.u0.f89199h.a().t(str, i17, true);
        com.tencent.mm.plugin.appbrand.appcache.l3.f75641a.m();
        return true;
    }
}
