package u1;

/* loaded from: classes14.dex */
public final class b0 implements t1.d {
    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // t1.d
    /* renamed from: getKey */
    public t1.f mo156xb5884f29() {
        return u1.w.f505210l1;
    }

    @Override // t1.d
    /* renamed from: getValue */
    public java.lang.Object mo157x754a37bb() {
        throw new java.lang.IllegalStateException("Sentinel ModifierLocal shouldn't be read".toString());
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
}
