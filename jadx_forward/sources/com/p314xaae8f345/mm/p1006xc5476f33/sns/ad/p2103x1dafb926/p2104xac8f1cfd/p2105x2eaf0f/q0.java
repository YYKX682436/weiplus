package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public final class q0 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2 {
    public android.view.View.OnClickListener B;

    public q0(android.content.Context context, f54.k kVar, android.view.ViewGroup viewGroup) {
        super(context, kVar, viewGroup);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2
    public void U() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderRepeatPickBtnComp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBtnClick, cid=");
        ab4.d0 p17 = p();
        sb6.append(p17 != null ? p17.f84350d : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdLandingFinderRepeatPickBtnComp", sb6.toString());
        android.view.View.OnClickListener onClickListener = this.B;
        if (onClickListener != null) {
            onClickListener.onClick(W());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderRepeatPickBtnComp");
    }
}
