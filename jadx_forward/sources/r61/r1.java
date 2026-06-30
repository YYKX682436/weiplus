package r61;

/* loaded from: classes4.dex */
public class r1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f474481d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f474482e;

    public r1(java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.zz5();
        lVar.f152198b = new r45.a06();
        lVar.f152199c = "/cgi-bin/micromsg-bin/sendverifyemail";
        lVar.f152200d = 108;
        lVar.f152201e = 43;
        lVar.f152202f = 1000000043;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f474482e = a17;
        r45.zz5 zz5Var = (r45.zz5) a17.f152243a.f152217a;
        r45.du5 du5Var = new r45.du5();
        du5Var.f454289d = str;
        du5Var.f454290e = true;
        zz5Var.f474026d = du5Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f474481d = u0Var;
        return mo9409x10f9447a(sVar, this.f474482e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 108;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        m48024x6b3684de(i17);
        this.f474481d.mo815x76e0bfae(i18, i19, str, this);
    }
}
