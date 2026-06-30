package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class c9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.hc implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.y4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.xc {
    public android.widget.TextView A;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12640x8cdfe408 B;
    public android.view.ViewGroup C;
    public android.widget.TextView D;
    public yz5.a E;
    public java.lang.Boolean F;
    public android.view.ViewStub G;
    public android.view.ViewStub H;
    public k91.b1 I;

    /* renamed from: J, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.q9 f171160J;
    public android.widget.FrameLayout K;
    public boolean L;
    public boolean M;
    public final java.util.Set N;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.l9 P;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f171161x;

    /* renamed from: y, reason: collision with root package name */
    public int f171162y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f171163z;

    public c9(android.content.Context context) {
        super(context);
        this.I = k91.b1.f387073d;
        this.L = true;
        this.M = false;
        this.N = new java.util.LinkedHashSet();
        this.f171162y = 0;
        O();
    }

    public static void K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9 c9Var) {
        c9Var.getClass();
        java.util.Set set = c9Var.N;
        java.util.LinkedList linkedList = new java.util.LinkedList(set);
        set.clear();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((yz5.a) it.next()).mo152xb9724478();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getBgColor */
    public int m52961x319751e8() {
        int ordinal = this.I.ordinal();
        return ordinal != 1 ? ordinal != 2 ? getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c) : android.graphics.Color.parseColor("#191919") : getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
    }

    /* renamed from: getCapsuleBarImplView */
    private mi1.i m52962x7bf9a7a1() {
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.a0n);
        if (findViewById instanceof mi1.i) {
            return (mi1.i) findViewById;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getNameTextColor */
    public int m52963x22633c35() {
        int ordinal = this.I.ordinal();
        return ordinal != 1 ? ordinal != 2 ? getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c) : android.graphics.Color.parseColor("#CCFFFFFF") : android.graphics.Color.parseColor("#E6000000");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.jc
    public java.lang.String D() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f171161x;
        return "AppBrandUILoadingSplash:" + (c11510xdd90c2f2 == null ? "null" : c11510xdd90c2f2.f156336n);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.y4
    public void E(final int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f171161x;
        if (c11510xdd90c2f2 == null) {
            return;
        }
        c11510xdd90c2f2.m(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.ui.c9$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9 c9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9.this;
                int i18 = i17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUILoadingSplash", "onDataTransferState(%s) state=%d", c9Var.f171161x.f156336n, java.lang.Integer.valueOf(i18));
                if (i18 == 3) {
                    c9Var.U(com.p314xaae8f345.mm.R.C30867xcad56011.a0d);
                    c9Var.G.setVisibility(8);
                }
            }
        });
    }

    public void N(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        java.lang.String str = c11510xdd90c2f2.u0().f158812e;
        this.f171161x = c11510xdd90c2f2;
        if (c11510xdd90c2f2.r0() != null) {
            android.app.Activity r07 = c11510xdd90c2f2.r0();
            if (getContext() instanceof android.content.MutableContextWrapper) {
                ((android.content.MutableContextWrapper) getContext()).setBaseContext(r07);
                B(m52961x319751e8(), !Q(), true);
            }
        }
        T();
        P();
    }

    public final void O() {
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569549eh, this);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f564698yc);
        this.f171163z = imageView;
        imageView.setImageDrawable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ud.a());
        this.A = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564701yh);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12640x8cdfe408 c12640x8cdfe408 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12640x8cdfe408) findViewById(com.p314xaae8f345.mm.R.id.bwp);
        this.B = c12640x8cdfe408;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.h7.a(this.f171163z, c12640x8cdfe408, this.A);
        this.B.m52901x6ab8beb1(b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28));
        this.B.m52904xc5493c7f(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561604n7));
        this.B.m52903xc4323e1c(b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        this.B.m52902xc03f473c(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561603n6));
        this.B.m52906x7d38f3f4(b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        this.B.m52907x7e4ff257(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561605n8));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            this.B.m52908xbf0ba007(Integer.MAX_VALUE);
        }
        this.C = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.f564702yi);
        this.G = (android.view.ViewStub) findViewById(com.p314xaae8f345.mm.R.id.auf);
        this.H = (android.view.ViewStub) findViewById(com.p314xaae8f345.mm.R.id.hsm);
        this.K = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.f564755rc2);
        s(true);
        if (q75.a.a(getContext()) != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.y0.c(this);
        }
        android.widget.FrameLayout frameLayout = this.K;
        if (frameLayout != null) {
            frameLayout.getViewTreeObserver().addOnPreDrawListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e9(this));
        }
        cf.i.b("AppBrandUILoadingSplash setupRightButton", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.d9(this));
        this.A.getLayoutParams().height = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.b.a(getContext());
        if (this.f171161x != null) {
            T();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f564701yh));
        arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f564050go));
        arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f564049gn));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.d(arrayList, mo52965xfb86a31b());
        P();
    }

    public final void P() {
        if (findViewById(com.p314xaae8f345.mm.R.id.se_) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUILoadingSplash", "initPlayabelView has inited");
            return;
        }
        if (pe.a.f435121a == null || this.f171161x == null) {
            return;
        }
        boolean z17 = true;
        try {
            cl0.e eVar = new cl0.e(j62.e.g().a("clicfg_sns_playable_weapp_loading_view_config_android", "", true, true));
            java.lang.String str = this.f171161x.f156336n;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUILoadingSplash", java.lang.String.format("initPlayabelView allow list:%s appid:%s", eVar, str));
            int mo15056xbe0e3ae6 = eVar.mo15056xbe0e3ae6();
            for (int i17 = 0; i17 < mo15056xbe0e3ae6; i17++) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(eVar.mo15054x2fec8307(i17), str)) {
                    break;
                }
            }
        } catch (cl0.f e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandUILoadingSplash", "get clicfg_sns_playable_weapp_loading_view_config_android error" + e17.getMessage());
        }
        z17 = false;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandUILoadingSplash", "initPlayabelView not match allow list");
            return;
        }
        android.view.View view = new android.view.View(getContext());
        view.setBackground(new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-17548, -748993}));
        view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        view.setId(com.p314xaae8f345.mm.R.id.se_);
        this.C.addView(view);
        this.K.bringToFront();
    }

    public final boolean Q() {
        if (this.I == k91.b1.f387074e) {
            return false;
        }
        if (this.F == null) {
            nf.y yVar = nf.x.f418149b;
            this.F = java.lang.Boolean.valueOf(yVar != null ? yVar.mo53144x387a9983() : false);
        }
        return this.F.booleanValue();
    }

    public final void R(mi1.i iVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f171161x;
        android.content.Context context = (c11510xdd90c2f2 == null || c11510xdd90c2f2.r0() == null || this.f171161x.s0() == null) ? iVar.getContext() : this.f171161x.s0().b(this.f171161x.r0(), al1.b.class);
        if (!k91.l3.a(this.f171162y)) {
            iVar.getLayoutParams().height = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561555lv);
            iVar.m147351x5e721652(context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561553lt));
            return;
        }
        iVar.getLayoutParams().height = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561555lv);
        if (((mi1.j2) i95.n0.c(mi1.j2.class)) != null) {
            mi1.f3.c(iVar, context, false);
            if (iVar.getParent() instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) iVar.getParent();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<this>");
                mi1.f3.a(viewGroup, context, false);
            }
        }
    }

    public final void S(android.content.res.Configuration configuration) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f171161x;
        if (c11510xdd90c2f2 != null && (c11510xdd90c2f2.mo48803xee5260a9() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0)) {
            android.app.Activity w17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0) this.f171161x.mo48803xee5260a9()).w();
            if (k91.l3.a(this.f171162y)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.na.g(w17, true);
                return;
            }
            boolean z17 = configuration.orientation == 2;
            if ((z17 && w17 != null && w17.isInMultiWindowMode() && w17.getRequestedOrientation() == 1) || w17 == null) {
                return;
            }
            android.view.Window window = w17.getWindow();
            android.view.View decorView = window.getDecorView();
            if (!z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.na.h(window, false, false);
            } else {
                window.addFlags(1024);
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4 | 256);
            }
        }
    }

    public final void T() {
        iz5.a.d(null, this.f171161x);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.k9 k9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.k9(this);
        mi1.i m52962x7bf9a7a1 = m52962x7bf9a7a1();
        if (m52962x7bf9a7a1 != null) {
            m52962x7bf9a7a1.m147354x23320e34(Q() ? -1 : -16777216);
            m52962x7bf9a7a1.m147352x4dad334a(k9Var);
            R(m52962x7bf9a7a1);
        }
    }

    public final void U(int i17) {
        if (this.D == null) {
            android.view.ViewStub viewStub = (android.view.ViewStub) findViewById(com.p314xaae8f345.mm.R.id.f564776a32);
            if (viewStub == null) {
                return;
            } else {
                this.D = (android.widget.TextView) viewStub.inflate();
            }
        }
        android.widget.TextView textView = this.D;
        if (textView == null) {
            return;
        }
        textView.setVisibility(0);
        this.D.setText(i17);
    }

    /* renamed from: getProgress */
    public int m52964x402effa3() {
        return this.B.getProgress();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.jc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    /* renamed from: getView */
    public android.view.View mo52965xfb86a31b() {
        return this;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    public void j(java.lang.String str, java.lang.String str2) {
        l01.d0.f396294a.b(this.f171163z, str, null, l01.q0.f396320d);
        this.A.setText(str2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    public void k(int i17) {
        this.C.setBackgroundColor(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.xc
    public void l(yz5.a aVar) {
        this.E = aVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    public void n(yz5.a aVar) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f171161x;
        objArr[0] = c11510xdd90c2f2 == null ? "null" : c11510xdd90c2f2.f156336n;
        objArr[1] = java.lang.Boolean.valueOf(this.L);
        objArr[2] = java.lang.Boolean.valueOf(this.M);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUILoadingSplash", "animateHide appId[%s] mCanShowHideAnimation[%b], mIsHideInvoked[%b]", objArr);
        if (aVar != null) {
            this.N.add(aVar);
        }
        if (this.M) {
            return;
        }
        this.M = true;
        if (this.L) {
            post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.j9(this));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUILoadingSplash", "animateHide, start hide without animation");
        android.view.ViewParent parent = getParent();
        if (parent instanceof android.view.ViewGroup) {
            post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.f9(this, parent));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUILoadingSplash", "animateHide, wrong ViewGroup");
        }
    }

    @Override // vj5.h, vj5.k
    public void n6(int i17) {
        q(i17);
        android.util.Log.getStackTraceString(new java.lang.Throwable());
        android.widget.FrameLayout frameLayout = this.K;
        if (frameLayout != null) {
            frameLayout.setTranslationY(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.jc, vj5.h, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        B(m52961x319751e8(), !Q(), true);
        this.B.f();
        try {
            S(getContext().getResources().getConfiguration());
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // android.view.View
    public void onCancelPendingInputEvents() {
        super.onCancelPendingInputEvents();
        mi1.i m52962x7bf9a7a1 = m52962x7bf9a7a1();
        if (m52962x7bf9a7a1 != null) {
            m52962x7bf9a7a1.cancelPendingInputEvents();
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            S(configuration);
        } catch (java.lang.Exception unused) {
        }
        if (this.f171160J != null) {
            try {
                this.f171160J.a(this.f171161x.mo48803xee5260a9().mo51612x60543150().a());
            } catch (java.lang.Exception unused2) {
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.jc, android.view.View
    public final boolean post(java.lang.Runnable runnable) {
        boolean z17 = false;
        if (runnable == null) {
            return false;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (!n3.x0.b(this)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f171161x;
            if (c11510xdd90c2f2 != null && (c11510xdd90c2f2 instanceof ze.n) && ((ze.n) c11510xdd90c2f2).a2()) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
                return true;
            }
        }
        return super.post(runnable);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.jc, android.view.View
    public final boolean postDelayed(java.lang.Runnable runnable, long j17) {
        boolean z17 = false;
        if (runnable == null) {
            return false;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (!n3.x0.b(this)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f171161x;
            if (c11510xdd90c2f2 != null && (c11510xdd90c2f2 instanceof ze.n) && ((ze.n) c11510xdd90c2f2).a2()) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable, j17);
                return true;
            }
        }
        return super.postDelayed(runnable, j17);
    }

    /* renamed from: setActionBar */
    public void m52966x679283bb(android.view.View view) {
        android.view.View findViewById = this.K.findViewById(com.p314xaae8f345.mm.R.id.a0n);
        if (findViewById != null) {
            this.K.removeView(findViewById);
        }
        view.setId(com.p314xaae8f345.mm.R.id.a0n);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, this.C.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561154aw));
        layoutParams.gravity = 8388661;
        this.K.addView(view, layoutParams);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.hc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.jc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    /* renamed from: setAppServiceType */
    public void mo52967xf31bdbb0(int i17) {
        if (i17 != this.f171162y) {
            this.f171162y = i17;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.x0.b(this)) {
                try {
                    S(getContext().getResources().getConfiguration());
                } catch (java.lang.Exception unused) {
                }
            }
            R(m52962x7bf9a7a1());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.hc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.jc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    /* renamed from: setCanShowHideAnimation */
    public void mo52968x5fa745f7(boolean z17) {
        this.L = z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* renamed from: setLabelInjector */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m52969xdbf46906(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.l9 r13) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9.m52969xdbf46906(com.tencent.mm.plugin.appbrand.ui.l9):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.hc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.jc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    /* renamed from: setProgress */
    public void mo52970x3ae760af(int i17) {
        this.B.m52905x3ae760af(i17);
    }

    /* renamed from: setTheme */
    public void m52971x53bf3687(k91.b1 b1Var) {
        this.I = b1Var;
        this.C.setBackgroundColor(m52961x319751e8());
        this.A.setTextColor(m52963x22633c35());
    }

    public c9(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        super(context);
        this.I = k91.b1.f387073d;
        this.L = true;
        this.M = false;
        this.N = new java.util.LinkedHashSet();
        this.f171161x = c11510xdd90c2f2;
        this.f171162y = c11510xdd90c2f2.u0() instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 ? ((com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1) this.f171161x.u0()).f128817z : 0;
        O();
    }
}
