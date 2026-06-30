package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public class o implements nh1.b {
    @Override // nh1.b
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        if (!((com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC) n7Var.b(com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC.class)).f47297x) {
            com.tencent.mm.plugin.appbrand.performance.h.c(str);
            dp.a.makeText(context, com.tencent.mm.R.string.f490224of, 0).show();
        } else {
            com.tencent.mm.plugin.appbrand.performance.h.a(str);
            dp.a.makeText(context, com.tencent.mm.R.string.f490218o9, 0).show();
        }
        n7Var.getRuntime().l0();
    }

    @Override // nh1.b
    public java.lang.String b(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        return ((com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC) ((com.tencent.mm.plugin.appbrand.page.n7) v5Var).b(com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC.class)).f47297x ? context.getString(com.tencent.mm.R.string.f490217o8) : context.getString(com.tencent.mm.R.string.f490223oe);
    }

    @Override // nh1.b
    public boolean c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC) ((com.tencent.mm.plugin.appbrand.page.n7) v5Var).b(com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC.class);
        if (appBrandSysConfigWC.f305852r.f75399d == 1 || appBrandSysConfigWC.f305852r.f75399d == 2 || z65.c.a()) {
            return true;
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        return com.tencent.mm.plugin.appbrand.m6.a(str).f85722o;
    }
}
