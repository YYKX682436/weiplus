package i11;

/* loaded from: classes2.dex */
public class r extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f368677d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f368678e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f368679f = "";

    public r(double d17, double d18, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.h83();
        lVar.f152198b = new r45.i83();
        lVar.f152199c = "/cgi-bin/micromsg-bin/geocoderlocation";
        lVar.f152200d = com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7528x16eb0541;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f368678e = a17;
        r45.h83 h83Var = (r45.h83) a17.f152243a.f152217a;
        h83Var.f457471e = d17;
        h83Var.f457470d = d18;
        h83Var.f457474h = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f368677d = u0Var;
        return mo9409x10f9447a(sVar, this.f368678e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7528x16eb0541;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f368677d;
            if (u0Var != null) {
                u0Var.mo815x76e0bfae(i18, i19, str, this);
                return;
            }
            return;
        }
        this.f368679f = ((r45.i83) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a).f458345d;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var2 = this.f368677d;
        if (u0Var2 != null) {
            u0Var2.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
