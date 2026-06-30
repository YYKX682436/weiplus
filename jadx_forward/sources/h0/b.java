package h0;

/* loaded from: classes14.dex */
public final class b implements t1.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f359308d;

    public b(n0.v2 v2Var) {
        this.f359308d = v2Var;
    }

    @Override // t1.b
    public void B(t1.e scope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        this.f359308d.mo148714x53d8522f(scope.a(b0.d3.f97796b));
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
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
