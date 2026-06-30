package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes8.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.debugger.console.h0 f77675d = new com.tencent.mm.plugin.appbrand.debugger.console.h0();

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = com.tencent.mm.plugin.appbrand.debugger.console.r0.f77708a;
        boolean z18 = com.tencent.mm.plugin.appbrand.debugger.console.r0.f77708a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.FloatConsolePrinter", "disable, curIsEnable: " + z18);
        if (z18) {
            com.tencent.mm.plugin.appbrand.debugger.console.r0.f77708a = false;
            com.tencent.mm.plugin.appbrand.debugger.console.r0.f77709b.c();
            com.tencent.mm.plugin.appbrand.debugger.console.r0.f77710c.b();
        }
    }
}
