package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class c4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g {
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xp A;
    public final on2.d B;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w4 C;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.l5 D;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v6 E;
    public final java.util.HashMap F;
    public final jz5.g G;
    public int H;
    public final java.util.List I;

    /* renamed from: v, reason: collision with root package name */
    public final qo0.c f193635v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f193636w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f193637x;

    /* renamed from: y, reason: collision with root package name */
    public final xt2.d f193638y;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s6 f193639z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor);
        jy2.b bVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.l5 l5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u4 u4Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f193635v = statusMonitor;
        this.f193636w = "Finder.FinderLiveAnchorBottomOptionPlugin";
        this.f193637x = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a4(root));
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.muu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        xt2.d dVar = new xt2.d((android.view.ViewGroup) findViewById, statusMonitor, this);
        this.f193638y = dVar;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.i2v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s6 s6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s6((android.view.ViewGroup) findViewById2, statusMonitor, this);
        this.f193639z = s6Var;
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.qxu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h40 h40Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h40((android.view.ViewGroup) findViewById3, statusMonitor, this);
        android.view.View findViewById4 = root.findViewById(com.p314xaae8f345.mm.R.id.f567548jv3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xp xpVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xp((android.view.ViewGroup) findViewById4, statusMonitor, this);
        this.A = xpVar;
        android.view.View findViewById5 = root.findViewById(com.p314xaae8f345.mm.R.id.tzs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i5 i5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i5((android.view.ViewGroup) findViewById5, statusMonitor, this);
        android.view.View findViewById6 = root.findViewById(com.p314xaae8f345.mm.R.id.j0u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o6 o6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o6((android.view.ViewGroup) findViewById6, statusMonitor, this);
        android.view.View findViewById7 = root.findViewById(com.p314xaae8f345.mm.R.id.iri);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.B = new on2.d((android.view.ViewGroup) findViewById7, statusMonitor, this);
        android.view.View findViewById8 = root.findViewById(com.p314xaae8f345.mm.R.id.er_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w4 w4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w4((android.view.ViewGroup) findViewById8, statusMonitor, this);
        this.C = w4Var;
        android.view.View findViewById9 = root.findViewById(com.p314xaae8f345.mm.R.id.f566546tx0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g5 g5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g5((android.view.ViewGroup) findViewById9, statusMonitor, this);
        android.view.View findViewById10 = root.findViewById(com.p314xaae8f345.mm.R.id.jyz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u4 u4Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u4((android.view.ViewGroup) findViewById10, statusMonitor, this);
        android.view.View findViewById11 = root.findViewById(com.p314xaae8f345.mm.R.id.eyy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.l5 l5Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.l5((android.view.ViewGroup) findViewById11, statusMonitor, this);
        this.D = l5Var2;
        android.view.View findViewById12 = root.findViewById(com.p314xaae8f345.mm.R.id.p96);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById12, "findViewById(...)");
        jy2.b bVar2 = new jy2.b((android.view.ViewGroup) findViewById12, statusMonitor, this);
        android.view.View findViewById13 = root.findViewById(com.p314xaae8f345.mm.R.id.jrk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById13, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v6 v6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v6((android.view.ViewGroup) findViewById13, statusMonitor, this);
        this.E = v6Var;
        this.F = kz5.c1.i(new jz5.l(16, dVar), new jz5.l(10, s6Var), new jz5.l(12, xpVar), new jz5.l(11, l5Var2), new jz5.l(5, w4Var), new jz5.l(1, v6Var), new jz5.l(18, h40Var), new jz5.l(8, u4Var2), new jz5.l(24, g5Var), new jz5.l(25, i5Var), new jz5.l(2, bVar2));
        this.G = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z3(root));
        android.view.ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int i17 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        if (!x0()) {
            if (!(sn0.b.f491497e2 != null)) {
                root.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w3(root, i17, this));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x3 x3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x3(this, root, i17);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.a1.u(root, x3Var);
        if (x0()) {
            bVar = bVar2;
            l5Var = l5Var2;
            u4Var = u4Var2;
        } else {
            bVar = bVar2;
            l5Var = l5Var2;
            u4Var = u4Var2;
            zl2.r4.o3(zl2.r4.f555483a, root, "Finder.FinderLiveAnchorBottomOptionPlugin", false, false, 12, null);
        }
        this.I = kz5.c0.i(w4Var, g5Var, dVar, s6Var, xpVar, h40Var, o6Var, u4Var, l5Var, i5Var, bVar);
    }

    @Override // qo0.a
    public void A0(int i17, int i18, android.content.Intent intent) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onActivityResult requestCode:");
        sb6.append(i17);
        sb6.append(",resultCode is ok:");
        sb6.append(i18 == -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193636w, sb6.toString());
        on2.d dVar = this.B;
        dVar.getClass();
        if (i17 == 1002 && i18 == -1) {
            java.lang.Integer valueOf = intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("KEY_PARAMS_LOTTERY_SOURCE", -1)) : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar.f428396g, "onActivityResult Source:" + valueOf);
            qo0.c.a(dVar.f428394e, qo0.b.f446906k3, null, 2, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.a(dVar.f428395f, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new on2.b(dVar, null), 2, null);
            if (valueOf == null) {
                return;
            }
            valueOf.intValue();
        }
    }

    public final void C1() {
        zl2.r4 r4Var = zl2.r4.f555483a;
        jz5.g gVar = this.G;
        android.content.Context context = ((android.view.ViewGroup) ((jz5.n) gVar).mo141623x754a37bb()).getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (r4Var.Y1(context)) {
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int childCount = ((android.view.ViewGroup) ((jz5.n) gVar).mo141623x754a37bb()).getChildCount();
        int i17 = 0;
        int i18 = 0;
        while (true) {
            if (i18 >= childCount) {
                break;
            }
            android.view.View childAt = ((android.view.ViewGroup) ((jz5.n) gVar).mo141623x754a37bb()).getChildAt(i18);
            android.view.View view = childAt.getVisibility() == 0 ? childAt : null;
            if (view != null) {
                linkedList.add(view);
            }
            i18++;
        }
        if (this.H != linkedList.size()) {
            this.H = linkedList.size();
            for (java.lang.Object obj : linkedList) {
                int i19 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                android.view.View view2 = (android.view.View) obj;
                if (i17 != 0) {
                    android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.setMargins(((java.lang.Number) ((jz5.n) this.f193637x).mo141623x754a37bb()).intValue(), marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                    } else {
                        marginLayoutParams = null;
                    }
                    view2.setLayoutParams(marginLayoutParams);
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    if (marginLayoutParams2 != null) {
                        marginLayoutParams2.setMargins(i65.a.f(this.f446856d.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                    } else {
                        marginLayoutParams2 = null;
                    }
                    view2.setLayoutParams(marginLayoutParams2);
                }
                i17 = i19;
            }
        }
    }

    public final void D1(android.content.Intent intent) {
        android.content.Intent intent2;
        android.view.ViewGroup viewGroup = this.f446856d;
        if (intent == null) {
            android.content.Context context = viewGroup.getContext();
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            intent = activity != null ? activity.getIntent() : null;
        }
        if ((intent != null ? intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0) : 0) == 7 && ((mm2.c1) P0(mm2.c1.class)).X2) {
            android.content.Context context2 = viewGroup.getContext();
            android.app.Activity activity2 = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
            if (activity2 != null && (intent2 = activity2.getIntent()) != null) {
                intent2.putExtra("KEY_PARAMS_DO_ACTION", 0);
            }
            this.E.k(null);
            zl2.r4.f555483a.e3();
        }
    }

    public final void E1() {
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.y3(this));
    }

    public final void F1() {
        if (((mm2.c1) P0(mm2.c1.class)).a8()) {
            this.A.f201900i = true;
            G1();
            K0(0);
            C1();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    public final void G1() {
        if (((mm2.c1) P0(mm2.c1.class)).X2) {
            D1(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v6 v6Var = this.E;
        if (v6Var.f201574f) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.I8((zy2.zb) c17, ml2.u1.f409631x0, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
            ll2.e.f400666a.j(v6Var.f201576h, false);
            v6Var.f201574f = false;
            gk2.e S0 = v6Var.f201573e.S0();
            if (S0 != null) {
                bf2.c.b(bf2.c.f101131a, S0, 1, 0, null, 0, 28, null);
            }
        }
        v6Var.f201572d.setVisibility(0);
    }

    public final void H1() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("anchor animate close def ");
        r45.ym1 ym1Var = ((mm2.c1) P0(mm2.c1.class)).f410364k4;
        sb6.append(ym1Var != null ? java.lang.Integer.valueOf(ym1Var.m75939xb282bd08(3)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveButtonChangeController", sb6.toString());
        r45.ym1 ym1Var2 = ((mm2.c1) P0(mm2.c1.class)).f410364k4;
        if ((ym1Var2 != null ? ym1Var2.m75939xb282bd08(3) : 0) > 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b4(this, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        jf2.u uVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 27) {
            this.E.getClass();
            return;
        }
        if (ordinal == 123) {
            this.A.f201900i = true;
        } else if (ordinal == 124 && (uVar = (jf2.u) U0(jf2.u.class)) != null) {
            jf2.u.a7(uVar, "liveModeChange", false, 2, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        pk2.d9 d9Var;
        super.O0();
        this.B.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.l5 l5Var = this.D;
        mm2.c1 c1Var = (mm2.c1) l5Var.f200433f.P0(mm2.c1.class);
        c1Var.f410366k6.mo7808x76db6cb1("");
        c1Var.f410338f6.mo7808x76db6cb1(java.lang.Boolean.FALSE);
        c1Var.f410344g6 = null;
        c1Var.f410372l6 = "";
        l5Var.f200431d.setVisibility(8);
        xt2.d dVar = this.f193638y;
        dVar.getClass();
        ll2.e.f400666a.e(dVar.f538205u, false);
        pk2.o9 o9Var = this.E.f201577i;
        if (o9Var == null || (d9Var = o9Var.f437615f) == null) {
            return;
        }
        d9Var.i();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void k1(android.content.Intent intent) {
        D1(intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void l1(android.os.Bundle bundle, java.lang.Object obj) {
        on2.d dVar = this.B;
        dVar.getClass();
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string != null ? string : "", "PORTRAIT_ACTION_GOTO_CREATE_LOTTERY")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = dVar.f428395f;
            java.lang.String str = ((mm2.e1) lVar.P0(mm2.e1.class)).f410525v;
            long m75942xfb822ef2 = ((mm2.e1) lVar.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
            long j17 = ((mm2.e1) lVar.P0(mm2.e1.class)).f410516m;
            java.lang.String str2 = ((mm2.c1) lVar.P0(mm2.c1.class)).f410385o;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpToCreateLotteryImpl root.context is activity:");
            android.view.ViewGroup viewGroup = dVar.f428393d;
            sb6.append(viewGroup.getContext() instanceof android.app.Activity);
            sb6.append(",liveId:");
            sb6.append(m75942xfb822ef2);
            sb6.append(",objectId:");
            sb6.append(j17);
            sb6.append(",nonceId:");
            sb6.append(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar.f428396g, sb6.toString());
            if (!(viewGroup.getContext() instanceof android.app.Activity) || m75942xfb822ef2 == 0 || j17 == 0) {
                return;
            }
            if (str.length() > 0) {
                if (((mm2.c1) lVar.P0(mm2.c1.class)).T) {
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).qj(1);
                }
                android.content.Context context = viewGroup.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("KEY_PARAMS_LOTTERY_SOURCE", 0);
                intent.putExtra("KEY_PARAMS_LIVE_ID", m75942xfb822ef2);
                intent.putExtra("KEY_PARAMS_OBJECT_ID", j17);
                intent.putExtra("KEY_PARAMS_NONCE_ID", str);
                intent.putExtra("KEY_PARAMS_ANCHOR_USERNAME", str2);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).sj((android.app.Activity) context, intent, 1002);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g
    public java.util.HashMap v1() {
        return this.F;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        jf2.u uVar;
        super.z0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.l5 l5Var = this.D;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = l5Var.f200433f;
        ((mm2.c1) lVar.S0().a(mm2.c1.class)).f410338f6.mo7806x9d92d11c(lVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.k5(l5Var));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : this.I) {
            if (obj instanceof jf2.h) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            jf2.h hVar = next instanceof jf2.h ? (jf2.h) next : null;
            if (hVar != null && (uVar = (jf2.u) U0(jf2.u.class)) != null) {
                java.util.LinkedList linkedList = uVar.f380933o;
                if (!linkedList.contains(hVar)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(uVar.f380931m, "registerEntrance = " + hVar);
                    linkedList.add(hVar);
                }
            }
        }
        jf2.u uVar2 = (jf2.u) U0(jf2.u.class);
        if (uVar2 != null) {
            jf2.u.a7(uVar2, this.f193636w + "-mount", false, 2, null);
        }
    }
}
