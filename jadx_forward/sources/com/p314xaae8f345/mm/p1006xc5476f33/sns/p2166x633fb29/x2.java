package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f246287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f246288e;

    public x2(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c3 c3Var, boolean z17, r45.k76 k76Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        this.f246287d = z17;
        this.f246288e = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$2");
        if (this.f246287d) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            java.util.List<c01.x8> list = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c3.f245646h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            for (c01.x8 x8Var : list) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewSyncAlbum", "notify list ");
                com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb = (com.p314xaae8f345.mm.ui.C21357x5e7365bb) x8Var;
                c21357x5e7365bb.getClass();
                if ((c01.z1.n() & 32768) == 0) {
                    c21357x5e7365bb.f278193y++;
                    c21357x5e7365bb.C1();
                    c21357x5e7365bb.f278189w.notifyDataSetChanged();
                }
            }
        }
        this.f246288e.mo50305x3d8a09a2(0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$2");
    }
}
