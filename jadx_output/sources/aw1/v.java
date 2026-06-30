package aw1;

/* loaded from: classes12.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f14695a;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f14696b;

    /* renamed from: c, reason: collision with root package name */
    public static long f14697c;

    /* renamed from: d, reason: collision with root package name */
    public static long[] f14698d;

    static {
        java.util.List i17 = kz5.c0.i(new jz5.l(3, 800L), new jz5.l(47, 500L), new jz5.l(49, 8000L), new jz5.l(285212721, 11000L), new jz5.l(318767153, 17000L), new jz5.l(922746929, 9500L), new jz5.l(822083633, 5800L), new jz5.l(805306417, 12000L), new jz5.l(1090519089, 5000L));
        f14695a = i17;
        int size = i17.size();
        int[] iArr = new int[size];
        for (int i18 = 0; i18 < size; i18++) {
            iArr[i18] = ((java.lang.Number) ((jz5.l) f14695a.get(i18)).f302833d).intValue();
        }
        f14696b = iArr;
        f14698d = new long[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x017d, code lost:
    
        if (r11 == null) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long[] a(com.tencent.wcdb.support.CancellationSignal r23) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw1.v.a(com.tencent.wcdb.support.CancellationSignal):long[]");
    }

    public static final aw1.n b(com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
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
        com.tencent.wcdb.support.CancellationSignal cancellationSignal2 = cancellationSignal;
        com.tencent.mm.plugin.clean.CleanService$SelectedItems[] cleanService$SelectedItemsArr = new com.tencent.mm.plugin.clean.CleanService$SelectedItems[2];
        for (int i17 = 0; i17 < 2; i17++) {
            cleanService$SelectedItemsArr[i17] = new com.tencent.mm.plugin.clean.CleanService$SelectedItems();
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        try {
            z17 = true;
            D2 = mt1.b0.f331191a.n().D2(new java.lang.String[]{"msgSubType", "diskSpace", "msgId", dm.i4.COL_USERNAME, "flags"}, new int[]{3, 23, 1, 20}, cancellationSignal2);
        } catch (com.tencent.wcdb.support.OperationCanceledException unused) {
            j17 = 0;
            j18 = 0;
            j19 = 0;
        }
        try {
            q26.n J2 = kz5.n0.J(new aw1.p(D2, hashSet));
            aw1.q qVar = new aw1.q(hashSet);
            r26.t tVar = ot1.d.f348831a;
            q26.j jVar = new q26.j((q26.k) q26.h0.u(q26.h0.u(J2, q26.h0.r(kz5.n0.J(ot1.d.a("c2c_origin_image", null, null, ot1.b.f348829d)), qVar)), q26.h0.r(kz5.n0.J(ot1.d.a("c2c_origin_video", null, null, ot1.c.f348830d)), qVar)));
            long j29 = 0;
            j18 = 0;
            j19 = 0;
            while (jVar.hasNext()) {
                try {
                    try {
                        ot1.h hVar = (ot1.h) jVar.next();
                        if (hVar != null) {
                            if ((cancellationSignal2 == null || cancellationSignal.isCanceled() != z17) ? false : z17) {
                                break;
                            }
                            int i18 = hVar.field_msgSubType;
                            long j37 = hVar.field_diskSpace;
                            try {
                                j28 = hVar.field_msgId;
                                java.lang.String str2 = hVar.field_username;
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
                                long j38 = hVar.field_flags;
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
                                        cleanService$SelectedItemsArr[c17].e(str, j28, j39);
                                    } catch (java.lang.Throwable th8) {
                                        th6 = th8;
                                        j17 = j29;
                                        D2 = cursor;
                                        try {
                                            throw th6;
                                        } finally {
                                            try {
                                            } catch (com.tencent.wcdb.support.OperationCanceledException unused2) {
                                                j27 = j17;
                                                return new aw1.n(j27, j18, j19, cleanService$SelectedItemsArr);
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
                        cancellationSignal2 = cancellationSignal;
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
            } catch (com.tencent.wcdb.support.OperationCanceledException unused3) {
                j17 = j29;
                j27 = j17;
                return new aw1.n(j27, j18, j19, cleanService$SelectedItemsArr);
            }
            return new aw1.n(j27, j18, j19, cleanService$SelectedItemsArr);
        } catch (java.lang.Throwable th12) {
            th6 = th12;
            j17 = 0;
            j18 = 0;
            j19 = 0;
        }
    }

    public static final boolean c() {
        int i17 = com.tencent.mm.repairer.config.global.RepairerConfigGlobalStorageCleanConfirmEnhance.f192217a;
        if (j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigGlobalStorageOtherResAndAccSeparating()) > 0) {
            return j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigGlobalStorageCleanConfirmEnhance()) > 0;
        }
        return false;
    }

    public static final long d() {
        return (java.lang.System.currentTimeMillis() - f14697c <= 3600000 ? f14698d : a(null))[0];
    }

    public static final boolean e() {
        return j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigGlobalStorageOtherResAndAccSeparating()) > 0;
    }

    public static final void f(yv1.g1 session, aw1.o cb6, com.tencent.wcdb.support.CancellationSignal cancellationSignal, boolean z17) {
        kotlin.jvm.internal.o.g(session, "session");
        kotlin.jvm.internal.o.g(cb6, "cb");
        long[] jArr = new long[4];
        for (int i17 = 0; i17 < 4; i17++) {
            jArr[i17] = 0;
        }
        ((ku5.t0) ku5.t0.f312615d).a(new aw1.r(cancellationSignal, session, jArr, z17, cb6));
        ((ku5.t0) ku5.t0.f312615d).a(new aw1.u(cancellationSignal, session, jArr, cb6));
    }
}
