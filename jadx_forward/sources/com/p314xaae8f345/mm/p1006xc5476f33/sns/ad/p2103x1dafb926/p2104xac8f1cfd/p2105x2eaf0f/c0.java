package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public class c0 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2 {
    public final f54.h B;

    public c0(android.content.Context context, f54.h hVar, android.view.ViewGroup viewGroup) {
        super(context, hVar, viewGroup);
        this.B = hVar;
        this.f246919t.b("finderExportId", hVar.f341255z1);
        this.f246919t.b("finderUsername", hVar.B1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2
    public void U() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderFeedsBtnComp");
        try {
            java.lang.String o17 = u().o();
            java.lang.String k17 = u().k();
            int l17 = u().l();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingFinderFeedsBtnComp", "doBtnClick, uxInfo = " + o17 + ", snsId = " + k17 + ", source = " + l17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e m69779x9cf0d20b = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b();
            f54.h hVar = this.B;
            m69779x9cf0d20b.m69816x89fa1980(hVar.B1, hVar.A1, hVar.f341255z1, o17, k17, l17, 5);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingFinderFeedsBtnComp", "doBtnClick, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderFeedsBtnComp");
    }
}
