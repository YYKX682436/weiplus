package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class u4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k91.v5 f85213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.v4 f85214e;

    public u4(com.tencent.mm.plugin.appbrand.launching.v4 v4Var, k91.v5 v5Var) {
        this.f85214e = v4Var;
        this.f85213d = v5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo;
        com.tencent.mm.plugin.appbrand.launching.v4 v4Var = this.f85214e;
        k91.v5 v5Var = this.f85213d;
        try {
            java.lang.String str = v5Var.field_appId;
            com.tencent.mm.plugin.appbrand.launching.x4 x4Var = v4Var.f85255d;
            java.lang.String str2 = x4Var.f85401e;
            java.lang.String str3 = x4Var.f85402f;
            int i17 = x4Var.f85400d;
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo w07 = v5Var.w0();
            com.tencent.mm.plugin.appbrand.launching.x4 x4Var2 = v4Var.f85255d;
            com.tencent.mm.plugin.appbrand.launching.lb lbVar = new com.tencent.mm.plugin.appbrand.launching.lb(str, 0, str2, str3, i17, w07, x4Var2.f85399c, x4Var2.f85405i, x4Var2.f85406j, true, x4Var2.f85407k);
            lbVar.g(false);
            wxaPkgWrappingInfo = lbVar.call();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", "%s, prepare pkg exp = %s", v5Var.field_appId, e17);
            wxaPkgWrappingInfo = null;
        }
        ((com.tencent.mm.plugin.appbrand.launching.p7) v4Var.f85255d.f85404h).b(wxaPkgWrappingInfo == null ? ne1.j.UPDATE_FAILED : ne1.j.UPDATE_READY, v5Var.w0().f77444d, v5Var.w0().f77445e, null, null, wxaPkgWrappingInfo);
        if (wxaPkgWrappingInfo != null) {
            try {
                k91.v5 n17 = com.tencent.mm.plugin.appbrand.app.r9.ij().n1(v4Var.f85255d.f85397a, new java.lang.String[0]);
                if (n17.w0().f77444d == v5Var.w0().f77444d) {
                    ((k91.a4) com.tencent.mm.plugin.appbrand.app.r9.fj(k91.a4.class)).z1(n17);
                }
            } catch (java.lang.Exception unused) {
                com.tencent.mm.plugin.appbrand.launching.x4 x4Var3 = v4Var.f85255d;
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", "appUsername(%s) appId(%s) update backup attr get exception", x4Var3.f85397a, x4Var3.f85398b);
            }
        }
    }
}
