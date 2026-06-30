package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class t9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f75980d;

    public t9(com.tencent.mm.plugin.appbrand.appcache.aa aaVar, java.lang.String str) {
        this.f75980d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.appcache.y9 y9Var;
        if (com.tencent.mm.plugin.appbrand.app.r9.Di() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "parseAndDownload, but storage not ready");
            return;
        }
        java.lang.String str = this.f75980d;
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "sysmsg", null);
        if (d17 == null || d17.size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "parseImpl, parse failed");
            return;
        }
        java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.$type");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "parseImpl, type = %s", str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || (y9Var = (com.tencent.mm.plugin.appbrand.appcache.y9) com.tencent.mm.plugin.appbrand.appcache.aa.f75437d.get(str2)) == null) {
            return;
        }
        y9Var.b(str, d17);
    }
}
