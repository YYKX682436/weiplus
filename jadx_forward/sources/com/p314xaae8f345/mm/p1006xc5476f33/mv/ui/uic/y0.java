package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class y0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f233074d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f233075e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f233076f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f233077g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f233078h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f233077g = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.u0.f233004d);
        this.f233078h = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v0.f233016d);
    }

    public final void O6() {
        if (this.f233076f) {
            return;
        }
        ka0.g0 P6 = P6();
        if (P6 != null) {
            ((ll3.e1) P6).x();
        }
        this.f233076f = true;
    }

    public final ka0.g0 P6() {
        return (ka0.g0) ((jz5.n) this.f233078h).mo141623x754a37bb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        if (this.f233075e) {
            return true;
        }
        ka0.g0 P6 = P6();
        if (P6 != null) {
            ll3.e1 e1Var = (ll3.e1) P6;
            e1Var.f400691v = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d dVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) P6;
            if (dVar.u()) {
                dVar.W(false);
            } else {
                e1Var.e0(b21.m.b());
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicMvFloatBallAnimationUIC", "onBackPressed hideAllFloatBall: %s, needExitAnimation: %s", java.lang.Boolean.FALSE, java.lang.Boolean.TRUE);
        pv.g0 g0Var = (pv.g0) ((jz5.n) this.f233077g).mo141623x754a37bb();
        java.lang.Boolean bool = null;
        if (g0Var != null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.p314xaae8f345.mm.ui.ga mo78514x143f1b92 = ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).mo78514x143f1b92();
            bool = java.lang.Boolean.valueOf(((ep1.k) g0Var).e(null, mo78514x143f1b92 != null ? mo78514x143f1b92.w() : null, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.w0(this)));
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        ka0.g0 P6 = P6();
        if (P6 != null) {
            ll3.e1 e1Var = (ll3.e1) P6;
            e1Var.f400691v = true;
            e1Var.f400693x = true;
        }
        if (m158354x19263085() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            this.f233074d = true;
            pv.g0 g0Var = (pv.g0) ((jz5.n) this.f233077g).mo141623x754a37bb();
            if (g0Var != null) {
                android.content.Intent intent = m158354x19263085().getIntent();
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                com.p314xaae8f345.mm.ui.ga mo78514x143f1b92 = ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).mo78514x143f1b92();
                ((ep1.k) g0Var).c(intent, mo78514x143f1b92 != null ? mo78514x143f1b92.w() : null, null, new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.x0(this));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        ka0.g0 P6 = P6();
        if (P6 != null) {
            ((ll3.e1) P6).z();
        }
        this.f233076f = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (!this.f233074d) {
            O6();
        }
        ep1.m.a(m158354x19263085(), false);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        gp1.v Bi;
        super.mo2286xb05099c3();
        P6();
        if (ep1.m.g(m158354x19263085().getIntent()) || (Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi()) == null) {
            return;
        }
        Bi.k0();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        ka0.g0 P6 = P6();
        if (P6 != null) {
            ((ll3.e1) P6).t0();
        }
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        if (Bi != null) {
            Bi.r0();
        }
    }
}
