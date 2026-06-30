package b1;

/* loaded from: classes14.dex */
public final class l extends androidx.compose.ui.platform.i3 implements b1.h {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f16997d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yz5.l onDraw, yz5.l inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.o.g(onDraw, "onDraw");
        kotlin.jvm.internal.o.g(inspectorInfo, "inspectorInfo");
        this.f16997d = onDraw;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // b1.h
    public void P(g1.f fVar) {
        kotlin.jvm.internal.o.g(fVar, "<this>");
        this.f16997d.invoke(fVar);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1.l)) {
            return false;
        }
        return kotlin.jvm.internal.o.b(this.f16997d, ((b1.l) obj).f16997d);
    }

    public int hashCode() {
        return this.f16997d.hashCode();
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
