package j84;

/* loaded from: classes4.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j84.g0 f379706d;

    public b0(j84.g0 g0Var) {
        this.f379706d = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$startCouponAnimation$2$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTextContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.widget.LinearLayout G = this.f379706d.G();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTextContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        if (G != null) {
            G.setTranslationX(0.0f);
            android.view.ViewGroup.LayoutParams layoutParams = G.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.removeRule(13);
                layoutParams2.addRule(9);
                layoutParams2.addRule(15);
                layoutParams2.addRule(0, com.p314xaae8f345.mm.R.id.snu);
                layoutParams2.setMarginEnd(i65.a.b(G.getContext(), 8));
                G.setLayoutParams(layoutParams2);
            }
            G.requestLayout();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$startCouponAnimation$2$1$1");
    }
}
