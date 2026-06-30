package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes14.dex */
public abstract class p {
    public static final void a(float f17, com.tencent.mm.mj_template.sns.compose.widget.q arguments, n0.o oVar, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(arguments, "arguments");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(763558073);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.b(f17) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 112) == 0) {
            i18 |= y0Var.e(arguments) ? 32 : 16;
        }
        if ((i18 & 91) == 18 && y0Var.v()) {
            y0Var.O();
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            y0Var.U(-1695544050);
            java.lang.Object y17 = y0Var.y();
            java.lang.Object obj2 = n0.n.f333620a;
            if (y17 == obj2) {
                y17 = n0.s4.c(java.lang.Boolean.FALSE, null, 2, null);
                y0Var.g0(y17);
            }
            n0.v2 v2Var = (n0.v2) y17;
            y0Var.o(false);
            if (!((java.lang.Boolean) v2Var.getValue()).booleanValue() && arguments.f70178e) {
                v2Var.setValue(java.lang.Boolean.TRUE);
            }
            y0Var.U(-1695543796);
            boolean e17 = y0Var.e(arguments) | y0Var.e(v2Var);
            java.lang.Object y18 = y0Var.y();
            if (e17 || y18 == obj2) {
                y18 = new com.tencent.mm.mj_template.sns.compose.widget.c(arguments, v2Var);
                y0Var.g0(y18);
            }
            yz5.l lVar = (yz5.l) y18;
            y0Var.o(false);
            boolean z17 = arguments.f70178e;
            int i19 = arguments.f70179f;
            yz5.l lVar2 = arguments.f70180g;
            yz5.l lVar3 = arguments.f70182i;
            yz5.p contentCompose = arguments.f70174a;
            kotlin.jvm.internal.o.g(contentCompose, "contentCompose");
            yz5.a targetHeightPxOnOpenGetter = arguments.f70175b;
            kotlin.jvm.internal.o.g(targetHeightPxOnOpenGetter, "targetHeightPxOnOpenGetter");
            yz5.a targetHeightPxOnCloseGetter = arguments.f70176c;
            kotlin.jvm.internal.o.g(targetHeightPxOnCloseGetter, "targetHeightPxOnCloseGetter");
            yz5.a availableScreenHeightPxGetter = arguments.f70177d;
            kotlin.jvm.internal.o.g(availableScreenHeightPxGetter, "availableScreenHeightPxGetter");
            z.h0 customEasing = arguments.f70183j;
            kotlin.jvm.internal.o.g(customEasing, "customEasing");
            com.tencent.mm.mj_template.sns.compose.widget.q qVar = new com.tencent.mm.mj_template.sns.compose.widget.q(contentCompose, targetHeightPxOnOpenGetter, targetHeightPxOnCloseGetter, availableScreenHeightPxGetter, z17, i19, lVar2, lVar, lVar3, customEasing);
            if (((java.lang.Boolean) v2Var.getValue()).booleanValue()) {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                wy0.d.a(f17, rz0.a.b(com.tencent.mm.R.color.f478492d, context), u0.j.b(y0Var, 2047652825, true, new com.tencent.mm.mj_template.sns.compose.widget.a(qVar)), y0Var, (i18 & 14) | 384, 0);
            }
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.mj_template.sns.compose.widget.b(f17, arguments, i17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ee, code lost:
    
        if ((r54 & 4) != 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0212, code lost:
    
        if (r3 == r6) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x023c, code lost:
    
        if (r10 == r6) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.String r46, java.lang.String r47, java.lang.String r48, boolean r49, yz5.a r50, yz5.a r51, n0.o r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 883
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.sns.compose.widget.p.b(java.lang.String, java.lang.String, java.lang.String, boolean, yz5.a, yz5.a, n0.o, int, int):void");
    }

    public static final void c(com.tencent.mm.mj_template.sns.compose.widget.q qVar, n0.o oVar, int i17) {
        int i18;
        float intValue;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-1762527435);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.e(qVar) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i18 & 11) == 2 && y0Var.v()) {
            y0Var.O();
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            y0Var.U(-759441721);
            java.lang.Object y17 = y0Var.y();
            int i19 = n0.o.f333629a;
            java.lang.Object obj2 = n0.n.f333620a;
            if (y17 == obj2) {
                y17 = n0.s4.c(java.lang.Boolean.FALSE, null, 2, null);
                y0Var.g0(y17);
            }
            n0.v2 v2Var = (n0.v2) y17;
            y0Var.o(false);
            y0Var.U(-759441662);
            java.lang.Object y18 = y0Var.y();
            if (y18 == obj2) {
                y18 = n0.s4.c(0, null, 2, null);
                y0Var.g0(y18);
            }
            n0.v2 v2Var2 = (n0.v2) y18;
            y0Var.o(false);
            y0Var.U(-759441600);
            java.lang.Object y19 = y0Var.y();
            if (y19 == obj2) {
                y19 = n0.s4.c(-1, null, 2, null);
                y0Var.g0(y19);
            }
            n0.v2 v2Var3 = (n0.v2) y19;
            y0Var.o(false);
            boolean z17 = qVar.f70178e;
            if (((java.lang.Number) v2Var2.getValue()).intValue() != Integer.MAX_VALUE) {
                y0Var.U(-759441425);
                y0Var.o(false);
                intValue = ((java.lang.Number) v2Var2.getValue()).intValue();
            } else if (z17) {
                y0Var.U(-759441366);
                intValue = ((java.lang.Number) qVar.f70175b.invoke()).intValue() / ((p2.f) y0Var.i(androidx.compose.ui.platform.m2.f10646e)).getDensity();
                y0Var.o(false);
            } else {
                y0Var.U(-759441292);
                intValue = ((java.lang.Number) qVar.f70176c.invoke()).intValue() / ((p2.f) y0Var.i(androidx.compose.ui.platform.m2.f10646e)).getDensity();
                y0Var.o(false);
            }
            if (((java.lang.Boolean) v2Var.getValue()).booleanValue() != z17) {
                yz5.l lVar = qVar.f70180g;
                if (lVar != null) {
                    lVar.invoke(java.lang.Boolean.valueOf(z17));
                }
                v2Var.setValue(java.lang.Boolean.valueOf(z17));
            }
            z.v2 d17 = z.q.d(qVar.f70179f, 0, qVar.f70183j, 2, null);
            y0Var.U(-759440843);
            boolean e17 = y0Var.e(qVar) | y0Var.f(z17);
            java.lang.Object y27 = y0Var.y();
            if (e17 || y27 == obj2) {
                y27 = new com.tencent.mm.mj_template.sns.compose.widget.j(qVar, z17);
                y0Var.g0(y27);
            }
            y0Var.o(false);
            n0.e5 a17 = z.j.a(intValue, d17, (yz5.l) y27, y0Var, 0, 0);
            int i27 = z0.t.f468922q1;
            z0.t g17 = d0.a3.g(z0.p.f468921d, ((p2.h) ((z.r) a17).getValue()).f351380d);
            y0Var.U(-759440634);
            boolean e18 = y0Var.e(v2Var3) | y0Var.e(qVar);
            java.lang.Object y28 = y0Var.y();
            if (e18 || y28 == obj2) {
                y28 = new com.tencent.mm.mj_template.sns.compose.widget.d(qVar, v2Var3);
                y0Var.g0(y28);
            }
            y0Var.o(false);
            z0.t a18 = s1.h1.a(g17, (yz5.l) y28);
            y0Var.U(-759440074);
            boolean e19 = y0Var.e(qVar);
            java.lang.Object y29 = y0Var.y();
            if (e19 || y29 == obj2) {
                y29 = new com.tencent.mm.mj_template.sns.compose.widget.g(qVar);
                y0Var.g0(y29);
            }
            y0Var.o(false);
            s1.f2.b(a18, (yz5.p) y29, y0Var, 0, 0);
            y0Var.U(-759439624);
            boolean e27 = y0Var.e(v2Var2);
            java.lang.Object y37 = y0Var.y();
            if (e27 || y37 == obj2) {
                y37 = new com.tencent.mm.mj_template.sns.compose.widget.h(v2Var2, null);
                y0Var.g0(y37);
            }
            y0Var.o(false);
            n0.d2.f(v2Var2, (yz5.p) y37, y0Var, 70);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.mj_template.sns.compose.widget.i(qVar, i17);
        }
    }
}
