package wy0;

/* loaded from: classes14.dex */
public abstract class m {
    public static final void a(java.util.List imagePathList, z0.t tVar, int i17, n0.o oVar, int i18, int i19) {
        int i27;
        boolean z17;
        boolean z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imagePathList, "imagePathList");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-1804522395);
        int i28 = i19 & 2;
        z0.p pVar = z0.p.f550454d;
        z0.t tVar2 = i28 != 0 ? pVar : tVar;
        int i29 = (i19 & 4) != 0 ? -1 : i17;
        java.lang.Object obj = n0.e1.f415025a;
        vz0.d0 a17 = vz0.f0.a(0, y0Var, 0, 1);
        y0Var.U(-1687182853);
        java.lang.Object y17 = y0Var.y();
        java.lang.Object obj2 = n0.n.f415153a;
        if (y17 == obj2) {
            y17 = n0.s4.c(java.lang.Float.valueOf(0.0f), null, 2, null);
            y0Var.g0(y17);
        }
        n0.v2 v2Var = (n0.v2) y17;
        y0Var.o(false);
        y0Var.U(-1687182789);
        java.lang.Object y18 = y0Var.y();
        if (y18 == obj2) {
            y18 = n0.s4.c(new p2.q(p2.r.a(0, 0)), null, 2, null);
            y0Var.g0(y18);
        }
        n0.v2 v2Var2 = (n0.v2) y18;
        y0Var.o(false);
        n0.d2.f(imagePathList, new wy0.h(imagePathList, v2Var, null), y0Var, 72);
        long j17 = ((p2.q) v2Var2.mo128745x754a37bb()).f432929a;
        float floatValue = ((java.lang.Number) v2Var.mo128745x754a37bb()).floatValue();
        y0Var.U(-1687182554);
        boolean d17 = y0Var.d(j17) | y0Var.b(floatValue);
        java.lang.Object y19 = y0Var.y();
        if (d17 || y19 == obj2) {
            float floatValue2 = ((java.lang.Number) v2Var.mo128745x754a37bb()).floatValue() * ((int) (((p2.q) v2Var2.mo128745x754a37bb()).f432929a >> 32));
            y19 = java.lang.Integer.valueOf((((float) p2.q.b(((p2.q) v2Var2.mo128745x754a37bb()).f432929a)) > floatValue2 ? java.lang.Float.valueOf(((p2.q.b(((p2.q) v2Var2.mo128745x754a37bb()).f432929a) - floatValue2) / 2) + floatValue2) : java.lang.Integer.valueOf(p2.q.b(((p2.q) v2Var2.mo128745x754a37bb()).f432929a))).intValue());
            y0Var.g0(y19);
        }
        int intValue = ((java.lang.Number) y19).intValue();
        y0Var.o(false);
        int i37 = (i18 >> 3) & 14;
        y0Var.U(733328855);
        int i38 = i37 >> 3;
        s1.t0 c17 = d0.y.c(z0.a.f550422a, false, y0Var, (i38 & 112) | (i38 & 14));
        y0Var.U(-1323940314);
        n0.h3 h3Var = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e;
        p2.f fVar = (p2.f) y0Var.i(h3Var);
        p2.s sVar = (p2.s) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92185k);
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 k4Var = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92189o);
        u1.g.f505127i1.getClass();
        yz5.a aVar = u1.f.f505120b;
        yz5.q a18 = s1.g0.a(tVar2);
        int i39 = ((((i37 << 3) & 112) << 9) & 7168) | 6;
        if (!(y0Var.f415294b instanceof n0.e)) {
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
        n0.i5.a(y0Var, c17, u1.f.f505123e);
        n0.i5.a(y0Var, fVar, u1.f.f505122d);
        n0.i5.a(y0Var, sVar, u1.f.f505124f);
        n0.i5.a(y0Var, k4Var, u1.f.f505125g);
        y0Var.n();
        ((u0.i) a18).mo147xb9724478(new n0.i4(y0Var), y0Var, java.lang.Integer.valueOf((i39 >> 3) & 112));
        y0Var.U(2058660585);
        y0Var.U(-2137368960);
        if (((i39 >> 9) & 14 & 11) == 2 && y0Var.v()) {
            y0Var.O();
            i27 = i29;
            z17 = false;
            z18 = true;
        } else {
            d0.a0 a0Var = d0.a0.f306596a;
            int size = imagePathList.size();
            z0.t e17 = d0.a3.e(pVar, 0.0f, 1, null);
            y0Var.U(1648959028);
            boolean e18 = y0Var.e(v2Var2);
            java.lang.Object y27 = y0Var.y();
            if (e18 || y27 == obj2) {
                y27 = new wy0.i(v2Var2);
                y0Var.g0(y27);
            }
            y0Var.o(false);
            i27 = i29;
            vz0.w.a(size, s1.h1.a(e17, (yz5.l) y27), a17, false, 0.0f, null, null, null, null, u0.j.b(y0Var, -2075819460, true, new wy0.j(a0Var, imagePathList)), y0Var, 805306416, 504);
            y0Var.U(-1687181427);
            if (intValue <= 0 || i27 <= 0) {
                z17 = false;
                z18 = true;
            } else {
                float a19 = i65.a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i65.a.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv)));
                y0Var.U(1648959803);
                boolean c18 = y0Var.c(i27) | y0Var.c(intValue);
                java.lang.Object y28 = y0Var.y();
                if (c18 || y28 == obj2) {
                    float f17 = 3 * a19;
                    float f18 = intValue + f17;
                    float f19 = i27 - f17;
                    if (f18 > f19) {
                        f18 = f19;
                    }
                    y28 = java.lang.Float.valueOf(f18);
                    y0Var.g0(y28);
                }
                float floatValue3 = ((java.lang.Number) y28).floatValue();
                z17 = false;
                y0Var.o(false);
                float mo7005x9a59d0b2 = ((int) floatValue3) / ((p2.f) y0Var.i(h3Var)).mo7005x9a59d0b2();
                z18 = true;
                b(a17, d0.v1.b(pVar, 0.0f, mo7005x9a59d0b2, 1, null), y0Var, 0, 0);
            }
            y0Var.o(z17);
        }
        y0Var.o(z17);
        y0Var.o(z17);
        y0Var.o(z18);
        y0Var.o(z17);
        y0Var.o(z17);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new wy0.k(imagePathList, tVar2, i27, i18, i19);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(vz0.d0 r25, z0.t r26, n0.o r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wy0.m.b(vz0.d0, z0.t, n0.o, int, int):void");
    }

    public static final float c(java.lang.String str) {
        android.graphics.Point point = new android.graphics.Point();
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, options);
        point.x = options.outWidth;
        point.y = options.outHeight;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(str) % 180 != 0) {
            int i17 = point.y;
            point.y = point.x;
            point.x = i17;
        }
        float f17 = point.y;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(point.x);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        return f17 / (valueOf != null ? valueOf.intValue() : 1);
    }
}
