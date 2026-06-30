package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public class h8 implements q25.a {
    public h8(com.tencent.mm.plugin.appbrand.app.PluginAppBrand pluginAppBrand) {
    }

    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!z65.c.a()) {
            return true;
        }
        if (!"//enable_appbrand_monkey_test".equals(strArr[0])) {
            if ("//disable_appbrand_monkey_test".equals(strArr[0])) {
                bm5.p1 p1Var = com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.f77582b;
                com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("ENABLE_APPBRAND_DEBUGGER");
                M.getClass();
                M.putBoolean("ENABLE_APPBRAND_DEBUGGER", false);
                com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.f77584d = false;
            }
            return true;
        }
        bm5.p1 p1Var2 = com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.f77582b;
        com.tencent.mm.sdk.platformtools.o4 M2 = com.tencent.mm.sdk.platformtools.o4.M("ENABLE_APPBRAND_DEBUGGER");
        M2.getClass();
        M2.putBoolean("ENABLE_APPBRAND_DEBUGGER", true);
        com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.f77584d = true;
        com.tencent.mm.plugin.appbrand.report.quality.w1.b();
        com.tencent.mm.plugin.appbrand.debugger.DebuggerShellClientProcessHelper$receiver$1 debuggerShellClientProcessHelper$receiver$1 = com.tencent.mm.plugin.appbrand.debugger.f.f77740a;
        com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(new android.content.Intent().setAction("com.tencent.mm.appbrand.debugger.appbrand_process_reload_configs"));
        return true;
    }
}
