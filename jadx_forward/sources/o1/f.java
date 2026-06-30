package o1;

/* loaded from: classes14.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o1.e f423557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o1.a f423558e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o1.e eVar, o1.a aVar) {
        super(3);
        this.f423557d = eVar;
        this.f423558e = aVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(410346167);
        y0Var.U(773894976);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        int i17 = n0.o.f415162a;
        java.lang.Object obj4 = n0.n.f415153a;
        if (y17 == obj4) {
            n0.o1 o1Var = new n0.o1(n0.d2.i(oz5.m.f431862d, y0Var));
            y0Var.g0(o1Var);
            y17 = o1Var;
        }
        y0Var.o(false);
        p3325xe03a0797.p3326xc267989b.y0 y0Var2 = ((n0.o1) y17).f415164d;
        y0Var.o(false);
        y0Var.U(100475863);
        o1.e eVar = this.f423557d;
        if (eVar == null) {
            y0Var.U(-492369756);
            java.lang.Object y18 = y0Var.y();
            if (y18 == obj4) {
                y18 = new o1.e();
                y0Var.g0(y18);
            }
            y0Var.o(false);
            eVar = (o1.e) y18;
        }
        y0Var.o(false);
        y0Var.U(1618982084);
        o1.a aVar = this.f423558e;
        boolean e17 = y0Var.e(aVar) | y0Var.e(eVar) | y0Var.e(y0Var2);
        java.lang.Object y19 = y0Var.y();
        if (e17 || y19 == obj4) {
            eVar.f423555b = y0Var2;
            y19 = new o1.k(eVar, aVar);
            y0Var.g0(y19);
        }
        y0Var.o(false);
        o1.k kVar = (o1.k) y19;
        y0Var.o(false);
        return kVar;
    }
}
