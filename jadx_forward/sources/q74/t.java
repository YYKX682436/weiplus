package q74;

/* loaded from: classes4.dex */
public final class t {
    public float A;
    public boolean B;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 C;
    public android.animation.AnimatorSet D;
    public android.animation.AnimatorSet E;
    public android.animation.AnimatorSet F;
    public android.animation.AnimatorSet G;
    public android.animation.AnimatorSet H;
    public android.animation.AnimatorSet I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f442051J;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f442052a;

    /* renamed from: b, reason: collision with root package name */
    public final w64.n f442053b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2124x2ad8c7ad.C17758x730d4dd2 f442054c;

    /* renamed from: d, reason: collision with root package name */
    public final z84.h f442055d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f442056e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f442057f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewGroup f442058g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewGroup f442059h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f442060i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.ImageView f442061j;

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 f442062k;

    /* renamed from: l, reason: collision with root package name */
    public final android.view.ViewGroup f442063l;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 f442064m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f442065n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f442066o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f442067p;

    /* renamed from: q, reason: collision with root package name */
    public int f442068q;

    /* renamed from: r, reason: collision with root package name */
    public int f442069r;

    /* renamed from: s, reason: collision with root package name */
    public s34.o1 f442070s;

    /* renamed from: t, reason: collision with root package name */
    public s34.o1 f442071t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f442072u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f442073v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f442074w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.animation.PathInterpolator f442075x;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.animation.PathInterpolator f442076y;

    /* renamed from: z, reason: collision with root package name */
    public float f442077z;

