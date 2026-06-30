package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager */
/* loaded from: classes4.dex */
public class C17808x428917d3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager {

    /* renamed from: d, reason: collision with root package name */
    public int f245313d;

    /* renamed from: h, reason: collision with root package name */
    public int f245317h;

    /* renamed from: p, reason: collision with root package name */
    public final z84.a f245322p;

    /* renamed from: r, reason: collision with root package name */
    public z84.d f245324r;

    /* renamed from: t, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f245326t;

    /* renamed from: u, reason: collision with root package name */
    public z84.c f245327u;

    /* renamed from: y, reason: collision with root package name */
    public int f245331y;

    /* renamed from: e, reason: collision with root package name */
    public int f245314e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f245315f = -1;

    /* renamed from: g, reason: collision with root package name */
    public final int f245316g = 3;

    /* renamed from: i, reason: collision with root package name */
    public int f245318i = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f245319m = Integer.MIN_VALUE;

    /* renamed from: n, reason: collision with root package name */
    public float f245320n = 0.0f;

    /* renamed from: o, reason: collision with root package name */
    public boolean f245321o = true;

    /* renamed from: q, reason: collision with root package name */
    public int f245323q = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f245328v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f245329w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f245330x = 0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f245332z = true;

    /* renamed from: s, reason: collision with root package name */
    public final z84.e f245325s = new z84.e(this);

