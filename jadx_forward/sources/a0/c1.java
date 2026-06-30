package a0;

/* loaded from: classes14.dex */
public final class c1 implements t1.b, s1.f1 {

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f81628d;

    /* renamed from: e, reason: collision with root package name */
    public s1.z f81629e;

    @Override // t1.b
    public void B(t1.e scope) {
        yz5.l lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        yz5.l lVar2 = (yz5.l) scope.a(a0.b1.f81613a);
        if (lVar2 == null && (lVar = this.f81628d) != null) {
            lVar.mo146xb9724478(null);
        }
        this.f81628d = lVar2;
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

    @Override // s1.f1
    public void l(s1.z coordinates) {
        yz5.l lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coordinates, "coordinates");
        this.f81629e = coordinates;
        if (!((u1.c1) coordinates).p0()) {
            yz5.l lVar2 = this.f81628d;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(null);
                return;
            }
            return;
        }
        s1.z zVar = this.f81629e;
        if (zVar == null || !((u1.c1) zVar).p0() || (lVar = this.f81628d) == null) {
            return;
        }
        lVar.mo146xb9724478(this.f81629e);
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
