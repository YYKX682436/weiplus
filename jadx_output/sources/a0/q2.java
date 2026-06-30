package a0;

/* loaded from: classes14.dex */
public final class q2 implements t1.b {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f274d;

    public q2(yz5.l onPinnableParentAvailable) {
        kotlin.jvm.internal.o.g(onPinnableParentAvailable, "onPinnableParentAvailable");
        this.f274d = onPinnableParentAvailable;
    }

    @Override // t1.b
    public void B(t1.e scope) {
        kotlin.jvm.internal.o.g(scope, "scope");
        this.f274d.invoke(scope.a(androidx.compose.foundation.lazy.layout.f0.f10400a));
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof a0.q2) && kotlin.jvm.internal.o.b(((a0.q2) obj).f274d, this.f274d);
    }

    public int hashCode() {
        return this.f274d.hashCode();
    }

    @Override // z0.t
    public z0.t k(z0.t other) {
        kotlin.jvm.internal.o.g(other, "other");
        return z0.q.a(this, other);
    }

    @Override // z0.t
    public java.lang.Object m(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(this, obj);
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(obj, this);
    }
}
