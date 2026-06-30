package c1;

/* loaded from: classes14.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final c1.v f37781d = new c1.v();

    public v() {
        super(3);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(-326009031);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        if (y17 == n0.n.f333620a) {
            y17 = new c1.p(c1.j0.Inactive, null, 2, null);
            y0Var.g0(y17);
        }
        y0Var.o(false);
        c1.p focusModifier = (c1.p) y17;
        n0.d2.h(new c1.u(focusModifier), y0Var, 0);
        t1.f fVar = c1.w.f37782a;
        kotlin.jvm.internal.o.g(focusModifier, "focusModifier");
        z0.t k17 = composed.k(focusModifier).k(c1.w.f37783b);
        y0Var.o(false);
        return k17;
    }
}
