package a0;

/* loaded from: classes14.dex */
public final class c1 implements t1.b, s1.f1 {

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f95d;

    /* renamed from: e, reason: collision with root package name */
    public s1.z f96e;

    @Override // t1.b
    public void B(t1.e scope) {
        yz5.l lVar;
        kotlin.jvm.internal.o.g(scope, "scope");
        yz5.l lVar2 = (yz5.l) scope.a(a0.b1.f80a);
        if (lVar2 == null && (lVar = this.f95d) != null) {
            lVar.invoke(null);
        }
        this.f95d = lVar2;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // z0.t
    public z0.t k(z0.t other) {
        kotlin.jvm.internal.o.g(other, "other");
        return z0.q.a(this, other);
    }

    @Override // s1.f1
    public void l(s1.z coordinates) {
        yz5.l lVar;
        kotlin.jvm.internal.o.g(coordinates, "coordinates");
        this.f96e = coordinates;
        if (!((u1.c1) coordinates).p0()) {
            yz5.l lVar2 = this.f95d;
            if (lVar2 != null) {
                lVar2.invoke(null);
                return;
            }
            return;
        }
        s1.z zVar = this.f96e;
        if (zVar == null || !((u1.c1) zVar).p0() || (lVar = this.f95d) == null) {
            return;
        }
        lVar.invoke(this.f96e);
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
