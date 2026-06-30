package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class c9 extends com.tencent.mm.plugin.appbrand.ui.hc implements com.tencent.mm.plugin.appbrand.launching.y4, com.tencent.mm.plugin.appbrand.ui.xc {
    public android.widget.TextView A;
    public com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView B;
    public android.view.ViewGroup C;
    public android.widget.TextView D;
    public yz5.a E;
    public java.lang.Boolean F;
    public android.view.ViewStub G;
    public android.view.ViewStub H;
    public k91.b1 I;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.ui.q9 f89627J;
    public android.widget.FrameLayout K;
    public boolean L;
    public boolean M;
    public final java.util.Set N;
    public com.tencent.mm.plugin.appbrand.ui.l9 P;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.AppBrandRuntime f89628x;

    /* renamed from: y, reason: collision with root package name */
    public int f89629y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f89630z;

    public c9(android.content.Context context) {
        super(context);
        this.I = k91.b1.f305540d;
        this.L = true;
        this.M = false;
        this.N = new java.util.LinkedHashSet();
        this.f89629y = 0;
        O();
    }

    public static void K(com.tencent.mm.plugin.appbrand.ui.c9 c9Var) {
        c9Var.getClass();
        java.util.Set set = c9Var.N;
        java.util.LinkedList linkedList = new java.util.LinkedList(set);
        set.clear();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((yz5.a) it.next()).invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBgColor() {
        int ordinal = this.I.ordinal();
        return ordinal != 1 ? ordinal != 2 ? getResources().getColor(com.tencent.mm.R.color.f478491c) : android.graphics.Color.parseColor("#191919") : getResources().getColor(com.tencent.mm.R.color.f478553an);
    }

    private mi1.i getCapsuleBarImplView() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.a0n);
        if (findViewById instanceof mi1.i) {
            return (mi1.i) findViewById;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getNameTextColor() {
        int ordinal = this.I.ordinal();
        return ordinal != 1 ? ordinal != 2 ? getResources().getColor(com.tencent.mm.R.color.a0c) : android.graphics.Color.parseColor("#CCFFFFFF") : android.graphics.Color.parseColor("#E6000000");
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.jc
    public java.lang.String D() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f89628x;
        return "AppBrandUILoadingSplash:" + (appBrandRuntime == null ? "null" : appBrandRuntime.f74803n);
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.y4
    public void E(final int i17) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f89628x;
        if (appBrandRuntime == null) {
            return;
        }
        appBrandRuntime.m(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.ui.c9$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.ui.c9 c9Var = com.tencent.mm.plugin.appbrand.ui.c9.this;
                int i18 = i17;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUILoadingSplash", "onDataTransferState(%s) state=%d", c9Var.f89628x.f74803n, java.lang.Integer.valueOf(i18));
                if (i18 == 3) {
                    c9Var.U(com.tencent.mm.R.string.a0d);
                    c9Var.G.setVisibility(8);
                }
            }
        });
    }

    public void N(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        java.lang.String str = appBrandRuntime.u0().f77279e;
        this.f89628x = appBrandRuntime;
        if (appBrandRuntime.r0() != null) {
            android.app.Activity r07 = appBrandRuntime.r0();
            if (getContext() instanceof android.content.MutableContextWrapper) {
                ((android.content.MutableContextWrapper) getContext()).setBaseContext(r07);
                B(getBgColor(), !Q(), true);
            }
        }
        T();
        P();
    }

    public final void O() {
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f488016eh, this);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f483165yc);
        this.f89630z = imageView;
        imageView.setImageDrawable(com.tencent.mm.plugin.appbrand.ui.ud.a());
        this.A = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483168yh);
        com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView appBrandCircleProgressView = (com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView) findViewById(com.tencent.mm.R.id.bwp);
        this.B = appBrandCircleProgressView;
        com.tencent.mm.plugin.appbrand.ui.h7.a(this.f89630z, appBrandCircleProgressView, this.A);
        this.B.setCircleColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.BW_0_Alpha_0_1));
        this.B.setDotWidth(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480071n7));
        this.B.setDotColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.f478502m));
        this.B.setCircleStrokeWidth(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480070n6));
        this.B.setProgressColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.f478502m));
        this.B.setProgressWidth(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480072n8));
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            this.B.setTransitionTimingMs(Integer.MAX_VALUE);
        }
        this.C = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.f483169yi);
        this.G = (android.view.ViewStub) findViewById(com.tencent.mm.R.id.auf);
        this.H = (android.view.ViewStub) findViewById(com.tencent.mm.R.id.hsm);
        this.K = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.f483222rc2);
        s(true);
        if (q75.a.a(getContext()) != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.y0.c(this);
        }
        android.widget.FrameLayout frameLayout = this.K;
        if (frameLayout != null) {
            frameLayout.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.appbrand.ui.e9(this));
        }
        cf.i.b("AppBrandUILoadingSplash setupRightButton", new com.tencent.mm.plugin.appbrand.ui.d9(this));
        this.A.getLayoutParams().height = com.tencent.mm.plugin.appbrand.widget.b.a(getContext());
        if (this.f89628x != null) {
            T();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f483168yh));
        arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f482517go));
        arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f482516gn));
        com.tencent.mm.plugin.appbrand.ui.u5.d(arrayList, getView());
        P();
    }

    public final void P() {
        if (findViewById(com.tencent.mm.R.id.se_) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUILoadingSplash", "initPlayabelView has inited");
            return;
        }
        if (pe.a.f353588a == null || this.f89628x == null) {
            return;
        }
        boolean z17 = true;
        try {
            cl0.e eVar = new cl0.e(j62.e.g().a("clicfg_sns_playable_weapp_loading_view_config_android", "", true, true));
            java.lang.String str = this.f89628x.f74803n;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUILoadingSplash", java.lang.String.format("initPlayabelView allow list:%s appid:%s", eVar, str));
            int length = eVar.length();
            for (int i17 = 0; i17 < length; i17++) {
                if (com.tencent.mm.sdk.platformtools.t8.D0(eVar.getString(i17), str)) {
                    break;
                }
            }
        } catch (cl0.f e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandUILoadingSplash", "get clicfg_sns_playable_weapp_loading_view_config_android error" + e17.getMessage());
        }
        z17 = false;
        if (!z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandUILoadingSplash", "initPlayabelView not match allow list");
            return;
        }
        android.view.View view = new android.view.View(getContext());
        view.setBackground(new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-17548, -748993}));
        view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        view.setId(com.tencent.mm.R.id.se_);
        this.C.addView(view);
        this.K.bringToFront();
    }

    public final boolean Q() {
        if (this.I == k91.b1.f305541e) {
            return false;
        }
        if (this.F == null) {
            nf.y yVar = nf.x.f336616b;
            this.F = java.lang.Boolean.valueOf(yVar != null ? yVar.isDarkMode() : false);
        }
        return this.F.booleanValue();
    }

    public final void R(mi1.i iVar) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f89628x;
        android.content.Context context = (appBrandRuntime == null || appBrandRuntime.r0() == null || this.f89628x.s0() == null) ? iVar.getContext() : this.f89628x.s0().b(this.f89628x.r0(), al1.b.class);
        if (!k91.l3.a(this.f89629y)) {
            iVar.getLayoutParams().height = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480022lv);
            iVar.setCapsuleContentAreaMarginEnd(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480020lt));
            return;
        }
        iVar.getLayoutParams().height = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480022lv);
        if (((mi1.j2) i95.n0.c(mi1.j2.class)) != null) {
            mi1.f3.c(iVar, context, false);
            if (iVar.getParent() instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) iVar.getParent();
                kotlin.jvm.internal.o.g(viewGroup, "<this>");
                mi1.f3.a(viewGroup, context, false);
            }
        }
    }

    public final void S(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f89628x;
        if (appBrandRuntime != null && (appBrandRuntime.getWindowAndroid() instanceof com.tencent.mm.plugin.appbrand.platform.window.activity.r0)) {
            android.app.Activity w17 = ((com.tencent.mm.plugin.appbrand.platform.window.activity.r0) this.f89628x.getWindowAndroid()).w();
            if (k91.l3.a(this.f89629y)) {
                com.tencent.mm.plugin.appbrand.ui.na.g(w17, true);
                return;
            }
            boolean z17 = configuration.orientation == 2;
            if ((z17 && w17 != null && w17.isInMultiWindowMode() && w17.getRequestedOrientation() == 1) || w17 == null) {
                return;
            }
            android.view.Window window = w17.getWindow();
            android.view.View decorView = window.getDecorView();
            if (!z17) {
                com.tencent.mm.plugin.appbrand.ui.na.h(window, false, false);
            } else {
                window.addFlags(1024);
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4 | 256);
            }
        }
    }

    public final void T() {
        iz5.a.d(null, this.f89628x);
        com.tencent.mm.plugin.appbrand.ui.k9 k9Var = new com.tencent.mm.plugin.appbrand.ui.k9(this);
        mi1.i capsuleBarImplView = getCapsuleBarImplView();
        if (capsuleBarImplView != null) {
            capsuleBarImplView.setStyleColor(Q() ? -1 : -16777216);
            capsuleBarImplView.setHomeButtonOnClickListener(k9Var);
            R(capsuleBarImplView);
        }
    }

    public final void U(int i17) {
        if (this.D == null) {
            android.view.ViewStub viewStub = (android.view.ViewStub) findViewById(com.tencent.mm.R.id.f483243a32);
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

    public int getProgress() {
        return this.B.getProgress();
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.jc, com.tencent.mm.plugin.appbrand.ui.vc
    public android.view.View getView() {
        return this;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.vc
    public void j(java.lang.String str, java.lang.String str2) {
        l01.d0.f314761a.b(this.f89630z, str, null, l01.q0.f314787d);
        this.A.setText(str2);
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.vc
    public void k(int i17) {
        this.C.setBackgroundColor(i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.xc
    public void l(yz5.a aVar) {
        this.E = aVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.vc
    public void n(yz5.a aVar) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f89628x;
        objArr[0] = appBrandRuntime == null ? "null" : appBrandRuntime.f74803n;
        objArr[1] = java.lang.Boolean.valueOf(this.L);
        objArr[2] = java.lang.Boolean.valueOf(this.M);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUILoadingSplash", "animateHide appId[%s] mCanShowHideAnimation[%b], mIsHideInvoked[%b]", objArr);
        if (aVar != null) {
            this.N.add(aVar);
        }
        if (this.M) {
            return;
        }
        this.M = true;
        if (this.L) {
            post(new com.tencent.mm.plugin.appbrand.ui.j9(this));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUILoadingSplash", "animateHide, start hide without animation");
        android.view.ViewParent parent = getParent();
        if (parent instanceof android.view.ViewGroup) {
            post(new com.tencent.mm.plugin.appbrand.ui.f9(this, parent));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUILoadingSplash", "animateHide, wrong ViewGroup");
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

    @Override // com.tencent.mm.plugin.appbrand.ui.jc, vj5.h, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        B(getBgColor(), !Q(), true);
        this.B.f();
        try {
            S(getContext().getResources().getConfiguration());
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // android.view.View
    public void onCancelPendingInputEvents() {
        super.onCancelPendingInputEvents();
        mi1.i capsuleBarImplView = getCapsuleBarImplView();
        if (capsuleBarImplView != null) {
            capsuleBarImplView.cancelPendingInputEvents();
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            S(configuration);
        } catch (java.lang.Exception unused) {
        }
        if (this.f89627J != null) {
            try {
                this.f89627J.a(this.f89628x.getWindowAndroid().getOrientationHandler().a());
            } catch (java.lang.Exception unused2) {
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.jc, android.view.View
    public final boolean post(java.lang.Runnable runnable) {
        boolean z17 = false;
        if (runnable == null) {
            return false;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (!n3.x0.b(this)) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f89628x;
            if (appBrandRuntime != null && (appBrandRuntime instanceof ze.n) && ((ze.n) appBrandRuntime).a2()) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mm.sdk.platformtools.u3.h(runnable);
                return true;
            }
        }
        return super.post(runnable);
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.jc, android.view.View
    public final boolean postDelayed(java.lang.Runnable runnable, long j17) {
        boolean z17 = false;
        if (runnable == null) {
            return false;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (!n3.x0.b(this)) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f89628x;
            if (appBrandRuntime != null && (appBrandRuntime instanceof ze.n) && ((ze.n) appBrandRuntime).a2()) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mm.sdk.platformtools.u3.i(runnable, j17);
                return true;
            }
        }
        return super.postDelayed(runnable, j17);
    }

    public void setActionBar(android.view.View view) {
        android.view.View findViewById = this.K.findViewById(com.tencent.mm.R.id.a0n);
        if (findViewById != null) {
            this.K.removeView(findViewById);
        }
        view.setId(com.tencent.mm.R.id.a0n);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, this.C.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479621aw));
        layoutParams.gravity = 8388661;
        this.K.addView(view, layoutParams);
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.hc, com.tencent.mm.plugin.appbrand.ui.jc, com.tencent.mm.plugin.appbrand.ui.vc
    public void setAppServiceType(int i17) {
        if (i17 != this.f89629y) {
            this.f89629y = i17;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.x0.b(this)) {
                try {
                    S(getContext().getResources().getConfiguration());
                } catch (java.lang.Exception unused) {
                }
            }
            R(getCapsuleBarImplView());
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.hc, com.tencent.mm.plugin.appbrand.ui.jc, com.tencent.mm.plugin.appbrand.ui.vc
    public void setCanShowHideAnimation(boolean z17) {
        this.L = z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setLabelInjector(com.tencent.mm.plugin.appbrand.ui.l9 r13) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.ui.c9.setLabelInjector(com.tencent.mm.plugin.appbrand.ui.l9):void");
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.hc, com.tencent.mm.plugin.appbrand.ui.jc, com.tencent.mm.plugin.appbrand.ui.vc
    public void setProgress(int i17) {
        this.B.setProgress(i17);
    }

    public void setTheme(k91.b1 b1Var) {
        this.I = b1Var;
        this.C.setBackgroundColor(getBgColor());
        this.A.setTextColor(getNameTextColor());
    }

    public c9(android.content.Context context, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        super(context);
        this.I = k91.b1.f305540d;
        this.L = true;
        this.M = false;
        this.N = new java.util.LinkedHashSet();
        this.f89628x = appBrandRuntime;
        this.f89629y = appBrandRuntime.u0() instanceof com.tencent.luggage.sdk.config.AppBrandInitConfigLU ? ((com.tencent.luggage.sdk.config.AppBrandInitConfigLU) this.f89628x.u0()).f47284z : 0;
        O();
    }
}
