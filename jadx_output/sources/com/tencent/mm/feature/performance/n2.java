package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public class n2 implements l30.g {
    @Override // l30.g
    public void a(z95.c cVar) {
        com.tencent.mm.plugin.performance.diagnostic.a.b(false);
        com.tencent.mm.plugin.performance.diagnostic.d.f152914f = com.tencent.mm.plugin.performance.diagnostic.a.f152908a;
        tp3.a aVar = tp3.a.INSTANCE;
        vp3.c cVar2 = (vp3.c) aVar.a(vp3.c.class);
        wp3.b bVar = (wp3.b) aVar.a(wp3.b.class);
        com.tencent.matrix.hook.memory.MemoryHook memoryHook = (com.tencent.matrix.hook.memory.MemoryHook) cVar2.f();
        com.tencent.matrix.hook.pthread.PthreadHook pthreadHook = (com.tencent.matrix.hook.pthread.PthreadHook) bVar.f();
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginPerformance", "memoryHook = %s, pthreadHook = %s, eglHook = %s", memoryHook, pthreadHook, "eglHookStub");
            com.tencent.mm.plugin.performance.diagnostic.d.t(memoryHook, pthreadHook);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PluginPerformance", th6, "Hook error", new java.lang.Object[0]);
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.booter.s sVar = ((km0.c) gm0.j1.p().a()).f308992f;
        if (sVar != null && com.tencent.mm.sdk.platformtools.t8.m1(sVar.a(".com.tencent.mm.debug.disable_memory_hook"), false)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PluginPerformance", "disabled by assist on boot");
            tp3.a.INSTANCE.d("<cmd><diagnostic><MemoryHook enable='0' source='push'/></diagnostic></cmd>");
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.sdk.platformtools.o4 o4Var = com.tencent.mm.plugin.performance.jectl.a.f152996a;
            if (com.tencent.mm.sdk.platformtools.z.f193115k) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JeVersion", "it's none of arm64's business");
            } else {
                if (z65.c.a() || ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_jeversion_enable_v2, true)) {
                    com.tencent.mm.plugin.performance.jectl.a.f152998c.alive();
                    com.tencent.mm.app.MMCrashReportContents.W.f(new com.tencent.mm.plugin.performance.jectl.a$$a());
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JeVersion", "not enabled");
                }
            }
        }
        lr0.f.f320631b = vp3.e.f438983d;
    }
}
