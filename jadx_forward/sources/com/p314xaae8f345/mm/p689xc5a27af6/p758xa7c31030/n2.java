package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes12.dex */
public class n2 implements l30.g {
    @Override // l30.g
    public void a(z95.c cVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.a.b(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d.f234447f = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.a.f234441a;
        tp3.a aVar = tp3.a.INSTANCE;
        vp3.c cVar2 = (vp3.c) aVar.a(vp3.c.class);
        wp3.b bVar = (wp3.b) aVar.a(wp3.b.class);
        com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p564xbfc2bd01.C4655xed1e99e4 c4655xed1e99e4 = (com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p564xbfc2bd01.C4655xed1e99e4) cVar2.f();
        com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p565xf09afa7a.C4657x40d13e9d c4657x40d13e9d = (com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p565xf09afa7a.C4657x40d13e9d) bVar.f();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginPerformance", "memoryHook = %s, pthreadHook = %s, eglHook = %s", c4655xed1e99e4, c4657x40d13e9d, "eglHookStub");
            com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d.t(c4655xed1e99e4, c4657x40d13e9d);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PluginPerformance", th6, "Hook error", new java.lang.Object[0]);
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.mm.p642xad8b531f.s sVar = ((km0.c) gm0.j1.p().a()).f390525f;
        if (sVar != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(sVar.a(".com.tencent.mm.debug.disable_memory_hook"), false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PluginPerformance", "disabled by assist on boot");
            tp3.a.INSTANCE.d("<cmd><diagnostic><MemoryHook enable='0' source='push'/></diagnostic></cmd>");
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1946x6052700.a.f234529a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JeVersion", "it's none of arm64's business");
            } else {
                if (z65.c.a() || ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_jeversion_enable_v2, true)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1946x6052700.a.f234531c.mo48813x58998cd();
                    com.p314xaae8f345.mm.app.C5000x71a2fa35.W.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1946x6052700.CallableC16799x2ca3e0());
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JeVersion", "not enabled");
                }
            }
        }
        lr0.f.f402164b = vp3.e.f520516d;
    }
}
