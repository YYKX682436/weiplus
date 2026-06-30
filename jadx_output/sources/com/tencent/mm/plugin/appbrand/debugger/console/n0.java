package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes7.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.debugger.console.n0 f77690a = new com.tencent.mm.plugin.appbrand.debugger.console.n0();

    /* renamed from: b, reason: collision with root package name */
    public static int f77691b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f77692c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f77693d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f77694e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f77695f;

    static {
        com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
        f77691b = a17 != null ? a17.getInt("ConsolePrinterPrintLevel", Integer.MAX_VALUE) : Integer.MAX_VALUE;
        f77692c = jz5.h.b(com.tencent.mm.plugin.appbrand.debugger.console.l0.f77686d);
        f77693d = jz5.h.b(com.tencent.mm.plugin.appbrand.debugger.console.k0.f77680d);
        f77694e = jz5.h.b(com.tencent.mm.plugin.appbrand.debugger.console.m0.f77688d);
        f77695f = jz5.h.b(com.tencent.mm.plugin.appbrand.debugger.console.g0.f77673d);
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsolePrinterAccessible", "enable");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a()) {
            int i17 = f77691b;
            if (2 <= i17 && i17 < 6) {
                if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                    if (c()) {
                        ((ku5.t0) ku5.t0.f312615d).B(com.tencent.mm.plugin.appbrand.debugger.console.j0.f77678d);
                    }
                    if (c() || ((java.lang.Boolean) ((jz5.n) f77693d).getValue()).booleanValue()) {
                        com.tencent.mm.plugin.appbrand.debugger.console.g b17 = b();
                        b17.f77668b = f77691b;
                        cl.q0.f42722l = b17;
                        return;
                    }
                    return;
                }
                if (c()) {
                    tb0.i iVar = (tb0.i) i95.n0.c(tb0.i.class);
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    com.tencent.mm.plugin.appbrand.debugger.console.i0 i0Var = new com.tencent.mm.plugin.appbrand.debugger.console.i0();
                    java.lang.String a17 = n25.a.a();
                    ((sb0.f) iVar).getClass();
                    com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.S6(context, "你的手机没有授权微信获得浮窗权限，无法打开console输出面板", new j35.f0(i0Var), true, a17);
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsolePrinterAccessible", "enable, not need");
    }

    public final com.tencent.mm.plugin.appbrand.debugger.console.g b() {
        return (com.tencent.mm.plugin.appbrand.debugger.console.g) ((jz5.n) f77695f).getValue();
    }

    public final boolean c() {
        return ((java.lang.Boolean) ((jz5.n) f77692c).getValue()).booleanValue();
    }
}
