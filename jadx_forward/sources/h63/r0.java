package h63;

/* loaded from: classes7.dex */
public final class r0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h63.v0 f360809d;

    public r0(h63.v0 v0Var) {
        this.f360809d = v0Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        ta1.q0 q0Var;
        ta1.o0 o0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandProcessService", "invoke startPush callback");
        h63.q1 q1Var = this.f360809d.f360818d;
        if (q1Var != null) {
            pa1.t tVar = (pa1.t) q1Var;
            java.lang.String H = tVar.H();
            if (!((java.util.HashMap) ta1.q0.f498196g).containsKey(H) || (q0Var = (ta1.q0) ((java.util.HashMap) ta1.q0.f498196g).get(H)) == null || ((o0Var = q0Var.f498201d) != ta1.o0.Running && o0Var != ta1.o0.Paused)) {
                q0Var = null;
            }
            if (q0Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGamePageViewRendererWC", "stop running recorder");
                pa1.p pVar = new pa1.p(tVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger stop");
                q0Var.f498198a.m77784x795fa299(new ta1.g0(q0Var, pVar));
                new ma1.a().x(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) tVar.F()).U1(), 112, "game is living, not support record now");
            }
            tVar.f122219g.e(false, 2, new pa1.q(tVar));
        }
    }
}
