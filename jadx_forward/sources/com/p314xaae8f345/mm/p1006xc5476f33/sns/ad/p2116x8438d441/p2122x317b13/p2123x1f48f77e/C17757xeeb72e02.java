package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2123x1f48f77e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/timeline/item/adSlideCard/AdSlideCardRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "getTotalTouchDuration", "", "getTotalTouchCount", "Lp74/p;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "Ljz5/f0;", "setTouchActionListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView */
/* loaded from: classes4.dex */
public final class C17757xeeb72e02 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 {

    /* renamed from: b2, reason: collision with root package name */
    public long f244739b2;

    /* renamed from: c2, reason: collision with root package name */
    public int f244740c2;

    /* renamed from: d2, reason: collision with root package name */
    public long f244741d2;

    /* renamed from: e2, reason: collision with root package name */
    public p74.p f244742e2;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17757xeeb72e02(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent e17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        if (e17.getAction() == 0) {
            this.f244741d2 = java.lang.System.currentTimeMillis();
            if (this.f244742e2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActionDown", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic$mTouchActionListener$1");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActionDown", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic$mTouchActionListener$1");
            }
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(e17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView");
        return dispatchTouchEvent;
    }

    /* renamed from: getTotalTouchCount */
    public final int m69486x6f36753e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTotalTouchCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView");
        int i17 = this.f244740c2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTotalTouchCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView");
        return i17;
    }

    /* renamed from: getTotalTouchDuration */
    public final long m69487x91c80705() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTotalTouchDuration", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView");
        long j17 = this.f244739b2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTotalTouchDuration", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView");
        return j17;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x01e9  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r27) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2123x1f48f77e.C17757xeeb72e02.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: setTouchActionListener */
    public final void m69488xc6b73e67(p74.p pVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTouchActionListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView");
        this.f244742e2 = pVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTouchActionListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17757xeeb72e02(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
