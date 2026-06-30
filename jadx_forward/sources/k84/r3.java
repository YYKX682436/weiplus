package k84;

/* loaded from: classes3.dex */
public final class r3 implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f386760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c84.d f386761e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f386762f;

    public r3(k84.d4 d4Var, c84.d dVar, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f386760d = d4Var;
        this.f386761e = dVar;
        this.f386762f = qVar;
    }

    @Override // ym5.w1
    public void a(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startFullScreenPag$4$1$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f386760d.j(), "pag cancel!");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startFullScreenPag$4$1$1");
    }

    @Override // ym5.w1
    public void b(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startFullScreenPag$4$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startFullScreenPag$4$1$1");
    }

    @Override // ym5.w1
    public void c(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startFullScreenPag$4$1$1");
        k84.d4 d4Var = this.f386760d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d4Var.j(), "pag end!");
        this.f386761e.dismiss();
        try {
            p3325xe03a0797.p3326xc267989b.q qVar = this.f386762f;
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a));
        } catch (java.lang.IllegalStateException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(d4Var.j(), e17, "onAnimationEnd resume error!", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startFullScreenPag$4$1$1");
    }

    @Override // ym5.w1
    public void d(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startFullScreenPag$4$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startFullScreenPag$4$1$1");
    }

    @Override // ym5.w1
    public void e(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startFullScreenPag$4$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startFullScreenPag$4$1$1");
    }
}
