package v74;

/* loaded from: classes4.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final v74.t f515334a;

    /* renamed from: b, reason: collision with root package name */
    public final v74.z0 f515335b;

    /* renamed from: c, reason: collision with root package name */
    public final v74.v0 f515336c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 f515337d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f515338e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f515339f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f515340g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f515341h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f515342i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.a f515343j;

    /* renamed from: k, reason: collision with root package name */
    public final int f515344k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f515345l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f515346m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f515347n;

    /* renamed from: o, reason: collision with root package name */
    public v74.l f515348o;

    /* renamed from: p, reason: collision with root package name */
    public v74.s f515349p;

    /* renamed from: q, reason: collision with root package name */
    public int f515350q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f515351r;

    /* renamed from: s, reason: collision with root package name */
    public final yz5.p f515352s;

    /* renamed from: t, reason: collision with root package name */
    public android.animation.Animator f515353t;

    public h1(v74.t mLookbookContext, v74.z0 mVideoPlayManager, v74.v0 mAdLookbookStatistic) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mLookbookContext, "mLookbookContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mVideoPlayManager, "mVideoPlayManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mAdLookbookStatistic, "mAdLookbookStatistic");
        this.f515334a = mLookbookContext;
        this.f515335b = mVideoPlayManager;
        this.f515336c = mAdLookbookStatistic;
        this.f515344k = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSplashCardStub", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSplashCardStub", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
        android.view.ViewStub viewStub = mLookbookContext.f515452h;
        if (viewStub != null && this.f515337d == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSplashCardStub", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSplashCardStub", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
            android.view.View inflate = viewStub != null ? viewStub.inflate() : null;
            this.f515337d = inflate instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) inflate : null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = this.f515337d;
        if (c22646x1e9ca55 != null) {
            this.f515338e = (android.view.ViewGroup) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.oy7);
            this.f515339f = (android.widget.ImageView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.cl6);
            android.widget.ImageView imageView = (android.widget.ImageView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.p0h);
            this.f515340g = imageView;
            if (imageView != null) {
                imageView.setImageDrawable(i65.a.i(c22646x1e9ca55.getContext(), com.p314xaae8f345.mm.R.raw.f81043x73ab7191));
            }
            c22646x1e9ca55.setOnClickListener(new v74.c1(this));
            c22646x1e9ca55.m81437x205ac394(i65.a.b(c22646x1e9ca55.getContext(), 8));
        }
        this.f515351r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new v74.e1(this), true);
        this.f515352s = new v74.d1(this);
    }

    public static final android.view.View a(v74.h1 h1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getFirstItemView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        h1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFirstItemView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05 b17 = h1Var.f515334a.b();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = b17 != null ? b17.p0(0) : null;
        v74.b bVar = p07 instanceof v74.b ? (v74.b) p07 : null;
        android.view.View view = bVar != null ? bVar.f3639x46306858 : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFirstItemView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getFirstItemView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        return view;
    }

    public final boolean b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSplashCardVisible", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        boolean z17 = false;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = this.f515337d;
        if (c22646x1e9ca55 != null && c22646x1e9ca55.getVisibility() == 0) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSplashCardVisible", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r8 = this;
            java.lang.String r0 = "pauseVideo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            v74.l r2 = r8.f515348o
            if (r2 != 0) goto L10
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        L10:
            java.lang.String r2 = "SplashCardLogic"
            java.lang.String r3 = "pausePlay"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r3)
            java.lang.String r2 = "getVideoViewInContainer"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager$Companion"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r3)
            android.view.ViewGroup r4 = r8.f515338e
            boolean r5 = a84.y0.e(r4)
            r6 = 0
            r7 = 0
            if (r5 == 0) goto L3c
            if (r4 == 0) goto L30
            android.view.View r4 = r4.getChildAt(r6)
            goto L31
        L30:
            r4 = r7
        L31:
            boolean r5 = r4 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d
            if (r5 == 0) goto L3c
            r7 = r4
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r7 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) r7
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
            goto L3f
        L3c:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
        L3f:
            if (r7 == 0) goto L44
            r7.F()
        L44:
            r8.g()
            android.widget.ImageView r2 = r8.f515340g
            if (r2 != 0) goto L4c
            goto L4f
        L4c:
            r2.setVisibility(r6)
        L4f:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v74.h1.c():void");
    }

    public final void d(v74.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, v74.s itemSize, boolean z17) {
        android.widget.ImageView imageView;
        android.app.Activity activity;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refresh", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemSize, "itemSize");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SplashCardLogic", "refresh, isRefresh=" + z17 + ", snsId=" + ca4.z0.y0(c17933xe8d1b226) + ", hash=" + hashCode() + ", Info=" + lVar + ", itemSize=" + itemSize);
        if (lVar != null) {
            r45.jj4 a17 = lVar.a();
            float f17 = a17 != null ? a17.R : 0.0f;
            v74.v0 v0Var = this.f515336c;
            v0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSplashCardExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
            if (v0Var.f515471h == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookStatistic.splashCard", "onSplashCardExposure, duration=" + f17);
                v74.u0 u0Var = new v74.u0();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDurationMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                u0Var.f515455a = (int) (1000 * f17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDurationMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setExposureCount", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                u0Var.f515461g = 1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setExposureCount", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                v0Var.f515471h = u0Var;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookStatistic.splashCard", "onSplashCardExposure, duration=" + f17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSplashCardExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        }
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refresh", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
            return;
        }
        this.f515349p = itemSize;
        this.f515347n = c17933xe8d1b226;
        this.f515350q = i17;
        this.f515348o = lVar;
        this.f515346m = false;
        v74.t tVar = this.f515334a;
        tVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
        if (lVar == null || c17933xe8d1b226 == null || (imageView = this.f515339f) == null || (activity = tVar.f515445a) == null) {
            e(false);
            g();
        } else {
            e(true);
            l44.c0.b(c17933xe8d1b226, lVar.a());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
            r45.jj4 a18 = lVar.a();
            int hashCode = activity.hashCode();
            com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var = com.p314xaae8f345.mm.p2621x8fb0427b.s7.f276841l;
            s7Var.f276846b = c17933xe8d1b226.m70371x485d7().f39015xc86e6609;
            hj6.l0(a18, imageView, -1, hashCode, s7Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refresh", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if (r4 != r10) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(boolean r12) {
        /*
            r11 = this;
            java.lang.String r0 = "resetUI"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "resetUI, isShow="
            r2.<init>(r3)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "SplashCardLogic"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r2)
            v74.s r2 = r11.f515349p
            if (r2 != 0) goto L24
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        L24:
            v74.t r3 = r11.f515334a
            r4 = 1065353216(0x3f800000, float:1.0)
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r5 = r11.f515337d
            r6 = 0
            if (r12 == 0) goto L99
            r12 = 0
            if (r5 == 0) goto L76
            r5.setAlpha(r4)
            r5.setVisibility(r12)
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            int r4 = r4.width
            int r7 = r2.b()
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize"
            java.lang.String r9 = "getSplashCardHeight"
            int r10 = r2.f515420b
            if (r4 != r7) goto L56
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            int r4 = r4.height
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r9, r8)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r9, r8)
            if (r4 == r10) goto L6f
        L56:
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            int r7 = r2.b()
            r4.width = r7
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r9, r8)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r9, r8)
            r4.height = r10
            r5.requestLayout()
        L6f:
            yz5.a r4 = r11.f515341h
            if (r4 == 0) goto L76
            r4.mo152xb9724478()
        L76:
            com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView r3 = r3.b()
            if (r3 == 0) goto L95
            r3.setAlpha(r6)
            java.lang.String r4 = "getInitTranslationX"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r4, r1)
            int r5 = r11.f515350q
            int r2 = r2.a()
            int r5 = r5 - r2
            int r2 = r11.f515344k
            int r5 = r5 - r2
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r4, r1)
            float r2 = (float) r5
            r3.setTranslationX(r2)
        L95:
            r11.f(r12)
            goto Lb3
        L99:
            if (r5 == 0) goto La3
            r5.setAlpha(r6)
            r12 = 8
            r5.setVisibility(r12)
        La3:
            com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView r12 = r3.b()
            if (r12 == 0) goto Laf
            r12.setAlpha(r4)
            r12.setTranslationX(r6)
        Laf:
            r12 = 1
            r11.f(r12)
        Lb3:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v74.h1.e(boolean):void");
    }

    public final void f(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRecyclerViewActive", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SplashCardLogic", "setRecyclerViewActive, isActive=" + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05 b17 = this.f515334a.b();
        if (b17 != null) {
            b17.m69501x37bd608(z17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRecyclerViewActive", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
    }

    public final void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopVideoUpdateTimer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SplashCardLogic", "stopVideoUpdateTimer");
        this.f515351r.d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopVideoUpdateTimer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
    }
}
