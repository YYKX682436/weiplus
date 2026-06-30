package k64;

/* loaded from: classes4.dex */
public abstract class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f386114d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f386115e;

    public abstract void H(r45.mr5 mr5Var, java.lang.Object... objArr);

    public r45.js5 I() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getResponse", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
        com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558 = mo47948x7f0c4558();
        if (mo47948x7f0c4558 instanceof com.p314xaae8f345.mm.p944x882e457a.o) {
            try {
                r45.js5 js5Var = (r45.js5) ((com.p314xaae8f345.mm.p944x882e457a.o) mo47948x7f0c4558).f152244b.f152233a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getResponse", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
                return js5Var;
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.AbsNetScene", "the response result is not the required!!!!");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getResponse", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
        return null;
    }

    public final com.p314xaae8f345.mm.p944x882e457a.m1 J(r45.mr5 mr5Var, r45.js5 js5Var, java.lang.String str, int i17, java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initialize", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
        if (mr5Var == null || js5Var == null || android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initialize", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
            return null;
        }
        try {
            H(mr5Var, objArr);
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = mr5Var;
            lVar.f152198b = js5Var;
            lVar.f152199c = str;
            lVar.f152200d = i17;
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            this.f386114d = a17;
            if (mr5Var == a17.f152243a.f152217a) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AbsNetScene", "the request is same as mRequestAndResponse.getRequestProtoBuf()");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initialize", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
        return this;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public final int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScene", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
        try {
            this.f386115e = u0Var;
            int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f386114d, this);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScene", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
            return mo9409x10f9447a;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScene", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
            return 99999999;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public final int mo808xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f386114d;
        if (oVar != null) {
            int i17 = oVar.f152246d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
            return i17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.AbsNetScene", "the scene is not initialized, please call initialize method");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("beforeSceneEnd", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("beforeSceneEnd", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f386115e;
            if (u0Var != null) {
                u0Var.mo815x76e0bfae(i18, i19, str, this);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
    }
}
