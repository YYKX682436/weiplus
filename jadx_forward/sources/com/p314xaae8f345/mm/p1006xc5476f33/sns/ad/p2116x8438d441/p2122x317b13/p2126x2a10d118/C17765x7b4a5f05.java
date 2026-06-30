package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\tB\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u0006¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/OverScrollRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "isActive", "Ljz5/f0;", "setActive", "", "maxDistance", "setMaxOverScrollDistance", "Lv74/a1;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "setOnOverScrollActionListener", "getCurrentOverScrollDistance", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView */
/* loaded from: classes4.dex */
public final class C17765x7b4a5f05 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 {

    /* renamed from: b2, reason: collision with root package name */
    public int f244776b2;

    /* renamed from: c2, reason: collision with root package name */
    public float f244777c2;

    /* renamed from: d2, reason: collision with root package name */
    public boolean f244778d2;

    /* renamed from: e2, reason: collision with root package name */
    public boolean f244779e2;

    /* renamed from: f2, reason: collision with root package name */
    public int f244780f2;

    /* renamed from: g2, reason: collision with root package name */
    public boolean f244781g2;

    /* renamed from: h2, reason: collision with root package name */
    public v74.a1 f244782h2;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17765x7b4a5f05(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
        boolean z17 = false;
        if (!this.f244781g2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
            return false;
        }
        if (motionEvent != null && motionEvent.getAction() == 0) {
            z17 = true;
        }
        if (z17) {
            g1(motionEvent.getRawX());
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
        return dispatchTouchEvent;
    }

    public final void g1(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleOnActionDown", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
        boolean canScrollHorizontally = canScrollHorizontally(1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OverScrollRecyclerView", "onDown, canScroll=" + canScrollHorizontally);
        this.f244777c2 = f17;
        this.f244779e2 = canScrollHorizontally;
        this.f244778d2 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleOnActionDown", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
    }

    /* renamed from: getCurrentOverScrollDistance */
    public final int m69500xbdf6ca79() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentOverScrollDistance", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
        int i17 = -((int) getTranslationX());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentOverScrollDistance", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
        return i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
        boolean z17 = false;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            z17 = true;
        }
        if (z17) {
            g1(motionEvent.getRawX());
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
        return onInterceptTouchEvent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if (r3 != 3) goto L55;
     */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: setActive */
    public final void m69501x37bd608(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setActive", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OverScrollRecyclerView", "setActive, isActive=" + z17);
        this.f244781g2 = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setActive", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
    }

    /* renamed from: setMaxOverScrollDistance */
    public final void m69502x63619518(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMaxOverScrollDistance", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
        this.f244776b2 = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMaxOverScrollDistance", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
    }

    /* renamed from: setOnOverScrollActionListener */
    public final void m69503xdfd41f2c(v74.a1 listener) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnOverScrollActionListener", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f244782h2 = listener;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnOverScrollActionListener", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17765x7b4a5f05(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f244776b2 = i65.a.b(getContext(), 64);
        this.f244779e2 = true;
        this.f244781g2 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
        this.f244780f2 = android.view.ViewConfiguration.getTouchSlop();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OverScrollRecyclerView", "init, touchSlop=" + this.f244780f2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
    }
}
