package we;

/* loaded from: classes7.dex */
public abstract class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 {
    public long K;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.s L;

    public a(android.content.Context context, ze.n nVar) {
        super(context, nVar);
        this.K = 0L;
        if (!nVar.q2()) {
            Y(oi1.n.f427141e, new oi1.a());
        }
        Y(oi1.n.f427140d, new oi1.b());
        mo51924x62662257();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public void B() {
        super.B();
        if (m52173x328fb10a() > 0) {
            mo51924x62662257().j((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) m52169xfdaa7672().mo14682x9dee9c37());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public void D() {
        super.D();
        if (m52166xdf2f9ab6() > 0) {
            mo51924x62662257().b((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) m52169xfdaa7672().mo14682x9dee9c37());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a5 E(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a5 E = super.E(w2Var, w2Var2);
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar = w2Var != null ? (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) w2Var.mo14682x9dee9c37() : null;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar2 = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) w2Var2.mo14682x9dee9c37();
        mo51924x62662257().f(0L);
        mo51924x62662257().e(bVar2, bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.NAVIGATE_BACK);
        return E;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public void F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar) {
        super.F(w2Var, w2Var2, wdVar);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.K;
        mo51924x62662257().m(currentTimeMillis, wdVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandPageContainerLU", "onNavigateEnd received, appId:%s, time: %d", m52168x74292566(), java.lang.Long.valueOf(currentTimeMillis));
        mo51924x62662257().e((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) w2Var2.mo14682x9dee9c37(), w2Var == null ? null : (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) w2Var.mo14682x9dee9c37(), wdVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a5 G(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar, java.lang.String str, boolean z17) {
        this.K = java.lang.System.currentTimeMillis();
        return super.G(w2Var, w2Var2, wdVar, str, z17);
    }

    /* renamed from: getReporter */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.s mo51924x62662257() {
        if (this.L == null) {
            this.L = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.g(mo52154x9a3f0ba2(), this);
        }
        return this.L;
    }

    @Override // android.view.View
    public final boolean post(java.lang.Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (n3.x0.b(this) || mo52154x9a3f0ba2() == null || !mo52154x9a3f0ba2().a2()) {
            return super.post(runnable);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
        return true;
    }

    @Override // android.view.View
    public final boolean postDelayed(java.lang.Runnable runnable, long j17) {
        if (runnable == null) {
            return false;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (n3.x0.b(this) || mo52154x9a3f0ba2() == null || !mo52154x9a3f0ba2().a2()) {
            return super.postDelayed(runnable, j17);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable, j17);
        return true;
    }

    @Override // android.view.View
    public final void postOnAnimation(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (n3.x0.b(this) || mo52154x9a3f0ba2() == null || !mo52154x9a3f0ba2().a2()) {
            super.postOnAnimation(runnable);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable, android.animation.ValueAnimator.getFrameDelay());
        }
    }

    @Override // android.view.View
    public final void postOnAnimationDelayed(java.lang.Runnable runnable, long j17) {
        if (runnable == null) {
            return;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (n3.x0.b(this) || mo52154x9a3f0ba2() == null || !mo52154x9a3f0ba2().a2()) {
            super.postOnAnimationDelayed(runnable, j17);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable, android.animation.ValueAnimator.getFrameDelay() + j17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    /* renamed from: getRuntime */
    public ze.n mo52154x9a3f0ba2() {
        return (ze.n) super.mo52154x9a3f0ba2();
    }
}
