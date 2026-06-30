package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout */
/* loaded from: classes4.dex */
public class C18429x1cf5f998 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 {

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f252461g;

    /* renamed from: h, reason: collision with root package name */
    public int f252462h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f252463i;

    public C18429x1cf5f998(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f252461g = null;
        this.f252462h = 0;
        this.f252463i = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
        android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
    }

    public void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsAdInfo", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
        this.f252461g = c17933xe8d1b226;
        this.f252462h = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsAdInfo", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
        if (motionEvent.getAction() == 0 && this.f252463i) {
            int width = getWidth();
            int height = getHeight();
            int x17 = (int) motionEvent.getX();
            int y17 = (int) motionEvent.getY();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportClickCoordinate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdRoundedCornerFrameLayout", "onDown, w=" + width + ", h=" + height + ", x=" + x17 + ", y=" + y17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f252461g;
            int i17 = this.f252462h;
            if (c17933xe8d1b226 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdRoundedCornerFrameLayout", "reportClickCoordinate, snsInfo==null, source=" + i17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportClickCoordinate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
            } else {
                ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.w0(this, width, height, x17, y17, i17, c17933xe8d1b226));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportClickCoordinate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
            }
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
        return dispatchTouchEvent;
    }

    /* renamed from: setIsReportTouchDownPositon */
    public void m71294x1dcf827d(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIsReportTouchDownPositon", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
        this.f252463i = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIsReportTouchDownPositon", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
    }

    public C18429x1cf5f998(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f252461g = null;
        this.f252462h = 0;
        this.f252463i = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
        android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
    }
}
