package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public class n implements nh1.b {
    public static void d(com.tencent.mm.plugin.appbrand.y yVar, java.lang.String str, boolean z17) {
        k91.d1.b(str, z17);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.menu.devtools.m(yVar, z17 ? yVar.getF147807d().getResources().getString(com.tencent.mm.R.string.f490091kn) : yVar.getF147807d().getResources().getString(com.tencent.mm.R.string.f490090km)));
    }

    @Override // nh1.b
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        d((com.tencent.luggage.sdk.jsapi.component.b) v5Var, str, !r2.t3().E0().f47296w);
    }

    @Override // nh1.b
    public java.lang.String b(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        return (((com.tencent.luggage.sdk.config.AppBrandSysConfigLU) ((com.tencent.luggage.sdk.jsapi.component.b) v5Var).b(com.tencent.luggage.sdk.config.AppBrandSysConfigLU.class)).f47296w ? context.getString(com.tencent.mm.R.string.f490111l8) : context.getString(com.tencent.mm.R.string.f490113la)).toString();
    }

    @Override // nh1.b
    public boolean c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        ze.n t37 = ((com.tencent.luggage.sdk.jsapi.component.b) v5Var).t3();
        com.tencent.mm.sdk.platformtools.o4 o4Var = k91.d1.f305561a;
        com.tencent.mm.plugin.appbrand.performance.a aVar = (com.tencent.mm.plugin.appbrand.performance.a) t37.p0(com.tencent.mm.plugin.appbrand.performance.a.class, false);
        if (!((aVar == null || t37.s2()) ? false : aVar.f87325e)) {
            if (!(((si1.l0) i95.n0.c(si1.l0.class)) != null && com.tencent.mm.plugin.appbrand.m6.a(str).f85722o)) {
                return false;
            }
        }
        return true;
    }
}
