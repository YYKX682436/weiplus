package c1;

/* loaded from: classes14.dex */
public final class c0 extends androidx.compose.ui.platform.i3 implements t1.b, t1.d {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f37729d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.v2 f37730e;

    /* renamed from: f, reason: collision with root package name */
    public final t1.f f37731f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(yz5.l focusPropertiesScope, yz5.l inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.o.g(focusPropertiesScope, "focusPropertiesScope");
        kotlin.jvm.internal.o.g(inspectorInfo, "inspectorInfo");
        this.f37729d = focusPropertiesScope;
        this.f37730e = n0.s4.c(null, null, 2, null);
        this.f37731f = c1.b0.f37728a;
    }

    @Override // t1.b
    public void B(t1.e scope) {
        kotlin.jvm.internal.o.g(scope, "scope");
        ((n0.q4) this.f37730e).setValue((c1.c0) scope.a(c1.b0.f37728a));
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    public final void a(c1.x focusProperties) {
        kotlin.jvm.internal.o.g(focusProperties, "focusProperties");
        this.f37729d.invoke(focusProperties);
        c1.c0 c0Var = (c1.c0) ((n0.q4) this.f37730e).getValue();
        if (c0Var != null) {
            c0Var.a(focusProperties);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof c1.c0) {
            if (kotlin.jvm.internal.o.b(this.f37729d, ((c1.c0) obj).f37729d)) {
                return true;
            }
        }
        return false;
    }

    @Override // t1.d
    public t1.f getKey() {
        return this.f37731f;
    }

    @Override // t1.d
    public java.lang.Object getValue() {
        return this;
    }

    public int hashCode() {
        return this.f37729d.hashCode();
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
