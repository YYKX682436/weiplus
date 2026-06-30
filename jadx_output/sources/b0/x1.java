package b0;

/* loaded from: classes14.dex */
public final class x1 implements t1.d {

    /* renamed from: d, reason: collision with root package name */
    public static final b0.x1 f16585d = new b0.x1();

    /* renamed from: e, reason: collision with root package name */
    public static final t1.f f16586e = b0.d3.f16263b;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f16587f = true;

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // t1.d
    public t1.f getKey() {
        return f16586e;
    }

    @Override // t1.d
    public java.lang.Object getValue() {
        return java.lang.Boolean.valueOf(f16587f);
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