    public t(android.content.Context mContext, int i17, android.view.ViewGroup viewGroup, w64.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2124x2ad8c7ad.C17758x730d4dd2 c17758x730d4dd2, z84.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        this.f442052a = mContext;
        this.f442053b = nVar;
        this.f442054c = c17758x730d4dd2;
        this.f442055d = hVar;
        this.f442069r = -1;
        this.f442072u = jz5.h.b(new q74.r(this));
        this.f442073v = jz5.h.b(new q74.s(this));
        this.f442074w = jz5.h.b(new q74.g(this));
        this.f442075x = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        this.f442076y = new android.view.animation.PathInterpolator(0.15f, 0.15f, 0.2f, 1.0f);
        this.C = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        android.view.View findViewById = viewGroup != null ? viewGroup.findViewById(com.p314xaae8f345.mm.R.id.rb6) : null;
        this.f442056e = findViewById;
        this.f442057f = findViewById != null ? (android.view.ViewGroup) findViewById.findViewById(com.p314xaae8f345.mm.R.id.f565285by4) : null;
        android.view.ViewGroup viewGroup2 = findViewById != null ? (android.view.ViewGroup) findViewById.findViewById(com.p314xaae8f345.mm.R.id.raj) : null;
        this.f442058g = viewGroup2;
        this.f442059h = findViewById != null ? (android.view.ViewGroup) findViewById.findViewById(com.p314xaae8f345.mm.R.id.rak) : null;
        this.f442060i = findViewById != null ? (android.widget.ImageView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.ram) : null;
        this.f442061j = findViewById != null ? (android.widget.ImageView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.ral) : null;
        this.f442062k = findViewById != null ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992) findViewById.findViewById(com.p314xaae8f345.mm.R.id.obc) : null;
        this.f442063l = findViewById != null ? (android.view.ViewGroup) findViewById.findViewById(com.p314xaae8f345.mm.R.id.f563983db0) : null;
        this.f442064m = findViewById != null ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992) findViewById.findViewById(com.p314xaae8f345.mm.R.id.f563989db1) : null;
        this.f442065n = findViewById != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById.findViewById(com.p314xaae8f345.mm.R.id.f564002fd) : null;
        this.f442066o = findViewById != null ? findViewById.findViewById(com.p314xaae8f345.mm.R.id.r_a) : null;
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(new q74.f(this));
        }
    }

    public static final /* synthetic */ float a(q74.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getAnimOffset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        float t17 = tVar.t();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getAnimOffset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return t17;
    }

    public static final /* synthetic */ android.view.ViewGroup b(q74.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMActionBtnLayout$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        android.view.ViewGroup viewGroup = tVar.f442063l;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMActionBtnLayout$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return viewGroup;
    }

    public static final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 c(q74.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMHandler$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = tVar.C;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMHandler$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return n3Var;
    }

    public static final /* synthetic */ android.view.View d(q74.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMHighlightBackground$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        android.view.View view = tVar.f442066o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMHighlightBackground$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return view;
    }

    public static final /* synthetic */ int e(q74.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMIndex$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        int i17 = tVar.f442068q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMIndex$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return i17;
    }

    public static final /* synthetic */ int f(q74.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMPreIndex$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        int i17 = tVar.f442069r;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMPreIndex$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return i17;
    }

    public static final /* synthetic */ android.widget.ImageView g(q74.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMProductIconIn$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        android.widget.ImageView imageView = tVar.f442061j;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMProductIconIn$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return imageView;
    }

    public static final /* synthetic */ android.widget.ImageView h(q74.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMProductIconOut$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        android.widget.ImageView imageView = tVar.f442060i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMProductIconOut$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return imageView;
    }

    public static final /* synthetic */ s34.o1 i(q74.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMProductInfo$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        s34.o1 o1Var = tVar.f442070s;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMProductInfo$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return o1Var;
    }

    public static final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 j(q74.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMSnsInfo$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = tVar.f442067p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMSnsInfo$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return c17933xe8d1b226;
    }

    public static final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 k(q74.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMTitleView$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 c17790xf59c6992 = tVar.f442062k;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMTitleView$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return c17790xf59c6992;
    }

    public final void l(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        s34.a1 a1Var;
        s34.z0 z0Var;
        java.util.List c17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        if (s34.z0.f484369c.a(this.f442067p)) {
            this.f442069r = this.f442068q;
            this.f442071t = this.f442070s;
            this.f442068q = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f442067p;
            this.f442070s = (c17933xe8d1b226 == null || (m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e()) == null || (a1Var = m70354x74235b3e.f38210x95847c91) == null || (z0Var = a1Var.f484102f) == null || (c17 = z0Var.c()) == null) ? null : (s34.o1) c17.get(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdSlideProductItemViewLogic", "bindData, mPreIndex is " + this.f442069r + ", mIndex is " + this.f442068q);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
    }

    public final void m() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cancelAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        this.C.mo50302x6b17ad39(null);
        android.animation.AnimatorSet animatorSet = this.D;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        android.animation.AnimatorSet animatorSet2 = this.E;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        android.animation.AnimatorSet animatorSet3 = this.F;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        android.animation.AnimatorSet animatorSet4 = this.G;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
        }
        android.animation.AnimatorSet animatorSet5 = this.H;
        if (animatorSet5 != null) {
            animatorSet5.cancel();
        }
        android.animation.AnimatorSet animatorSet6 = this.I;
        if (animatorSet6 != null) {
            animatorSet6.cancel();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdSlideProductItemViewLogic", "cancelAnimation");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cancelAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(int r19) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q74.t.n(int):void");
    }

    public final void o(boolean z17) {
        android.animation.ObjectAnimator ofFloat;
        android.animation.ObjectAnimator ofFloat2;
        android.animation.ObjectAnimator ofFloat3;
        android.animation.ObjectAnimator ofFloat4;
        android.animation.ObjectAnimator ofFloat5;
        long j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doEnterOrExitAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        if (z17) {
            boolean z18 = this.B;
            android.view.animation.PathInterpolator pathInterpolator = this.f442075x;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 c17790xf59c6992 = this.f442062k;
            if (z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doTwoStatusEnterOrExitAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
                this.H = new android.animation.AnimatorSet();
                r(this.f442070s, this.f442071t);
                s(this.f442071t);
                s34.o1 o1Var = this.f442070s;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("drawStatusTwoProductTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
                if (c17790xf59c6992 != null) {
                    java.lang.String d17 = o1Var != null ? o1Var.d() : null;
                    if (!(d17 == null || d17.length() == 0)) {
                        c17790xf59c6992.setText(o1Var != null ? o1Var.d() : null);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("drawStatusTwoProductTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
                android.widget.ImageView imageView = this.f442060i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
                android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(imageView, "alpha", 1.0f, 0.0f);
                s74.q4 q4Var = s74.q4.f486046a;
                ofFloat6.setInterpolator(q4Var.e());
                ofFloat6.setDuration(250L);
                android.view.View view = this.f442066o;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
                android.animation.ObjectAnimator ofFloat7 = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
                ofFloat7.setInterpolator(q4Var.e());
                ofFloat7.setDuration(250L);
                android.view.ViewGroup viewGroup = this.f442063l;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
                android.animation.ObjectAnimator ofFloat8 = android.animation.ObjectAnimator.ofFloat(viewGroup, "alpha", 1.0f, 0.0f);
                ofFloat8.setInterpolator(q4Var.e());
                ofFloat8.setDuration(250L);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17790xf59c6992);
                android.animation.ObjectAnimator ofFloat9 = android.animation.ObjectAnimator.ofFloat(c17790xf59c6992, "alpha", 0.0f, 1.0f);
                ofFloat9.setInterpolator(pathInterpolator);
                ofFloat9.setDuration(500L);
                if (this.f442068q > this.f442069r) {
                    android.widget.ImageView imageView2 = this.f442061j;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView2);
                    ofFloat5 = android.animation.ObjectAnimator.ofFloat(imageView2, "translationX", -t(), 0.0f);
                    ofFloat5.setInterpolator(pathInterpolator);
                    j17 = 500;
                    ofFloat5.setDuration(500L);
                } else {
                    android.widget.ImageView imageView3 = this.f442061j;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView3);
                    ofFloat5 = android.animation.ObjectAnimator.ofFloat(imageView3, "translationX", t(), 0.0f);
                    ofFloat5.setInterpolator(pathInterpolator);
                    j17 = 500;
                    ofFloat5.setDuration(500L);
                }
                android.widget.ImageView imageView4 = this.f442061j;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView4);
                android.animation.ObjectAnimator ofFloat10 = android.animation.ObjectAnimator.ofFloat(imageView4, "alpha", 0.0f, 1.0f);
                ofFloat10.setInterpolator(pathInterpolator);
                ofFloat10.setDuration(j17);
                android.animation.AnimatorSet animatorSet = this.H;
                if (animatorSet != null) {
                    animatorSet.addListener(new q74.q(this));
                }
                android.animation.AnimatorSet animatorSet2 = this.H;
                if (animatorSet2 != null) {
                    animatorSet2.playTogether(ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofFloat5, ofFloat10);
                }
                android.animation.AnimatorSet animatorSet3 = this.H;
                if (animatorSet3 != null) {
                    animatorSet3.start();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doTwoStatusEnterOrExitAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doOneStatusEnterOrExitAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
                if (this.f442060i == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doOneStatusEnterOrExitAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
                } else if (this.f442061j == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doOneStatusEnterOrExitAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
                } else if (c17790xf59c6992 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doOneStatusEnterOrExitAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
                } else {
                    r(this.f442070s, this.f442071t);
                    s(this.f442071t);
                    this.F = new android.animation.AnimatorSet();
                    if (this.f442068q > this.f442069r) {
                        android.widget.ImageView imageView5 = this.f442060i;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView5);
                        ofFloat = android.animation.ObjectAnimator.ofFloat(imageView5, "translationX", 0.0f, t());
                        ofFloat.setInterpolator(pathInterpolator);
                        ofFloat.setDuration(250L);
                    } else {
                        android.widget.ImageView imageView6 = this.f442061j;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView6);
                        ofFloat = android.animation.ObjectAnimator.ofFloat(imageView6, "translationX", t(), 0.0f);
                        ofFloat.setInterpolator(pathInterpolator);
                        ofFloat.setDuration(500L);
                    }
                    if (this.f442068q > this.f442069r) {
                        android.widget.ImageView imageView7 = this.f442060i;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView7);
                        ofFloat2 = android.animation.ObjectAnimator.ofFloat(imageView7, "alpha", 1.0f, 0.0f);
                        ofFloat2.setInterpolator(pathInterpolator);
                        ofFloat2.setDuration(250L);
                    } else {
                        android.widget.ImageView imageView8 = this.f442061j;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView8);
                        ofFloat2 = android.animation.ObjectAnimator.ofFloat(imageView8, "alpha", 0.0f, 1.0f);
                        ofFloat2.setInterpolator(pathInterpolator);
                        ofFloat2.setDuration(500L);
                    }
                    android.animation.ObjectAnimator ofFloat11 = android.animation.ObjectAnimator.ofFloat(c17790xf59c6992, "alpha", 1.0f, 0.0f);
                    ofFloat11.setInterpolator(s74.q4.f486046a.e());
                    ofFloat11.setDuration(150L);
                    if (this.f442068q > this.f442069r) {
                        android.widget.ImageView imageView9 = this.f442061j;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView9);
                        ofFloat3 = android.animation.ObjectAnimator.ofFloat(imageView9, "translationX", -t(), 0.0f);
                        ofFloat3.setInterpolator(pathInterpolator);
                        ofFloat3.setDuration(500L);
                    } else {
                        android.widget.ImageView imageView10 = this.f442060i;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView10);
                        ofFloat3 = android.animation.ObjectAnimator.ofFloat(imageView10, "translationX", 0.0f, -t());
                        ofFloat3.setInterpolator(pathInterpolator);
                        ofFloat3.setDuration(500L);
                    }
                    android.animation.ObjectAnimator ofFloat12 = android.animation.ObjectAnimator.ofFloat(c17790xf59c6992, "alpha", 0.0f, 1.0f);
                    ofFloat12.setInterpolator(pathInterpolator);
                    ofFloat12.setDuration(350L);
                    if (this.f442068q > this.f442069r) {
                        android.widget.ImageView imageView11 = this.f442061j;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView11);
                        ofFloat4 = android.animation.ObjectAnimator.ofFloat(imageView11, "alpha", 0.0f, 1.0f);
                        ofFloat4.setInterpolator(pathInterpolator);
                        ofFloat4.setDuration(500L);
                    } else {
                        android.widget.ImageView imageView12 = this.f442060i;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView12);
                        ofFloat4 = android.animation.ObjectAnimator.ofFloat(imageView12, "alpha", 1.0f, 0.0f);
                        ofFloat4.setInterpolator(pathInterpolator);
                        ofFloat4.setDuration(500L);
                    }
                    ofFloat11.addListener(new q74.j(this, ofFloat12));
                    android.animation.AnimatorSet animatorSet4 = new android.animation.AnimatorSet();
                    this.G = animatorSet4;
                    animatorSet4.addListener(new q74.k(this));
                    android.animation.AnimatorSet animatorSet5 = this.F;
                    if (animatorSet5 != null) {
                        animatorSet5.addListener(new q74.m(this));
                    }
                    android.animation.AnimatorSet animatorSet6 = this.F;
                    if (animatorSet6 != null) {
                        animatorSet6.playTogether(ofFloat, ofFloat2, ofFloat11, ofFloat3, ofFloat4);
                    }
                    android.animation.AnimatorSet animatorSet7 = this.F;
                    if (animatorSet7 != null) {
                        animatorSet7.start();
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doOneStatusEnterOrExitAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
                }
            }
        } else {
            n(this.f442068q);
        }
        this.B = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doEnterOrExitAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
    }

    public final void p() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doTwoStatusAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        this.I = new android.animation.AnimatorSet();
        android.widget.ImageView imageView = this.f442060i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(imageView, "translationX", 0.0f, -this.f442077z);
        android.view.animation.PathInterpolator pathInterpolator = this.f442076y;
        ofFloat.setInterpolator(pathInterpolator);
        ofFloat.setDuration(300L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 c17790xf59c6992 = this.f442062k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17790xf59c6992);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(c17790xf59c6992, "translationX", 0.0f, -this.f442077z);
        ofFloat2.setInterpolator(pathInterpolator);
        ofFloat2.setDuration(300L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17790xf59c6992);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(c17790xf59c6992, "alpha", 1.0f, 0.0f);
        ofFloat3.setInterpolator(pathInterpolator);
        ofFloat3.setDuration(300L);
        android.view.View view = this.f442066o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(view, "translationX", this.A, 0.0f);
        ofFloat4.setInterpolator(pathInterpolator);
        ofFloat4.setDuration(300L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat5.setInterpolator(pathInterpolator);
        ofFloat5.setDuration(300L);
        android.view.ViewGroup viewGroup = this.f442063l;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
        android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(viewGroup, "alpha", 0.0f, 1.0f);
        ofFloat6.setInterpolator(pathInterpolator);
        ofFloat6.setDuration(300L);
        android.animation.AnimatorSet animatorSet = this.I;
        if (animatorSet != null) {
            animatorSet.addListener(new q74.o(this));
        }
        android.animation.AnimatorSet animatorSet2 = this.I;
        if (animatorSet2 != null) {
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6);
        }
        android.animation.AnimatorSet animatorSet3 = this.I;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doTwoStatusAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
    }

    public final void q(android.graphics.drawable.GradientDrawable gradientDrawable, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("drawHighlightBackground", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        gradientDrawable.setShape(0);
        gradientDrawable.setOrientation(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setCornerRadii(new float[]{v(), v(), v(), v(), v(), v(), v(), v()});
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            gradientDrawable.setColors(new int[]{android.graphics.Color.parseColor("#00000000"), i17, i17}, new float[]{0.0f, 0.7f, 1.0f});
        } else {
            gradientDrawable.setColors(new int[]{android.graphics.Color.parseColor("#00000000"), i17});
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("drawHighlightBackground", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
    }

    public final void r(s34.o1 o1Var, s34.o1 o1Var2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("drawProductImg", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        if (this.f442060i != null) {
            java.lang.String b17 = o1Var2 != null ? o1Var2.b() : null;
            if (!(b17 == null || b17.length() == 0)) {
                a84.m.a(o1Var2 != null ? o1Var2.b() : null, this.f442060i);
            }
        }
        if (this.f442061j != null) {
            java.lang.String b18 = o1Var != null ? o1Var.b() : null;
            if (!(b18 == null || b18.length() == 0)) {
                a84.m.a(o1Var != null ? o1Var.b() : null, this.f442061j);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("drawProductImg", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
    }

    public final void s(s34.o1 o1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 c17790xf59c6992;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("drawUI", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        if (o1Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("drawUI", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
            return;
        }
        java.lang.String d17 = o1Var.d();
        if (!(d17 == null || d17.length() == 0) && (c17790xf59c6992 = this.f442062k) != null) {
            c17790xf59c6992.setText(o1Var.d());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getActionBarTitle", "com.tencent.mm.plugin.sns.ad.adxml.ProductInfo");
        java.lang.String str = o1Var.f484259c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActionBarTitle", "com.tencent.mm.plugin.sns.ad.adxml.ProductInfo");
        boolean z17 = str == null || str.length() == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 c17790xf59c69922 = this.f442064m;
        if (!z17 && c17790xf59c69922 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getActionBarTitle", "com.tencent.mm.plugin.sns.ad.adxml.ProductInfo");
            java.lang.String str2 = o1Var.f484259c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActionBarTitle", "com.tencent.mm.plugin.sns.ad.adxml.ProductInfo");
            c17790xf59c69922.setText(str2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getActionBarTitleColorEntity", "com.tencent.mm.plugin.sns.ad.adxml.ProductInfo");
        s34.g1 g1Var = o1Var.f484260d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActionBarTitleColorEntity", "com.tencent.mm.plugin.sns.ad.adxml.ProductInfo");
        android.graphics.drawable.GradientDrawable gradientDrawable = null;
        int e17 = ca4.n0.e(g1Var != null ? g1Var.a() : null, -1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAlphaColor", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
        int i17 = (((int) (255 * 0.9f)) << 24) | (16777215 & e17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAlphaColor", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
        if (c17790xf59c69922 != null) {
            c17790xf59c69922.setTextColor(i17);
        }
        android.text.TextPaint paint = c17790xf59c69922 != null ? c17790xf59c69922.getPaint() : null;
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f442065n;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f81093x6c01ad13);
        }
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.m82037xa10c26f6(true);
        }
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.m82040x7541828(e17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHighlightColorEntity", "com.tencent.mm.plugin.sns.ad.adxml.ProductInfo");
        s34.g1 g1Var2 = o1Var.f484261e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHighlightColorEntity", "com.tencent.mm.plugin.sns.ad.adxml.ProductInfo");
        int e18 = ca4.n0.e(g1Var2 != null ? g1Var2.a() : null, android.graphics.Color.parseColor("#07C160"));
        android.view.View view = this.f442066o;
        if ((view != null ? view.getBackground() : null) instanceof android.graphics.drawable.GradientDrawable) {
            android.graphics.drawable.Drawable background = view != null ? view.getBackground() : null;
            android.graphics.drawable.GradientDrawable gradientDrawable2 = background instanceof android.graphics.drawable.GradientDrawable ? (android.graphics.drawable.GradientDrawable) background : null;
            if (gradientDrawable2 != null) {
                q(gradientDrawable2, e18);
                gradientDrawable = gradientDrawable2;
            }
        } else {
            gradientDrawable = new android.graphics.drawable.GradientDrawable();
            q(gradientDrawable, e18);
        }
        if (view != null) {
            view.setBackground(gradientDrawable);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("drawUI", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
    }

    public final float t() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAnimOffset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        float floatValue = ((java.lang.Number) ((jz5.n) this.f442074w).mo141623x754a37bb()).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAnimOffset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return floatValue;
    }

    public final w64.n u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMClickActionHandler", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMClickActionHandler", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return this.f442053b;
    }

    public final float v() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMCornerRadius", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        float floatValue = ((java.lang.Number) ((jz5.n) this.f442072u).mo141623x754a37bb()).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMCornerRadius", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return floatValue;
    }

    public final int w() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMargin", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        int intValue = ((java.lang.Number) ((jz5.n) this.f442073v).mo141623x754a37bb()).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMargin", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return intValue;
    }

    public final void x(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        s34.a1 a1Var;
        s34.z0 z0Var;
        java.util.List c17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initNoPAGStatus", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f442067p;
        s34.o1 o1Var = (c17933xe8d1b226 == null || (m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e()) == null || (a1Var = m70354x74235b3e.f38210x95847c91) == null || (z0Var = a1Var.f484102f) == null || (c17 = z0Var.c()) == null) ? null : (s34.o1) c17.get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("drawProductImg$default", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        r(o1Var, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("drawProductImg$default", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        s(o1Var);
        android.widget.ImageView imageView = this.f442060i;
        if (imageView != null) {
            imageView.setAlpha(0.0f);
        }
        android.widget.ImageView imageView2 = this.f442061j;
        if (imageView2 != null) {
            imageView2.setTranslationX(0.0f);
        }
        android.widget.ImageView imageView3 = this.f442061j;
        if (imageView3 != null) {
            imageView3.setAlpha(1.0f);
        }
        android.view.ViewGroup viewGroup = this.f442058g;
        if (viewGroup != null) {
            viewGroup.setAlpha(1.0f);
        }
        a84.y0.i(this.f442061j);
        android.widget.ImageView imageView4 = this.f442061j;
        this.f442061j = this.f442060i;
        this.f442060i = imageView4;
        a84.y0.b(this.f442059h, imageView4, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initNoPAGStatus", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
    }

    public final void y(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAlpha", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        android.view.ViewGroup viewGroup = this.f442058g;
        if (viewGroup != null) {
            viewGroup.setAlpha(f17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAlpha", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
    }
}
