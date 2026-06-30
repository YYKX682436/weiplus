package z0;

/* loaded from: classes14.dex */
public final class i implements z0.t {

    /* renamed from: d, reason: collision with root package name */
    public final z0.t f550442d;

    /* renamed from: e, reason: collision with root package name */
    public final z0.t f550443e;

    public i(z0.t outer, z0.t inner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outer, "outer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inner, "inner");
        this.f550442d = outer;
        this.f550443e = inner;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return this.f550442d.E(predicate) && this.f550443e.E(predicate);
    }

    /* renamed from: equals */
    public boolean m178214xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof z0.i) {
            z0.i iVar = (z0.i) obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f550442d, iVar.f550442d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f550443e, iVar.f550443e)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m178215x8cdac1b() {
        return this.f550442d.hashCode() + (this.f550443e.hashCode() * 31);
    }

    @Override // z0.t
    public z0.t k(z0.t tVar) {
        return z0.q.a(this, tVar);
    }

    @Override // z0.t
    public java.lang.Object m(java.lang.Object obj, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        return this.f550442d.m(this.f550443e.m(obj, operation), operation);
    }

    /* renamed from: toString */
    public java.lang.String m178216x9616526c() {
        return "[" + ((java.lang.String) u("", z0.h.f550441d)) + ']';
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        return this.f550443e.u(this.f550442d.u(obj, operation), operation);
    }
}
