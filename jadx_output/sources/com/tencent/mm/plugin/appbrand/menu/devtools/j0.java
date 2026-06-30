package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public class j0 implements nh1.b {
    @Override // nh1.b
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        if (n7Var.getRuntime() instanceof com.tencent.mm.plugin.appbrand.o6) {
            com.tencent.mm.plugin.appbrand.o6 runtime = n7Var.getRuntime();
            java.lang.String str2 = lp0.b.D() + "appbrand/trace/";
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str2);
            java.lang.String str3 = a17.f213279f;
            if (str3 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
                if (!str3.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
            com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
            if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
                com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                if (m18.a()) {
                    m18.f213266a.r(m18.f213267b);
                }
            }
            java.util.Locale locale = java.util.Locale.ENGLISH;
            java.lang.String dumpFullPath = str2 + java.lang.String.format(locale, "HEAP_%s_%d.heapsnapshot", str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            kotlin.jvm.internal.o.g(dumpFullPath, "dumpFullPath");
            runtime.C0().getF147808e().evaluateJavascript("(function() {var profiler = NativeGlobal.Profiler;var snapshot = profiler.takeHeapSnapshot();return snapshot.serialize('" + dumpFullPath + "');})()", new com.tencent.mm.plugin.appbrand.menu.devtools.i0(this, context, dumpFullPath));
            if (runtime.q2() || n7Var.p2()) {
                return;
            }
            if (!z65.c.a()) {
                java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                return;
            }
            java.lang.String str5 = str2 + java.lang.String.format(locale, "WebView_HEAP_%s_%d.heapsnapshot", str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            com.tencent.mars.xlog.Log.i("MiroMsg.GameHeapProfile", "WebViewDumpSnapshot to :%s suc:%b", str5, java.lang.Boolean.valueOf(n7Var.S3().savePage(new com.tencent.mm.vfs.r6(str5).o(), null, 100000)));
        }
    }

    @Override // nh1.b
    public /* bridge */ /* synthetic */ java.lang.String b(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        return "Take Heap Snapshot";
    }

    @Override // nh1.b
    public boolean c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC) ((com.tencent.mm.plugin.appbrand.page.n7) v5Var).b(com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC.class);
        if (appBrandSysConfigWC.f305852r.f75399d == 1 || appBrandSysConfigWC.f305852r.f75399d == 2 || z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192974b) {
            return true;
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        return com.tencent.mm.plugin.appbrand.m6.a(str).f85722o || z65.c.a();
    }
}
