package r61;

/* loaded from: classes2.dex */
public class a1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f474347d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f474348e;

    /* renamed from: f, reason: collision with root package name */
    public final int f474349f;

    public a1(int i17, java.lang.String str) {
        this.f474349f = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.mo0();
        lVar.f152198b = new r45.no0();
        lVar.f152199c = "/cgi-bin/micromsg-bin/facebookauth";
        lVar.f152200d = 183;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f474348e = a17;
        r45.mo0 mo0Var = (r45.mo0) a17.f152243a.f152217a;
        mo0Var.f462242e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? "" : str;
        mo0Var.f462241d = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f474347d = u0Var;
        return mo9409x10f9447a(sVar, this.f474348e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 183;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        m48024x6b3684de(i17);
        if (i18 == 0 && i19 == 0) {
            r45.no0 no0Var = (r45.no0) this.f474348e.f152244b.f152233a;
            int i27 = no0Var.mo11484xe92ab0a8().f458492d;
            if (i27 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneFaceBookAuth", "baseresponse.ret = " + i27);
                this.f474347d.mo815x76e0bfae(4, i27, str, this);
                return;
            }
            int i28 = this.f474349f;
            if (i28 == 0 || i28 == 1) {
                gm0.j1.u().c().w(65825, "" + no0Var.f463089d);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).cj("" + no0Var.f463089d);
                gm0.j1.u().c().w(65826, "" + no0Var.f463090e);
                gm0.j1.u().c().i(true);
            }
        }
        this.f474347d.mo815x76e0bfae(i18, i19, str, this);
    }
}
