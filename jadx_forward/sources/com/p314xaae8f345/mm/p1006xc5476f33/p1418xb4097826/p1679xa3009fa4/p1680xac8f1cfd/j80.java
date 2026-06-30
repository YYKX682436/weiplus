package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class j80 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zu f216363d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yt f216364e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hv f216365f;

    /* renamed from: g, reason: collision with root package name */
    public final ey2.k0 f216366g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f216367h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f216368i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j80(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.k0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        this.f216366g = (ey2.k0) a17;
        this.f216367h = true;
        this.f216368i = true;
    }

    public final void O6() {
        if (this.f216368i) {
            this.f216368i = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zu zuVar = this.f216363d;
            if (zuVar != null) {
                zuVar.c(100L, false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yt ytVar = this.f216364e;
            if (ytVar != null) {
                ytVar.c(100L, false);
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).qj(m158354x19263085(), 5);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b_c;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zu zuVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 mo56062x4905e9fa;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        if (i17 != 501 || i18 != -1 || intent == null || (zuVar = this.f216363d) == null || (mo56062x4905e9fa = zuVar.g().mo56062x4905e9fa()) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 v17 = hc2.f1.v(mo56062x4905e9fa, intent, zuVar.f192830i, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xu.f192637d);
        gm0.j1.u().c().x(hc2.d0.c(2), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l((v17 == null || (gVar = v17.f189834b) == null) ? null : gVar.g()));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209238g0).mo141623x754a37bb()).r()).intValue();
        pf5.u uVar = pf5.u.f435469a;
        if (intValue == 1) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zu zuVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zu((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) m158358x197d1fc6());
            this.f216363d = zuVar;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hv hvVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hv((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630852, zuVar, m80380x71e92c1d());
            zuVar.f192826e = hvVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ft g17 = zuVar.g();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 c13917xbf9dc158 = zuVar.f192830i;
            g17.r(c13917xbf9dc158.m56388xcaeb60d0());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13922x2e8bf6c7.m56397xe61f0140(c13917xbf9dc158, zuVar.f192831m, false, 2, null);
            if (((ey2.k0) ((ya2.o1) uVar.e(zy2.b6.class).c(ya2.o1.class))).N6()) {
                zuVar.f192827f.N6(2).f338976c.size();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56345x587162dc(c13917xbf9dc158, false, 1, null);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 mo56062x4905e9fa = zuVar.g().mo56062x4905e9fa();
                if (mo56062x4905e9fa != null) {
                    mo56062x4905e9fa.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.mu(zuVar));
                }
            } else {
                ym5.s3 s3Var = new ym5.s3(0);
                s3Var.f545050b = -2;
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hu(s3Var, zuVar));
            }
            this.f216365f = hvVar;
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630853, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yt ytVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yt((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630853, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) m158358x197d1fc6());
        this.f216364e = ytVar;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630854 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630854, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.fu fuVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.fu((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630854, ytVar, m80380x71e92c1d());
        ytVar.f192736m = c01.id.c();
        ytVar.f192732f = fuVar;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = ytVar.f192730d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13865x4e81e68a c13865x4e81e68a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13865x4e81e68a(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6());
        c13865x4e81e68a.m56375x868b9334(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kt(c13865x4e81e68a, ytVar));
        c13865x4e81e68a.f189000d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.lt(ytVar);
        ytVar.f192731e = c13865x4e81e68a;
        ytVar.h().r(ytVar.g().m56388xcaeb60d0());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13922x2e8bf6c7.m56397xe61f0140(ytVar.g(), ytVar.f192740q, false, 2, null);
        if (((ey2.k0) ((ya2.o1) uVar.e(zy2.b6.class).c(ya2.o1.class))).N6()) {
            ytVar.f192733g.N6(1000).f338977d.size();
            ytVar.g().mo56368x4487ec3f(false);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 mo56062x4905e9fa2 = ytVar.h().mo56062x4905e9fa();
            if (mo56062x4905e9fa2 != null) {
                mo56062x4905e9fa2.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.mt(ytVar));
            }
        } else {
            ym5.s3 s3Var2 = new ym5.s3(0);
            s3Var2.f545050b = -2;
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ht(s3Var2, ytVar));
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 mo56062x4905e9fa3 = ytVar.h().mo56062x4905e9fa();
        if (mo56062x4905e9fa3 != null) {
            in5.o.b(mo56062x4905e9fa3, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.nt(ytVar), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ot.f190212d);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.x1 x1Var = ml2.x1.f409734e;
        ml2.q1 q1Var = ml2.q1.f409345e;
        zy2.zb.Kh(zbVar, null, x1Var, "temp_10", ml2.y.f409777i, 0, 0L, 0, 112, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zu zuVar = this.f216363d;
        if (zuVar != null) {
            zuVar.mo979x3f5eee52();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yt ytVar = this.f216364e;
        if (ytVar != null) {
            ytVar.mo979x3f5eee52();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1 v1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        v1Var.x(2, nyVar != null ? nyVar.V6() : null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onFinished */
    public void mo13982x7cf2e371() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 mo56062x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 mo56062x4905e9fa2;
        super.mo13982x7cf2e371();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zu zuVar = this.f216363d;
        if (zuVar != null && (mo56062x4905e9fa2 = zuVar.g().mo56062x4905e9fa()) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TimelineLbsPresenter", "[onFinishing] position=" + zuVar.f(mo56062x4905e9fa2) + " totalDy=" + zuVar.f192829h);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 c13917xbf9dc158 = zuVar.f192830i;
            java.util.Iterator it = c13917xbf9dc158.m56388xcaeb60d0().iterator();
            while (it.hasNext()) {
                so2.j5 j5Var = (so2.j5) it.next();
                if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).T0();
                }
            }
            ey2.t0.V6(zuVar.f192827f, "Finder.TimelineLbsPresenter", 2, 0, zuVar.f192829h, c13917xbf9dc158.m56388xcaeb60d0(), null, null, false, false, 480, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yt ytVar = this.f216364e;
        if (ytVar == null || (mo56062x4905e9fa = ytVar.h().mo56062x4905e9fa()) == null) {
            return;
        }
        int f17 = ytVar.f(mo56062x4905e9fa);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTimelineLbsMixPresenter", "[onFinishing] position=" + f17 + " totalDy=" + ytVar.f192735i);
        ey2.t0.V6(ytVar.f192733g, "Finder.FinderTimelineLbsMixPresenter", 1000, f17, ytVar.f192735i, new java.util.ArrayList(0), ytVar.g().m56388xcaeb60d0(), null, false, false, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        this.f216367h = this.f216366g.N6();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hv hvVar = this.f216365f;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 mo56062x4905e9fa = hvVar != null ? hvVar.mo56062x4905e9fa() : null;
        ml2.x1 x1Var = ml2.x1.f409734e;
        ml2.q1 q1Var = ml2.q1.f409345e;
        zy2.zb.Kh(zbVar, mo56062x4905e9fa, x1Var, "temp_10", ml2.y.f409774f, 0, 0L, 0, 112, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onRequestPermissionsResult */
    public void mo2282x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        if (i17 == 79) {
            if (grantResults[0] == 0) {
                O6();
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).qj(m158354x19263085(), 3);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (!this.f216367h && this.f216366g.N6()) {
            O6();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a.s(2);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hv hvVar = this.f216365f;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 mo56062x4905e9fa = hvVar != null ? hvVar.mo56062x4905e9fa() : null;
        ml2.x1 x1Var = ml2.x1.f409734e;
        ml2.q1 q1Var = ml2.q1.f409345e;
        zy2.zb.Kh(zbVar, mo56062x4905e9fa, x1Var, "temp_10", ml2.y.f409773e, 0, 0L, 0, 112, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleFocused */
    public void mo58275xd317978f() {
        super.mo58275xd317978f();
        pf5.u uVar = pf5.u.f435469a;
        ((ey2.t0) uVar.e(c61.l7.class).a(ey2.t0.class)).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zu zuVar = this.f216363d;
        if (zuVar != null) {
            pm0.v.K(null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.wu(zuVar));
            if (zuVar.f192833o) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).qj(zuVar.f192825d, 1);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yt ytVar = this.f216364e;
        if (ytVar != null) {
            if (ytVar.f192738o) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).qj(ytVar.f192730d, 1);
            }
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("finder_tl_nearby_tab");
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().q0("finder_tl_nearby_tab", "onRefreshEnd");
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) uVar.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34.class)).a7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.i80.f216253d);
        ya2.o1.t4(this.f216366g, false, null, 2, null);
        if (((c61.l7) i95.n0.c(c61.l7.class)).nk().h0(2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TimelineLbsUIC", "[onUserVisibleFocused] tabType=2 autoFlingToRefresh");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zu zuVar2 = this.f216363d;
            if (zuVar2 != null) {
                zuVar2.c(0L, false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yt ytVar2 = this.f216364e;
            if (ytVar2 != null) {
                ytVar2.c(0L, false);
            }
            if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.Q0().r()).intValue() == 1) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                if (nyVar != null) {
                    i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).aj(nyVar.V6(), 6, 0);
                }
            }
        }
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("finder_tl_nearby_tab");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleUnFocused */
    public void mo58437xaa858cb6() {
        super.mo58437xaa858cb6();
        ((ey2.t0) pf5.u.f435469a.e(c61.l7.class).a(ey2.t0.class)).T6(2);
    }
}
