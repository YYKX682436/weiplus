package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class e3 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f245701d;

    /* renamed from: e, reason: collision with root package name */
    public final int f245702e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f245703f;

    public e3(int i17, long j17, java.lang.String str, int i18, java.util.List list, int i19) {
        list.size();
        this.f245702e = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.pa6();
        lVar.f152198b = new r45.qa6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmsnstagmemberoption";
        lVar.f152200d = 291;
        lVar.f152201e = 115;
        lVar.f152202f = 1000000115;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f245701d = a17;
        r45.pa6 pa6Var = (r45.pa6) a17.f152243a.f152217a;
        pa6Var.f464446d = i17;
        pa6Var.f464447e = j17;
        pa6Var.f464448f = str;
        pa6Var.f464449g = i18;
        pa6Var.f464451i = i19;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            r45.du5 du5Var = new r45.du5();
            du5Var.f454289d = str2;
            du5Var.f454290e = true;
            linkedList.add(du5Var);
        }
        pa6Var.f464450h = linkedList;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public final int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagMemberOption");
        this.f245703f = u0Var;
        int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f245701d, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagMemberOption");
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagMemberOption");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagMemberOption");
        return 291;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagMemberOption");
        if (i18 != 0 || i19 != 0) {
            this.f245703f.mo815x76e0bfae(i18, i19, str, this);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagMemberOption");
            return;
        }
        r45.ma6 ma6Var = ((r45.qa6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a).f465327d;
        ma6Var.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2 D0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Lj().D0(ma6Var.f461844d);
        D0.f69153x29d92ad0 = ma6Var.f461844d;
        java.lang.String str2 = ma6Var.f461845e;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        D0.f69154x183bff00 = str2;
        int i27 = this.f245702e;
        if (i27 == 1 || i27 == 2 || i27 == 3) {
            D0.f69151x28f0318a = ma6Var.f461846f;
            D0.t0(ma6Var.f461847g);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Lj().d1(D0);
        this.f245703f.mo815x76e0bfae(i18, i19, str, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagMemberOption");
    }
}
