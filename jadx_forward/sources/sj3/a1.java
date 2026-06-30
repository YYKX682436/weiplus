package sj3;

/* loaded from: classes14.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: J, reason: collision with root package name */
    public static int f489925J = 1;
    public wu5.c A;
    public p012xc85e97e9.p093xedfae76a.k0 B;
    public p012xc85e97e9.p093xedfae76a.k0 C;
    public p012xc85e97e9.p093xedfae76a.k0 D;
    public p012xc85e97e9.p093xedfae76a.k0 E;
    public p012xc85e97e9.p093xedfae76a.k0 F;
    public boolean G;
    public final rl5.r H;
    public boolean I;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 f489926d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f489927e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f489928f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f489929g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f489930h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f489931i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f489932m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f489933n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f489934o;

    /* renamed from: p, reason: collision with root package name */
    public int f489935p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.l f489936q;

    /* renamed from: r, reason: collision with root package name */
    public int f489937r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f489938s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f489939t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f489940u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f489941v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f489942w;

    /* renamed from: x, reason: collision with root package name */
    public int f489943x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.Boolean f489944y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f489945z;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 mainUI) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainUI, "mainUI");
        this.f489926d = mainUI;
        this.f489927e = jz5.h.b(new sj3.z0(this));
        this.f489928f = jz5.h.b(new sj3.v(this));
        this.f489929g = jz5.h.b(new sj3.v0(this));
        this.f489930h = jz5.h.b(new sj3.u0(this));
        this.f489931i = jz5.h.b(new sj3.r0(this));
        this.f489932m = jz5.h.b(new sj3.b0(this));
        this.f489933n = jz5.h.b(new sj3.u(this));
        java.lang.Object obj = ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().V).get("panel_mini_info");
        if (obj != null) {
            java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
            if (bool != null) {
                z17 = bool.booleanValue();
                this.f489934o = z17;
                this.f489935p = Integer.MAX_VALUE;
                this.f489936q = sj3.t0.f490276d;
                this.f489940u = true;
                this.f489941v = jz5.h.b(new sj3.w0(this));
                this.f489942w = jz5.h.b(new sj3.w(this));
                this.H = new rl5.r(mainUI.mo55332x76847179());
            }
        }
        z17 = false;
        this.f489934o = z17;
        this.f489935p = Integer.MAX_VALUE;
        this.f489936q = sj3.t0.f490276d;
        this.f489940u = true;
        this.f489941v = jz5.h.b(new sj3.w0(this));
        this.f489942w = jz5.h.b(new sj3.w(this));
        this.H = new rl5.r(mainUI.mo55332x76847179());
    }

    public static final void a(sj3.a1 a1Var, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.ControlPanelLogic", "setCurrentY: from " + a1Var.f489935p + " to " + i17);
        if (a1Var.f489935p == i17) {
            return;
        }
        a1Var.f489935p = i17;
        a1Var.b(a1Var.f489937r, false);
    }

    public final void b(int i17, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkNeedFold: ");
        sb6.append(i17);
        sb6.append(", expandedPanelHeight: ");
        jz5.g gVar = this.f489942w;
        sb6.append(((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).floatValue());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.ControlPanelLogic", sb6.toString());
        this.f489937r = i17;
        if (this.f489934o) {
            if (z17) {
                h(((float) i17) < ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).floatValue(), false);
            }
        } else if (i17 > this.f489935p) {
            this.f489934o = true;
            java.util.Map miniInfoHolder = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().V;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(miniInfoHolder, "miniInfoHolder");
            ((java.util.HashMap) miniInfoHolder).put("panel_mini_info", java.lang.Boolean.TRUE);
            h(((float) i17) < ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).floatValue(), false);
        }
    }

    public final android.view.View c() {
        return (android.view.View) this.f489933n.mo141623x754a37bb();
    }

    public final android.widget.FrameLayout d() {
        return (android.widget.FrameLayout) ((jz5.n) this.f489928f).mo141623x754a37bb();
    }

    public final u4.j0 e() {
        return (u4.j0) ((jz5.n) this.f489930h).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.b0 f() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.b0) ((jz5.n) this.f489927e).mo141623x754a37bb();
    }

    public final void g(int i17, int i18, int i19) {
        if (!this.f489934o) {
            if (this.f489945z) {
                return;
            }
            android.view.View findViewById = this.f489926d.findViewById(com.p314xaae8f345.mm.R.id.k6o);
            if (findViewById != null) {
                findViewById.setOnClickListener(new sj3.x(this, i17));
            }
            android.widget.ImageView imageView = (android.widget.ImageView) this.f489926d.findViewById(com.p314xaae8f345.mm.R.id.i2s);
            if (imageView != null) {
                imageView.setVisibility(0);
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.raw.f79634x412ce3f1, -1));
            }
            android.widget.TextView textView = (android.widget.TextView) this.f489926d.findViewById(com.p314xaae8f345.mm.R.id.f569155p80);
            if (textView != null) {
                textView.setVisibility(0);
                textView.setText(i19);
            }
            this.f489945z = true;
            ku5.t0 t0Var = (ku5.t0) ku5.t0.f394148d;
            t0Var.getClass();
            t0Var.z(new sj3.y(this), i18 * 1000, false);
            return;
        }
        if (this.f489945z) {
            return;
        }
        android.view.ViewGroup viewGroup = e().f506034c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(viewGroup, "getSceneRoot(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.ControlPanelLogic", "handleBadNetworkLogic: showView");
        android.view.View findViewById2 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.k6o);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "handleBadNetworkLogic$initNetView", "(ILcom/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic;ILandroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "handleBadNetworkLogic$initNetView", "(ILcom/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic;ILandroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setOnClickListener(new sj3.a0(this, i17));
        }
        ((android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f569155p80)).setText(i19);
        android.widget.ImageView imageView2 = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.i2s);
        if (imageView2 != null) {
            imageView2.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.raw.f79634x412ce3f1, -1));
        }
        android.view.View findViewById3 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f564577v3);
        android.view.ViewGroup.LayoutParams layoutParams = findViewById3.getLayoutParams();
        layoutParams.height += viewGroup.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562107a70);
        findViewById3.setLayoutParams(layoutParams);
        this.f489945z = true;
        wu5.c cVar = this.A;
        if (cVar != null) {
            cVar.cancel(false);
        }
        ku5.t0 t0Var2 = (ku5.t0) ku5.t0.f394148d;
        t0Var2.getClass();
        this.A = t0Var2.z(new sj3.z(this), i18 * 1000, false);
    }

    public final void h(boolean z17, boolean z18) {
        if (z18) {
            this.f489934o = true;
            java.util.Map miniInfoHolder = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().V;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(miniInfoHolder, "miniInfoHolder");
            ((java.util.HashMap) miniInfoHolder).put("panel_mini_info", java.lang.Boolean.TRUE);
        }
        boolean z19 = this.f489934o;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = this.f489926d;
        if (z19) {
            android.view.View c17 = c();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c17, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d().setVisibility(0);
            android.view.View findViewById = serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.k6o);
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f489938s = z17;
            d().setVisibility(0);
            p012xc85e97e9.p112x993b6d55.C1184xfa388aad c1184xfa388aad = new p012xc85e97e9.p112x993b6d55.C1184xfa388aad();
            p012xc85e97e9.p112x993b6d55.C1173xe703c6a5 c1173xe703c6a5 = new p012xc85e97e9.p112x993b6d55.C1173xe703c6a5();
            c1173xe703c6a5.b(com.p314xaae8f345.mm.R.id.f564577v3);
            c1173xe703c6a5.b(com.p314xaae8f345.mm.R.id.jwo);
            c1173xe703c6a5.b(com.p314xaae8f345.mm.R.id.jwb);
            c1173xe703c6a5.b(com.p314xaae8f345.mm.R.id.jxe);
            c1173xe703c6a5.b(com.p314xaae8f345.mm.R.id.nye);
            c1173xe703c6a5.f93916f = 300L;
            c1184xfa388aad.X(c1173xe703c6a5);
            p012xc85e97e9.p112x993b6d55.C1172x76e7e484 c1172x76e7e484 = new p012xc85e97e9.p112x993b6d55.C1172x76e7e484();
            c1172x76e7e484.U(com.p314xaae8f345.mm.R.id.jwp);
            c1172x76e7e484.U(com.p314xaae8f345.mm.R.id.jwc);
            c1172x76e7e484.U(com.p314xaae8f345.mm.R.id.jxf);
            c1172x76e7e484.U(com.p314xaae8f345.mm.R.id.k6o);
            c1172x76e7e484.Z(150L);
            c1172x76e7e484.f93915e = z17 ? 150L : 0L;
            c1184xfa388aad.X(c1172x76e7e484);
            c1184xfa388aad.T(new sj3.c0(this));
            if (z17) {
                u4.g1.c(e(), c1184xfa388aad);
                android.view.ViewGroup viewGroup = e().f506034c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(viewGroup, "getSceneRoot(...)");
                i(viewGroup);
                f489925J = 2;
                return;
            }
            jz5.g gVar = this.f489929g;
            u4.g1.c((u4.j0) ((jz5.n) gVar).mo141623x754a37bb(), c1184xfa388aad);
            android.view.ViewGroup viewGroup2 = ((u4.j0) ((jz5.n) gVar).mo141623x754a37bb()).f506034c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(viewGroup2, "getSceneRoot(...)");
            i(viewGroup2);
            f489925J = 3;
            return;
        }
        android.view.View c18 = c();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(c18, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c18.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(c18, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        d().setVisibility(8);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.gwx);
        relativeLayout.removeAllViews();
        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.cib);
        relativeLayout2.removeAllViews();
        if (c() != null) {
            android.view.ViewGroup.LayoutParams layoutParams = c().getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = ((int) ((i65.a.k(serviceConnectionC16581x3d1d6bd2) * 3.6d) / 100)) + this.f489943x;
            c().setLayoutParams(layoutParams2);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(13);
        relativeLayout2.addView((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) ((jz5.n) this.f489931i).mo141623x754a37bb(), layoutParams3);
        relativeLayout.addView((android.widget.RelativeLayout) ((jz5.n) this.f489932m).mo141623x754a37bb());
        c().findViewById(com.p314xaae8f345.mm.R.id.nye).setOnClickListener(this);
        android.view.View findViewById2 = c().findViewById(com.p314xaae8f345.mm.R.id.jw9);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "initNormalControl", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "initNormalControl", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b c16586x7058535b = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b) c().findViewById(com.p314xaae8f345.mm.R.id.jwo);
        c16586x7058535b.setOnClickListener(new sj3.i0(this, c16586x7058535b));
        p012xc85e97e9.p093xedfae76a.k0 k0Var = this.C;
        if (k0Var != null) {
            f().f231790e.mo522xb5bdeb7a(k0Var);
        }
        sj3.j0 j0Var = new sj3.j0(c16586x7058535b);
        f().f231790e.mo7806x9d92d11c(serviceConnectionC16581x3d1d6bd2, j0Var);
        this.C = j0Var;
        this.G = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Di(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Di().f554707o.a());
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b c16586x7058535b2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b) c().findViewById(com.p314xaae8f345.mm.R.id.jwb);
        c16586x7058535b2.setOnClickListener(new sj3.k0(this, c16586x7058535b2));
        p012xc85e97e9.p093xedfae76a.k0 k0Var2 = this.D;
        if (k0Var2 != null) {
            f().f231792g.mo522xb5bdeb7a(k0Var2);
        }
        sj3.l0 l0Var = new sj3.l0(this, c16586x7058535b2);
        f().f231792g.mo7806x9d92d11c(serviceConnectionC16581x3d1d6bd2, l0Var);
        this.D = l0Var;
        p012xc85e97e9.p093xedfae76a.k0 k0Var3 = this.F;
        if (k0Var3 != null) {
            f().f231794i.mo522xb5bdeb7a(k0Var3);
        }
        sj3.d0 d0Var = new sj3.d0(this, c16586x7058535b2);
        f().f231794i.mo7806x9d92d11c(serviceConnectionC16581x3d1d6bd2, d0Var);
        this.F = d0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b c16586x7058535b3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b) c().findViewById(com.p314xaae8f345.mm.R.id.jxe);
        c16586x7058535b3.setOnClickListener(new sj3.e0(this, c16586x7058535b3));
        p012xc85e97e9.p093xedfae76a.k0 k0Var4 = this.B;
        if (k0Var4 != null) {
            f().f231796n.mo522xb5bdeb7a(k0Var4);
        }
        sj3.f0 f0Var = new sj3.f0(c16586x7058535b3);
        f().f231796n.mo7806x9d92d11c(serviceConnectionC16581x3d1d6bd2, f0Var);
        this.B = f0Var;
        p012xc85e97e9.p093xedfae76a.k0 k0Var5 = this.E;
        if (k0Var5 != null) {
            f().f231807y.mo522xb5bdeb7a(k0Var5);
        }
        sj3.g0 g0Var = new sj3.g0(c16586x7058535b3);
        f().f231807y.mo7806x9d92d11c(serviceConnectionC16581x3d1d6bd2, g0Var);
        this.E = g0Var;
        c().post(new sj3.h0(this));
        f489925J = 1;
    }

    public final void i(android.view.ViewGroup viewGroup) {
        wu5.c cVar = this.A;
        if (cVar != null) {
            cVar.cancel(false);
        }
        android.view.View findViewById = e().f506034c.findViewById(com.p314xaae8f345.mm.R.id.k6o);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "resetNetTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "resetNetTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f489945z = false;
        this.f489939t = viewGroup;
        viewGroup.post(new sj3.o0(this, viewGroup));
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.jqo);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = this.f489926d;
        imageView.setBackground(com.p314xaae8f345.mm.ui.uk.e(serviceConnectionC16581x3d1d6bd2, com.p314xaae8f345.mm.R.raw.f79634x412ce3f1, -1));
        if (!this.I) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.h(true, false);
            this.I = true;
        }
        viewGroup.findViewById(com.p314xaae8f345.mm.R.id.nye).setOnClickListener(this);
        viewGroup.findViewById(com.p314xaae8f345.mm.R.id.jqn).setOnClickListener(this);
        android.widget.ImageView imageView2 = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.jxe);
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.jxf);
        p012xc85e97e9.p093xedfae76a.k0 k0Var = this.B;
        if (k0Var != null) {
            f().f231796n.mo522xb5bdeb7a(k0Var);
        }
        sj3.p0 p0Var = new sj3.p0(imageView2, textView, this);
        f().f231796n.mo7806x9d92d11c(serviceConnectionC16581x3d1d6bd2, p0Var);
        this.B = p0Var;
        imageView2.setOnClickListener(this);
        android.widget.ImageView imageView3 = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.jwo);
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.jwp);
        p012xc85e97e9.p093xedfae76a.k0 k0Var2 = this.C;
        if (k0Var2 != null) {
            f().f231790e.mo522xb5bdeb7a(k0Var2);
        }
        sj3.q0 q0Var = new sj3.q0(imageView3, textView2, this);
        f().f231790e.mo7806x9d92d11c(serviceConnectionC16581x3d1d6bd2, q0Var);
        this.C = q0Var;
        imageView3.setOnClickListener(this);
        android.widget.ImageView imageView4 = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.jwb);
        android.widget.TextView textView3 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.jwc);
        p012xc85e97e9.p093xedfae76a.k0 k0Var3 = this.D;
        if (k0Var3 != null) {
            f().f231792g.mo522xb5bdeb7a(k0Var3);
        }
        sj3.m0 m0Var = new sj3.m0(this, imageView4, textView3);
        f().f231792g.mo7806x9d92d11c(serviceConnectionC16581x3d1d6bd2, m0Var);
        this.D = m0Var;
        imageView4.setOnClickListener(this);
        p012xc85e97e9.p093xedfae76a.k0 k0Var4 = this.E;
        if (k0Var4 != null) {
            f().f231807y.mo522xb5bdeb7a(k0Var4);
        }
        sj3.n0 n0Var = new sj3.n0(imageView2, textView);
        f().f231807y.mo7806x9d92d11c(serviceConnectionC16581x3d1d6bd2, n0Var);
        this.E = n0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.ControlPanelLogic", "checkNaviHeight() called with: h = " + this.f489943x + ' ' + this.f489944y + ' ' + this.f489938s + ' ');
        this.f489944y = java.lang.Boolean.valueOf(this.f489938s);
        int i17 = this.f489943x;
        android.view.ViewGroup viewGroup2 = e().f506034c;
        android.view.View findViewById2 = viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.cif);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.view.ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
        layoutParams.height = layoutParams.height + i17;
        findViewById2.setLayoutParams(layoutParams);
        android.view.View findViewById3 = viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.f564577v3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.view.ViewGroup.LayoutParams layoutParams2 = findViewById3.getLayoutParams();
        layoutParams2.height += i17;
        findViewById3.setLayoutParams(layoutParams2);
        android.view.View findViewById4 = viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.nye);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.view.ViewGroup.LayoutParams layoutParams3 = findViewById4.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin += i17;
            findViewById4.setLayoutParams(marginLayoutParams);
        }
        android.view.View findViewById5 = viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.jqn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.view.ViewGroup.LayoutParams layoutParams4 = findViewById5.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.bottomMargin += i17;
            findViewById5.setLayoutParams(marginLayoutParams2);
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1076xfbb92cd0 c1076xfbb92cd0 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1076xfbb92cd0) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.cid);
        if (c1076xfbb92cd0 != null) {
            c1076xfbb92cd0.m7187xdf772b4d((int) (c1076xfbb92cd0.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f562108a71) + i17));
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1076xfbb92cd0 c1076xfbb92cd02 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1076xfbb92cd0) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.cie);
        if (c1076xfbb92cd02 != null) {
            c1076xfbb92cd02.m7187xdf772b4d(i17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01a1  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r22) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sj3.a1.onClick(android.view.View):void");
    }
}
