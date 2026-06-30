package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout */
/* loaded from: classes8.dex */
public class C18432x7c405fd1 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f252470d;

    /* renamed from: e, reason: collision with root package name */
    public int f252471e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Scroller f252472f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f252473g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f252474h;

    /* renamed from: i, reason: collision with root package name */
    public int f252475i;

    /* renamed from: m, reason: collision with root package name */
    public int f252476m;

    /* renamed from: n, reason: collision with root package name */
    public int f252477n;

    /* renamed from: o, reason: collision with root package name */
    public int f252478o;

    /* renamed from: p, reason: collision with root package name */
    public int f252479p;

    /* renamed from: q, reason: collision with root package name */
    public int f252480q;

    /* renamed from: r, reason: collision with root package name */
    public int f252481r;

    /* renamed from: s, reason: collision with root package name */
    public int f252482s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.f1 f252483t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.d1 f252484u;

    public C18432x7c405fd1(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final boolean a(android.view.View view, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("inChild", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        boolean z17 = false;
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("inChild", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
            return false;
        }
        int scrollY = getScrollY();
        if (i18 >= view.getTop() - scrollY && i18 < view.getBottom() - scrollY && i17 >= view.getLeft() && i17 < view.getRight()) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("inChild", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        return z17;
    }

    public final boolean b(android.view.MotionEvent motionEvent) {
        int findPointerIndex;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInterceptTouchEventInner", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        int action = motionEvent.getAction();
        if (action == 2 && this.f252473g) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInterceptTouchEventInner", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
            return true;
        }
        int i17 = action & 255;
        boolean z17 = false;
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInterceptTouchActionDown", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
            int x17 = (int) motionEvent.getX();
            int y17 = (int) motionEvent.getY();
            this.f252481r = getScrollY();
            if (a(this.f252474h, x17, y17)) {
                this.f252480q = motionEvent.getPointerId(0);
                this.f252475i = y17;
                this.f252473g = !this.f252472f.isFinished();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("computeRealScrollY", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                int i18 = this.f252476m;
                if (i18 <= 0) {
                    i18 = this.f252477n / 3;
                }
                this.f252478o = this.f252477n + i18;
                this.f252479p = -i18;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("computeRealScrollY", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
            } else {
                this.f252473g = false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScrollLinearLayout", "the onInterceptTouchActionDown is called " + this.f252473g + ", mScrollYWhenTouchDown = " + this.f252481r);
            boolean z18 = this.f252473g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInterceptTouchActionDown", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInterceptTouchEventInner", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
            return z18;
        }
        if (i17 != 1) {
            if (i17 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInterceptTouchActionMove", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                int i19 = this.f252480q;
                if (i19 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i19)) >= 0) {
                    motionEvent.getX(findPointerIndex);
                    int y18 = (int) motionEvent.getY(findPointerIndex);
                    int i27 = y18 - this.f252475i;
                    int scrollY = getScrollY();
                    if (java.lang.Math.abs(i27) >= this.f252470d) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.d1 d1Var = this.f252484u;
                        if (d1Var != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isChildCanScrollDown", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$2");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
                            boolean z19 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a0) d1Var).f246580a.B;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isChildCanScrollDown", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$2");
                            z17 = z19;
                        }
                        this.f252475i = y18;
                        if ((i27 < 0 && scrollY <= 0) || (i27 > 0 && scrollY >= this.f252477n && !z17)) {
                            this.f252473g = true;
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScrollLinearLayout", "the onInterceptTouchActionMove is called " + this.f252473g);
                boolean z27 = this.f252473g;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInterceptTouchActionMove", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInterceptTouchEventInner", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                return z27;
            }
            if (i17 != 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInterceptTouchEventInner", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                return false;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInterceptTouchActionUpOrCancel", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        this.f252473g = false;
        this.f252480q = -1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScrollLinearLayout", "the onInterceptTouchActionUpOrCancel is called " + this.f252473g);
        boolean z28 = this.f252473g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInterceptTouchActionUpOrCancel", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInterceptTouchEventInner", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        return z28;
    }

    public final boolean c(android.view.MotionEvent motionEvent) {
        int i17;
        int i18;
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouchEventInner", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        int actionMasked = motionEvent.getActionMasked();
        boolean z17 = false;
        boolean z18 = true;
        if (actionMasked == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouchActionDown", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
            int x17 = (int) motionEvent.getX();
            int y17 = (int) motionEvent.getY();
            if (a(this.f252474h, x17, y17)) {
                this.f252473g = true ^ this.f252472f.isFinished();
                if (!this.f252472f.isFinished()) {
                    this.f252472f.abortAnimation();
                }
                this.f252475i = y17;
                this.f252480q = motionEvent.getPointerId(0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScrollLinearLayout", "the onTouchActionDown is called " + this.f252473g);
                z17 = this.f252473g;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchActionDown", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchActionDown", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchEventInner", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
            return z17;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouchActionMove", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                int findPointerIndex = motionEvent.findPointerIndex(this.f252480q);
                if (findPointerIndex < 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ScrollLinearLayout", "Invalid pointerId=" + this.f252480q + " in onTouchEvent");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchActionMove", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                } else {
                    motionEvent.getX(findPointerIndex);
                    int y18 = (int) motionEvent.getY(findPointerIndex);
                    int i27 = y18 - this.f252475i;
                    if (!this.f252473g) {
                        int abs = java.lang.Math.abs(i27);
                        int i28 = this.f252470d;
                        if (abs >= i28) {
                            this.f252473g = true;
                            i27 = i27 > 0 ? i27 - i28 : i27 + i28;
                        }
                    }
                    int scrollY = getScrollY() - i27;
                    if (this.f252473g && this.f252479p < scrollY && this.f252478o > scrollY) {
                        d(1);
                        scrollBy(0, -i27);
                        this.f252475i = y18;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchActionMove", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchEventInner", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                return true;
            }
            if (actionMasked != 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchEventInner", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                return false;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouchActionUpOrCancel", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        int i29 = this.f252481r;
        int scrollY2 = getScrollY();
        int i37 = scrollY2 - i29;
        if (i37 > 0) {
            i17 = this.f252477n - scrollY2;
            if (i37 < this.f252471e) {
                i18 = -scrollY2;
                i19 = i18;
            }
            i19 = i17;
        } else {
            i17 = -scrollY2;
            if (i37 > (-this.f252471e)) {
                i18 = this.f252477n - scrollY2;
                i19 = i18;
            }
            i19 = i17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScrollLinearLayout", "the onTouchActionUpOrCancel is called, mScrollYWhenTouchDown = " + i29 + ", currentScrollY = " + scrollY2 + ", yDistance = " + i19);
        if (this.f252473g) {
            this.f252472f.startScroll(getScrollX(), scrollY2, 0, i19, com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50633xede5713a);
            invalidate();
            d(2);
        } else {
            d(0);
            z18 = false;
        }
        this.f252473g = false;
        this.f252480q = -1;
        this.f252475i = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchActionUpOrCancel", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchEventInner", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        return z18;
    }

    @Override // android.view.View
    public void computeScroll() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("computeScroll", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        super.computeScroll();
        try {
            if (this.f252472f.computeScrollOffset()) {
                scrollTo(this.f252472f.getCurrX(), this.f252472f.getCurrY());
                invalidate();
            } else if (this.f252482s == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScrollLinearLayout", "compute scroll offset is false the currY is " + this.f252472f.getCurrY() + ", the final Y is " + this.f252472f.getFinalY());
                d(0);
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ScrollLinearLayout", "the compute scroll has something wrong!");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("computeScroll", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
    }

    public final void d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportScrollStateChanged", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        if (i17 != this.f252482s) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.f1 f1Var = this.f252483t;
            if (f1Var != null) {
                int i18 = 1;
                boolean z17 = getScrollY() >= this.f252477n;
                android.content.Context context = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.k0) f1Var).f246582d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
                if (i17 == 0) {
                    try {
                        b4.d a17 = b4.d.a(context);
                        android.content.Intent intent = new android.content.Intent("com.tencent.mm.adlanding.video.action.PAUSE_OR_RESUME");
                        if (!z17) {
                            i18 = 2;
                        }
                        intent.putExtra("TRY_PAUSE_OR_RESUME", i18);
                        intent.putExtra("identity", context.hashCode());
                        a17.c(intent);
                    } catch (java.lang.Throwable unused) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingFloatWebView", "onScrollChanged method has something wrong");
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScrollLinearLayout", "the new state is " + i17);
            this.f252482s = i17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportScrollStateChanged", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        try {
            if (b(motionEvent)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                return true;
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ScrollLinearLayout", "the onInterceptTouchEventInner has something wrong");
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        return onInterceptTouchEvent;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        try {
            if (c(motionEvent)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                return true;
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ScrollLinearLayout", "the onTouchEventInner is called " + this.f252473g);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        return onTouchEvent;
    }

    /* renamed from: setChildScrollableListener */
    public void m71304x821f4ef5(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.d1 d1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setChildScrollableListener", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        this.f252484u = d1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setChildScrollableListener", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
    }

    /* renamed from: setDescendantScrollStatusHunter */
    public void m71305xf4669ade(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.e1 e1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDescendantScrollStatusHunter", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDescendantScrollStatusHunter", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
    }

    /* renamed from: setMaxOverScrollOffset */
    public void m71306xb30d5a76(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMaxOverScrollOffset", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        this.f252476m = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMaxOverScrollOffset", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
    }

    /* renamed from: setMaxYScrollOffset */
    public void m71307x4bdfa57(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMaxYScrollOffset", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        this.f252477n = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMaxYScrollOffset", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
    }

    /* renamed from: setOnScrollStatusListener */
    public void m71308xd579de74(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.f1 f1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnScrollStatusListener", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        this.f252483t = f1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnScrollStatusListener", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
    }

    public C18432x7c405fd1(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.f252473g = false;
        this.f252476m = 0;
        this.f252477n = 0;
        this.f252478o = 0;
        this.f252479p = 0;
        this.f252480q = -1;
        this.f252481r = 0;
        this.f252482s = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        try {
            this.f252472f = new android.widget.Scroller(context, new android.view.animation.DecelerateInterpolator());
            this.f252470d = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
            setOrientation(1);
            this.f252471e = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.a_e);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ScrollLinearLayout", "the init method has something wrong!");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
    }
}
