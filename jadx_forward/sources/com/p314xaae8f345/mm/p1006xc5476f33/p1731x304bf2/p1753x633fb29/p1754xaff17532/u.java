package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532;

/* loaded from: classes8.dex */
public abstract class u {
    public static void a(java.lang.String str, int i17, int i18) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.k.a(str);
        if (a17 != null) {
            long j17 = a17.f178494d;
            if (j17 > 0) {
                java.lang.String str2 = a17.f178495e;
                long j18 = a17.f178501n;
                b(str, j17, str2, j18 == 0 ? 0 : (int) ((a17.f178500m * 100) / j18), i17, i18, false, false, false, false, false, null);
                return;
            }
        }
        b(str, 0L, "", 0, i17, i18, false, false, false, false, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d8 A[LOOP:0: B:16:0x00d6->B:17:0x00d8, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(java.lang.String r15, long r16, java.lang.String r18, int r19, int r20, int r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26, java.util.Map r27) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.u.b(java.lang.String, long, java.lang.String, int, int, int, boolean, boolean, boolean, boolean, boolean, java.util.Map):void");
    }

    public static void c(java.lang.String str, int i17, int i18) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().y0(str) == null) {
            return;
        }
        a(str, i17, i18);
    }

    public static void d(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.k.a(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.n y07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().y0(str);
        if (a17 != null) {
            long j17 = a17.f178494d;
            if (j17 > 0) {
                if (y07 != null) {
                    java.lang.String str2 = a17.f178495e;
                    long j18 = a17.f178501n;
                    b(str, j17, str2, j18 == 0 ? 0 : (int) ((a17.f178500m * 100) / j18), 3, 0, y07.f68751x7cd975b, y07.f68750x43a9e7a7, y07.f68749x2745fa70, y07.f68746xaaf5307e, y07.f68738x7dba297, null);
                    return;
                } else {
                    java.lang.String str3 = a17.f178495e;
                    long j19 = a17.f178501n;
                    b(str, j17, str3, j19 == 0 ? 0 : (int) ((a17.f178500m * 100) / j19), 3, 0, false, false, false, false, false, null);
                    return;
                }
            }
        }
        if (y07 != null) {
            b(str, 0L, "", 0, 3, 0, y07.f68751x7cd975b, y07.f68750x43a9e7a7, y07.f68749x2745fa70, y07.f68746xaaf5307e, y07.f68738x7dba297, null);
        } else {
            b(str, 0L, "", 0, 3, 0, false, false, false, false, false, null);
        }
    }
}
