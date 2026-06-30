package p44;

/* loaded from: classes4.dex */
public final class b extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.C17716xcf524a4c f433303a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.C17716xcf524a4c c17716xcf524a4c, android.os.Looper looper) {
        super(looper);
        this.f433303a = c17716xcf524a4c;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message msg) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleMessage", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView$mUIHandler$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagePickCardTipView", "handleMessage, msg=" + msg.what);
        int i17 = msg.what;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.C17716xcf524a4c c17716xcf524a4c = this.f433303a;
        if (i17 == 1) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.C17716xcf524a4c.f244229n;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMTextStyleTipLayout$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            android.widget.LinearLayout linearLayout = c17716xcf524a4c.f244231e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMTextStyleTipLayout$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            if (linearLayout != null) {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(linearLayout, "alpha", 0.0f, 1.0f);
                p44.q.f433365a.a(linearLayout, ofFloat);
                ofFloat.setDuration(300L);
                ofFloat.start();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMBtnStyleTipLayout$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = c17716xcf524a4c.f244232f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMBtnStyleTipLayout$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            if (c22646x1e9ca55 != null) {
                c22646x1e9ca55.setAlpha(0.0f);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMAdLandingPageEggCardHelper$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0 i0Var = c17716xcf524a4c.f244236m;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMAdLandingPageEggCardHelper$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            if (i0Var != null) {
                i0Var.L(false, false);
            }
            sendEmptyMessageDelayed(2, 5000L);
        } else if (i17 == 2) {
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.C17716xcf524a4c.f244229n;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMTextStyleTipLayout$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            android.widget.LinearLayout linearLayout2 = c17716xcf524a4c.f244231e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMTextStyleTipLayout$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            if (linearLayout2 != null) {
                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(linearLayout2, "alpha", 1.0f, 0.0f);
                p44.q.f433365a.a(linearLayout2, ofFloat2);
                ofFloat2.setDuration(300L);
                ofFloat2.start();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMBtnStyleTipLayout$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca552 = c17716xcf524a4c.f244232f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMBtnStyleTipLayout$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            if (c22646x1e9ca552 != null) {
                android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(c22646x1e9ca552, "alpha", 0.0f, 1.0f);
                p44.q.f433365a.a(c22646x1e9ca552, ofFloat3);
                ofFloat3.setStartDelay(100L);
                ofFloat3.setDuration(300L);
                ofFloat3.start();
            }
            sendEmptyMessageDelayed(3, 5000L);
        } else if (i17 == 3) {
            int i27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.C17716xcf524a4c.f244229n;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMTextStyleTipLayout$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            android.widget.LinearLayout linearLayout3 = c17716xcf524a4c.f244231e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMTextStyleTipLayout$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            if (linearLayout3 != null && linearLayout3.getAlpha() > 0.0f) {
                android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(linearLayout3, "alpha", c17716xcf524a4c.getAlpha(), 0.0f);
                p44.q.f433365a.a(linearLayout3, ofFloat4);
                ofFloat4.setDuration(300L);
                ofFloat4.start();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMBtnStyleTipLayout$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca553 = c17716xcf524a4c.f244232f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMBtnStyleTipLayout$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            if (c22646x1e9ca553 != null) {
                android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(c22646x1e9ca553, "alpha", 1.0f, 0.0f);
                p44.q.f433365a.a(c22646x1e9ca553, ofFloat5);
                ofFloat5.addListener(new p44.a(c17716xcf524a4c));
                ofFloat5.setDuration(300L);
                ofFloat5.start();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMAdLandingPageEggCardHelper$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0 i0Var2 = c17716xcf524a4c.f244236m;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMAdLandingPageEggCardHelper$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            if (i0Var2 != null) {
                i0Var2.L(true, true);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMessage", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView$mUIHandler$1");
    }
}
