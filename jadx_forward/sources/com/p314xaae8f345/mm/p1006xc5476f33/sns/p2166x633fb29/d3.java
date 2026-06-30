package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class d3 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f245669d;

    /* renamed from: e, reason: collision with root package name */
    public final int f245670e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f245671f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f245672g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f245673h = null;

    /* renamed from: i, reason: collision with root package name */
    public int f245674i;

    public d3(int i17) {
        this.f245670e = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.na6();
        lVar.f152198b = new r45.oa6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmsnstaglist";
        lVar.f152200d = 292;
        lVar.f152201e = 116;
        lVar.f152202f = 1000000116;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f245669d = a17;
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ej().J0("@__weixintsnstag").f67951x4b6e68b9;
        str = str == null ? "" : str;
        this.f245671f = str;
        r45.na6 na6Var = (r45.na6) a17.f152243a.f152217a;
        na6Var.f462743d = i17;
        na6Var.f462744e = str;
    }

    public java.util.List H(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTagList", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = this.f245673h;
        if (linkedList2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTagList", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
            return linkedList;
        }
        java.util.Iterator it = linkedList2.iterator();
        while (it.hasNext()) {
            r45.ma6 ma6Var = (r45.ma6) it.next();
            if (ma6Var.f461844d == j17) {
                java.util.Iterator it6 = ma6Var.f461847g.iterator();
                while (it6.hasNext()) {
                    linkedList.add(((r45.du5) it6.next()).f454289d);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTagList", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
                return linkedList;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTagList", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
        return linkedList;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2 I(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2 q2Var, r45.ma6 ma6Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tagToInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
        q2Var.f69153x29d92ad0 = ma6Var.f461844d;
        java.lang.String str = ma6Var.f461845e;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        q2Var.f69154x183bff00 = str;
        q2Var.f69151x28f0318a = ma6Var.f461846f;
        q2Var.t0(ma6Var.f461847g);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tagToInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
        return q2Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public final int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
        this.f245672g = u0Var;
        int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f245669d, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
        return 292;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        boolean z17;
        java.util.Iterator it;
        boolean z18;
        boolean z19;
        boolean z27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
        if (i18 != 0 || i19 != 0) {
            this.f245672g.mo815x76e0bfae(i18, i19, str, this);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
            return;
        }
        r45.oa6 oa6Var = (r45.oa6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f245674i = oa6Var.f463640h;
        java.util.LinkedList linkedList = oa6Var.f463639g;
        this.f245673h = linkedList;
        java.lang.String str2 = oa6Var.f463637e;
        if (this.f245671f.equals(str2)) {
            this.f245672g.mo815x76e0bfae(i18, i19, str, this);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
            return;
        }
        java.util.List z07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Lj().z0();
        if (this.f245670e != 3) {
            java.util.Iterator it6 = ((java.util.ArrayList) z07).iterator();
            while (it6.hasNext()) {
                java.lang.Long l17 = (java.lang.Long) it6.next();
                java.util.Iterator it7 = linkedList.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        z27 = false;
                        break;
                    }
                    if (l17.longValue() == ((r45.ma6) it7.next()).f461844d) {
                        z27 = true;
                        break;
                    }
                }
                if (!z27) {
                    it6.remove();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Lj().y0(l17.longValue());
                }
            }
        }
        java.util.Iterator it8 = linkedList.iterator();
        while (it8.hasNext()) {
            r45.ma6 ma6Var = (r45.ma6) it8.next();
            java.lang.Long valueOf = java.lang.Long.valueOf(ma6Var.f461844d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isListContainId", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
            java.util.Iterator it9 = ((java.util.ArrayList) z07).iterator();
            while (true) {
                if (!it9.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isListContainId", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
                    z17 = false;
                    break;
                } else if (((java.lang.Long) it9.next()).longValue() == valueOf.longValue()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isListContainId", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
                    z17 = true;
                    break;
                }
            }
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2 D0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Lj().D0(ma6Var.f461844d);
                java.lang.String str3 = D0.f69154x183bff00;
                if ((str3 == null || str3.equals(ma6Var.f461845e)) && D0.f69151x28f0318a == ma6Var.f461846f) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isMemberListChange", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
                    java.lang.String[] split = D0.f69152x693306bd.split(",");
                    java.util.Iterator it10 = ma6Var.f461847g.iterator();
                    while (true) {
                        if (!it10.hasNext()) {
                            it = it8;
                            z18 = false;
                            break;
                        }
                        r45.du5 du5Var = (r45.du5) it10.next();
                        it = it8;
                        int i27 = 0;
                        while (true) {
                            if (i27 >= split.length) {
                                z19 = false;
                                break;
                            } else {
                                if (split[i27].equals(du5Var)) {
                                    z19 = true;
                                    break;
                                }
                                i27++;
                            }
                        }
                        if (!z19) {
                            z18 = true;
                            break;
                        }
                        it8 = it;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isMemberListChange", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
                    if (!z18) {
                    }
                } else {
                    it = it8;
                }
                I(D0, ma6Var);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Lj().d1(D0);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2 q2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2();
                I(q2Var, ma6Var);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Lj().d1(q2Var);
                it = it8;
            }
            it8 = it;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2 J0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ej().J0("@__weixintsnstag");
        J0.f67951x4b6e68b9 = str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ej().k1(J0);
        this.f245672g.mo815x76e0bfae(i18, i19, str, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
    }
}
