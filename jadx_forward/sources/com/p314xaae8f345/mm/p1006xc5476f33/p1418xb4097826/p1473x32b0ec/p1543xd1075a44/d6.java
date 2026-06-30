package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class d6 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f199592a;

    /* renamed from: b, reason: collision with root package name */
    public final qo0.c f199593b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f199594c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f199595d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f199596e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f199597f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f199598g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f199599h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f199600i;

    /* renamed from: j, reason: collision with root package name */
    public r45.yq1 f199601j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.FrameLayout f199602k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f199603l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f199604m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f199605n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f199606o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c f199607p;

    /* renamed from: q, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f199608q;

    /* renamed from: r, reason: collision with root package name */
    public hq0.e0 f199609r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f199610s;

    public d6(android.content.Context context, android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f199592a = root;
        this.f199593b = statusMonitor;
        this.f199594c = basePlugin;
        this.f199595d = "Finder.FinderLiveAnchorGameWidget";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f199600i = arrayList;
        this.f199604m = true;
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.ejr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f199606o = findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.f564544u8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById2;
        this.f199608q = c1163xf1deaba4;
        c1163xf1deaba4.m7965x440a0e9(30);
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.f564539u3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f199607p = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c) findViewById3;
        android.view.View findViewById4 = root.findViewById(com.p314xaae8f345.mm.R.id.f564540u4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f199610s = findViewById4;
        this.f199596e = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.f564543u7);
        this.f199597f = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.f564541u5);
        this.f199598g = (android.widget.FrameLayout) root.findViewById(com.p314xaae8f345.mm.R.id.f564542u6);
        this.f199602k = (android.widget.FrameLayout) root.findViewById(com.p314xaae8f345.mm.R.id.f564537u1);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = this.f199607p;
        if (c22613xe7040d9c == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
            throw null;
        }
        c22613xe7040d9c.m81307xf9cef5a7(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t5(this));
        android.view.View view = this.f199606o;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u5(this));
        android.widget.TextView textView = this.f199596e;
        if (textView != null) {
            ym5.a1.h(textView, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v5(this));
        }
        android.view.View view2 = this.f199606o;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        view2.setOnClickListener(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m5.f200574d);
        android.widget.FrameLayout frameLayout = this.f199602k;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n5(this));
        }
        android.view.View view3 = this.f199610s;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptySpace");
            throw null;
        }
        view3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o5(this));
        android.widget.TextView textView2 = this.f199596e;
        if (textView2 != null) {
            textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p5(this, context));
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget$5
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                if (type == 1) {
                    return new cm2.n();
                }
                if (type != 0 && type == 2) {
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6.this.g()) {
                        r45.xq1 xq1Var = ((mm2.c1) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6.this.f199594c.S0().a(mm2.c1.class)).C2;
                        i95.m c17 = i95.n0.c(ml2.j0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        zy2.zb zbVar = (zy2.zb) c17;
                        ml2.z4 z4Var = ml2.z4.A1;
                        cl0.g gVar = new cl0.g();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 d6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6.this;
                        gVar.o("result", 5);
                        gVar.h("appid", xq1Var != null ? xq1Var.m75945x2fec8307(2) : null);
                        zl2.r4 r4Var = zl2.r4.f555483a;
                        r45.a83 a83Var = ((mm2.c1) d6Var.f199594c.P0(mm2.c1.class)).f410361j6;
                        gVar.o("game_type", r4Var.j3(a83Var != null ? a83Var.m75939xb282bd08(2) : 0));
                        gVar.h("team_type", xq1Var != null ? java.lang.Integer.valueOf(xq1Var.m75939xb282bd08(1)) : null);
                        zy2.zb.y6(zbVar, z4Var, gVar.toString(), null, 4, null);
                    } else {
                        r45.n73 n73Var = (r45.n73) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6.this.f199594c.P0(mm2.g1.class)).f410604i).mo144003x754a37bb();
                        r45.z53 z53Var = n73Var != null ? (r45.z53) n73Var.m75936x14adae67(1) : null;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184205a;
                        cl0.g gVar2 = new cl0.g();
                        gVar2.o("result", 5);
                        gVar2.h("appid", z53Var != null ? z53Var.m75945x2fec8307(0) : null);
                        gVar2.o("game_type", 2 - (z53Var != null ? z53Var.m75939xb282bd08(13) : 0));
                        gVar2.h("team_type", z53Var != null ? java.lang.Integer.valueOf(z53Var.m75939xb282bd08(12)) : null);
                        x2Var.c(22, gVar2);
                    }
                    return new cm2.q();
                }
                return new cm2.o();
            }
        }, arrayList, false);
        c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q5(this);
        this.f199599h = c22848x6ddd90cf;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f199608q;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameTogetherRv");
            throw null;
        }
        c1163xf1deaba42.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f199608q;
        if (c1163xf1deaba43 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameTogetherRv");
            throw null;
        }
        c1163xf1deaba43.mo7960x6cab2c8d(c22848x6ddd90cf);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = this.f199608q;
        if (c1163xf1deaba44 != null) {
            c1163xf1deaba44.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r5(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameTogetherRv");
            throw null;
        }
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 d6Var) {
        r45.y63 y63Var;
        java.util.LinkedList m75941xfb821914;
        java.lang.String str = d6Var.f199595d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "insertGameWidget");
        d6Var.i();
        r45.yq1 yq1Var = d6Var.f199601j;
        if (yq1Var == null || (y63Var = (r45.y63) yq1Var.m75936x14adae67(0)) == null || (m75941xfb821914 = y63Var.m75941xfb821914(0)) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "insertGameWidget is null: false, size: " + arrayList.size() + ' ');
                boolean isEmpty = arrayList.isEmpty() ^ true;
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = d6Var.f199599h;
                java.util.ArrayList arrayList2 = d6Var.f199600i;
                if (isEmpty) {
                    int size = arrayList2.size();
                    arrayList2.addAll(arrayList);
                    if (c22848x6ddd90cf != null) {
                        c22848x6ddd90cf.m8153xd399a4d9(size, arrayList.size());
                    }
                }
                if (d6Var.f199604m) {
                    return;
                }
                r45.yq1 yq1Var2 = d6Var.f199601j;
                arrayList2.add(new cm2.p(0, null, null, null, null, yq1Var2 != null ? yq1Var2.m75945x2fec8307(3) : null, 30, null));
                if (c22848x6ddd90cf != null) {
                    c22848x6ddd90cf.m8149x8b456734(arrayList2.size());
                    return;
                }
                return;
            }
            r45.x63 x63Var = (r45.x63) it.next();
            hq0.e0 e0Var = d6Var.f199609r;
            if (e0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameDynamicCardFrameSetRoot");
                throw null;
            }
            arrayList.add(new cm2.p(1, x63Var, e0Var, null, null, null, 56, null));
        }
    }

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 d6Var) {
        r45.xq1 xq1Var;
        java.util.ArrayList arrayList;
        android.widget.TextView textView;
        r45.y63 y63Var;
        java.util.LinkedList<r45.x63> m75941xfb821914;
        java.lang.String str = d6Var.f199595d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "refreshWidget");
        java.util.ArrayList arrayList2 = d6Var.f199600i;
        int size = arrayList2.size();
        arrayList2.clear();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = d6Var.f199599h;
        if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.m8154xdb81fc7f(0, size);
        }
        if (d6Var.g()) {
            xq1Var = ((mm2.c1) d6Var.f199594c.S0().a(mm2.c1.class)).C2;
        } else {
            r45.yq1 yq1Var = d6Var.f199601j;
            xq1Var = yq1Var != null ? (r45.xq1) yq1Var.m75936x14adae67(2) : null;
        }
        r45.yq1 yq1Var2 = d6Var.f199601j;
        if (yq1Var2 == null || (y63Var = (r45.y63) yq1Var2.m75936x14adae67(0)) == null || (m75941xfb821914 = y63Var.m75941xfb821914(0)) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
            for (r45.x63 x63Var : m75941xfb821914) {
                hq0.e0 e0Var = d6Var.f199609r;
                if (e0Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameDynamicCardFrameSetRoot");
                    throw null;
                }
                arrayList.add(new cm2.p(1, x63Var, e0Var, null, null, null, 56, null));
            }
        }
        d6Var.i();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isLiving: ");
        sb6.append(d6Var.g());
        sb6.append(", playTogetherInfo: ");
        sb6.append(d6Var.f199601j != null);
        sb6.append(", gameInfo: ");
        sb6.append(arrayList != null);
        sb6.append(", size: ");
        sb6.append(arrayList != null ? arrayList.size() : 0);
        sb6.append(" teamInfo is null : ");
        sb6.append(xq1Var == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if ((arrayList != null ? arrayList.size() : 0) > 0 || d6Var.c()) {
            d6Var.d();
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
            }
            if (!d6Var.f199604m) {
                r45.yq1 yq1Var3 = d6Var.f199601j;
                arrayList2.add(new cm2.p(0, null, null, null, null, yq1Var3 != null ? yq1Var3.m75945x2fec8307(3) : null, 30, null));
            }
            if (c22848x6ddd90cf != null) {
                c22848x6ddd90cf.m8146xced61ae5();
            }
            if ((arrayList != null ? arrayList.size() : 0) == 0) {
                d6Var.l();
                return;
            }
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("wording: ");
        r45.yq1 yq1Var4 = d6Var.f199601j;
        sb7.append(yq1Var4 != null ? yq1Var4.m75945x2fec8307(3) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7.toString());
        r45.yq1 yq1Var5 = d6Var.f199601j;
        java.lang.String m75945x2fec8307 = yq1Var5 != null ? yq1Var5.m75945x2fec8307(3) : null;
        if (((m75945x2fec8307 == null || m75945x2fec8307.length() == 0) ? 1 : 0) == 0 && (textView = d6Var.f199597f) != null) {
            r45.yq1 yq1Var6 = d6Var.f199601j;
            textView.setText(yq1Var6 != null ? yq1Var6.m75945x2fec8307(3) : null);
        }
        d6Var.k();
    }

    public static void h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 d6Var, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        r45.z53 z53Var;
        boolean z19 = (i17 & 1) != 0 ? false : z17;
        boolean z27 = (i17 & 2) != 0 ? false : z18;
        d6Var.getClass();
        java.lang.String str = null;
        if (!z27) {
            d6Var.f199603l = null;
            d6Var.f199604m = true;
            d6Var.f199605n = false;
        }
        if (!z19 && !z27) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = d6Var.f199607p;
            if (c22613xe7040d9c == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
                throw null;
            }
            if (!c22613xe7040d9c.isShowing) {
                c22613xe7040d9c.f();
            }
            android.widget.TextView textView = d6Var.f199597f;
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.widget.FrameLayout frameLayout = d6Var.f199598g;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            android.widget.TextView textView2 = d6Var.f199596e;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        d6Var.f199605n = true;
        boolean g17 = d6Var.g();
        android.view.ViewGroup viewGroup = d6Var.f199592a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = d6Var.f199594c;
        if (g17) {
            pq5.g l17 = new ke2.u(((mm2.e1) lVar.P0(mm2.e1.class)).f410516m, ((mm2.e1) lVar.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0), com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(((mm2.e1) lVar.P0(mm2.e1.class)).f410518o), ((mm2.e1) lVar.P0(mm2.e1.class)).f410525v, 1, d6Var.f199603l, z27).l();
            l17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x5(d6Var, z27, z19));
            android.content.Context context = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context);
        } else {
            r45.n73 n73Var = (r45.n73) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) lVar.P0(mm2.g1.class)).f410604i).mo144003x754a37bb();
            if (n73Var != null && (z53Var = (r45.z53) n73Var.m75936x14adae67(1)) != null) {
                str = z53Var.m75945x2fec8307(0);
            }
            if (str == null) {
                str = "";
            }
            pq5.g l18 = new ke2.y(str, 0, true, d6Var.f199603l, z27, null, 32, null).l();
            l18.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w5(d6Var, z27, z19));
            android.content.Context context2 = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l18.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2);
        }
        if (!d6Var.g()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184205a;
            cl0.g gVar = new cl0.g();
            gVar.o("result", 1);
            x2Var.c(22, gVar);
            return;
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.A1;
        cl0.g gVar2 = new cl0.g();
        gVar2.o("result", 1);
        zy2.zb.y6(zbVar, z4Var, gVar2.toString(), null, 4, null);
    }

    public final boolean c() {
        r45.xq1 xq1Var;
        java.util.LinkedList m75941xfb821914;
        r45.t63 t63Var;
        java.util.LinkedList m75941xfb8219142;
        if (g()) {
            xq1Var = ((mm2.c1) this.f199594c.S0().a(mm2.c1.class)).C2;
        } else {
            r45.yq1 yq1Var = this.f199601j;
            xq1Var = yq1Var != null ? (r45.xq1) yq1Var.m75936x14adae67(2) : null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canShowTeamWidget, isLiving: ");
        sb6.append(g());
        sb6.append(", notNull: ");
        sb6.append((xq1Var != null ? (r45.t63) xq1Var.m75936x14adae67(0) : null) != null);
        sb6.append(", size: ");
        sb6.append((xq1Var == null || (t63Var = (r45.t63) xq1Var.m75936x14adae67(0)) == null || (m75941xfb8219142 = t63Var.m75941xfb821914(0)) == null) ? 0 : m75941xfb8219142.size());
        sb6.append(", setting: ");
        sb6.append(xq1Var != null ? java.lang.Integer.valueOf(xq1Var.m75939xb282bd08(1)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f199595d, sb6.toString());
        if ((xq1Var != null ? (r45.t63) xq1Var.m75936x14adae67(0) : null) == null) {
            return false;
        }
        r45.t63 t63Var2 = (r45.t63) xq1Var.m75936x14adae67(0);
        return ((t63Var2 == null || (m75941xfb821914 = t63Var2.m75941xfb821914(0)) == null) ? 0 : m75941xfb821914.size()) > 0 && xq1Var.m75939xb282bd08(1) != 0;
    }

    public final void d() {
        r45.xq1 xq1Var;
        if (g()) {
            xq1Var = ((mm2.c1) this.f199594c.S0().a(mm2.c1.class)).C2;
        } else {
            r45.yq1 yq1Var = this.f199601j;
            xq1Var = yq1Var != null ? (r45.xq1) yq1Var.m75936x14adae67(2) : null;
        }
        r45.xq1 xq1Var2 = xq1Var;
        if (c()) {
            this.f199600i.add(0, new cm2.p(2, null, null, xq1Var2, null, null, 54, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if ((r1 == null || r1.length() == 0) == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r4 = this;
            r45.yq1 r0 = r4.f199601j
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Ld
            com.tencent.mm.protobuf.f r0 = r0.m75936x14adae67(r2)
            r45.en6 r0 = (r45.en6) r0
            goto Le
        Ld:
            r0 = r1
        Le:
            if (r0 == 0) goto L6c
            r45.yq1 r0 = r4.f199601j
            if (r0 == 0) goto L24
            com.tencent.mm.protobuf.f r0 = r0.m75936x14adae67(r2)
            r45.en6 r0 = (r45.en6) r0
            if (r0 == 0) goto L24
            r3 = 2
            com.tencent.mm.protobuf.f r0 = r0.m75936x14adae67(r3)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) r0
            goto L25
        L24:
            r0 = r1
        L25:
            r3 = 0
            if (r0 != 0) goto L46
            r45.yq1 r0 = r4.f199601j
            if (r0 == 0) goto L38
            com.tencent.mm.protobuf.f r0 = r0.m75936x14adae67(r2)
            r45.en6 r0 = (r45.en6) r0
            if (r0 == 0) goto L38
            java.lang.String r1 = r0.m75945x2fec8307(r3)
        L38:
            if (r1 == 0) goto L43
            int r0 = r1.length()
            if (r0 != 0) goto L41
            goto L43
        L41:
            r0 = r3
            goto L44
        L43:
            r0 = r2
        L44:
            if (r0 != 0) goto L6c
        L46:
            android.widget.TextView r0 = r4.f199596e
            if (r0 != 0) goto L4b
            goto L4e
        L4b:
            r0.setVisibility(r3)
        L4e:
            android.widget.TextView r0 = r4.f199596e
            if (r0 != 0) goto L53
            goto L76
        L53:
            r45.yq1 r1 = r4.f199601j
            if (r1 == 0) goto L66
            com.tencent.mm.protobuf.f r1 = r1.m75936x14adae67(r2)
            r45.en6 r1 = (r45.en6) r1
            if (r1 == 0) goto L66
            java.lang.String r1 = r1.m75945x2fec8307(r2)
            if (r1 == 0) goto L66
            goto L68
        L66:
            java.lang.String r1 = ""
        L68:
            r0.setText(r1)
            goto L76
        L6c:
            android.widget.TextView r0 = r4.f199596e
            if (r0 != 0) goto L71
            goto L76
        L71:
            r1 = 8
            r0.setVisibility(r1)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6.e():void");
    }

    public final int f(int i17, java.util.List list) {
        java.util.Iterator it = list.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            if (((r45.u24) it.next()).m75939xb282bd08(1) == i17) {
                return i18;
            }
            i18++;
        }
        return -1;
    }

    public final boolean g() {
        return dk2.ef.f314905a.x();
    }

    public final void i() {
        r45.y63 y63Var;
        java.util.LinkedList m75941xfb821914;
        r45.y63 y63Var2;
        java.util.LinkedList m75941xfb8219142;
        r45.en6 en6Var;
        r45.xq1 xq1Var;
        r45.t63 t63Var;
        java.util.LinkedList m75941xfb8219143;
        r45.xq1 xq1Var2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("teamInfo: isnull: ");
        r45.yq1 yq1Var = this.f199601j;
        int i17 = 0;
        sb6.append((yq1Var != null ? (r45.xq1) yq1Var.m75936x14adae67(2) : null) == null);
        sb6.append(", lastJoin: ");
        r45.yq1 yq1Var2 = this.f199601j;
        sb6.append((yq1Var2 == null || (xq1Var2 = (r45.xq1) yq1Var2.m75936x14adae67(2)) == null) ? null : java.lang.Integer.valueOf(xq1Var2.m75939xb282bd08(1)));
        sb6.append(", size: ");
        r45.yq1 yq1Var3 = this.f199601j;
        sb6.append((yq1Var3 == null || (xq1Var = (r45.xq1) yq1Var3.m75936x14adae67(2)) == null || (t63Var = (r45.t63) xq1Var.m75936x14adae67(0)) == null || (m75941xfb8219143 = t63Var.m75941xfb821914(0)) == null) ? null : java.lang.Integer.valueOf(m75941xfb8219143.size()));
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f199595d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("cornerInfo: wording");
        r45.yq1 yq1Var4 = this.f199601j;
        sb8.append((yq1Var4 == null || (en6Var = (r45.en6) yq1Var4.m75936x14adae67(1)) == null) ? null : en6Var.m75945x2fec8307(1));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb8.toString());
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("bottomWording: ");
        r45.yq1 yq1Var5 = this.f199601j;
        sb9.append(yq1Var5 != null ? yq1Var5.m75945x2fec8307(3) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb9.toString());
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("playTogetherList: ");
        r45.yq1 yq1Var6 = this.f199601j;
        sb10.append((yq1Var6 != null ? (r45.y63) yq1Var6.m75936x14adae67(0) : null) == null);
        sb10.append(", itemList size: ");
        r45.yq1 yq1Var7 = this.f199601j;
        sb10.append((yq1Var7 == null || (y63Var2 = (r45.y63) yq1Var7.m75936x14adae67(0)) == null || (m75941xfb8219142 = y63Var2.m75941xfb821914(0)) == null) ? null : java.lang.Integer.valueOf(m75941xfb8219142.size()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb10.toString());
        r45.yq1 yq1Var8 = this.f199601j;
        if (yq1Var8 == null || (y63Var = (r45.y63) yq1Var8.m75936x14adae67(0)) == null || (m75941xfb821914 = y63Var.m75941xfb821914(0)) == null) {
            return;
        }
        for (java.lang.Object obj : m75941xfb821914) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "index: " + i17 + ", item: " + ((r45.x63) obj).m75945x2fec8307(2));
            i17 = i18;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j() {
        r45.xq1 xq1Var;
        java.util.ArrayList arrayList;
        android.widget.TextView textView;
        r45.y63 y63Var;
        java.util.LinkedList<r45.x63> m75941xfb821914;
        java.lang.String str = this.f199595d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "resumeWidget");
        if (g()) {
            xq1Var = ((mm2.c1) this.f199594c.S0().a(mm2.c1.class)).C2;
        } else {
            r45.yq1 yq1Var = this.f199601j;
            xq1Var = yq1Var != null ? (r45.xq1) yq1Var.m75936x14adae67(2) : null;
        }
        r45.yq1 yq1Var2 = this.f199601j;
        if (yq1Var2 == null || (y63Var = (r45.y63) yq1Var2.m75936x14adae67(0)) == null || (m75941xfb821914 = y63Var.m75941xfb821914(0)) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
            for (r45.x63 x63Var : m75941xfb821914) {
                hq0.e0 e0Var = this.f199609r;
                if (e0Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameDynamicCardFrameSetRoot");
                    throw null;
                }
                arrayList.add(new cm2.p(1, x63Var, e0Var, null, null, null, 56, null));
            }
        }
        i();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isLiving: ");
        sb6.append(g());
        sb6.append(", playTogetherInfo: ");
        sb6.append(this.f199601j != null);
        sb6.append(", gameInfo: ");
        sb6.append(arrayList != null);
        sb6.append(", size: ");
        sb6.append(arrayList != null ? arrayList.size() : 0);
        sb6.append(" teamInfo is null : ");
        sb6.append(xq1Var == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        int size = arrayList != null ? arrayList.size() : 0;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f199599h;
        java.util.ArrayList arrayList2 = this.f199600i;
        if (size <= 0 && !c()) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("wording: ");
            r45.yq1 yq1Var3 = this.f199601j;
            sb7.append(yq1Var3 != null ? yq1Var3.m75945x2fec8307(3) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7.toString());
            r45.yq1 yq1Var4 = this.f199601j;
            java.lang.String m75945x2fec8307 = yq1Var4 != null ? yq1Var4.m75945x2fec8307(3) : null;
            if (((m75945x2fec8307 == null || m75945x2fec8307.length() == 0) ? 1 : 0) == 0 && (textView = this.f199597f) != null) {
                r45.yq1 yq1Var5 = this.f199601j;
                textView.setText(yq1Var5 != null ? yq1Var5.m75945x2fec8307(3) : null);
            }
            arrayList2.clear();
            if (c22848x6ddd90cf != null) {
                c22848x6ddd90cf.m8146xced61ae5();
            }
            k();
            return;
        }
        boolean c17 = c();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList2) {
            if ((((cm2.p) obj).f124906d == 1) != false) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        if ((arrayList != null ? arrayList.size() : 0) != size2) {
            arrayList2.clear();
            d();
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
            }
            if (!this.f199604m) {
                r45.yq1 yq1Var6 = this.f199601j;
                arrayList2.add(new cm2.p(0, null, null, null, null, yq1Var6 != null ? yq1Var6.m75945x2fec8307(3) : null, 30, null));
            }
            if (c22848x6ddd90cf != null) {
                c22848x6ddd90cf.m8146xced61ae5();
            }
        } else {
            java.util.Iterator it = arrayList2.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                } else if ((((cm2.p) it.next()).f124906d == 1) == true) {
                    break;
                } else {
                    i17++;
                }
            }
            if (arrayList != null) {
                for (java.lang.Object obj2 : arrayList) {
                    int i18 = r5 + 1;
                    if (r5 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    cm2.p pVar = (cm2.p) obj2;
                    while (((cm2.p) arrayList2.get(i17)).f124906d != 1 && i17 < arrayList2.size() - 1) {
                        i17++;
                    }
                    arrayList2.set(i17, pVar);
                    i17++;
                    r5 = i18;
                }
            }
            if (size2 > 0 && c22848x6ddd90cf != null) {
                c22848x6ddd90cf.m8152xc67946d3(c17 ? 1 : 0, size2, "checkDataChange");
            }
        }
        l();
    }

    public final void k() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = this.f199607p;
        if (c22613xe7040d9c == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
            throw null;
        }
        if (!c22613xe7040d9c.isShowing) {
            if (c22613xe7040d9c == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
                throw null;
            }
            c22613xe7040d9c.f();
        }
        android.widget.TextView textView = this.f199597f;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.FrameLayout frameLayout = this.f199598g;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        e();
    }

    public final void l() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = this.f199607p;
        if (c22613xe7040d9c == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
            throw null;
        }
        if (!c22613xe7040d9c.isShowing) {
            if (c22613xe7040d9c == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
                throw null;
            }
            c22613xe7040d9c.f();
        }
        android.widget.TextView textView = this.f199597f;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.FrameLayout frameLayout = this.f199598g;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        e();
    }
}
