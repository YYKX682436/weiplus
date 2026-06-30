package b0;

/* loaded from: classes14.dex */
public final class r implements b0.f3 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f16486a;

    /* renamed from: b, reason: collision with root package name */
    public final b0.p2 f16487b;

    /* renamed from: c, reason: collision with root package name */
    public final a0.n2 f16488c;

    /* renamed from: d, reason: collision with root package name */
    public final n0.v2 f16489d;

    public r(yz5.l onDelta) {
        kotlin.jvm.internal.o.g(onDelta, "onDelta");
        this.f16486a = onDelta;
        this.f16487b = new b0.q(this);
        this.f16488c = new a0.n2();
        this.f16489d = n0.s4.c(java.lang.Boolean.FALSE, null, 2, null);
    }

    @Override // b0.f3
    public boolean a() {
        return ((java.lang.Boolean) ((n0.q4) this.f16489d).getValue()).booleanValue();
    }

    @Override // b0.f3
    public float b(float f17) {
        return ((java.lang.Number) this.f16486a.invoke(java.lang.Float.valueOf(f17))).floatValue();
    }

    @Override // b0.f3
    public java.lang.Object c(a0.k2 k2Var, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object f17 = kotlinx.coroutines.z0.f(new b0.p(this, k2Var, pVar, null), continuation);
        return f17 == pz5.a.f359186d ? f17 : jz5.f0.f302826a;
    }
}
