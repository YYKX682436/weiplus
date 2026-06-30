package l0;

/* loaded from: classes14.dex */
public final class v0 implements s1.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final long f396087d;

    public v0(long j17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f396087d = j17;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // s1.i0
    public int O(s1.u uVar, s1.t tVar, int i17) {
        return s1.h0.d(this, uVar, tVar, i17);
    }

    @Override // s1.i0
    public int Q(s1.u uVar, s1.t tVar, int i17) {
        return s1.h0.a(this, uVar, tVar, i17);
    }

    @Override // s1.i0
    public int S(s1.u uVar, s1.t tVar, int i17) {
        return s1.h0.c(this, uVar, tVar, i17);
    }

    /* renamed from: equals */
    public boolean m144762xb2c87fbf(java.lang.Object obj) {
        l0.v0 v0Var = obj instanceof l0.v0 ? (l0.v0) obj : null;
        if (v0Var == null) {
            return false;
        }
        int i17 = p2.k.f432919d;
        return this.f396087d == v0Var.f396087d;
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measure, "$this$measure");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurable, "measurable");
        s1.o1 m17 = measurable.m(j17);
        int i17 = m17.f483583d;
        long j18 = this.f396087d;
        int max = java.lang.Math.max(i17, measure.G(p2.k.b(j18)));
        int max2 = java.lang.Math.max(m17.f483584e, measure.G(p2.k.a(j18)));
        return s1.v0.b(measure, max, max2, null, new l0.u0(max, m17, max2), 4, null);
    }

    /* renamed from: hashCode */
    public int m144763x8cdac1b() {
        int i17 = p2.k.f432919d;
        return java.lang.Long.hashCode(this.f396087d);
    }

    @Override // z0.t
    public z0.t k(z0.t other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return z0.q.a(this, other);
    }

    @Override // z0.t
    public java.lang.Object m(java.lang.Object obj, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        return operation.mo149xb9724478(this, obj);
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        return operation.mo149xb9724478(obj, this);
    }

    @Override // s1.i0
    public int x(s1.u uVar, s1.t tVar, int i17) {
        return s1.h0.b(this, uVar, tVar, i17);
    }
}
