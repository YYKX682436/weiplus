package z12;

/* loaded from: classes15.dex */
public final class v extends com.p314xaae8f345.mm.p944x882e457a.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f550904d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f550905e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f550906f = "MicroMsg.NetSceneGetEmotionStoreRecList";

    /* renamed from: g, reason: collision with root package name */
    public final int f550907g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.l0 f550908h;

    public v() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.no3();
        lVar.f152198b = new r45.oo3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getstorereclist";
        lVar.f152200d = 6910;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f550904d = lVar.a();
        this.f550908h = new z12.u(this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f550905e = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f550904d;
        java.lang.Object obj = oVar != null ? oVar.f152243a.f152217a : null;
        if ((obj instanceof r45.no3 ? (r45.no3) obj : null) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f550906f, "doScene failed, GetStoreRecListRequest null");
        }
        return mo9409x10f9447a(sVar, oVar, this.f550908h);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 6910;
    }
}
