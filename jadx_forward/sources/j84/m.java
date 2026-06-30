package j84;

/* loaded from: classes4.dex */
public final class m implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f379751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j84.g0 f379752e;

    public m(android.view.View view, j84.g0 g0Var) {
        this.f379751d = view;
        this.f379752e = g0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$bindComponentModel$$inlined$doOnPreDraw$1");
        this.f379751d.getViewTreeObserver().removeOnPreDrawListener(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getAdScratchCardBreakContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        j84.g0 g0Var = this.f379752e;
        android.widget.FrameLayout y17 = g0Var.y();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getAdScratchCardBreakContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        if (y17 != null) {
            y17.removeAllViews();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getAdScratchCardBreakContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.widget.FrameLayout y18 = g0Var.y();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getAdScratchCardBreakContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        if (y18 != null) {
            y18.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getAdScratchCardBreakContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.widget.FrameLayout y19 = g0Var.y();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getAdScratchCardBreakContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        if (y19 != null) {
            y19.setLayoutParams(new android.widget.FrameLayout.LayoutParams(g0Var.E().getWidth(), g0Var.E().getHeight()));
        }
        int[] iArr = new int[2];
        g0Var.E().getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getScratchCardContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.widget.FrameLayout F = g0Var.F();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getScratchCardContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        if (F != null) {
            F.getLocationOnScreen(iArr2);
        }
        float f17 = iArr2[0] - iArr[0];
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setOffsetX$p", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        g0Var.K = f17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setOffsetX$p", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        float f18 = iArr2[1] - iArr[1];
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setOffsetY$p", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        g0Var.L = f18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setOffsetY$p", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$bindComponentModel$$inlined$doOnPreDraw$1");
        return true;
    }
}
