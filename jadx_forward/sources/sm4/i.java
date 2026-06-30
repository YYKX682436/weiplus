package sm4;

/* loaded from: classes4.dex */
public class i extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public long f491479d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f491480e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f491481f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f491482g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f491483h;

    /* renamed from: i, reason: collision with root package name */
    public int f491484i;

    public i(sm4.i iVar) {
        this.f491484i = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.NetSceneTopStorySetBlockList", "copy NetSceneTopStorySetBlockList", java.lang.Integer.valueOf(iVar.f491482g.size()), java.lang.Integer.valueOf(iVar.f491483h.size()));
        this.f491484i = iVar.f491484i;
        H(iVar.f491482g, iVar.f491483h);
    }

    public final void H(java.util.List list, java.util.List list2) {
        this.f491479d = java.lang.System.currentTimeMillis();
        this.f491482g = list;
        this.f491483h = list2;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 2859;
        lVar.f152199c = "/cgi-bin/mmsearch-bin/colikeblock";
        lVar.f152197a = new r45.m50();
        lVar.f152198b = new r45.o50();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f491481f = a17;
        r45.m50 m50Var = (r45.m50) a17.f152243a.f152217a;
        for (int i17 = 0; i17 < list.size(); i17++) {
            r45.n50 n50Var = new r45.n50();
            n50Var.f462613d = ((java.lang.Integer) list2.get(i17)).intValue();
            n50Var.f462614e = (java.lang.String) list.get(i17);
            m50Var.f461687d.add(n50Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f491480e = u0Var;
        return mo9409x10f9447a(sVar, this.f491481f, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2859;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.NetSceneTopStorySetBlockList", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f491479d));
        this.f491480e.mo815x76e0bfae(i18, i19, str, this);
    }

    public i(java.util.List list, java.util.List list2) {
        this.f491484i = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.NetSceneTopStorySetBlockList", "create NetSceneTopStorySetBlockList, users size:%s, type size:%s", java.lang.Integer.valueOf(list.size()), java.lang.Integer.valueOf(list2.size()));
        H(list, list2);
    }
}
