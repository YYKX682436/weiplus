package j84;

/* loaded from: classes4.dex */
public abstract class g0 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l {
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public final jz5.g E;
    public final jz5.g F;
    public final jz5.g G;
    public final jz5.g H;
    public android.widget.FrameLayout I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.FrameLayout f379727J;
    public float K;
    public float L;
    public int M;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f379728o;

    /* renamed from: p, reason: collision with root package name */
    public final int f379729p;

    /* renamed from: q, reason: collision with root package name */
    public final i64.b1 f379730q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f379731r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f379732s;

    /* renamed from: t, reason: collision with root package name */
    public android.content.Context f379733t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f379734u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f379735v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f379736w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f379737x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f379738y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f379739z;

    public g0(java.lang.String str, p012xc85e97e9.p093xedfae76a.y yVar, android.view.View view, int i17, i64.b1 b1Var) {
        super(str, yVar, view);
        this.f379728o = view;
        this.f379729p = i17;
        this.f379730q = b1Var;
        this.f379731r = jz5.h.b(new j84.g(this));
        this.f379734u = jz5.h.b(new j84.j(this));
        this.f379735v = jz5.h.b(new j84.i(this));
        this.f379736w = jz5.h.b(new j84.p(this));
        this.f379737x = jz5.h.b(new j84.r(this));
        this.f379738y = jz5.h.b(new j84.d0(this));
        this.f379739z = jz5.h.b(new j84.k(this));
        this.A = jz5.h.b(new j84.e0(this));
        this.B = jz5.h.b(new j84.l(this));
        this.C = jz5.h.b(new j84.q(this));
        this.D = jz5.h.b(new j84.f0(this));
        this.E = jz5.h.b(new j84.c0(this));
        this.F = jz5.h.b(new j84.n(this));
        this.G = jz5.h.b(new j84.o(this));
        this.H = jz5.h.b(new j84.h(this));
    }

