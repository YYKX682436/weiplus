package zm5;

/* loaded from: classes14.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zm5.r0 f555787d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(zm5.r0 r0Var) {
        super(2);
        this.f555787d = r0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        java.lang.Object obj3 = n0.e1.f415025a;
        zm5.r0 r0Var = this.f555787d;
        n0.e5 R6 = r0Var.O6().R6(oVar, 8);
        n0.e5 V6 = r0Var.O6().V6(oVar, 8);
        n0.e5 U6 = r0Var.O6().U6(oVar, 8);
        r0Var.f555797i = new bm5.r1(r0Var.m158354x19263085(), new zm5.l0((c1.k) ((n0.y0) oVar).i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92180f)));
        fn5.n0 O6 = r0Var.O6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(O6, "access$getViewModel(...)");
        fn5.p.b(O6, new zm5.m0(r0Var), new zm5.n0(r0Var), new zm5.o0(r0Var, R6, V6, U6), oVar, 8);
        return jz5.f0.f384359a;
    }
}
