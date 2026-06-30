package r01;

/* loaded from: classes2.dex */
public class f3 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f449600d;

    /* renamed from: e, reason: collision with root package name */
    public final r01.e3 f449601e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f449602f;

    public f3(java.lang.String str, int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, r01.e3 e3Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBiztransfer", "NetSceneBiztransfer username (%s) cmdid (%s)", str, java.lang.Integer.valueOf(i17));
        this.f449601e = e3Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 1915;
        lVar.f152199c = "/cgi-bin/mmocbiz-bin-new/biztransfer";
        lVar.f152197a = new r45.wm();
        lVar.f152198b = new r45.xm();
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f449602f = a17;
        r45.wm wmVar = (r45.wm) a17.f152243a.f152217a;
        wmVar.f470798d = str;
        wmVar.f470799e = i17;
        if (fVar != null) {
            try {
                wmVar.f470800f = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(fVar.mo14344x5f01b1f6());
            } catch (java.io.IOException e17) {
                throw new java.lang.RuntimeException("bad cgi request", e17);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f449600d = u0Var;
        return mo9409x10f9447a(sVar, this.f449602f, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1915;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBiztransfer", "NetSceneBiztransfer onGYNetEnd netId %d, errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r01.e3 e3Var = this.f449601e;
        if (e3Var != null) {
            e3Var.mo815x76e0bfae(i18, i19, str, this);
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f449600d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
