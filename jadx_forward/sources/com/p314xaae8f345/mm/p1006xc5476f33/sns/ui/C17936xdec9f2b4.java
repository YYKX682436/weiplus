package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.AdFrameLayout */
/* loaded from: classes4.dex */
public class C17936xdec9f2b4 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.C21494x5bf86537 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b f247719e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c f247720f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f247721g;

    public C17936xdec9f2b4(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addView", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        super.addView(view);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addView", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        if (motionEvent.getAction() == 0 && (cVar = this.f247720f) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.a) cVar;
            aVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDispatchEvent", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$10");
            java.lang.String m70367x7525eefd = aVar.f250853a.m70367x7525eefd();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder = aVar.f250854b;
            android.view.ViewGroup viewGroup = baseViewHolder.f250838x0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.RunnableC17943x7a38efee runnableC17943x7a38efee = baseViewHolder.f250809j;
            android.widget.TextView textView = baseViewHolder.D;
            l44.i iVar = l44.i.f397701a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("recordAdClickCoordinate", "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
            if (m70367x7525eefd == null || viewGroup == null || runnableC17943x7a38efee == null || textView == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("recordAdClickCoordinate", "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
            } else {
                viewGroup.getContext();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdClickCoordinateHelper", "AdFrameLayout dispatch event, snsId = " + m70367x7525eefd + ", eventX = " + motionEvent.getX() + ", eventY = " + motionEvent.getY() + ", eventRawX = " + motionEvent.getRawX() + ", eventRawY = " + motionEvent.getRawY());
                r45.r2 r2Var = new r45.r2();
                r2Var.f465984d = motionEvent.getX();
                r2Var.f465985e = motionEvent.getY();
                r2Var.f465986f = motionEvent.getRawX();
                r2Var.f465987g = motionEvent.getRawY();
                r2Var.f465990m = l44.i.f397702b;
                r2Var.f465991n = l44.i.f397703c;
                r2Var.f465988h = (float) viewGroup.getWidth();
                l44.i iVar2 = l44.i.f397701a;
                r2Var.f465989i = (iVar2.a(textView) + ((float) textView.getHeight())) - iVar2.a(runnableC17943x7a38efee);
                l44.i.f397704d.put(m70367x7525eefd, r2Var);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("recordAdClickCoordinate", "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDispatchEvent", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$10");
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        return dispatchTouchEvent;
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("draw", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        super.draw(canvas);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("draw", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }

    /* renamed from: getAdFullFrameAnimContainer */
    public android.widget.FrameLayout m70539x82fea36b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdFullFrameAnimContainer", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        if (this.f247721g == null) {
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
            this.f247721g = frameLayout;
            addView(frameLayout);
        }
        android.widget.FrameLayout frameLayout2 = this.f247721g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdFullFrameAnimContainer", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        return frameLayout2;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        super.onConfigurationChanged(configuration);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b bVar = this.f247719e;
        if (bVar != null) {
            q74.d0 d0Var = (q74.d0) bVar;
            d0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyConfigurationChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCardBreakFrameLogic", "notifyConfigurationChanged, calcProductCompBreakFrameLayoutParams");
            d0Var.f441976d.h();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyConfigurationChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        super.onDetachedFromWindow();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.C21494x5bf86537, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLayout", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        java.lang.System.currentTimeMillis();
        super.onLayout(z17, i17, i18, i19, i27);
        android.widget.FrameLayout frameLayout = this.f247721g;
        if (frameLayout != null) {
            frameLayout.layout(0, 0, getWidth(), getHeight());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayout", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMeasure", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        super.onMeasure(i17, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMeasure", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSizeChanged", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        super.onSizeChanged(i17, i18, i19, i27);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSizeChanged", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeView", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        super.removeView(view);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeView", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestLayout", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        super.requestLayout();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestLayout", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }

    /* renamed from: setNotifyConfigurationChangedCallback */
    public void m70540xd37bdf2e(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setNotifyConfigurationChangedCallback", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        this.f247719e = bVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setNotifyConfigurationChangedCallback", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }

    /* renamed from: setOnDispatchTouchEventListener */
    public void m70541xa22d914a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c cVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnDispatchTouchEventListener", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        this.f247720f = cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnDispatchTouchEventListener", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }
}
