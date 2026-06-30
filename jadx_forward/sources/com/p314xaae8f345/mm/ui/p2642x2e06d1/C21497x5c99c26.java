package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMGridPaper */
/* loaded from: classes15.dex */
public final class C21497x5c99c26 extends android.widget.LinearLayout {
    public static final /* synthetic */ int N = 0;
    public int A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f278930J;
    public boolean K;
    public final db5.y1 L;
    public final db5.z1 M;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21489xc8bb7d0 f278931d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21487xa86ce1ce f278932e;

    /* renamed from: f, reason: collision with root package name */
    public db5.v2 f278933f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f278934g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f278935h;

    /* renamed from: i, reason: collision with root package name */
    public int f278936i;

    /* renamed from: m, reason: collision with root package name */
    public int f278937m;

    /* renamed from: n, reason: collision with root package name */
    public int f278938n;

    /* renamed from: o, reason: collision with root package name */
    public int f278939o;

    /* renamed from: p, reason: collision with root package name */
    public int f278940p;

    /* renamed from: q, reason: collision with root package name */
    public int f278941q;

    /* renamed from: r, reason: collision with root package name */
    public int f278942r;

    /* renamed from: s, reason: collision with root package name */
    public int f278943s;

    /* renamed from: t, reason: collision with root package name */
    public int f278944t;

    /* renamed from: u, reason: collision with root package name */
    public int f278945u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f278946v;

    /* renamed from: w, reason: collision with root package name */
    public int f278947w;

    /* renamed from: x, reason: collision with root package name */
    public int f278948x;

    /* renamed from: y, reason: collision with root package name */
    public int f278949y;

    /* renamed from: z, reason: collision with root package name */
    public int f278950z;

