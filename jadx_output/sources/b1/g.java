package b1;

/* loaded from: classes14.dex */
public final class g implements b1.f {

    /* renamed from: d, reason: collision with root package name */
    public final b1.c f16993d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f16994e;

    public g(b1.c cacheDrawScope, yz5.l onBuildDrawCache) {
        kotlin.jvm.internal.o.g(cacheDrawScope, "cacheDrawScope");
        kotlin.jvm.internal.o.g(onBuildDrawCache, "onBuildDrawCache");
        this.f16993d = cacheDrawScope;
        this.f16994e = onBuildDrawCache;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // b1.h
    public void P(g1.f fVar) {
        kotlin.jvm.internal.o.g(fVar, "<this>");
        b1.k kVar = this.f16993d.f16991e;
        kotlin.jvm.internal.o.d(kVar);
        kVar.f16996a.invoke(fVar);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1.g)) {
            return false;
        }
        b1.g gVar = (b1.g) obj;
        return kotlin.jvm.internal.o.b(this.f16993d, gVar.f16993d) && kotlin.jvm.internal.o.b(this.f16994e, gVar.f16994e);
    }

    public int hashCode() {
        return (this.f16993d.hashCode() * 31) + this.f16994e.hashCode();
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

    public java.lang.String toString() {
        return "DrawContentCacheModifier(cacheDrawScope=" + this.f16993d + ", onBuildDrawCache=" + this.f16994e + ')';
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(obj, this);
    }
}
