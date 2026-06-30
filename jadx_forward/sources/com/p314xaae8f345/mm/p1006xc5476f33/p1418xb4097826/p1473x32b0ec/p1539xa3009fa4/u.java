package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class u extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f198962d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f198963e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e f198964f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f198965g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm f198966h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l8 f198967i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c6 f198968m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f198969n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewGroup f198970o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 f198971p;

    /* renamed from: q, reason: collision with root package name */
    public final qo0.c f198972q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f198962d = "FinderGameLivePostContextUIC";
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        eVar = eVar == null ? new gk2.e("TAG") : eVar;
        this.f198963e = eVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
        this.f198964f = c14197x319b1b9e == null ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e(eVar) : c14197x319b1b9e;
        new dk2.r4(new java.lang.ref.WeakReference(activity), eVar, null);
        this.f198965g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.q(activity));
        this.f198969n = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p(activity, this));
        this.f198972q = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s(this, activity);
    }

    public final android.view.View O6(int i17, android.view.View root) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        android.view.View inflate = ((android.view.ViewStub) root.findViewById(i17)).inflate();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return inflate;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1 P6() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1) ((jz5.n) this.f198969n).mo141623x754a37bb();
    }

    public final st2.h1 Q6() {
        return (st2.h1) ((jz5.n) this.f198965g).mo141623x754a37bb();
    }

    public final android.view.ViewGroup R6() {
        android.view.ViewGroup viewGroup = this.f198970o;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootLayoutView");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.view.View findViewById = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f566668go4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f198970o = (android.view.ViewGroup) findViewById;
        gk2.e eVar = this.f198963e;
        p012xc85e97e9.p093xedfae76a.b0 b0Var = eVar.f354007h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(b0Var, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
        b0Var.i(p012xc85e97e9.p093xedfae76a.n.RESUMED);
        if (m158354x19263085().getIntent() != null) {
            r45.n73 n73Var = new r45.n73();
            byte[] byteArrayExtra = m158359x1e885992().getByteArrayExtra("GameUserInfo");
            if (byteArrayExtra != null) {
                try {
                    n73Var.mo11468x92b714fd(byteArrayExtra);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
            }
            r45.z73 z73Var = (r45.z73) n73Var.m75936x14adae67(5);
            if (z73Var != null) {
                ((mm2.o2) eVar.a(mm2.o2.class)).f410834g = z73Var.m75939xb282bd08(2);
                mm2.o2 o2Var = (mm2.o2) eVar.a(mm2.o2.class);
                r45.lz1 lz1Var = new r45.lz1();
                lz1Var.set(0, java.lang.Integer.valueOf(z73Var.m75939xb282bd08(3)));
                lz1Var.set(1, java.lang.Integer.valueOf(z73Var.m75939xb282bd08(4)));
                o2Var.f410835h = lz1Var;
                ((mm2.o2) eVar.a(mm2.o2.class)).f410836i = z73Var.m75939xb282bd08(5);
                dk2.p pVar = ((mm2.o2) eVar.a(mm2.o2.class)).f410837m;
                r45.xl1 xl1Var = (r45.xl1) z73Var.m75936x14adae67(6);
                pVar.l(xl1Var != null ? xl1Var.m75941xfb821914(1) : null);
                ((mm2.o2) eVar.a(mm2.o2.class)).O6(z73Var.m75939xb282bd08(8) != 1);
                java.lang.String str = "[saveFuncSwitchFlag] flags = " + z73Var.m75942xfb822ef2(9);
                java.lang.String str2 = this.f198962d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
                ((mm2.c1) eVar.a(mm2.c1.class)).R1 = z73Var.m75942xfb822ef2(9);
                mm2.o2 o2Var2 = (mm2.o2) eVar.a(mm2.o2.class);
                r45.dc6 dc6Var = (r45.dc6) z73Var.m75936x14adae67(12);
                o2Var2.f410841q = dc6Var != null ? dc6Var.m75933x41a8a7f2(2) : false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[saveGameLiveGlobalFlag] flags = " + z73Var.m75939xb282bd08(15));
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_GAME_LIVE_GLOBAL_FLAG_INT_SYNC, java.lang.Integer.valueOf(z73Var.m75939xb282bd08(15)));
                mm2.o2 o2Var3 = (mm2.o2) eVar.a(mm2.o2.class);
                r45.kz0 kz0Var = (r45.kz0) z73Var.m75936x14adae67(10);
                o2Var3.f410839o = pm0.v.z(kz0Var != null ? kz0Var.m75939xb282bd08(1) : 0, 16);
                ((mm2.c1) eVar.a(mm2.c1.class)).J4 = ya2.h.f542017a.b(xy2.c.e(m80379x76847179()));
                ((oe0.x) i95.n0.c(oe0.x.class)).getClass();
                if (this.f198968m == null) {
                    android.view.View findViewById2 = R6().findViewById(com.p314xaae8f345.mm.R.id.ejs);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c6 c6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c6((android.view.ViewGroup) findViewById2, P6());
                    this.f198968m = c6Var;
                    c6Var.K0(8);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c6 c6Var2 = this.f198968m;
                    if (c6Var2 != null) {
                        c6Var2.z0();
                    }
                }
                ((mm2.c1) eVar.a(mm2.c1.class)).f410338f6.mo523x53d8522f(java.lang.Boolean.valueOf(z73Var.m75933x41a8a7f2(13)));
                ((mm2.c1) eVar.a(mm2.c1.class)).f410344g6 = (r45.yq1) z73Var.m75936x14adae67(14);
                ((mm2.o2) eVar.a(mm2.o2.class)).f410840p = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) z73Var.m75936x14adae67(19);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("gamelive creatorCenterEntrance:");
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) z73Var.m75936x14adae67(16);
                sb6.append(c19786x6a1e2862 != null ? java.lang.Integer.valueOf(c19786x6a1e2862.hashCode()) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
                ((mm2.c1) eVar.a(mm2.c1.class)).W2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) z73Var.m75936x14adae67(18);
                ((mm2.c1) eVar.a(mm2.c1.class)).X2 = z73Var.m75933x41a8a7f2(17);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("canShow3d: ");
                sb7.append(((mm2.c1) eVar.a(mm2.c1.class)).X2);
                sb7.append(", data: ");
                mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
                sb7.append((c1Var != null ? c1Var.W2 : null) != null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7.toString());
            }
        }
        ((mm2.c1) eVar.a(mm2.c1.class)).f410311a5 = true;
        mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f566668go4);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        gk2.e eVar2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.u) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.u.class)).f198963e;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.u) zVar.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.u.class)).P6();
        ((mm2.c1) eVar.a(mm2.c1.class)).l9(1);
        mm2.c1 c1Var2 = (mm2.c1) eVar.a(mm2.c1.class);
        java.lang.String e18 = xy2.c.e(m80379x76847179());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e18, "<set-?>");
        c1Var2.f410385o = e18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 wn0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0(R6(), P6());
        this.f198971p = wn0Var;
        wn0Var.z0();
        if (this.f198966h == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.t tVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.t(O6(com.p314xaae8f345.mm.R.id.f1i, R6()), P6(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jj.f194648e);
            this.f198966h = tVar;
            tVar.K0(8);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar = this.f198966h;
            if (hmVar != null) {
                hmVar.z0();
            }
        }
        if (this.f198967i == null) {
            android.view.View findViewById3 = R6().findViewById(com.p314xaae8f345.mm.R.id.fdg);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l8 l8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l8((android.view.ViewGroup) findViewById3, P6());
            this.f198967i = l8Var;
            l8Var.K0(8);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l8 l8Var2 = this.f198967i;
            if (l8Var2 != null) {
                l8Var2.z0();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        gk2.e eVar2 = this.f198963e;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eVar2, eVar)) {
            eVar2.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 wn0Var = this.f198971p;
        if (wn0Var != null) {
            wn0Var.O0();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar = this.f198966h;
        if (hmVar != null) {
            hmVar.O0();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c6 c6Var = this.f198968m;
        if (c6Var != null) {
            c6Var.m56914x57429eec();
        }
    }
}
