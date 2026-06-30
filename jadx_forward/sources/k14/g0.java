package k14;

/* loaded from: classes2.dex */
public class g0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f384866d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f384867e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f384868f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f384869g = null;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f384870h = null;

    public g0(boolean z17, java.lang.String str) {
        this.f384866d = z17;
        this.f384867e = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.a36();
        lVar.f152198b = new r45.b36();
        lVar.f152199c = "/cgi-bin/micromsg-bin/settranslationlanguageoplog";
        lVar.f152200d = 8222;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f384868f = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f384869g = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f384868f;
        r45.a36 a36Var = (r45.a36) oVar.f152243a.f152217a;
        a36Var.f451239d = !this.f384866d;
        a36Var.f451240e = this.f384867e;
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 8222;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f384869g.mo815x76e0bfae(i18, i19, str, this);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f384870h;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
