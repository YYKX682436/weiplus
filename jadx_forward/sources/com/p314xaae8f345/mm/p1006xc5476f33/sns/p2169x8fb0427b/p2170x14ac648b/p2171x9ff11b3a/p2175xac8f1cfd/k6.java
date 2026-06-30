package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public class k6 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2 implements java.io.Serializable {
    public final ab4.q B;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 C;
    public java.lang.String D;
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t E;

    public k6(android.content.Context context, ab4.q qVar, android.view.ViewGroup viewGroup) {
        super(context, qVar, viewGroup);
        this.E = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.i6(this);
        this.B = qVar;
        this.f246919t.b("wxGroupInfo", qVar.f84422z1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2
    public void Y() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePersonalProfileBtnComp");
        java.lang.String o17 = u().o();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (o17 == null) {
            o17 = "";
        }
        ab4.q qVar = this.B;
        if (android.text.TextUtils.isEmpty(qVar.f84422z1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLandingPagePersonalProfileBtnComp", "onBtnClick, wxGroupInfo==null");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdLandingPagePersonalProfileBtnComp", "onBtnClick, btnInfo=" + qVar + ", uxinfo=" + o17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePersonalProfileBtnComp");
            try {
                if (this.C == null) {
                    android.content.Context context = this.f246582d;
                    this.C = db5.e1.Q(context, "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, true, null);
                }
                if (!this.C.isShowing()) {
                    this.C.show();
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLandingPagePersonalProfileBtnComp", "showLoading exp=" + th6.toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePersonalProfileBtnComp");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69859xe326df1d(o17, qVar.f84422z1, this.E);
        }
        P();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePersonalProfileBtnComp");
    }
}
