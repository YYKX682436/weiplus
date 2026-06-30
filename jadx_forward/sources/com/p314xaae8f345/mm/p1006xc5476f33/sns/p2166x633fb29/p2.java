package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class p2 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.List f246102m = new java.util.Vector();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f246103d;

    /* renamed from: e, reason: collision with root package name */
    public final long f246104e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f246105f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f246106g = false;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 f246107h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f246108i = false;

    public p2(long j17) {
        this.f246104e = j17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.m96();
        lVar.f152198b = new r45.n96();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmsnsobjectdetail";
        lVar.f152200d = 210;
        lVar.f152201e = 101;
        lVar.f152202f = 1000000101;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f246103d = a17;
        com.p314xaae8f345.mm.p944x882e457a.m mVar = a17.f152243a;
        ((r45.m96) mVar.f152217a).f461818d = j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doGetNameList", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        ((r45.m96) mVar.f152217a).f461819e = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doGetNameList", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
    }

    public static boolean H(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addDetailReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        java.util.List list = f246102m;
        if (((java.util.Vector) list).contains(java.lang.Long.valueOf(j17))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDetailReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
            return false;
        }
        ((java.util.Vector) list).add(java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDetailReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        return true;
    }

    public boolean I(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkFeedForbidAccessWithResp", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        boolean z17 = true;
        boolean z18 = i17 == 0 && i18 == 0;
        r45.n96 n96Var = (r45.n96) this.f246103d.f152244b.f152233a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = n96Var.f462719d;
        int i19 = n96Var.f462720e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsObjectDetial", "checkFeedForbidAccessWithResp errType=%s, errCode=%s, CanNotSeeReason=%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if ((!z18 && i19 == 0) || (c19806x4c372b7 != null && c19806x4c372b7.Id != 0)) {
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkFeedForbidAccessWithResp", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        return z17;
    }

    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 J() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRespSnsObject", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = ((r45.n96) this.f246103d.f152244b.f152233a).f462719d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRespSnsObject", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        return c19806x4c372b7;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public final int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        this.f246105f = u0Var;
        int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f246103d, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        return 210;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        if (i18 != 0 || i19 != 0) {
            this.f246105f.mo815x76e0bfae(i18, i19, str, this);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
            return;
        }
        r45.n96 n96Var = (r45.n96) this.f246103d.f152244b.f152233a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = n96Var.f462719d;
        if (c19806x4c372b7 != null) {
            ca4.f1.f121430a.j("MicroMsg.NetSceneSnsObjectDetial", c19806x4c372b7, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsObjectDetial", "snsdetail xml " + x51.j1.f(c19806x4c372b7.f38990xb6613a90));
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b72 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7();
            try {
                c19806x4c372b72.mo11468x92b714fd(c19806x4c372b7.mo14344x5f01b1f6());
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneSnsObjectDetial", e17, "SnsObject parseFrom error", new java.lang.Object[0]);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.p(c19806x4c372b72);
            java.util.Iterator<r45.e86> it = c19806x4c372b7.f38963x20c46e68.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.x1.f252839a.j(c19806x4c372b7.Id, it.next());
            }
        }
        this.f246105f.mo815x76e0bfae(i18, i19, str, this);
        if (n96Var.f462720e == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeDetailId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
            ((java.util.Vector) f246102m).remove(java.lang.Long.valueOf(this.f246104e));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeDetailId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
    }
}
