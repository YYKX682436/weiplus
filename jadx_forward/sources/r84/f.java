package r84;

/* loaded from: classes4.dex */
public final class f extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2144xc2a3071e.C17794x6bc92636 f474860a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2144xc2a3071e.C17794x6bc92636 c17794x6bc92636, android.os.Looper looper) {
        super(looper);
        this.f474860a = c17794x6bc92636;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message msg) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$mAnimHandler$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2144xc2a3071e.C17794x6bc92636.f245077t;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMBulletScreenInfo$p", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2144xc2a3071e.C17794x6bc92636 c17794x6bc92636 = this.f474860a;
        s34.c cVar = c17794x6bc92636.f245078d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMBulletScreenInfo$p", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        if (cVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$mAnimHandler$1");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$doAnim", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        c17794x6bc92636.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAnim", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2144xc2a3071e.C17793xff4d2215 c17793xff4d2215 = c17794x6bc92636.f245079e;
        if (c17793xff4d2215 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAnim", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        } else {
            s34.c cVar2 = c17794x6bc92636.f245078d;
            if (cVar2 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAnim", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
            } else {
                int m69580x2ab3069 = c17793xff4d2215.m69580x2ab3069();
                android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(m69580x2ab3069, c17794x6bc92636.f245082h + m69580x2ab3069 + c17794x6bc92636.f245084m);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBulletShootingDuration", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
                long j17 = cVar2.f484125g;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBulletShootingDuration", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
                ofInt.setDuration(j17);
                ofInt.addUpdateListener(new r84.e(c17793xff4d2215));
                ofInt.start();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAnim", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$doAnim", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMIsStopAnim$p", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        boolean z17 = c17794x6bc92636.f245080f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMIsStopAnim$p", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        if (!z17) {
            removeCallbacksAndMessages(null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBulletShootingTime", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
            long j18 = cVar.f484126h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBulletShootingTime", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
            sendEmptyMessageDelayed(1, j18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$mAnimHandler$1");
    }
}
