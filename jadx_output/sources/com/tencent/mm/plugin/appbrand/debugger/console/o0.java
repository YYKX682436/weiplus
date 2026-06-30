package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes8.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.debugger.console.o0 f77703d = new com.tencent.mm.plugin.appbrand.debugger.console.o0();

    public o0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.FloatConsolePrinter", "onClick#controlFloatWindow");
        if (com.tencent.mm.plugin.appbrand.debugger.console.r0.f77708a) {
            com.tencent.mm.plugin.appbrand.debugger.console.d0 d0Var = com.tencent.mm.plugin.appbrand.debugger.console.r0.f77710c;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsolePrintPanelFloatWindow", "show, isShown: " + d0Var.f77660g);
            if (!d0Var.f77660g) {
                try {
                    android.view.WindowManager windowManager = (android.view.WindowManager) ((jz5.n) d0Var.f77656c).getValue();
                    if (windowManager != null) {
                        windowManager.addView((android.view.View) ((jz5.n) d0Var.f77658e).getValue(), (android.view.WindowManager.LayoutParams) ((jz5.n) d0Var.f77659f).getValue());
                        ((com.tencent.mm.plugin.appbrand.debugger.console.v) ((jz5.n) d0Var.f77657d).getValue()).b();
                        d0Var.f77660g = true;
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.ConsolePrintPanelFloatWindow", "show, addView fail since " + e17);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
