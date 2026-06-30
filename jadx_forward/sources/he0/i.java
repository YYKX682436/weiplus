package he0;

/* loaded from: classes.dex */
public class i extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public i() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.DumpSnsListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.DumpSnsListener");
        if (gm0.j1.a()) {
            gm0.j1.i();
            java.lang.String h17 = gm0.j1.u().h();
            java.lang.String D = lp0.b.D();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DumpSnsListener", "dump %s", D);
            com.p314xaae8f345.mm.vfs.w6.h(D + "sns.dump");
            com.p314xaae8f345.mm.vfs.w6.c(h17 + "SnsMicroMsg.db", D + "sns.dump");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.DumpSnsListener");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DumpSnsListener", "DumpSnsEvent arrived before account was ready, ignore it.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.DumpSnsListener");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.DumpSnsListener");
        return false;
    }
}
