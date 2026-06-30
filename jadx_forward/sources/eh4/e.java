package eh4;

/* loaded from: classes4.dex */
public class e extends eh4.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f334478d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f334479e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f334480f;

    /* renamed from: g, reason: collision with root package name */
    public final int f334481g;

    public e(java.lang.String str, int i17, long j17, int i18) {
        this.f334481g = 0;
        this.f334481g = i18;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.kk6();
        lVar.f152198b = new r45.lk6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/talknoop";
        lVar.f152200d = 335;
        lVar.f152201e = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.a2.f34600x366c91de;
        lVar.f152202f = 1000000149;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f334479e = a17;
        r45.kk6 kk6Var = (r45.kk6) a17.f152243a.f152217a;
        kk6Var.f460326d = i17;
        kk6Var.f460327e = j17;
        kk6Var.f460328f = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        this.f334480f = str;
        kk6Var.f460329g = i18;
    }

    @Override // eh4.f
    public java.lang.String H() {
        return this.f334480f;
    }

    @Override // eh4.f
    public int I() {
        return this.f334481g;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f334478d = u0Var;
        return mo9409x10f9447a(sVar, this.f334479e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 335;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            this.f334478d.mo815x76e0bfae(i18, i19, str, this);
        } else {
            this.f334478d.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
