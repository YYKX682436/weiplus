package ib4;

/* loaded from: classes4.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f371747d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f371748e;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5, long j17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.k2();
        lVar.f152198b = new r45.l2();
        lVar.f152199c = "/cgi-bin/mmoc-bin/adplayinfo/ad_anti_abuse";
        lVar.f152200d = 4679;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f371747d = a17;
        r45.k2 k2Var = (r45.k2) a17.f152243a.f152217a;
        k2Var.f459849d = str == null ? "" : str;
        k2Var.f459853h = str2 == null ? "" : str2;
        k2Var.f459850e = str3 == null ? "" : str3;
        k2Var.f459851f = i17;
        k2Var.f459852g = str4 == null ? "" : str4;
        k2Var.f459854i = str5 == null ? "" : str5;
        k2Var.f459855m = j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneAdAntiAbuse", "NetSceneAdAntiAbuse, canvasId=" + str + ", pageId=" + str2 + ", scene=" + i17 + ", uxInfo=" + str3 + ", localTime= " + j17);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdAntiAbuse");
        this.f371748e = u0Var;
        int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f371747d, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdAntiAbuse");
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdAntiAbuse");
        int i17 = this.f371747d.f152246d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdAntiAbuse");
        return i17;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdAntiAbuse");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneAdAntiAbuse", "NetSceneAdAntiAbuse, errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f371748e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdAntiAbuse");
    }
}
