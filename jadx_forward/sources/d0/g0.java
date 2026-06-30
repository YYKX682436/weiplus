package d0;

/* loaded from: classes14.dex */
public final class g0 implements d0.f0, d0.z {

    /* renamed from: a, reason: collision with root package name */
    public final p2.f f306652a;

    /* renamed from: b, reason: collision with root package name */
    public final long f306653b;

    public g0(p2.f fVar, long j17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f306652a = fVar;
        this.f306653b = j17;
    }

    @Override // d0.z
    public z0.t a(z0.t tVar, z0.d alignment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alignment, "alignment");
        boolean z17 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.f3.f92095a;
        return tVar.k(new d0.q(alignment, false, p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e3.f92086d));
    }

    /* renamed from: equals */
    public boolean m123207xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0.g0)) {
            return false;
        }
        d0.g0 g0Var = (d0.g0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f306652a, g0Var.f306652a) && p2.c.b(this.f306653b, g0Var.f306653b);
    }

    /* renamed from: hashCode */
    public int m123208x8cdac1b() {
        return (this.f306652a.hashCode() * 31) + java.lang.Long.hashCode(this.f306653b);
    }

    /* renamed from: toString */
    public java.lang.String m123209x9616526c() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f306652a + ", constraints=" + ((java.lang.Object) p2.c.k(this.f306653b)) + ')';
    }
}
