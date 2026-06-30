package v74;

/* loaded from: classes4.dex */
public final class j extends dc4.v implements i64.k0 {
    public int A;
    public final v74.h B;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f515357p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f515358q;

    /* renamed from: r, reason: collision with root package name */
    public final i64.b1 f515359r;

    /* renamed from: s, reason: collision with root package name */
    public final android.app.Activity f515360s;

    /* renamed from: t, reason: collision with root package name */
    public final int f515361t;

    /* renamed from: u, reason: collision with root package name */
    public final v74.k0 f515362u;

    /* renamed from: v, reason: collision with root package name */
    public k84.e6 f515363v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.ViewGroup f515364w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05 f515365x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.ViewStub f515366y;

    /* renamed from: z, reason: collision with root package name */
    public final android.os.Handler f515367z;

    public j(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar, i64.b1 b1Var, android.app.Activity mActivity, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mActivity, "mActivity");
        this.f515357p = c17933xe8d1b226;
        this.f515358q = iVar;
        this.f515359r = b1Var;
        this.f515360s = mActivity;
        this.f515361t = i17;
        this.f515362u = new v74.k0(1);
        this.f515367z = new android.os.Handler(android.os.Looper.getMainLooper());
        this.B = new v74.h();
    }

    @Override // dc4.v
    public void c(android.view.View view, android.view.View view2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookCardDetailItem", "initView, snsId=" + ca4.z0.y0(this.f515357p));
        if (view == null || view2 == null || this.f515359r == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLookbookCardDetailItem", "initView, params err");
        }
        this.f310366f = view;
        this.f310367g = view2;
        this.f515364w = view != null ? (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.iqu) : null;
        this.f515365x = view != null ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05) view.findViewById(com.p314xaae8f345.mm.R.id.iqv) : null;
        this.f515366y = view != null ? (android.view.ViewStub) view.findViewById(com.p314xaae8f345.mm.R.id.qlu) : null;
        android.view.ViewStub viewStub = view != null ? (android.view.ViewStub) view.findViewById(com.p314xaae8f345.mm.R.id.v_f) : null;
        this.f515362u.g(new v74.t(this.f515360s, this.f515359r, this.f515365x, this.f515364w, view2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) view2 : null, this.f515366y, view != null ? (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f567247rw0) : null, viewStub), new w64.n(this.f515360s, this.f515361t, this.f515359r, null, null), this.B);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookCardDetailItem", "onAdRemoved, snsId=" + str);
        this.f515362u.f();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
    }

    @Override // dc4.v
    public void e(android.content.res.Configuration configuration) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
        super.e(configuration);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookCardDetailItem", "onConfigurationChanged, snsId=" + ca4.z0.y0(this.f515357p));
        l(v74.k0.E.b(this.f515360s, this.f310372o, 1));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
    }

    @Override // dc4.v
    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
        super.g();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookCardDetailItem", "onPause");
        v74.k0 k0Var = this.f515362u;
        k0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pausePlayByActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        k0Var.l(false);
        v74.s0 s0Var = k0Var.f515382o;
        if (s0Var != null) {
            s0Var.d();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePlayByActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        k84.e6 e6Var = this.f515363v;
        if (e6Var != null) {
            e6Var.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
    }

    @Override // dc4.v
    public void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
        super.i();
        this.f515367z.removeCallbacksAndMessages(null);
        v74.k0 k0Var = this.f515362u;
        k0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStopPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookLogic", "onStopPlay");
        k0Var.f515377j.removeCallbacksAndMessages(null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStopPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        k0Var.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookCardDetailItem", "onUIDestroy, snsId=" + ca4.z0.y0(this.f515357p));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
    }

    @Override // dc4.v
    public void j() {
        i64.b1 b1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f515357p;
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookCardDetailItem", "refreshView, snsId=" + ca4.z0.y0(c17933xe8d1b226));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addOnRemovedListener", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
        java.lang.String T = ca4.z0.T(c17933xe8d1b226);
        if (!android.text.TextUtils.isEmpty(T) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("0", T) && (b1Var = this.f515359r) != null) {
            b1Var.a(T, this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addOnRemovedListener", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshOtherComponent", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshOtherComponent", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
        } else {
            if (this.f515363v == null && c17933xe8d1b226.m70404x7b40c91c()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookCardDetailItem", "create adSocialPatLogic");
                this.f515363v = new k84.e6(this.f515361t);
            }
            k84.e6 e6Var = this.f515363v;
            if (e6Var != null) {
                e6Var.a(this.f515360s, this.f310369i, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.a(c17933xe8d1b226.m70367x7525eefd()), this.f515359r, this.f515358q, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshOtherComponent", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
        }
        v74.s b17 = v74.k0.E.b(this.f515360s, this.f310372o, 1);
        this.f515362u.i(c17933xe8d1b226, b17, this.A, l(b17));
        android.os.Handler handler = this.f515367z;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new v74.i(this, c17933xe8d1b226), 600L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if (r4.n(r2.f386557b) == true) goto L12;
     */
    @Override // dc4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "resetSnsInfoLikeFlag"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            k84.e6 r2 = r6.f515363v
            if (r2 != 0) goto L10
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r7
        L10:
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatLogic"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r3)
            k84.c6 r4 = r2.f386556a
            if (r4 == 0) goto L23
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r2.f386557b
            boolean r4 = r4.n(r5)
            r5 = 1
            if (r4 != r5) goto L23
            goto L24
        L23:
            r5 = 0
        L24:
            if (r5 == 0) goto L55
            k84.c6 r2 = r2.f386556a
            if (r2 == 0) goto L50
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r4)
            com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView r2 = r2.f386515s
            if (r2 != 0) goto L37
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r4)
            goto L51
        L37:
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r5)
            if (r7 == 0) goto L49
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r2.f244990u
            if (r2 == 0) goto L49
            int r2 = r2.m70360xbd8ebd19()
            r7.m70448xb8471e25(r2)
        L49:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r5)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r4)
            goto L51
        L50:
            r7 = 0
        L51:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r3)
            goto L58
        L55:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r3)
        L58:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v74.j.k(com.tencent.mm.plugin.sns.storage.SnsInfo):com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public final boolean l(v74.s sVar) {
        java.lang.String str;
        boolean z17;
        int i17;
        boolean z18;
        int parseColor;
        int parseColor2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookCardDetailItem", "adjustContentContainerLayout, snsId=" + ca4.z0.y0(this.f515357p));
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f310369i.findViewById(com.p314xaae8f345.mm.R.id.n_6);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) this.f310369i.findViewById(com.p314xaae8f345.mm.R.id.afc);
        android.view.View view = this.f310366f;
        android.view.View findViewById = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.iqw) : null;
        com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
        v74.r rVar = v74.k0.E;
        int d17 = rVar.d(this.f515360s, this.f310372o, this.f515361t, sVar, c19762x487075a);
        boolean e17 = rVar.e(this.f515360s);
        if (findViewById == null) {
            str = "adjustContentContainerLayout";
            z17 = false;
            i17 = d17;
        } else if (c19762x487075a.f38859x6ac9171 || e17) {
            str = "adjustContentContainerLayout";
            z17 = false;
            i17 = d17;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            android.view.View view2 = findViewById;
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookCardDetailItem", "adjustContentContainerLayout", "(Lcom/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookLogic$ItemSize;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookCardDetailItem", "adjustContentContainerLayout", "(Lcom/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookLogic$ItemSize;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMaskBackground", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion");
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                parseColor = android.graphics.Color.parseColor("#00191919");
                parseColor2 = android.graphics.Color.parseColor("#FF191919");
            } else {
                parseColor = android.graphics.Color.parseColor("#00FFFFFF");
                parseColor2 = android.graphics.Color.parseColor("#FFFFFFFF");
            }
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, new int[]{parseColor, parseColor2});
            gradientDrawable.setGradientType(0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMaskBackground", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion");
            findViewById.setBackground(gradientDrawable);
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            android.view.View view3 = findViewById;
            str = "adjustContentContainerLayout";
            z17 = false;
            i17 = d17;
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookCardDetailItem", "adjustContentContainerLayout", "(Lcom/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookLogic$ItemSize;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookCardDetailItem", "adjustContentContainerLayout", "(Lcom/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookLogic$ItemSize;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int i18 = i17;
        if (this.A != i18) {
            rVar.a(this.f515364w, viewGroup, viewGroup2, null, i18, this.f515361t);
            z18 = true;
        } else {
            z18 = z17;
        }
        this.A = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookCardDetailItem", "initView, inLargeWindow=" + this.f310372o + ", displayW=" + this.A + ", isChanged=" + z18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
        return z18;
    }
}
