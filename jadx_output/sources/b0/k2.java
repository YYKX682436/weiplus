package b0;

/* loaded from: classes14.dex */
public final class k2 implements b0.e2, b0.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final n0.e5 f16386a;

    /* renamed from: b, reason: collision with root package name */
    public b0.p2 f16387b;

    public k2(n0.e5 scrollLogic) {
        kotlin.jvm.internal.o.g(scrollLogic, "scrollLogic");
        this.f16386a = scrollLogic;
        this.f16387b = b0.d3.f16262a;
    }

    @Override // b0.e2
    public java.lang.Object a(a0.k2 k2Var, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object c17 = ((b0.m3) this.f16386a.getValue()).f16435d.c(k2Var, new b0.j2(this, pVar, null), continuation);
        return c17 == pz5.a.f359186d ? c17 : jz5.f0.f302826a;
    }

    @Override // b0.d2
    public void b(float f17, long j17) {
        b0.m3 m3Var = (b0.m3) this.f16386a.getValue();
        m3Var.a(this.f16387b, m3Var.e(f17), new d1.e(j17), 1);
    }
}
