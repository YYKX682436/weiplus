package ts4;

/* loaded from: classes4.dex */
public class b extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f503248d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f503249e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f503250f;

    /* renamed from: g, reason: collision with root package name */
    public int f503251g = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.h65 h65Var = new r45.h65();
        gm0.j1.i();
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HAD_SHOW_WALLET_MULTI_WALLET_GUIDE_BOOLEAN, java.lang.Boolean.FALSE);
        h65Var.f457414d = m17 != null ? ((java.lang.Boolean) m17).booleanValue() : 0;
        lVar.f152197a = h65Var;
        lVar.f152198b = new r45.i65();
        lVar.f152199c = "/cgi-bin/mmpay-bin/payibggetjumpurl";
        lVar.f152200d = 1564;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f503249e = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f503248d = u0Var;
        return mo9409x10f9447a(sVar, this.f503249e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1564;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneIbgPayGetJumpUrl", "hy: get ibg jump url raw net errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.i65 i65Var = (r45.i65) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneIbgPayGetJumpUrl", "hy: get ibg pay jump url. biz_errcode: %d, biz_errmsg: %s", java.lang.Integer.valueOf(i65Var.f458296d), i65Var.f458297e);
            str = i65Var.f458297e;
            i19 = i65Var.f458296d;
            this.f503250f = i65Var.f458298f;
            this.f503251g = i65Var.f458299g;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneIbgPayGetJumpUrl", "hy: get ibg pay jump url failed");
            this.f503250f = null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkk);
        }
        this.f503248d.mo815x76e0bfae(i18, i19, str, this);
    }
}
