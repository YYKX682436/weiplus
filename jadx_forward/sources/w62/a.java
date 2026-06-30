package w62;

/* loaded from: classes2.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f524807d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f524808e;

    /* renamed from: f, reason: collision with root package name */
    public int f524809f = -1;

    public a(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.a00();
        lVar.f152198b = new r45.b00();
        lVar.f152199c = "/cgi-bin/micromsg-bin/checkcamerascan";
        lVar.f152200d = 782;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f524807d = a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCheckUrlAvailableInWx", "hy: checking url: %s", str);
        r45.a00 a00Var = (r45.a00) a17.f152243a.f152217a;
        a00Var.f451111d = str;
        a00Var.f451112e = i17;
        a00Var.f451113f = i18;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f524808e = u0Var;
        return mo9409x10f9447a(sVar, this.f524807d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 782;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.b00 b00Var = (r45.b00) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i18 == 0 && i19 == 0) {
            this.f524809f = b00Var.f451921d;
        }
        this.f524808e.mo815x76e0bfae(i18, i19, str, this);
    }
}
