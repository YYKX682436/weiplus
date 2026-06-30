package com.tencent.mm.plugin.appbrand.ui;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class w4 extends com.tencent.mm.plugin.appbrand.ui.hc implements com.tencent.mm.plugin.appbrand.launching.y4 {
    public android.widget.ImageView A;
    public android.widget.LinearLayout B;
    public android.widget.TextView C;
    public android.widget.TextView D;
    public android.widget.TextView E;
    public android.widget.LinearLayout F;
    public android.widget.LinearLayout G;
    public com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView H;
    public mi1.i I;

    /* renamed from: J, reason: collision with root package name */
    public xi1.o f90291J;
    public android.widget.TextView K;
    public boolean L;
    public java.lang.Runnable M;
    public android.widget.RelativeLayout N;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public boolean T;
    public final int U;
    public android.widget.RelativeLayout V;
    public android.widget.ImageView W;

    /* renamed from: l1, reason: collision with root package name */
    public java.lang.Boolean f90292l1;

    /* renamed from: p0, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.game.preload.ui.BootstrapProgressBar f90293p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f90294p1;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f90295x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f90296x0;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.ImageView f90297y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f90298y0;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f90299z;

    public w4(android.content.Context context, com.tencent.mm.plugin.appbrand.o6 o6Var) {
        super(context);
        this.f90291J = xi1.o.PORTRAIT;
        this.M = null;
        this.P = false;
        this.Q = false;
        this.R = false;
        this.T = false;
        this.U = 30;
        this.f90294p1 = false;
        this.f90295x = o6Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandGameUILoadingSplash", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f488096h6, this);
        this.V = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.f483114wy);
        this.W = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f483115wz);
        this.f90293p0 = (com.tencent.mm.plugin.appbrand.game.preload.ui.BootstrapProgressBar) findViewById(com.tencent.mm.R.id.f483116x0);
        com.tencent.mm.plugin.appbrand.game.preload.j.a().b(999, 1);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_appbrand_game_splashscreen, false) && o6Var != null) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = o6Var.u0();
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionCoverImageInfo wxaAttributes$WxaVersionCoverImageInfo = u07.N.f77449i;
            java.lang.String str = wxaAttributes$WxaVersionCoverImageInfo == null ? null : wxaAttributes$WxaVersionCoverImageInfo.f77442d;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mm.plugin.appbrand.game.preload.j.a().b(1000, 0);
            } else {
                this.P = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandGameUILoadingSplash", "loadingImgUrl:%s", str);
                com.tencent.mm.plugin.appbrand.game.preload.j.a().b(1000, 1);
                p95.a.a(new com.tencent.mm.plugin.appbrand.ui.m4(this, str, new com.tencent.mm.plugin.appbrand.ui.l4(this, elapsedRealtime)));
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionCoverImageInfo wxaAttributes$WxaVersionCoverImageInfo2 = u07.N.f77449i;
                java.lang.String str2 = wxaAttributes$WxaVersionCoverImageInfo2 == null ? null : wxaAttributes$WxaVersionCoverImageInfo2.f77443e;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    int color = getContext().getResources().getColor(com.tencent.mm.R.color.f478642cy);
                    this.S = color;
                    this.f90293p0.setProgressColor(color);
                } else {
                    int parseColor = android.graphics.Color.parseColor(str2);
                    this.S = parseColor;
                    this.f90293p0.setProgressColor(parseColor);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandGameUILoadingSplash", "loadingProgressBarColor:%s", java.lang.Integer.valueOf(this.S));
                }
                this.f90293p0.setAnimated(true);
                this.f90293p0.setStriped(true);
                com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.appbrand.ui.n4(this), 1000L);
                com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.appbrand.ui.o4(this), 2000L);
            }
        }
        this.N = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.f483126xa);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f483121x5);
        this.f90297y = imageView;
        imageView.setImageDrawable(l01.a.h());
        this.C = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483125x9);
        this.f90299z = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f483128xc);
        this.B = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.vce);
        this.G = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f483118x2);
        this.K = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ilx);
        com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView appBrandCircleProgressView = (com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView) findViewById(com.tencent.mm.R.id.f483124x8);
        this.H = appBrandCircleProgressView;
        appBrandCircleProgressView.setCircleColor(getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_1));
        this.H.setDotWidth(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480071n7));
        this.H.setDotColor(getResources().getColor(com.tencent.mm.R.color.f478502m));
        this.H.setCircleStrokeWidth(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480070n6));
        this.H.setProgressColor(getResources().getColor(com.tencent.mm.R.color.f478502m));
        this.H.setProgressWidth(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480072n8));
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            this.H.setTransitionTimingMs(Integer.MAX_VALUE);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.B.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f90299z.getLayoutParams();
        this.I = (mi1.i) o6Var.s0().a(getContext(), mi1.i.class);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 21;
        boolean b17 = xi1.o.b(o6Var.getWindowAndroid().getOrientationHandler().a());
        mi1.f3.c(this.I, this.G.getContext(), b17);
        this.G.addView(this.I, layoutParams3);
        mi1.f3.b(this.G, b17);
        android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) this.f90293p0.getLayoutParams();
        xi1.o a17 = o6Var.getWindowAndroid().getOrientationHandler().a();
        this.f90291J = a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandGameUILoadingSplash", "mLastDeviceOrientation :%s", a17);
        xi1.o oVar = this.f90291J;
        if (oVar == xi1.o.LANDSCAPE_SENSOR || oVar == xi1.o.LANDSCAPE_LOCKED || oVar == xi1.o.LANDSCAPE_LEFT || oVar == xi1.o.LANDSCAPE_RIGHT) {
            if (this.B.getVisibility() == 0) {
                layoutParams2.bottomMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480059mv);
                layoutParams.topMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480063mz);
                this.B.setLayoutParams(layoutParams);
            } else {
                layoutParams2.bottomMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480060mw);
            }
            layoutParams4.bottomMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480051mn);
            layoutParams4.width = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480052mo);
        } else {
            if (this.B.getVisibility() == 0) {
                layoutParams2.bottomMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480060mw);
                layoutParams.topMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480065n1);
                this.B.setLayoutParams(layoutParams);
            } else {
                layoutParams2.bottomMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480060mw);
            }
            layoutParams4.width = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480054mq);
            layoutParams4.bottomMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480053mp);
        }
        this.f90293p0.setLayoutParams(layoutParams4);
        this.f90299z.setLayoutParams(layoutParams2);
        B(getResources().getColor(com.tencent.mm.R.color.f478491c), true, true);
        if (k01.j.f303039a.b(null, o6Var.f74803n)) {
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h8s);
            this.E = textView;
            android.widget.RelativeLayout.LayoutParams layoutParams5 = (android.widget.RelativeLayout.LayoutParams) textView.getLayoutParams();
            layoutParams5.bottomMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480031m4);
            layoutParams5.addRule(2, this.C.getId());
            this.E.setLayoutParams(layoutParams5);
            this.E.setVisibility(0);
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.f483123x7);
            android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams6.bottomMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.ajg);
            frameLayout.setLayoutParams(layoutParams6);
            this.I.setVisibility(8);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.m0u);
            this.F = linearLayout;
            android.widget.RelativeLayout.LayoutParams layoutParams7 = (android.widget.RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams7.rightMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480067n3);
            layoutParams7.leftMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480067n3);
            layoutParams7.topMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480075nb);
            this.F.setLayoutParams(layoutParams7);
            this.F.setVisibility(0);
            ((android.widget.ImageButton) findViewById(com.tencent.mm.R.id.ham)).setOnClickListener(new com.tencent.mm.plugin.appbrand.ui.h4(this));
            android.view.ViewGroup.LayoutParams layoutParams8 = this.f90299z.getLayoutParams();
            layoutParams8.height = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.ajh);
            layoutParams8.width = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aji);
            if (this.f90292l1 == null) {
                this.f90292l1 = java.lang.Boolean.valueOf(com.tencent.mm.ui.bk.C());
            }
            if (this.f90292l1.booleanValue()) {
                this.f90299z.setImageDrawable(getContext().getDrawable(com.tencent.mm.R.raw.app_brand_loading_litegame_night));
            } else {
                this.f90299z.setImageDrawable(getContext().getDrawable(com.tencent.mm.R.raw.app_brand_loading_litegame_normal));
            }
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.f483120x4)).setText(getContext().getString(com.tencent.mm.R.string.cld));
        } else {
            this.I.setBackgroundColor(0);
            mi1.i iVar = this.I;
            if (this.f90292l1 == null) {
                this.f90292l1 = java.lang.Boolean.valueOf(com.tencent.mm.ui.bk.C());
            }
            iVar.setStyleColor(this.f90292l1.booleanValue() ? -1 : -16777216);
            this.I.setHomeButtonOnClickListener(new com.tencent.mm.plugin.appbrand.ui.t4(this));
        }
        com.tencent.mm.plugin.appbrand.ui.na.g(getContext(), true);
        if (!this.P) {
            this.H.f();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f483125x9));
        arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f482517go));
        arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.f482516gn));
        com.tencent.mm.plugin.appbrand.ui.u5.d(arrayList, this);
        this.D = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483120x4);
        this.D.setTextSize(0, i65.a.g(getContext()) * 11.0f);
        com.tencent.mm.plugin.appbrand.ui.h7.a(this.f90297y, this.H, this.C);
        if (!u46.l.e(o6Var.u0().f77286o) && !o6Var.u0().f77286o.equals("[]")) {
            com.tencent.mm.plugin.appbrand.ui.td.f90243a.a(this.B, o6Var.u0().f77286o, true);
        }
        if (this.B.getChildCount() > 0) {
            this.B.setVisibility(0);
        } else {
            this.B.setVisibility(8);
        }
        this.A = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f483119x3);
        if (o6Var.u0().f77287p <= 0) {
            this.A.setVisibility(8);
            this.D.setGravity(17);
            return;
        }
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandGameUILoadingSplash", "setAgeAppropriateImageView ageAppropriateLevel:%d,ageAppropriateIcon:%s", java.lang.Integer.valueOf(o6Var.u0().f77287p), com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().Y);
            java.lang.String str3 = (java.lang.String) new cl0.g(com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().Y).get(java.lang.String.valueOf(o6Var.u0().f77287p));
            if (str3 != null) {
                this.D.setGravity(19);
                this.A.setVisibility(0);
                this.A.setOnClickListener(new com.tencent.mm.plugin.appbrand.ui.i4(this, "https://game.weixin.qq.com/cgi-bin/minigame/static/age-tips/index.html?appid=" + o6Var.f74803n + "&age=" + o6Var.u0().f77287p + "#wechat_redirect"));
                l01.d0.f314761a.b(this.A, str3, null, new com.tencent.mm.plugin.appbrand.ui.j4(this));
                return;
            }
        } catch (cl0.f e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandGameUILoadingSplash", e17, "JSONException: setAgeAppropriateImageView ageAppropriateIcon age error", new java.lang.Object[0]);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandGameUILoadingSplash", e18, "Exception: setAgeAppropriateImageView ageAppropriateIcon age error", new java.lang.Object[0]);
        }
        this.A.setVisibility(8);
        this.D.setGravity(17);
    }

    public static void K(com.tencent.mm.plugin.appbrand.ui.w4 w4Var) {
        if (w4Var.R && w4Var.Q) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandGameUILoadingSplash", "showCutomView");
            w4Var.V.setVisibility(0);
            w4Var.N.setVisibility(4);
            w4Var.f90293p0.bringToFront();
            w4Var.G.bringToFront();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.jc
    public java.lang.String D() {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f90295x;
        return "AppBrandGameUILoadingSplash:" + (o6Var == null ? "null" : o6Var.f74803n);
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.y4
    public void E(int i17) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.ui.s4(this, i17));
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.jc, com.tencent.mm.plugin.appbrand.ui.vc
    public android.view.View getView() {
        return this;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.vc
    public void j(java.lang.String str, java.lang.String str2) {
        l01.b bVar = l01.d0.f314761a;
        android.widget.ImageView imageView = this.f90297y;
        l01.q0 q0Var = l01.q0.f314787d;
        bVar.b(imageView, str, null, q0Var);
        this.C.setText(str2);
        k01.j jVar = k01.j.f303039a;
        if (jVar.b(null, this.f90295x.f74803n)) {
            this.C.setTypeface(android.graphics.Typeface.create("sans-serif-normal", 1));
            this.C.setTextSize(1, 20.0f);
            if (this.f90295x.u0().C1 != null) {
                java.lang.String str3 = (java.lang.String) jVar.a(this.f90295x.u0().C1.f77204e, "developer");
                if (str3 != null) {
                    this.E.setText(str3);
                    this.E.setTextSize(1, 17.0f);
                }
                java.lang.String str4 = (java.lang.String) jVar.a(this.f90295x.u0().C1.f77204e, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                if (str4 != null) {
                    this.C.setText(str4);
                }
                java.lang.String str5 = (java.lang.String) jVar.a(this.f90295x.u0().C1.f77204e, "icon");
                if (str5 != null) {
                    bVar.b(this.f90297y, str5, null, q0Var);
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.vc
    public void k(int i17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.vc
    public void n(yz5.a aVar) {
        this.f90294p1 = true;
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandGameUILoadingSplash", "animateHide");
        post(new com.tencent.mm.plugin.appbrand.ui.r4(this, aVar));
    }

    @Override // android.view.View
    public void onCancelPendingInputEvents() {
        super.onCancelPendingInputEvents();
        mi1.i iVar = this.I;
        if (iVar != null) {
            iVar.cancelPendingInputEvents();
        }
    }

    @Override // vj5.h, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        xi1.o a17 = this.f90295x.getWindowAndroid().getOrientationHandler().a();
        if (a17 != this.f90291J) {
            this.f90291J = a17;
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.B.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f90293p0.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) this.f90299z.getLayoutParams();
            if (a17 == xi1.o.LANDSCAPE_SENSOR || a17 == xi1.o.LANDSCAPE_LOCKED || a17 == xi1.o.LANDSCAPE_LEFT || a17 == xi1.o.LANDSCAPE_RIGHT) {
                if (this.B.getVisibility() == 0) {
                    layoutParams3.bottomMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480059mv);
                    layoutParams.topMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480063mz);
                    this.B.setLayoutParams(layoutParams);
                } else {
                    layoutParams3.bottomMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480060mw);
                }
                layoutParams2.width = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480052mo);
                layoutParams2.bottomMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480051mn);
            } else {
                if (this.B.getVisibility() == 0) {
                    layoutParams3.bottomMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480060mw);
                    layoutParams.topMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480065n1);
                    this.B.setLayoutParams(layoutParams);
                } else {
                    layoutParams3.bottomMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480060mw);
                }
                layoutParams2.width = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480054mq);
                layoutParams2.bottomMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480053mp);
            }
            this.f90293p0.setLayoutParams(layoutParams2);
            this.f90299z.setLayoutParams(layoutParams3);
            boolean b17 = xi1.o.b(a17);
            mi1.f3.c(this.I, this.G.getContext(), b17);
            mi1.f3.b(this.G, b17);
            requestLayout();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.hc, com.tencent.mm.plugin.appbrand.ui.jc, com.tencent.mm.plugin.appbrand.ui.vc
    public void setProgress(int i17) {
        if (!this.P) {
            if (i17 < 100) {
                this.H.setProgress(i17 / 2);
                return;
            } else {
                if (this.f90296x0) {
                    return;
                }
                this.f90296x0 = true;
                new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.appbrand.ui.v4(this, null), true).c(0L, 50L);
                return;
            }
        }
        if (!this.Q && this.T) {
            if (i17 < 100) {
                this.H.setProgress(i17 / 2);
                return;
            } else {
                if (this.f90296x0) {
                    return;
                }
                this.f90296x0 = true;
                new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.appbrand.ui.v4(this, null), true).c(0L, 100L);
                return;
            }
        }
        if (i17 < 100) {
            if (this.V.getVisibility() == 0) {
                this.f90293p0.setProgress(i17 / 2.0f);
            }
        } else {
            if (this.f90298y0) {
                return;
            }
            this.f90298y0 = true;
            new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.appbrand.ui.u4(this, null), true).c(0L, 1000 / this.U);
        }
    }
}
