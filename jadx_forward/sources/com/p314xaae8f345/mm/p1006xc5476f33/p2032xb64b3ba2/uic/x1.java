package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class x1 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public cy3.d f240074d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240075e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f240076f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f240076f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.w1(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.c8m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f0, "findViewById(...)");
        cy3.d dVar = new cy3.d(mo144222x4ff8c0f0);
        this.f240074d = dVar;
        p012xc85e97e9.p093xedfae76a.j0 j0Var = dVar.f306300i;
        if (j0Var != null) {
            j0Var.mo7806x9d92d11c(m158354x19263085(), new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.o1(this));
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.k1) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.k1.class)).f239973d.mo7806x9d92d11c(m158354x19263085(), new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.p1(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        p3325xe03a0797.p3326xc267989b.l.d(mo144225x95f74600(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.q1(this, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        rx3.z zVar = (rx3.z) ((jz5.n) this.f240076f).mo141623x754a37bb();
        zVar.getClass();
        zVar.d(1, this);
        if (by3.a.f117903b) {
            b21.m.g();
            ((ll3.j1) ((c21.i) i95.n0.c(c21.i.class))).getClass();
            b21.r b17 = b21.m.b();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicFloatBallService", "resumeMusicFloatBall %s", b17);
            if ((b17 == null || b17.N) ? false : true) {
                b17.N = true;
                b21.m.k(b17);
            }
            ll3.q0.d(b17);
        }
        by3.a.f117903b = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        p3325xe03a0797.p3326xc267989b.l.d(mo144225x95f74600(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v1(this, null), 3, null);
        cy3.d dVar = this.f240074d;
        if (dVar != null) {
            dVar.b(false);
        }
    }
}
