package a0;

/* loaded from: classes14.dex */
public final class q2 implements t1.b {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f81807d;

    public q2(yz5.l onPinnableParentAvailable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onPinnableParentAvailable, "onPinnableParentAvailable");
        this.f81807d = onPinnableParentAvailable;
    }

    @Override // t1.b
    public void B(t1.e scope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        this.f81807d.mo146xb9724478(scope.a(p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.f0.f91933a));
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    /* renamed from: equals */
    public boolean m185xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof a0.q2) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((a0.q2) obj).f81807d, this.f81807d);
    }

    /* renamed from: hashCode */
    public int m186x8cdac1b() {
        return this.f81807d.hashCode();
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
