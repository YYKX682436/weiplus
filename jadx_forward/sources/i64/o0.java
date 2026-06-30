package i64;

/* loaded from: classes4.dex */
public class o0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f370794d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f370795e;

    public o0(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.fo3();
        lVar.f152198b = new r45.go3();
        lVar.f152199c = "/cgi-bin/mmoc-bin/adplayinfo/get_sns_ad_metric";
        lVar.f152200d = 4342;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f370794d = a17;
        r45.fo3 fo3Var = (r45.fo3) a17.f152243a.f152217a;
        fo3Var.f456014d = i17;
        fo3Var.f456015e = str;
        fo3Var.f456016f = str2;
        fo3Var.f456017g = str3;
        fo3Var.f456018h = str4;
        fo3Var.f456019i = i18;
        fo3Var.f456020m = i19;
        fo3Var.f456021n = i27;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScene", "com.tencent.mm.plugin.sns.ad.model.NetSceneDynamicAdDataUpdate");
        this.f370795e = u0Var;
        int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f370794d, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScene", "com.tencent.mm.plugin.sns.ad.model.NetSceneDynamicAdDataUpdate");
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.ad.model.NetSceneDynamicAdDataUpdate");
        int i17 = this.f370794d.f152246d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.ad.model.NetSceneDynamicAdDataUpdate");
        return i17;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.model.NetSceneDynamicAdDataUpdate");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneDynamicAdDataUpdate", "errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f370795e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.model.NetSceneDynamicAdDataUpdate");
    }
}
