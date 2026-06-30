package k14;

/* loaded from: classes2.dex */
public class d0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f384850d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f384851e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f384852f;

    /* renamed from: g, reason: collision with root package name */
    public final int f384853g;

    public d0(java.lang.String str, java.lang.String str2, int i17, int i18) {
        this.f384851e = str;
        this.f384852f = str2;
        this.f384853g = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f384850d = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.cp4 cp4Var = new r45.cp4();
        cp4Var.f453295d = this.f384851e;
        cp4Var.f453296e = this.f384852f;
        cp4Var.f453297f = this.f384853g;
        lVar.f152197a = cp4Var;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/moduserauth";
        lVar.f152198b = new r45.dp4();
        lVar.f152200d = 1144;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        return mo9409x10f9447a(sVar, lVar.a(), this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1144;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.dp4 dp4Var = (r45.dp4) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f384850d;
        r45.qv6 qv6Var = dp4Var.f454180d;
        u0Var.mo815x76e0bfae(i18, qv6Var.f465837d, qv6Var.f465838e, this);
    }
}
