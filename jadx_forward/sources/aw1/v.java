package aw1;

/* loaded from: classes12.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f96228a;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f96229b;

    /* renamed from: c, reason: collision with root package name */
    public static long f96230c;

    /* renamed from: d, reason: collision with root package name */
    public static long[] f96231d;

    static {
        java.util.List i17 = kz5.c0.i(new jz5.l(3, 800L), new jz5.l(47, 500L), new jz5.l(49, 8000L), new jz5.l(285212721, 11000L), new jz5.l(318767153, 17000L), new jz5.l(922746929, 9500L), new jz5.l(822083633, 5800L), new jz5.l(805306417, 12000L), new jz5.l(1090519089, 5000L));
        f96228a = i17;
        int size = i17.size();
        int[] iArr = new int[size];
        for (int i18 = 0; i18 < size; i18++) {
            iArr[i18] = ((java.lang.Number) ((jz5.l) f96228a.get(i18)).f384366d).intValue();
        }
        f96229b = iArr;
        f96231d = new long[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x017d, code lost:
    
        if (r11 == null) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long[] a(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab r23) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw1.v.a(com.tencent.wcdb.support.CancellationSignal):long[]");
    }

    public static final aw1.n b(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        long j17;
        long j18;
        long j19;
        long j27;
        boolean z17;
        android.database.Cursor D2;
        java.lang.Throwable th6;
        android.database.Cursor cursor;
        long j28;
        java.lang.String str;
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab2 = c26987xeef691ab;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d[] c13100x4dbf8b6dArr = new com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d[2];
        for (int i17 = 0; i17 < 2; i17++) {
            c13100x4dbf8b6dArr[i17] = new com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d();
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        try {
            z17 = true;
            D2 = mt1.b0.f412724a.n().D2(new java.lang.String[]{"msgSubType", "diskSpace", "msgId", dm.i4.f66875xa013b0d5, "flags"}, new int[]{3, 23, 1, 20}, c26987xeef691ab2);
        } catch (com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26993xde8292f unused) {
            j17 = 0;
            j18 = 0;
            j19 = 0;
        }
        try {
            q26.n J2 = kz5.n0.J(new aw1.p(D2, hashSet));
            aw1.q qVar = new aw1.q(hashSet);
            r26.t tVar = ot1.d.f430364a;
            q26.j jVar = new q26.j((q26.k) q26.h0.u(q26.h0.u(J2, q26.h0.r(kz5.n0.J(ot1.d.a("c2c_origin_image", null, null, ot1.b.f430362d)), qVar)), q26.h0.r(kz5.n0.J(ot1.d.a("c2c_origin_video", null, null, ot1.c.f430363d)), qVar)));
            long j29 = 0;
            j18 = 0;
            j19 = 0;
            while (jVar.hasNext()) {
                try {
                    try {
                        ot1.h hVar = (ot1.h) jVar.next();
                        if (hVar != null) {
                            if ((c26987xeef691ab2 == null || c26987xeef691ab.m108008xc9602be3() != z17) ? false : z17) {
                                break;
                            }
                            int i18 = hVar.f68224x169c833e;
                            long j37 = hVar.f68219x9f7e1864;
                            try {
                                j28 = hVar.f68223x297eb4f7;
                                java.lang.String str2 = hVar.f68230xdec927b;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                str = str2;
                                cursor = D2;
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                                cursor = D2;
                            }
                            try {
                                long j38 = hVar.f68220x2918cf02;
                                if ((j38 & 2) == 0) {
                                    char c17 = (j38 & 1) != 0 ? (char) 1 : (char) 0;
                                    boolean z18 = (j38 & 4611686018427387904L) != 0;
                                    if (!z18) {
                                        j37 -= yv1.h1.a(i18, j37);
                                    }
                                    long j39 = j37;
                                    if (c17 != 0) {
                                        j29 += j39;
                                    } else {
                                        j18 += j39;
                                    }
                                    if (z18) {
                                        j19 += j39;
                                    }
                                    try {
                                        c13100x4dbf8b6dArr[c17].e(str, j28, j39);
                                    } catch (java.lang.Throwable th8) {
                                        th6 = th8;
                                        j17 = j29;
                                        D2 = cursor;
                                        try {
                                            throw th6;
                                        } finally {
                                            try {
                                            } catch (com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26993xde8292f unused2) {
                                                j27 = j17;
                                                return new aw1.n(j27, j18, j19, c13100x4dbf8b6dArr);
                                            }
                                        }
                                    }
                                }
                            } catch (java.lang.Throwable th9) {
                                th = th9;
                                D2 = cursor;
                                th6 = th;
                                j17 = j29;
                                throw th6;
                            }
                        } else {
                            cursor = D2;
                        }
                        c26987xeef691ab2 = c26987xeef691ab;
                        D2 = cursor;
                        z17 = true;
                    } catch (java.lang.Throwable th10) {
                        th = th10;
                    }
                } catch (java.lang.Throwable th11) {
                    th = th11;
                }
            }
            try {
                vz5.b.a(D2, null);
                j27 = j29;
            } catch (com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26993xde8292f unused3) {
                j17 = j29;
                j27 = j17;
                return new aw1.n(j27, j18, j19, c13100x4dbf8b6dArr);
            }
            return new aw1.n(j27, j18, j19, c13100x4dbf8b6dArr);
        } catch (java.lang.Throwable th12) {
            th6 = th12;
            j17 = 0;
            j18 = 0;
            j19 = 0;
        }
    }

    public static final boolean c() {
        int i17 = com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20272x5c88231b.f273750a;
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20282xb127cf56()) > 0) {
            return j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20272x5c88231b()) > 0;
        }
        return false;
    }

    public static final long d() {
        return (java.lang.System.currentTimeMillis() - f96230c <= 3600000 ? f96231d : a(null))[0];
    }

    public static final boolean e() {
        return j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20282xb127cf56()) > 0;
    }

    public static final void f(yv1.g1 session, aw1.o cb6, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cb6, "cb");
        long[] jArr = new long[4];
        for (int i17 = 0; i17 < 4; i17++) {
            jArr[i17] = 0;
        }
        ((ku5.t0) ku5.t0.f394148d).a(new aw1.r(c26987xeef691ab, session, jArr, z17, cb6));
        ((ku5.t0) ku5.t0.f394148d).a(new aw1.u(c26987xeef691ab, session, jArr, cb6));
    }
}
