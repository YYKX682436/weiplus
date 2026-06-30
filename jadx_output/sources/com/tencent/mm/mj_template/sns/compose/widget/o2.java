package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes14.dex */
public abstract class o2 {
    public static final void a(androidx.lifecycle.y yVar, yz5.p onEvent, n0.o oVar, int i17, int i18) {
        kotlin.jvm.internal.o.g(onEvent, "onEvent");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-992749423);
        int i19 = i18 & 1;
        int i27 = i19 != 0 ? i17 | 2 : i17;
        if ((i18 & 2) != 0) {
            i27 |= 48;
        } else if ((i17 & 112) == 0) {
            i27 |= y0Var.e(onEvent) ? 32 : 16;
        }
        if (i19 == 1 && (i27 & 91) == 18 && y0Var.v()) {
            y0Var.O();
        } else {
            y0Var.Q();
            if ((i17 & 1) != 0 && !y0Var.u()) {
                y0Var.O();
            } else if (i19 != 0) {
                yVar = (androidx.lifecycle.y) y0Var.i(androidx.compose.ui.platform.a1.f10505d);
            }
            y0Var.p();
            java.lang.Object obj = n0.e1.f333492a;
            n0.d2.c(yVar, new com.tencent.mm.mj_template.sns.compose.widget.g1(yVar, onEvent), y0Var, 8);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.mj_template.sns.compose.widget.h1(yVar, onEvent, i17, i18);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(ty0.a1 r16, com.tencent.mm.mj_template.sns.compose.widget.u2 r17, kotlinx.coroutines.y0 r18, com.tencent.mm.mj_template.sns.compose.widget.t0 r19, yz5.p r20, yz5.a r21, yz5.l r22, n0.o r23, int r24) {
        /*
            r1 = r16
            r2 = r17
            r3 = r18
            r10 = r20
            java.lang.String r0 = "musicSelectorTheme"
            kotlin.jvm.internal.o.g(r1, r0)
            java.lang.String r0 = "scene"
            kotlin.jvm.internal.o.g(r2, r0)
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.String r0 = "muteMusic"
            kotlin.jvm.internal.o.g(r10, r0)
            java.lang.String r0 = "onCancelClick"
            r11 = r21
            kotlin.jvm.internal.o.g(r11, r0)
            java.lang.String r0 = "onConfirmClick"
            r12 = r22
            kotlin.jvm.internal.o.g(r12, r0)
            r0 = r23
            n0.y0 r0 = (n0.y0) r0
            r4 = 1703801570(0x658df2e2, float:8.379176E22)
            r0.V(r4)
            java.lang.Object r4 = n0.e1.f333492a
            r4 = 1043813919(0x3e37561f, float:0.17903946)
            r0.U(r4)
            boolean r4 = r0.e(r2)
            java.lang.Object r5 = r0.y()
            if (r4 != 0) goto L50
            int r4 = n0.o.f333629a
            java.lang.Object r4 = n0.n.f333620a
            if (r5 != r4) goto L4d
            goto L50
        L4d:
            r13 = r19
            goto L5a
        L50:
            com.tencent.mm.mj_template.sns.compose.widget.t2 r5 = new com.tencent.mm.mj_template.sns.compose.widget.t2
            r13 = r19
            r5.<init>(r3, r2, r10, r13)
            r0.g0(r5)
        L5a:
            r6 = r5
            com.tencent.mm.mj_template.sns.compose.widget.t2 r6 = (com.tencent.mm.mj_template.sns.compose.widget.t2) r6
            r4 = 0
            r0.o(r4)
            androidx.compose.ui.platform.n3 r5 = androidx.compose.ui.platform.n3.f10666a
            androidx.compose.ui.platform.b4 r5 = r5.a(r0, r4)
            com.tencent.mm.mj_template.sns.compose.widget.z1 r7 = new com.tencent.mm.mj_template.sns.compose.widget.z1
            r7.<init>(r6)
            r8 = 0
            r14 = 1
            a(r8, r7, r0, r4, r14)
            n0.h3 r4 = ty0.z0.f423042a
            n0.i3 r4 = r4.b(r1)
            n0.i3[] r15 = new n0.i3[]{r4}
            com.tencent.mm.mj_template.sns.compose.widget.c2 r9 = new com.tencent.mm.mj_template.sns.compose.widget.c2
            r4 = r9
            r7 = r21
            r8 = r20
            r1 = r9
            r9 = r22
            r4.<init>(r5, r6, r7, r8, r9)
            r4 = -1602431070(0xffffffffa07cd7a2, float:-2.1416577E-19)
            u0.a r1 = u0.j.b(r0, r4, r14, r1)
            r4 = 56
            n0.n1.a(r15, r1, r0, r4)
            n0.f4 r9 = r0.q()
            if (r9 == 0) goto Lb4
            com.tencent.mm.mj_template.sns.compose.widget.d2 r14 = new com.tencent.mm.mj_template.sns.compose.widget.d2
            r0 = r14
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            n0.l3 r9 = (n0.l3) r9
            r9.f333608d = r14
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.sns.compose.widget.o2.b(ty0.a1, com.tencent.mm.mj_template.sns.compose.widget.u2, kotlinx.coroutines.y0, com.tencent.mm.mj_template.sns.compose.widget.t0, yz5.p, yz5.a, yz5.l, n0.o, int):void");
    }

    public static final void c(java.lang.String str, n0.o oVar, int i17) {
        int i18;
        n0.y0 y0Var;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.V(617247122);
        if ((i17 & 14) == 0) {
            i18 = (y0Var2.e(str) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i18 & 11) == 2 && y0Var2.v()) {
            y0Var2.O();
            y0Var = y0Var2;
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            long z17 = ((p2.f) y0Var2.i(androidx.compose.ui.platform.m2.f10646e)).z(i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479568k)));
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            long b17 = rz0.a.b(com.tencent.mm.R.color.f479549ab0, context);
            int i19 = z0.t.f468922q1;
            y0Var = y0Var2;
            l0.e5.c(str, d0.a2.j(z0.p.f468921d, 0.0f, 6 * 8, 0.0f, 0.0f, 13, null), b17, z17, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, y0Var, (i18 & 14) | 48, 0, 65520);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.mj_template.sns.compose.widget.i1(str, i17);
        }
    }

    public static final void d(n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1777298792);
        if (i17 == 0 && y0Var.v()) {
            y0Var.O();
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            z0.b bVar = z0.a.f468901m;
            z0.p pVar = z0.p.f468921d;
            z0.t f17 = d0.a3.f(pVar, 0.0f, 1, null);
            kotlin.jvm.internal.o.g(f17, "<this>");
            z0.t j17 = d0.a2.j(f17.k(d0.a3.f225066b), 0.0f, 14 * 8, 0.0f, 0.0f, 13, null);
            y0Var.U(-483455358);
            s1.t0 a17 = d0.j0.a(d0.p.f225186d, bVar, y0Var, 48);
            y0Var.U(-1323940314);
            n0.h3 h3Var = androidx.compose.ui.platform.m2.f10646e;
            p2.f fVar = (p2.f) y0Var.i(h3Var);
            n0.h3 h3Var2 = androidx.compose.ui.platform.m2.f10652k;
            p2.s sVar = (p2.s) y0Var.i(h3Var2);
            n0.h3 h3Var3 = androidx.compose.ui.platform.m2.f10656o;
            androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var.i(h3Var3);
            u1.g.f423594i1.getClass();
            yz5.a aVar = u1.f.f423587b;
            yz5.q a18 = s1.g0.a(j17);
            boolean z17 = y0Var.f333761b instanceof n0.e;
            if (!z17) {
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
            yz5.p pVar2 = u1.f.f423590e;
            n0.i5.a(y0Var, a17, pVar2);
            yz5.p pVar3 = u1.f.f423589d;
            n0.i5.a(y0Var, fVar, pVar3);
            yz5.p pVar4 = u1.f.f423591f;
            n0.i5.a(y0Var, sVar, pVar4);
            yz5.p pVar5 = u1.f.f423592g;
            n0.i5.a(y0Var, k4Var, pVar5);
            y0Var.n();
            ((u0.i) a18).invoke(new n0.i4(y0Var), y0Var, 0);
            y0Var.U(2058660585);
            y0Var.U(-1163856341);
            d0.m0 m0Var = d0.m0.f225171a;
            z0.t a19 = d0.k0.a(m0Var, pVar, 0.3f, false, 2, null);
            y0Var.U(733328855);
            z0.d dVar = z0.a.f468889a;
            s1.t0 c17 = d0.y.c(dVar, false, y0Var, 0);
            y0Var.U(-1323940314);
            p2.f fVar2 = (p2.f) y0Var.i(h3Var);
            p2.s sVar2 = (p2.s) y0Var.i(h3Var2);
            androidx.compose.ui.platform.k4 k4Var2 = (androidx.compose.ui.platform.k4) y0Var.i(h3Var3);
            yz5.q a27 = s1.g0.a(a19);
            if (!z17) {
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
            n0.i5.a(y0Var, c17, pVar2);
            n0.i5.a(y0Var, fVar2, pVar3);
            n0.i5.a(y0Var, sVar2, pVar4);
            n0.i5.a(y0Var, k4Var2, pVar5);
            y0Var.n();
            ((u0.i) a27).invoke(new n0.i4(y0Var), y0Var, 0);
            y0Var.U(2058660585);
            y0Var.U(-2137368960);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
            tz0.e.a(null, null, null, y0Var, 0, 7);
            z0.t a28 = d0.k0.a(m0Var, pVar, 0.7f, false, 2, null);
            y0Var.U(733328855);
            s1.t0 c18 = d0.y.c(dVar, false, y0Var, 0);
            y0Var.U(-1323940314);
            p2.f fVar3 = (p2.f) y0Var.i(h3Var);
            p2.s sVar3 = (p2.s) y0Var.i(h3Var2);
            androidx.compose.ui.platform.k4 k4Var3 = (androidx.compose.ui.platform.k4) y0Var.i(h3Var3);
            yz5.q a29 = s1.g0.a(a28);
            if (!z17) {
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
            n0.i5.a(y0Var, c18, pVar2);
            n0.i5.a(y0Var, fVar3, pVar3);
            n0.i5.a(y0Var, sVar3, pVar4);
            n0.i5.a(y0Var, k4Var3, pVar5);
            y0Var.n();
            ((u0.i) a29).invoke(new n0.i4(y0Var), y0Var, 0);
            y0Var.U(2058660585);
            y0Var.U(-2137368960);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.mj_template.sns.compose.widget.j1(i17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0128, code lost:
    
        if (r7 == n0.n.f333620a) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(float r29, java.lang.String r30, java.lang.String r31, yz5.a r32, boolean r33, java.lang.String r34, yz5.a r35, n0.o r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.sns.compose.widget.o2.e(float, java.lang.String, java.lang.String, yz5.a, boolean, java.lang.String, yz5.a, n0.o, int, int):void");
    }

    public static final void f(com.tencent.mm.mj_template.sns.compose.widget.t2 t2Var, n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-1769087608);
        java.lang.Object obj = n0.e1.f333492a;
        kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) ((n0.q4) t2Var.f70244q).getValue();
        y0Var.U(-112840763);
        androidx.paging.compose.e a17 = jVar == null ? null : androidx.paging.compose.j.a(jVar, y0Var, 8);
        y0Var.o(false);
        if (a17 == null) {
            n0.f4 q17 = y0Var.q();
            if (q17 != null) {
                ((n0.l3) q17).f333608d = new com.tencent.mm.mj_template.sns.compose.widget.y1(t2Var, i17);
                return;
            }
            return;
        }
        float density = ((p2.f) y0Var.i(androidx.compose.ui.platform.m2.f10646e)).getDensity();
        y0Var.U(-112840655);
        java.lang.Object y17 = y0Var.y();
        if (y17 == n0.n.f333620a) {
            y17 = n0.s4.c(null, null, 2, null);
            y0Var.g0(y17);
        }
        n0.v2 v2Var = (n0.v2) y17;
        y0Var.o(false);
        n0.d2.f(a17.d().f268193a, new com.tencent.mm.mj_template.sns.compose.widget.n1(a17, v2Var, null), y0Var, 72);
        z0.t h17 = d0.a2.h(d0.a3.f(z0.p.f468921d, 0.0f, 1, null), 0.0f, i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479866hf)), 1, null);
        boolean z17 = ((yz5.a) v2Var.getValue()) != null;
        yz5.a aVar = (yz5.a) v2Var.getValue();
        if (aVar == null) {
            aVar = com.tencent.mm.mj_template.sns.compose.widget.o1.f70129d;
        }
        s1.f2.b(a0.d0.d(h17, z17, null, null, aVar, 6, null), new com.tencent.mm.mj_template.sns.compose.widget.w1(density, t2Var, a17), y0Var, 0, 0);
        n0.f4 q18 = y0Var.q();
        if (q18 != null) {
            ((n0.l3) q18).f333608d = new com.tencent.mm.mj_template.sns.compose.widget.x1(t2Var, i17);
        }
    }

    public static final void g(com.tencent.mm.mj_template.sns.compose.widget.t2 t2Var, n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-2108222352);
        java.lang.Object obj = n0.e1.f333492a;
        androidx.compose.ui.platform.b4 a17 = androidx.compose.ui.platform.n3.f10666a.a(y0Var, 0);
        n0.v2 v2Var = (n0.v2) w0.g.a(new java.lang.Object[0], null, null, com.tencent.mm.mj_template.sns.compose.widget.l2.f70055d, y0Var, 3080, 6);
        y0Var.U(-25994457);
        java.lang.Object y17 = y0Var.y();
        if (y17 == n0.n.f333620a) {
            y17 = new c1.d0();
            y0Var.g0(y17);
        }
        c1.d0 d0Var = (c1.d0) y17;
        y0Var.o(false);
        z0.t a18 = b1.d.a(d0.a3.f(z0.p.f468921d, 0.0f, 1, null), i0.h.a(10));
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        z0.t a19 = c1.g0.a(a0.b.c(a18, rz0.a.b(com.tencent.mm.R.color.BW_100_Alpha_0_1, context), null, 2, null), d0Var);
        java.lang.String str = (java.lang.String) v2Var.getValue();
        j0.j2 j2Var = new j0.j2(0, false, 1, 3, 3, null);
        com.tencent.mm.mj_template.sns.compose.widget.e2 e2Var = new com.tencent.mm.mj_template.sns.compose.widget.e2(t2Var, a17, v2Var);
        j0.i2 i2Var = new j0.i2(e2Var, e2Var, e2Var, e2Var, e2Var, e2Var);
        long z17 = ((p2.f) y0Var.i(androidx.compose.ui.platform.m2.f10646e)).z(i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479568k)));
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        a2.o1 o1Var = new a2.o1(rz0.a.b(com.tencent.mm.R.color.a9z, context2), z17, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262140, null);
        android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        j0.k.a(str, new com.tencent.mm.mj_template.sns.compose.widget.f2(t2Var, v2Var), a19, false, false, o1Var, j2Var, i2Var, true, 0, null, null, null, new e1.e1(rz0.a.b(com.tencent.mm.R.color.aaq, context3), null), u0.j.b(y0Var, 1741349113, true, new com.tencent.mm.mj_template.sns.compose.widget.h2(v2Var)), y0Var, 100663296, 24576, 7704);
        n0.d2.f(jz5.f0.f302826a, new com.tencent.mm.mj_template.sns.compose.widget.j2(d0Var, null), y0Var, 70);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.mj_template.sns.compose.widget.k2(t2Var, i17);
        }
    }

    public static final void h(java.lang.String str, yz5.a aVar, yz5.a aVar2, n0.o oVar, int i17) {
        int i18;
        n0.y0 y0Var;
        int i19;
        yz5.a aVar3;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.V(-721510651);
        if ((i17 & 14) == 0) {
            i18 = (y0Var2.e(str) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 112) == 0) {
            i18 |= y0Var2.e(aVar) ? 32 : 16;
        }
        if ((i17 & ce1.h.CTRL_INDEX) == 0) {
            i18 |= y0Var2.e(aVar2) ? 256 : 128;
        }
        int i27 = i18;
        if ((i27 & 731) == 146 && y0Var2.v()) {
            y0Var2.O();
            y0Var = y0Var2;
            i19 = i17;
            aVar3 = aVar2;
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            d0.e eVar = d0.p.f225189g;
            int i28 = z0.d.f468903a;
            z0.c cVar = z0.a.f468899k;
            int i29 = z0.t.f468922q1;
            z0.p pVar = z0.p.f468921d;
            z0.t h17 = d0.a2.h(d0.a3.f(pVar, 0.0f, 1, null), 0.0f, i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479567j)), 1, null);
            y0Var2.U(693286680);
            s1.t0 a17 = d0.n2.a(eVar, cVar, y0Var2, 54);
            y0Var2.U(-1323940314);
            n0.h3 h3Var = androidx.compose.ui.platform.m2.f10646e;
            p2.f fVar = (p2.f) y0Var2.i(h3Var);
            p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
            androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
            u1.g.f423594i1.getClass();
            yz5.a aVar4 = u1.f.f423587b;
            yz5.q a18 = s1.g0.a(h17);
            if (!(y0Var2.f333761b instanceof n0.e)) {
                n0.l.a();
                throw null;
            }
            y0Var2.X();
            if (y0Var2.L) {
                y0Var2.j(aVar4);
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
            y0Var2.U(-678309503);
            z0.t d17 = a0.d0.d(pVar, false, null, null, aVar, 7, null);
            java.lang.String g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490347sg);
            long z17 = ((p2.f) y0Var2.i(h3Var)).z(i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479568k)));
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            long b17 = rz0.a.b(com.tencent.mm.R.color.a9z, context);
            kotlin.jvm.internal.o.d(g17);
            l0.e5.c(g17, d17, b17, z17, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, y0Var2, 0, 0, 65520);
            java.lang.String g18 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.jma);
            long z18 = ((p2.f) y0Var2.i(h3Var)).z(i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479568k)));
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            long b18 = rz0.a.b(com.tencent.mm.R.color.a9z, context2);
            kotlin.jvm.internal.o.d(g18);
            l0.e5.c(g18, null, b18, z18, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, y0Var2, 0, 0, com.tencent.tinker.loader.shareutil.ShareElfFile.SectionHeader.SHN_COMMON);
            tz0.f fVar2 = tz0.f.f423181e;
            boolean z19 = str.length() > 0;
            java.lang.String g19 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490441v5);
            kotlin.jvm.internal.o.f(g19, "<get-str>(...)");
            y0Var = y0Var2;
            boolean z27 = z19;
            i19 = i17;
            aVar3 = aVar2;
            tz0.c.a(aVar2, null, fVar2, null, z27, g19, null, y0Var, ((i27 >> 6) & 14) | 0, 74);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.mj_template.sns.compose.widget.m2(str, aVar, aVar3, i19);
        }
    }

    public static final a2.d i(java.lang.String str, java.lang.String str2, long j17) {
        q26.n c17 = r26.t.c(new r26.t(new r26.t("[.*+?^{}$()|\\[\\]]").f(str2, com.tencent.mm.mj_template.sns.compose.widget.n2.f70109d)), str, 0, 2, null);
        a2.b bVar = new a2.b(0, 1, null);
        bVar.f668a.append(str);
        q26.l lVar = new q26.l((q26.m) c17);
        while (lVar.hasNext()) {
            r26.q qVar = (r26.q) ((r26.m) lVar.next());
            bVar.a(new a2.g1(j17, 0L, (f2.r) null, (f2.p) null, (f2.q) null, (f2.h) null, (java.lang.String) null, 0L, (l2.a) null, (l2.m) null, (h2.d) null, 0L, (l2.g) null, (e1.z0) null, 16382, (kotlin.jvm.internal.i) null), qVar.b().h().intValue(), qVar.b().g().intValue() + 1);
        }
        return bVar.e();
    }
}
