package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public class a8 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2 implements java.io.Serializable {
    public final ab4.s B;
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t C;

    public a8(android.content.Context context, ab4.s sVar, android.view.ViewGroup viewGroup) {
        super(context, sVar, viewGroup);
        this.C = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z7(this);
        this.B = sVar;
        ab4.n0 u17 = u();
        sVar.B1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(u17.c());
        java.lang.String o17 = u17.o();
        sVar.D1 = o17 == null ? "" : o17;
        java.lang.String m17 = u17.m();
        sVar.C1 = m17 == null ? "" : m17;
        java.lang.String i17 = u17.i();
        sVar.E1 = i17 != null ? i17 : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdLandingPageSmartPhoneBtnComp", "btnInfo=" + sVar);
        this.f246919t.a("smartphoneID", (long) sVar.f84424z1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2
    public void Y() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSmartPhoneBtnComp");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e m69779x9cf0d20b = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b();
        ab4.s sVar = this.B;
        m69779x9cf0d20b.m69814xd109581c(sVar.B1, sVar.A1, sVar.C1, sVar.D1, sVar.f84424z1, sVar.E1, this.C);
        P();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSmartPhoneBtnComp");
    }
}
