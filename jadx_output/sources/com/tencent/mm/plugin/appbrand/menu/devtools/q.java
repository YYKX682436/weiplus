package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public class q implements nh1.b {
    @Override // nh1.b
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.i iVar = new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.i();
        com.tencent.mm.plugin.appbrand.service.c0 U1 = n7Var.U1();
        new org.json.JSONObject();
        U1.getRuntime().l0();
        iVar.o("ok");
        com.tencent.mm.plugin.appbrand.report.v0.e(str, n7Var.X1(), 10, "", com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
    }

    @Override // nh1.b
    public java.lang.String b(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        return context.getString(com.tencent.mm.R.string.f490068k0);
    }

    @Override // nh1.b
    public boolean c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        if (!z65.c.a()) {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (!com.tencent.mm.plugin.appbrand.m6.a(str).f85722o) {
                return false;
            }
        }
        return true;
    }
}
