package com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44;

/* loaded from: classes14.dex */
public abstract class o2 {
    public static final void a(p012xc85e97e9.p093xedfae76a.y yVar, yz5.p onEvent, n0.o oVar, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onEvent, "onEvent");
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
                yVar = (p012xc85e97e9.p093xedfae76a.y) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.a1.f92038d);
            }
            y0Var.p();
            java.lang.Object obj = n0.e1.f415025a;
            n0.d2.c(yVar, new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.g1(yVar, onEvent), y0Var, 8);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.h1(yVar, onEvent, i17, i18);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(ty0.a1 r16, com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.u2 r17, p3325xe03a0797.p3326xc267989b.y0 r18, com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t0 r19, yz5.p r20, yz5.a r21, yz5.l r22, n0.o r23, int r24) {
        /*
            r1 = r16
            r2 = r17
            r3 = r18
            r10 = r20
            java.lang.String r0 = "musicSelectorTheme"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r0)
            java.lang.String r0 = "scene"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r0)
            java.lang.String r0 = "scope"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)
            java.lang.String r0 = "muteMusic"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            java.lang.String r0 = "onCancelClick"
            r11 = r21
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r11, r0)
            java.lang.String r0 = "onConfirmClick"
            r12 = r22
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r0)
            r0 = r23
            n0.y0 r0 = (n0.y0) r0
            r4 = 1703801570(0x658df2e2, float:8.379176E22)
            r0.V(r4)
            java.lang.Object r4 = n0.e1.f415025a
            r4 = 1043813919(0x3e37561f, float:0.17903946)
            r0.U(r4)
            boolean r4 = r0.e(r2)
            java.lang.Object r5 = r0.y()
            if (r4 != 0) goto L50
            int r4 = n0.o.f415162a
            java.lang.Object r4 = n0.n.f415153a
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
            com.tencent.mm.mj_template.sns.compose.widget.t2 r6 = (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t2) r6
            r4 = 0
            r0.o(r4)
            androidx.compose.ui.platform.n3 r5 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.n3.f92199a
            androidx.compose.ui.platform.b4 r5 = r5.a(r0, r4)
            com.tencent.mm.mj_template.sns.compose.widget.z1 r7 = new com.tencent.mm.mj_template.sns.compose.widget.z1
            r7.<init>(r6)
            r8 = 0
            r14 = 1
            a(r8, r7, r0, r4, r14)
            n0.h3 r4 = ty0.z0.f504575a
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
            r9.f415141d = r14
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.o2.b(ty0.a1, com.tencent.mm.mj_template.sns.compose.widget.u2, kotlinx.coroutines.y0, com.tencent.mm.mj_template.sns.compose.widget.t0, yz5.p, yz5.a, yz5.l, n0.o, int):void");
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
            java.lang.Object obj = n0.e1.f415025a;
            long z17 = ((p2.f) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e)).z(i65.a.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561101k)));
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            long b17 = rz0.a.b(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0, context);
            int i19 = z0.t.f550455q1;
            y0Var = y0Var2;
            l0.e5.c(str, d0.a2.j(z0.p.f550454d, 0.0f, 6 * 8, 0.0f, 0.0f, 13, null), b17, z17, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, y0Var, (i18 & 14) | 48, 0, 65520);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.i1(str, i17);
        }
    }

    public static final void d(n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1777298792);
        if (i17 == 0 && y0Var.v()) {
            y0Var.O();
        } else {
            java.lang.Object obj = n0.e1.f415025a;
            z0.b bVar = z0.a.f550434m;
            z0.p pVar = z0.p.f550454d;
            z0.t f17 = d0.a3.f(pVar, 0.0f, 1, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f17, "<this>");
            z0.t j17 = d0.a2.j(f17.k(d0.a3.f306599b), 0.0f, 14 * 8, 0.0f, 0.0f, 13, null);
            y0Var.U(-483455358);
            s1.t0 a17 = d0.j0.a(d0.p.f306719d, bVar, y0Var, 48);
            y0Var.U(-1323940314);
            n0.h3 h3Var = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e;
            p2.f fVar = (p2.f) y0Var.i(h3Var);
            n0.h3 h3Var2 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92185k;
            p2.s sVar = (p2.s) y0Var.i(h3Var2);
            n0.h3 h3Var3 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92189o;
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 k4Var = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4) y0Var.i(h3Var3);
            u1.g.f505127i1.getClass();
            yz5.a aVar = u1.f.f505120b;
            yz5.q a18 = s1.g0.a(j17);
            boolean z17 = y0Var.f415294b instanceof n0.e;
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
            y0Var.f415317y = false;
            yz5.p pVar2 = u1.f.f505123e;
            n0.i5.a(y0Var, a17, pVar2);
            yz5.p pVar3 = u1.f.f505122d;
            n0.i5.a(y0Var, fVar, pVar3);
            yz5.p pVar4 = u1.f.f505124f;
            n0.i5.a(y0Var, sVar, pVar4);
            yz5.p pVar5 = u1.f.f505125g;
            n0.i5.a(y0Var, k4Var, pVar5);
            y0Var.n();
            ((u0.i) a18).mo147xb9724478(new n0.i4(y0Var), y0Var, 0);
            y0Var.U(2058660585);
            y0Var.U(-1163856341);
            d0.m0 m0Var = d0.m0.f306704a;
            z0.t a19 = d0.k0.a(m0Var, pVar, 0.3f, false, 2, null);
            y0Var.U(733328855);
            z0.d dVar = z0.a.f550422a;
            s1.t0 c17 = d0.y.c(dVar, false, y0Var, 0);
            y0Var.U(-1323940314);
            p2.f fVar2 = (p2.f) y0Var.i(h3Var);
            p2.s sVar2 = (p2.s) y0Var.i(h3Var2);
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 k4Var2 = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4) y0Var.i(h3Var3);
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
            y0Var.f415317y = false;
            n0.i5.a(y0Var, c17, pVar2);
            n0.i5.a(y0Var, fVar2, pVar3);
            n0.i5.a(y0Var, sVar2, pVar4);
            n0.i5.a(y0Var, k4Var2, pVar5);
            y0Var.n();
            ((u0.i) a27).mo147xb9724478(new n0.i4(y0Var), y0Var, 0);
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
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 k4Var3 = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4) y0Var.i(h3Var3);
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
            y0Var.f415317y = false;
            n0.i5.a(y0Var, c18, pVar2);
            n0.i5.a(y0Var, fVar3, pVar3);
            n0.i5.a(y0Var, sVar3, pVar4);
            n0.i5.a(y0Var, k4Var3, pVar5);
            y0Var.n();
            ((u0.i) a29).mo147xb9724478(new n0.i4(y0Var), y0Var, 0);
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
            ((n0.l3) q17).f415141d = new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.j1(i17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0128, code lost:
    
        if (r7 == n0.n.f415153a) goto L91;
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.o2.e(float, java.lang.String, java.lang.String, yz5.a, boolean, java.lang.String, yz5.a, n0.o, int, int):void");
    }

    public static final void f(com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t2 t2Var, n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-1769087608);
        java.lang.Object obj = n0.e1.f415025a;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar = (p3325xe03a0797.p3326xc267989b.p3328x30012e.j) ((n0.q4) t2Var.f151777q).mo128745x754a37bb();
        y0Var.U(-112840763);
        p012xc85e97e9.p098xc4a6178c.p099x38a77192.e a17 = jVar == null ? null : p012xc85e97e9.p098xc4a6178c.p099x38a77192.j.a(jVar, y0Var, 8);
        y0Var.o(false);
        if (a17 == null) {
            n0.f4 q17 = y0Var.q();
            if (q17 != null) {
                ((n0.l3) q17).f415141d = new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.y1(t2Var, i17);
                return;
            }
            return;
        }
        float mo7005x9a59d0b2 = ((p2.f) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e)).mo7005x9a59d0b2();
        y0Var.U(-112840655);
        java.lang.Object y17 = y0Var.y();
        if (y17 == n0.n.f415153a) {
            y17 = n0.s4.c(null, null, 2, null);
            y0Var.g0(y17);
        }
        n0.v2 v2Var = (n0.v2) y17;
        y0Var.o(false);
        n0.d2.f(a17.d().f349726a, new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.n1(a17, v2Var, null), y0Var, 72);
        z0.t h17 = d0.a2.h(d0.a3.f(z0.p.f550454d, 0.0f, 1, null), 0.0f, i65.a.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf)), 1, null);
        boolean z17 = ((yz5.a) v2Var.mo128745x754a37bb()) != null;
        yz5.a aVar = (yz5.a) v2Var.mo128745x754a37bb();
        if (aVar == null) {
            aVar = com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.o1.f151662d;
        }
        s1.f2.b(a0.d0.d(h17, z17, null, null, aVar, 6, null), new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.w1(mo7005x9a59d0b2, t2Var, a17), y0Var, 0, 0);
        n0.f4 q18 = y0Var.q();
        if (q18 != null) {
            ((n0.l3) q18).f415141d = new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.x1(t2Var, i17);
        }
    }

    public static final void g(com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t2 t2Var, n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-2108222352);
        java.lang.Object obj = n0.e1.f415025a;
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.b4 a17 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.n3.f92199a.a(y0Var, 0);
        n0.v2 v2Var = (n0.v2) w0.g.a(new java.lang.Object[0], null, null, com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.l2.f151588d, y0Var, 3080, 6);
        y0Var.U(-25994457);
        java.lang.Object y17 = y0Var.y();
        if (y17 == n0.n.f415153a) {
            y17 = new c1.d0();
            y0Var.g0(y17);
        }
        c1.d0 d0Var = (c1.d0) y17;
        y0Var.o(false);
        z0.t a18 = b1.d.a(d0.a3.f(z0.p.f550454d, 0.0f, 1, null), i0.h.a(10));
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        z0.t a19 = c1.g0.a(a0.b.c(a18, rz0.a.b(com.p314xaae8f345.mm.R.C30859x5a72f63.f77667x8113c229, context), null, 2, null), d0Var);
        java.lang.String str = (java.lang.String) v2Var.mo128745x754a37bb();
        j0.j2 j2Var = new j0.j2(0, false, 1, 3, 3, null);
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.e2 e2Var = new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.e2(t2Var, a17, v2Var);
        j0.i2 i2Var = new j0.i2(e2Var, e2Var, e2Var, e2Var, e2Var, e2Var);
        long z17 = ((p2.f) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e)).z(i65.a.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561101k)));
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        a2.o1 o1Var = new a2.o1(rz0.a.b(com.p314xaae8f345.mm.R.C30859x5a72f63.a9z, context2), z17, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262140, null);
        android.content.Context context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        j0.k.a(str, new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.f2(t2Var, v2Var), a19, false, false, o1Var, j2Var, i2Var, true, 0, null, null, null, new e1.e1(rz0.a.b(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq, context3), null), u0.j.b(y0Var, 1741349113, true, new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.h2(v2Var)), y0Var, 100663296, 24576, 7704);
        n0.d2.f(jz5.f0.f384359a, new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.j2(d0Var, null), y0Var, 70);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k2(t2Var, i17);
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
        if ((i17 & ce1.h.f4368x366c91de) == 0) {
            i18 |= y0Var2.e(aVar2) ? 256 : 128;
        }
        int i27 = i18;
        if ((i27 & 731) == 146 && y0Var2.v()) {
            y0Var2.O();
            y0Var = y0Var2;
            i19 = i17;
            aVar3 = aVar2;
        } else {
            java.lang.Object obj = n0.e1.f415025a;
            d0.e eVar = d0.p.f306722g;
            int i28 = z0.d.f550436a;
            z0.c cVar = z0.a.f550432k;
            int i29 = z0.t.f550455q1;
            z0.p pVar = z0.p.f550454d;
            z0.t h17 = d0.a2.h(d0.a3.f(pVar, 0.0f, 1, null), 0.0f, i65.a.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561100j)), 1, null);
            y0Var2.U(693286680);
            s1.t0 a17 = d0.n2.a(eVar, cVar, y0Var2, 54);
            y0Var2.U(-1323940314);
            n0.h3 h3Var = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e;
            p2.f fVar = (p2.f) y0Var2.i(h3Var);
            p2.s sVar = (p2.s) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92185k);
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 k4Var = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92189o);
            u1.g.f505127i1.getClass();
            yz5.a aVar4 = u1.f.f505120b;
            yz5.q a18 = s1.g0.a(h17);
            if (!(y0Var2.f415294b instanceof n0.e)) {
                n0.l.a();
                throw null;
            }
            y0Var2.X();
            if (y0Var2.L) {
                y0Var2.j(aVar4);
            } else {
                y0Var2.i0();
            }
            y0Var2.f415317y = false;
            n0.i5.a(y0Var2, a17, u1.f.f505123e);
            n0.i5.a(y0Var2, fVar, u1.f.f505122d);
            n0.i5.a(y0Var2, sVar, u1.f.f505124f);
            n0.i5.a(y0Var2, k4Var, u1.f.f505125g);
            y0Var2.n();
            ((u0.i) a18).mo147xb9724478(new n0.i4(y0Var2), y0Var2, 0);
            y0Var2.U(2058660585);
            y0Var2.U(-678309503);
            z0.t d17 = a0.d0.d(pVar, false, null, null, aVar, 7, null);
            java.lang.String g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
            long z17 = ((p2.f) y0Var2.i(h3Var)).z(i65.a.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561101k)));
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            long b17 = rz0.a.b(com.p314xaae8f345.mm.R.C30859x5a72f63.a9z, context);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
            l0.e5.c(g17, d17, b17, z17, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, y0Var2, 0, 0, 65520);
            java.lang.String g18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.jma);
            long z18 = ((p2.f) y0Var2.i(h3Var)).z(i65.a.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561101k)));
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            long b18 = rz0.a.b(com.p314xaae8f345.mm.R.C30859x5a72f63.a9z, context2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g18);
            l0.e5.c(g18, null, b18, z18, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, y0Var2, 0, 0, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.SectionHeader.f55826xa5ecac51);
            tz0.f fVar2 = tz0.f.f504714e;
            boolean z19 = str.length() > 0;
            java.lang.String g19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g19, "<get-str>(...)");
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
            ((n0.l3) q17).f415141d = new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m2(str, aVar, aVar3, i19);
        }
    }

    public static final a2.d i(java.lang.String str, java.lang.String str2, long j17) {
        q26.n c17 = r26.t.c(new r26.t(new r26.t("[.*+?^{}$()|\\[\\]]").f(str2, com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.n2.f151642d)), str, 0, 2, null);
        a2.b bVar = new a2.b(0, 1, null);
        bVar.f82201a.append(str);
        q26.l lVar = new q26.l((q26.m) c17);
        while (lVar.hasNext()) {
            r26.q qVar = (r26.q) ((r26.m) lVar.next());
            bVar.a(new a2.g1(j17, 0L, (f2.r) null, (f2.p) null, (f2.q) null, (f2.h) null, (java.lang.String) null, 0L, (l2.a) null, (l2.m) null, (h2.d) null, 0L, (l2.g) null, (e1.z0) null, 16382, (p3321xbce91901.jvm.p3324x21ffc6bd.i) null), qVar.b().h().intValue(), qVar.b().g().intValue() + 1);
        }
        return bVar.e();
    }
}
