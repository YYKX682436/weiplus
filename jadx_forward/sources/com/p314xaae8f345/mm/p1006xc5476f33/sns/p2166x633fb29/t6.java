package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class t6 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.w6 f246225d;

    public t6(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.w6 w6Var) {
        this.f246225d = w6Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager$1");
        if (m1Var.mo808xfb85f7b0() == 5987) {
            gm0.j1.n().f354821b.q(5987, this);
            if (((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Zi()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUnreadTipManager", "onBatchObjectDetailSceneEnd: use improveUI, skip");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager$1");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getResp", "com.tencent.mm.plugin.sns.model.NetSceneSnsBatchObjectDetail");
            r45.xf xfVar = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l2) m1Var).f245913f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getResp", "com.tencent.mm.plugin.sns.model.NetSceneSnsBatchObjectDetail");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$002", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.w6 w6Var = this.f246225d;
            w6Var.f246276e = linkedList;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$002", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
            if (xfVar != null) {
                java.util.LinkedList linkedList2 = xfVar.f471577d;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList2)) {
                    java.util.LinkedList linkedList3 = new java.util.LinkedList();
                    java.util.Iterator it = linkedList2.iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) it.next();
                        sb6.append(c19806x4c372b7.f38999xf403ecf6);
                        sb6.append(",");
                        if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.w6.a(w6Var).contains(c19806x4c372b7.f38999xf403ecf6)) {
                            sb6.append("**,");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.w6.a(w6Var).add(c19806x4c372b7.f38999xf403ecf6);
                            linkedList3.add(java.lang.Long.valueOf(c19806x4c372b7.Id));
                            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.w6.a(w6Var).size() >= 3) {
                                break;
                            }
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                    wa4.w wVar = w6Var.f246275d;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                    if (wVar != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                        wa4.w wVar2 = w6Var.f246275d;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                        wVar2.f525831o = linkedList3;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                        wa4.w wVar3 = w6Var.f246275d;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                        wVar3.f525830n = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.w6.a(w6Var);
                    }
                }
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.w6.a(w6Var))) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUnreadTipManager", "onBatchObjectDetailSceneEnd getAvatar, avatar:%s, size:%s", sb6.toString(), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.w6.a(w6Var).size()));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager$1");
    }
}
