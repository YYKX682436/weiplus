package c54;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f2 f120223a;

    /* renamed from: b, reason: collision with root package name */
    public final c54.h f120224b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f120225c;

    /* renamed from: d, reason: collision with root package name */
    public long f120226d;

    /* renamed from: e, reason: collision with root package name */
    public final c54.i f120227e;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f2 mHalfEggCardComponent, c54.h mHalfEggCardPageInterface, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mHalfEggCardComponent, "mHalfEggCardComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mHalfEggCardPageInterface, "mHalfEggCardPageInterface");
        this.f120223a = mHalfEggCardComponent;
        this.f120224b = mHalfEggCardPageInterface;
        this.f120225c = str;
        this.f120227e = new c54.i(this);
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f2 f2Var, java.lang.String str) {
        java.lang.Boolean bool;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doStartAnimAndRequestCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.j0.d(str);
        if (d17 == null || d17.length() == 0) {
            this.f120226d = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.HalfEggCard.ComponentController", "doStartAnimAndRequestCardId, no localCardId, reqEggCardId");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.u uVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.u) this.f120224b;
            uVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reqEggCardId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$22");
            uVar.f244679a.K();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reqEggCardId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$22");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1970, 3);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
            f2Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("attachCardRequestInterface", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            f2Var.f244345x = this.f120227e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("attachCardRequestInterface", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            if (f2Var.f246589n == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.HalfEggCard.AdLandingComponent", "--showReqCardAnim--, contentView==null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "--showReqCardAnim--");
                f2Var.X();
                f2Var.f244344w.post(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.a2(f2Var));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
        } else {
            f2Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showLocalCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            if (f2Var.f246589n == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showLocalCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "--showLocalCardAnim--, cardId=" + d17);
                f2Var.X();
                f2Var.S(d17);
                c54.b T = f2Var.T();
                if (T != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isCardAutoJumpH5", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
                    boolean z17 = T.f120204i;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isCardAutoJumpH5", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
                    bool = java.lang.Boolean.valueOf(z17);
                } else {
                    bool = null;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "showLocalCardAnim, cardId=" + d17 + ", autoJumpH5=true");
                    f2Var.Z(true);
                    f2Var.W(f2Var.u(), d17, 1);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "showLocalCardAnim, cardId=" + d17 + ", false=true");
                    f2Var.Y(true);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showLocalCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1970, 2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.HalfEggCard.ComponentController", "doStartAnimAndRequestCardId, pageId=" + str + ", localCardId=" + d17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doStartAnimAndRequestCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
    }
}
