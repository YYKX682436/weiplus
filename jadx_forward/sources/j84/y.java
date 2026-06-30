package j84;

/* loaded from: classes4.dex */
public final class y implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f379771d;

    public y(android.widget.FrameLayout frameLayout) {
        this.f379771d = frameLayout;
    }

    @Override // ym5.w1
    public void c(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$showClickPag$1$clickPagListener$1");
        a84.y0.i(c22789xd23e9a9b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
        if (c22789xd23e9a9b != null) {
            try {
                c22789xd23e9a9b.i(this);
                c22789xd23e9a9b.j(null);
                c22789xd23e9a9b.post(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.b0(c22789xd23e9a9b));
            } catch (java.lang.Throwable th6) {
                ca4.q.c("AdPAGHelper", th6);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
        a84.y0.i(this.f379771d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$showClickPag$1$clickPagListener$1");
    }
}
