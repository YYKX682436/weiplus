package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes14.dex */
public final class h2 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f69980d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(n0.v2 v2Var) {
        super(3);
        this.f69980d = v2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        ?? r86;
        java.lang.String str;
        boolean z17;
        boolean z18;
        yz5.p innerTextField = (yz5.p) obj;
        n0.o oVar = (n0.o) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(innerTextField, "innerTextField");
        if ((intValue & 14) == 0) {
            intValue |= ((n0.y0) oVar).e(innerTextField) ? 4 : 2;
        }
        if ((intValue & 91) == 18) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj4 = n0.e1.f333492a;
        z0.p pVar = z0.p.f468921d;
        z0.t f17 = d0.a2.f(pVar, i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479924j3)));
        z0.c cVar = z0.a.f468899k;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(693286680);
        s1.t0 a17 = d0.n2.a(d0.p.f225184b, cVar, y0Var2, 48);
        y0Var2.U(-1323940314);
        n0.h3 h3Var = androidx.compose.ui.platform.m2.f10646e;
        p2.f fVar = (p2.f) y0Var2.i(h3Var);
        n0.h3 h3Var2 = androidx.compose.ui.platform.m2.f10652k;
        p2.s sVar = (p2.s) y0Var2.i(h3Var2);
        n0.h3 h3Var3 = androidx.compose.ui.platform.m2.f10656o;
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(h3Var3);
        u1.g.f423594i1.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a18 = s1.g0.a(f17);
        boolean z19 = y0Var2.f333761b instanceof n0.e;
        if (!z19) {
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
        yz5.p pVar2 = u1.f.f423590e;
        n0.i5.a(y0Var2, a17, pVar2);
        yz5.p pVar3 = u1.f.f423589d;
        n0.i5.a(y0Var2, fVar, pVar3);
        yz5.p pVar4 = u1.f.f423591f;
        n0.i5.a(y0Var2, sVar, pVar4);
        yz5.p pVar5 = u1.f.f423592g;
        n0.i5.a(y0Var2, k4Var, pVar5);
        y0Var2.n();
        ((u0.i) a18).invoke(new n0.i4(y0Var2), y0Var2, 0);
        y0Var2.U(2058660585);
        y0Var2.U(-678309503);
        d0.q2 q2Var = d0.q2.f225198a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        a0.q1.a(rz0.a.a(com.tencent.mm.R.raw.icons_filled_search, rz0.a.b(com.tencent.mm.R.color.a7d, context), y0Var2, 0), "", d0.a2.j(pVar, 0.0f, 0.0f, i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479924j3)), 0.0f, 11, null), null, null, 0.0f, null, y0Var2, 56, 120);
        z0.t a19 = d0.o2.a(q2Var, pVar, 1.0f, false, 2, null);
        y0Var2.U(733328855);
        s1.t0 c17 = d0.y.c(z0.a.f468889a, false, y0Var2, 0);
        y0Var2.U(-1323940314);
        p2.f fVar2 = (p2.f) y0Var2.i(h3Var);
        p2.s sVar2 = (p2.s) y0Var2.i(h3Var2);
        androidx.compose.ui.platform.k4 k4Var2 = (androidx.compose.ui.platform.k4) y0Var2.i(h3Var3);
        yz5.q a27 = s1.g0.a(a19);
        if (!z19) {
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
        n0.i5.a(y0Var2, c17, pVar2);
        n0.i5.a(y0Var2, fVar2, pVar3);
        n0.i5.a(y0Var2, sVar2, pVar4);
        n0.i5.a(y0Var2, k4Var2, pVar5);
        y0Var2.n();
        ((u0.i) a27).invoke(new n0.i4(y0Var2), y0Var2, 0);
        y0Var2.U(2058660585);
        y0Var2.U(-2137368960);
        y0Var2.U(-2119776587);
        n0.v2 v2Var = this.f69980d;
        if (((java.lang.String) v2Var.getValue()).length() == 0) {
            java.lang.String g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.jm8);
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            long b17 = rz0.a.b(com.tencent.mm.R.color.a7o, context2);
            d0.q qVar = new d0.q(z0.a.f468892d, false, androidx.compose.ui.platform.e3.f10553d);
            kotlin.jvm.internal.o.d(g17);
            r86 = 0;
            str = "getContext(...)";
            l0.e5.c(g17, qVar, b17, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, y0Var2, 0, 0, 65528);
        } else {
            r86 = 0;
            str = "getContext(...)";
        }
        y0Var2.o(r86);
        innerTextField.invoke(y0Var2, java.lang.Integer.valueOf(intValue & 14));
        y0Var2.o(r86);
        y0Var2.o(r86);
        y0Var2.o(true);
        y0Var2.o(r86);
        y0Var2.o(r86);
        y0Var2.U(-1788945956);
        if (((java.lang.String) v2Var.getValue()).length() > 0 ? true : r86) {
            android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context3, str);
            h1.c a28 = rz0.a.a(com.tencent.mm.R.raw.icons_filled_close2, rz0.a.b(com.tencent.mm.R.color.a9z, context3), y0Var2, r86);
            z17 = r86;
            z18 = true;
            z0.t j17 = d0.a2.j(pVar, 0.0f, 0.0f, i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479924j3)), 0.0f, 11, null);
            y0Var2.U(103409615);
            boolean e17 = y0Var2.e(v2Var);
            java.lang.Object y17 = y0Var2.y();
            if (e17 || y17 == n0.n.f333620a) {
                y17 = new com.tencent.mm.mj_template.sns.compose.widget.g2(v2Var);
                y0Var2.g0(y17);
            }
            y0Var2.o(z17);
            a0.q1.a(a28, "", a0.d0.d(j17, false, null, null, (yz5.a) y17, 7, null), null, null, 0.0f, null, y0Var2, 56, 120);
        } else {
            z17 = r86;
            z18 = true;
        }
        y0Var2.o(z17);
        y0Var2.o(z17);
        y0Var2.o(z17);
        y0Var2.o(z18);
        y0Var2.o(z17);
        y0Var2.o(z17);
        return jz5.f0.f302826a;
    }
}
