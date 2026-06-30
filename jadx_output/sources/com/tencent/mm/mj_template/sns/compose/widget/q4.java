package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes14.dex */
public abstract class q4 {
    public static final void a(com.tencent.mm.mj_template.sns.compose.widget.c1 c1Var, n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-142806567);
        java.lang.Object obj = n0.e1.f333492a;
        androidx.paging.compose.e a17 = androidx.paging.compose.j.a(c1Var.f69886q, y0Var, 8);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMoreTemplateWidget", "GridFlow: pageData.itemCount=" + a17.c() + ", isFirstPageDataLoaded=" + c1Var.f69889t + ", state: " + a17.d().f268196d);
        if (a17.c() == 0 && c1Var.f69889t) {
            n0.f4 q17 = y0Var.q();
            if (q17 != null) {
                ((n0.l3) q17).f333608d = new com.tencent.mm.mj_template.sns.compose.widget.v2(c1Var, i17);
                return;
            }
            return;
        }
        y0Var.U(773894976);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        int i18 = n0.o.f333629a;
        java.lang.Object obj2 = n0.n.f333620a;
        if (y17 == obj2) {
            n0.o1 o1Var = new n0.o1(n0.d2.i(oz5.m.f350329d, y0Var));
            y0Var.g0(o1Var);
            y17 = o1Var;
        }
        y0Var.o(false);
        kotlinx.coroutines.y0 y0Var2 = ((n0.o1) y17).f333631d;
        y0Var.o(false);
        float c17 = i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aaq));
        com.tencent.mm.mj_template.sns.compose.widget.n3 n3Var = new com.tencent.mm.mj_template.sns.compose.widget.n3(y0Var2, c1Var);
        com.tencent.mm.mj_template.sns.compose.widget.l3 l3Var = new com.tencent.mm.mj_template.sns.compose.widget.l3(c1Var);
        y0Var.U(537092352);
        z.d0 a18 = y.z1.a(y0Var, 0);
        y0Var.U(-769244795);
        boolean e17 = y0Var.e(a18);
        java.lang.Object y18 = y0Var.y();
        if (e17 || y18 == obj2) {
            y18 = new kz0.f(a18, 3000.0f);
            y0Var.g0(y18);
        }
        kz0.f fVar = (kz0.f) y18;
        y0Var.o(false);
        y0Var.o(false);
        f0.r1 r1Var = c1Var.f69885p;
        f0.b bVar = new f0.b(c1Var.f69887r);
        d0.p pVar = d0.p.f225183a;
        f0.i.a(bVar, null, r1Var, d0.a2.c(c17, i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aas)), c17, i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aap))), false, pVar.g(i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aar))), pVar.g(c17), fVar, false, new com.tencent.mm.mj_template.sns.compose.widget.j3(a17, c1Var, n3Var, l3Var), y0Var, 0, 274);
        n0.f4 q18 = y0Var.q();
        if (q18 != null) {
            ((n0.l3) q18).f333608d = new com.tencent.mm.mj_template.sns.compose.widget.k3(c1Var, i17);
        }
    }

    public static final void b(boolean z17, yz5.a aVar, yz5.a aVar2, n0.o oVar, int i17) {
        int i18;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1079108760);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.f(z17) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 112) == 0) {
            i18 |= y0Var.e(aVar) ? 32 : 16;
        }
        if ((i17 & ce1.h.CTRL_INDEX) == 0) {
            i18 |= y0Var.e(aVar2) ? 256 : 128;
        }
        if ((i18 & 731) == 146 && y0Var.v()) {
            y0Var.O();
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            java.lang.String g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.b7j);
            kotlin.jvm.internal.o.f(g17, "<get-str>(...)");
            int i19 = i18 << 9;
            com.tencent.mm.mj_template.sns.compose.widget.p.b(g17, null, null, z17, aVar, aVar2, y0Var, (i19 & 7168) | (57344 & i19) | (i19 & 458752), 6);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.mj_template.sns.compose.widget.o3(z17, aVar, aVar2, i17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        if (r6 == n0.n.f333620a) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(float r25, yz5.a r26, yz5.l r27, n0.o r28, int r29) {
        /*
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r29
            r15 = r28
            n0.y0 r15 = (n0.y0) r15
            r4 = -1114751031(0xffffffffbd8e3fc9, float:-0.0694576)
            r15.V(r4)
            r4 = r3 & 14
            if (r4 != 0) goto L21
            boolean r4 = r15.b(r0)
            if (r4 == 0) goto L1e
            r4 = 4
            goto L1f
        L1e:
            r4 = 2
        L1f:
            r4 = r4 | r3
            goto L22
        L21:
            r4 = r3
        L22:
            r5 = r3 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L32
            boolean r5 = r15.e(r1)
            if (r5 == 0) goto L2f
            r5 = 32
            goto L31
        L2f:
            r5 = 16
        L31:
            r4 = r4 | r5
        L32:
            r5 = r3 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L42
            boolean r5 = r15.e(r2)
            if (r5 == 0) goto L3f
            r5 = 256(0x100, float:3.59E-43)
            goto L41
        L3f:
            r5 = 128(0x80, float:1.8E-43)
        L41:
            r4 = r4 | r5
        L42:
            r4 = r4 & 731(0x2db, float:1.024E-42)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 != r5) goto L55
            boolean r4 = r15.v()
            if (r4 != 0) goto L4f
            goto L55
        L4f:
            r15.O()
            r24 = r15
            goto Lbd
        L55:
            java.lang.Object r4 = n0.e1.f333492a
            int r4 = z0.t.f468922q1
            z0.p r4 = z0.p.f468921d
            r5 = 0
            r6 = 0
            r13 = 1
            z0.t r4 = d0.a3.f(r4, r5, r13, r6)
            z0.t r4 = d0.a3.g(r4, r0)
            r5 = -580547593(0xffffffffdd658bf7, float:-1.0337866E18)
            r15.U(r5)
            boolean r5 = r15.e(r1)
            java.lang.Object r6 = r15.y()
            if (r5 != 0) goto L7c
            int r5 = n0.o.f333629a
            java.lang.Object r5 = n0.n.f333620a
            if (r6 != r5) goto L84
        L7c:
            com.tencent.mm.mj_template.sns.compose.widget.p3 r6 = new com.tencent.mm.mj_template.sns.compose.widget.p3
            r6.<init>(r1)
            r15.g0(r6)
        L84:
            yz5.l r6 = (yz5.l) r6
            r5 = 0
            r15.o(r5)
            z0.t r4 = s1.h1.a(r4, r6)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r16 = 0
            r5 = r13
            r13 = r16
            r6 = r15
            r15 = r16
            r17 = 0
            com.tencent.mm.mj_template.sns.compose.widget.s3 r7 = new com.tencent.mm.mj_template.sns.compose.widget.s3
            r7.<init>(r2)
            r8 = -609274306(0xffffffffdbaf363e, float:-9.863552E16)
            u0.a r19 = u0.j.b(r6, r8, r5, r7)
            r21 = 0
            r22 = 48
            r23 = 2046(0x7fe, float:2.867E-42)
            r20 = r6
            r24 = r6
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            j(r4, r5, r6, r7, r8, r9, r10, r11, r13, r15, r17, r19, r20, r21, r22, r23)
        Lbd:
            n0.f4 r4 = r24.q()
            if (r4 == 0) goto Lcc
            com.tencent.mm.mj_template.sns.compose.widget.t3 r5 = new com.tencent.mm.mj_template.sns.compose.widget.t3
            r5.<init>(r0, r1, r2, r3)
            n0.l3 r4 = (n0.l3) r4
            r4.f333608d = r5
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.sns.compose.widget.q4.c(float, yz5.a, yz5.l, n0.o, int):void");
    }

    public static final void d(com.tencent.mm.mj_template.sns.compose.widget.e5 e5Var, float f17, yz5.l lVar, yz5.l lVar2, yz5.l lVar3, n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(499338491);
        java.lang.Object obj = n0.e1.f333492a;
        com.tencent.maas.model.MJTemplateInfo mJTemplateInfo = e5Var.f69947p;
        boolean a17 = e5Var.f70078b.a();
        y0Var.U(-746647058);
        java.lang.Object y17 = y0Var.y();
        int i18 = n0.o.f333629a;
        java.lang.Object obj2 = n0.n.f333620a;
        if (y17 == obj2) {
            y17 = n0.s4.c(java.lang.Boolean.FALSE, null, 2, null);
            y0Var.g0(y17);
        }
        n0.v2 v2Var = (n0.v2) y17;
        y0Var.o(false);
        float floatValue = ((java.lang.Number) e5Var.f70033j.getValue()).floatValue();
        android.content.Context context = (android.content.Context) y0Var.i(androidx.compose.ui.platform.a1.f10503b);
        int i19 = z0.t.f468922q1;
        z0.p pVar = z0.p.f468921d;
        y0Var.U(-746646829);
        boolean f18 = y0Var.f(a17);
        java.lang.Object y18 = y0Var.y();
        if (f18 || y18 == obj2) {
            y18 = new com.tencent.mm.mj_template.sns.compose.widget.w3(a17);
            y0Var.g0(y18);
        }
        y0Var.o(false);
        z0.t b17 = p1.x0.b(y1.t.b(pVar, true, (yz5.l) y18), jz5.f0.f302826a, new com.tencent.mm.mj_template.sns.compose.widget.z3(e5Var, context, lVar, null));
        y0Var.U(-483455358);
        d0.p pVar2 = d0.p.f225183a;
        d0.l lVar4 = d0.p.f225186d;
        int i27 = z0.d.f468903a;
        s1.t0 a18 = d0.j0.a(lVar4, z0.a.f468900l, y0Var, 0);
        y0Var.U(-1323940314);
        p2.f fVar = (p2.f) y0Var.i(androidx.compose.ui.platform.m2.f10646e);
        p2.s sVar = (p2.s) y0Var.i(androidx.compose.ui.platform.m2.f10652k);
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var.i(androidx.compose.ui.platform.m2.f10656o);
        u1.f fVar2 = u1.g.f423594i1;
        fVar2.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a19 = s1.g0.a(b17);
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
        n0.i5.a(y0Var, a18, u1.f.f423590e);
        fVar2.getClass();
        n0.i5.a(y0Var, fVar, u1.f.f423589d);
        fVar2.getClass();
        n0.i5.a(y0Var, sVar, u1.f.f423591f);
        fVar2.getClass();
        n0.i5.a(y0Var, k4Var, u1.f.f423592g);
        y0Var.n();
        ((u0.i) a19).invoke(new n0.i4(y0Var), y0Var, 0);
        y0Var.U(2058660585);
        y0Var.U(-1163856341);
        j(d0.a3.g(d0.a3.f(pVar, 0.0f, 1, null), f17), a17, floatValue, 0.0f, 0.0f, 0.0f, 0.0f, 0L, 0L, 0L, 0L, u0.j.b(y0Var, -2035372836, true, new com.tencent.mm.mj_template.sns.compose.widget.c4(mJTemplateInfo, v2Var, lVar2, lVar3, e5Var)), y0Var, 0, 48, 2040);
        java.lang.String displayName = mJTemplateInfo.getDisplayName();
        if (displayName == null) {
            displayName = "";
        }
        h(displayName, y0Var, 0);
        y0Var.o(false);
        y0Var.o(false);
        y0Var.o(true);
        y0Var.o(false);
        y0Var.o(false);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.mj_template.sns.compose.widget.d4(e5Var, f17, lVar, lVar2, lVar3, i17);
        }
    }

    public static final void e(n0.o oVar, int i17) {
        n0.y0 y0Var;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.V(-774763542);
        if (i17 == 0 && y0Var2.v()) {
            y0Var2.O();
            y0Var = y0Var2;
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            int i18 = z0.t.f468922q1;
            z0.p pVar = z0.p.f468921d;
            float f17 = 8;
            z0.t f18 = d0.a3.f(d0.a3.g(pVar, 2 * f17), 0.0f, 1, null);
            y0Var2.U(733328855);
            int i19 = z0.d.f468903a;
            s1.t0 c17 = d0.y.c(z0.a.f468889a, false, y0Var2, 0);
            y0Var2.U(-1323940314);
            n0.h3 h3Var = androidx.compose.ui.platform.m2.f10646e;
            p2.f fVar = (p2.f) y0Var2.i(h3Var);
            n0.h3 h3Var2 = androidx.compose.ui.platform.m2.f10652k;
            p2.s sVar = (p2.s) y0Var2.i(h3Var2);
            n0.h3 h3Var3 = androidx.compose.ui.platform.m2.f10656o;
            androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(h3Var3);
            u1.f fVar2 = u1.g.f423594i1;
            fVar2.getClass();
            yz5.a aVar = u1.f.f423587b;
            yz5.q a17 = s1.g0.a(f18);
            n0.e eVar = y0Var2.f333761b;
            if (!(eVar instanceof n0.e)) {
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
            yz5.p pVar2 = u1.f.f423590e;
            n0.i5.a(y0Var2, c17, pVar2);
            fVar2.getClass();
            yz5.p pVar3 = u1.f.f423589d;
            n0.i5.a(y0Var2, fVar, pVar3);
            fVar2.getClass();
            yz5.p pVar4 = u1.f.f423591f;
            n0.i5.a(y0Var2, sVar, pVar4);
            fVar2.getClass();
            yz5.p pVar5 = u1.f.f423592g;
            n0.i5.a(y0Var2, k4Var, pVar5);
            y0Var2.n();
            ((u0.i) a17).invoke(new n0.i4(y0Var2), y0Var2, 0);
            y0Var2.U(2058660585);
            y0Var2.U(-2137368960);
            z0.d dVar = z0.a.f468893e;
            boolean z17 = androidx.compose.ui.platform.f3.f10562a;
            androidx.compose.ui.platform.e3 e3Var = androidx.compose.ui.platform.e3.f10553d;
            d0.q qVar = new d0.q(dVar, false, e3Var);
            pVar.k(qVar);
            y0Var2.U(693286680);
            d0.p pVar6 = d0.p.f225183a;
            s1.t0 a18 = d0.n2.a(d0.p.f225184b, z0.a.f468898j, y0Var2, 0);
            y0Var2.U(-1323940314);
            p2.f fVar3 = (p2.f) y0Var2.i(h3Var);
            p2.s sVar2 = (p2.s) y0Var2.i(h3Var2);
            androidx.compose.ui.platform.k4 k4Var2 = (androidx.compose.ui.platform.k4) y0Var2.i(h3Var3);
            fVar2.getClass();
            yz5.q a19 = s1.g0.a(qVar);
            if (!(eVar instanceof n0.e)) {
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
            n0.i5.a(y0Var2, a18, pVar2);
            fVar2.getClass();
            n0.i5.a(y0Var2, fVar3, pVar3);
            fVar2.getClass();
            n0.i5.a(y0Var2, sVar2, pVar4);
            fVar2.getClass();
            n0.i5.a(y0Var2, k4Var2, pVar5);
            y0Var2.n();
            ((u0.i) a19).invoke(new n0.i4(y0Var2), y0Var2, 0);
            y0Var2.U(2058660585);
            y0Var2.U(-678309503);
            tz0.l lVar = tz0.l.f423196h;
            tz0.k kVar = tz0.k.f423192d;
            int i27 = z0.t.f468922q1;
            z0.t g17 = d0.a3.g(pVar, ((float) 1.5d) * f17);
            int i28 = z0.d.f468903a;
            z0.c cVar = z0.a.f468899k;
            kotlin.jvm.internal.o.g(g17, "<this>");
            boolean z18 = androidx.compose.ui.platform.f3.f10562a;
            tz0.e.a(g17.k(new d0.j3(cVar, e3Var)), lVar, kVar, y0Var2, com.tencent.wxmm.v2helper.EMethodSetSendToNetworkOn, 0);
            d0.e3.a(d0.a3.j(pVar, ((float) 0.5d) * f17), y0Var2, 6);
            java.lang.String g18 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.ggc);
            long z19 = ((p2.f) y0Var2.i(h3Var)).z(i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479672c9)));
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            long b17 = rz0.a.b(com.tencent.mm.R.color.BW_0_Alpha_0_5, context);
            kotlin.jvm.internal.o.d(g18);
            y0Var = y0Var2;
            l0.e5.c(g18, null, b17, z19, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, y0Var, 0, 0, com.tencent.tinker.loader.shareutil.ShareElfFile.SectionHeader.SHN_COMMON);
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
            java.lang.Object obj2 = n0.e1.f333492a;
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.mj_template.sns.compose.widget.e4(i17);
        }
    }

    public static final void f(n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(284840963);
        if (i17 == 0 && y0Var.v()) {
            y0Var.O();
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            long b17 = rz0.a.b(com.tencent.mm.R.color.BW_0_Alpha_0_5, context);
            d0.p pVar = d0.p.f225183a;
            d0.e eVar = d0.p.f225188f;
            int i18 = z0.d.f468903a;
            z0.c cVar = z0.a.f468899k;
            int i19 = z0.t.f468922q1;
            z0.p pVar2 = z0.p.f468921d;
            float f17 = 8;
            z0.t h17 = d0.a2.h(d0.a3.f(pVar2, 0.0f, 1, null), 0.0f, 2 * f17, 1, null);
            y0Var.U(693286680);
            s1.t0 a17 = d0.n2.a(eVar, cVar, y0Var, 54);
            y0Var.U(-1323940314);
            p2.f fVar = (p2.f) y0Var.i(androidx.compose.ui.platform.m2.f10646e);
            p2.s sVar = (p2.s) y0Var.i(androidx.compose.ui.platform.m2.f10652k);
            androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var.i(androidx.compose.ui.platform.m2.f10656o);
            u1.f fVar2 = u1.g.f423594i1;
            fVar2.getClass();
            yz5.a aVar = u1.f.f423587b;
            yz5.q a18 = s1.g0.a(h17);
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
            n0.i5.a(y0Var, a17, u1.f.f423590e);
            fVar2.getClass();
            n0.i5.a(y0Var, fVar, u1.f.f423589d);
            fVar2.getClass();
            n0.i5.a(y0Var, sVar, u1.f.f423591f);
            fVar2.getClass();
            n0.i5.a(y0Var, k4Var, u1.f.f423592g);
            y0Var.n();
            ((u0.i) a18).invoke(new n0.i4(y0Var), y0Var, 0);
            y0Var.U(2058660585);
            y0Var.U(-678309503);
            float f18 = 3 * f17;
            float f19 = ((float) 0.15d) * f17;
            d0.e3.a(a0.b.c(d0.a3.g(d0.a3.j(pVar2, f18), f19), b17, null, 2, null), y0Var, 0);
            float f27 = 1 * f17;
            d0.e3.a(a0.b.b(d0.a3.h(d0.a2.j(pVar2, f27, 0.0f, f27, 0.0f, 10, null), ((float) 0.38d) * f17), b17, i0.h.f286493a), y0Var, 0);
            d0.e3.a(a0.b.c(d0.a3.g(d0.a3.j(pVar2, f18), f19), b17, null, 2, null), y0Var, 0);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.mj_template.sns.compose.widget.f4(i17);
        }
    }

    public static final void g(com.tencent.mm.mj_template.sns.compose.widget.c1 moreTemplateBottomSheetState, n0.o oVar, int i17) {
        kotlin.jvm.internal.o.g(moreTemplateBottomSheetState, "moreTemplateBottomSheetState");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-1127761670);
        java.lang.Object obj = n0.e1.f333492a;
        f.l.a(moreTemplateBottomSheetState.f69894y && !moreTemplateBottomSheetState.f69893x, new com.tencent.mm.mj_template.sns.compose.widget.i4(moreTemplateBottomSheetState), y0Var, 0, 0);
        z0.b bVar = z0.a.f468901m;
        z0.t e17 = d0.a3.e(z0.p.f468921d, 0.0f, 1, null);
        y0Var.U(-483455358);
        s1.t0 a17 = d0.j0.a(d0.p.f225186d, bVar, y0Var, 48);
        y0Var.U(-1323940314);
        p2.f fVar = (p2.f) y0Var.i(androidx.compose.ui.platform.m2.f10646e);
        p2.s sVar = (p2.s) y0Var.i(androidx.compose.ui.platform.m2.f10652k);
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var.i(androidx.compose.ui.platform.m2.f10656o);
        u1.g.f423594i1.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a18 = s1.g0.a(e17);
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
        n0.i5.a(y0Var, a17, u1.f.f423590e);
        n0.i5.a(y0Var, fVar, u1.f.f423589d);
        n0.i5.a(y0Var, sVar, u1.f.f423591f);
        n0.i5.a(y0Var, k4Var, u1.f.f423592g);
        y0Var.n();
        ((u0.i) a18).invoke(new n0.i4(y0Var), y0Var, 0);
        y0Var.U(2058660585);
        y0Var.U(-1163856341);
        b(((java.lang.Boolean) ((n0.q4) moreTemplateBottomSheetState.f69883n).getValue()).booleanValue(), new com.tencent.mm.mj_template.sns.compose.widget.j4(moreTemplateBottomSheetState), new com.tencent.mm.mj_template.sns.compose.widget.k4(moreTemplateBottomSheetState), y0Var, 0);
        y0Var.U(652090783);
        if (!(!moreTemplateBottomSheetState.f69894y || moreTemplateBottomSheetState.f69893x)) {
            a(moreTemplateBottomSheetState, y0Var, 8);
        }
        y0Var.o(false);
        y0Var.o(false);
        y0Var.o(false);
        y0Var.o(true);
        y0Var.o(false);
        y0Var.o(false);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.mj_template.sns.compose.widget.l4(moreTemplateBottomSheetState, i17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(java.lang.String r27, n0.o r28, int r29) {
        /*
            r7 = r27
            r4 = r29
            r5 = r28
            n0.y0 r5 = (n0.y0) r5
            r0 = -1302275180(0xffffffffb260db94, float:-1.3088442E-8)
            r5.V(r0)
            r0 = r4 & 14
            r1 = 2
            if (r0 != 0) goto L1e
            boolean r0 = r5.e(r7)
            if (r0 == 0) goto L1b
            r0 = 4
            goto L1c
        L1b:
            r0 = r1
        L1c:
            r0 = r0 | r4
            goto L1f
        L1e:
            r0 = r4
        L1f:
            r0 = r0 & 11
            if (r0 != r1) goto L31
            boolean r0 = r5.v()
            if (r0 != 0) goto L2a
            goto L31
        L2a:
            r5.O()
        L2d:
            r26 = r5
            goto Lad
        L31:
            java.lang.Object r0 = n0.e1.f333492a
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r27)
            if (r0 != 0) goto L2d
            kotlin.jvm.internal.o.d(r27)
            android.content.Context r0 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r1 = 2131165437(0x7f0700fd, float:1.7945091E38)
            int r0 = i65.a.f(r0, r1)
            android.content.Context r1 = com.tencent.mm.sdk.platformtools.x2.f193071a
            int r0 = i65.a.c(r1, r0)
            float r0 = (float) r0
            n0.h3 r1 = androidx.compose.ui.platform.m2.f10646e
            java.lang.Object r1 = r5.i(r1)
            p2.f r1 = (p2.f) r1
            long r24 = r1.z(r0)
            f2.r r0 = f2.r.f258818e
            f2.r r20 = f2.r.f258823m
            android.content.Context r0 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.lang.String r1 = "getContext(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            r1 = 2131099698(0x7f060032, float:1.7811757E38)
            long r2 = rz0.a.b(r1, r0)
            int r0 = z0.t.f468922q1
            z0.p r8 = z0.p.f468921d
            r9 = 0
            android.content.Context r0 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r1 = 2131165533(0x7f07015d, float:1.7945286E38)
            int r0 = i65.a.f(r0, r1)
            android.content.Context r1 = com.tencent.mm.sdk.platformtools.x2.f193071a
            int r0 = i65.a.c(r1, r0)
            float r10 = (float) r0
            r11 = 0
            r12 = 0
            r13 = 13
            r14 = 0
            z0.t r1 = d0.a2.j(r8, r9, r10, r11, r12, r13, r14)
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 196608(0x30000, float:2.75506E-40)
            r22 = 0
            r23 = 65488(0xffd0, float:9.1768E-41)
            r0 = r27
            r26 = r5
            r4 = r24
            r7 = r20
            r20 = r26
            l0.e5.c(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        Lad:
            n0.f4 r0 = r26.q()
            if (r0 == 0) goto Lc0
            com.tencent.mm.mj_template.sns.compose.widget.m4 r1 = new com.tencent.mm.mj_template.sns.compose.widget.m4
            r2 = r27
            r3 = r29
            r1.<init>(r2, r3)
            n0.l3 r0 = (n0.l3) r0
            r0.f333608d = r1
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.sns.compose.widget.q4.h(java.lang.String, n0.o, int):void");
    }

    public static final void i(com.tencent.mm.mj_template.sns.compose.widget.e5 e5Var, float f17, n0.o oVar, int i17) {
        n0.y0 y0Var;
        java.lang.String str;
        com.tencent.maas.model.MJTemplateInfo mJTemplateInfo;
        com.tencent.mm.mj_template.sns.compose.widget.r rVar;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.V(271009296);
        java.lang.Object obj = n0.e1.f333492a;
        y0Var2.U(-483455358);
        int i18 = z0.t.f468922q1;
        z0.p pVar = z0.p.f468921d;
        d0.p pVar2 = d0.p.f225183a;
        d0.l lVar = d0.p.f225186d;
        int i19 = z0.d.f468903a;
        s1.t0 a17 = d0.j0.a(lVar, z0.a.f468900l, y0Var2, 0);
        y0Var2.U(-1323940314);
        p2.f fVar = (p2.f) y0Var2.i(androidx.compose.ui.platform.m2.f10646e);
        p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
        u1.f fVar2 = u1.g.f423594i1;
        fVar2.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a18 = s1.g0.a(pVar);
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
        boolean a19 = (e5Var == null || (rVar = e5Var.f70078b) == null) ? false : rVar.a();
        z0.t g17 = d0.a3.g(d0.a3.f(pVar, 0.0f, 1, null), f17);
        yz5.p pVar3 = com.tencent.mm.mj_template.sns.compose.widget.l0.f70039a;
        j(g17, a19, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, 0L, 0L, 0L, com.tencent.mm.mj_template.sns.compose.widget.l0.f70039a, y0Var2, 0, 48, 2044);
        if (e5Var == null || (mJTemplateInfo = e5Var.f69947p) == null) {
            y0Var = y0Var2;
            str = null;
        } else {
            str = mJTemplateInfo.getDisplayName();
            y0Var = y0Var2;
        }
        h(str, y0Var, 0);
        y0Var.o(false);
        y0Var.o(false);
        y0Var.o(true);
        y0Var.o(false);
        y0Var.o(false);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.mj_template.sns.compose.widget.n4(e5Var, f17, i17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(z0.t r29, boolean r30, float r31, float r32, float r33, float r34, float r35, long r36, long r38, long r40, long r42, yz5.p r44, n0.o r45, int r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.sns.compose.widget.q4.j(z0.t, boolean, float, float, float, float, float, long, long, long, long, yz5.p, n0.o, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x010d, code lost:
    
        if (r1 == n0.n.f333620a) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(com.tencent.mm.mj_template.sns.compose.widget.m5 r17, float r18, yz5.l r19, yz5.l r20, yz5.l r21, yz5.a r22, yz5.l r23, n0.o r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.sns.compose.widget.q4.k(com.tencent.mm.mj_template.sns.compose.widget.m5, float, yz5.l, yz5.l, yz5.l, yz5.a, yz5.l, n0.o, int, int):void");
    }

    public static final void l(n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-1883070270);
        if (i17 == 0 && y0Var.v()) {
            y0Var.O();
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            int i18 = z0.t.f468922q1;
            z0.p pVar = z0.p.f468921d;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            z0.t e17 = d0.a3.e(a0.b.c(pVar, rz0.a.b(com.tencent.mm.R.color.adu, context), null, 2, null), 0.0f, 1, null);
            y0Var.U(733328855);
            int i19 = z0.d.f468903a;
            s1.t0 c17 = d0.y.c(z0.a.f468889a, false, y0Var, 0);
            y0Var.U(-1323940314);
            p2.f fVar = (p2.f) y0Var.i(androidx.compose.ui.platform.m2.f10646e);
            p2.s sVar = (p2.s) y0Var.i(androidx.compose.ui.platform.m2.f10652k);
            androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var.i(androidx.compose.ui.platform.m2.f10656o);
            u1.g.f423594i1.getClass();
            yz5.a aVar = u1.f.f423587b;
            yz5.q a17 = s1.g0.a(e17);
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
            n0.i5.a(y0Var, c17, u1.f.f423590e);
            n0.i5.a(y0Var, fVar, u1.f.f423589d);
            n0.i5.a(y0Var, sVar, u1.f.f423591f);
            n0.i5.a(y0Var, k4Var, u1.f.f423592g);
            y0Var.n();
            ((u0.i) a17).invoke(new n0.i4(y0Var), y0Var, 0);
            y0Var.U(2058660585);
            y0Var.U(-2137368960);
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            h1.c a18 = rz0.a.a(com.tencent.mm.R.drawable.bdj, rz0.a.b(com.tencent.mm.R.color.BW_100_Alpha_0_0_5, context2), y0Var, 0);
            z0.t h17 = d0.a3.h(pVar, i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479718db)));
            z0.d dVar = z0.a.f468893e;
            kotlin.jvm.internal.o.g(h17, "<this>");
            boolean z17 = androidx.compose.ui.platform.f3.f10562a;
            a0.q1.a(a18, null, y1.t.a(h17.k(new d0.q(dVar, false, androidx.compose.ui.platform.e3.f10553d)), com.tencent.mm.mj_template.sns.compose.widget.g4.f69968d), null, null, 0.0f, null, y0Var, 56, 120);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.mj_template.sns.compose.widget.h4(i17);
        }
    }
}
