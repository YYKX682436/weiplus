package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView */
/* loaded from: classes14.dex */
public class C18006x3e758111 extends p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 {
    public int K;
    public final int L;
    public final java.lang.Runnable M;

    public C18006x3e758111(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.K = 0;
        this.L = 50;
        java.lang.System.currentTimeMillis();
        this.M = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ab(this);
    }

    public static /* synthetic */ int w(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18006x3e758111 c18006x3e758111) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        int i17 = c18006x3e758111.K;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        return i17;
    }

    @Override // p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89
    public void d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fling", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        super.d(i17 / 3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fling", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
    }

    @Override // p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        return onInterceptTouchEvent;
    }

    @Override // p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89, android.view.View
    public void onScrollChanged(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollChanged", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        super.onScrollChanged(i17, i18, i19, i27);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAdNativeLandingPagesScrollView", "onScrollChanged x %d,y %d,oldx %d,oldy %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollChanged", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
    }

    @Override // android.view.View
    public void scrollBy(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("scrollBy", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        super.scrollBy(i17, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scrollBy", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
    }

    @Override // p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89, android.view.View
    public void scrollTo(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("scrollTo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        super.scrollTo(i17, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scrollTo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
    }

    /* renamed from: setScrollViewListener */
    public void m70693xc40c41e8(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bb bbVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setScrollViewListener", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScrollViewListener", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
    }

    public C18006x3e758111(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = 0;
        this.L = 50;
        java.lang.System.currentTimeMillis();
        this.M = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ab(this);
    }
}
