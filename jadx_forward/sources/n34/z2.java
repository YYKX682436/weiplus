package n34;

/* loaded from: classes4.dex */
public class z2 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public z2() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5907xb7926441 c5907xb7926441 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5907xb7926441) abstractC20979x809547d1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListener");
        boolean z17 = false;
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemoveSnsTaskEventListener", "RemoveSnsTaskEvent arrived before account was ready, ignore it.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListener");
        } else if (c5907xb7926441 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5907xb7926441) {
            if (c5907xb7926441.f136211g.f89564a == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t3.f246219e = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t3 t3Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t3();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cleanSnsTask", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                t3Var.f246222b = java.lang.System.currentTimeMillis();
                if (t3Var.f246221a) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanSnsTask", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                } else {
                    new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s3(t3Var).f("");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanSnsTask", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t3.f246219e = false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListener");
            z17 = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.RemoveSnsTaskEventListener", "mismatched event");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListener");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListener");
        return z17;
    }
}
