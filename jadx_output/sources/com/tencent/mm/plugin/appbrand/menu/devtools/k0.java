package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public class k0 implements nh1.b {
    @Override // nh1.b
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        if (com.tencent.mm.plugin.appbrand.debugger.y1.d()) {
            com.tencent.mm.plugin.appbrand.debugger.y1.g(false);
            dp.a.makeText(context, "Disable success, please restart WeChat to take effect.", 1).show();
        } else {
            com.tencent.mm.plugin.appbrand.debugger.y1.g(true);
            dp.a.makeText(context, "Enable success, please restart WeChat to take effect.", 1).show();
        }
    }

    @Override // nh1.b
    public java.lang.String b(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        return com.tencent.mm.plugin.appbrand.debugger.y1.d() ? "Disable Preload" : "Enable Preload";
    }

    @Override // nh1.b
    public boolean c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        if (n7Var.getRuntime() instanceof com.tencent.mm.plugin.appbrand.o6) {
            com.tencent.mm.plugin.appbrand.o6 runtime = n7Var.getRuntime();
            if (runtime.q2() && runtime.s2()) {
                return true;
            }
        }
        return false;
    }
}
