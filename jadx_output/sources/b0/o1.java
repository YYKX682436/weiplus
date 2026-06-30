package b0;

/* loaded from: classes14.dex */
public final class o1 extends androidx.compose.ui.platform.i3 implements b1.h {

    /* renamed from: d, reason: collision with root package name */
    public final b0.c2 f16460d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(b0.c2 overScrollController, yz5.l inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.o.g(overScrollController, "overScrollController");
        kotlin.jvm.internal.o.g(inspectorInfo, "inspectorInfo");
        this.f16460d = overScrollController;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // b1.h
    public void P(g1.f fVar) {
        kotlin.jvm.internal.o.g(fVar, "<this>");
        ((u1.o0) fVar).b();
        this.f16460d.b(fVar);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0.o1)) {
            return false;
        }
        return kotlin.jvm.internal.o.b(this.f16460d, ((b0.o1) obj).f16460d);
    }

    public int hashCode() {
        return this.f16460d.hashCode();
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

    public java.lang.String toString() {
        return "DrawOverScrollModifier(overScrollController=" + this.f16460d + ')';
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(obj, this);
    }
}
