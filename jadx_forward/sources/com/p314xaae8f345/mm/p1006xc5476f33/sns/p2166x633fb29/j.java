package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes8.dex */
public class j implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k f245850a;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k kVar) {
        this.f245850a = kVar;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTerminate", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$7$1");
        r45.aq3 aq3Var = (r45.aq3) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTerminate", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$7$1");
        if (aq3Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTerminate", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$7$1");
        } else {
            byte[] bArr = null;
            try {
                i17 = aq3Var.f451731d;
            } catch (java.lang.Exception e17) {
                e = e17;
                i17 = -1;
            }
            try {
                bArr = aq3Var.mo14344x5f01b1f6();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "fetchQRCodeInfoMM end, ret=" + aq3Var.f451731d + ", urlType=" + aq3Var.f451734g + ", actionCode=" + aq3Var.f451733f);
            } catch (java.lang.Exception e18) {
                e = e18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "fetchQRCodeInfoMM, exp=" + e.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k kVar = this.f245850a;
                kVar.f245870g.m142013x77b46a52("onFetchQRCodeInfo", java.lang.Long.valueOf(kVar.f245869f), java.lang.Integer.valueOf(i17), 0, bArr);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTerminate", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$7$1");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTerminate", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$7$1");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k kVar2 = this.f245850a;
            kVar2.f245870g.m142013x77b46a52("onFetchQRCodeInfo", java.lang.Long.valueOf(kVar2.f245869f), java.lang.Integer.valueOf(i17), 0, bArr);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTerminate", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$7$1");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTerminate", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$7$1");
    }
}
