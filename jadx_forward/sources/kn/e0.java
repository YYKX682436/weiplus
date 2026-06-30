package kn;

/* loaded from: classes.dex */
public class e0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f390920d;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f390922f;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f390921e = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f390923g = null;

    /* renamed from: h, reason: collision with root package name */
    public int f390924h = 0;

    public e0(java.lang.String str) {
        this.f390922f = null;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.mt6();
        lVar.f152198b = new r45.nt6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/upgradechatroom";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.g.f34926x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f390920d = a17;
        this.f390922f = str;
        ((r45.mt6) a17.f152243a.f152217a).f462357d = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f390921e = u0Var;
        return mo9409x10f9447a(sVar, this.f390920d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.g.f34926x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.nt6 nt6Var = (r45.nt6) this.f390920d.f152244b.f152233a;
        java.lang.String str2 = nt6Var.f463198d;
        this.f390923g = str2;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f390922f);
            if (z07 == null) {
                z07 = new com.p314xaae8f345.mm.p2621x8fb0427b.a3();
            }
            z07.Y0(c01.z1.r(), this.f390923g);
            c01.v1.M(z07);
        }
        this.f390924h = nt6Var.f463204m;
        this.f390921e.mo815x76e0bfae(i18, i19, str, this);
    }
}
