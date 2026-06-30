package iy;

/* loaded from: classes14.dex */
public abstract class n {
    public static final void a(jy.m screenInfo, jy.k kVar, n0.o oVar, int i17, int i18) {
        jy.k kVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(screenInfo, "screenInfo");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(196267463);
        if ((i18 & 2) != 0) {
            iy.b bVar = new iy.b(screenInfo);
            y0Var.U(564614654);
            p012xc85e97e9.p093xedfae76a.m1 a17 = z3.b.f551391a.a(y0Var, 0);
            if (a17 == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            p012xc85e97e9.p093xedfae76a.c1 a18 = z3.c.a(jy.k.class, a17, null, bVar, y0Var, 4168, 0);
            y0Var.o(false);
            kVar2 = (jy.k) a18;
        } else {
            kVar2 = kVar;
        }
        java.lang.Object obj = n0.e1.f415025a;
        android.content.Context context = (android.content.Context) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.a1.f92036b);
        int i19 = z0.t.f550455q1;
        z0.p pVar = z0.p.f550454d;
        z0.t c17 = a0.b.c(d0.a3.e(pVar, 0.0f, 1, null), x1.b.a(com.p314xaae8f345.mm.R.C30859x5a72f63.aim, y0Var, 0), null, 2, null);
        y0Var.U(733328855);
        int i27 = z0.d.f550436a;
        s1.t0 c18 = d0.y.c(z0.a.f550422a, false, y0Var, 0);
        y0Var.U(-1323940314);
        p2.f fVar = (p2.f) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e);
        p2.s sVar = (p2.s) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92185k);
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 k4Var = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92189o);
        u1.f fVar2 = u1.g.f505127i1;
        fVar2.getClass();
        yz5.a aVar = u1.f.f505120b;
        yz5.q a19 = s1.g0.a(c17);
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
        fVar2.getClass();
        n0.i5.a(y0Var, c18, u1.f.f505123e);
        fVar2.getClass();
        n0.i5.a(y0Var, fVar, u1.f.f505122d);
        fVar2.getClass();
        n0.i5.a(y0Var, sVar, u1.f.f505124f);
        fVar2.getClass();
        n0.i5.a(y0Var, k4Var, u1.f.f505125g);
        y0Var.n();
        ((u0.i) a19).mo147xb9724478(new n0.i4(y0Var), y0Var, 0);
        y0Var.U(2058660585);
        y0Var.U(-2137368960);
        d0.a0 a0Var = d0.a0.f306596a;
        z0.t a27 = a0Var.a(d0.a3.l(pVar, null, false, 3, null), z0.a.f550426e);
        java.lang.String str = ((jy.q) kVar2.N6()).f384009a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = ((jy.q) kVar2.N6()).f384010b;
        c(a27, str, str2 != null ? str2 : "", ((jy.q) kVar2.N6()).f384011c, y0Var, 0, 0);
        d(a0Var.a(pVar, z0.a.f550423b), new iy.c(context), y0Var, 0);
        b(a0Var.a(pVar, z0.a.f550429h), new iy.d(kVar2), new iy.e(kVar2), y0Var, 0);
        y0Var.o(false);
        y0Var.o(false);
        y0Var.o(true);
        y0Var.o(false);
        y0Var.o(false);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new iy.f(screenInfo, kVar2, i17, i18);
        }
    }

    public static final void b(z0.t modifier, yz5.a startRecord, yz5.a stopRecord, n0.o oVar, int i17) {
        int i18;
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modifier, "modifier");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(startRecord, "startRecord");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stopRecord, "stopRecord");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-1412782620);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.e(modifier) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 112) == 0) {
            i18 |= y0Var.e(startRecord) ? 32 : 16;
        }
        if ((i17 & ce1.h.f4368x366c91de) == 0) {
            i18 |= y0Var.e(stopRecord) ? 256 : 128;
        }
        int i19 = i18;
        if ((i19 & 731) == 146 && y0Var.v()) {
            y0Var.O();
        } else {
            java.lang.Object obj = n0.e1.f415025a;
            android.content.Context context = (android.content.Context) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.a1.f92036b);
            f.r a17 = f.f.a(new h.e(), new iy.i(context), y0Var, 8);
            ky.a b17 = ky.i.b(y0Var, 0);
            n0.d2.f(b17.a(), new iy.g(b17, context, startRecord, a17, stopRecord, null), y0Var, 64);
            int i27 = i19 & 14;
            y0Var.U(733328855);
            int i28 = z0.d.f550436a;
            int i29 = i27 >> 3;
            s1.t0 c17 = d0.y.c(z0.a.f550422a, false, y0Var, (i29 & 112) | (i29 & 14));
            y0Var.U(-1323940314);
            n0.h3 h3Var = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e;
            p2.f fVar = (p2.f) y0Var.i(h3Var);
            n0.h3 h3Var2 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92185k;
            p2.s sVar = (p2.s) y0Var.i(h3Var2);
            n0.h3 h3Var3 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92189o;
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 k4Var = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4) y0Var.i(h3Var3);
            u1.f fVar2 = u1.g.f505127i1;
            fVar2.getClass();
            yz5.a aVar = u1.f.f505120b;
            yz5.q a18 = s1.g0.a(modifier);
            int i37 = ((((i27 << 3) & 112) << 9) & 7168) | 6;
            n0.e eVar = y0Var.f415294b;
            if (!(eVar instanceof n0.e)) {
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
            fVar2.getClass();
            yz5.p pVar = u1.f.f505123e;
            n0.i5.a(y0Var, c17, pVar);
            fVar2.getClass();
            yz5.p pVar2 = u1.f.f505122d;
            n0.i5.a(y0Var, fVar, pVar2);
            fVar2.getClass();
            yz5.p pVar3 = u1.f.f505124f;
            n0.i5.a(y0Var, sVar, pVar3);
            fVar2.getClass();
            yz5.p pVar4 = u1.f.f505125g;
            n0.i5.a(y0Var, k4Var, pVar4);
            y0Var.n();
            ((u0.i) a18).mo147xb9724478(new n0.i4(y0Var), y0Var, java.lang.Integer.valueOf((i37 >> 3) & 112));
            y0Var.U(2058660585);
            y0Var.U(-2137368960);
            if (((i37 >> 9) & 14 & 11) == 2 && y0Var.v()) {
                y0Var.O();
                z17 = false;
            } else {
                int i38 = z0.t.f550455q1;
                z0.p pVar5 = z0.p.f550454d;
                z0.t g17 = d0.a3.g(d0.a3.f(pVar5, 0.0f, 1, null), 160);
                z0.b bVar = z0.a.f550434m;
                y0Var.U(-483455358);
                d0.p pVar6 = d0.p.f306716a;
                s1.t0 a19 = d0.j0.a(d0.p.f306719d, bVar, y0Var, 48);
                y0Var.U(-1323940314);
                p2.f fVar3 = (p2.f) y0Var.i(h3Var);
                p2.s sVar2 = (p2.s) y0Var.i(h3Var2);
                p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 k4Var2 = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4) y0Var.i(h3Var3);
                fVar2.getClass();
                yz5.q a27 = s1.g0.a(g17);
                if (!(eVar instanceof n0.e)) {
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
                fVar2.getClass();
                n0.i5.a(y0Var, a19, pVar);
                fVar2.getClass();
                n0.i5.a(y0Var, fVar3, pVar2);
                fVar2.getClass();
                n0.i5.a(y0Var, sVar2, pVar3);
                fVar2.getClass();
                n0.i5.a(y0Var, k4Var2, pVar4);
                y0Var.n();
                ((u0.i) a27).mo147xb9724478(new n0.i4(y0Var), y0Var, 0);
                y0Var.U(2058660585);
                y0Var.U(-1163856341);
                ky.i.a(b17, y0Var, 0, 0);
                y0Var.o(false);
                y0Var.o(false);
                y0Var.o(true);
                y0Var.o(false);
                y0Var.o(false);
                n0.e5 a28 = z.j.a(b17.a() == ky.m0.f394926e ? 0 : 90, z.q.d(300, 0, z.j0.f550237a, 2, null), null, y0Var, 0, 4);
                z0.t f17 = d0.a3.f(d0.a3.g(pVar5, 90), 0.0f, 1, null);
                int i39 = z0.d.f550436a;
                z0.d dVar = z0.a.f550429h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f17, "<this>");
                boolean z18 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.f3.f92095a;
                z17 = false;
                ky.w.a(d0.v1.b(f17.k(new d0.q(dVar, false, p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e3.f92086d)), 0.0f, ((p2.h) ((z.r) a28).mo128745x754a37bb()).f432913d, 1, null), ((java.lang.Boolean) ((n0.q4) b17.f394862b).mo128745x754a37bb()).booleanValue(), y0Var, 0, 0);
            }
            y0Var.o(z17);
            y0Var.o(z17);
            y0Var.o(true);
            y0Var.o(z17);
            y0Var.o(z17);
            java.lang.Object obj2 = n0.e1.f415025a;
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new iy.h(modifier, startRecord, stopRecord, i17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(z0.t r36, java.lang.String r37, java.lang.String r38, boolean r39, n0.o r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iy.n.c(z0.t, java.lang.String, java.lang.String, boolean, n0.o, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x010d, code lost:
    
        if (r4 == r5) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(z0.t r23, yz5.a r24, n0.o r25, int r26) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iy.n.d(z0.t, yz5.a, n0.o, int):void");
    }
}
