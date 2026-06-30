package c1;

/* loaded from: classes14.dex */
public final class i implements t1.d, t1.b {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f37744d;

    /* renamed from: e, reason: collision with root package name */
    public c1.i f37745e;

    /* renamed from: f, reason: collision with root package name */
    public final o0.i f37746f;

    /* renamed from: g, reason: collision with root package name */
    public final o0.i f37747g;

    public i(yz5.l onFocusEvent) {
        kotlin.jvm.internal.o.g(onFocusEvent, "onFocusEvent");
        this.f37744d = onFocusEvent;
        this.f37746f = new o0.i(new c1.i[16], 0);
        this.f37747g = new o0.i(new c1.p[16], 0);
    }

    @Override // t1.b
    public void B(t1.e scope) {
        kotlin.jvm.internal.o.g(scope, "scope");
        t1.f fVar = c1.h.f37741a;
        c1.i iVar = (c1.i) scope.a(fVar);
        if (!kotlin.jvm.internal.o.b(iVar, this.f37745e)) {
            c1.i iVar2 = this.f37745e;
            o0.i iVar3 = this.f37747g;
            if (iVar2 != null) {
                iVar2.f37746f.k(this);
                iVar2.e(iVar3);
            }
            this.f37745e = iVar;
            if (iVar != null) {
                iVar.f37746f.b(this);
                iVar.b(iVar3);
            }
        }
        this.f37745e = (c1.i) scope.a(fVar);
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    public final void a(c1.p focusModifier) {
        kotlin.jvm.internal.o.g(focusModifier, "focusModifier");
        this.f37747g.b(focusModifier);
        c1.i iVar = this.f37745e;
        if (iVar != null) {
            iVar.a(focusModifier);
        }
    }

    public final void b(o0.i iVar) {
        o0.i iVar2 = this.f37747g;
        iVar2.d(iVar2.f341852f, iVar);
        c1.i iVar3 = this.f37745e;
        if (iVar3 != null) {
            iVar3.b(iVar);
        }
    }

    public final void c() {
        java.lang.Boolean bool;
        c1.j0 j0Var;
        o0.i iVar = this.f37747g;
        int i17 = iVar.f341852f;
        c1.j0 j0Var2 = c1.j0.Inactive;
        if (i17 != 0) {
            int i18 = 0;
            if (i17 != 1) {
                c1.p pVar = null;
                java.lang.Boolean bool2 = null;
                if (i17 > 0) {
                    java.lang.Object[] objArr = iVar.f341850d;
                    c1.p pVar2 = null;
                    do {
                        c1.p pVar3 = (c1.p) objArr[i18];
                        int ordinal = pVar3.f37767f.ordinal();
                        if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                    if (ordinal == 5) {
                                        bool2 = java.lang.Boolean.FALSE;
                                    }
                                }
                            } else if (bool2 == null) {
                                bool2 = java.lang.Boolean.TRUE;
                            }
                            i18++;
                        }
                        bool2 = java.lang.Boolean.FALSE;
                        pVar2 = pVar3;
                        i18++;
                    } while (i18 < i17);
                    bool = bool2;
                    pVar = pVar2;
                } else {
                    bool = null;
                }
                if (pVar != null && (j0Var = pVar.f37767f) != null) {
                    j0Var2 = j0Var;
                } else if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
                    j0Var2 = c1.j0.Deactivated;
                }
            } else {
                j0Var2 = ((c1.p) iVar.f341850d[0]).f37767f;
            }
        }
        this.f37744d.invoke(j0Var2);
        c1.i iVar2 = this.f37745e;
        if (iVar2 != null) {
            iVar2.c();
        }
    }

    public final void d(c1.p focusModifier) {
        kotlin.jvm.internal.o.g(focusModifier, "focusModifier");
        this.f37747g.k(focusModifier);
        c1.i iVar = this.f37745e;
        if (iVar != null) {
            iVar.d(focusModifier);
        }
    }

    public final void e(o0.i iVar) {
        this.f37747g.l(iVar);
        c1.i iVar2 = this.f37745e;
        if (iVar2 != null) {
            iVar2.e(iVar);
        }
    }

    @Override // t1.d
    public t1.f getKey() {
        return c1.h.f37741a;
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
