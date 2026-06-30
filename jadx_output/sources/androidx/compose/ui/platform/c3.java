package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class c3 implements z0.s {
    public c3(androidx.compose.ui.platform.d3 d3Var) {
    }

    @Override // z0.t
    public boolean E(yz5.l lVar) {
        return z0.r.a(this, lVar);
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
