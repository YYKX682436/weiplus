package b0;

/* loaded from: classes14.dex */
public final class a3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0.c2 f97726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0.y1 f97727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.f3 f97728f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f97729g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0.o f97730h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b0.q1 f97731i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f97732m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(b0.c2 c2Var, b0.y1 y1Var, b0.f3 f3Var, boolean z17, c0.o oVar, b0.q1 q1Var, boolean z18) {
        super(3);
        this.f97726d = c2Var;
        this.f97727e = y1Var;
        this.f97728f = f3Var;
        this.f97729g = z17;
        this.f97730h = oVar;
        this.f97731i = q1Var;
        this.f97732m = z18;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        b0.q1 q1Var;
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(-759849188);
        z0.p pVar = z0.p.f550454d;
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e3 e3Var = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e3.f92086d;
        b0.c2 c2Var = this.f97726d;
        z0.t o1Var = c2Var != null ? new b0.o1(c2Var, e3Var) : pVar;
        y0Var.U(773894976);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        java.lang.Object obj4 = n0.n.f415153a;
        if (y17 == obj4) {
            n0.o1 o1Var2 = new n0.o1(n0.d2.i(oz5.m.f431862d, y0Var));
            y0Var.g0(o1Var2);
            y17 = o1Var2;
        }
        y0Var.o(false);
        p3325xe03a0797.p3326xc267989b.y0 y0Var2 = ((n0.o1) y17).f415164d;
        y0Var.o(false);
        boolean z17 = this.f97729g;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        b0.y1 y1Var = this.f97727e;
        b0.f3 f3Var = this.f97728f;
        java.lang.Object[] objArr = {y0Var2, y1Var, f3Var, valueOf};
        y0Var.U(-568225417);
        boolean z18 = false;
        for (int i17 = 0; i17 < 4; i17++) {
            z18 |= y0Var.e(objArr[i17]);
        }
        java.lang.Object y18 = y0Var.y();
        if (z18 || y18 == obj4) {
            y18 = new b0.h(y0Var2, y1Var, f3Var, z17);
            y0Var.g0(y18);
        }
        y0Var.o(false);
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.d3 d3Var = a0.y0.f81870a;
        pVar.k(d3Var);
        a0.i0 i0Var = a0.i0.f81704d;
        t1.f fVar = c1.b0.f119261a;
        z0.t k17 = d3Var.k(new c1.c0(i0Var, e3Var));
        t1.f fVar2 = c1.w.f119315a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(k17, "<this>");
        z0.t k18 = z0.m.a(k17, e3Var, c1.v.f119314d).k(((b0.h) y18).f97842n).k(o1Var);
        c0.o oVar = this.f97730h;
        b0.y1 y1Var2 = this.f97727e;
        boolean z19 = this.f97729g;
        b0.f3 f3Var2 = this.f97728f;
        b0.c2 c2Var2 = this.f97726d;
        boolean z27 = this.f97732m;
        y0Var.U(-1385895063);
        y0Var.U(-1730189082);
        b0.q1 q1Var2 = this.f97731i;
        if (q1Var2 == null) {
            y0Var.U(1107739818);
            z.d0 a17 = y.z1.a(y0Var, 0);
            y0Var.U(1157296644);
            boolean e17 = y0Var.e(a17);
            java.lang.Object y19 = y0Var.y();
            if (e17 || y19 == obj4) {
                y19 = new b0.n(a17);
                y0Var.g0(y19);
            }
            y0Var.o(false);
            y0Var.o(false);
            q1Var = (b0.n) y19;
        } else {
            q1Var = q1Var2;
        }
        y0Var.o(false);
        y0Var.U(-492369756);
        java.lang.Object y27 = y0Var.y();
        if (y27 == obj4) {
            y27 = n0.s4.c(new o1.e(), null, 2, null);
            y0Var.g0(y27);
        }
        y0Var.o(false);
        n0.v2 v2Var = (n0.v2) y27;
        n0.e5 e18 = n0.s4.e(new b0.m3(y1Var2, z19, v2Var, f3Var2, q1Var, c2Var2), y0Var, 0);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z27);
        y0Var.U(1157296644);
        boolean e19 = y0Var.e(valueOf2);
        java.lang.Object y28 = y0Var.y();
        if (e19 || y28 == obj4) {
            y28 = new b0.c3(z27, e18);
            y0Var.g0(y28);
        }
        y0Var.o(false);
        o1.a aVar = (o1.a) y28;
        y0Var.U(-492369756);
        java.lang.Object y29 = y0Var.y();
        if (y29 == obj4) {
            y29 = new b0.k2(e18);
            y0Var.g0(y29);
        }
        y0Var.o(false);
        y0Var.U(-1485272842);
        y0Var.o(false);
        b0.a aVar2 = b0.a.f97717a;
        z0.t a18 = o1.g.a(p1.x0.a(b0.m1.c(k18, new b0.v2((b0.k2) y29), b0.w2.f98107d, y1Var2, z27, oVar, new b0.x2(e18), new b0.c1(null), new b0.z2(v2Var, e18, null), false), e18, aVar2, new b0.u2(aVar2, e18, null)), aVar, (o1.e) v2Var.mo128745x754a37bb());
        y0Var.o(false);
        z0.t k19 = a18.k(this.f97732m ? b0.x1.f98118d : pVar);
        y0Var.o(false);
        return k19;
    }
}
