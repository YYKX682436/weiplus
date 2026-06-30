package u26;

/* loaded from: classes14.dex */
public final class e0 extends u26.w0 implements u26.u0 {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Throwable f505681g;

    public e0(java.lang.Throwable th6) {
        this.f505681g = th6;
    }

    public final java.lang.Throwable A() {
        java.lang.Throwable th6 = this.f505681g;
        return th6 == null ? new u26.f0("Channel was closed") : th6;
    }

    @Override // u26.u0
    public java.lang.Object d() {
        return this;
    }

    @Override // u26.u0
    public void g(java.lang.Object obj) {
    }

    @Override // u26.u0
    public p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 h(java.lang.Object obj, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.q qVar) {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 l0Var = p3325xe03a0797.p3326xc267989b.s.f392113a;
        if (qVar != null) {
            qVar.d();
        }
        return l0Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t
    /* renamed from: toString */
    public java.lang.String mo144017x9616526c() {
        return "Closed@" + p3325xe03a0797.p3326xc267989b.c1.a(this) + '[' + this.f505681g + ']';
    }

    @Override // u26.w0
    public void u() {
    }

    @Override // u26.w0
    public java.lang.Object w() {
        return this;
    }

    @Override // u26.w0
    public void x(u26.e0 e0Var) {
    }

    @Override // u26.w0
    public p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 y(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.q qVar) {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 l0Var = p3325xe03a0797.p3326xc267989b.s.f392113a;
        if (qVar != null) {
            qVar.d();
        }
        return l0Var;
    }
}
