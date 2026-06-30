package l0;

/* loaded from: classes14.dex */
public final class s3 {

    /* renamed from: a, reason: collision with root package name */
    public static final l0.s3 f396043a = new l0.s3();

    /* renamed from: b, reason: collision with root package name */
    public static final float f396044b = 56;

    /* renamed from: c, reason: collision with root package name */
    public static final float f396045c = 280;

    /* renamed from: d, reason: collision with root package name */
    public static final float f396046d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final float f396047e = 2;

    public final void a(boolean z17, boolean z18, c0.n interactionSource, l0.m3 colors, e1.a1 a1Var, float f17, float f18, n0.o oVar, int i17, int i18) {
        int i19;
        e1.a1 a1Var2;
        float f19;
        float f27;
        e1.a1 a1Var3;
        float f28;
        float f29;
        int i27;
        int i28;
        int i29;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interactionSource, "interactionSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(colors, "colors");
        java.lang.Object obj = n0.e1.f415025a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(943754022);
        if ((i18 & 1) != 0) {
            i19 = i17 | 6;
        } else if ((i17 & 14) == 0) {
            i19 = (y0Var.f(z17) ? 4 : 2) | i17;
        } else {
            i19 = i17;
        }
        if ((i18 & 2) != 0) {
            i19 |= 48;
        } else if ((i17 & 112) == 0) {
            i19 |= y0Var.f(z18) ? 32 : 16;
        }
        if ((i18 & 4) != 0) {
            i19 |= 384;
        } else if ((i17 & ce1.h.f4368x366c91de) == 0) {
            i19 |= y0Var.e(interactionSource) ? 256 : 128;
        }
        if ((i18 & 8) != 0) {
            i19 |= 3072;
        } else if ((i17 & 7168) == 0) {
            i19 |= y0Var.e(colors) ? 2048 : 1024;
        }
        if ((i17 & 57344) == 0) {
            if ((i18 & 16) == 0) {
                a1Var2 = a1Var;
                if (y0Var.e(a1Var2)) {
                    i29 = 16384;
                    i19 |= i29;
                }
            } else {
                a1Var2 = a1Var;
            }
            i29 = 8192;
            i19 |= i29;
        } else {
            a1Var2 = a1Var;
        }
        if ((i17 & 458752) == 0) {
            if ((i18 & 32) == 0) {
                f19 = f17;
                if (y0Var.b(f19)) {
                    i28 = 131072;
                    i19 |= i28;
                }
            } else {
                f19 = f17;
            }
            i28 = 65536;
            i19 |= i28;
        } else {
            f19 = f17;
        }
        if ((3670016 & i17) == 0) {
            if ((i18 & 64) == 0) {
                f27 = f18;
                if (y0Var.b(f27)) {
                    i27 = 1048576;
                    i19 |= i27;
                }
            } else {
                f27 = f18;
            }
            i27 = 524288;
            i19 |= i27;
        } else {
            f27 = f18;
        }
        if ((i18 & 128) != 0) {
            i19 |= 12582912;
        } else if ((29360128 & i17) == 0) {
            i19 |= y0Var.e(this) ? 8388608 : 4194304;
        }
        if ((23967451 & i19) == 4793490 && y0Var.v()) {
            y0Var.O();
            a1Var3 = a1Var2;
            f28 = f19;
            f29 = f27;
        } else {
            y0Var.Q();
            if ((i17 & 1) == 0 || y0Var.u()) {
                if ((i18 & 16) != 0) {
                    a1Var2 = ((l0.q1) y0Var.i(l0.s1.f396041a)).f396002a;
                    i19 &= -57345;
                }
                if ((i18 & 32) != 0) {
                    i19 &= -458753;
                    f19 = f396047e;
                }
                if ((i18 & 64) != 0) {
                    i19 &= -3670017;
                    f27 = f396046d;
                }
            } else {
                y0Var.O();
                if ((i18 & 16) != 0) {
                    i19 &= -57345;
                }
                if ((i18 & 32) != 0) {
                    i19 &= -458753;
                }
                if ((i18 & 64) != 0) {
                    i19 &= -3670017;
                }
            }
            e1.a1 a1Var4 = a1Var2;
            float f37 = f19;
            float f38 = f27;
            y0Var.p();
            int i37 = (i19 & 14) | (i19 & 112) | (i19 & ce1.h.f4368x366c91de) | (i19 & 7168);
            int i38 = i19 >> 3;
            n0.e5 a17 = l0.t3.a(z17, z18, interactionSource, colors, f37, f38, y0Var, (57344 & i38) | i37 | (i38 & 458752));
            int i39 = z0.t.f550455q1;
            d0.y.a(a0.j.a(z0.p.f550454d, (a0.k) a17.mo128745x754a37bb(), a1Var4), y0Var, 0);
            a1Var3 = a1Var4;
            f28 = f37;
            f29 = f38;
        }
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f415141d = new l0.n3(this, z17, z18, interactionSource, colors, a1Var3, f28, f29, i17, i18);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r68, yz5.p r69, boolean r70, boolean r71, g2.t0 r72, c0.n r73, boolean r74, yz5.p r75, yz5.p r76, yz5.p r77, yz5.p r78, l0.m3 r79, d0.d2 r80, yz5.p r81, n0.o r82, int r83, int r84, int r85) {
        /*
            Method dump skipped, instructions count: 927
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.s3.b(java.lang.String, yz5.p, boolean, boolean, g2.t0, c0.n, boolean, yz5.p, yz5.p, yz5.p, yz5.p, l0.m3, d0.d2, yz5.p, n0.o, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r71, yz5.p r72, boolean r73, boolean r74, g2.t0 r75, c0.n r76, boolean r77, yz5.p r78, yz5.p r79, yz5.p r80, yz5.p r81, l0.m3 r82, d0.d2 r83, n0.o r84, int r85, int r86, int r87) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.s3.c(java.lang.String, yz5.p, boolean, boolean, g2.t0, c0.n, boolean, yz5.p, yz5.p, yz5.p, yz5.p, l0.m3, d0.d2, n0.o, int, int, int):void");
    }

    public final l0.m3 d(long j17, long j18, long j19, long j27, long j28, long j29, long j37, long j38, long j39, long j47, long j48, long j49, long j57, long j58, long j59, long j66, long j67, long j68, long j69, long j76, long j77, n0.o oVar, int i17, int i18, int i19, int i27) {
        long j78;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(1762667317);
        long b17 = (i27 & 1) != 0 ? e1.y.b(((e1.y) y0Var.i(l0.p.f395949a)).f327855a, ((java.lang.Number) y0Var.i(l0.n.f395917a)).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        int i28 = i27 & 2;
        l0.l lVar = l0.l.f395877a;
        long b18 = i28 != 0 ? e1.y.b(b17, lVar.b(y0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        if ((i27 & 4) != 0) {
            int i29 = e1.y.f327854l;
            j78 = e1.y.f327852j;
        } else {
            j78 = j19;
        }
        long g17 = (i27 & 8) != 0 ? ((l0.i) y0Var.i(l0.k.f395847a)).g() : j27;
        long c17 = (i27 & 16) != 0 ? ((l0.i) y0Var.i(l0.k.f395847a)).c() : j28;
        long b19 = (i27 & 32) != 0 ? e1.y.b(((l0.i) y0Var.i(l0.k.f395847a)).g(), lVar.c(y0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j29;
        long b27 = (i27 & 64) != 0 ? e1.y.b(((l0.i) y0Var.i(l0.k.f395847a)).f(), lVar.b(y0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j37;
        long b28 = (i27 & 128) != 0 ? e1.y.b(b27, lVar.b(y0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j38;
        long c18 = (i27 & 256) != 0 ? ((l0.i) y0Var.i(l0.k.f395847a)).c() : j39;
        long b29 = (i27 & 512) != 0 ? e1.y.b(((l0.i) y0Var.i(l0.k.f395847a)).f(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j47;
        long b37 = (i27 & 1024) != 0 ? e1.y.b(b29, lVar.b(y0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j48;
        long j79 = (i27 & 2048) != 0 ? b29 : j49;
        long b38 = (i27 & 4096) != 0 ? e1.y.b(((l0.i) y0Var.i(l0.k.f395847a)).f(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j57;
        long b39 = (i27 & 8192) != 0 ? e1.y.b(b38, lVar.b(y0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j58;
        long c19 = (i27 & 16384) != 0 ? ((l0.i) y0Var.i(l0.k.f395847a)).c() : j59;
        long b47 = (32768 & i27) != 0 ? e1.y.b(((l0.i) y0Var.i(l0.k.f395847a)).g(), lVar.c(y0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j66;
        long b48 = (65536 & i27) != 0 ? e1.y.b(((l0.i) y0Var.i(l0.k.f395847a)).f(), lVar.d(y0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j67;
        long b49 = (131072 & i27) != 0 ? e1.y.b(b48, lVar.b(y0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j68;
        long c27 = (262144 & i27) != 0 ? ((l0.i) y0Var.i(l0.k.f395847a)).c() : j69;
        long b57 = (524288 & i27) != 0 ? e1.y.b(((l0.i) y0Var.i(l0.k.f395847a)).f(), lVar.d(y0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j76;
        l0.y yVar = new l0.y(b17, b18, g17, c17, b19, b27, c18, b28, b29, b37, j79, b38, b39, c19, j78, b47, b48, b49, c27, b57, (i27 & 1048576) != 0 ? e1.y.b(b57, lVar.b(y0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j77, null);
        y0Var.o(false);
        return yVar;
    }

    public final l0.m3 e(long j17, long j18, long j19, long j27, long j28, long j29, long j37, long j38, long j39, long j47, long j48, long j49, long j57, long j58, long j59, long j66, long j67, long j68, long j69, long j76, long j77, n0.o oVar, int i17, int i18, int i19, int i27) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(231892599);
        long b17 = (i27 & 1) != 0 ? e1.y.b(((e1.y) y0Var.i(l0.p.f395949a)).f327855a, ((java.lang.Number) y0Var.i(l0.n.f395917a)).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        int i28 = i27 & 2;
        l0.l lVar = l0.l.f395877a;
        long b18 = i28 != 0 ? e1.y.b(b17, lVar.b(y0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long b19 = (i27 & 4) != 0 ? e1.y.b(((l0.i) y0Var.i(l0.k.f395847a)).f(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long g17 = (i27 & 8) != 0 ? ((l0.i) y0Var.i(l0.k.f395847a)).g() : j27;
        long c17 = (i27 & 16) != 0 ? ((l0.i) y0Var.i(l0.k.f395847a)).c() : j28;
        long b27 = (i27 & 32) != 0 ? e1.y.b(((l0.i) y0Var.i(l0.k.f395847a)).g(), lVar.c(y0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j29;
        long b28 = (i27 & 64) != 0 ? e1.y.b(((l0.i) y0Var.i(l0.k.f395847a)).f(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j37;
        long b29 = (i27 & 128) != 0 ? e1.y.b(b28, lVar.b(y0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j38;
        long c18 = (i27 & 256) != 0 ? ((l0.i) y0Var.i(l0.k.f395847a)).c() : j39;
        long b37 = (i27 & 512) != 0 ? e1.y.b(((l0.i) y0Var.i(l0.k.f395847a)).f(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j47;
        long b38 = (i27 & 1024) != 0 ? e1.y.b(b37, lVar.b(y0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j48;
        long j78 = (i27 & 2048) != 0 ? b37 : j49;
        long b39 = (i27 & 4096) != 0 ? e1.y.b(((l0.i) y0Var.i(l0.k.f395847a)).f(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j57;
        long b47 = (i27 & 8192) != 0 ? e1.y.b(b39, lVar.b(y0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j58;
        long c19 = (i27 & 16384) != 0 ? ((l0.i) y0Var.i(l0.k.f395847a)).c() : j59;
        long b48 = (32768 & i27) != 0 ? e1.y.b(((l0.i) y0Var.i(l0.k.f395847a)).g(), lVar.c(y0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j66;
        long b49 = (65536 & i27) != 0 ? e1.y.b(((l0.i) y0Var.i(l0.k.f395847a)).f(), lVar.d(y0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j67;
        long b57 = (131072 & i27) != 0 ? e1.y.b(b49, lVar.b(y0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j68;
        long c27 = (262144 & i27) != 0 ? ((l0.i) y0Var.i(l0.k.f395847a)).c() : j69;
        long b58 = (524288 & i27) != 0 ? e1.y.b(((l0.i) y0Var.i(l0.k.f395847a)).f(), lVar.d(y0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j76;
        l0.y yVar = new l0.y(b17, b18, g17, c17, b27, b28, c18, b29, b37, b38, j78, b39, b47, c19, b19, b48, b49, b57, c27, b58, (i27 & 1048576) != 0 ? e1.y.b(b58, lVar.b(y0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j77, null);
        y0Var.o(false);
        return yVar;
    }
}
