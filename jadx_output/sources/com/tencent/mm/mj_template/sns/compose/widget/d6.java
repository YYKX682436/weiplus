package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes14.dex */
public final class d6 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f69934d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(yz5.l lVar) {
        super(2);
        this.f69934d = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj3 = n0.e1.f333492a;
        n0.y0 y0Var2 = (n0.y0) oVar;
        z0.p pVar = z0.p.f468921d;
        y0Var2.U(-1939412762);
        yz5.l lVar = this.f69934d;
        boolean e17 = y0Var2.e(lVar);
        java.lang.Object y17 = y0Var2.y();
        if (e17 || y17 == n0.n.f333620a) {
            y17 = new com.tencent.mm.mj_template.sns.compose.widget.b6(lVar);
            y0Var2.g0(y17);
        }
        y0Var2.o(false);
        z0.t d17 = a0.d0.d(pVar, false, null, null, (yz5.a) y17, 7, null);
        y0Var2.U(733328855);
        s1.t0 c17 = d0.y.c(z0.a.f468889a, false, oVar, 0);
        y0Var2.U(-1323940314);
        p2.f fVar = (p2.f) y0Var2.i(androidx.compose.ui.platform.m2.f10646e);
        p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
        u1.g.f423594i1.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a17 = s1.g0.a(d17);
        if (!(y0Var2.f333761b instanceof n0.e)) {
            n0.l.a();
            throw null;
        }
        y0Var2.X();
        if (y0Var2.L) {
            y0Var2.j(aVar);
        } else {
            y0Var2.i0();
        }
        y0Var2.f333784y = false;
        n0.i5.a(oVar, c17, u1.f.f423590e);
        n0.i5.a(oVar, fVar, u1.f.f423589d);
        n0.i5.a(oVar, sVar, u1.f.f423591f);
        n0.i5.a(oVar, k4Var, u1.f.f423592g);
        y0Var2.n();
        ((u0.i) a17).invoke(new n0.i4(oVar), oVar, 0);
        y0Var2.U(2058660585);
        y0Var2.U(-2137368960);
        y0Var2.U(735325167);
        h1.c a18 = x1.f.a(com.tencent.mm.R.drawable.bdi, y0Var2, 0);
        y0Var2.o(false);
        a0.q1.a(a18, null, y1.t.a(d0.a3.h(new d0.q(z0.a.f468893e, false, androidx.compose.ui.platform.e3.f10553d), i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479704cz))), com.tencent.mm.mj_template.sns.compose.widget.c6.f69911d), null, null, 0.0f, null, oVar, 56, 120);
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(true);
        y0Var2.o(false);
        y0Var2.o(false);
        return jz5.f0.f302826a;
    }
}
