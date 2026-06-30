package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class b8 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public qo0.c f198469d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f198470e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f198471f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f198472g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f198473h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f198474i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f198475m;

    /* renamed from: n, reason: collision with root package name */
    public az2.f f198476n;

    /* renamed from: o, reason: collision with root package name */
    public gk2.e f198477o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f198478p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.d6 f198479q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.l f198480r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f198481s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f198482t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.C13675x4cedeef6 f198483u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f198484v;

    /* renamed from: w, reason: collision with root package name */
    public yl2.g1 f198485w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f198486x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f198487y;

    /* renamed from: z, reason: collision with root package name */
    public int f198488z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f198479q = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.d6.f198567d;
        this.f198481s = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.h7(this));
        this.f198482t = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.q6(this));
        this.f198484v = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.x6(activity));
        this.f198487y = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.y7(this));
        this.f198488z = -1;
    }

    public static final void O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "adjustTopContainerMargin, " + com.p314xaae8f345.mm.ui.bl.h(b8Var.m158354x19263085()));
        android.widget.RelativeLayout relativeLayout = b8Var.f198472g;
        android.view.ViewGroup.LayoutParams layoutParams = relativeLayout != null ? relativeLayout.getLayoutParams() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = ((int) b8Var.m80379x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv)) + com.p314xaae8f345.mm.ui.bl.h(b8Var.m158354x19263085());
        android.widget.RelativeLayout relativeLayout2 = b8Var.f198472g;
        if (relativeLayout2 == null) {
            return;
        }
        relativeLayout2.setLayoutParams(marginLayoutParams);
    }

    public static final void P6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var) {
        java.lang.String str;
        yg2.b bVar;
        yl2.g1 g1Var = b8Var.f198485w;
        if (g1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLivePostUIC", "collectAuthRequirementsAfterRefresh: postHelper is null");
            return;
        }
        mm2.s1 s1Var = (mm2.s1) dk2.ef.f314905a.i(mm2.s1.class);
        int i17 = s1Var != null ? s1Var.f410925o : -1;
        if (s1Var == null || (str = s1Var.f410926p) == null) {
            str = "";
        }
        java.lang.String str2 = str;
        boolean d17 = yl2.g1.f544540g.d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "collectAuthRequirementsAfterRefresh: userFlag=" + i17);
        gk2.e eVar = dk2.ef.I;
        if (eVar == null || (bVar = eVar.f354008i) == null) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.l.d(bVar, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p6(g1Var, i17, str2, d17, b8Var, null), 3, null);
    }

    public static final void Q6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var, yl2.m mVar) {
        yg2.b bVar;
        yl2.g1 g1Var = b8Var.f198485w;
        if (g1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLivePostUIC", "handleRealnameAuth: postHelper is null");
            return;
        }
        gk2.e eVar = dk2.ef.I;
        if (eVar == null || (bVar = eVar.f354008i) == null) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.l.d(bVar, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.v6(mVar, g1Var, b8Var, null), 3, null);
    }

    public static final void f7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var;
        yg2.b bVar;
        yg2.c m57638x91b935cd;
        yf2.z zVar;
        mm2.e1 e1Var = (mm2.e1) dk2.ef.f314905a.i(mm2.e1.class);
        boolean z19 = false;
        if (e1Var != null && e1Var.g7()) {
            z19 = true;
        }
        if (!z19 && !b8Var.W6() && !z17 && !z18 && !ko0.l.f391403a.c()) {
            db5.e1.A(b8Var.m80379x76847179(), b8Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mi_), "", b8Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mib), b8Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mia), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.i7(z17, b8Var), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.j7.f198700d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = b8Var.f198470e;
            if (lVar == null || (zVar = (yf2.z) lVar.U0(yf2.z.class)) == null) {
                return;
            }
            zVar.a7(true);
            return;
        }
        zn0.y yVar = zn0.x.f555947a;
        int size = yVar.f555948a.size();
        yVar.f555949b = 1;
        yVar.f555950c = size;
        if ((!b8Var.W6() || z17) && (k0Var = dk2.ef.f314913e) != null) {
            qo0.c.a(k0Var, qo0.b.f446914m, null, 2, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var2 = dk2.ef.f314913e;
        if (k0Var2 != null && (m57638x91b935cd = k0Var2.m57638x91b935cd()) != null) {
            p3325xe03a0797.p3326xc267989b.l.b(m57638x91b935cd, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.m7(b8Var, null), 2, null);
        }
        gk2.e eVar = dk2.ef.I;
        if (eVar == null || (bVar = eVar.f354008i) == null) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.l.d(bVar, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.o7(b8Var, z17, null), 3, null);
    }

    public static final void g7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var) {
        yf2.z zVar;
        yf2.z zVar2;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var;
        r45.n73 n73Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = b8Var.f198470e;
        r45.z53 z53Var = (lVar == null || (j2Var = ((mm2.g1) lVar.P0(mm2.g1.class)).f410604i) == null || (n73Var = (r45.n73) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb()) == null) ? null : (r45.z53) n73Var.m75936x14adae67(1);
        if (z53Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar2 = b8Var.f198470e;
            if (lVar2 != null && (zVar2 = (yf2.z) lVar2.U0(yf2.z.class)) != null) {
                zVar2.a7(true);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "#screenCastGameModeWayExecute ScreenCastGameMode appInfo is null");
            return;
        }
        java.lang.String m75945x2fec8307 = z53Var.m75945x2fec8307(1);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        java.lang.String m75945x2fec83072 = z53Var.m75945x2fec8307(4);
        java.lang.String str = m75945x2fec83072 != null ? m75945x2fec83072 : "";
        boolean b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3.f183555a.b(b8Var.m80379x76847179(), str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "#screenCastGameModeWayExecute screen cast game mode appName=" + m75945x2fec8307 + " pkgName=" + str + " isInstalled=" + b17);
        if (!(str.length() > 0) || b17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.rc rcVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.rc(b8Var.m80379x76847179(), null, 2, null);
            rcVar.f198194m = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r7.f198898d;
            rcVar.f198192h = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s7(b8Var);
            rcVar.f198193i = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.u7(b8Var, z53Var);
            rcVar.w();
            ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).mj(5);
            return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184206b == 18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184205a.b(7);
        }
        db5.e1.A(b8Var.m80379x76847179(), b8Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f3_, m75945x2fec8307), "", b8Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), b8Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p7(b8Var, z53Var), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.q7.f198879d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar3 = b8Var.f198470e;
        if (lVar3 == null || (zVar = (yf2.z) lVar3.U0(yf2.z.class)) == null) {
            return;
        }
        zVar.a7(true);
    }

    public final void R6() {
        yf2.z0 z0Var;
        android.content.Intent intent;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar;
        yf2.z0 z0Var2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "afterSelectTagOperation");
        gk2.e eVar = this.f198477o;
        if (eVar != null) {
            if (Y6() && (lVar = this.f198470e) != null && (z0Var2 = (yf2.z0) lVar.U0(yf2.z0.class)) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(z0Var2, null, null, new yf2.y0(z0Var2, null), 3, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar2 = this.f198470e;
            if (lVar2 == null || (z0Var = (yf2.z0) lVar2.U0(yf2.z0.class)) == null) {
                return;
            }
            boolean z17 = !Y6();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostLocationWidget", "#setIsCanSelectNone isCanSelectNone=" + z17);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = z0Var.N6();
            if (N6 == null || (intent = N6.getIntent()) == null) {
                return;
            }
            intent.putExtra("poi_show_none", z17);
        }
    }

    public final void S6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "checkState state:" + this.f198479q);
        if (this.f198479q == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.d6.f198567d) {
            android.view.View view = this.f198475m;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostUIC", "checkState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostUIC", "checkState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f198475m;
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostUIC", "checkState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostUIC", "checkState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u70 T6() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u70) ((jz5.n) this.f198482t).mo141623x754a37bb();
    }

    public final ya2.b2 U6() {
        gk2.e eVar = this.f198477o;
        if (eVar != null) {
            return ((mm2.c1) eVar.a(mm2.c1.class)).J4;
        }
        return null;
    }

    public final void V6(int i17) {
        yg2.b bVar;
        yl2.g1 g1Var = this.f198485w;
        if (g1Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "handleBlockedAuth: liveVerify error, errCode=" + i17);
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        if (eVar == null || (bVar = eVar.f354008i) == null) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.l.d(bVar, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.t6(g1Var, i17, null), 3, null);
    }

    public final boolean W6() {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var;
        zl2.r4 r4Var = zl2.r4.f555483a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f198470e;
        return r4Var.T1((lVar == null || (j2Var = ((mm2.g1) lVar.P0(mm2.g1.class)).f410601f) == null) ? null : (r45.q12) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb());
    }

    public final boolean X6() {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var;
        r45.n73 n73Var;
        r45.z53 z53Var;
        java.util.LinkedList m75941xfb821914;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var2;
        zl2.r4 r4Var = zl2.r4.f555483a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f198470e;
        java.lang.Object obj = null;
        if (!r4Var.T1((lVar == null || (j2Var2 = ((mm2.g1) lVar.P0(mm2.g1.class)).f410601f) == null) ? null : (r45.q12) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var2).mo144003x754a37bb())) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar2 = this.f198470e;
        if (lVar2 != null && (j2Var = ((mm2.g1) lVar2.P0(mm2.g1.class)).f410604i) != null && (n73Var = (r45.n73) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb()) != null && (z53Var = (r45.z53) n73Var.m75936x14adae67(1)) != null && (m75941xfb821914 = z53Var.m75941xfb821914(19)) != null) {
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                java.lang.Integer num = (java.lang.Integer) next;
                if (num != null && num.intValue() == 3) {
                    obj = next;
                    break;
                }
            }
            obj = (java.lang.Integer) obj;
        }
        return obj != null;
    }

    public final boolean Y6() {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var;
        r45.fd2 fd2Var;
        gk2.e eVar = this.f198477o;
        return (eVar == null || (j2Var = ((mm2.g1) eVar.a(mm2.g1.class)).f410605m) == null || (fd2Var = (r45.fd2) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb()) == null || fd2Var.m75939xb282bd08(5) != 1) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x011d, code lost:
    
        if ((r3 != null && r3.T6()) != false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x00ec, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:
    
        if (r3 == 1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x00ea, code lost:
    
        if (r10 != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ee, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0330  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Z6() {
        /*
            Method dump skipped, instructions count: 1127
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8.Z6():void");
    }

    public final void a7() {
        yf2.z zVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f198470e;
        if (lVar == null || (zVar = (yf2.z) lVar.U0(yf2.z.class)) == null) {
            return;
        }
        zVar.a7(true);
    }

    public final void b7(yz5.a aVar) {
        yg2.b bVar;
        yl2.g1 g1Var = this.f198485w;
        if (g1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLivePostUIC", "refreshUserFlagAndHandle: postHelper is null, skip check");
            aVar.mo152xb9724478();
            return;
        }
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null && (bVar = eVar.f354008i) != null) {
            p3325xe03a0797.p3326xc267989b.l.d(bVar, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c7(g1Var, aVar, null), 3, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLivePostUIC", "refreshUserFlagAndHandle: liveScope is null, skip check");
            aVar.mo152xb9724478();
        }
    }

    public final void c7(boolean z17) {
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((qm2.u) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(qm2.u.class)).O6(z17);
    }

    public final void d7(yf2.j2 j2Var, yl2.m mVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f198470e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.f7 f7Var = null;
        yf2.s0 s0Var = lVar != null ? (yf2.s0) lVar.U0(yf2.s0.class) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "showLicenseBottomSheet: showMode=" + j2Var + ", authReq=" + mVar);
        if (s0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.d7 d7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.d7(this);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e7 e7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e7.f198611d;
            if (j2Var == yf2.j2.f543265f && mVar != null) {
                f7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.f7(this, mVar);
            }
            s0Var.g7(d7Var, e7Var, f7Var, j2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x018a, code lost:
    
        if (r5 == false) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e7() {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8.e7():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x03c2, code lost:
    
        if ((r0 != null && r0.Y6()) != false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0189, code lost:
    
        if (r9.f446249b < ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.K4).mo141623x754a37bb()).r()).intValue()) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h7() {
        /*
            Method dump skipped, instructions count: 987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8.h7():void");
    }

    public final void i7() {
        pk2.j9 j9Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e5 e5Var;
        yf2.m1 m1Var;
        dk2.ef efVar = dk2.ef.f314905a;
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        if (e1Var != null && e1Var.Y6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "Auto filling chat live params:");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f198470e;
            if (lVar != null && (m1Var = (yf2.m1) lVar.U0(yf2.m1.class)) != null) {
                r45.q12 q12Var = new r45.q12();
                q12Var.set(0, 1);
                q12Var.set(1, 1);
                m1Var.e7(q12Var);
            }
            gk2.e eVar = this.f198477o;
            if (eVar != null) {
                int i17 = (int) ((mm2.c1) eVar.a(mm2.c1.class)).f410399q;
                java.util.regex.Pattern pattern = pm0.v.f438335a;
                int i18 = i17 | 64;
                ((mm2.c1) eVar.a(mm2.c1.class)).p8(i18);
                long m75942xfb822ef2 = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
                long j17 = ((mm2.e1) eVar.a(mm2.e1.class)).f410516m;
                dk2.xf k17 = efVar.k(eVar);
                if (k17 != null) {
                    dk2.xf.e(k17, m75942xfb822ef2, j17, i18, 0, false, null, 32, null);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "Link mic enabled by default, flag changed from " + i17 + " to " + i18);
            }
            java.lang.String string = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.opq);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            mm2.g1 g1Var = (mm2.g1) efVar.i(mm2.g1.class);
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = g1Var != null ? g1Var.f410609q : null;
            if (j2Var != null) {
                ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).k(string);
            }
            mm2.g1 g1Var2 = (mm2.g1) efVar.i(mm2.g1.class);
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var2 = g1Var2 != null ? g1Var2.f410610r : null;
            if (j2Var2 != null) {
                ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var2).k("");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "Description updated: ".concat(string));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "Chat live params auto-filled successfully");
        }
        h7();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pk2.o9 o9Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s5) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s5.class)).f198927d;
        if (o9Var == null || (j9Var = o9Var.f437617g) == null || (e5Var = j9Var.f437419b) == null) {
            return;
        }
        e5Var.f199759a.i();
        e5Var.f199760b.f199536J = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "onActivityResult requestCode:" + i17 + ", resultCode:" + i18);
        if (i18 == -1 && i17 == 1003) {
            boolean z17 = false;
            if (intent != null && intent.getBooleanExtra("KEY_START_LIVE", false)) {
                z17 = true;
            }
            if (!z17) {
                R6();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "onActivityResult REQUEST_CODE_SELECT_TAG startLive by selected tag result");
                h7();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        gm0.j1.d().a(5874, this);
        rh2.j jVar = rh2.j.f477187a;
        ((ku5.t0) ku5.t0.f394148d).r(rh2.i.f477186d, "kws-prefetch");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        yf2.z0 z0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f198470e;
        if (lVar != null && (z0Var = (yf2.z0) lVar.U0(yf2.z0.class)) != null) {
            z0Var.f543358n = true;
        }
        gm0.j1.d().q(5874, this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.C13675x4cedeef6 c13675x4cedeef6 = this.f198483u;
        if (c13675x4cedeef6 != null) {
            c13675x4cedeef6.mo48814x2efc64();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onRequestPermissionsResult */
    public void mo2282x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        super.mo2282x953457f1(i17, permissions, grantResults);
        if (i17 == 80) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "onRequestPermissionsResult microphone granted");
                e7();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "FinderLive request permission " + i17 + " failed");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(m80379x76847179());
            u1Var.u(m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573281e42));
            u1Var.g(m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573280e41));
            u1Var.n(m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573279e40));
            u1Var.l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.g7.f198649a);
            u1Var.q(false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        gk2.e eVar;
        dk2.p Z6;
        java.util.ArrayList arrayList;
        java.lang.Object obj;
        gk2.e eVar2;
        dk2.p Z62;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h8 h8Var;
        te2.j0 j0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h8 h8Var2;
        te2.j0 j0Var2;
        android.widget.RelativeLayout relativeLayout = this.f198472g;
        if (relativeLayout != null) {
            relativeLayout.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a7(this));
        }
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
        if ((c1Var != null && c1Var.a8()) || (eVar = this.f198477o) == null || (Z6 = ((mm2.c1) eVar.a(mm2.c1.class)).Z6()) == null || (arrayList = Z6.f315410f) == null) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((dk2.vg) obj).f315788b == 2) {
                    break;
                }
            }
        }
        dk2.vg vgVar = (dk2.vg) obj;
        if (vgVar == null || (eVar2 = this.f198477o) == null || (Z62 = ((mm2.c1) eVar2.a(mm2.c1.class)).Z6()) == null) {
            return;
        }
        int i17 = Z62.f315408d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var != null && (h8Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h8) k0Var.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h8.class)) != null && (j0Var2 = h8Var2.f194318q) != null) {
            ((te2.p1) j0Var2).p(vgVar, i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var2 = dk2.ef.f314913e;
        if (k0Var2 == null || (h8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h8) k0Var2.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h8.class)) == null || (j0Var = h8Var.f194318q) == null) {
            return;
        }
        te2.j0.N4(j0Var, null, 1, null);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        super.mo2286xb05099c3();
        if (!this.f198478p) {
            gk2.e eVar = this.f198477o;
            boolean z17 = false;
            if (!(eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).a8())) {
                mm2.e1 e1Var = (mm2.e1) dk2.ef.f314905a.i(mm2.e1.class);
                if (e1Var != null && e1Var.Y6()) {
                    z17 = true;
                }
                if (z17) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStart: auto-starting chat mode, isStartingLiveChat=");
                    sb6.append(this.f198478p);
                    sb6.append(", isLiveStarted=");
                    gk2.e eVar2 = this.f198477o;
                    sb6.append(eVar2 != null ? java.lang.Boolean.valueOf(((mm2.c1) eVar2.a(mm2.c1.class)).a8()) : null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", sb6.toString());
                    this.f198478p = true;
                    i7();
                    return;
                }
            }
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onStart: skip auto-start, isStartingLiveChat=");
        sb7.append(this.f198478p);
        sb7.append(", isLiveStarted=");
        gk2.e eVar3 = this.f198477o;
        sb7.append(eVar3 != null ? java.lang.Boolean.valueOf(((mm2.c1) eVar3.a(mm2.c1.class)).a8()) : null);
        sb7.append(", isChatInteractionMode=");
        mm2.e1 e1Var2 = (mm2.e1) dk2.ef.f314905a.i(mm2.e1.class);
        sb7.append(e1Var2 != null ? java.lang.Boolean.valueOf(e1Var2.Y6()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", sb7.toString());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        dk2.p Z6;
        java.util.ArrayList arrayList;
        gk2.e eVar;
        dk2.p Z62;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h8 h8Var;
        te2.j0 j0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h8 h8Var2;
        te2.j0 j0Var2;
        super.mo2287xc39f8281();
        gk2.e eVar2 = this.f198477o;
        if (eVar2 != null && ((mm2.c1) eVar2.a(mm2.c1.class)).f410311a5) {
            gk2.e eVar3 = this.f198477o;
            if ((eVar3 == null || ((mm2.e1) eVar3.a(mm2.e1.class)).f7()) ? false : true) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
                java.lang.Object obj = null;
                if (k0Var != null && (h8Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h8) k0Var.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h8.class)) != null && (j0Var2 = h8Var2.f194318q) != null) {
                    qo0.c.a(((te2.p1) j0Var2).f499821f, qo0.b.f446925o2, null, 2, null);
                }
                gk2.e eVar4 = this.f198477o;
                if (eVar4 == null || (Z6 = ((mm2.c1) eVar4.a(mm2.c1.class)).Z6()) == null || (arrayList = Z6.f315410f) == null) {
                    return;
                }
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (((dk2.vg) next).f315788b == 1) {
                        obj = next;
                        break;
                    }
                }
                dk2.vg vgVar = (dk2.vg) obj;
                if (vgVar == null || (eVar = this.f198477o) == null || (Z62 = ((mm2.c1) eVar.a(mm2.c1.class)).Z6()) == null) {
                    return;
                }
                int i17 = Z62.f315408d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var2 = dk2.ef.f314913e;
                if (k0Var2 == null || (h8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h8) k0Var2.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h8.class)) == null || (j0Var = h8Var.f194318q) == null) {
                    return;
                }
                ((te2.p1) j0Var).i(vgVar, i17);
            }
        }
    }
}
