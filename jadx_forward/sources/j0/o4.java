package j0;

/* loaded from: classes14.dex */
public final class o4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f378018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0.o f378019e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(yz5.l lVar, c0.o oVar) {
        super(3);
        this.f378018d = lVar;
        this.f378019e = oVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(-102778667);
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
        y0Var.U(-492369756);
        java.lang.Object y18 = y0Var.y();
        if (y18 == obj4) {
            y18 = n0.s4.c(null, null, 2, null);
            y0Var.g0(y18);
        }
        y0Var.o(false);
        n0.v2 v2Var = (n0.v2) y18;
        n0.e5 e17 = n0.s4.e(this.f378018d, y0Var, 0);
        c0.o oVar = this.f378019e;
        n0.d2.c(oVar, new j0.i4(v2Var, oVar), y0Var, 0);
        int i18 = z0.t.f550455q1;
        z0.p pVar = z0.p.f550454d;
        c0.o oVar2 = this.f378019e;
        z0.t b17 = p1.x0.b(pVar, oVar2, new j0.n4(y0Var2, v2Var, oVar2, e17, null));
        y0Var.o(false);
        return b17;
    }
}
