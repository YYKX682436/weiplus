package s1;

/* loaded from: classes14.dex */
public abstract class f2 {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00cc, code lost:
    
        if (r4 == n0.n.f415153a) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(s1.k2 r8, z0.t r9, yz5.p r10, n0.o r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.f2.a(s1.k2, z0.t, yz5.p, n0.o, int, int):void");
    }

    public static final void b(z0.t tVar, yz5.p measurePolicy, n0.o oVar, int i17, int i18) {
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurePolicy, "measurePolicy");
        java.lang.Object obj = n0.e1.f415025a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-1298353104);
        int i27 = i18 & 1;
        if (i27 != 0) {
            i19 = i17 | 6;
        } else if ((i17 & 14) == 0) {
            i19 = (y0Var.e(tVar) ? 4 : 2) | i17;
        } else {
            i19 = i17;
        }
        if ((i18 & 2) != 0) {
            i19 |= 48;
        } else if ((i17 & 112) == 0) {
            i19 |= y0Var.e(measurePolicy) ? 32 : 16;
        }
        if ((i19 & 91) == 18 && y0Var.v()) {
            y0Var.O();
        } else {
            if (i27 != 0) {
                int i28 = z0.t.f550455q1;
                tVar = z0.p.f550454d;
            }
            y0Var.U(-492369756);
            java.lang.Object y17 = y0Var.y();
            int i29 = n0.o.f415162a;
            if (y17 == n0.n.f415153a) {
                y17 = new s1.k2(s1.e1.f483536a);
                y0Var.g0(y17);
            }
            y0Var.o(false);
            int i37 = i19 << 3;
            a((s1.k2) y17, tVar, measurePolicy, y0Var, (i37 & 112) | 8 | (i37 & ce1.h.f4368x366c91de), 0);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f415141d = new s1.a2(tVar, measurePolicy, i17, i18);
    }
}
