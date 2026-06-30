package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2124x2ad8c7ad;

/* renamed from: com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView */
/* loaded from: classes4.dex */
public class C17758x730d4dd2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 {

    /* renamed from: b2, reason: collision with root package name */
    public d94.b f244743b2;

    /* renamed from: c2, reason: collision with root package name */
    public long f244744c2;

    /* renamed from: d2, reason: collision with root package name */
    public int f244745d2;

    /* renamed from: e2, reason: collision with root package name */
    public long f244746e2;

    /* renamed from: f2, reason: collision with root package name */
    public q74.u f244747f2;

    public C17758x730d4dd2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f244743b2 = null;
        this.f244744c2 = 0L;
        this.f244745d2 = 0;
        this.f244746e2 = 0L;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
        if (motionEvent.getAction() == 0) {
            d94.b bVar = this.f244743b2;
            if (bVar != null) {
                ((d94.g) bVar).a(motionEvent);
            }
            this.f244746e2 = java.lang.System.currentTimeMillis();
            q74.u uVar = this.f244747f2;
            if (uVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActionDown", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic$mTouchActionListener$1");
                q74.z.a(((q74.y) uVar).f442103a);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActionDown", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic$mTouchActionListener$1");
            }
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
        return dispatchTouchEvent;
    }

    /* renamed from: getTotalTouchCount */
    public int m69489x6f36753e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTotalTouchCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdSlideRecyclerView", "totalCount:" + this.f244745d2);
        int i17 = this.f244745d2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTotalTouchCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
        return i17;
    }

    /* renamed from: getTotalTouchDuration */
    public long m69490x91c80705() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTotalTouchDuration", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdSlideRecyclerView", "totalDuration:" + this.f244744c2);
        long j17 = this.f244744c2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTotalTouchDuration", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
        return j17;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01f2  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2124x2ad8c7ad.C17758x730d4dd2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: setTouchActionListener */
    public void m69491xc6b73e67(q74.u uVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTouchActionListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
        this.f244747f2 = uVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTouchActionListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
    }

    /* renamed from: setTouchEventProxy */
    public void m69492xeaf65bd1(d94.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTouchEventProxy", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
        this.f244743b2 = bVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdSlideRecyclerView", "setTouchEventProxy:" + bVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTouchEventProxy", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
    }

    public C17758x730d4dd2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f244743b2 = null;
        this.f244744c2 = 0L;
        this.f244745d2 = 0;
        this.f244746e2 = 0L;
    }
}
