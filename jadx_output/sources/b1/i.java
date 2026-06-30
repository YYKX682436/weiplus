package b1;

/* loaded from: classes14.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f16995d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(yz5.l lVar) {
        super(3);
        this.f16995d = lVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(-1689569019);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        int i17 = n0.o.f333629a;
        if (y17 == n0.n.f333620a) {
            y17 = new b1.c();
            y0Var.g0(y17);
        }
        y0Var.o(false);
        z0.t k17 = composed.k(new b1.g((b1.c) y17, this.f16995d));
        y0Var.o(false);
        return k17;
    }
}
