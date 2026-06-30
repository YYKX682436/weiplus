package a0;

/* loaded from: classes14.dex */
public final class h2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f81691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f81692e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f81693f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f81694g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a0.s2 f81695h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a0.j2 f81696i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(yz5.l lVar, yz5.l lVar2, float f17, yz5.l lVar3, a0.s2 s2Var, a0.j2 j2Var) {
        super(3);
        this.f81691d = lVar;
        this.f81692e = lVar2;
        this.f81693f = f17;
        this.f81694g = lVar3;
        this.f81695h = s2Var;
        this.f81696i = j2Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(-454877003);
        android.view.View view = (android.view.View) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.a1.f92040f);
        p2.f fVar = (p2.f) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        int i17 = n0.o.f415162a;
        java.lang.Object obj4 = n0.n.f415153a;
        if (y17 == obj4) {
            y17 = n0.s4.c(new d1.e(d1.e.f307158d), null, 2, null);
            y0Var.g0(y17);
        }
        y0Var.o(false);
        n0.v2 v2Var = (n0.v2) y17;
        n0.e5 e17 = n0.s4.e(this.f81691d, y0Var, 0);
        n0.e5 e18 = n0.s4.e(this.f81692e, y0Var, 0);
        float f17 = this.f81693f;
        n0.e5 e19 = n0.s4.e(java.lang.Float.valueOf(f17), y0Var, 0);
        n0.e5 e27 = n0.s4.e(this.f81694g, y0Var, 0);
        y0Var.U(-492369756);
        java.lang.Object y18 = y0Var.y();
        if (y18 == obj4) {
            y18 = n0.s4.a(new a0.g2(fVar, e17, v2Var));
            y0Var.g0(y18);
        }
        y0Var.o(false);
        n0.e5 e5Var = (n0.e5) y18;
        y0Var.U(-492369756);
        java.lang.Object y19 = y0Var.y();
        if (y19 == obj4) {
            y19 = n0.s4.a(new a0.f2(e5Var));
            y0Var.g0(y19);
        }
        y0Var.o(false);
        n0.e5 e5Var2 = (n0.e5) y19;
        y0Var.U(-492369756);
        java.lang.Object y27 = y0Var.y();
        if (y27 == obj4) {
            y27 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(1, 0, u26.u.DROP_OLDEST, 2, null);
            y0Var.g0(y27);
        }
        y0Var.o(false);
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.i2) y27;
        if (this.f81695h.b()) {
            f17 = 0.0f;
        }
        java.lang.Float valueOf = java.lang.Float.valueOf(f17);
        a0.j2 j2Var = a0.j2.f81721d;
        a0.j2 j2Var2 = this.f81696i;
        n0.d2.g(new java.lang.Object[]{view, fVar, valueOf, j2Var2, java.lang.Boolean.valueOf(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j2Var2, j2Var))}, new a0.a2(this.f81695h, this.f81696i, view, fVar, this.f81693f, i2Var, e27, e5Var2, e5Var, e18, v2Var, e19, null), y0Var, 8);
        z0.t c17 = y1.t.c(b1.j.a(s1.h1.a(composed, new a0.b2(v2Var)), new a0.c2(i2Var)), false, new a0.e2(e5Var), 1, null);
        y0Var.o(false);
        return c17;
    }
}