    public final android.widget.TextView A() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAmountTextView1", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f379739z).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAmountTextView1", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        return textView;
    }

    public final android.widget.TextView B() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAmountTextView2", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.B).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAmountTextView2", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        return textView;
    }

    public final android.widget.FrameLayout C() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getButtonContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.F).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getButtonContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        return frameLayout;
    }

    public final android.widget.TextView D() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCouponTypeTextView", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.C).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCouponTypeTextView", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        return textView;
    }

    public final android.view.View E() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemRootView", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemRootView", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        return this.f379728o;
    }

    public final android.widget.FrameLayout F() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScratchCardContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.f379737x).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScratchCardContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        return frameLayout;
    }

    public final android.widget.LinearLayout G() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTextContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((jz5.n) this.f379738y).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTextContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        return linearLayout;
    }

    public final void H() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2135xc6233107.C17778x7e2cdb85 z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reset", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCardOtherContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.view.View view = (android.view.View) ((jz5.n) this.f379736w).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardOtherContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adscratchcard/AdScratchCardComponent", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/adscratchcard/AdScratchCardComponent", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdScratchCardViewStub", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.view.ViewStub viewStub = (android.view.ViewStub) ((jz5.n) this.f379734u).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdScratchCardViewStub", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        if (viewStub != null) {
            viewStub.setVisibility(8);
        }
        android.widget.FrameLayout y17 = y();
        if (y17 != null) {
            y17.setVisibility(8);
        }
        s34.w0 w0Var = null;
        this.I = null;
        this.f379727J = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f379732s;
        if (c17933xe8d1b226 != null && (m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e()) != null) {
            w0Var = m70354x74235b3e.f38206x78154a55;
        }
        if (w0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
            return;
        }
        if (!w0Var.a() && (z17 = z()) != null) {
            z17.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
    }

    public final void I() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setScratchedCouponClick", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f379732s;
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScratchedCouponClick", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
            return;
        }
        if (this.f379733t == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScratchedCouponClick", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
            return;
        }
        s34.w0 w0Var = (c17933xe8d1b226 == null || (m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e()) == null) ? null : m70354x74235b3e.f38206x78154a55;
        if (w0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScratchedCouponClick", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
            return;
        }
        android.widget.FrameLayout F = F();
        if (F != null) {
            F.setOnClickListener(j84.s.f379761d);
        }
        android.widget.FrameLayout C = C();
        if (C != null) {
            C.setOnClickListener(new j84.t(this, w0Var));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScratchedCouponClick", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public void d(java.lang.Object obj, boolean z17) {
        j84.g0 g0Var;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 model = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        android.view.View view = this.f379728o;
        android.content.Context context = view != null ? view.getContext() : null;
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        } else {
            s34.w0 w0Var = model.m70354x74235b3e().f38206x78154a55;
            if (w0Var != null) {
                this.f379732s = model;
                this.f379733t = context;
                this.M = 0;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCardOtherContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                android.view.View view2 = (android.view.View) ((jz5.n) this.f379736w).mo141623x754a37bb();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardOtherContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                if (view2 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adscratchcard/AdScratchCardComponent", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/widget/adscratchcard/AdScratchCardComponent", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdScratchCardRootView", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((jz5.n) this.f379735v).mo141623x754a37bb();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdScratchCardRootView", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                android.widget.FrameLayout y17 = y();
                if (y17 != null) {
                    y17.setVisibility(8);
                }
                view.getViewTreeObserver().addOnPreDrawListener(new j84.m(view, this));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setupTextViews", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                ca4.m0.x0(A(), com.p314xaae8f345.mm.R.C30860x5b28f31.a_k);
                ca4.m0.x0(D(), com.p314xaae8f345.mm.R.C30860x5b28f31.a_g);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTitleAfterScratchText", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                jz5.g gVar = this.D;
                android.widget.TextView textView = (android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTitleAfterScratchText", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                ca4.m0.x0(textView, com.p314xaae8f345.mm.R.C30860x5b28f31.a_h);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSubTitleAfterScratchText", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                jz5.g gVar2 = this.E;
                android.widget.TextView textView2 = (android.widget.TextView) ((jz5.n) gVar2).mo141623x754a37bb();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSubTitleAfterScratchText", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                ca4.m0.x0(textView2, com.p314xaae8f345.mm.R.C30860x5b28f31.a_g);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getButtonText", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                jz5.g gVar3 = this.G;
                android.widget.TextView textView3 = (android.widget.TextView) ((jz5.n) gVar3).mo141623x754a37bb();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getButtonText", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                ca4.m0.x0(textView3, com.p314xaae8f345.mm.R.C30860x5b28f31.a_h);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupTextViews", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setupCouponContent", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCouponType", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCouponType", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                jz5.g gVar4 = this.A;
                if (w0Var.f484341e == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTextViewGap", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                    android.view.View view3 = (android.view.View) ((jz5.n) gVar4).mo141623x754a37bb();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTextViewGap", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                    if (view3 != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adscratchcard/AdScratchCardComponent", "setupCouponContent", "(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/ad/adxml/AdScratchCardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/sns/ad/widget/adscratchcard/AdScratchCardComponent", "setupCouponContent", "(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/ad/adxml/AdScratchCardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.widget.TextView A = A();
                    if (A != null) {
                        A.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575370pa3));
                    }
                    android.widget.TextView A2 = A();
                    if (A2 != null) {
                        A2.setTypeface(android.graphics.Typeface.createFromAsset(context.getAssets(), "fonts/WeChatSansSS-Medium.ttf"));
                    }
                    android.widget.TextView B = B();
                    if (B != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVoucherNumberStr", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVoucherNumberStr", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                        B.setText(w0Var.f484342f);
                    }
                    ca4.m0.x0(B(), com.p314xaae8f345.mm.R.C30860x5b28f31.a_k);
                    android.widget.TextView B2 = B();
                    if (B2 != null) {
                        int f17 = c44.a.f();
                        android.view.ViewGroup.LayoutParams layoutParams = B2.getLayoutParams();
                        android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
                        if (layoutParams2 != null) {
                            layoutParams2.gravity = f17;
                        } else {
                            android.view.ViewGroup.LayoutParams layoutParams3 = B2.getLayoutParams();
                            android.widget.FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams3 : null;
                            if (layoutParams4 != null) {
                                layoutParams4.gravity = f17;
                            }
                        }
                    }
                    android.widget.TextView B3 = B();
                    if (B3 != null) {
                        B3.setTypeface(android.graphics.Typeface.createFromAsset(context.getAssets(), "fonts/WeChatSansStd-Medium.ttf"));
                    }
                    android.widget.TextView D = D();
                    if (D != null) {
                        D.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575369pa2));
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTextViewGap", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                    android.view.View view4 = (android.view.View) ((jz5.n) gVar4).mo141623x754a37bb();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTextViewGap", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                    if (view4 != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adscratchcard/AdScratchCardComponent", "setupCouponContent", "(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/ad/adxml/AdScratchCardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view4, "com/tencent/mm/plugin/sns/ad/widget/adscratchcard/AdScratchCardComponent", "setupCouponContent", "(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/ad/adxml/AdScratchCardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.widget.TextView A3 = A();
                    if (A3 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDiscountStr", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDiscountStr", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                        A3.setText(w0Var.f484343g);
                    }
                    android.widget.TextView A4 = A();
                    if (A4 != null) {
                        A4.setTypeface(android.graphics.Typeface.createFromAsset(context.getAssets(), "fonts/WeChatSansStd-Medium.ttf"));
                    }
                    android.widget.TextView B4 = B();
                    if (B4 != null) {
                        B4.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p_z));
                    }
                    ca4.m0.x0(B(), com.p314xaae8f345.mm.R.C30860x5b28f31.a_g);
                    android.widget.TextView B5 = B();
                    if (B5 != null) {
                        android.widget.ImageView.ScaleType scaleType = c44.a.f120056a;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGravity_bottom", "com.tencent.mm.plugin.sns.ad.dsl.DSLConstantsKt");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGravity_bottom", "com.tencent.mm.plugin.sns.ad.dsl.DSLConstantsKt");
                        int i17 = c44.a.f120060e;
                        android.view.ViewGroup.LayoutParams layoutParams5 = B5.getLayoutParams();
                        android.widget.LinearLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams5 : null;
                        if (layoutParams6 != null) {
                            layoutParams6.gravity = i17;
                        } else {
                            android.view.ViewGroup.LayoutParams layoutParams7 = B5.getLayoutParams();
                            android.widget.FrameLayout.LayoutParams layoutParams8 = layoutParams7 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams7 : null;
                            if (layoutParams8 != null) {
                                layoutParams8.gravity = i17;
                            }
                        }
                    }
                    android.widget.TextView B6 = B();
                    if (B6 != null) {
                        B6.setTypeface(android.graphics.Typeface.createFromAsset(context.getAssets(), "fonts/WeChatSansSS-Medium.ttf"));
                    }
                    android.widget.TextView D2 = D();
                    if (D2 != null) {
                        D2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575368pa1));
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTitleAfterScratchText", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                android.widget.TextView textView4 = (android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTitleAfterScratchText", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                if (textView4 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTitleAfterScratch", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTitleAfterScratch", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                    textView4.setText(w0Var.f484339c);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSubTitleAfterScratchText", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                android.widget.TextView textView5 = (android.widget.TextView) ((jz5.n) gVar2).mo141623x754a37bb();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSubTitleAfterScratchText", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                if (textView5 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSubTitleAfterScratch", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSubTitleAfterScratch", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                    textView5.setText(w0Var.f484340d);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getButtonText", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                android.widget.TextView textView6 = (android.widget.TextView) ((jz5.n) gVar3).mo141623x754a37bb();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getButtonText", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                if (textView6 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBtnTitle", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBtnTitle", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                    textView6.setText(w0Var.f484349m);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupCouponContent", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setupScratchState", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                if (w0Var.a()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2135xc6233107.C17778x7e2cdb85 z18 = z();
                    if (z18 != null) {
                        z18.setVisibility(8);
                    }
                    android.widget.FrameLayout C = C();
                    if (C != null) {
                        C.setVisibility(0);
                    }
                    android.widget.LinearLayout G = G();
                    if (G != null) {
                        G.setTranslationX(0.0f);
                        android.view.ViewGroup.LayoutParams layoutParams9 = G.getLayoutParams();
                        android.widget.RelativeLayout.LayoutParams layoutParams10 = layoutParams9 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams9 : null;
                        if (layoutParams10 != null) {
                            layoutParams10.removeRule(13);
                            layoutParams10.addRule(9);
                            layoutParams10.addRule(15);
                            layoutParams10.addRule(0, com.p314xaae8f345.mm.R.id.snu);
                            layoutParams10.setMarginEnd(i65.a.b(G.getContext(), 8));
                            G.setLayoutParams(layoutParams10);
                        }
                        G.requestLayout();
                    }
                    I();
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2135xc6233107.C17778x7e2cdb85 z19 = z();
                    if (z19 != null) {
                        z19.setVisibility(0);
                    }
                    android.widget.FrameLayout C2 = C();
                    if (C2 != null) {
                        C2.setVisibility(8);
                    }
                    android.widget.LinearLayout G2 = G();
                    if (G2 != null) {
                        G2.setTranslationX(0.0f);
                        android.view.ViewGroup.LayoutParams layoutParams11 = G2.getLayoutParams();
                        android.widget.RelativeLayout.LayoutParams layoutParams12 = layoutParams11 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams11 : null;
                        if (layoutParams12 != null) {
                            layoutParams12.addRule(13);
                            layoutParams12.removeRule(9);
                            layoutParams12.removeRule(15);
                            layoutParams12.setMarginEnd(0);
                            G2.setLayoutParams(layoutParams12);
                        }
                        G2.requestLayout();
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2135xc6233107.C17778x7e2cdb85 z27 = z();
                    if (z27 != null) {
                        z27.m69536x535fbbe7(model.m70354x74235b3e().f38206x78154a55);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2135xc6233107.C17778x7e2cdb85 z28 = z();
                    if (z28 == null) {
                        g0Var = this;
                    } else {
                        g0Var = this;
                        z28.m69539x29676906(new j84.v(g0Var, context, model));
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2135xc6233107.C17778x7e2cdb85 z29 = z();
                    if (z29 != null) {
                        z29.m69537xccb2f8b9(new j84.w(g0Var));
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2135xc6233107.C17778x7e2cdb85 z37 = z();
                    if (z37 != null) {
                        z37.m69538x5ec7fc72(new j84.x(g0Var));
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupScratchState", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                str = "bindComponentModel";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        }
        str = "bindComponentModel";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public void v(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        super.v((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj);
        H();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
    }

    public final android.widget.FrameLayout y() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdScratchCardBreakContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.f379731r).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdScratchCardBreakContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        return frameLayout;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2135xc6233107.C17778x7e2cdb85 z() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdScratchCardCoverView", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2135xc6233107.C17778x7e2cdb85 c17778x7e2cdb85 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2135xc6233107.C17778x7e2cdb85) ((jz5.n) this.H).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdScratchCardCoverView", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        return c17778x7e2cdb85;
    }
}
