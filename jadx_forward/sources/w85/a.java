package w85;

/* loaded from: classes2.dex */
public final class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f525564d = "MicroMsg.NetSceneGetLensInfo";

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f525565e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f525566f;

    public a() {
        r45.uh3 uh3Var = new r45.uh3();
        uh3Var.f468916d = "com.tencent.xin.lens.lens_test1";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = uh3Var;
        lVar.f152198b = new r45.vh3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getlensinfo";
        lVar.f152200d = 3903;
        this.f525565e = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f525566f = u0Var;
        return mo9409x10f9447a(sVar, this.f525565e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 3903;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f525564d, "onGYNetEnd: " + i18 + ", " + i19);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f525566f;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