    public C17808x428917d3(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f245326t = c1163xf1deaba4;
        if (c1163xf1deaba4 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.CardLayoutManager", "the layout manager will not work properly, because of null recycler view!!!");
            return;
        }
        c1163xf1deaba4.m7968x9a6969cf(new z84.b(this));
        this.f245322p = new z84.a(c1163xf1deaba4.getContext(), this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.CardLayoutManager", "new CardLayoutManager, and recyclerView hashCode is " + c1163xf1deaba4.hashCode());
    }

    public void A() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("scrollToNextItem", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        try {
            z84.a aVar = this.f245322p;
            if (aVar != null) {
                aVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("scrollImmediately", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
                android.os.Handler handler = aVar.f552295d;
                if (handler != null) {
                    aVar.a();
                    handler.sendEmptyMessage(0);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scrollImmediately", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scrollToNextItem", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    public void B(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("scrollToNextItemDelay", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("scrollToNextItemDelay: millis=");
            sb6.append(j17);
            sb6.append(", mCardRecyclerViewScrollHelper=");
            z84.a aVar = this.f245322p;
            sb6.append(aVar != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.CardLayoutManager", sb6.toString());
            if (aVar != null && j17 > 0) {
                aVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("delayScroll", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
                android.os.Handler handler = aVar.f552295d;
                if (handler != null) {
                    aVar.a();
                    handler.sendEmptyMessageDelayed(0, j17);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("delayScroll", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scrollToNextItemDelay", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    public void C(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setInfiniteLoopMode", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        this.f245332z = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setInfiniteLoopMode", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    public void D(z84.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLayoutHelper", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        this.f245324r = dVar;
        if (dVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutHelper");
            dVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLayoutManager", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutHelper");
            dVar.f552300c = this;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLayoutManager", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLayoutHelper", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    public void E(z84.c cVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setScrollStateChangedListener", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        this.f245327u = cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScrollStateChangedListener", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    public void F() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("smoothScrollToNextItem", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        if (this.f245328v && (c1163xf1deaba4 = this.f245326t) != null && c1163xf1deaba4.isAttachedToWindow()) {
            int i17 = this.f245319m + 1;
            this.f245330x = 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.CardLayoutManager", "smoothScrollToNextItem: scrolling to position " + i17);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f245326t;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1163xf1deaba42, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/recyclerview/CardLayoutManager", "smoothScrollToNextItem", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            c1163xf1deaba42.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1163xf1deaba42, "com/tencent/mm/plugin/sns/ad/widget/recyclerview/CardLayoutManager", "smoothScrollToNextItem", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.CardLayoutManager", "smoothScrollToNextItem: conditions not met, skip scrolling");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("smoothScrollToNextItem", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    public int G(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("virtualPositionToAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        int i18 = this.f245317h;
        if (i18 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("virtualPositionToAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return 0;
        }
        if (i17 >= 0) {
            int i19 = i17 % i18;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("virtualPositionToAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return i19;
        }
        if (i17 % i18 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("virtualPositionToAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return 0;
        }
        int i27 = i18 + (i17 % i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("virtualPositionToAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        return i27;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollHorizontally */
    public boolean mo2416xc6ea780e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canScrollHorizontally", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        boolean z17 = this.f245314e > 0 && this.f245315f > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canScrollHorizontally", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        return z17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: generateDefaultLayoutParams */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams mo2417xcbb3b67c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("generateDefaultLayoutParams", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(-2, -2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("generateDefaultLayoutParams", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        return layoutParams;
    }

    public void m(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calculateChildViewSize", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        z84.d dVar = this.f245324r;
        if (dVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateChildViewSize", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return;
        }
        android.view.View f17 = z2Var.f(0);
        dVar.a(f17);
        mo7989xbb8aeee6(f17);
        mo8052x6ae7e3a1(f17, 0, 0);
        this.f245314e = m8014x2ea13bdf(f17);
        this.f245315f = m8013x8bb7462e(f17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVisibleCount", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutHelper");
        dVar.f552301d = this.f245316g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVisibleCount", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutHelper");
        int i17 = this.f245314e;
        int i18 = this.f245315f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setChildViewSize", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutHelper");
        dVar.f552298a = i17;
        dVar.f552299b = i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setChildViewSize", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateChildViewSize", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    public final int n(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calculateFixedPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        if (!this.f245332z && i17 == this.f245317h - 1 && this.f245323q == 2) {
            this.f245323q = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateFixedPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return i17;
        }
        int i18 = this.f245323q;
        this.f245323q = 0;
        if (i18 == 2) {
            int i19 = i17 + 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateFixedPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return i19;
        }
        if (i18 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateFixedPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return i17;
        }
        if (q() < 0.5f) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateFixedPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return i17;
        }
        int i27 = i17 + 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateFixedPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        return i27;
    }

    public void o() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cancelScrollToNextItemDelay", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        try {
            z84.a aVar = this.f245322p;
            if (aVar != null) {
                aVar.a();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cancelScrollToNextItemDelay", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onDetachedFromWindow */
    public void mo7937x8876e98b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        super.mo7937x8876e98b(c1163xf1deaba4, z2Var);
        if (this.f245331y == 0) {
            this.f245313d = 0;
            this.f245319m = Integer.MIN_VALUE;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        int b17;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLayoutChildren", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        this.f245328v = false;
        if (h3Var == null || z2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.CardLayoutManager", "the state or recycler is null!!! Right?");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayoutChildren", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return;
        }
        try {
            b17 = h3Var.b();
            this.f245317h = b17;
            z17 = h3Var.f93598g;
        } catch (java.lang.Throwable unused) {
        }
        if (b17 != 0 && !z17) {
            if (this.f245314e == -1 || this.f245315f == -1) {
                m(z2Var);
            }
            m7996x5201473d(z2Var);
            x(z2Var, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayoutChildren", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return;
        }
        m8077x28b7b1cd(z2Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayoutChildren", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutCompleted */
    public void mo7921x1c165a62(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLayoutCompleted", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        try {
            super.mo7921x1c165a62(h3Var);
            if (!this.f245328v) {
                y(this.f245319m, this.f245318i, 0);
            }
            this.f245328v = true;
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayoutCompleted", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onMeasure */
    public void mo8066x8793a67f(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMeasure", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        try {
            z84.d dVar = this.f245324r;
            if (dVar == null || !dVar.c(z2Var, h3Var, i17, i18)) {
                super.mo8066x8793a67f(z2Var, h3Var, i17, i18);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMeasure", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onScrollStateChanged */
    public void mo8069x4d79408f(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        try {
            z(i17);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    public int p() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        try {
            if (this.f245328v) {
                int G = G(this.f245319m);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
                return G;
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        return -1;
    }

    public float q() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFirstVisibleViewScrollPercent", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        int i17 = this.f245314e;
        if (i17 <= 0 || this.f245315f <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFirstVisibleViewScrollPercent", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return 0.0f;
        }
        int i18 = this.f245313d;
        if (i18 >= 0) {
            float f17 = ((i18 % i17) * 1.0f) / i17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFirstVisibleViewScrollPercent", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return f17;
        }
        if (i18 % i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFirstVisibleViewScrollPercent", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return 0.0f;
        }
        float f18 = (((i18 % i17) * 1.0f) / i17) + 1.0f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFirstVisibleViewScrollPercent", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        return f18;
    }

    public int r() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFirstVisibleViewVirtualPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        int i17 = this.f245314e;
        if (i17 <= 0 || this.f245315f <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFirstVisibleViewVirtualPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return 0;
        }
        int floor = (int) java.lang.Math.floor((this.f245313d * 1.0d) / i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFirstVisibleViewVirtualPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        return floor;
    }

    public int s() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLastVisibleViewVirtualPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        int r17 = r();
        boolean z17 = this.f245332z;
        int i17 = this.f245316g;
        if (z17) {
            int i18 = r17 + i17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLastVisibleViewVirtualPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return i18;
        }
        int min = java.lang.Math.min(r17 + i17, this.f245317h - 1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLastVisibleViewVirtualPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        return min;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollHorizontallyBy */
    public int mo2419x96d40915(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        z84.e eVar = this.f245325s;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("scrollHorizontallyBy", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        try {
            eVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reverseValue", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutManagerRecycleHelper");
            android.util.SparseBooleanArray sparseBooleanArray = eVar.f552302a;
            if (sparseBooleanArray == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reverseValue", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutManagerRecycleHelper");
            } else {
                for (int i18 = 0; i18 < sparseBooleanArray.size(); i18++) {
                    sparseBooleanArray.put(sparseBooleanArray.keyAt(i18), false);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reverseValue", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutManagerRecycleHelper");
            }
            this.f245313d += i17;
            if (!this.f245332z) {
                int t17 = t(this.f245317h - 1) + (i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 64) * 2);
                int i19 = this.f245313d;
                if (i19 > t17) {
                    this.f245313d = t17;
                } else if (i19 < 0) {
                    this.f245313d = 0;
                }
            }
            m7996x5201473d(z2Var);
            x(z2Var, i17);
            eVar.a(z2Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scrollHorizontallyBy", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return i17;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scrollHorizontallyBy", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return 0;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: smoothScrollToPosition */
    public void mo7942xd1b4653f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("smoothScrollToPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        if (h3Var == null || this.f245314e == 0 || this.f245315f == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("smoothScrollToPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        } else if (h3Var.b() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("smoothScrollToPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        } else {
            c1163xf1deaba4.mo7976xc291bbd2(t(i17) - this.f245313d, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("smoothScrollToPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        }
    }

    public int t(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPositionOffset", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        int i18 = i17 * this.f245314e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPositionOffset", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        return i18;
    }

    public p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRecyclerViewAdapter", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        try {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f245326t;
            if (c1163xf1deaba4 != null) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRecyclerViewAdapter", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
                return mo7946xf939df19;
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRecyclerViewAdapter", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        return null;
    }

    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 v(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewHolderByAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f245326t;
        if (c1163xf1deaba4 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewHolderByAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return null;
        }
        try {
            for (int childCount = c1163xf1deaba4.getChildCount() - 1; childCount >= 0; childCount--) {
                android.view.View childAt = c1163xf1deaba4.getChildAt(childCount);
                if (c1163xf1deaba4.u0(childAt) == i17) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = c1163xf1deaba4.w0(childAt);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewHolderByAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
                    return w07;
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewHolderByAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        return null;
    }

    public boolean w() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isCurrentLastItem", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        int r17 = r();
        boolean z17 = (s() - r17) + 1 == 1 && r17 == this.f245317h - 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isCurrentLastItem", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        return z17;
    }

    public void x(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, int i17) {
        int i18;
        z84.e eVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("layoutChildView", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        if (this.f245317h == 0 || this.f245314e <= 0 || this.f245315f <= 0 || this.f245324r == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutChildView", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return;
        }
        int r17 = r();
        int s17 = s();
        float q17 = q();
        this.f245324r.d();
        int i19 = (s17 - r17) + 1;
        if (this.f245320n > 0.5f && q17 < 0.5f && i17 < 0) {
            q17 = 0.5f;
        }
        int i27 = r17;
        while (i27 <= s17) {
            int G = G(i27);
            if (G >= 0 && G < this.f245317h) {
                android.view.View f17 = z2Var.f(G);
                this.f245324r.a(f17);
                if (f17 != null && (eVar = this.f245325s) != null) {
                    m7990xbb8aeee6(f17, 0);
                    mo8052x6ae7e3a1(f17, 0, 0);
                    i18 = s17;
                    this.f245324r.b(this.f245313d, q17, f17, i27 - r17, i17, i19);
                    eVar.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPositionValue", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutManagerRecycleHelper");
                    android.util.SparseBooleanArray sparseBooleanArray = eVar.f552302a;
                    if (sparseBooleanArray != null) {
                        sparseBooleanArray.append(G, true);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPositionValue", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutManagerRecycleHelper");
                    i27++;
                    s17 = i18;
                }
            }
            i18 = s17;
            i27++;
            s17 = i18;
        }
        this.f245320n = q17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateVisibleItemPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        int i28 = this.f245319m;
        if (i28 != r17) {
            this.f245318i = i28;
            this.f245319m = r17;
            this.f245329w = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateVisibleItemPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutChildView", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    public final void y(int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyVisibleItemChanged", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        boolean z17 = this.f245329w;
        z84.c cVar = this.f245327u;
        if (z17 && cVar != null && i17 != Integer.MIN_VALUE) {
            cVar.a(this, G(i17), i18 != Integer.MIN_VALUE ? G(i18) : -1, i19);
        }
        this.f245329w = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyVisibleItemChanged", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    public void z(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollStateChangedInternal", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        super.mo8069x4d79408f(i17);
        z84.c cVar = this.f245327u;
        if (cVar != null) {
            cVar.b(this, i17);
        }
        if (i17 == 0) {
            if (this.f245321o) {
                y(this.f245319m, this.f245318i, 1);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calculateAndScrollToFixedTarget", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
                int n17 = n(r());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("scrollToTarget", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
                this.f245326t.mo7976xc291bbd2(t(n17) - this.f245313d, 0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scrollToTarget", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateAndScrollToFixedTarget", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
                this.f245321o = true;
            }
        } else if (i17 == 1) {
            this.f245321o = false;
            z84.d dVar = this.f245324r;
            if (this.f245330x == 1 && dVar != null) {
                float q17 = q();
                dVar.d();
                if (q17 > 0.5f) {
                    this.f245329w = true;
                    this.f245330x = 0;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollStateChangedInternal", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }
}
