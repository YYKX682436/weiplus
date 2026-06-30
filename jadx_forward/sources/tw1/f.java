package tw1;

@j95.b
/* loaded from: classes15.dex */
public class f extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public boolean f503984d = false;

    public static tw1.f Di() {
        return (tw1.f) i95.n0.c(tw1.f.class);
    }

    public void Ai() {
        Bi("cash.caf");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_F2F_RING_TONE_STRING, "cash.caf");
    }

    public final void Bi(java.lang.String str) {
        gm0.j1.i();
        gm0.j1.n().f354821b.a(304, new tw1.e(this));
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        ww1.v1 v1Var = new ww1.v1(3, str);
        gm0.j1.i();
        gm0.j1.n().f354821b.g(v1Var);
    }

    public ww1.v Ni() {
        gm0.j1.b().c();
        return ww1.v.INSTANCE;
    }

    public boolean Ri() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_F2F_RING_TONE_STRING, "");
        long j17 = c01.z1.j();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str.equals("in.caf")) {
            return (j17 & 32768) != 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreCollect", "old version switch is open, sync to new version");
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(j17 | 32768));
        r45.no4 no4Var = new r45.no4();
        no4Var.f463092d = 1;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(209, no4Var));
        return true;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = ww1.l1.f531764q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.d();
        if (d17.f177722h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "onNotifyChange()：is already init()");
            return;
        }
        Di().Ri();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "onNotifyChange()");
        d17.k(true);
        d17.f177722h = true;
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        ww1.l1.i();
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.d();
        d17.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "destroy()");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.t tVar = d17.f177716b;
            if (tVar != null) {
                tVar.a();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "destroy() synthesizer.destroy() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = d17.f177720f;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d2 = d17.f177721g;
        if (abstractC20980x9b9ad01d2 != null) {
            abstractC20980x9b9ad01d2.mo48814x2efc64();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.f177710i = false;
    }

    public void wi() {
        Bi("in.caf");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_F2F_RING_TONE_STRING, "in.caf");
    }
}
