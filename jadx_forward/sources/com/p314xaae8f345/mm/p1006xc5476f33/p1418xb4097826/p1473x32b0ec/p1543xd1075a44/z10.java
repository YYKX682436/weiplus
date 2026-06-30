package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class z10 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f202025a;

    /* renamed from: b, reason: collision with root package name */
    public final qo0.c f202026b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f202027c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f202028d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f202029e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f202030f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f202031g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c f202032h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f202033i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f202034j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f202035k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.FrameLayout f202036l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f202037m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f202038n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f202039o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f202040p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f202041q;

    /* renamed from: r, reason: collision with root package name */
    public r45.yq1 f202042r;

    /* renamed from: s, reason: collision with root package name */
    public r45.fr1 f202043s;

    /* renamed from: t, reason: collision with root package name */
    public hq0.e0 f202044t;

    public z10(android.content.Context context, android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f202025a = root;
        this.f202026b = statusMonitor;
        this.f202027c = basePlugin;
        this.f202028d = "Finder.FinderLiveVisitorGameWidget";
        this.f202038n = true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f202041q = arrayList;
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.fpd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f202031g = findViewById;
        this.f202029e = (android.widget.FrameLayout) root.findViewById(com.p314xaae8f345.mm.R.id.f569128p45);
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.p47);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById2;
        this.f202030f = c1163xf1deaba4;
        c1163xf1deaba4.m7965x440a0e9(30);
        this.f202035k = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.f569127p44);
        this.f202034j = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.f569129p46);
        this.f202036l = (android.widget.FrameLayout) root.findViewById(com.p314xaae8f345.mm.R.id.p3z);
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.f569124p41);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f202032h = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c) findViewById3;
        android.view.View findViewById4 = root.findViewById(com.p314xaae8f345.mm.R.id.f569126p43);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f202033i = findViewById4;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = this.f202032h;
        if (c22613xe7040d9c == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
            throw null;
        }
        c22613xe7040d9c.m81307xf9cef5a7(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u10(this));
        android.view.View view = this.f202031g;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v10(this));
        android.view.View view2 = this.f202031g;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        view2.setOnClickListener(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n10.f200681d);
        android.widget.FrameLayout frameLayout = this.f202036l;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o10(this));
        }
        android.view.View view3 = this.f202033i;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptySpace");
            throw null;
        }
        view3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p10(this));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorGameTogetherWidget$4
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                r45.h41 h41Var;
                if (type == 1) {
                    return new cm2.n();
                }
                if (type != 2) {
                    if (type == 0) {
                        return new cm2.o();
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z10 z10Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z10.this;
                    return new cm2.s(z10Var.f202027c, z10Var.f202026b);
                }
                i95.m c17 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ml2.r0 r0Var = (ml2.r0) c17;
                ml2.b4 b4Var = ml2.b4.E;
                cl0.g gVar = new cl0.g();
                gVar.o("type", 32);
                java.lang.String gVar2 = gVar.toString();
                cl0.g gVar3 = new cl0.g();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z10 z10Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z10.this;
                gVar3.h("click_id", java.util.UUID.randomUUID().toString());
                zl2.r4 r4Var = zl2.r4.f555483a;
                r45.a83 a83Var = ((mm2.c1) z10Var2.f202027c.P0(mm2.c1.class)).f410361j6;
                gVar3.o("game_type", r4Var.j3(a83Var != null ? a83Var.m75939xb282bd08(2) : 0));
                r45.fr1 fr1Var = z10Var2.f202043s;
                gVar3.h("appid", (fr1Var == null || (h41Var = (r45.h41) fr1Var.m75936x14adae67(21)) == null) ? null : h41Var.m75945x2fec8307(0));
                ml2.r0.hj(r0Var, b4Var, gVar2, 0L, null, null, gVar3.toString(), null, null, 220, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z10 z10Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z10.this;
                return new cm2.s(z10Var3.f202027c, z10Var3.f202026b);
            }
        }, arrayList, false);
        c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q10(this);
        this.f202040p = c22848x6ddd90cf;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f202030f;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameTogetherRv");
            throw null;
        }
        c1163xf1deaba42.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f202030f;
        if (c1163xf1deaba43 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameTogetherRv");
            throw null;
        }
        c1163xf1deaba43.mo7960x6cab2c8d(c22848x6ddd90cf);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = this.f202030f;
        if (c1163xf1deaba44 != null) {
            c1163xf1deaba44.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r10(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameTogetherRv");
            throw null;
        }
    }

    public final boolean a() {
        int i17 = ((mm2.c1) this.f202027c.P0(mm2.c1.class)).H2;
        java.lang.String str = this.f202028d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canShowTeamWidget, teamInfo: ");
        sb6.append(this.f202043s != null);
        sb6.append(", upMode: ");
        sb6.append(i17);
        sb6.append(", isAssist: ");
        sb6.append(((mm2.c1) this.f202027c.P0(mm2.c1.class)).T);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (this.f202043s == null || i17 == 0 || i17 == 1 || ((mm2.c1) this.f202027c.P0(mm2.c1.class)).T) {
            return false;
        }
        return !(((mm2.n0) this.f202027c.P0(mm2.n0.class)).f410806r);
    }

    public final void b(boolean z17, yz5.a aVar) {
        this.f202039o = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f202027c;
        pq5.g l17 = new ke2.u(((mm2.e1) lVar.P0(mm2.e1.class)).f410516m, ((mm2.e1) lVar.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0), com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(((mm2.e1) lVar.P0(mm2.e1.class)).f410518o), ((mm2.e1) lVar.P0(mm2.e1.class)).f410525v, 0, this.f202037m, z17, 16, null).l();
        l17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s10(this, aVar));
        android.view.ViewGroup viewGroup = this.f202025a;
        if (viewGroup.getContext() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            android.content.Context context = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context);
        }
    }

    public final void c() {
        r45.h41 h41Var;
        int i17 = ((mm2.c1) this.f202027c.P0(mm2.c1.class)).H2;
        if (!((this.f202043s == null || i17 == 0 || i17 == 1) ? false : true) || ((mm2.c1) this.f202027c.P0(mm2.c1.class)).T) {
            return;
        }
        if (((mm2.n0) this.f202027c.P0(mm2.n0.class)).f410806r) {
            return;
        }
        this.f202041q.add(0, new cm2.p(2, null, null, null, this.f202043s, null, 46, null));
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.E;
        cl0.g gVar = new cl0.g();
        gVar.o("type", 32);
        java.lang.String gVar2 = gVar.toString();
        cl0.g gVar3 = new cl0.g();
        gVar3.h("click_id", java.util.UUID.randomUUID().toString());
        zl2.r4 r4Var = zl2.r4.f555483a;
        r45.a83 a83Var = ((mm2.c1) this.f202027c.P0(mm2.c1.class)).f410361j6;
        gVar3.o("game_type", r4Var.j3(a83Var != null ? a83Var.m75939xb282bd08(2) : 0));
        r45.fr1 fr1Var = this.f202043s;
        gVar3.h("appid", (fr1Var == null || (h41Var = (r45.h41) fr1Var.m75936x14adae67(21)) == null) ? null : h41Var.m75945x2fec8307(0));
        ml2.r0.hj(r0Var, b4Var, gVar2, 0L, null, null, gVar3.toString(), null, null, 220, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if ((r1 == null || r1.length() == 0) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if ((((mm2.n0) r4.f202027c.P0(mm2.n0.class)).f410806r) != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r4 = this;
            r45.yq1 r0 = r4.f202042r
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Ld
            com.tencent.mm.protobuf.f r0 = r0.m75936x14adae67(r2)
            r45.en6 r0 = (r45.en6) r0
            goto Le
        Ld:
            r0 = r1
        Le:
            if (r0 == 0) goto L8d
            r45.yq1 r0 = r4.f202042r
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
            r45.yq1 r0 = r4.f202042r
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
            if (r0 != 0) goto L8d
        L46:
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r4.f202027c
            java.lang.Class<mm2.c1> r1 = mm2.c1.class
            androidx.lifecycle.c1 r0 = r0.P0(r1)
            mm2.c1 r0 = (mm2.c1) r0
            boolean r0 = r0.T
            if (r0 != 0) goto L67
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r4.f202027c
            java.lang.Class<mm2.n0> r1 = mm2.n0.class
            androidx.lifecycle.c1 r0 = r0.P0(r1)
            mm2.n0 r0 = (mm2.n0) r0
            boolean r0 = r0.f410806r
            if (r0 != r2) goto L64
            r0 = r2
            goto L65
        L64:
            r0 = r3
        L65:
            if (r0 == 0) goto L8d
        L67:
            android.widget.TextView r0 = r4.f202034j
            if (r0 != 0) goto L6c
            goto L6f
        L6c:
            r0.setVisibility(r3)
        L6f:
            android.widget.TextView r0 = r4.f202034j
            if (r0 != 0) goto L74
            goto L97
        L74:
            r45.yq1 r1 = r4.f202042r
            if (r1 == 0) goto L87
            com.tencent.mm.protobuf.f r1 = r1.m75936x14adae67(r2)
            r45.en6 r1 = (r45.en6) r1
            if (r1 == 0) goto L87
            java.lang.String r1 = r1.m75945x2fec8307(r2)
            if (r1 == 0) goto L87
            goto L89
        L87:
            java.lang.String r1 = ""
        L89:
            r0.setText(r1)
            goto L97
        L8d:
            android.widget.TextView r0 = r4.f202034j
            if (r0 != 0) goto L92
            goto L97
        L92:
            r1 = 8
            r0.setVisibility(r1)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z10.d():void");
    }

    public final void e() {
        android.widget.TextView textView;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = this.f202032h;
        if (c22613xe7040d9c == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
            throw null;
        }
        if (!c22613xe7040d9c.isShowing) {
            android.view.View view = this.f202031g;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget", "showEmptyTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget", "showEmptyTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c2 = this.f202032h;
            if (c22613xe7040d9c2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
                throw null;
            }
            c22613xe7040d9c2.f();
        }
        r45.yq1 yq1Var = this.f202042r;
        java.lang.String m75945x2fec8307 = yq1Var != null ? yq1Var.m75945x2fec8307(3) : null;
        if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0) && (textView = this.f202035k) != null) {
            r45.yq1 yq1Var2 = this.f202042r;
            textView.setText(yq1Var2 != null ? yq1Var2.m75945x2fec8307(3) : null);
        }
        d();
        android.widget.TextView textView2 = this.f202035k;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        android.widget.FrameLayout frameLayout = this.f202029e;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }

    public final void f() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = this.f202032h;
        if (c22613xe7040d9c == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
            throw null;
        }
        if (!c22613xe7040d9c.isShowing) {
            android.view.View view = this.f202031g;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget", "showRv", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget", "showRv", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c2 = this.f202032h;
            if (c22613xe7040d9c2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
                throw null;
            }
            c22613xe7040d9c2.f();
        }
        d();
        android.widget.TextView textView = this.f202035k;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.FrameLayout frameLayout = this.f202029e;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }

    public final void g(boolean z17) {
        r45.h41 h41Var;
        java.lang.String str = null;
        if (!z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = this.f202032h;
            if (c22613xe7040d9c == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
                throw null;
            }
            if (!c22613xe7040d9c.isShowing) {
                android.view.View view = this.f202031g;
                if (view == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c2 = this.f202032h;
                if (c22613xe7040d9c2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
                    throw null;
                }
                c22613xe7040d9c2.f();
            }
            android.widget.TextView textView = this.f202035k;
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.widget.FrameLayout frameLayout = this.f202029e;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        }
        this.f202037m = null;
        this.f202038n = true;
        this.f202039o = false;
        b(false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x10(this, z17));
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.E;
        cl0.g gVar = new cl0.g();
        gVar.o("type", 31);
        java.lang.String gVar2 = gVar.toString();
        cl0.g gVar3 = new cl0.g();
        gVar3.h("click_id", java.util.UUID.randomUUID().toString());
        zl2.r4 r4Var = zl2.r4.f555483a;
        r45.a83 a83Var = ((mm2.c1) this.f202027c.P0(mm2.c1.class)).f410361j6;
        gVar3.o("game_type", r4Var.j3(a83Var != null ? a83Var.m75939xb282bd08(2) : 0));
        r45.fr1 fr1Var = this.f202043s;
        if (fr1Var != null && (h41Var = (r45.h41) fr1Var.m75936x14adae67(21)) != null) {
            str = h41Var.m75945x2fec8307(0);
        }
        gVar3.h("appid", str);
        ml2.r0.hj(r0Var, b4Var, gVar2, 0L, null, null, gVar3.toString(), null, null, 220, null);
    }
}
