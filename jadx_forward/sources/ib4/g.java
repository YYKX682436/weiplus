package ib4;

/* loaded from: classes4.dex */
public class g extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f371759d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f371760e;

    public g(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.pp3();
        lVar.f152198b = new r45.qp3();
        lVar.f152199c = "/cgi-bin/mmoc-bin/adplayinfo/get_twist_card_status";
        lVar.f152200d = 4689;
        lVar.f152205i = 5000;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f371759d = a17;
        r45.pp3 pp3Var = (r45.pp3) a17.f152243a.f152217a;
        pp3Var.f464819d = str;
        pp3Var.f464820e = i17;
        pp3Var.f464824i = str2;
        pp3Var.f464821f = str3;
        pp3Var.f464822g = 0;
        pp3Var.f464823h = str4;
        pp3Var.f464825m = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneAdGetTwistCardStatus", "scene=" + i17 + ", canvasId=" + str2 + ", cardId=" + str3 + ", giveCardId=" + str4 + ", uxInfo=" + str + ", opType=" + i18);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCardStatus");
        this.f371760e = u0Var;
        int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f371759d, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCardStatus");
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCardStatus");
        int i17 = this.f371759d.f152246d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCardStatus");
        return i17;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCardStatus");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneAdGetTwistCardStatus", "errType=" + i18 + ", errCode=" + i19 + ", errMsg=" + str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f371760e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCardStatus");
    }
}
