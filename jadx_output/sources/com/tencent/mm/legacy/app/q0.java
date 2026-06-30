package com.tencent.mm.legacy.app;

/* loaded from: classes12.dex */
public class q0 extends hm0.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.legacy.app.WeChatSplashStartup f68515d;

    public q0(com.tencent.mm.legacy.app.WeChatSplashStartup weChatSplashStartup) {
        this.f68515d = weChatSplashStartup;
    }

    @Override // hm0.t
    public void b() {
        com.tencent.mm.legacy.app.WeChatSplashStartup weChatSplashStartup = this.f68515d;
        weChatSplashStartup.getClass();
        ((km5.q) km5.u.d()).l(500L).q(new com.tencent.mm.legacy.app.k0(weChatSplashStartup));
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.vfs.s7(), "VFSSwitch_Rpt");
        java.lang.String str = com.tencent.mm.sdcard_migrate.g.f192345a;
        if (bm5.f1.a().equals(com.tencent.mm.sdk.platformtools.i.a().getPackageName())) {
            ((km5.q) km5.u.d()).l(500L).q(new com.tencent.mm.sdcard_migrate.b());
        }
        synchronized (com.tencent.mm.plugin.zero.v0.f188683a) {
            java.util.Iterator it = com.tencent.mm.plugin.zero.v0.f188684b.iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
            com.tencent.mm.plugin.zero.v0.f188684b.clear();
        }
        if (this.f68515d.f68489d.a()) {
            try {
                com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("system_config_prefs", 0).edit().putInt("launch_last_status", 2).commit();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WeChatSplashStartup", e17, "%s", e17.getMessage());
            }
        }
    }
}
