package c06;

/* loaded from: classes10.dex */
public final class d extends c06.e implements java.io.Serializable {
    public d(kotlin.jvm.internal.i iVar) {
    }

    @Override // c06.e
    public int a(int i17) {
        return c06.e.f37717e.a(i17);
    }

    @Override // c06.e
    public float b() {
        return c06.e.f37717e.b();
    }

    @Override // c06.e
    public int c() {
        return c06.e.f37717e.c();
    }

    @Override // c06.e
    public int d(int i17) {
        return c06.e.f37717e.d(i17);
    }

    @Override // c06.e
    public int e(int i17, int i18) {
        return c06.e.f37717e.e(i17, i18);
    }

    @Override // c06.e
    public long f() {
        return c06.e.f37717e.f();
    }

    @Override // c06.e
    public long g(long j17) {
        return c06.e.f37717e.g(j17);
    }

    @Override // c06.e
    public long h(long j17, long j18) {
        return c06.e.f37717e.h(j17, j18);
    }

    public double i() {
        return ((c06.a) c06.e.f37717e).i().nextDouble();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double j(double r7, double r9) {
        /*
            r6 = this;
            c06.e r0 = c06.e.f37717e
            r0.getClass()
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r1 <= 0) goto Ld
            r1 = r2
            goto Le
        Ld:
            r1 = r3
        Le:
            if (r1 == 0) goto L64
            double r4 = r9 - r7
            boolean r1 = java.lang.Double.isInfinite(r4)
            if (r1 == 0) goto L4d
            boolean r1 = java.lang.Double.isInfinite(r7)
            if (r1 != 0) goto L26
            boolean r1 = java.lang.Double.isNaN(r7)
            if (r1 != 0) goto L26
            r1 = r2
            goto L27
        L26:
            r1 = r3
        L27:
            if (r1 == 0) goto L4d
            boolean r1 = java.lang.Double.isInfinite(r9)
            if (r1 != 0) goto L36
            boolean r1 = java.lang.Double.isNaN(r9)
            if (r1 != 0) goto L36
            goto L37
        L36:
            r2 = r3
        L37:
            if (r2 == 0) goto L4d
            c06.a r0 = (c06.a) r0
            java.util.Random r0 = r0.i()
            double r0 = r0.nextDouble()
            r2 = 2
            double r2 = (double) r2
            double r4 = r9 / r2
            double r2 = r7 / r2
            double r4 = r4 - r2
            double r0 = r0 * r4
            double r7 = r7 + r0
            goto L58
        L4d:
            c06.a r0 = (c06.a) r0
            java.util.Random r0 = r0.i()
            double r0 = r0.nextDouble()
            double r0 = r0 * r4
        L58:
            double r7 = r7 + r0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L63
            r7 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            double r7 = java.lang.Math.nextAfter(r9, r7)
        L63:
            return r7
        L64:
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            java.lang.Double r8 = java.lang.Double.valueOf(r9)
            java.lang.String r7 = c06.f.b(r7, r8)
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c06.d.j(double, double):double");
    }
}
