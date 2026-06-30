package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.ui.l2 f89842d = new com.tencent.mm.plugin.appbrand.ui.l2();

    public l2() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.weui.base.preference.CheckBoxPreference it = (com.tencent.weui.base.preference.CheckBoxPreference) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.appbrand.debugger.console.n0 n0Var = com.tencent.mm.plugin.appbrand.debugger.console.n0.f77690a;
        int i17 = it.h() ? 4 : Integer.MAX_VALUE;
        int i18 = com.tencent.mm.plugin.appbrand.debugger.console.n0.f77691b;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsolePrinterAccessible", "set#printLevel, oldValue: " + i18 + ", newValue: " + i17);
        if (i18 != i17) {
            com.tencent.mm.plugin.appbrand.debugger.console.n0.f77691b = i17;
            com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
            if (a17 != null) {
                a17.putInt("ConsolePrinterPrintLevel", i17);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsolePrinterAccessible", "onPrintLevelChange, oldLevel: " + i18 + ", newLevel: " + i17);
            if (!(2 <= i18 && i18 < 6)) {
                if (2 <= i17 && i17 < 6) {
                    n0Var.a();
                }
            }
            if (!(2 <= i17 && i17 < 6)) {
                if (2 <= i18 && i18 < 6) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsolePrinterAccessible", "disable");
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                    if (z65.c.a()) {
                        int i19 = com.tencent.mm.plugin.appbrand.debugger.console.n0.f77691b;
                        if (!(2 <= i19 && i19 < 6)) {
                            if (n0Var.c()) {
                                ((ku5.t0) ku5.t0.f312615d).B(com.tencent.mm.plugin.appbrand.debugger.console.h0.f77675d);
                            }
                            if (n0Var.c() || ((java.lang.Boolean) ((jz5.n) com.tencent.mm.plugin.appbrand.debugger.console.n0.f77693d).getValue()).booleanValue()) {
                                cl.q0.f42722l = null;
                            }
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsolePrinterAccessible", "disable, not need");
                }
            }
            if (n0Var.c() || ((java.lang.Boolean) ((jz5.n) com.tencent.mm.plugin.appbrand.debugger.console.n0.f77693d).getValue()).booleanValue()) {
                n0Var.b().f77668b = i17;
            }
        }
        return jz5.f0.f302826a;
    }
}
