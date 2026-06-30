package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public class b0 implements com.tencent.mm.plugin.appbrand.page.s4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.pip.o0 f87428a;

    public b0(com.tencent.mm.plugin.appbrand.pip.o0 o0Var) {
        this.f87428a = o0Var;
    }

    public static boolean a(com.tencent.mm.plugin.appbrand.pip.b0 b0Var, java.lang.String str, com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        com.tencent.mm.plugin.appbrand.page.w2 w2Var;
        if (com.tencent.mm.plugin.appbrand.page.wd.NAVIGATE_TO == wdVar) {
            com.tencent.mm.plugin.appbrand.pip.o0 o0Var = b0Var.f87428a;
            if (!o0Var.f87532o && (w2Var = o0Var.f87531n) != null && w2Var.getCurrentUrl().equals(str)) {
                com.tencent.mars.xlog.Log.i(o0Var.f87518a, "onCreatePage, reuse " + com.tencent.mm.plugin.appbrand.pip.o0.k(o0Var.f87531n));
                return true;
            }
        } else {
            b0Var.getClass();
        }
        return false;
    }
}
