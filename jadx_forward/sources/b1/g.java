package b1;

/* loaded from: classes14.dex */
public final class g implements b1.f {

    /* renamed from: d, reason: collision with root package name */
    public final b1.c f98526d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f98527e;

    public g(b1.c cacheDrawScope, yz5.l onBuildDrawCache) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheDrawScope, "cacheDrawScope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onBuildDrawCache, "onBuildDrawCache");
        this.f98526d = cacheDrawScope;
        this.f98527e = onBuildDrawCache;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // b1.h
    public void P(g1.f fVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
        b1.k kVar = this.f98526d.f98524e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kVar);
        kVar.f98529a.mo146xb9724478(fVar);
    }

    /* renamed from: equals */
    public boolean m9558xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1.g)) {
            return false;
        }
        b1.g gVar = (b1.g) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f98526d, gVar.f98526d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f98527e, gVar.f98527e);
    }

    /* renamed from: hashCode */
    public int m9559x8cdac1b() {
        return (this.f98526d.hashCode() * 31) + this.f98527e.hashCode();
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

    /* renamed from: toString */
    public java.lang.String m9560x9616526c() {
        return "DrawContentCacheModifier(cacheDrawScope=" + this.f98526d + ", onBuildDrawCache=" + this.f98527e + ')';
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        return operation.mo149xb9724478(obj, this);
    }
}
