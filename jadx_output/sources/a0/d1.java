package a0;

/* loaded from: classes14.dex */
public final class d1 implements t1.b, t1.d, yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f107d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f108e;

    public d1(yz5.l handler) {
        kotlin.jvm.internal.o.g(handler, "handler");
        this.f107d = handler;
    }

    @Override // t1.b
    public void B(t1.e scope) {
        kotlin.jvm.internal.o.g(scope, "scope");
        yz5.l lVar = (yz5.l) scope.a(a0.b1.f80a);
        if (kotlin.jvm.internal.o.b(lVar, this.f108e)) {
            return;
        }
        this.f108e = lVar;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // t1.d
    public t1.f getKey() {
        return a0.b1.f80a;
    }

    @Override // t1.d
    public java.lang.Object getValue() {
        return this;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        s1.z zVar = (s1.z) obj;
        this.f107d.invoke(zVar);
        yz5.l lVar = this.f108e;
        if (lVar != null) {
            lVar.invoke(zVar);
        }
        return jz5.f0.f302826a;
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
