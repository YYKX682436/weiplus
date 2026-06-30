package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class g90 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f194184a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f194185b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.RelativeLayout f194186c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.RelativeLayout f194187d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.TextureView f194188e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f194189f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14313x19517c77 f194190g;

    /* renamed from: h, reason: collision with root package name */
    public final int f194191h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f194192i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f194193j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f194194k;

    /* renamed from: l, reason: collision with root package name */
    public final int f194195l;

    /* renamed from: m, reason: collision with root package name */
    public int f194196m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedHashMap f194197n;

    public g90(android.view.ViewGroup root, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f194184a = root;
        this.f194185b = basePlugin;
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.f566151ex2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f194186c = (android.widget.RelativeLayout) findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.f566150ex1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f194187d = (android.widget.RelativeLayout) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.f566149ex0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f194188e = (android.view.TextureView) findViewById3;
        this.f194189f = root.getRootView().findViewById(com.p314xaae8f345.mm.R.id.ejw);
        android.view.View findViewById4 = root.findViewById(com.p314xaae8f345.mm.R.id.f566153ex4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14313x19517c77 c14313x19517c77 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14313x19517c77) findViewById4;
        this.f194190g = c14313x19517c77;
        this.f194195l = com.p314xaae8f345.mm.ui.zk.a(root.getContext(), 16);
        int e17 = e();
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.content.Context context = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f194191h = r4Var.Y1(context) ? com.p314xaae8f345.mm.ui.zk.a(root.getContext(), 8) : (int) ((com.p314xaae8f345.mm.ui.bl.b(root.getContext()).x - e17) - com.p314xaae8f345.mm.ui.zk.a(root.getContext(), 16));
        c14313x19517c77.setTranslationX(0.0f);
        c14313x19517c77.m81436x205ac394(i65.a.b(root.getContext(), 8));
        c14313x19517c77.m57299x71fd0443(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.y80(this));
        c14313x19517c77.m57297x5d3e65f7(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z80(this));
        this.f194197n = new java.util.LinkedHashMap();
    }

    public final void a(android.view.View view) {
        android.util.Size size;
        kn0.p pVar;
        kn0.p pVar2;
        android.view.ViewGroup viewGroup = this.f194184a;
        viewGroup.setVisibility(0);
        int a17 = com.p314xaae8f345.mm.ui.zk.a(viewGroup.getContext(), 160);
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.content.Context context = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        boolean Y1 = r4Var.Y1(context);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14313x19517c77 c14313x19517c77 = this.f194190g;
        int i17 = this.f194191h;
        java.lang.Boolean bool = null;
        if (Y1) {
            a17 = (com.p314xaae8f345.mm.ui.bl.b(viewGroup.getContext()).y - c14313x19517c77.getHeight()) / 2;
            android.view.ViewGroup.LayoutParams layoutParams = c14313x19517c77.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = a17;
                marginLayoutParams.setMarginEnd(i17);
            }
            int h17 = com.p314xaae8f345.mm.ui.bl.h(viewGroup.getContext());
            c14313x19517c77.f197400u = h17;
            c14313x19517c77.f197401v = h17;
            c14313x19517c77.f197402w = i17;
            c14313x19517c77.f197403x = i17;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = c14313x19517c77.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin = a17;
                marginLayoutParams2.setMarginEnd(i17);
            }
            int c17 = c();
            c14313x19517c77.f197400u = a17;
            c14313x19517c77.f197401v = c17;
            int i18 = this.f194195l;
            c14313x19517c77.f197402w = i18;
            c14313x19517c77.f197403x = i18;
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = c14313x19517c77.getLayoutParams();
        if (layoutParams3 != null) {
            size = new android.util.Size(layoutParams3.width, layoutParams3.height);
        } else {
            jz5.g gVar = tn0.j1.f502229p;
            size = new android.util.Size(((java.lang.Number) ((jz5.n) tn0.j1.f502229p).mo141623x754a37bb()).intValue(), ((java.lang.Number) ((jz5.n) tn0.j1.f502230q).mo141623x754a37bb()).intValue());
        }
        tn0.w0 d17 = d();
        if (d17 != null) {
            d17.K0(true, this.f194188e, size, view);
        }
        h();
        tn0.w0 d18 = d();
        if ((d18 == null || (pVar2 = d18.D) == null || !pVar2.e()) ? false : true) {
            b();
        } else {
            c14313x19517c77.setVisibility(0);
            c14313x19517c77.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a90(this));
        }
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        ml2.y4 y4Var = ml2.j0.f409116i;
        if (y4Var.f409830f0 == 0) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            y4Var.f409830f0 = java.lang.System.currentTimeMillis();
            cl0.g gVar2 = new cl0.g();
            ml2.v2[] v2VarArr = ml2.v2.f409680d;
            gVar2.s("type", 3);
            java.lang.String str = this.f194194k;
            if (str == null) {
                str = "other";
            }
            gVar2.s("result", str);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb.y6((zy2.zb) c18, ml2.z4.H, gVar2.toString(), null, 4, null);
        }
        if (r4Var.x1()) {
            qo0.c cVar = this.f194185b.f194858g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar;
            tn0.w0 d19 = d();
            cl0.g gVar3 = d19 != null ? ((in0.q) d19).T1 : null;
            tn0.w0 d27 = d();
            org.json.JSONObject J2 = d27 != null ? d27.J() : null;
            tn0.w0 d28 = d();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57628x9aa6f4f1(k0Var, gVar3, J2, d28 != null ? ((in0.q) d28).W0() : null, false, null, 24, null);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startScreenShare isAudioMode:");
        tn0.w0 d29 = d();
        if (d29 != null && (pVar = d29.D) != null) {
            bool = java.lang.Boolean.valueOf(pVar.e());
        }
        sb6.append(bool);
        sb6.append(" topBoundary:");
        sb6.append(a17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShareWidget", sb6.toString());
    }

    public final void b() {
        mm2.c1 c1Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662;
        r45.uo1 m76959xd0530b13;
        dk2.ef efVar = dk2.ef.f314905a;
        mm2.c1 c1Var2 = (mm2.c1) efVar.i(mm2.c1.class);
        java.lang.String m75945x2fec8307 = (c1Var2 == null || (c19792x256d27252 = c1Var2.f410379n) == null || (m76802x2dd016662 = c19792x256d27252.m76802x2dd01666()) == null || (m76959xd0530b13 = m76802x2dd016662.m76959xd0530b13()) == null) ? null : m76959xd0530b13.m75945x2fec8307(0);
        if ((m75945x2fec8307 == null || m75945x2fec8307.length() == 0) && ((c1Var = (mm2.c1) efVar.i(mm2.c1.class)) == null || (c19792x256d2725 = c1Var.f410379n) == null || (m76802x2dd01666 = c19792x256d2725.m76802x2dd01666()) == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null || (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) == null || (m75945x2fec8307 = c19788xd7cfd73e.m76625xb5887639()) == null)) {
            m75945x2fec8307 = "";
        }
        this.f194190g.setVisibility(8);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("liveCoverUrl:");
        sb6.append(m75945x2fec8307);
        sb6.append(", liveData.audioModeHolderBm:");
        mm2.c1 c1Var3 = (mm2.c1) efVar.i(mm2.c1.class);
        sb6.append(c1Var3 != null ? c1Var3.I4 : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShareWidget", sb6.toString());
    }

    public final int c() {
        android.view.ViewGroup viewGroup = this.f194184a;
        int a17 = com.p314xaae8f345.mm.ui.zk.a(viewGroup.getContext(), 90) + com.p314xaae8f345.mm.ui.bl.c(viewGroup.getContext());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg) this.f194185b.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg.class);
        return a17 + (mgVar != null ? mgVar.f195043w.getF197657g() : 0);
    }

    public final tn0.w0 d() {
        return dk2.ef.f314905a.e();
    }

    public final int e() {
        android.view.ViewGroup.LayoutParams layoutParams = this.f194190g.getLayoutParams();
        if (layoutParams != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(layoutParams.width);
            if (!(valueOf.intValue() > 0)) {
                valueOf = null;
            }
            if (valueOf != null) {
                return valueOf.intValue();
            }
        }
        return com.p314xaae8f345.mm.ui.zk.a(this.f194184a.getContext(), 72);
    }

    public final void f(boolean z17) {
        int i17;
        boolean z18;
        ts0.r rVar;
        kn0.f fVar;
        kn0.f fVar2;
        kn0.p pVar;
        tn0.w0 d17 = d();
        if ((d17 == null || (pVar = d17.D) == null || !pVar.f391122i) ? false : true) {
            if (z17) {
                b();
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14313x19517c77 c14313x19517c77 = this.f194190g;
            c14313x19517c77.setVisibility(0);
            c14313x19517c77.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a90(this));
            tn0.w0 d18 = d();
            if (d18 != null) {
                dk2.ef efVar = dk2.ef.f314905a;
                mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
                if (c1Var != null && c1Var.O7()) {
                    in0.q e17 = efVar.e();
                    i17 = e17 != null && !e17.W() ? 3 : 1;
                } else {
                    i17 = 0;
                }
                kn0.i iVar = d18.C;
                if (iVar == null || (fVar2 = iVar.f391093d) == null) {
                    z18 = !(d18.f502309w != null && !ts0.c.f503081h);
                } else {
                    z18 = fVar2.f391063b;
                }
                d18.V(z18);
                kn0.i iVar2 = d18.C;
                boolean z19 = (iVar2 == null || (fVar = iVar2.f391093d) == null || !fVar.f391064c) ? false : true;
                go0.f0 f0Var = d18.f502304r;
                if (z19 && (rVar = d18.f502308v) != null) {
                    rVar.k(f0Var.mo8978x89bef366());
                }
                vn0.c cVar = vn0.b.f519707a;
                cVar.a().getClass();
                cVar.d().getClass();
                xn0.b b17 = cVar.b();
                ts0.r rVar2 = d18.f502308v;
                b17.f536943a = rVar2 != null ? rVar2.e() : 0;
                f0Var.getClass();
                f0Var.l(new go0.p(f0Var));
                f0Var.l(new go0.b0(f0Var, null));
                f0Var.u(new tn0.q(d18, i17));
            }
            h();
        }
    }

    public final void g(int i17, java.util.LinkedHashMap micUserMap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micUserMap, "micUserMap");
        this.f194196m = i17;
        java.util.LinkedHashMap linkedHashMap = this.f194197n;
        linkedHashMap.clear();
        linkedHashMap.putAll(micUserMap);
        this.f194190g.getViewTreeObserver().addOnPreDrawListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.e90(this, i17, micUserMap));
    }

    public final void h() {
        android.view.TextureView textureView = this.f194188e;
        android.view.ViewParent parent = textureView.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(textureView);
        }
        if (viewGroup != null) {
            viewGroup.addView(textureView);
        }
        java.util.LinkedHashMap linkedHashMap = this.f194197n;
        if (!linkedHashMap.isEmpty()) {
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            linkedHashMap2.putAll(linkedHashMap);
            g(this.f194196m, linkedHashMap2);
        }
    }

    public final void i() {
        cl0.g gVar = new cl0.g();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        ml2.y4 y4Var = ml2.j0.f409116i;
        long j17 = (currentTimeMillis - y4Var.f409830f0) / 1000;
        ml2.v2[] v2VarArr = ml2.v2.f409680d;
        gVar.s("type", 4);
        gVar.s("result", java.lang.Long.valueOf(j17));
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.H, gVar.toString(), null, 4, null);
        cl0.d dVar = new cl0.d();
        dVar.e("type", this.f194194k);
        dVar.e("time", java.lang.Long.valueOf(j17));
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        y4Var.f409832g0.q(dVar);
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        y4Var.f409830f0 = 0L;
    }

    public final void j() {
        tn0.w0 d17;
        android.graphics.Point a17;
        android.graphics.Point a18;
        android.graphics.Point a19;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("restoreScreenShare floatPosition:");
        tn0.w0 d18 = d();
        sb6.append(d18 != null ? d18.Q().a() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShareWidget", sb6.toString());
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.content.Context context = this.f194184a.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (r4Var.Y1(context) || (d17 = d()) == null || (a17 = d17.Q().a()) == null) {
            return;
        }
        if (a17.x == 0 && a17.y == 0) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f194190g.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            tn0.w0 d19 = d();
            int i17 = 0;
            marginLayoutParams.setMarginEnd((d19 == null || (a19 = d19.Q().a()) == null) ? 0 : a19.x);
            tn0.w0 d27 = d();
            if (d27 != null && (a18 = d27.Q().a()) != null) {
                i17 = a18.y;
            }
            marginLayoutParams.topMargin = i17;
        }
    }

    public final void k(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        this.f194194k = "public_word";
        zg0.r2 r2Var = (zg0.r2) i95.n0.c(zg0.r2.class);
        android.content.Context context = this.f194184a.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z1 wi6 = ((yg0.a) r2Var).wi((android.app.Activity) context, url, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.e0(0.0f, null, false, 0, null, true, null, null, null, false, 991, null));
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
        if (c1Var != null) {
            c1Var.f410409r5 = url;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z1.B6(wi6, null, 1, null);
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f90(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4) wi6).f269000i, this, wi6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x011b, code lost:
    
        if (((java.util.HashSet) o35.a.f424284a).contains(r17.f194194k.toLowerCase()) == false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r18) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g90.l(int):void");
    }
}
