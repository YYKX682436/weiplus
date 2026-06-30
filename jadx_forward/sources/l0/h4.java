package l0;

/* loaded from: classes14.dex */
public abstract class h4 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f395757a = p2.d.a(0, 0, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final float f395758b = 16;

    /* renamed from: c, reason: collision with root package name */
    public static final float f395759c = 12;

    /* renamed from: d, reason: collision with root package name */
    public static final z0.t f395760d;

    static {
        int i17 = z0.t.f550455q1;
        float f17 = 48;
        f395760d = d0.a3.d(z0.p.f550454d, f17, f17);
    }

    public static final void a(l0.x4 type, java.lang.String value, yz5.p innerTextField, g2.t0 visualTransformation, yz5.p pVar, yz5.p pVar2, yz5.p pVar3, yz5.p pVar4, boolean z17, boolean z18, boolean z19, c0.n interactionSource, d0.d2 contentPadding, l0.m3 colors, yz5.p pVar5, n0.o oVar, int i17, int i18, int i19) {
        int i27;
        int i28;
        boolean z27;
        l0.l0 l0Var;
        n0.y0 y0Var;
        yz5.p pVar6;
        yz5.p pVar7;
        yz5.p pVar8;
        boolean z28;
        boolean z29;
        yz5.p pVar9;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(innerTextField, "innerTextField");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visualTransformation, "visualTransformation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interactionSource, "interactionSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentPadding, "contentPadding");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(colors, "colors");
        java.lang.Object obj = n0.e1.f415025a;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.V(-712568069);
        if ((i19 & 1) != 0) {
            i27 = i17 | 6;
        } else if ((i17 & 14) == 0) {
            i27 = (y0Var2.e(type) ? 4 : 2) | i17;
        } else {
            i27 = i17;
        }
        if ((i19 & 2) != 0) {
            i27 |= 48;
        } else if ((i17 & 112) == 0) {
            i27 |= y0Var2.e(value) ? 32 : 16;
        }
        if ((i19 & 4) != 0) {
            i27 |= 384;
        } else if ((i17 & ce1.h.f4368x366c91de) == 0) {
            i27 |= y0Var2.e(innerTextField) ? 256 : 128;
        }
        if ((i19 & 8) != 0) {
            i27 |= 3072;
        } else if ((i17 & 7168) == 0) {
            i27 |= y0Var2.e(visualTransformation) ? 2048 : 1024;
        }
        if ((i19 & 16) != 0) {
            i27 |= 24576;
        } else if ((i17 & 57344) == 0) {
            i27 |= y0Var2.e(pVar) ? 16384 : 8192;
        }
        int i29 = i19 & 32;
        if (i29 != 0) {
            i27 |= 196608;
        } else if ((i17 & 458752) == 0) {
            i27 |= y0Var2.e(pVar2) ? 131072 : 65536;
        }
        int i37 = i19 & 64;
        if (i37 != 0) {
            i27 |= 1572864;
        } else if ((i17 & 3670016) == 0) {
            i27 |= y0Var2.e(pVar3) ? 1048576 : 524288;
        }
        int i38 = i19 & 128;
        if (i38 != 0) {
            i27 |= 12582912;
        } else if ((i17 & 29360128) == 0) {
            i27 |= y0Var2.e(pVar4) ? 8388608 : 4194304;
        }
        int i39 = i19 & 256;
        if (i39 != 0) {
            i27 |= 100663296;
        } else if ((i17 & 234881024) == 0) {
            i27 |= y0Var2.f(z17) ? 67108864 : com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432;
        }
        int i47 = i19 & 512;
        if (i47 != 0) {
            i27 |= 805306368;
        } else if ((i17 & 1879048192) == 0) {
            i27 |= y0Var2.f(z18) ? com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965 : 268435456;
        }
        int i48 = i27;
        int i49 = i19 & 1024;
        if (i49 != 0) {
            i28 = i18 | 6;
        } else if ((i18 & 14) == 0) {
            i28 = i18 | (y0Var2.f(z19) ? 4 : 2);
        } else {
            i28 = i18;
        }
        if ((i19 & 2048) != 0) {
            i28 |= 48;
        } else if ((i18 & 112) == 0) {
            i28 |= y0Var2.e(interactionSource) ? 32 : 16;
        }
        int i57 = i28;
        if ((i19 & 4096) != 0) {
            i57 |= 384;
        } else if ((i18 & ce1.h.f4368x366c91de) == 0) {
            i57 |= y0Var2.e(contentPadding) ? 256 : 128;
        }
        if ((i19 & 8192) != 0) {
            i57 |= 3072;
        } else if ((i18 & 7168) == 0) {
            i57 |= y0Var2.e(colors) ? 2048 : 1024;
        }
        int i58 = i19 & 16384;
        if (i58 != 0) {
            i57 |= 24576;
        } else if ((i18 & 57344) == 0) {
            i57 |= y0Var2.e(pVar5) ? 16384 : 8192;
        }
        if ((i48 & 1533916891) == 306783378 && (46811 & i57) == 9362 && y0Var2.v()) {
            y0Var2.O();
            pVar6 = pVar2;
            pVar7 = pVar3;
            pVar8 = pVar4;
            z28 = z17;
            z29 = z18;
            z27 = z19;
            pVar9 = pVar5;
            y0Var = y0Var2;
        } else {
            yz5.p pVar10 = i29 != 0 ? null : pVar2;
            yz5.p pVar11 = i37 != 0 ? null : pVar3;
            yz5.p pVar12 = i38 != 0 ? null : pVar4;
            boolean z37 = i39 != 0 ? false : z17;
            boolean z38 = i47 != 0 ? true : z18;
            z27 = i49 != 0 ? false : z19;
            yz5.p pVar13 = i58 != 0 ? null : pVar5;
            y0Var2.U(511388516);
            boolean e17 = y0Var2.e(value) | y0Var2.e(visualTransformation);
            java.lang.Object y17 = y0Var2.y();
            if (e17 || y17 == n0.n.f415153a) {
                y17 = new g2.r0(new a2.d(value, null, null, 6, null), g2.u.f349281a);
                y0Var2.g0(y17);
            }
            y0Var2.o(false);
            java.lang.String str = ((g2.r0) y17).f349277a.f82214d;
            if (((java.lang.Boolean) c0.h.a(interactionSource, y0Var2, (i57 >> 3) & 14).mo128745x754a37bb()).booleanValue()) {
                l0Var = l0.l0.Focused;
            } else {
                l0Var = str.length() == 0 ? l0.l0.UnfocusedEmpty : l0.l0.UnfocusedNotEmpty;
            }
            l0.l0 l0Var2 = l0Var;
            l0.d4 d4Var = new l0.d4(colors, z38, z27, interactionSource, i48, i57);
            n0.h3 h3Var = l0.l5.f395909a;
            l0.j5 j5Var = (l0.j5) y0Var2.i(h3Var);
            a2.o1 o1Var = j5Var.f395840g;
            long b17 = o1Var.b();
            long j17 = e1.y.f327853k;
            boolean c17 = e1.y.c(b17, j17);
            a2.o1 o1Var2 = j5Var.f395845l;
            boolean z39 = (c17 && !e1.y.c(o1Var2.b(), j17)) || (!e1.y.c(o1Var.b(), j17) && e1.y.c(o1Var2.b(), j17));
            l0.w4 w4Var = l0.w4.f396119a;
            y0Var2.U(2129141006);
            long b18 = ((l0.j5) y0Var2.i(h3Var)).f395845l.b();
            if (z39) {
                if (!(b18 != j17)) {
                    b18 = ((e1.y) d4Var.mo147xb9724478(l0Var2, y0Var2, 0)).f327855a;
                }
            }
            long j18 = b18;
            y0Var2.o(false);
            long b19 = ((l0.j5) y0Var2.i(h3Var)).f395840g.b();
            if (z39) {
                if (!(b19 != j17)) {
                    b19 = ((e1.y) d4Var.mo147xb9724478(l0Var2, y0Var2, 0)).f327855a;
                }
            }
            y0Var = y0Var2;
            w4Var.a(l0Var2, j18, b19, d4Var, pVar != null, u0.j.b(y0Var, 341865432, true, new l0.b4(pVar, pVar10, str, z27, i57, colors, z38, interactionSource, i48, pVar11, pVar12, type, innerTextField, z37, contentPadding, z39, pVar13)), y0Var, 1769472);
            pVar6 = pVar10;
            pVar7 = pVar11;
            pVar8 = pVar12;
            z28 = z37;
            z29 = z38;
            pVar9 = pVar13;
        }
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f415141d = new l0.c4(type, value, innerTextField, visualTransformation, pVar, pVar6, pVar7, pVar8, z28, z29, z27, interactionSource, contentPadding, colors, pVar9, i17, i18, i19);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(long r15, a2.o1 r17, java.lang.Float r18, yz5.p r19, n0.o r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.h4.b(long, a2.o1, java.lang.Float, yz5.p, n0.o, int, int):void");
    }

    public static final java.lang.Object c(s1.t tVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tVar, "<this>");
        java.lang.Object g17 = tVar.g();
        s1.d0 d0Var = g17 instanceof s1.d0 ? (s1.d0) g17 : null;
        if (d0Var != null) {
            return ((s1.b0) d0Var).f483522d;
        }
        return null;
    }

    public static final int d(s1.o1 o1Var) {
        if (o1Var != null) {
            return o1Var.f483584e;
        }
        return 0;
    }

    public static final int e(s1.o1 o1Var) {
        if (o1Var != null) {
            return o1Var.f483583d;
        }
        return 0;
    }
}
