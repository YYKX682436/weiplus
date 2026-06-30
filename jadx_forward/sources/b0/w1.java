package b0;

/* loaded from: classes14.dex */
public final class w1 implements b0.e2, b0.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final b0.n1 f98105a;

    /* renamed from: b, reason: collision with root package name */
    public b0.u0 f98106b;

    public w1(b0.n1 origin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(origin, "origin");
        this.f98105a = origin;
    }

    @Override // b0.e2
    public java.lang.Object a(a0.k2 k2Var, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        b0.v1 v1Var = new b0.v1(this, pVar, null);
        b0.k kVar = (b0.k) this.f98105a;
        kVar.getClass();
        java.lang.Object f17 = p3325xe03a0797.p3326xc267989b.z0.f(new b0.i(kVar, k2Var, v1Var, null), interfaceC29045xdcb5ca57);
        pz5.a aVar = pz5.a.f440719d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (f17 != aVar) {
            f17 = f0Var;
        }
        return f17 == aVar ? f17 : f0Var;
    }

    @Override // b0.d2
    public void b(float f17, long j17) {
        b0.u0 u0Var = this.f98106b;
        if (u0Var != null) {
            ((b0.j) u0Var).f97885a.f97906a.mo146xb9724478(java.lang.Float.valueOf(f17));
        }
    }
}
