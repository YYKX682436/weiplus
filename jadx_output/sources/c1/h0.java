package c1;

/* loaded from: classes14.dex */
public final class h0 implements t1.b, t1.d {

    /* renamed from: d, reason: collision with root package name */
    public c1.h0 f37742d;

    /* renamed from: e, reason: collision with root package name */
    public final o0.i f37743e;

    public h0(c1.d0 focusRequester) {
        kotlin.jvm.internal.o.g(focusRequester, "focusRequester");
        this.f37743e = new o0.i(new c1.p[16], 0);
        focusRequester.f37734a.b(this);
    }

    @Override // t1.b
    public void B(t1.e scope) {
        kotlin.jvm.internal.o.g(scope, "scope");
        c1.h0 h0Var = (c1.h0) scope.a(c1.g0.f37740a);
        if (kotlin.jvm.internal.o.b(h0Var, this.f37742d)) {
            return;
        }
        c1.h0 h0Var2 = this.f37742d;
        o0.i iVar = this.f37743e;
        if (h0Var2 != null) {
            h0Var2.d(iVar);
        }
        if (h0Var != null) {
            h0Var.b(iVar);
        }
        this.f37742d = h0Var;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    public final void a(c1.p focusModifier) {
        kotlin.jvm.internal.o.g(focusModifier, "focusModifier");
        this.f37743e.b(focusModifier);
        c1.h0 h0Var = this.f37742d;
        if (h0Var != null) {
            h0Var.a(focusModifier);
        }
    }

    public final void b(o0.i newModifiers) {
        kotlin.jvm.internal.o.g(newModifiers, "newModifiers");
        o0.i iVar = this.f37743e;
        iVar.d(iVar.f341852f, newModifiers);
        c1.h0 h0Var = this.f37742d;
        if (h0Var != null) {
            h0Var.b(newModifiers);
        }
    }

    public final void c(c1.p focusModifier) {
        kotlin.jvm.internal.o.g(focusModifier, "focusModifier");
        this.f37743e.k(focusModifier);
        c1.h0 h0Var = this.f37742d;
        if (h0Var != null) {
            h0Var.c(focusModifier);
        }
    }

    public final void d(o0.i removedModifiers) {
        kotlin.jvm.internal.o.g(removedModifiers, "removedModifiers");
        this.f37743e.l(removedModifiers);
        c1.h0 h0Var = this.f37742d;
        if (h0Var != null) {
            h0Var.d(removedModifiers);
        }
    }

    @Override // t1.d
    public t1.f getKey() {
        return c1.g0.f37740a;
    }

    @Override // t1.d
    public java.lang.Object getValue() {
        return this;
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
