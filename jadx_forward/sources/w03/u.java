package w03;

/* loaded from: classes10.dex */
public final class u extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f523436d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f523437e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f523438f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f523439g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f523440h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f523441i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f523442m;

    /* renamed from: n, reason: collision with root package name */
    public long f523443n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f523444o;

    /* renamed from: p, reason: collision with root package name */
    public android.os.Bundle f523445p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f523446q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f523447r;

    /* renamed from: s, reason: collision with root package name */
    public s03.e f523448s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f523449t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f523436d = jz5.h.b(w03.q.f523432d);
        this.f523444o = true;
    }

    public static void S6(w03.u uVar, boolean z17, boolean z18, boolean z19, java.lang.Long l17, int i17, java.lang.Object obj) {
        boolean z27 = (i17 & 1) != 0 ? false : z17;
        boolean z28 = (i17 & 2) != 0 ? false : z18;
        boolean z29 = (i17 & 4) != 0 ? false : z19;
        java.lang.Long l18 = (i17 & 8) != 0 ? null : l17;
        if (uVar.f523438f || uVar.f523446q) {
            uVar.O6().a7(false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideoFloatBallAnimationUIC", "tryToAddFloatBall doingFloatBallExitPageAnimation and ignore");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.B7).mo141623x754a37bb()).r()).intValue();
        if (z27) {
            boolean z37 = intValue == 1 || intValue == 2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideoFloatBallAnimationUIC", "tryToAddFloatBall, enableAutoFloatBall=" + z37 + ", hasTriggerAdd=" + uVar.f523446q);
            if (!(z37 && !uVar.f523446q)) {
                if (!(!uVar.f523446q && uVar.f523440h && uVar.f523441i && !kd2.p1.N.a().u())) {
                    uVar.O6().a7(false);
                    return;
                }
            }
        }
        boolean z38 = uVar.f523447r || !z27 || intValue == 2;
        kd2.o0 o0Var = kd2.p1.N;
        if (!o0Var.a().B0(z29, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideoFloatBallAnimationUIC", "addFloatBall: unable to add float ball");
            uVar.O6().a7(false);
        } else if (uVar.R6(z29, true, z38, l18, z27, z28)) {
            uVar.f523442m = true;
            if (z28) {
                o0Var.a().C0(3);
            }
            p3325xe03a0797.p3326xc267989b.l.d(((c61.l7) i95.n0.c(c61.l7.class)).V, null, null, new w03.o(z29, z38, false, uVar, z28, null), 3, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideoFloatBallAnimationUIC", "addFloatBall saveData failed");
            uVar.O6().a7(false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideoFloatBallAnimationUIC", "handleExitAnimation backClose: " + z27);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15554x67783102 O6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.flutter.ui.MegaVideoFlutterActivity");
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15554x67783102) m158354x19263085;
    }

    public final void P6() {
        this.f523437e = true;
        pv.g0 g0Var = (pv.g0) ((jz5.n) this.f523436d).mo141623x754a37bb();
        if (g0Var != null) {
            ((ep1.k) g0Var).c(m158354x19263085().getIntent(), m158354x19263085().getWindow().getDecorView(), null, new w03.r(this));
        }
    }

    public final void Q6() {
        if (this.f523439g) {
            return;
        }
        kd2.o0 o0Var = kd2.p1.N;
        o0Var.a().f174665d.f174592t = false;
        o0Var.a().x();
        o0Var.a().t0();
        this.f523439g = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean R6(boolean r17, boolean r18, boolean r19, java.lang.Long r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w03.u.R6(boolean, boolean, boolean, java.lang.Long, boolean, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo450x3e5a77bb(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w03.u.mo450x3e5a77bb(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        kd2.p1.N.a().P0();
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        if (Bi != null) {
            Bi.r0();
        }
        this.f523448s = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onFinished */
    public void mo13982x7cf2e371() {
        super.mo13982x7cf2e371();
        kd2.p1.N.a().p();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onNewIntent */
    public void mo2280xc944513d(android.content.Intent intent) {
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("FLOAT_BALL_KEY") : null;
        this.f523440h = !(stringExtra == null || stringExtra.length() == 0);
        this.f523441i = kd2.p1.N.a().O0();
        if (intent != null) {
            this.f523443n = intent.getLongExtra("KEY_ENTER_PLAYING_FEED_ID", 0L);
        }
        this.f523444o = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideoFloatBallAnimationUIC", "onNewIntent %s", java.lang.Boolean.valueOf(this.f523437e));
        if (this.f523440h && (m158354x19263085() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            P6();
        }
        this.f523445p = m80379x76847179().getIntent().getExtras();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        if (!this.f523442m) {
            R6(true, false, false, null, false, false);
        }
        if (this.f523439g) {
            kd2.p1.N.a().z();
        }
        kd2.p1 a17 = kd2.p1.N.a();
        gp1.v vVar = a17.f174669h;
        if (vVar != null) {
            vVar.o0(a17.f174665d);
        }
        this.f523439g = false;
        O6().W6();
        this.f523449t = true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        gp1.v Bi;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95;
        if (this.f523441i && this.f523440h && this.f523444o) {
            if (ep1.m.h(m158359x1e885992())) {
                ep1.m.a(m158354x19263085(), false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideoFloatBallAnimationUIC", "onResume %s", java.lang.Boolean.valueOf(this.f523437e));
            if (!this.f523437e) {
                Q6();
            }
        } else {
            kd2.p1.T0(kd2.p1.N.a(), true, true, false, 4, null);
        }
        this.f523444o = false;
        if (ep1.m.h(m158359x1e885992()) && (m78735x28280f95 = O6().m78735x28280f95()) != null) {
            m78735x28280f95.m81454x4335bff3(false);
            m78735x28280f95.d(true);
        }
        if (!this.f523440h && (Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi()) != null) {
            Bi.k0();
        }
        if (this.f523449t) {
            O6().Y6();
            this.f523449t = false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        super.mo2286xb05099c3();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
    }
}
