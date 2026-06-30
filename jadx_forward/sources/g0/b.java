package g0;

/* loaded from: classes14.dex */
public abstract class b implements t1.b, s1.i1 {

    /* renamed from: d, reason: collision with root package name */
    public final g0.e f348870d;

    /* renamed from: e, reason: collision with root package name */
    public g0.e f348871e;

    /* renamed from: f, reason: collision with root package name */
    public s1.z f348872f;

    public b(g0.e defaultParent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultParent, "defaultParent");
        this.f348870d = defaultParent;
    }

    @Override // t1.b
    public void B(t1.e scope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        this.f348871e = (g0.e) scope.a(g0.d.f348874a);
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // s1.i1
    public void i(s1.z coordinates) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coordinates, "coordinates");
        this.f348872f = coordinates;
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
