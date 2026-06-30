package a0;

/* loaded from: classes14.dex */
public final class d1 implements t1.b, t1.d, yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f81640d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f81641e;

    public d1(yz5.l handler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        this.f81640d = handler;
    }

    @Override // t1.b
    public void B(t1.e scope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        yz5.l lVar = (yz5.l) scope.a(a0.b1.f81613a);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lVar, this.f81641e)) {
            return;
        }
        this.f81641e = lVar;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // t1.d
    /* renamed from: getKey */
    public t1.f mo156xb5884f29() {
        return a0.b1.f81613a;
    }

    @Override // t1.d
    /* renamed from: getValue */
    public java.lang.Object mo157x754a37bb() {
        return this;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        s1.z zVar = (s1.z) obj;
        this.f81640d.mo146xb9724478(zVar);
        yz5.l lVar = this.f81641e;
        if (lVar != null) {
            lVar.mo146xb9724478(zVar);
        }
        return jz5.f0.f384359a;
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
