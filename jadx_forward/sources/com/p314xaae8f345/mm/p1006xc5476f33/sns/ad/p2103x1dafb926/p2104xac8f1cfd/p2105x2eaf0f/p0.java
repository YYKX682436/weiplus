package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public class p0 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2 {
    public final f54.g B;

    public p0(android.content.Context context, f54.g gVar, android.view.ViewGroup viewGroup) {
        super(context, gVar, viewGroup);
        this.B = gVar;
        this.f246919t.b("finderUsername", gVar.f341253z1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2
    public void U() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderProfileBtnComp");
        try {
            java.lang.String o17 = u().o();
            java.lang.String k17 = u().k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingFinderProfileBtnComp", "doBtnClick, uxInfo=" + o17 + ", snsId=" + k17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69818x1e004a23(this.f246582d, this.B.f341253z1, o17, k17, 5);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingFinderProfileBtnComp", "doBtnClick, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderProfileBtnComp");
    }
}
