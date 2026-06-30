package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class w4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.hc implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.y4 {
    public android.widget.ImageView A;
    public android.widget.LinearLayout B;
    public android.widget.TextView C;
    public android.widget.TextView D;
    public android.widget.TextView E;
    public android.widget.LinearLayout F;
    public android.widget.LinearLayout G;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12640x8cdfe408 H;
    public mi1.i I;

    /* renamed from: J, reason: collision with root package name */
    public xi1.o f171824J;
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
    public java.lang.Boolean f171825l1;

    /* renamed from: p0, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.ui.C11876xb1c2d378 f171826p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f171827p1;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f171828x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f171829x0;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.ImageView f171830y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f171831y0;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f171832z;

    public w4(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        super(context);
        this.f171824J = xi1.o.PORTRAIT;
        this.M = null;
        this.P = false;
        this.Q = false;
        this.R = false;
        this.T = false;
        this.U = 30;
        this.f171827p1 = false;
        this.f171828x = o6Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandGameUILoadingSplash", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569629h6, this);
        this.V = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.f564647wy);
        this.W = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f564648wz);
        this.f171826p0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.ui.C11876xb1c2d378) findViewById(com.p314xaae8f345.mm.R.id.f564649x0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.j.a().b(999, 1);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_appbrand_game_splashscreen, false) && o6Var != null) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = o6Var.u0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11828xf29fad17 c11828xf29fad17 = u07.N.f158982i;
            java.lang.String str = c11828xf29fad17 == null ? null : c11828xf29fad17.f158975d;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.j.a().b(1000, 0);
            } else {
                this.P = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandGameUILoadingSplash", "loadingImgUrl:%s", str);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.j.a().b(1000, 1);
                p95.a.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.m4(this, str, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.l4(this, elapsedRealtime)));
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11828xf29fad17 c11828xf29fad172 = u07.N.f158982i;
                java.lang.String str2 = c11828xf29fad172 == null ? null : c11828xf29fad172.f158976e;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    int color = getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560175cy);
                    this.S = color;
                    this.f171826p0.m50367x7d38f3f4(color);
                } else {
                    int parseColor = android.graphics.Color.parseColor(str2);
                    this.S = parseColor;
                    this.f171826p0.m50367x7d38f3f4(parseColor);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandGameUILoadingSplash", "loadingProgressBarColor:%s", java.lang.Integer.valueOf(this.S));
                }
                this.f171826p0.m50364x472cc825(true);
                this.f171826p0.m50368x411532f5(true);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.n4(this), 1000L);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.o4(this), 2000L);
            }
        }
        this.N = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.f564659xa);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f564654x5);
        this.f171830y = imageView;
        imageView.setImageDrawable(l01.a.h());
        this.C = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564658x9);
        this.f171832z = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f564661xc);
        this.B = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.vce);
        this.G = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f564651x2);
        this.K = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ilx);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12640x8cdfe408 c12640x8cdfe408 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12640x8cdfe408) findViewById(com.p314xaae8f345.mm.R.id.f564657x8);
        this.H = c12640x8cdfe408;
        c12640x8cdfe408.m52901x6ab8beb1(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28));
        this.H.m52904xc5493c7f(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561604n7));
        this.H.m52903xc4323e1c(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        this.H.m52902xc03f473c(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561603n6));
        this.H.m52906x7d38f3f4(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        this.H.m52907x7e4ff257(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561605n8));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            this.H.m52908xbf0ba007(Integer.MAX_VALUE);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.B.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f171832z.getLayoutParams();
        this.I = (mi1.i) o6Var.s0().a(getContext(), mi1.i.class);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 21;
        boolean b17 = xi1.o.b(o6Var.mo48803xee5260a9().mo51612x60543150().a());
        mi1.f3.c(this.I, this.G.getContext(), b17);
        this.G.addView(this.I, layoutParams3);
        mi1.f3.b(this.G, b17);
        android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) this.f171826p0.getLayoutParams();
        xi1.o a17 = o6Var.mo48803xee5260a9().mo51612x60543150().a();
        this.f171824J = a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandGameUILoadingSplash", "mLastDeviceOrientation :%s", a17);
        xi1.o oVar = this.f171824J;
        if (oVar == xi1.o.LANDSCAPE_SENSOR || oVar == xi1.o.LANDSCAPE_LOCKED || oVar == xi1.o.LANDSCAPE_LEFT || oVar == xi1.o.LANDSCAPE_RIGHT) {
            if (this.B.getVisibility() == 0) {
                layoutParams2.bottomMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561592mv);
                layoutParams.topMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561596mz);
                this.B.setLayoutParams(layoutParams);
            } else {
                layoutParams2.bottomMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561593mw);
            }
            layoutParams4.bottomMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561584mn);
            layoutParams4.width = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561585mo);
        } else {
            if (this.B.getVisibility() == 0) {
                layoutParams2.bottomMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561593mw);
                layoutParams.topMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561598n1);
                this.B.setLayoutParams(layoutParams);
            } else {
                layoutParams2.bottomMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561593mw);
            }
            layoutParams4.width = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561587mq);
            layoutParams4.bottomMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561586mp);
        }
        this.f171826p0.setLayoutParams(layoutParams4);
        this.f171832z.setLayoutParams(layoutParams2);
        B(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c), true, true);
        if (k01.j.f384572a.b(null, o6Var.f156336n)) {
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.h8s);
            this.E = textView;
            android.widget.RelativeLayout.LayoutParams layoutParams5 = (android.widget.RelativeLayout.LayoutParams) textView.getLayoutParams();
            layoutParams5.bottomMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561564m4);
            layoutParams5.addRule(2, this.C.getId());
            this.E.setLayoutParams(layoutParams5);
            this.E.setVisibility(0);
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.f564656x7);
            android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams6.bottomMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.ajg);
            frameLayout.setLayoutParams(layoutParams6);
            this.I.setVisibility(8);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.m0u);
            this.F = linearLayout;
            android.widget.RelativeLayout.LayoutParams layoutParams7 = (android.widget.RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams7.rightMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561600n3);
            layoutParams7.leftMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561600n3);
            layoutParams7.topMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561608nb);
            this.F.setLayoutParams(layoutParams7);
            this.F.setVisibility(0);
            ((android.widget.ImageButton) findViewById(com.p314xaae8f345.mm.R.id.ham)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.h4(this));
            android.view.ViewGroup.LayoutParams layoutParams8 = this.f171832z.getLayoutParams();
            layoutParams8.height = i65.a.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.ajh);
            layoutParams8.width = i65.a.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.aji);
            if (this.f171825l1 == null) {
                this.f171825l1 = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.ui.bk.C());
            }
            if (this.f171825l1.booleanValue()) {
                this.f171832z.setImageDrawable(getContext().getDrawable(com.p314xaae8f345.mm.R.raw.f78461xd5adaf32));
            } else {
                this.f171832z.setImageDrawable(getContext().getDrawable(com.p314xaae8f345.mm.R.raw.f78462xe061d50d));
            }
            ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564653x4)).setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cld));
        } else {
            this.I.setBackgroundColor(0);
            mi1.i iVar = this.I;
            if (this.f171825l1 == null) {
                this.f171825l1 = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.ui.bk.C());
            }
            iVar.m147354x23320e34(this.f171825l1.booleanValue() ? -1 : -16777216);
            this.I.m147352x4dad334a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.t4(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.na.g(getContext(), true);
        if (!this.P) {
            this.H.f();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f564658x9));
        arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f564050go));
        arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f564049gn));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.d(arrayList, this);
        this.D = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564653x4);
        this.D.setTextSize(0, i65.a.g(getContext()) * 11.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.h7.a(this.f171830y, this.H, this.C);
        if (!u46.l.e(o6Var.u0().f158819o) && !o6Var.u0().f158819o.equals("[]")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.td.f171776a.a(this.B, o6Var.u0().f158819o, true);
        }
        if (this.B.getChildCount() > 0) {
            this.B.setVisibility(0);
        } else {
            this.B.setVisibility(8);
        }
        this.A = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f564652x3);
        if (o6Var.u0().f158820p <= 0) {
            this.A.setVisibility(8);
            this.D.setGravity(17);
            return;
        }
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandGameUILoadingSplash", "setAgeAppropriateImageView ageAppropriateLevel:%d,ageAppropriateIcon:%s", java.lang.Integer.valueOf(o6Var.u0().f158820p), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b().Y);
            java.lang.String str3 = (java.lang.String) new cl0.g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b().Y).get(java.lang.String.valueOf(o6Var.u0().f158820p));
            if (str3 != null) {
                this.D.setGravity(19);
                this.A.setVisibility(0);
                this.A.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.i4(this, "https://game.weixin.qq.com/cgi-bin/minigame/static/age-tips/index.html?appid=" + o6Var.f156336n + "&age=" + o6Var.u0().f158820p + "#wechat_redirect"));
                l01.d0.f396294a.b(this.A, str3, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.j4(this));
                return;
            }
        } catch (cl0.f e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandGameUILoadingSplash", e17, "JSONException: setAgeAppropriateImageView ageAppropriateIcon age error", new java.lang.Object[0]);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandGameUILoadingSplash", e18, "Exception: setAgeAppropriateImageView ageAppropriateIcon age error", new java.lang.Object[0]);
        }
        this.A.setVisibility(8);
        this.D.setGravity(17);
    }

    public static void K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w4 w4Var) {
        if (w4Var.R && w4Var.Q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandGameUILoadingSplash", "showCutomView");
            w4Var.V.setVisibility(0);
            w4Var.N.setVisibility(4);
            w4Var.f171826p0.bringToFront();
            w4Var.G.bringToFront();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.jc
    public java.lang.String D() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f171828x;
        return "AppBrandGameUILoadingSplash:" + (o6Var == null ? "null" : o6Var.f156336n);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.y4
    public void E(int i17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.s4(this, i17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.jc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    /* renamed from: getView */
    public android.view.View mo52965xfb86a31b() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    public void j(java.lang.String str, java.lang.String str2) {
        l01.b bVar = l01.d0.f396294a;
        android.widget.ImageView imageView = this.f171830y;
        l01.q0 q0Var = l01.q0.f396320d;
        bVar.b(imageView, str, null, q0Var);
        this.C.setText(str2);
        k01.j jVar = k01.j.f384572a;
        if (jVar.b(null, this.f171828x.f156336n)) {
            this.C.setTypeface(android.graphics.Typeface.create("sans-serif-normal", 1));
            this.C.setTextSize(1, 20.0f);
            if (this.f171828x.u0().C1 != null) {
                java.lang.String str3 = (java.lang.String) jVar.a(this.f171828x.u0().C1.f158737e, "developer");
                if (str3 != null) {
                    this.E.setText(str3);
                    this.E.setTextSize(1, 17.0f);
                }
                java.lang.String str4 = (java.lang.String) jVar.a(this.f171828x.u0().C1.f158737e, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                if (str4 != null) {
                    this.C.setText(str4);
                }
                java.lang.String str5 = (java.lang.String) jVar.a(this.f171828x.u0().C1.f158737e, "icon");
                if (str5 != null) {
                    bVar.b(this.f171830y, str5, null, q0Var);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    public void k(int i17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    public void n(yz5.a aVar) {
        this.f171827p1 = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandGameUILoadingSplash", "animateHide");
        post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.r4(this, aVar));
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
        xi1.o a17 = this.f171828x.mo48803xee5260a9().mo51612x60543150().a();
        if (a17 != this.f171824J) {
            this.f171824J = a17;
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.B.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f171826p0.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) this.f171832z.getLayoutParams();
            if (a17 == xi1.o.LANDSCAPE_SENSOR || a17 == xi1.o.LANDSCAPE_LOCKED || a17 == xi1.o.LANDSCAPE_LEFT || a17 == xi1.o.LANDSCAPE_RIGHT) {
                if (this.B.getVisibility() == 0) {
                    layoutParams3.bottomMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561592mv);
                    layoutParams.topMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561596mz);
                    this.B.setLayoutParams(layoutParams);
                } else {
                    layoutParams3.bottomMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561593mw);
                }
                layoutParams2.width = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561585mo);
                layoutParams2.bottomMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561584mn);
            } else {
                if (this.B.getVisibility() == 0) {
                    layoutParams3.bottomMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561593mw);
                    layoutParams.topMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561598n1);
                    this.B.setLayoutParams(layoutParams);
                } else {
                    layoutParams3.bottomMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561593mw);
                }
                layoutParams2.width = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561587mq);
                layoutParams2.bottomMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561586mp);
            }
            this.f171826p0.setLayoutParams(layoutParams2);
            this.f171832z.setLayoutParams(layoutParams3);
            boolean b17 = xi1.o.b(a17);
            mi1.f3.c(this.I, this.G.getContext(), b17);
            mi1.f3.b(this.G, b17);
            requestLayout();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.hc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.jc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    /* renamed from: setProgress */
    public void mo52970x3ae760af(int i17) {
        if (!this.P) {
            if (i17 < 100) {
                this.H.m52905x3ae760af(i17 / 2);
                return;
            } else {
                if (this.f171829x0) {
                    return;
                }
                this.f171829x0 = true;
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.v4(this, null), true).c(0L, 50L);
                return;
            }
        }
        if (!this.Q && this.T) {
            if (i17 < 100) {
                this.H.m52905x3ae760af(i17 / 2);
                return;
            } else {
                if (this.f171829x0) {
                    return;
                }
                this.f171829x0 = true;
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.v4(this, null), true).c(0L, 100L);
                return;
            }
        }
        if (i17 < 100) {
            if (this.V.getVisibility() == 0) {
                this.f171826p0.m50366x3ae760af(i17 / 2.0f);
            }
        } else {
            if (this.f171831y0) {
                return;
            }
            this.f171831y0 = true;
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u4(this, null), true).c(0L, 1000 / this.U);
        }
    }
}
