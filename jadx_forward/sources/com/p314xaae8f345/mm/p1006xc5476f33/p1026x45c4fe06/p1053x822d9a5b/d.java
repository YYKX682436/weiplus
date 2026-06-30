package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b;

/* loaded from: classes7.dex */
public class d extends com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 {

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f159610v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f159611w;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0 f159612x;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f159613y;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.u0 f159614z;

    public d(dp1.x xVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        super(xVar);
        java.lang.String str = "MicroMsg.AppBrand.AppBrandAudioOfVideoBackgroundPlayFloatBallHelper#" + hashCode();
        this.f159610v = str;
        this.f159613y = false;
        this.f159614z = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.a(this);
        this.f159611w = o6Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "create, runtime:%s", java.lang.Integer.valueOf(o6Var.hashCode()));
        this.f159612x = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0.class);
    }

    public static void t0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.d dVar, boolean z17) {
        java.lang.String str = dVar.f159610v;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "ignoreRuntimeResumePauseOnce");
        tf1.f fVar = (tf1.f) dVar.f159611w.k(tf1.f.class);
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "ignoreRuntimeResumePauseOnce, audioOfVideoBackgroundPlayManager is null");
        } else {
            fVar.k(!z17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void B(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159610v, "onReceivedBallInfoAddedEvent, runtime:%s, type: %d, key: %s", java.lang.Integer.valueOf(this.f159611w.hashCode()), java.lang.Integer.valueOf(i17), str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        if (c12886x91aa2b6d != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159610v, "onReceivedBallInfoAddedEvent, myType: %d, myKey: %s", java.lang.Integer.valueOf(c12886x91aa2b6d.f174579d), this.f174665d.f174582g);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2 = this.f174665d;
        if (c12886x91aa2b6d2 != null && i17 == c12886x91aa2b6d2.f174579d && java.util.Objects.equals(str, c12886x91aa2b6d2.f174582g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159610v, "onReceivedBallInfoAddedEvent, myself");
            return;
        }
        if (6 == i17 || 18 == i17 || 9 == i17 || 17 == i17) {
            d();
            this.f159613y = false;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void H() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159610v, "onReceivedBallInfoRemovedEvent, runtime:%s", java.lang.Integer.valueOf(this.f159611w.hashCode()));
        n0();
        this.f159613y = false;
        v0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void I() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159610v, "onReceivedFinishWhenSwitchBallEvent, runtime:%s", java.lang.Integer.valueOf(this.f159611w.hashCode()));
        this.f174772n.q(true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d, gp1.r
    public void b(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159610v, "onCreate, type:%s, key:%s", java.lang.Integer.valueOf(i17), str);
        super.b(i17, str);
        Q(2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0 v0Var = this.f159612x;
        if (v0Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.k) v0Var).wi(this.f159614z);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4
    public boolean m0(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159610v, "onClose, runtime:%s", java.lang.Integer.valueOf(this.f159611w.hashCode()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.d(this.f159611w.f156336n);
        java.lang.String str = this.f159610v;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onRuntimeBackground, type: " + d17);
        tf1.f fVar = (tf1.f) this.f159611w.k(tf1.f.class);
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "onRuntimeBackground, audioOfVideoBackgroundPlayManager is null");
        } else {
            fVar.s(d17);
        }
        if (!u() && !this.f159613y) {
            return false;
        }
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(this.f174772n.mo50327x19263085())) {
            w0(i17);
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.t.a(this.f174772n.mo50327x19263085(), 18, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.b(this, i17));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4
    public void o0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159610v, "onDestroy, runtime:%s", java.lang.Integer.valueOf(this.f159611w.hashCode()));
        super.o0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0 v0Var = this.f159612x;
        if (v0Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.k) v0Var).Bi(this.f159614z);
        }
    }

    public final java.lang.String u0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f159611w;
        tf1.f fVar = (tf1.f) o6Var.k(tf1.f.class);
        java.lang.String i17 = fVar != null ? fVar.i() : null;
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i17) ? o6Var.u0().f158812e : i17;
    }

    public final void v0() {
        if (this.f159612x == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11741xcdfabd1f c11741xcdfabd1f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11741xcdfabd1f();
        c11741xcdfabd1f.f158478d = this.f159611w.f156336n;
        c11741xcdfabd1f.f158479e = 8;
        c11741xcdfabd1f.f158480f = 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159610v, "maybeStopBackgroundPlayAudio, appId:%s", this.f159611w.f156336n);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.k) this.f159612x).Ai(c11741xcdfabd1f);
    }

    public final void w0(int i17) {
        t().f174623m = f0(i17);
        g();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.e0.b(this.f174772n, this.f174669h.G(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.c(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void x() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159610v, "onEnterPage, runtime:%s", java.lang.Integer.valueOf(this.f159611w.hashCode()));
        if (s() != null) {
            d0(false);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159610v, "onExitPage, runtime:%s", java.lang.Integer.valueOf(this.f159611w.hashCode()));
        if (s() != null) {
            d0(true);
        }
    }
}
