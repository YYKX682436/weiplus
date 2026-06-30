package a0;

/* loaded from: classes14.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f321e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c0.o f322f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0.r1 f323g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f324h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y1.i f325i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(yz5.a aVar, boolean z17, c0.o oVar, a0.r1 r1Var, java.lang.String str, y1.i iVar) {
        super(3);
        this.f320d = aVar;
        this.f321e = z17;
        this.f322f = oVar;
        this.f323g = r1Var;
        this.f324h = str;
        this.f325i = iVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(92076020);
        yz5.a onClick = this.f320d;
        n0.e5 e17 = n0.s4.e(onClick, y0Var, 0);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        java.lang.Object obj4 = n0.n.f333620a;
        if (y17 == obj4) {
            y17 = n0.s4.c(null, null, 2, null);
            y0Var.g0(y17);
        }
        y0Var.o(false);
        n0.v2 v2Var = (n0.v2) y17;
        y0Var.U(1841981204);
        boolean z17 = this.f321e;
        c0.o interactionSource = this.f322f;
        if (z17) {
            a0.d0.a(interactionSource, v2Var, y0Var, 48);
        }
        y0Var.o(false);
        int i17 = a0.f0.f123b;
        y0Var.U(-1990508712);
        a0.e0 e0Var = new a0.e0((android.view.View) y0Var.i(androidx.compose.ui.platform.a1.f10507f));
        y0Var.o(false);
        y0Var.U(-492369756);
        java.lang.Object y18 = y0Var.y();
        if (y18 == obj4) {
            y18 = n0.s4.c(java.lang.Boolean.TRUE, null, 2, null);
            y0Var.g0(y18);
        }
        y0Var.o(false);
        n0.v2 v2Var2 = (n0.v2) y18;
        z0.t gestureModifiers = p1.x0.a(z0.p.f468921d, interactionSource, java.lang.Boolean.valueOf(z17), new a0.v(this.f321e, this.f322f, v2Var, n0.s4.e(new a0.s(v2Var2, e0Var), y0Var, 0), e17, null));
        y0Var.U(-492369756);
        java.lang.Object y19 = y0Var.y();
        if (y19 == obj4) {
            y19 = new a0.r(v2Var2);
            y0Var.g0(y19);
        }
        y0Var.o(false);
        z0.t other = (z0.t) y19;
        kotlin.jvm.internal.o.g(other, "other");
        boolean z18 = this.f321e;
        java.lang.String str = this.f324h;
        y1.i iVar = this.f325i;
        kotlin.jvm.internal.o.g(gestureModifiers, "gestureModifiers");
        kotlin.jvm.internal.o.g(interactionSource, "interactionSource");
        kotlin.jvm.internal.o.g(onClick, "onClick");
        z0.t b17 = y1.t.b(other, true, new a0.z(iVar, str, null, null, z18, onClick));
        a0.a0 a0Var = new a0.a0(z18, onClick);
        t1.f fVar = n1.f.f334036a;
        kotlin.jvm.internal.o.g(b17, "<this>");
        androidx.compose.ui.platform.e3 e3Var = androidx.compose.ui.platform.e3.f10553d;
        z0.t a17 = a0.v1.a(androidx.compose.ui.platform.f3.a(b17, e3Var, new n1.d(a0Var, null)), interactionSource, this.f323g);
        kotlin.jvm.internal.o.g(a17, "<this>");
        z0.t a18 = z0.m.a(a17, e3Var, new a0.l1(interactionSource, z18));
        androidx.compose.ui.platform.d3 d3Var = a0.y0.f337a;
        kotlin.jvm.internal.o.g(a18, "<this>");
        z0.t k17 = z0.m.a(a18, e3Var, new a0.x0(z18, interactionSource)).k(gestureModifiers);
        y0Var.o(false);
        return k17;
    }
}
