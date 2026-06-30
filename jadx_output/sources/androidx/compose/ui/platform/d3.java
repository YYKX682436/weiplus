package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class d3 extends androidx.compose.ui.platform.i3 implements z0.s {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.compose.ui.platform.c3 f10538d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(yz5.l inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.o.g(inspectorInfo, "inspectorInfo");
        this.f10538d = new androidx.compose.ui.platform.c3(this);
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
