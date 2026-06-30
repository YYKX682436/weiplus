package a0;

/* loaded from: classes14.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1.a1 f114e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e1.r f115f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(float f17, e1.a1 a1Var, e1.r rVar) {
        super(3);
        this.f113d = f17;
        this.f114e = a1Var;
        this.f115f = rVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(-1498088849);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        int i17 = n0.o.f333629a;
        if (y17 == n0.n.f333620a) {
            y17 = new u1.y1();
            y0Var.g0(y17);
        }
        y0Var.o(false);
        int i18 = z0.t.f468922q1;
        z0.p pVar = z0.p.f468921d;
        e1.r rVar = this.f115f;
        z0.t k17 = composed.k(b1.j.b(pVar, new a0.d(this.f113d, this.f114e, (u1.y1) y17, rVar)));
        y0Var.o(false);
        return k17;
    }
}
