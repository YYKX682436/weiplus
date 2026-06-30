package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes.dex */
public final class m2 implements com.tencent.mm.plugin.appbrand.debugger.e {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    @Override // com.tencent.mm.plugin.appbrand.debugger.e
    public void a(android.content.Intent intent) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!z65.c.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.DebuggerShell", "[AfterLaunchTiming] SetAfterLaunchAdvance ignored, not debug env");
            return;
        }
        ?? r07 = com.tencent.mm.sdk.platformtools.t8.P(intent.getStringExtra("enabled"), 0) == 1 ? 1 : 0;
        jz5.g gVar = com.tencent.mm.plugin.appbrand.utils.s.f90548a;
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a()) {
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("appbrand_debug_expt");
            M.getClass();
            M.putInt("afterlaunch_advance_override", r07);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DebuggerShell", "[AfterLaunchTiming] SetAfterLaunchAdvance enabled=%b", java.lang.Boolean.valueOf((boolean) r07));
    }

    @Override // com.tencent.mm.plugin.appbrand.debugger.e
    public java.lang.String name() {
        return "SetAfterLaunchAdvance";
    }
}
