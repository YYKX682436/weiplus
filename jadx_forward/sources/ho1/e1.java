package ho1;

/* loaded from: classes9.dex */
public final class e1 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.q1 f364194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f364195e;

    public e1(ho1.q1 q1Var, long j17) {
        this.f364194d = q1Var;
        this.f364195e = j17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public final void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "errType:" + i17 + ", errCode:" + i18 + ", errMsg:" + str);
        m1Var.m48017xd0f4c159(true);
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "build channel Fail, errType:" + i17 + ", errCode:" + i18 + ", errMsg:" + str);
            return;
        }
        jy3.c cVar = (jy3.c) m1Var;
        if (cVar.I() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RoamBackup.RoamProviderImpl", "ticketScene.getResp() == null");
        }
        java.lang.String a17 = jy3.c.f384036f.a(cVar.I());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "notifyTunnelCryptoInfoResultAsync, ".concat(a17));
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g0 g0Var = this.f364194d.f364320a;
        if (g0Var != null) {
            g0Var.s0(this.f364195e, a17);
        }
    }
}
