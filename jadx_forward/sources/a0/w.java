package a0;

/* loaded from: classes14.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f81853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f81854e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c0.o f81855f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0.r1 f81856g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81857h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y1.i f81858i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(yz5.a aVar, boolean z17, c0.o oVar, a0.r1 r1Var, java.lang.String str, y1.i iVar) {
        super(3);
        this.f81853d = aVar;
        this.f81854e = z17;
        this.f81855f = oVar;
        this.f81856g = r1Var;
        this.f81857h = str;
        this.f81858i = iVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(92076020);
        yz5.a onClick = this.f81853d;
        n0.e5 e17 = n0.s4.e(onClick, y0Var, 0);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        java.lang.Object obj4 = n0.n.f415153a;
        if (y17 == obj4) {
            y17 = n0.s4.c(null, null, 2, null);
            y0Var.g0(y17);
        }
        y0Var.o(false);
        n0.v2 v2Var = (n0.v2) y17;
        y0Var.U(1841981204);
        boolean z17 = this.f81854e;
        c0.o interactionSource = this.f81855f;
        if (z17) {
            a0.d0.a(interactionSource, v2Var, y0Var, 48);
        }
        y0Var.o(false);
        int i17 = a0.f0.f81656b;
        y0Var.U(-1990508712);
        a0.e0 e0Var = new a0.e0((android.view.View) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.a1.f92040f));
        y0Var.o(false);
        y0Var.U(-492369756);
        java.lang.Object y18 = y0Var.y();
        if (y18 == obj4) {
            y18 = n0.s4.c(java.lang.Boolean.TRUE, null, 2, null);
            y0Var.g0(y18);
        }
        y0Var.o(false);
        n0.v2 v2Var2 = (n0.v2) y18;
        z0.t gestureModifiers = p1.x0.a(z0.p.f550454d, interactionSource, java.lang.Boolean.valueOf(z17), new a0.v(this.f81854e, this.f81855f, v2Var, n0.s4.e(new a0.s(v2Var2, e0Var), y0Var, 0), e17, null));
        y0Var.U(-492369756);
        java.lang.Object y19 = y0Var.y();
        if (y19 == obj4) {
            y19 = new a0.r(v2Var2);
            y0Var.g0(y19);
        }
        y0Var.o(false);
        z0.t other = (z0.t) y19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        boolean z18 = this.f81854e;
        java.lang.String str = this.f81857h;
        y1.i iVar = this.f81858i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gestureModifiers, "gestureModifiers");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interactionSource, "interactionSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClick, "onClick");
        z0.t b17 = y1.t.b(other, true, new a0.z(iVar, str, null, null, z18, onClick));
        a0.a0 a0Var = new a0.a0(z18, onClick);
        t1.f fVar = n1.f.f415569a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(b17, "<this>");
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e3 e3Var = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e3.f92086d;
        z0.t a17 = a0.v1.a(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.f3.a(b17, e3Var, new n1.d(a0Var, null)), interactionSource, this.f81856g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "<this>");
        z0.t a18 = z0.m.a(a17, e3Var, new a0.l1(interactionSource, z18));
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.d3 d3Var = a0.y0.f81870a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a18, "<this>");
        z0.t k17 = z0.m.a(a18, e3Var, new a0.x0(z18, interactionSource)).k(gestureModifiers);
        y0Var.o(false);
        return k17;
    }
}
