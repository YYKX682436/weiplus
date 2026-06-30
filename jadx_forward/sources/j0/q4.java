package j0;

/* loaded from: classes14.dex */
public final class q4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0.u4 f378052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f378053e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c0.o f378054f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(j0.u4 u4Var, boolean z17, c0.o oVar) {
        super(3);
        this.f378052d = u4Var;
        this.f378053e = z17;
        this.f378054f = oVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z17;
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(805428266);
        boolean z18 = y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92185k) == p2.s.Rtl;
        j0.u4 u4Var = this.f378052d;
        boolean z19 = ((b0.y1) ((n0.q4) u4Var.f378120e).mo128745x754a37bb()) == b0.y1.Vertical || !z18;
        j0.p4 p4Var = new j0.p4(u4Var);
        y0Var.U(-180460798);
        n0.e5 e17 = n0.s4.e(p4Var, y0Var, 0);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        if (y17 == n0.n.f415153a) {
            b0.r rVar = new b0.r(new b0.g3(e17));
            y0Var.g0(rVar);
            y17 = rVar;
        }
        y0Var.o(false);
        b0.f3 state = (b0.f3) y17;
        y0Var.o(false);
        z0.p pVar = z0.p.f550454d;
        b0.y1 orientation = (b0.y1) ((n0.q4) u4Var.f378120e).mo128745x754a37bb();
        if (this.f378053e) {
            if (!(((java.lang.Number) ((n0.q4) u4Var.f378117b).mo128745x754a37bb()).floatValue() == 0.0f)) {
                z17 = true;
                c0.o oVar = this.f378054f;
                b0.p2 p2Var = b0.d3.f97795a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(orientation, "orientation");
                z0.t b17 = b0.d3.b(pVar, state, orientation, null, z17, z19, null, oVar);
                y0Var.o(false);
                return b17;
            }
        }
        z17 = false;
        c0.o oVar2 = this.f378054f;
        b0.p2 p2Var2 = b0.d3.f97795a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(orientation, "orientation");
        z0.t b172 = b0.d3.b(pVar, state, orientation, null, z17, z19, null, oVar2);
        y0Var.o(false);
        return b172;
    }
}
