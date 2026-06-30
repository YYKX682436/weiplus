package a0;

/* loaded from: classes14.dex */
public final class m3 implements b0.f3 {

    /* renamed from: f, reason: collision with root package name */
    public static final w0.x f226f = w0.b0.a(a0.j3.f191d, a0.k3.f202d);

    /* renamed from: a, reason: collision with root package name */
    public final n0.v2 f227a;

    /* renamed from: b, reason: collision with root package name */
    public final c0.o f228b;

    /* renamed from: c, reason: collision with root package name */
    public final n0.v2 f229c;

    /* renamed from: d, reason: collision with root package name */
    public float f230d;

    /* renamed from: e, reason: collision with root package name */
    public final b0.f3 f231e;

    public m3(int i17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        n0.h5 h5Var = n0.h5.f333529a;
        this.f227a = n0.s4.b(valueOf, h5Var);
        this.f228b = new c0.p();
        this.f229c = n0.s4.b(Integer.MAX_VALUE, h5Var);
        this.f231e = new b0.r(new a0.l3(this));
    }

    @Override // b0.f3
    public boolean a() {
        return ((b0.r) this.f231e).a();
    }

    @Override // b0.f3
    public float b(float f17) {
        return ((b0.r) this.f231e).b(f17);
    }

    @Override // b0.f3
    public java.lang.Object c(a0.k2 k2Var, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object c17 = ((b0.r) this.f231e).c(k2Var, pVar, continuation);
        return c17 == pz5.a.f359186d ? c17 : jz5.f0.f302826a;
    }

    public final int d() {
        return ((java.lang.Number) this.f227a.getValue()).intValue();
    }
}
