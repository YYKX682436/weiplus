package n1;

/* loaded from: classes14.dex */
public final class d implements t1.b, t1.d, s1.i1 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f415563d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f415564e;

    /* renamed from: f, reason: collision with root package name */
    public c1.p f415565f;

    /* renamed from: g, reason: collision with root package name */
    public n1.d f415566g;

    /* renamed from: h, reason: collision with root package name */
    public u1.w f415567h;

    public d(yz5.l lVar, yz5.l lVar2) {
        this.f415563d = lVar;
        this.f415564e = lVar2;
    }

    @Override // t1.b
    public void B(t1.e scope) {
        o0.i iVar;
        o0.i iVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        c1.p pVar = this.f415565f;
        if (pVar != null && (iVar2 = pVar.f119311t) != null) {
            iVar2.k(this);
        }
        c1.p pVar2 = (c1.p) scope.a(c1.w.f119315a);
        this.f415565f = pVar2;
        if (pVar2 != null && (iVar = pVar2.f119311t) != null) {
            iVar.b(this);
        }
        this.f415566g = (n1.d) scope.a(n1.f.f415569a);
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    public final boolean a(android.view.KeyEvent keyEvent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyEvent, "keyEvent");
        yz5.l lVar = this.f415563d;
        java.lang.Boolean bool = lVar != null ? (java.lang.Boolean) lVar.mo146xb9724478(new n1.b(keyEvent)) : null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
            return bool.booleanValue();
        }
        n1.d dVar = this.f415566g;
        if (dVar != null) {
            return dVar.a(keyEvent);
        }
        return false;
    }

    public final boolean b(android.view.KeyEvent keyEvent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyEvent, "keyEvent");
        n1.d dVar = this.f415566g;
        java.lang.Boolean valueOf = dVar != null ? java.lang.Boolean.valueOf(dVar.b(keyEvent)) : null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, java.lang.Boolean.TRUE)) {
            return valueOf.booleanValue();
        }
        yz5.l lVar = this.f415564e;
        if (lVar != null) {
            return ((java.lang.Boolean) lVar.mo146xb9724478(new n1.b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // t1.d
    /* renamed from: getKey */
    public t1.f mo156xb5884f29() {
        return n1.f.f415569a;
    }

    @Override // t1.d
    /* renamed from: getValue */
    public java.lang.Object mo157x754a37bb() {
        return this;
    }

    @Override // s1.i1
    public void i(s1.z coordinates) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coordinates, "coordinates");
        this.f415567h = ((u1.c1) coordinates).f505087h;
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
