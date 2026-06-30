package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public final class r0 implements nh1.b {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.menu.devtools.r0 f85921a = new com.tencent.mm.plugin.appbrand.menu.devtools.r0();

    @Override // nh1.b
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.n7 pageView = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        pageView.getRuntime().C0().y1().O().f47398a.requestV8StackTrace();
    }

    @Override // nh1.b
    public java.lang.String b(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String appId) {
        com.tencent.mm.plugin.appbrand.page.n7 pageView = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        kotlin.jvm.internal.o.g(appId, "appId");
        return "StackTrace";
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
