package ya3;

/* loaded from: classes4.dex */
public class b extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f542124d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f542125e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f542126f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f542127g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f542128h = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f542129i = false;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f542130m;

    public b(java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.v24();
        lVar.f152198b = new r45.w24();
        lVar.f152199c = "/cgi-bin/micromsg-bin/jointrackroom";
        lVar.f152200d = 490;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f542125e = a17;
        ((r45.v24) a17.f152243a.f152217a).f469358d = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f542124d = u0Var;
        return mo9409x10f9447a(sVar, this.f542125e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 490;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        r45.w24 w24Var = fVar != null ? (r45.w24) fVar : null;
        if ((i19 == 0 || i19 >= 1000) && w24Var != null) {
            java.lang.String str2 = w24Var.f470334d;
            if (str2 == null) {
                str2 = "";
            }
            this.f542126f = str2;
            java.lang.String str3 = w24Var.f470336f;
            this.f542127g = str3 != null ? str3 : "";
            this.f542128h = w24Var.f470337g;
            this.f542129i = w24Var.f470339i > 0;
        }
        if (w24Var != null) {
            this.f542130m = w24Var.f470335e;
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f542124d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
