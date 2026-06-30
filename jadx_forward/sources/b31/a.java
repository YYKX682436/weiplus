package b31;

/* loaded from: classes4.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f99122d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f99123e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.zq5 f99124f;

    public a(int i17, java.util.LinkedList linkedList, r45.du5 du5Var, r45.du5 du5Var2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.zq5();
        lVar.f152198b = new r45.ar5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/reportvoiceresult";
        lVar.f152200d = 228;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f99123e = a17;
        r45.zq5 zq5Var = (r45.zq5) a17.f152243a.f152217a;
        this.f99124f = zq5Var;
        zq5Var.f473839d = i17;
        zq5Var.f473840e = linkedList;
        zq5Var.f473841f = du5Var;
        zq5Var.f473842g = du5Var2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f99122d = u0Var;
        return mo9409x10f9447a(sVar, this.f99123e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 228;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f99122d.mo815x76e0bfae(i18, i19, str, this);
    }
}
