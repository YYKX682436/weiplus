package wy0;

/* loaded from: classes14.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f532150d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(d0.z zVar, java.util.List list) {
        super(4);
        this.f532150d = list;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        vz0.x HorizontalPager = (vz0.x) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        n0.o oVar = (n0.o) obj3;
        int intValue2 = ((java.lang.Number) obj4).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(HorizontalPager, "$this$HorizontalPager");
        if ((intValue2 & 112) == 0) {
            intValue2 |= ((n0.y0) oVar).c(intValue) ? 32 : 16;
        }
        if ((intValue2 & 721) == 144) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        java.lang.Object obj5 = n0.e1.f415025a;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(1486417502);
        boolean c17 = y0Var2.c(intValue);
        java.lang.Object y17 = y0Var2.y();
        if (c17 || y17 == n0.n.f415153a) {
            java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i((java.lang.String) this.f532150d.get(intValue), false);
            if (i17 == null) {
                i17 = "";
            }
            y17 = new java.io.File(i17);
            y0Var2.g0(y17);
        }
        y0Var2.o(false);
        y0Var2.U(604400049);
        u5.d dVar = u5.d.f506234b;
        r5.j a17 = u5.c.a(u5.y.f506287a, y0Var2, 6);
        y0Var2.U(604401818);
        c6.h hVar = new c6.h((android.content.Context) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.a1.f92036b));
        hVar.f120338c = (java.io.File) y17;
        u5.s a18 = u5.x.a(hVar.a(), a17, dVar, y0Var2, nd1.k2.f72953x366c91de, 0);
        y0Var2.o(false);
        y0Var2.o(false);
        s1.p pVar = s1.o.f483579c;
        z0.t f17 = d0.a3.f(z0.p.f550454d, 0.0f, 1, null);
        z0.d dVar2 = z0.a.f550426e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f17, "<this>");
        a0.q1.a(a18, null, f17.k(new d0.q(dVar2, false, p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e3.f92086d)), null, pVar, 0.0f, null, y0Var2, 24624, 104);
        return jz5.f0.f384359a;
    }
}
