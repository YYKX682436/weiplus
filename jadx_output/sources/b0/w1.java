package b0;

/* loaded from: classes14.dex */
public final class w1 implements b0.e2, b0.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final b0.n1 f16572a;

    /* renamed from: b, reason: collision with root package name */
    public b0.u0 f16573b;

    public w1(b0.n1 origin) {
        kotlin.jvm.internal.o.g(origin, "origin");
        this.f16572a = origin;
    }

    @Override // b0.e2
    public java.lang.Object a(a0.k2 k2Var, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        b0.v1 v1Var = new b0.v1(this, pVar, null);
        b0.k kVar = (b0.k) this.f16572a;
        kVar.getClass();
        java.lang.Object f17 = kotlinx.coroutines.z0.f(new b0.i(kVar, k2Var, v1Var, null), continuation);
        pz5.a aVar = pz5.a.f359186d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (f17 != aVar) {
            f17 = f0Var;
        }
        return f17 == aVar ? f17 : f0Var;
    }

    @Override // b0.d2
    public void b(float f17, long j17) {
        b0.u0 u0Var = this.f16573b;
        if (u0Var != null) {
            ((b0.j) u0Var).f16352a.f16373a.invoke(java.lang.Float.valueOf(f17));
        }
    }
}
