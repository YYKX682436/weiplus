package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes14.dex */
public abstract class a7 {
    public static final void a(com.tencent.mm.mj_template.sns.compose.widget.y4 snsTemplateListData, yz5.a onClick, n0.o oVar, int i17) {
        int i18;
        n0.y0 y0Var;
        boolean z17;
        long b17;
        kotlin.jvm.internal.o.g(snsTemplateListData, "snsTemplateListData");
        kotlin.jvm.internal.o.g(onClick, "onClick");
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.V(-1280502112);
        if ((i17 & 14) == 0) {
            i18 = (y0Var2.e(snsTemplateListData) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 112) == 0) {
            i18 |= y0Var2.e(onClick) ? 32 : 16;
        }
        if ((i18 & 91) == 18 && y0Var2.v()) {
            y0Var2.O();
            y0Var = y0Var2;
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            boolean a17 = snsTemplateListData.f70078b.a();
            int i19 = z0.d.f468903a;
            z0.b bVar = z0.a.f468901m;
            int i27 = z0.t.f468922q1;
            z0.p pVar = z0.p.f468921d;
            z0.t h17 = d0.a2.h(pVar, i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aan)), 0.0f, 2, null);
            y0Var2.U(-483455358);
            d0.p pVar2 = d0.p.f225183a;
            s1.t0 a18 = d0.j0.a(d0.p.f225186d, bVar, y0Var2, 48);
            y0Var2.U(-1323940314);
            n0.h3 h3Var = androidx.compose.ui.platform.m2.f10646e;
            p2.f fVar = (p2.f) y0Var2.i(h3Var);
            p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
            androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
            u1.f fVar2 = u1.g.f423594i1;
            fVar2.getClass();
            yz5.a aVar = u1.f.f423587b;
            yz5.q a19 = s1.g0.a(h17);
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
            fVar2.getClass();
            n0.i5.a(y0Var2, a18, u1.f.f423590e);
            fVar2.getClass();
            n0.i5.a(y0Var2, fVar, u1.f.f423589d);
            fVar2.getClass();
            n0.i5.a(y0Var2, sVar, u1.f.f423591f);
            fVar2.getClass();
            n0.i5.a(y0Var2, k4Var, u1.f.f423592g);
            y0Var2.n();
            ((u0.i) a19).invoke(new n0.i4(y0Var2), y0Var2, 0);
            y0Var2.U(2058660585);
            y0Var2.U(-1163856341);
            z0.t h18 = d0.a3.h(pVar, i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aal)));
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            y0Var = y0Var2;
            b(h18, a17, 0.0f, rz0.a.b(com.tencent.mm.R.color.f478616cb, context), null, 0.0f, 0L, u0.j.b(y0Var2, -1357141178, true, new com.tencent.mm.mj_template.sns.compose.widget.n5(onClick)), y0Var2, 12582912, 116);
            java.lang.String g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.gpc);
            float f17 = 8;
            long z18 = ((p2.f) y0Var.i(h3Var)).z(((float) 1.5d) * f17);
            if (a17) {
                y0Var.U(-855378883);
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                b17 = rz0.a.b(com.tencent.mm.R.color.BW_100_Alpha_0_8, context2);
                z17 = false;
            } else {
                z17 = false;
                y0Var.U(-855378826);
                android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context3, "getContext(...)");
                b17 = rz0.a.b(com.tencent.mm.R.color.BW_100_Alpha_0_5, context3);
            }
            y0Var.o(z17);
            long j17 = b17;
            f2.r rVar = f2.r.f258818e;
            f2.r rVar2 = a17 ? f2.r.f258819f : f2.r.f258818e;
            z0.t j18 = d0.a3.j(d0.a3.g(d0.a2.j(pVar, 0.0f, ((float) 0.5d) * f17, 0.0f, 0.0f, 13, null), ((float) 4.25d) * f17), i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aao)));
            kotlin.jvm.internal.o.d(g17);
            l0.e5.c(g17, j18, j17, z18, null, rVar2, null, 0L, null, new l2.f(3), 0L, 0, false, 2, null, null, y0Var, 3072, 3072, 56784);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.mj_template.sns.compose.widget.o5(snsTemplateListData, onClick, i17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(z0.t r30, boolean r31, float r32, long r33, java.lang.String r35, float r36, long r37, yz5.p r39, n0.o r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.sns.compose.widget.a7.b(z0.t, boolean, float, long, java.lang.String, float, long, yz5.p, n0.o, int, int):void");
    }

    public static final void c(n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-526103808);
        if (i17 == 0 && y0Var.v()) {
            y0Var.O();
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            int i18 = z0.t.f468922q1;
            float f17 = 3 * 8;
            z0.t i19 = d0.a3.i(d0.a2.g(z0.p.f468921d, i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aan)), f17), 1, f17);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            z0.t c17 = a0.b.c(i19, rz0.a.b(com.tencent.mm.R.color.BW_100_Alpha_0_8, context), null, 2, null);
            y0Var.U(733328855);
            int i27 = z0.d.f468903a;
            s1.t0 c18 = d0.y.c(z0.a.f468889a, false, y0Var, 0);
            y0Var.U(-1323940314);
            p2.f fVar = (p2.f) y0Var.i(androidx.compose.ui.platform.m2.f10646e);
            p2.s sVar = (p2.s) y0Var.i(androidx.compose.ui.platform.m2.f10652k);
            androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var.i(androidx.compose.ui.platform.m2.f10656o);
            u1.f fVar2 = u1.g.f423594i1;
            fVar2.getClass();
            yz5.a aVar = u1.f.f423587b;
            yz5.q a17 = s1.g0.a(c17);
            if (!(y0Var.f333761b instanceof n0.e)) {
                n0.l.a();
                throw null;
            }
            y0Var.X();
            if (y0Var.L) {
                y0Var.j(aVar);
            } else {
                y0Var.i0();
            }
            y0Var.f333784y = false;
            fVar2.getClass();
            n0.i5.a(y0Var, c18, u1.f.f423590e);
            fVar2.getClass();
            n0.i5.a(y0Var, fVar, u1.f.f423589d);
            fVar2.getClass();
            n0.i5.a(y0Var, sVar, u1.f.f423591f);
            fVar2.getClass();
            n0.i5.a(y0Var, k4Var, u1.f.f423592g);
            y0Var.n();
            ((u0.i) a17).invoke(new n0.i4(y0Var), y0Var, 0);
            y0Var.U(2058660585);
            y0Var.U(-2137368960);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.mj_template.sns.compose.widget.x5(i17);
        }
    }

    public static final void d(n0.o oVar, int i17) {
        n0.y0 y0Var;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.V(-1129063645);
        if (i17 == 0 && y0Var2.v()) {
            y0Var2.O();
            y0Var = y0Var2;
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            int i18 = z0.d.f468903a;
            z0.b bVar = z0.a.f468901m;
            int i19 = z0.t.f468922q1;
            z0.p pVar = z0.p.f468921d;
            z0.t b17 = y1.t.b(d0.a2.h(pVar, i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aan)), 0.0f, 2, null), true, com.tencent.mm.mj_template.sns.compose.widget.y5.f70337d);
            y0Var2.U(-483455358);
            d0.p pVar2 = d0.p.f225183a;
            s1.t0 a17 = d0.j0.a(d0.p.f225186d, bVar, y0Var2, 48);
            y0Var2.U(-1323940314);
            n0.h3 h3Var = androidx.compose.ui.platform.m2.f10646e;
            p2.f fVar = (p2.f) y0Var2.i(h3Var);
            p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
            androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
            u1.f fVar2 = u1.g.f423594i1;
            fVar2.getClass();
            yz5.a aVar = u1.f.f423587b;
            yz5.q a18 = s1.g0.a(b17);
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
            fVar2.getClass();
            n0.i5.a(y0Var2, a17, u1.f.f423590e);
            fVar2.getClass();
            n0.i5.a(y0Var2, fVar, u1.f.f423589d);
            fVar2.getClass();
            n0.i5.a(y0Var2, sVar, u1.f.f423591f);
            fVar2.getClass();
            n0.i5.a(y0Var2, k4Var, u1.f.f423592g);
            y0Var2.n();
            ((u0.i) a18).invoke(new n0.i4(y0Var2), y0Var2, 0);
            y0Var2.U(2058660585);
            y0Var2.U(-1163856341);
            z0.t h17 = d0.a3.h(pVar, i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aal)));
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            long b18 = rz0.a.b(com.tencent.mm.R.color.BW_100_Alpha_0_1_2, context);
            yz5.p pVar3 = com.tencent.mm.mj_template.sns.compose.widget.n0.f70106a;
            b(h17, false, 0.0f, b18, null, 0.0f, 0L, com.tencent.mm.mj_template.sns.compose.widget.n0.f70106a, y0Var2, 12582912, 118);
            float f17 = 8;
            l0.e5.c("", d0.a3.g(d0.a2.j(pVar, 0.0f, ((float) 0.75d) * f17, 0.0f, 0.0f, 13, null), ((float) 4.25d) * f17), 0L, ((p2.f) y0Var2.i(h3Var)).z(((float) 1.5d) * f17), null, null, null, 0L, null, new l2.f(3), 0L, 0, false, 2, null, null, y0Var2, 3126, 3072, 56820);
            y0Var = y0Var2;
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.mj_template.sns.compose.widget.z5(i17);
        }
    }

    public static final void e(yz5.l lVar, n0.o oVar, int i17) {
        int i18;
        n0.r4 r4Var;
        n0.y0 y0Var;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.V(683136200);
        if ((i17 & 14) == 0) {
            i18 = (y0Var2.e(lVar) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i18 & 11) == 2 && y0Var2.v()) {
            y0Var2.O();
            y0Var = y0Var2;
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            z0.b bVar = z0.a.f468901m;
            z0.p pVar = z0.p.f468921d;
            z0.t b17 = y1.t.b(d0.a2.h(pVar, i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aan)), 0.0f, 2, null), true, com.tencent.mm.mj_template.sns.compose.widget.a6.f69847d);
            y0Var2.U(-483455358);
            s1.t0 a17 = d0.j0.a(d0.p.f225186d, bVar, y0Var2, 48);
            y0Var2.U(-1323940314);
            n0.h3 h3Var = androidx.compose.ui.platform.m2.f10646e;
            p2.f fVar = (p2.f) y0Var2.i(h3Var);
            p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
            androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
            u1.g.f423594i1.getClass();
            yz5.a aVar = u1.f.f423587b;
            yz5.q a18 = s1.g0.a(b17);
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
            n0.i5.a(y0Var2, a17, u1.f.f423590e);
            n0.i5.a(y0Var2, fVar, u1.f.f423589d);
            n0.i5.a(y0Var2, sVar, u1.f.f423591f);
            n0.i5.a(y0Var2, k4Var, u1.f.f423592g);
            y0Var2.n();
            ((u0.i) a18).invoke(new n0.i4(y0Var2), y0Var2, 0);
            y0Var2.U(2058660585);
            y0Var2.U(-1163856341);
            z0.t h17 = d0.a3.h(pVar, i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aal)));
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            b(h17, false, 0.0f, rz0.a.b(com.tencent.mm.R.color.f478517z, context), null, 0.0f, 0L, u0.j.b(y0Var2, -409804562, true, new com.tencent.mm.mj_template.sns.compose.widget.d6(lVar)), y0Var2, 12582912, 118);
            y0Var2.U(-1933240619);
            java.lang.Object y17 = y0Var2.y();
            java.lang.Object obj2 = n0.n.f333620a;
            if (y17 == obj2) {
                r4Var = null;
                y17 = n0.s4.c(java.lang.Boolean.FALSE, null, 2, null);
                y0Var2.g0(y17);
            } else {
                r4Var = null;
            }
            n0.v2 v2Var = (n0.v2) y17;
            y0Var2.o(false);
            y0Var2.U(-1933240560);
            java.lang.Object y18 = y0Var2.y();
            if (y18 == obj2) {
                y18 = n0.s4.c(java.lang.Double.valueOf(1.5d), r4Var, 2, r4Var);
                y0Var2.g0(y18);
            }
            n0.v2 v2Var2 = (n0.v2) y18;
            y0Var2.o(false);
            java.lang.String g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.g6x);
            float f17 = 8;
            long z17 = ((p2.f) y0Var2.i(h3Var)).z(((float) ((java.lang.Number) v2Var2.getValue()).doubleValue()) * f17);
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            long b18 = rz0.a.b(com.tencent.mm.R.color.BW_100_Alpha_0_5, context2);
            z0.t j17 = d0.a3.j(d0.a3.g(d0.a2.j(pVar, 0.0f, ((float) 0.75d) * f17, 0.0f, 0.0f, 13, null), ((float) 4.25d) * f17), i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aao)));
            y0Var2.U(-1933240093);
            boolean e17 = y0Var2.e(v2Var);
            java.lang.Object y19 = y0Var2.y();
            if (e17 || y19 == obj2) {
                y19 = new com.tencent.mm.mj_template.sns.compose.widget.e6(v2Var);
                y0Var2.g0(y19);
            }
            y0Var2.o(false);
            z0.t c17 = b1.j.c(j17, (yz5.l) y19);
            kotlin.jvm.internal.o.d(g17);
            l2.f fVar2 = new l2.f(3);
            y0Var2.U(-1933239994);
            boolean e18 = y0Var2.e(v2Var2) | y0Var2.e(v2Var);
            java.lang.Object y27 = y0Var2.y();
            if (e18 || y27 == obj2) {
                y27 = new com.tencent.mm.mj_template.sns.compose.widget.f6(v2Var2, v2Var);
                y0Var2.g0(y27);
            }
            y0Var2.o(false);
            y0Var = y0Var2;
            l0.e5.c(g17, c17, b18, z17, null, null, null, 0L, null, fVar2, 0L, 0, false, 0, (yz5.l) y27, null, y0Var, 0, 24576, 48624);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.mj_template.sns.compose.widget.g6(lVar, i17);
        }
    }

    public static final void f(yz5.a aVar, n0.o oVar, int i17) {
        int i18;
        n0.y0 y0Var;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.V(70243466);
        if ((i17 & 14) == 0) {
            i18 = (y0Var2.e(aVar) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i18 & 11) == 2 && y0Var2.v()) {
            y0Var2.O();
            y0Var = y0Var2;
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            i0.g a17 = i0.h.a(i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aam)));
            int i19 = z0.d.f468903a;
            z0.b bVar = z0.a.f468901m;
            int i27 = z0.t.f468922q1;
            z0.p pVar = z0.p.f468921d;
            float f17 = 8;
            z0.t b17 = y1.t.b(d0.v1.a(d0.a2.h(pVar, i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479671c8)), 0.0f, 2, null), 0, ((float) 0.5d) * f17), true, com.tencent.mm.mj_template.sns.compose.widget.h6.f69984d);
            y0Var2.U(-483455358);
            d0.p pVar2 = d0.p.f225183a;
            s1.t0 a18 = d0.j0.a(d0.p.f225186d, bVar, y0Var2, 48);
            y0Var2.U(-1323940314);
            n0.h3 h3Var = androidx.compose.ui.platform.m2.f10646e;
            p2.f fVar = (p2.f) y0Var2.i(h3Var);
            n0.h3 h3Var2 = androidx.compose.ui.platform.m2.f10652k;
            p2.s sVar = (p2.s) y0Var2.i(h3Var2);
            n0.h3 h3Var3 = androidx.compose.ui.platform.m2.f10656o;
            androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(h3Var3);
            u1.f fVar2 = u1.g.f423594i1;
            fVar2.getClass();
            yz5.a aVar2 = u1.f.f423587b;
            yz5.q a19 = s1.g0.a(b17);
            n0.e eVar = y0Var2.f333761b;
            if (!(eVar instanceof n0.e)) {
                n0.l.a();
                throw null;
            }
            y0Var2.X();
            if (y0Var2.L) {
                y0Var2.j(aVar2);
            } else {
                y0Var2.i0();
            }
            y0Var2.f333784y = false;
            fVar2.getClass();
            yz5.p pVar3 = u1.f.f423590e;
            n0.i5.a(y0Var2, a18, pVar3);
            fVar2.getClass();
            yz5.p pVar4 = u1.f.f423589d;
            n0.i5.a(y0Var2, fVar, pVar4);
            fVar2.getClass();
            yz5.p pVar5 = u1.f.f423591f;
            n0.i5.a(y0Var2, sVar, pVar5);
            fVar2.getClass();
            yz5.p pVar6 = u1.f.f423592g;
            n0.i5.a(y0Var2, k4Var, pVar6);
            y0Var2.n();
            ((u0.i) a19).invoke(new n0.i4(y0Var2), y0Var2, 0);
            y0Var2.U(2058660585);
            y0Var2.U(-1163856341);
            z0.d dVar = z0.a.f468893e;
            z0.t d17 = a0.d0.d(b1.d.a(d0.a3.h(pVar, i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aao))), a17), false, null, null, aVar, 7, null);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            z0.t c17 = a0.b.c(d17, rz0.a.b(com.tencent.mm.R.color.a6g, context), null, 2, null);
            y0Var2.U(733328855);
            s1.t0 c18 = d0.y.c(dVar, false, y0Var2, 6);
            y0Var2.U(-1323940314);
            p2.f fVar3 = (p2.f) y0Var2.i(h3Var);
            p2.s sVar2 = (p2.s) y0Var2.i(h3Var2);
            androidx.compose.ui.platform.k4 k4Var2 = (androidx.compose.ui.platform.k4) y0Var2.i(h3Var3);
            fVar2.getClass();
            yz5.q a27 = s1.g0.a(c17);
            if (!(eVar instanceof n0.e)) {
                n0.l.a();
                throw null;
            }
            y0Var2.X();
            if (y0Var2.L) {
                y0Var2.j(aVar2);
            } else {
                y0Var2.i0();
            }
            y0Var2.f333784y = false;
            fVar2.getClass();
            n0.i5.a(y0Var2, c18, pVar3);
            fVar2.getClass();
            n0.i5.a(y0Var2, fVar3, pVar4);
            fVar2.getClass();
            n0.i5.a(y0Var2, sVar2, pVar5);
            fVar2.getClass();
            n0.i5.a(y0Var2, k4Var2, pVar6);
            y0Var2.n();
            ((u0.i) a27).invoke(new n0.i4(y0Var2), y0Var2, 0);
            y0Var2.U(2058660585);
            y0Var2.U(-2137368960);
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            y0Var = y0Var2;
            a0.q1.a(rz0.a.a(com.tencent.mm.R.raw.icons_filled_arrow, rz0.a.b(com.tencent.mm.R.color.BW_100_Alpha_0_8, context2), y0Var2, 0), null, y1.t.a(d0.a3.i(pVar, i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479672c9)), i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479704cz))), com.tencent.mm.mj_template.sns.compose.widget.i6.f69995d), null, null, 0.0f, null, y0Var, 56, 120);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
            java.lang.String g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f493347ju2);
            long z17 = ((p2.f) y0Var.i(h3Var)).z(((float) 1.5d) * f17);
            android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            long b18 = rz0.a.b(com.tencent.mm.R.color.BW_100_Alpha_0_5, context3);
            int i28 = z0.t.f468922q1;
            z0.t j17 = d0.a2.j(pVar, 0.0f, 1 * f17, 0.0f, 0.0f, 13, null);
            kotlin.jvm.internal.o.d(g17);
            l0.e5.c(g17, j17, b18, z17, null, null, null, 0L, null, new l2.f(3), 0L, 0, false, 0, null, null, y0Var, com.tencent.mm.boot.BuildConfig.VERSION_CODE, 0, 65008);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
            java.lang.Object obj2 = n0.e1.f333492a;
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.mj_template.sns.compose.widget.j6(aVar, i17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x009a, code lost:
    
        if (r9 == r7) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004a, code lost:
    
        if (r6 == r7) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(com.tencent.mm.mj_template.sns.compose.widget.k5 r31, java.lang.String r32, yz5.a r33, n0.o r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.sns.compose.widget.a7.g(com.tencent.mm.mj_template.sns.compose.widget.k5, java.lang.String, yz5.a, n0.o, int, int):void");
    }

    public static final void h(com.tencent.mm.mj_template.sns.compose.widget.m7 snsTemplateListState, e0.f1 lazyListState, z0.t tVar, n0.o oVar, int i17, int i18) {
        z0.t tVar2;
        kotlin.jvm.internal.o.g(snsTemplateListState, "snsTemplateListState");
        kotlin.jvm.internal.o.g(lazyListState, "lazyListState");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-2114682211);
        if ((i18 & 4) != 0) {
            int i19 = z0.t.f468922q1;
            tVar2 = z0.p.f468921d;
        } else {
            tVar2 = tVar;
        }
        java.lang.Object obj = n0.e1.f333492a;
        java.util.List b17 = snsTemplateListState.b();
        n0.d2.e(java.lang.Integer.valueOf(lazyListState.d()), b17, new com.tencent.mm.mj_template.sns.compose.widget.p6(snsTemplateListState, lazyListState, null), y0Var, 576);
        n0.d2.e(java.lang.Boolean.valueOf(snsTemplateListState.f70103u), b17, new com.tencent.mm.mj_template.sns.compose.widget.q6(snsTemplateListState, lazyListState, null), y0Var, 576);
        e0.f.b(d0.a3.f(tVar2, 0.0f, 1, null), lazyListState, d0.a2.b(((float) 0.75d) * 8, 0.0f, 2, null), false, null, null, null, false, new com.tencent.mm.mj_template.sns.compose.widget.w6(b17, snsTemplateListState), y0Var, (i17 & 112) | 384, 248);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.mj_template.sns.compose.widget.x6(snsTemplateListState, lazyListState, tVar2, i17, i18);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(float r19, e1.a1 r20, long r21, z0.t r23, n0.o r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.sns.compose.widget.a7.i(float, e1.a1, long, z0.t, n0.o, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(z0.t r28, java.lang.String r29, n0.o r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.sns.compose.widget.a7.j(z0.t, java.lang.String, n0.o, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (r1 == r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c3, code lost:
    
        if (r2 == r3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(com.tencent.mm.mj_template.sns.compose.widget.m5 r7, yz5.l r8, yz5.l r9, yz5.a r10, n0.o r11, int r12) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.sns.compose.widget.a7.k(com.tencent.mm.mj_template.sns.compose.widget.m5, yz5.l, yz5.l, yz5.a, n0.o, int):void");
    }
}
