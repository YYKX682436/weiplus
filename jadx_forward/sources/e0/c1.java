package e0;

/* loaded from: classes14.dex */
public final class c1 implements s1.s1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f327052d;

    public c1(e0.f1 f1Var) {
        this.f327052d = f1Var;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // s1.s1
    public void j(s1.r1 remeasurement) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remeasurement, "remeasurement");
        this.f327052d.f327117j = remeasurement;
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