    public C21497x5c99c26(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f278938n = 0;
        this.f278939o = 0;
        this.f278940p = 3;
        this.f278941q = 0;
        this.f278942r = 3 - 1;
        this.f278943s = 0;
        this.f278944t = 0;
        this.f278945u = 0;
        this.f278946v = false;
        this.f278947w = 9;
        this.f278948x = -1;
        this.f278949y = -1;
        this.f278950z = 96;
        this.A = 96;
        this.B = 10;
        this.C = 10;
        this.D = false;
        this.E = false;
        this.F = -1;
        this.G = -1;
        this.H = 0;
        this.I = -1;
        this.f278930J = -1;
        this.K = false;
        this.L = new db5.p2(this);
        this.M = new db5.s2(this);
        this.f278935h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.bym, this);
        this.H = m78985x60c5290e();
    }

    public static void a(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21497x5c99c26 c21497x5c99c26, int i17) {
        int i18 = c21497x5c99c26.f278941q + i17;
        c21497x5c99c26.f278941q = i18;
        if (i18 < 0) {
            c21497x5c99c26.f278941q = 0;
        } else {
            int i19 = c21497x5c99c26.f278943s - c21497x5c99c26.f278940p;
            if (i18 > i19) {
                c21497x5c99c26.f278941q = i19;
            }
        }
        c21497x5c99c26.f278942r = (c21497x5c99c26.f278941q + c21497x5c99c26.f278940p) - 1;
    }

    /* renamed from: getCurrentPage */
    private com.p314xaae8f345.mm.ui.p2642x2e06d1.C21498xf966a151 m78984xfdaa7672() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21489xc8bb7d0 c21489xc8bb7d0 = this.f278931d;
        return (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21498xf966a151) c21489xc8bb7d0.getChildAt(c21489xc8bb7d0.m78923xf19ef016());
    }

    /* renamed from: getScreenOrientation */
    private int m78985x60c5290e() {
        android.view.Display defaultDisplay = ((android.view.WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        return defaultDisplay.getWidth() < defaultDisplay.getHeight() ? 1 : 2;
    }

    public final void b() {
        if (-1 != this.f278948x && m78985x60c5290e() == 2) {
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.gto);
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) findViewById.getLayoutParams();
            int b17 = i65.a.b(getContext(), this.f278948x);
            if (b17 != layoutParams.height) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMGridPaper", "set land mode, special height is %d", java.lang.Integer.valueOf(this.f278948x));
                layoutParams.height = b17;
                findViewById.setLayoutParams(layoutParams);
                this.f278935h.mo50293x3498a0(new db5.n2(this));
                return;
            }
            return;
        }
        if (-1 == this.f278949y || m78985x60c5290e() != 1) {
            return;
        }
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.gto);
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) findViewById2.getLayoutParams();
        int b18 = i65.a.b(getContext(), this.f278949y);
        if (b18 != layoutParams2.height) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMGridPaper", "set port mode, special height is %d", java.lang.Integer.valueOf(this.f278949y));
            layoutParams2.height = b18;
            findViewById2.setLayoutParams(layoutParams2);
            this.f278935h.mo50293x3498a0(new db5.o2(this));
        }
    }

    public final int c(int i17, int i18) {
        int i19 = 0;
        if (i18 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMGridPaper", "ceil:total[%d], length[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return 0;
        }
        int i27 = i17;
        while (i27 > 0) {
            i27 -= i18;
            i19++;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMGridPaper", "ceil:num[%d], length[%d], result[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        return i19;
    }

    public final void d() {
        if (this.f278932e == null) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21487xa86ce1ce c21487xa86ce1ce = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21487xa86ce1ce) findViewById(com.p314xaae8f345.mm.R.id.gtp);
            this.f278932e = c21487xa86ce1ce;
            c21487xa86ce1ce.m78921x8d59188d(this.f278947w);
        }
        if (this.f278931d == null) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21489xc8bb7d0 c21489xc8bb7d0 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21489xc8bb7d0) findViewById(com.p314xaae8f345.mm.R.id.gtq);
            this.f278931d = c21489xc8bb7d0;
            c21489xc8bb7d0.m78926xb5627411(this.L);
            this.f278931d.m78927xe7c66a1b(this.M);
        }
        b();
        e();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2642x2e06d1.C21497x5c99c26.e():void");
    }

    public final void f() {
        iz5.a.g(null, this.f278943s >= 0);
        this.f278932e.m78919xc4325fc8(this.f278943s);
        if (this.f278933f == null || this.f278943s <= 1) {
            this.f278932e.setVisibility(8);
        } else {
            this.f278932e.setVisibility(0);
        }
        int i17 = this.f278939o;
        int i18 = this.f278943s;
        if (i17 >= i18) {
            this.f278939o = i18 - 1;
        }
        this.f278931d.a(this.f278939o - this.f278941q);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21489xc8bb7d0 c21489xc8bb7d0 = this.f278931d;
        int i19 = this.f278939o;
        c21489xc8bb7d0.f278879h = i19;
        this.f278932e.m78922x7d600aec(i19);
    }

    /* renamed from: getItemsCountPerPage */
    public int m78986x9d359c67() {
        return this.f278945u * this.f278944t;
    }

    /* renamed from: getPageCount */
    public int m78987x328fb10a() {
        return this.f278943s;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        int i17 = configuration.orientation;
        if (i17 == 1 || i17 == 2) {
            this.D = true;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        if (this.H != m78985x60c5290e()) {
            this.H = m78985x60c5290e();
            this.D = true;
            clearAnimation();
            b();
            e();
        }
        super.onLayout(z17, i17, i18, i19, i27);
    }

    /* renamed from: setDialogMode */
    public void m78988xc9d3cd0d(boolean z17) {
        this.E = z17;
    }

    /* renamed from: setDisplayHeightLandInDp */
    public void m78989xe51a4583(int i17) {
        this.f278948x = i17;
    }

    /* renamed from: setDisplayHeightPortInDp */
    public void m78990x70eb1119(int i17) {
        this.f278949y = i17;
    }

    /* renamed from: setGridHeight */
    public void m78991x3253020f(int i17) {
        this.f278937m = i17;
    }

    /* renamed from: setGridPaperAdapter */
    public void m78992x7298b70b(db5.v2 v2Var) {
        this.f278933f = v2Var;
        db5.v2 v2Var2 = this.f278933f;
        if (v2Var2 != null) {
            v2Var2.f310085a = new db5.m2(this);
        }
        d();
    }

    /* renamed from: setGridWidth */
    public void m78993xa79dffde(int i17) {
        this.f278936i = i17;
    }

    /* renamed from: setHeaderView */
    public void m78994x924488d4(android.view.View view) {
        this.f278934g = view;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.gy6);
        viewGroup.removeAllViews();
        android.view.View view2 = this.f278934g;
        if (view2 != null) {
            viewGroup.addView(view2);
        }
    }

    /* renamed from: setItemHeightInDp */
    public void m78995xabfd8acd(int i17) {
        this.A = i17;
    }

    /* renamed from: setItemWidthInDp */
    public void m78996xd64d3c62(int i17) {
        this.f278950z = i17;
    }

    /* renamed from: setManualMeasureMode */
    public void m78997x6bed5039(boolean z17) {
        this.K = z17;
    }

    /* renamed from: setMaxCol */
    public void m78998x17db107e(int i17) {
        this.I = i17;
    }

    /* renamed from: setMaxDotCount */
    public void m78999x36fde108(int i17) {
        this.f278947w = i17;
    }

    /* renamed from: setMaxRow */
    public void m79000x17db48d8(int i17) {
        this.f278930J = i17;
    }

    /* renamed from: setOnPageSizeChangeListener */
    public void m79001xf376af15(db5.t2 t2Var) {
    }
}
