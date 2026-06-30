package n34;

/* loaded from: classes4.dex */
public class e5 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public e5() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.UpdateSnsTagListListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6207x9eca7391 c6207x9eca7391 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6207x9eca7391) abstractC20979x809547d1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.UpdateSnsTagListListener");
        r4 = false;
        boolean z17 = false;
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.UpdateSnsTagListListener", "UpdateSnsTagListEvent arrived before account was ready, ignore it.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.UpdateSnsTagListListener");
        } else if (c6207x9eca7391 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6207x9eca7391) {
            com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = c6207x9eca7391.f136458g.f88048a;
            if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d3) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d3 d3Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d3) m1Var;
                d3Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getState", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
                int i17 = d3Var.f245674i;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getState", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTagList", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
                java.util.LinkedList linkedList = d3Var.f245673h;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTagList", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
                am.f00 f00Var = c6207x9eca7391.f136459h;
                f00Var.f88156a = i17;
                if (i17 == 2) {
                    if (linkedList != null && linkedList.size() > 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Lj().y0(7L);
                    }
                    if (linkedList != null) {
                        java.util.Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            r45.ma6 ma6Var = (r45.ma6) it.next();
                            if (ma6Var.f461844d == 7) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2 q2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2();
                                d3Var.I(q2Var, ma6Var);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Lj().d1(q2Var);
                            }
                        }
                    }
                }
                if (i17 != 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2 D0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Lj().D0(7L);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tagInfoToList", "com.tencent.mm.plugin.sns.UpdateSnsTagListListener");
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    java.lang.String str = D0.f69152x693306bd;
                    if (str != null) {
                        for (java.lang.String str2 : str.split(",")) {
                            linkedList2.add(str2);
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tagInfoToList", "com.tencent.mm.plugin.sns.UpdateSnsTagListListener");
                    f00Var.f88157b = linkedList2;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.UpdateSnsTagListListener");
            z17 = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.UpdateSnsTagListListener", "mismatched event");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.UpdateSnsTagListListener");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.UpdateSnsTagListListener");
        return z17;
    }
}
