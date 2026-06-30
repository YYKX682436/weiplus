package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class v0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f240045d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f240046e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f240047f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f240048g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f240049h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f240050i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f240051m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f240045d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.f0(this));
        this.f240047f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.e0(this));
        this.f240048g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.i0(this));
        this.f240049h = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.g0(this));
        this.f240050i = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.h0(this));
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 O6() {
        return (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) this.f240045d).mo141623x754a37bb();
    }

    public final void P6(java.util.ArrayList arrayList) {
        this.f240051m = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveMainUIC$reInitAdapter$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "getItemConvert, type:" + type);
                ox3.e eVar = new ox3.e();
                eVar.f431271e = new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.o0(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v0.this);
                return eVar;
            }
        }, arrayList, true);
        O6().i(new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.p0(this));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f240051m;
        if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.r0(this);
        }
        O6().mo7960x6cab2c8d(this.f240051m);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        if (i17 == 8 && i18 == -1 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
            if (stringExtra == null || stringExtra.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(pf5.o.TAG, "empty or null contact: " + stringExtra);
            } else {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                mx3.s.a(mx3.u.f414153f, m80379x76847179(), 2, stringExtra, ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v.class)).f240032e, false, null, 48, null);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
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
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        p3325xe03a0797.p3326xc267989b.l.d(mo144225x95f74600(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.l0(this, null), 3, null);
        this.f240046e = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(m158354x19263085());
        O6().mo7967x900dcbe1(this.f240046e);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 O6 = O6();
        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.m0 m0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.m0();
        m0Var.e(2, 10);
        O6.m7971xa810ec34(m0Var);
        O6().setNestedScrollingEnabled(false);
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.d0(this, null), 3, null);
        P6(new java.util.ArrayList());
    }
}
