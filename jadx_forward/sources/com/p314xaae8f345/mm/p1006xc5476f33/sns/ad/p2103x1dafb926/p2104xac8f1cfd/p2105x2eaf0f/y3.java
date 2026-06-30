package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public final class y3 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2 {
    public final f54.e0 B;
    public p3325xe03a0797.p3326xc267989b.y0 C;
    public boolean D;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 E;

    public y3(android.content.Context context, f54.e0 e0Var, android.view.ViewGroup viewGroup) {
        super(context, e0Var, viewGroup);
        this.B = e0Var;
    }

    public static final void h0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.y3 y3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$closeProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
        y3Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("closeProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = y3Var.E;
        if (u3Var != null && u3Var.isShowing()) {
            u3Var.dismiss();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("closeProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$closeProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void K() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
        super.K();
        if (!this.D) {
            this.D = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.RedPkgUriBtn", "it is going to fetch red pkg url when appear");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fetchRedPkgUrl$default", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
            i0(false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fetchRedPkgUrl$default", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void L() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
        super.L();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.RedPkgUriBtn", "the component is going to destroy");
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.C;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2
    public void U() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(fe1.o.f69744x366c91de, 16);
        i0(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
    }

    public final void i0(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fetchRedPkgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
        f54.e0 e0Var = this.B;
        if (e0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fetchRedPkgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
            return;
        }
        ab4.n0 u17 = u();
        if (u17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.RedPkgUriBtn", "the page data is empty, Please check!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fetchRedPkgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
            return;
        }
        e0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getReceiveUri", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingRedPacketUrlBtnInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReceiveUri", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingRedPacketUrlBtnInfo");
        java.lang.String str = e0Var.f341251z1;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.RedPkgUriBtn", "the receive uri is empty!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fetchRedPkgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
            return;
        }
        e0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getReqScene", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingRedPacketUrlBtnInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReqScene", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingRedPacketUrlBtnInfo");
        java.lang.String str2 = e0Var.B1;
        if (str2 == null) {
            str2 = "cny";
        }
        e0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingRedPacketUrlBtnInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingRedPacketUrlBtnInfo");
        java.lang.String str3 = e0Var.A1;
        java.lang.String str4 = str3 != null ? str3 : "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fromLandingPageData", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlRequestParam$Companion");
        e54.g gVar = new e54.g(str, str2, a54.h.a(u17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTwistCardId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        java.lang.String str5 = u17.f84415y;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTwistCardId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(str5);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTwistCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlRequestParam");
        gVar.f331191d = E1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTwistCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlRequestParam");
        long E12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(u17.i());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPageId", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlRequestParam");
        gVar.f331192e = E12;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPageId", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlRequestParam");
        long E13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(u17.e());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCanvasId", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlRequestParam");
        gVar.f331193f = E13;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCanvasId", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlRequestParam");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlRequestParam");
        gVar.f331194g = str4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlRequestParam");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fromLandingPageData", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlRequestParam$Companion");
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.C;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
        }
        p3325xe03a0797.p3326xc267989b.y0 b17 = p3325xe03a0797.p3326xc267989b.z0.b();
        this.C = b17;
        int i17 = p3325xe03a0797.p3326xc267989b.r0.N0;
        ((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.l.d(b17, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.v3(p3325xe03a0797.p3326xc267989b.q0.f392100d), null, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.w3(gVar, z17, this, null), 2, null)).p(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.x3(z17, this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fetchRedPkgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
    }
}
