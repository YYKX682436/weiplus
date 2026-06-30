package i64;

/* loaded from: classes.dex */
public class n0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f370778d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f370779e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f370780f;

    public n0(java.util.List list) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        this.f370780f = list;
        lVar.f152197a = new r45.k3();
        lVar.f152198b = new r45.l3();
        lVar.f152199c = "/cgi-bin/mmux-bin/adlog";
        lVar.f152200d = 1802;
        int i17 = 0;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f370778d = a17;
        r45.k3 k3Var = (r45.k3) a17.f152243a.f152217a;
        r45.d44 d44Var = new r45.d44();
        d44Var.f453624d = o45.wf.f424558c;
        d44Var.f453625e = o45.wf.f424557b;
        d44Var.f453626f = o45.wf.f424560e;
        d44Var.f453627g = wo.q.f529318f;
        d44Var.f453628h = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        d44Var.f453629i = (int) (java.lang.System.currentTimeMillis() / 1000);
        k3Var.f459870d = d44Var;
        while (true) {
            int size = list.size();
            java.util.LinkedList linkedList = k3Var.f459871e;
            if (i17 >= size) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAdLog", "report count: " + linkedList.size());
                return;
            }
            linkedList.add((r45.e44) list.get(i17));
            i17++;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public final int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScene", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdLog");
        this.f370779e = u0Var;
        int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f370778d, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScene", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdLog");
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdLog");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdLog");
        return 1802;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdLog");
        if (i18 == 0 && i19 == 0) {
            int i27 = ((r45.l3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a).f460639d;
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.BUSINESS_SNS_ADLOG_FREQUENCY_INT, java.lang.Integer.valueOf(i27));
        }
        this.f370779e.mo815x76e0bfae(i18, i19, str, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdLog");
    }
}
