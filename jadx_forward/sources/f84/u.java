package f84;

/* loaded from: classes4.dex */
public abstract class u extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l {
    public f84.v A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public android.content.Context F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final android.os.Handler f341737J;
    public final jz5.g K;
    public final jz5.g L;
    public final f84.p M;
    public final f84.o N;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f341738o;

    /* renamed from: p, reason: collision with root package name */
    public final int f341739p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f341740q;

    /* renamed from: r, reason: collision with root package name */
    public final w64.n f341741r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f341742s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.FrameLayout f341743t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f341744u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f341745v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f341746w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f341747x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f341748y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f341749z;

    public u(java.lang.String str, p012xc85e97e9.p093xedfae76a.y yVar, android.view.View view, int i17, boolean z17, w64.n nVar) {
        super(str, yVar, view);
        this.f341738o = view;
        this.f341739p = i17;
        this.f341740q = z17;
        this.f341741r = nVar;
        this.f341742s = jz5.h.b(new f84.t(this));
        this.f341744u = jz5.h.b(new f84.l(this));
        this.f341745v = jz5.h.b(new f84.k(this));
        this.f341746w = jz5.h.b(new f84.q(this));
        this.f341747x = jz5.h.b(new f84.n(this));
        this.f341748y = jz5.h.b(new f84.s(this));
        this.f341737J = new android.os.Handler(android.os.Looper.getMainLooper());
        this.K = jz5.h.b(new f84.m(this));
        this.L = jz5.h.b(new f84.r(this));
        this.M = new f84.p(this);
        this.N = new f84.o(this);
    }

    public static final /* synthetic */ android.view.View y(f84.u uVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMLeftMaskView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        android.view.View C = uVar.C();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMLeftMaskView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        return C;
    }

    public static final /* synthetic */ android.widget.FrameLayout z(f84.u uVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMSnsAdBrandTopicView$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        android.widget.FrameLayout frameLayout = uVar.f341743t;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMSnsAdBrandTopicView$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        return frameLayout;
    }

