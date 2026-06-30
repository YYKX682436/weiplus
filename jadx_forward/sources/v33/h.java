package v33;

/* loaded from: classes4.dex */
public class h extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f514647d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f514648e;

    /* renamed from: f, reason: collision with root package name */
    public final int f514649f;

    public h(java.util.List list, java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15773xdaadaafa();
        lVar.f152198b = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15774x7e2f6936();
        lVar.f152199c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getmychatroom";
        lVar.f152200d = 4989;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152206j = true;
        lVar.f152207k = 25000;
        this.f514649f = i18;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f514648e = a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15773xdaadaafa c15773xdaadaafa = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15773xdaadaafa) a17.f152243a.f152217a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list);
        c15773xdaadaafa.f36722x93c1e3c8 = str;
        c15773xdaadaafa.f36724x14f51cd8 = str2;
        c15773xdaadaafa.f36723x7c03a70d = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.CgiGetMyChatRoom", "request params, version:%s, scene:%d", str2, java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f514647d = u0Var;
        return mo9409x10f9447a(sVar, this.f514648e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4989;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f514647d.mo815x76e0bfae(i18, i19, str, this);
    }
}
