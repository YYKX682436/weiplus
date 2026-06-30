package eh4;

/* loaded from: classes4.dex */
public class d extends eh4.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f334472d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f334473e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f334474f;

    /* renamed from: g, reason: collision with root package name */
    public final int f334475g;

    /* renamed from: h, reason: collision with root package name */
    public int f334476h;

    /* renamed from: i, reason: collision with root package name */
    public final int f334477i;

    public d(int i17, long j17, int i18, java.lang.String str, int i19) {
        this.f334477i = 0;
        this.f334477i = i19;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ik6();
        lVar.f152198b = new r45.jk6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/talkmicaction";
        lVar.f152200d = 334;
        lVar.f152201e = 146;
        lVar.f152202f = 1000000146;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f334473e = a17;
        r45.ik6 ik6Var = (r45.ik6) a17.f152243a.f152217a;
        ik6Var.f458649d = i17;
        ik6Var.f458650e = j17;
        ik6Var.f458651f = i18;
        ik6Var.f458652g = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        this.f334475g = i18;
        this.f334474f = str;
        ik6Var.f458653h = i19;
    }

    @Override // eh4.f
    public java.lang.String H() {
        return this.f334474f;
    }

    @Override // eh4.f
    public int I() {
        return this.f334477i;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f334472d = u0Var;
        return mo9409x10f9447a(sVar, this.f334473e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 334;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 != 0 || i19 != 0) {
            this.f334472d.mo815x76e0bfae(i18, i19, str, this);
        } else {
            this.f334476h = ((r45.jk6) this.f334473e.f152244b.f152233a).f459437d;
            this.f334472d.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
