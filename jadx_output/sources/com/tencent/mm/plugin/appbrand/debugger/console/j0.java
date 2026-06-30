package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes8.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.debugger.console.j0 f77678d = new com.tencent.mm.plugin.appbrand.debugger.console.j0();

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = com.tencent.mm.plugin.appbrand.debugger.console.r0.f77708a;
        boolean z18 = com.tencent.mm.plugin.appbrand.debugger.console.r0.f77708a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.FloatConsolePrinter", "enable, curIsEnable: " + z18);
        if (z18) {
            return;
        }
        com.tencent.mm.plugin.appbrand.debugger.console.r0.f77708a = true;
        com.tencent.mm.plugin.appbrand.debugger.console.r0.f77709b.d();
    }
}
