package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager */
/* loaded from: classes4.dex */
public class C18430xfb7819bb extends p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe {
    private static final java.lang.String TAG = "AutoPlayViewPager";

    /* renamed from: animator */
    private android.animation.ValueAnimator f38458xd09a2ae7;

    /* renamed from: autoCarousel */
    private boolean f38459xf5cf842f;

    /* renamed from: enableTouchScroll */
    boolean f38460xb22a0969;

    /* renamed from: mLastOffset */
    protected int f38461x48321316;

    /* renamed from: pagerControlView */
    private com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18433x25b436c4 f38462x202b6ddf;

    /* renamed from: scrollTime */
    protected int f38463x3f37f3a;

    /* renamed from: scrollTimeInterval */
    protected int f38464x115fee1f;

    public C18430xfb7819bb(android.content.Context context) {
        this(context, null);
    }

    /* renamed from: access$000 */
    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18433x25b436c4 m71295xbbd77af0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18430xfb7819bb c18430xfb7819bb) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18433x25b436c4 c18433x25b436c4 = c18430xfb7819bb.f38462x202b6ddf;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        return c18433x25b436c4;
    }

    /* renamed from: bindViewPagerControlView */
    public void m71296xc5dada81(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18433x25b436c4 c18433x25b436c4, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindViewPagerControlView", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        this.f38462x202b6ddf = c18433x25b436c4;
        this.f38459xf5cf842f = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindViewPagerControlView", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
    }

    /* renamed from: enableTouchScroll */
    public void m71297xb22a0969(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableTouchScroll", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        this.f38460xb22a0969 = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableTouchScroll", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        if (!this.f38460xb22a0969) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        return onInterceptTouchEvent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        if (r2 != 3) goto L17;
     */
    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            java.lang.String r0 = "onTouchEvent"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            boolean r2 = r4.f38460xb22a0969
            if (r2 != 0) goto L11
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            r5 = 0
            return r5
        L11:
            int r2 = r5.getActionMasked()
            if (r2 == 0) goto L25
            r3 = 1
            if (r2 == r3) goto L21
            r3 = 2
            if (r2 == r3) goto L25
            r3 = 3
            if (r2 == r3) goto L21
            goto L28
        L21:
            r4.m71302x5d531405()
            goto L28
        L25:
            r4.m71298xe5bfa199()
        L28:
            boolean r5 = super.onTouchEvent(r5)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18430xfb7819bb.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: pauseAutoPlay */
    public void m71298xe5bfa199() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pauseAutoPlay", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        if (this.f38459xf5cf842f) {
            android.animation.ValueAnimator valueAnimator = this.f38458xd09a2ae7;
            if (valueAnimator != null) {
                valueAnimator.pause();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "animator is null when pauseAutoPlay");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pauseAutoPlay", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
    }

    /* renamed from: scrollToNextPage */
    public void m71299xede5de6a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("scrollToNextPage", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        if (m8307xb978e60e()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scrollToNextPage", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
            return;
        }
        m8291x55dee9f2();
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, getWidth());
        ofInt.setDuration(this.f38463x3f37f3a);
        ofInt.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.x0(this));
        ofInt.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.y0(this));
        ofInt.start();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scrollToNextPage", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
    }

    /* renamed from: setScrollTime */
    public void m71300x2058853c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setScrollTime", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        this.f38463x3f37f3a = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScrollTime", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
    }

    /* renamed from: setScrollTimeInterval */
    public void m71301xbbe7d221(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setScrollTimeInterval", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        this.f38464x115fee1f = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScrollTimeInterval", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
    }

    /* renamed from: startAutoPlay */
    public void m71302x5d531405() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAutoPlay", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        if (this.f38459xf5cf842f) {
            if (this.f38458xd09a2ae7 == null) {
                android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f38458xd09a2ae7 = ofFloat;
                ofFloat.setDuration(this.f38464x115fee1f);
                this.f38458xd09a2ae7.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.z0(this));
                this.f38458xd09a2ae7.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.a1(this));
            }
            this.f38458xd09a2ae7.start();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18433x25b436c4 c18433x25b436c4 = this.f38462x202b6ddf;
            if (c18433x25b436c4 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateProgress", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
                c18433x25b436c4.f252504z = 1.0f;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateProgress", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
                this.f38462x202b6ddf.invalidate();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAutoPlay", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
    }

    public C18430xfb7819bb(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38461x48321316 = 0;
        this.f38463x3f37f3a = 1000;
        this.f38464x115fee1f = 4000;
        this.f38459xf5cf842f = false;
        this.f38460xb22a0969 = true;
    }
}
