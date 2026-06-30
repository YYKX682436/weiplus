package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b;

/* loaded from: classes7.dex */
public class a implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.d f159596a;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.d dVar) {
        this.f159596a = dVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.u0
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11738x6e2c0d85 c11738x6e2c0d85) {
        if (c11738x6e2c0d85 != null && this.f159596a.f159611w.f156336n.equals(c11738x6e2c0d85.f158465d) && this.f159596a.f159611w.f156338p.f158814g == c11738x6e2c0d85.f158466e && c11738x6e2c0d85.f158467f == 8) {
            int i17 = c11738x6e2c0d85.f158468g;
            if (i17 != 1) {
                if (i17 == 2 || i17 == 3) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.d dVar = this.f159596a;
                    gp1.v vVar = dVar.f174669h;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d t07 = vVar != null ? vVar.t0(dVar.f174665d) : null;
                    if (t07 != null) {
                        if (!t07.I) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(dVar.f159610v, "removeBackgroundPlayAudioBall, passive is false");
                            return;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar.f159610v, "removeBackgroundPlayAudioBall, remove passive float ball");
                        dVar.d();
                        dVar.f159613y = false;
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar.f159610v, "removeBackgroundPlayAudioBall, no this float ball");
                    pv.j0 j0Var = (pv.j0) i95.n0.c(pv.j0.class);
                    int i18 = dVar.f174665d.H;
                    ((ov.p0) j0Var).getClass();
                    java.lang.Boolean bool = qp1.w.f447288a;
                    dVar.b0(i18 & (-129));
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.d dVar2 = this.f159596a;
            if (dVar2.u()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar2.f159610v, "onSendBackgroundRunningOperation, add audio of video background play state to float ball");
                pv.j0 j0Var2 = (pv.j0) i95.n0.c(pv.j0.class);
                int i19 = dVar2.f174665d.H;
                ((ov.p0) j0Var2).getClass();
                java.lang.Boolean bool2 = qp1.w.f447288a;
                dVar2.b0(i19 | 128);
                dVar2.a0(true);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar2.f159610v, "onSendBackgroundRunningOperation, add passive audio of video background play float ball");
            dVar2.Z(dVar2.u0());
            dVar2.a0(true);
            dVar2.W(false);
            pv.j0 j0Var3 = (pv.j0) i95.n0.c(pv.j0.class);
            int i27 = dVar2.f174665d.H;
            ((ov.p0) j0Var3).getClass();
            java.lang.Boolean bool3 = qp1.w.f447288a;
            dVar2.b0(i27 | 128);
            dVar2.t().f174619f = 13;
            dVar2.g();
            dVar2.j();
            dVar2.f159613y = true;
        }
    }
}