    public final void A() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        if (this.F == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            return;
        }
        f84.v vVar = this.A;
        if (vVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            return;
        }
        f84.y a17 = vVar.a();
        if (a17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContainerWidth", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicInfo");
        int i17 = vVar.f341750a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContainerWidth", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBrandPreludeWidth", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.BrandPreludeInfo");
        int i18 = a17.f341760e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBrandPreludeWidth", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.BrandPreludeInfo");
        if (i17 <= 0 || i18 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(j(), "adBrandTopicWidth or brandPreludeWidth <= 0");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            return;
        }
        android.widget.FrameLayout frameLayout = this.f341743t;
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i19 = this.D;
            marginLayoutParams.width = i19;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContainerHeight", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicInfo");
            int i27 = vVar.f341751b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContainerHeight", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicInfo");
            marginLayoutParams.height = (i19 * i27) / i17;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 B = B();
        android.view.ViewGroup.LayoutParams layoutParams2 = B != null ? B.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            int i28 = (this.D * i18) / i17;
            marginLayoutParams2.width = i28;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBrandPreludeHeight", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.BrandPreludeInfo");
            int i29 = a17.f341761f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBrandPreludeHeight", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.BrandPreludeInfo");
            marginLayoutParams2.height = (i28 * i29) / i18;
        }
        android.view.View C = C();
        android.view.ViewGroup.LayoutParams layoutParams3 = C != null ? C.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
        if (marginLayoutParams3 != null) {
            int i37 = (this.D * 28) / i17;
            marginLayoutParams3.width = i37;
            marginLayoutParams3.height = (i37 * 73) / 28;
        }
        android.view.View E = E();
        android.view.ViewGroup.LayoutParams layoutParams4 = E != null ? E.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
        if (marginLayoutParams4 != null) {
            int i38 = this.D;
            int i39 = (i38 * 28) / i17;
            marginLayoutParams4.width = i39;
            marginLayoutParams4.height = (i39 * 73) / 28;
            marginLayoutParams4.leftMargin = i38 - i39;
        }
        android.widget.FrameLayout frameLayout2 = this.f341743t;
        if (frameLayout2 != null) {
            frameLayout2.requestLayout();
        }
        android.widget.FrameLayout frameLayout3 = this.f341743t;
        if (frameLayout3 != null) {
            frameLayout3.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 B() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMBrandPreludeLayout", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 c22642x62f5b194 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194) ((jz5.n) this.f341744u).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMBrandPreludeLayout", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        return c22642x62f5b194;
    }

    public final android.view.View C() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMLeftMaskView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        android.view.View view = (android.view.View) ((jz5.n) this.f341747x).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMLeftMaskView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        return view;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2131x66b71a6b.C17772x216496ad D() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMRecyclerView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2131x66b71a6b.C17772x216496ad c17772x216496ad = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2131x66b71a6b.C17772x216496ad) ((jz5.n) this.f341746w).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMRecyclerView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        return c17772x216496ad;
    }

    public final android.view.View E() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMRightMaskView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        android.view.View view = (android.view.View) ((jz5.n) this.f341748y).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMRightMaskView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        return view;
    }

    public final android.graphics.drawable.GradientDrawable F(android.graphics.drawable.GradientDrawable.Orientation orientation) {
        android.content.res.Resources resources;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMaskBackground", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        android.content.Context context = this.F;
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(orientation, new int[]{0, (context == null || (resources = context.getResources()) == null) ? 0 : resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c)});
        gradientDrawable.setGradientType(0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMaskBackground", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        return gradientDrawable;
    }

    public final void G(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, f84.v vVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initRecycleView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initRecycleView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            return;
        }
        if (vVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initRecycleView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            return;
        }
        if (!this.C) {
            this.C = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2131x66b71a6b.C17772x216496ad D = D();
            if (D != null) {
                D.setOverScrollMode(2);
                D.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context, 0, false));
                D.N(new f84.j(this));
                D.i(this.M);
                D.m7963x830bc99d(true);
                D.m7965x440a0e9(6);
            }
        }
        f84.d dVar = new f84.d(context, c17933xe8d1b226, vVar, D(), this.D);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnItemClickListener", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        dVar.f341714h = this.N;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnItemClickListener", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        dVar.mo8164xbbdced85(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2131x66b71a6b.C17772x216496ad D2 = D();
        if (D2 != null) {
            D2.mo7960x6cab2c8d(dVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initRecycleView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public void d(java.lang.Object obj, boolean z17) {
        android.view.View view;
        android.content.Context context;
        f84.y a17;
        r45.jj4 jj4Var;
        r45.jj4 jj4Var2;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        f84.y a18;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 model = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        java.lang.String j17 = j();
        try {
            view = this.f341738o;
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        if (view != null && (context = view.getContext()) != null) {
            this.F = context;
            if (!this.B) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMSnsAdBrandTopicStub", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                android.view.ViewStub viewStub = (android.view.ViewStub) ((jz5.n) this.f341742s).mo141623x754a37bb();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMSnsAdBrandTopicStub", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                android.view.View inflate = viewStub != null ? viewStub.inflate() : null;
                this.f341743t = inflate instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) inflate : null;
                this.B = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "bindComponentModel, snsId is " + ca4.z0.t0(model.f68891x29d1292e) + ", isSame is " + z17);
            this.f341749z = model;
            f84.v vVar = model.m70354x74235b3e().f38151xe359b1b9;
            if (vVar == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            }
            this.A = vVar;
            int y17 = ca4.m0.y(j(), this.F, this.f341739p, this.f341740q);
            this.D = y17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMRecyclerViewSpace", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            int intValue = ((java.lang.Number) ((jz5.n) this.L).mo141623x754a37bb()).intValue();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMRecyclerViewSpace", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            this.E = y17 + intValue;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 B = B();
            if (B != null) {
                B.setTranslationX(0.0f);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 B2 = B();
            if (B2 != null) {
                B2.setAlpha(1.0f);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2131x66b71a6b.C17772x216496ad D = D();
            if (D != null) {
                D.setTranslationX(-this.E);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2131x66b71a6b.C17772x216496ad D2 = D();
            if (D2 != null) {
                D2.setAlpha(0.0f);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 B3 = B();
            if (B3 != null) {
                android.content.Context context2 = this.F;
                f84.v vVar2 = this.A;
                if (vVar2 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContainerCornerRadius", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicInfo");
                    i17 = vVar2.f341752c;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContainerCornerRadius", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicInfo");
                } else {
                    i17 = 0;
                }
                B3.m81432x205ac394(i65.a.b(context2, i17));
            }
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                f84.v vVar3 = this.A;
                if (vVar3 != null && (a18 = vVar3.a()) != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBrandPreludeDarkMedia", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.BrandPreludeInfo");
                    jj4Var = a18.f341759d;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBrandPreludeDarkMedia", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.BrandPreludeInfo");
                    jj4Var2 = jj4Var;
                }
                jj4Var2 = null;
            } else {
                f84.v vVar4 = this.A;
                if (vVar4 != null && (a17 = vVar4.a()) != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBrandPreludeMedia", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.BrandPreludeInfo");
                    jj4Var = a17.f341758c;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBrandPreludeMedia", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.BrandPreludeInfo");
                    jj4Var2 = jj4Var;
                }
                jj4Var2 = null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMBrandPreludeIcon", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.f341745v).mo141623x754a37bb();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMBrandPreludeIcon", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            android.content.Context context3 = this.F;
            int hashCode = context3 != null ? context3.hashCode() : 0;
            com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var = com.p314xaae8f345.mm.p2621x8fb0427b.s7.f276841l;
            s7Var.f276846b = model.m70371x485d7().f39015xc86e6609;
            hj6.W(jj4Var2, imageView, -1, hashCode, s7Var);
            A();
            android.view.View C = C();
            if (C != null) {
                C.setBackground(F(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT));
            }
            android.view.View E = E();
            if (E != null) {
                E.setBackground(F(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT));
            }
            android.view.View C2 = C();
            if (C2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(C2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(C2, "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View E2 = E();
            if (E2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(E2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                E2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(E2, "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View C3 = C();
            if (C3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(C3, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                C3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                yj0.a.f(C3, "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2131x66b71a6b.C17772x216496ad D3 = D();
                if (D3 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(D3, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "Undefined", "scrollToPosition", "(I)V");
                    D3.a1(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(D3, "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "Undefined", "scrollToPosition", "(I)V");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2131x66b71a6b.C17772x216496ad D4 = D();
                if (D4 != null && (mo7946xf939df19 = D4.mo7946xf939df19()) != null) {
                    mo7946xf939df19.m8146xced61ae5();
                }
            } else {
                G(this.F, model, this.A);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleInteractType", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            p3325xe03a0797.p3326xc267989b.y0 h17 = h();
            if (h17 != null) {
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.l.d(h17, ((t26.a) p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).f496880h, null, new f84.i(model, this, null), 2, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleInteractType", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public void v(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        super.v((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj);
        android.widget.FrameLayout frameLayout = this.f341743t;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        this.G = false;
        this.H = false;
        this.I = false;
        this.f341737J.removeCallbacksAndMessages(null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
    }
}
