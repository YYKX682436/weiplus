package m1;

/* loaded from: classes14.dex */
public class b implements t1.b, t1.d {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f404146d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f404147e;

    /* renamed from: f, reason: collision with root package name */
    public final t1.f f404148f;

    /* renamed from: g, reason: collision with root package name */
    public m1.b f404149g;

    public b(yz5.l lVar, yz5.l lVar2, t1.f key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        this.f404146d = lVar;
        this.f404147e = lVar2;
        this.f404148f = key;
    }

    @Override // t1.b
    public void B(t1.e scope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        this.f404149g = (m1.b) scope.a(this.f404148f);
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    public final boolean a(m1.a aVar) {
        yz5.l lVar = this.f404146d;
        if (lVar != null && ((java.lang.Boolean) lVar.mo146xb9724478(aVar)).booleanValue()) {
            return true;
        }
        m1.b bVar = this.f404149g;
        if (bVar != null) {
            return bVar.a(aVar);
        }
        return false;
    }

    public final boolean b(m1.a aVar) {
        m1.b bVar = this.f404149g;
        if (bVar != null && bVar.b(aVar)) {
            return true;
        }
        yz5.l lVar = this.f404147e;
        if (lVar != null) {
            return ((java.lang.Boolean) lVar.mo146xb9724478(aVar)).booleanValue();
        }
        return false;
    }

    @Override // t1.d
    /* renamed from: getKey */
    public t1.f mo156xb5884f29() {
        return this.f404148f;
    }

    @Override // t1.d
    /* renamed from: getValue */
    public java.lang.Object mo157x754a37bb() {
        return this;
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
