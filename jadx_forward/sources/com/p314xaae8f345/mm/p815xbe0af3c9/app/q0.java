package com.p314xaae8f345.mm.p815xbe0af3c9.app;

/* loaded from: classes12.dex */
public class q0 extends hm0.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p815xbe0af3c9.app.C10820x69adf850 f150048d;

    public q0(com.p314xaae8f345.mm.p815xbe0af3c9.app.C10820x69adf850 c10820x69adf850) {
        this.f150048d = c10820x69adf850;
    }

    @Override // hm0.t
    public void b() {
        com.p314xaae8f345.mm.p815xbe0af3c9.app.C10820x69adf850 c10820x69adf850 = this.f150048d;
        c10820x69adf850.getClass();
        ((km5.q) km5.u.d()).l(500L).q(new com.p314xaae8f345.mm.p815xbe0af3c9.app.k0(c10820x69adf850));
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.vfs.s7(), "VFSSwitch_Rpt");
        java.lang.String str = com.p314xaae8f345.mm.p2596x853f044d.g.f273878a;
        if (bm5.f1.a().equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a().getPackageName())) {
            ((km5.q) km5.u.d()).l(500L).q(new com.p314xaae8f345.mm.p2596x853f044d.b());
        }
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.v0.f270216a) {
            java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.v0.f270217b.iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.v0.f270217b.clear();
        }
        if (this.f150048d.f150022d.a()) {
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("system_config_prefs", 0).edit().putInt("launch_last_status", 2).commit();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WeChatSplashStartup", e17, "%s", e17.getMessage());
            }
        }
    }
}
