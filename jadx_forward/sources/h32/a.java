package h32;

/* loaded from: classes4.dex */
public abstract class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f359981d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f359982e;

    public com.p314xaae8f345.mm.p2495xc50a8b8b.f H() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f359982e;
        if (oVar == null || (fVar = oVar.f152244b.f152233a) == null) {
            return null;
        }
        return fVar;
    }

    public abstract com.p314xaae8f345.mm.p2495xc50a8b8b.f I();

    public abstract com.p314xaae8f345.mm.p2495xc50a8b8b.f J();

    public abstract void K(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar);

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public final int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f359981d = u0Var;
        if (this.f359982e == null) {
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152200d = mo808xfb85f7b0();
            lVar.f152199c = mo132826xb5887636();
            lVar.f152197a = I();
            lVar.f152198b = J();
            lVar.f152201e = 0;
            lVar.f152202f = 0;
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            this.f359982e = a17;
            K(a17.f152243a.f152217a);
        }
        return mo9409x10f9447a(sVar, this.f359982e, this);
    }

    /* renamed from: getUri */
    public abstract java.lang.String mo132826xb5887636();

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseNetScene", "onGYNetEnd netId %d, errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f359981d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
