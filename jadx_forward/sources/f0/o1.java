package f0;

/* loaded from: classes14.dex */
public final class o1 implements s1.s1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0.r1 f339712d;

    public o1(f0.r1 r1Var) {
        this.f339712d = r1Var;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // s1.s1
    public void j(s1.r1 remeasurement) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remeasurement, "remeasurement");
        this.f339712d.f339752m = remeasurement;
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
