package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class f3 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f245720d;

    /* renamed from: e, reason: collision with root package name */
    public final int f245721e;

    /* renamed from: f, reason: collision with root package name */
    public final long f245722f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f245723g;

    public f3(int i17, long j17, java.lang.String str) {
        this.f245722f = 0L;
        this.f245722f = j17;
        this.f245721e = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ra6();
        lVar.f152198b = new r45.sa6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmsnstagoption";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a0.f33775x366c91de;
        lVar.f152201e = 114;
        lVar.f152202f = 1000000114;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f245720d = a17;
        r45.ra6 ra6Var = (r45.ra6) a17.f152243a.f152217a;
        ra6Var.f466230d = i17;
        ra6Var.f466231e = j17;
        ra6Var.f466232f = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public final int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagOption");
        this.f245723g = u0Var;
        int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f245720d, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagOption");
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagOption");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagOption");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a0.f33775x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagOption");
        if (i18 != 0 || i19 != 0) {
            this.f245723g.mo815x76e0bfae(i18, i19, str, this);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagOption");
            return;
        }
        r45.ma6 ma6Var = ((r45.sa6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a).f467133d;
        ma6Var.toString();
        int i27 = this.f245721e;
        if (i27 == 1 || i27 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2 D0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Lj().D0(ma6Var.f461844d);
            D0.f69153x29d92ad0 = ma6Var.f461844d;
            java.lang.String str2 = ma6Var.f461845e;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            D0.f69154x183bff00 = str2;
            D0.f69151x28f0318a = ma6Var.f461846f;
            D0.t0(ma6Var.f461847g);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Lj().d1(D0);
        } else if (i27 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Lj().y0(this.f245722f);
        }
        this.f245723g.mo815x76e0bfae(i18, i19, str, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagOption");
    }
}
