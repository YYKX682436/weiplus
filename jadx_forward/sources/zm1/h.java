package zm1;

/* loaded from: classes11.dex */
public class h extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zm1.n {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f555669d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f555670e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f555671f;

    /* renamed from: g, reason: collision with root package name */
    public um1.b f555672g;

    /* renamed from: h, reason: collision with root package name */
    public um1.b f555673h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f555674i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f555675m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f555676n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f555677o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f555669d = jz5.h.b(zm1.d.f555665d);
        jz5.h.b(new zm1.g(activity));
        this.f555670e = jz5.h.b(zm1.a.f555663d);
        this.f555671f = jz5.h.b(zm1.b.f555664d);
        jz5.h.b(new zm1.e(activity));
    }

    public static final void O6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, boolean z17) {
        try {
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(z17)));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BizAudioFloatBallAnimationUIC", e17, "exitWithAnimation exception", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if ((r4 != null && r4.intValue() == r2) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean P6() {
        /*
            r7 = this;
            jz5.g r0 = r7.f555670e
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.mo141623x754a37bb()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 != 0) goto L9e
            java.lang.Class<s40.w0> r0 = s40.w0.class
            i95.m r2 = i95.n0.c(r0)
            s40.w0 r2 = (s40.w0) r2
            com.tencent.mm.feature.finder.live.v4 r2 = (com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) r2
            r2.getClass()
            com.tencent.mm.plugin.finder.live.view.k0 r2 = dk2.ef.f314913e
            r3 = 0
            if (r2 == 0) goto L28
            android.content.Context r2 = r2.getContext()
            goto L29
        L28:
            r2 = r3
        L29:
            boolean r4 = r2 instanceof android.app.Activity
            if (r4 == 0) goto L30
            r3 = r2
            android.app.Activity r3 = (android.app.Activity) r3
        L30:
            if (r3 == 0) goto L9e
            int r2 = r3.getTaskId()
            boolean r3 = r3.isFinishing()
            if (r3 != 0) goto L58
            java.lang.Class<rv.i2> r4 = rv.i2.class
            i95.m r4 = i95.n0.c(r4)
            rv.i2 r4 = (rv.i2) r4
            bv.f r4 = (bv.f) r4
            java.lang.Integer r4 = r4.f106179e
            r5 = 1
            if (r4 != 0) goto L4c
            goto L54
        L4c:
            int r4 = r4.intValue()
            if (r4 != r2) goto L54
            r4 = r5
            goto L55
        L54:
            r4 = r1
        L55:
            if (r4 == 0) goto L58
            goto L59
        L58:
            r5 = r1
        L59:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "needAddFloatBallWhenExit finderLiveId: "
            r4.<init>(r6)
            r4.append(r2)
            java.lang.String r2 = ", finderLiveActFinish: "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = ", sameTask: "
            r4.append(r2)
            r4.append(r5)
            java.lang.String r2 = r4.toString()
            java.lang.String r3 = "MicroMsg.BizAudioFloatBallAnimationUIC"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r2)
            if (r5 == 0) goto L9e
            i95.m r0 = i95.n0.c(r0)
            s40.w0 r0 = (s40.w0) r0
            com.tencent.mm.feature.finder.live.v4 r0 = (com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) r0
            boolean r0 = r0.rk()
            if (r0 == 0) goto L9e
            java.lang.String r0 = "needAddFloatBallWhenExit false for visitor living and stop"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0)
            java.lang.Class<pv.z> r0 = pv.z.class
            i95.m r0 = i95.n0.c(r0)
            pv.z r0 = (pv.z) r0
            ov.b r0 = (ov.b) r0
            r0.Ni()
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zm1.h.P6():boolean");
    }

    public final void Q6() {
        if (this.f555675m) {
            return;
        }
        rv.j2 Bi = ((mm1.f0) ((rv.k2) i95.n0.c(rv.k2.class))).Bi();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mm1.b0) Bi).f410172e, m158359x1e885992().getStringExtra("session_id"))) {
            ((b66.i) tm1.h.f502003a.a()).e();
        }
        this.f555675m = true;
    }

    @Override // zm1.n
    public void R(um1.b listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f555672g = listener;
    }

    public final void R6() {
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        if (Bi != null) {
            Bi.W(1.0f);
        }
    }

    public final void S6() {
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mm1.b0) ((mm1.f0) ((rv.k2) i95.n0.c(rv.k2.class))).Bi()).f410172e, m158359x1e885992().getStringExtra("session_id"));
        P6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAudioFloatBallAnimationUIC", "tryShowBizAudioFloatBall exitNotAddFloatBall: " + this.f555676n + ", canAddFloatBall: false, isSessionValid: " + b17);
        if (this.f555676n || !b17 || ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).zk()) {
            return;
        }
        ((b66.i) tm1.h.f502003a.a()).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e9  */
    @Override // zm1.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(boolean r7, boolean r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zm1.h.d(boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // zm1.n
    public void k5(um1.b listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f555673h = listener;
    }

    @Override // zm1.n
    public void m0(um1.b listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f555672g = null;
    }

    @Override // zm1.n
    public void m2(um1.b listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f555673h = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        if (((java.lang.Boolean) ((jz5.n) this.f555671f).mo141623x754a37bb()).booleanValue()) {
            um1.b bVar = this.f555672g;
            if (bVar != null) {
                bVar.a();
                return;
            }
            return;
        }
        this.f555674i = true;
        pv.g0 g0Var = (pv.g0) ((jz5.n) this.f555669d).mo141623x754a37bb();
        if (g0Var != null) {
            ((ep1.k) g0Var).c(m158354x19263085().getIntent(), m158354x19263085().getWindow().getDecorView(), null, new zm1.f(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        S6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        this.f555675m = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (!this.f555674i) {
            Q6();
        }
        if (ep1.m.h(m158359x1e885992())) {
            ep1.m.a(m158354x19263085(), false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        super.mo2286xb05099c3();
        this.f555677o = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        if (this.f555677o) {
            S6();
        }
    }
}
