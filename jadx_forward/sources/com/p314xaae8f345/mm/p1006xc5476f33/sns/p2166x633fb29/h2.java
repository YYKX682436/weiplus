package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes.dex */
public class h2 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f245749d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f245750e;

    /* renamed from: f, reason: collision with root package name */
    public final int f245751f;

    public h2(int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.nx4();
        lVar.f152198b = new r45.ox4();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/oauth_checkgrant";
        lVar.f152200d = 2842;
        this.f245751f = i17;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f245749d = a17;
        r45.nx4 nx4Var = (r45.nx4) a17.f152243a.f152217a;
        gm0.j1.i();
        int h17 = gm0.j1.b().h();
        nx4Var.f463255d = h17;
        nx4Var.f463256e = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneOauthCheckGrant", "init useruin:%d, bizuin:%d", java.lang.Integer.valueOf(h17), java.lang.Integer.valueOf(nx4Var.f463256e));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public final int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScene", "com.tencent.mm.plugin.sns.model.NetSceneOauthCheckGrant");
        this.f245750e = u0Var;
        int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f245749d, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScene", "com.tencent.mm.plugin.sns.model.NetSceneOauthCheckGrant");
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.model.NetSceneOauthCheckGrant");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.model.NetSceneOauthCheckGrant");
        return 2842;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneOauthCheckGrant");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneOauthCheckGrant", "onGYNetEnd netId : " + i17 + " errType :" + i18 + " errCode: " + i19 + " errMsg :" + str);
        if (i18 == 0 && i19 == 0) {
            r45.ox4 ox4Var = (r45.ox4) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            int i27 = this.f245751f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneOauthCheckGrant", "onGYNetEnd bizUin:%d, status:%d", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(ox4Var.f464138d));
            if (i27 == -1216949095) {
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_OPEN_UPLOAD_WEISHI_BOOLEAN_SYNC, java.lang.Boolean.valueOf(ox4Var.f464138d == 1));
            }
        }
        this.f245750e.mo815x76e0bfae(i18, i19, str, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneOauthCheckGrant");
    }
}
