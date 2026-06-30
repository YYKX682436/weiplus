package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public final class g0 implements nh1.b {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.menu.devtools.g0 f85900a = new com.tencent.mm.plugin.appbrand.menu.devtools.g0();

    @Override // nh1.b
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.n7 pageView = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        com.tencent.mm.plugin.appbrand.service.c0 C0 = pageView.getRuntime().C0();
        ((com.tencent.mm.plugin.appbrand.jsruntime.f0) C0.getF147808e().h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class)).post(new com.tencent.mm.plugin.appbrand.menu.devtools.f0(C0));
    }

    @Override // nh1.b
    public java.lang.String b(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String appId) {
        com.tencent.mm.plugin.appbrand.page.n7 pageView = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        kotlin.jvm.internal.o.g(appId, "appId");
        return "Request Force GC";
    }

    @Override // nh1.b
    public boolean c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String appId) {
        com.tencent.mm.plugin.appbrand.page.n7 pageView = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        kotlin.jvm.internal.o.g(appId, "appId");
        if (pageView.U1().y1().O() == null) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.g0 b17 = pageView.b(com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC.class);
        kotlin.jvm.internal.o.f(b17, "getConfig(...)");
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC) b17;
        if (appBrandSysConfigWC.f305852r.f75399d != 1 && appBrandSysConfigWC.f305852r.f75399d != 2 && !z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (!com.tencent.mm.plugin.appbrand.m6.a(appId).f85722o) {
                return false;
            }
        }
        return true;
    }
}
