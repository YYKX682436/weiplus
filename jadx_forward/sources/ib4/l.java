package ib4;

/* loaded from: classes2.dex */
public class l extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f371771d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f371772e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371773f;

    public l(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.jg3();
        lVar.f152198b = new r45.kg3();
        lVar.f152199c = "/cgi-bin/mmgame-bin/getgamecanvasinfo";
        lVar.f152200d = 1337;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f371771d = a17;
        r45.jg3 jg3Var = (r45.jg3) a17.f152243a.f152217a;
        jg3Var.f459323d = str;
        jg3Var.f459324e = str2;
        jg3Var.f459325f = str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLandingPagesDynamicUpdate", "Req: shareType:" + str2 + " sharedAppId :" + str);
    }

    public java.lang.String H() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getJsonString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneLandingPagesDynamicUpdate");
        java.lang.String str = this.f371773f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getJsonString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneLandingPagesDynamicUpdate");
        return str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneLandingPagesDynamicUpdate");
        this.f371772e = u0Var;
        int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f371771d, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneLandingPagesDynamicUpdate");
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneLandingPagesDynamicUpdate");
        int i17 = this.f371771d.f152246d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneLandingPagesDynamicUpdate");
        return i17;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneLandingPagesDynamicUpdate");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLandingPagesDynamicUpdate", "netId : " + i17 + " errType :" + i18 + " errCode: " + i19 + " errMsg :" + str + " sceneType: " + mo808xfb85f7b0());
        if (mo808xfb85f7b0() == 1337) {
            this.f371773f = ((r45.kg3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a).f460211d;
        } else if (mo808xfb85f7b0() == 2721) {
            this.f371773f = ((r45.by4) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a).f452679d;
        }
        this.f371772e.mo815x76e0bfae(i18, i19, str, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneLandingPagesDynamicUpdate");
    }

    public l(java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ay4();
        lVar.f152198b = new r45.by4();
        lVar.f152199c = "/cgi-bin/mmux-bin/wxaapp/mmuxwxa_officialsync";
        lVar.f152200d = 2721;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f371771d = a17;
        ((r45.ay4) a17.f152243a.f152217a).f451903d = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLandingPagesDynamicUpdate", "Req: syncBuffer:" + str);
    }
}
