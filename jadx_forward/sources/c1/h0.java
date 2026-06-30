package c1;

/* loaded from: classes14.dex */
public final class h0 implements t1.b, t1.d {

    /* renamed from: d, reason: collision with root package name */
    public c1.h0 f119275d;

    /* renamed from: e, reason: collision with root package name */
    public final o0.i f119276e;

    public h0(c1.d0 focusRequester) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(focusRequester, "focusRequester");
        this.f119276e = new o0.i(new c1.p[16], 0);
        focusRequester.f119267a.b(this);
    }

    @Override // t1.b
    public void B(t1.e scope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        c1.h0 h0Var = (c1.h0) scope.a(c1.g0.f119273a);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h0Var, this.f119275d)) {
            return;
        }
        c1.h0 h0Var2 = this.f119275d;
        o0.i iVar = this.f119276e;
        if (h0Var2 != null) {
            h0Var2.d(iVar);
        }
        if (h0Var != null) {
            h0Var.b(iVar);
        }
        this.f119275d = h0Var;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    public final void a(c1.p focusModifier) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(focusModifier, "focusModifier");
        this.f119276e.b(focusModifier);
        c1.h0 h0Var = this.f119275d;
        if (h0Var != null) {
            h0Var.a(focusModifier);
        }
    }

    public final void b(o0.i newModifiers) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newModifiers, "newModifiers");
        o0.i iVar = this.f119276e;
        iVar.d(iVar.f423385f, newModifiers);
        c1.h0 h0Var = this.f119275d;
        if (h0Var != null) {
            h0Var.b(newModifiers);
        }
    }

    public final void c(c1.p focusModifier) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(focusModifier, "focusModifier");
        this.f119276e.k(focusModifier);
        c1.h0 h0Var = this.f119275d;
        if (h0Var != null) {
            h0Var.c(focusModifier);
        }
    }

    public final void d(o0.i removedModifiers) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(removedModifiers, "removedModifiers");
        this.f119276e.l(removedModifiers);
        c1.h0 h0Var = this.f119275d;
        if (h0Var != null) {
            h0Var.d(removedModifiers);
        }
    }

    @Override // t1.d
    /* renamed from: getKey */
    public t1.f mo156xb5884f29() {
        return c1.g0.f119273a;
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
