package k84;

/* loaded from: classes4.dex */
public final class y5 implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.c6 f386888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c84.d f386889e;

    public y5(k84.c6 c6Var, c84.d dVar) {
        this.f386888d = c6Var;
        this.f386889e = dVar;
    }

    @Override // ym5.w1
    public void a(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startFullScreenPag$3");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f386888d.j(), "pag cancel!");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startFullScreenPag$3");
    }

    @Override // ym5.w1
    public void b(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startFullScreenPag$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startFullScreenPag$3");
    }

    @Override // ym5.w1
    public void c(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startFullScreenPag$3");
        k84.c6 c6Var = this.f386888d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c6Var.j(), "fullScreen pag end!");
        java.lang.String str = c6Var.j() + "dialog_dismiss";
        try {
            this.f386889e.dismiss();
        } catch (java.lang.Throwable th6) {
            ca4.q.c(str, th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startFullScreenPag$3");
    }

    @Override // ym5.w1
    public void d(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startFullScreenPag$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startFullScreenPag$3");
    }

    @Override // ym5.w1
    public void e(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startFullScreenPag$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startFullScreenPag$3");
    }
}
