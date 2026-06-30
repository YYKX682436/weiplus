package com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic;

/* loaded from: classes11.dex */
public class z extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.i {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f256337d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f256338e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f256339f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f256340g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f256341h;

    /* renamed from: i, reason: collision with root package name */
    public al4.b f256342i;

    /* renamed from: m, reason: collision with root package name */
    public al4.b f256343m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f256344n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f256345o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f256346p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f256347q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f256348r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f256349s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f256337d = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.t.f256328d);
        this.f256338e = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.y.f256336d);
        this.f256339f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.x(activity));
        this.f256340g = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.o.f256314d);
        this.f256341h = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.p.f256319d);
        jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.u(activity));
    }

    public static final void Q6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, boolean z17) {
        try {
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(z17)));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TingFloatBallAnimationUIC", e17, "exitWithAnimation exception", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.i
    public void G(al4.b listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f256342i = listener;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.i
    public void O5(al4.b listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f256343m = null;
    }

    public final boolean O6(al4.b bVar) {
        boolean z17;
        ep1.m.a(m158354x19263085(), false);
        pv.g0 g0Var = (pv.g0) ((jz5.n) this.f256337d).mo141623x754a37bb();
        if (g0Var != null) {
            z17 = ((ep1.k) g0Var).e(null, m158354x19263085().getWindow().getDecorView(), null, new com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.q(), new com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.r(bVar, this));
        } else {
            z17 = false;
        }
        if (z17) {
            al4.b bVar2 = this.f256343m;
            if (bVar2 != null) {
                bVar2.mo2272xd7e2f2fd();
            }
            R6(false);
        }
        return z17;
    }

    public final void P6() {
        if (this.f256347q) {
            return;
        }
        il4.l lVar = il4.l.f373675a;
        il4.l.f373678d = null;
        ku5.u0 u0Var = ku5.t0.f394148d;
        il4.j jVar = il4.j.f373672d;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(jVar, 3000L, false);
        if (m158354x19263085().isFinishing() && ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).ij()) {
            ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).zj();
        }
    }

    public final void R6(boolean z17) {
        sl4.a a17 = jm4.t2.a(bw5.eq0.TingMusic);
        if (a17 == null) {
            return;
        }
        if (!(a17 instanceof cm4.a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingFloatBallAnimationUIC", "markNeedEnterTranslation floatBallHelper invalid");
            return;
        }
        cm4.a aVar = (cm4.a) a17;
        aVar.f490797s = z17;
        aVar.f174665d.f174591s = z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean S6() {
        /*
            r8 = this;
            jz5.g r0 = r8.f256340g
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.mo141623x754a37bb()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto La2
            java.lang.Class<s40.w0> r0 = s40.w0.class
            i95.m r3 = i95.n0.c(r0)
            s40.w0 r3 = (s40.w0) r3
            com.tencent.mm.feature.finder.live.v4 r3 = (com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) r3
            r3.getClass()
            com.tencent.mm.plugin.finder.live.view.k0 r3 = dk2.ef.f314913e
            r4 = 0
            if (r3 == 0) goto L29
            android.content.Context r3 = r3.getContext()
            goto L2a
        L29:
            r3 = r4
        L2a:
            boolean r5 = r3 instanceof android.app.Activity
            if (r5 == 0) goto L31
            r4 = r3
            android.app.Activity r4 = (android.app.Activity) r4
        L31:
            if (r4 == 0) goto La2
            int r3 = r4.getTaskId()
            boolean r4 = r4.isFinishing()
            if (r4 != 0) goto L59
            java.lang.Class<qk.t8> r5 = qk.t8.class
            i95.m r5 = i95.n0.c(r5)
            qk.t8 r5 = (qk.t8) r5
            ef0.h3 r5 = (ef0.h3) r5
            java.lang.Integer r5 = r5.f333759f
            if (r5 != 0) goto L4c
            goto L54
        L4c:
            int r5 = r5.intValue()
            if (r5 != r3) goto L54
            r5 = r2
            goto L55
        L54:
            r5 = r1
        L55:
            if (r5 == 0) goto L59
            r5 = r2
            goto L5a
        L59:
            r5 = r1
        L5a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "needAddFloatBallWhenExit finderLiveId: "
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r3 = ", finderLiveActFinish: "
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = ", sameTask: "
            r6.append(r3)
            r6.append(r5)
            java.lang.String r3 = r6.toString()
            java.lang.String r4 = "MicroMsg.TingFloatBallAnimationUIC"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r3)
            if (r5 == 0) goto La2
            i95.m r0 = i95.n0.c(r0)
            s40.w0 r0 = (s40.w0) r0
            com.tencent.mm.feature.finder.live.v4 r0 = (com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) r0
            boolean r0 = r0.rk()
            if (r0 == 0) goto La2
            java.lang.String r0 = "needAddFloatBallWhenExit false for visitor living and stop"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r0)
            java.lang.Class<pv.z> r0 = pv.z.class
            i95.m r0 = i95.n0.c(r0)
            pv.z r0 = (pv.z) r0
            ov.b r0 = (ov.b) r0
            r0.Ni()
            return r1
        La2:
            jm4.v2 r0 = jm4.w2.f381968d
            jm4.u2 r0 = r0.a()
            if (r0 == 0) goto Lc3
            bw5.eq0 r3 = bw5.eq0.AudioRadio
            jm4.w2 r0 = (jm4.w2) r0
            jm4.n2 r0 = r0.d(r3)
            if (r0 == 0) goto Lc3
            jm4.p2 r0 = (jm4.p2) r0
            jm4.g3 r0 = r0.f()
            if (r0 == 0) goto Lc3
            jm4.h3 r0 = (jm4.h3) r0
            int r0 = r0.i()
            goto Lc4
        Lc3:
            r0 = r1
        Lc4:
            boolean r0 = il4.m.a(r0)
            if (r0 == 0) goto Lcb
            return r1
        Lcb:
            java.lang.Class<qk.i9> r0 = qk.i9.class
            i95.m r0 = i95.n0.c(r0)
            qk.i9 r0 = (qk.i9) r0
            ef0.l4 r0 = (ef0.l4) r0
            qk.g9 r0 = r0.bj()
            if (r0 == 0) goto Le2
            rk4.z8 r0 = (rk4.z8) r0
            boolean r0 = r0.fj()
            goto Le3
        Le2:
            r0 = r1
        Le3:
            if (r0 == 0) goto Le6
            return r2
        Le6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.z.S6():boolean");
    }

    public final void T6() {
        if (this.f256346p) {
            return;
        }
        qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((rk4.k8) aj6).f478329e, m158359x1e885992().getStringExtra("session_id"));
        b66.g b18 = b66.i.f99700d.b(bw5.eq0.TingMusic);
        if (b18 != null) {
            ((b66.i) b18).e();
        }
        if (b17) {
            ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Ai(false);
            ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Bi(false);
        }
        this.f256346p = true;
    }

    public final void U6() {
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        if (Bi != null) {
            Bi.W(1.0f);
        }
    }

    public final void V6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f256338e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((ef0.l4) ((qk.i9) mo141623x754a37bb)).Vi(((java.lang.Number) ((jz5.n) this.f256339f).mo141623x754a37bb()).intValue(), false);
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).f478329e, m158359x1e885992().getStringExtra("session_id"));
        boolean S6 = S6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingFloatBallAnimationUIC", "tryShowTingFloatBall exitNotAddFloatBall: " + this.f256348r + ", canAddFloatBall: " + S6 + ", isSessionValid: " + b17);
        if (this.f256348r || !b17 || ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).zk()) {
            P6();
            return;
        }
        if (S6) {
            R6(true);
            ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Ai(true);
            ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Bi(true);
        } else {
            R6(true);
            ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Ai(true);
            P6();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(boolean r10, boolean r11, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r12) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.z.d(boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.i
    public void g0(al4.b listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f256342i = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        if (((java.lang.Boolean) ((jz5.n) this.f256341h).mo141623x754a37bb()).booleanValue()) {
            al4.b bVar = this.f256342i;
            if (bVar != null) {
                bVar.a();
            }
        } else {
            this.f256344n = true;
            pv.g0 g0Var = (pv.g0) ((jz5.n) this.f256337d).mo141623x754a37bb();
            if (g0Var != null) {
                ((ep1.k) g0Var).c(m158354x19263085().getIntent(), m158354x19263085().getWindow().getDecorView(), new com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.v(), new com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.w(this));
            }
        }
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f256338e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((ef0.l4) ((qk.i9) mo141623x754a37bb)).Vi(((java.lang.Number) ((jz5.n) this.f256339f).mo141623x754a37bb()).intValue(), true);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        V6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        b66.g b17;
        super.mo2281xb01dfb57();
        if (this.f256346p && (b17 = b66.i.f99700d.b(bw5.eq0.TingMusic)) != null) {
            ((b66.i) b17).d();
        }
        this.f256346p = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (!this.f256344n) {
            T6();
        }
        if (ep1.m.h(m158359x1e885992())) {
            ep1.m.a(m158354x19263085(), false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        super.mo2286xb05099c3();
        this.f256349s = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        if (this.f256349s) {
            V6();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.i
    public void r0(al4.b listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f256343m = listener;
    }
}
