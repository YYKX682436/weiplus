package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout */
/* loaded from: classes4.dex */
public class C18431x4c0aa228 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.c1 f252464d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f252465e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Scroller f252466f;

    /* renamed from: g, reason: collision with root package name */
    public int f252467g;

    /* renamed from: h, reason: collision with root package name */
    public int f252468h;

    /* renamed from: i, reason: collision with root package name */
    public int f252469i;

    public C18431x4c0aa228(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
        this.f252466f = new android.widget.Scroller(context);
        this.f252467g = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
        int action = motionEvent.getAction();
        int y17 = (int) motionEvent.getY();
        int rawY = (int) motionEvent.getRawY();
        boolean z17 = false;
        if (action == 0) {
            this.f252465e = false;
            this.f252468h = y17;
            this.f252469i = rawY;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.c1 c1Var = this.f252464d;
            if (c1Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouchBegin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$11");
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.p2178x73463188.p2179xbb6ca34f.C17928xf2aba9c9.P;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1802", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                ((gb4.d) c1Var).f351587a.M = false;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1802", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchBegin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$11");
            }
        } else if (action == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.c1 c1Var2 = this.f252464d;
            if (c1Var2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canPullOverUp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$11");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.p2178x73463188.p2179xbb6ca34f.C17928xf2aba9c9 c17928xf2aba9c9 = ((gb4.d) c1Var2).f351587a;
                int q07 = c17928xf2aba9c9.q0();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = c17928xf2aba9c9.f247280q;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                int y18 = c1162x665295de.y();
                boolean canScrollVertically = c17928xf2aba9c9.t0().canScrollVertically(1);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2 B = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.p2178x73463188.p2179xbb6ca34f.C17928xf2aba9c9.l0(c17928xf2aba9c9).B();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                boolean z18 = c17928xf2aba9c9.f247276m;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                if (!z18 || canScrollVertically || y18 != com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.p2178x73463188.p2179xbb6ca34f.C17928xf2aba9c9.l0(c17928xf2aba9c9).mo1894x7e414b06() - 1 || (q07 <= 0 && !(B instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.n2))) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canPullOverUp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$11");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canPullOverUp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$11");
                    z17 = true;
                }
                if (z17 && this.f252469i - rawY >= this.f252467g) {
                    this.f252465e = true;
                }
            }
        } else if (action == 1 || action == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("smoothScrollBack", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
            this.f252466f.forceFinished(true);
            int scrollY = getScrollY();
            if (scrollY != 0) {
                this.f252466f.startScroll(0, scrollY, 0, -scrollY, 300);
                invalidate();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("smoothScrollBack", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
        return dispatchTouchEvent;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDraw", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
        super.onDraw(canvas);
        if (this.f252466f.computeScrollOffset()) {
            scrollTo(0, this.f252466f.getCurrY());
            invalidate();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDraw", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
        boolean z17 = this.f252465e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
        return z17;
    }

    @Override // android.view.View
    public void onScrollChanged(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollChanged", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
        super.onScrollChanged(i17, i18, i19, i27);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("postScrollEventOnAnimation", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
        postOnAnimation(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.b1(this, i17, i18, i19, i27));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("postScrollEventOnAnimation", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollChanged", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
        int y17 = (int) motionEvent.getY();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.c1 c1Var = this.f252464d;
        if (c1Var != null) {
            float f17 = this.f252468h - y17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$11");
            int i17 = (int) (f17 * 0.8d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.p2178x73463188.p2179xbb6ca34f.C17928xf2aba9c9 c17928xf2aba9c9 = ((gb4.d) c1Var).f351587a;
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.p2178x73463188.p2179xbb6ca34f.C17928xf2aba9c9.m0(c17928xf2aba9c9) == null || com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.p2178x73463188.p2179xbb6ca34f.C17928xf2aba9c9.m0(c17928xf2aba9c9).f351606c == null || com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.p2178x73463188.p2179xbb6ca34f.C17928xf2aba9c9.m0(c17928xf2aba9c9).f351606c.getScrollY() + i17 <= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$11");
            } else {
                int q07 = c17928xf2aba9c9.q0();
                if (q07 > 0) {
                    int scrollY = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.p2178x73463188.p2179xbb6ca34f.C17928xf2aba9c9.m0(c17928xf2aba9c9).f351606c.getScrollY();
                    if (scrollY < q07) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.p2178x73463188.p2179xbb6ca34f.C17928xf2aba9c9.m0(c17928xf2aba9c9).f351606c.scrollBy(0, java.lang.Math.min(i17, q07 - scrollY));
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$11");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2 B = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.p2178x73463188.p2179xbb6ca34f.C17928xf2aba9c9.l0(c17928xf2aba9c9).B();
                    if (B instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.n2) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.n2 n2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.n2) B;
                        int scrollY2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.p2178x73463188.p2179xbb6ca34f.C17928xf2aba9c9.m0(c17928xf2aba9c9).f351606c.getScrollY() + i17;
                        n2Var.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMaxScrollUpDis", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMaxScrollUpDis", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
                        if (scrollY2 < n2Var.f246905w) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.p2178x73463188.p2179xbb6ca34f.C17928xf2aba9c9.m0(c17928xf2aba9c9).f351606c.scrollBy(0, i17);
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                            boolean z17 = c17928xf2aba9c9.M;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                            if (!z17) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1802", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                                c17928xf2aba9c9.M = true;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1802", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                                n2Var.O();
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$11");
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$11");
                    }
                }
            }
        }
        this.f252468h = y17;
        boolean z18 = this.f252465e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
        return z18;
    }

    /* renamed from: setOnScrollActionListener */
    public void m71303xaa7b08b8(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.c1 c1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnScrollActionListener", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
        this.f252464d = c1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnScrollActionListener", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
    }

    public C18431x4c0aa228(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
        this.f252466f = new android.widget.Scroller(context);
        this.f252467g = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
    }
}
