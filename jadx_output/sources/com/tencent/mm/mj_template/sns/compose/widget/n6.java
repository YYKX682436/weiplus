package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes14.dex */
public final class n6 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz0.l f70116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.k5 f70117e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f70118f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f70119g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(sz0.l lVar, com.tencent.mm.mj_template.sns.compose.widget.k5 k5Var, android.content.Context context, yz5.a aVar) {
        super(2);
        this.f70116d = lVar;
        this.f70117e = k5Var;
        this.f70118f = context;
        this.f70119g = aVar;
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
        boolean booleanValue = ((java.lang.Boolean) ((n0.q4) this.f70116d.f413932n).getValue()).booleanValue();
        z0.p pVar = z0.p.f468921d;
        com.tencent.mm.mj_template.sns.compose.widget.k5 k5Var = this.f70117e;
        if (!booleanValue) {
            if (!(k5Var.f70029f.length() == 0)) {
                n0.y0 y0Var2 = (n0.y0) oVar;
                y0Var2.U(-23689663);
                int i17 = z0.d.f468903a;
                z0.d dVar = z0.a.f468893e;
                int i18 = z0.t.f468922q1;
                z0.t h17 = d0.a3.h(pVar, i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aao)));
                y0Var2.U(733328855);
                s1.t0 c17 = d0.y.c(dVar, false, y0Var2, 6);
                y0Var2.U(-1323940314);
                p2.f fVar = (p2.f) y0Var2.i(androidx.compose.ui.platform.m2.f10646e);
                p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
                androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
                u1.g.f423594i1.getClass();
                yz5.a aVar = u1.f.f423587b;
                yz5.q a17 = s1.g0.a(h17);
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
                n0.i5.a(y0Var2, c17, u1.f.f423590e);
                n0.i5.a(y0Var2, fVar, u1.f.f423589d);
                n0.i5.a(y0Var2, sVar, u1.f.f423591f);
                n0.i5.a(y0Var2, k4Var, u1.f.f423592g);
                y0Var2.n();
                ((u0.i) a17).invoke(new n0.i4(y0Var2), y0Var2, 0);
                y0Var2.U(2058660585);
                y0Var2.U(-2137368960);
                ty0.h1.a("assets://sns_template_loading.pag", null, y0Var2, 6, 2);
                y0Var2.o(false);
                y0Var2.o(false);
                y0Var2.o(true);
                y0Var2.o(false);
                y0Var2.o(false);
                y0Var2.o(false);
                return jz5.f0.f302826a;
            }
        }
        n0.y0 y0Var3 = (n0.y0) oVar;
        y0Var3.U(-23690262);
        int i19 = s1.p.f402054a;
        s1.p pVar2 = s1.o.f402044a;
        int i27 = z0.t.f468922q1;
        a0.q1.a(this.f70116d, null, a0.d0.d(y1.t.a(d0.a3.h(pVar, i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aao))), com.tencent.mm.mj_template.sns.compose.widget.l6.f70059d), false, null, null, new com.tencent.mm.mj_template.sns.compose.widget.m6(k5Var, this.f70118f, this.f70119g), 7, null), null, pVar2, 0.0f, null, y0Var3, 24632, 104);
        y0Var3.o(false);
        return jz5.f0.f302826a;
    }
}
