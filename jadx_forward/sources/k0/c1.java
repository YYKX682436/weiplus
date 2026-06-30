package k0;

/* loaded from: classes14.dex */
public abstract class c1 {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0031, code lost:
    
        if (r1 == n0.n.f415153a) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r10, l2.e r11, k0.y0 r12, n0.o r13, int r14) {
        /*
            java.lang.String r0 = "direction"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r11, r0)
            java.lang.String r0 = "manager"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r0)
            java.lang.Object r0 = n0.e1.f415025a
            n0.y0 r13 = (n0.y0) r13
            r0 = -1344558920(0xffffffffafdba8b8, float:-3.995575E-10)
            r13.V(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r13.U(r1)
            boolean r0 = r13.e(r0)
            boolean r1 = r13.e(r12)
            r0 = r0 | r1
            java.lang.Object r1 = r13.y()
            if (r0 != 0) goto L33
            int r0 = n0.o.f415162a
            java.lang.Object r0 = n0.n.f415153a
            if (r1 != r0) goto L3b
        L33:
            k0.r0 r1 = new k0.r0
            r1.<init>(r12, r10)
            r13.g0(r1)
        L3b:
            r0 = 0
            r13.o(r0)
            j0.l3 r1 = (j0.l3) r1
            long r2 = r12.i(r10)
            g2.e0 r0 = r12.j()
            long r4 = r0.f349227b
            boolean r5 = a2.m1.g(r4)
            int r0 = z0.t.f550455q1
            z0.p r0 = z0.p.f550454d
            k0.z0 r4 = new k0.z0
            r6 = 0
            r4.<init>(r1, r6)
            z0.t r6 = p1.x0.b(r0, r1, r4)
            r7 = 0
            int r0 = r14 << 3
            r1 = r0 & 112(0x70, float:1.57E-43)
            r4 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r4
            r0 = r0 & 896(0x380, float:1.256E-42)
            r9 = r1 | r0
            r1 = r2
            r3 = r10
            r4 = r11
            r8 = r13
            k0.i.c(r1, r3, r4, r5, r6, r7, r8, r9)
            n0.f4 r13 = r13.q()
            if (r13 != 0) goto L77
            goto L80
        L77:
            k0.a1 r0 = new k0.a1
            r0.<init>(r10, r11, r12, r14)
            n0.l3 r13 = (n0.l3) r13
            r13.f415141d = r0
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.c1.a(boolean, l2.e, k0.y0, n0.o, int):void");
    }

    public static final boolean b(k0.y0 y0Var, boolean z17) {
        boolean z18;
        s1.z zVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(y0Var, "<this>");
        j0.c5 c5Var = y0Var.f384511d;
        if (c5Var == null || (zVar = c5Var.f377771f) == null) {
            z18 = false;
        } else {
            s1.z c17 = s1.a0.c(zVar);
            d1.g b17 = s1.a0.b(zVar);
            float f17 = b17.f307162a;
            float f18 = b17.f307163b;
            u1.c1 c1Var = (u1.c1) c17;
            long u07 = c1Var.u0(d1.f.a(f17, f18));
            float f19 = b17.f307164c;
            long u08 = c1Var.u0(d1.f.a(f19, f18));
            float f27 = b17.f307165d;
            long u09 = c1Var.u0(d1.f.a(f19, f27));
            long u010 = c1Var.u0(d1.f.a(f17, f27));
            float c18 = d1.e.c(u07);
            float[] fArr = {d1.e.c(u08), d1.e.c(u010), d1.e.c(u09)};
            for (int i17 = 0; i17 < 3; i17++) {
                c18 = java.lang.Math.min(c18, fArr[i17]);
            }
            float d17 = d1.e.d(u07);
            float[] fArr2 = {d1.e.d(u08), d1.e.d(u010), d1.e.d(u09)};
            for (int i18 = 0; i18 < 3; i18++) {
                d17 = java.lang.Math.min(d17, fArr2[i18]);
            }
            float c19 = d1.e.c(u07);
            float[] fArr3 = {d1.e.c(u08), d1.e.c(u010), d1.e.c(u09)};
            int i19 = 0;
            for (int i27 = 3; i19 < i27; i27 = 3) {
                c19 = java.lang.Math.max(c19, fArr3[i19]);
                i19++;
            }
            float d18 = d1.e.d(u07);
            z18 = false;
            float[] fArr4 = {d1.e.d(u08), d1.e.d(u010), d1.e.d(u09)};
            for (int i28 = 0; i28 < 3; i28++) {
                d18 = java.lang.Math.max(d18, fArr4[i28]);
            }
            u1.c1 c1Var2 = (u1.c1) zVar;
            long F0 = c1Var2.F0(d1.f.a(c18, d17));
            long F02 = c1Var2.F0(d1.f.a(c19, d18));
            float c27 = d1.e.c(F0);
            float d19 = d1.e.d(F0);
            float c28 = d1.e.c(F02);
            float d27 = d1.e.d(F02);
            long i29 = y0Var.i(z17);
            float c29 = d1.e.c(i29);
            if (c27 <= c29 && c29 <= c28) {
                float d28 = d1.e.d(i29);
                if (d19 <= d28 && d28 <= d27) {
                    return true;
                }
            }
        }
        return z18;
    }
}
