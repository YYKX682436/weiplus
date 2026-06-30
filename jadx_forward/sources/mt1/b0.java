package mt1;

/* loaded from: classes12.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final mt1.b0 f412724a = new mt1.b0();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f412725b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f412726c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f412727d;

    /* renamed from: e, reason: collision with root package name */
    public static mt1.e f412728e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashSet f412729f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f412730g;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f412731h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f412732i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f412733j;

    /* renamed from: k, reason: collision with root package name */
    public static volatile boolean f412734k;

    /* renamed from: l, reason: collision with root package name */
    public static volatile long f412735l;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f412736m;

    /* renamed from: n, reason: collision with root package name */
    public static final mt1.g f412737n;

    static {
        jz5.i iVar = jz5.i.f384362d;
        f412725b = jz5.h.a(iVar, mt1.j.f412763d);
        f412726c = jz5.h.a(iVar, mt1.l.f412769d);
        f412727d = jz5.h.b(mt1.a0.f412722d);
        f412729f = new java.util.HashSet();
        f412731h = jz5.h.b(mt1.n.f412774d);
        f412734k = true;
        f412737n = new mt1.g();
        mt1.n0.f412775a.size();
    }

    public static final void a(mt1.b0 b0Var, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        b0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CalcWxNewService", "run TaskId_AutoCleanCache");
        ((yv1.h) ((zv1.f1) i95.n0.c(zv1.f1.class))).Bi(c26987xeef691ab);
    }

    public static final java.util.Set b(mt1.b0 b0Var) {
        b0Var.getClass();
        return (java.util.Set) f412725b.mo141623x754a37bb();
    }

    public static final uq3.g c(mt1.b0 b0Var) {
        b0Var.getClass();
        return (uq3.g) f412726c.mo141623x754a37bb();
    }

    public static final boolean e(mt1.b0 b0Var, java.lang.String str) {
        b0Var.getClass();
        return r26.n0.D(str, "image2/", false, 2, null) || r26.n0.D(str, "video/", false, 2, null) || r26.n0.D(str, "record/", false, 2, null) || r26.n0.D(str, "attachment/", false, 2, null);
    }

    public static final void f(mt1.b0 b0Var, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        boolean z17;
        jz5.l lVar;
        b0Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long b27 = (b0Var.n().b2(6, 0L) + 259200000) - currentTimeMillis;
        if (z65.c.a()) {
            z17 = true;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        if (!z17 && b27 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CalcWxNewService", "Skip refresh invalid files because interval not match. (" + (b27 / com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8) + " min remaining)");
            return;
        }
        java.util.concurrent.ArrayBlockingQueue arrayBlockingQueue = new java.util.concurrent.ArrayBlockingQueue(100);
        wu5.c a17 = ((ku5.t0) ku5.t0.f394148d).a(new mt1.o(b0Var.n().f430382d, arrayBlockingQueue));
        ot1.j n17 = b0Var.n();
        java.lang.String[] strArr = {com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "msgId", "msgSubType"};
        d95.b0 b0Var2 = n17.f430382d;
        java.lang.String join = android.text.TextUtils.join(",", strArr);
        android.database.Cursor o17 = b0Var2.o(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26954x879c8aeb.f58282xe9b6bcea, "SELECT " + join + " FROM WxFileIndex3", null, "WxFileIndex3", c26987xeef691ab);
        while (o17.moveToNext()) {
            try {
                try {
                    try {
                        if (ot1.h.w0(ot1.h.Q, o17.getInt(2))) {
                            arrayBlockingQueue.put(new jz5.l(o17.getString(0), java.lang.Long.valueOf(o17.getLong(1))));
                        }
                    } catch (com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26993xde8292f unused) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CalcWxNewService", "refreshInvalidFiles canceled");
                        lVar = new jz5.l(null, 0L);
                    }
                } catch (java.lang.Throwable th6) {
                    arrayBlockingQueue.put(new jz5.l(null, 0L));
                    throw th6;
                }
            } catch (java.lang.Throwable th7) {
                try {
                    throw th7;
                } catch (java.lang.Throwable th8) {
                    vz5.b.a(o17, th7);
                    throw th8;
                }
            }
        }
        lVar = new jz5.l(null, 0L);
        arrayBlockingQueue.put(lVar);
        vz5.b.a(o17, null);
        a17.get();
        b0Var.n().f3(6, java.lang.Long.valueOf(currentTimeMillis));
    }

    public static final void g(mt1.b0 b0Var, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        b0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CalcWxNewService", "Begin refresh UUIDs");
        android.database.Cursor o17 = b0Var.n().f430382d.o(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26954x879c8aeb.f58282xe9b6bcea, "SELECT group_concat(rowid), group_concat(path, '|'), group_concat(CASE WHEN linkUUID IS NULL THEN '0' ELSE '1' END), count(path) AS cnt, size FROM WxFileIndex3 GROUP BY size HAVING cnt > 1 AND cnt > count(linkUUID)", null, "WxFileIndex3", c26987xeef691ab);
        while (o17.moveToNext()) {
            try {
                if (c26987xeef691ab != null) {
                    c26987xeef691ab.m108011xf4ed245c();
                }
                java.lang.String string = o17.getString(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                java.util.List y17 = q26.h0.y(q26.h0.o(r26.n0.g0(string, new char[]{','}, false, 0, 6, null), mt1.r.f412793d));
                java.lang.String string2 = o17.getString(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                java.util.List e07 = r26.n0.e0(string2, new char[]{'|'}, false, 0, 6, null);
                java.lang.String string3 = o17.getString(2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                java.util.List y18 = q26.h0.y(q26.h0.o(r26.n0.g0(string3, new char[]{','}, false, 0, 6, null), mt1.q.f412790d));
                if (y17.size() != e07.size() || y17.size() != y18.size()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CalcWxNewService", "List size not matched: " + y17.size() + " <-> " + e07.size());
                }
                int size = e07.size();
                for (int i17 = 0; i17 < size; i17++) {
                    if (!((java.lang.Boolean) y18.get(i17)).booleanValue()) {
                        if (c26987xeef691ab != null) {
                            c26987xeef691ab.m108011xf4ed245c();
                        }
                        com.p314xaae8f345.mm.vfs.x1 m17 = com.p314xaae8f345.mm.vfs.w6.m(ot1.h.u0((java.lang.String) e07.get(i17)));
                        com.p314xaae8f345.mm.vfs.k5 k5Var = m17 instanceof com.p314xaae8f345.mm.vfs.k5 ? (com.p314xaae8f345.mm.vfs.k5) m17 : null;
                        if (k5Var != null) {
                            ((ku5.t0) ku5.t0.f394148d).b(new mt1.p(e07, i17, ((java.lang.Number) y17.get(i17)).longValue(), java.util.UUID.fromString(k5Var.f294562h), k5Var), "WxIdxRefreshUUID");
                        }
                    }
                }
            } finally {
            }
        }
        vz5.b.a(o17, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [d95.b0] */
    /* JADX WARN: Type inference failed for: r0v25, types: [com.tencent.mm.sdk.platformtools.o4] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.String[]] */
    public static final void h(mt1.b0 b0Var, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        ?? r96;
        char c17;
        char c18;
        ?? r97;
        char c19;
        int i17;
        java.lang.Throwable th6;
        b0Var.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_SCAN_CURSOR_LONG_SYNC;
        java.lang.Integer[] numArr = mt1.e0.f412748c;
        int i18 = 0;
        boolean i19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().i("scanAndRescueC2CDoneBefore", false);
        long t17 = gm0.j1.u().c().t(u3Var, Long.MIN_VALUE);
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c27 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_SCAN_DONE_LONG_SYNC;
        long t18 = c27.t(u3Var2, Long.MIN_VALUE);
        if (t18 <= 0) {
            try {
                long j17 = t18;
                android.database.Cursor f17 = b0Var.n().f430382d.f("SELECT max(rowId) FROM WxFileIndex3", null, 0);
                try {
                    if (f17.moveToFirst()) {
                        j17 = f17.getLong(0);
                    }
                    vz5.b.a(f17, null);
                    if (j17 > 0) {
                        gm0.j1.u().c().x(u3Var2, java.lang.Long.valueOf(j17));
                        t18 = j17;
                    }
                } finally {
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CalcWxNewService", e17, "Cannot get max rowId", new java.lang.Object[0]);
            }
            t18 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        }
        int i27 = 3;
        if (i19 && t17 >= t18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CalcWxNewService", "Scan and rescue done before, skip. (" + t17 + " / " + t18 + ')');
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c28 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var3 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_C2C_OTHER_ACCOUNT_WRONG_MIGRANT_INT_SYNC;
            if (c28.r(u3Var3, 0) != 3 || c28.t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_RESCUE_CURSOR_LONG_SYNC, Long.MIN_VALUE) < t18) {
                return;
            }
            c28.x(u3Var3, 4);
            return;
        }
        long j18 = Long.MIN_VALUE;
        java.lang.String D = lp0.b.D();
        try {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CalcWxNewService", "Scan and rescue begin (" + t17 + " / " + t18 + ')');
                jx3.f.INSTANCE.t(1912, numArr[0].intValue());
                ?? r07 = b0Var.n().f430382d;
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26954x879c8aeb.f58282xe9b6bcea;
                r96 = new java.lang.String[]{java.lang.String.valueOf(t17), java.lang.String.valueOf(t18)};
                android.database.Cursor o17 = r07.o(cursorFactory, "SELECT rowId, path, size FROM WxFileIndex3 WHERE rowId > ? AND rowId <= ? ORDER BY rowId ASC", r96, "WxFileIndex3", c26987xeef691ab);
                try {
                    if (o17 != null) {
                        int i28 = 0;
                        int i29 = 0;
                        while (o17.moveToNext()) {
                            try {
                                j18 = o17.getLong(i18);
                                java.lang.String string = o17.getString(1);
                                java.lang.String str = D;
                                try {
                                    long j19 = o17.getLong(2);
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                    sb6.append(str);
                                    sb6.append(string);
                                    i17 = i29;
                                    try {
                                        i29 = com.p314xaae8f345.mm.vfs.q7.g(sb6.toString(), j19, 0, true) ? 1 : i17;
                                        if (c26987xeef691ab != null) {
                                            try {
                                                c26987xeef691ab.m108011xf4ed245c();
                                            } catch (java.lang.Throwable th7) {
                                                th = th7;
                                                th6 = th;
                                                try {
                                                    throw th6;
                                                } catch (java.lang.Throwable th8) {
                                                    vz5.b.a(o17, th6);
                                                    throw th8;
                                                }
                                            }
                                        }
                                        int i37 = i28 + 1;
                                        if (i28 >= 64) {
                                            gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(j18));
                                        }
                                        i28 = i37;
                                        D = str;
                                        i18 = 0;
                                    } catch (java.lang.Throwable th9) {
                                        th = th9;
                                        th6 = th;
                                        throw th6;
                                    }
                                } catch (java.lang.Throwable th10) {
                                    th = th10;
                                }
                            } catch (java.lang.Throwable th11) {
                                th = th11;
                                i17 = i29;
                            }
                        }
                        int i38 = i29;
                        try {
                            vz5.b.a(o17, null);
                            r97 = i38;
                        } catch (com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26993xde8292f unused) {
                            r96 = i38;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CalcWxNewService", "Scan and rescue cancelled.");
                            jx3.f fVar = jx3.f.INSTANCE;
                            fVar.t(1912, numArr[3].intValue());
                            gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(j18));
                            if (r96 != 0) {
                                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_C2C_OTHER_ACCOUNT_WRONG_MIGRANT_INT_SYNC, 4);
                                c18 = 1;
                                fVar.t(1912, numArr[1].intValue());
                            } else {
                                c18 = 1;
                            }
                            java.lang.Object[] objArr = new java.lang.Object[13];
                            objArr[0] = "@WrongMigration-oneShotScan";
                            objArr[c18] = 0;
                            objArr[2] = java.lang.Integer.valueOf((int) r96);
                            objArr[3] = "";
                            objArr[4] = 0;
                            objArr[5] = 0;
                            objArr[6] = 0;
                            objArr[7] = 0;
                            objArr[8] = 0;
                            objArr[9] = 0;
                            objArr[10] = 0;
                            objArr[11] = 0;
                            objArr[12] = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e;
                            fVar.d(21388, objArr);
                            return;
                        } catch (java.lang.Throwable th12) {
                            th = th12;
                            i27 = i38;
                            gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(j18));
                            if (i27 != 0) {
                                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_C2C_OTHER_ACCOUNT_WRONG_MIGRANT_INT_SYNC, 4);
                                c17 = 1;
                                jx3.f.INSTANCE.t(1912, numArr[1].intValue());
                            } else {
                                c17 = 1;
                            }
                            jx3.f fVar2 = jx3.f.INSTANCE;
                            java.lang.Object[] objArr2 = new java.lang.Object[13];
                            objArr2[0] = "@WrongMigration-oneShotScan";
                            objArr2[c17] = 0;
                            objArr2[2] = java.lang.Integer.valueOf(i27);
                            objArr2[3] = "";
                            objArr2[4] = 0;
                            objArr2[5] = 0;
                            objArr2[6] = 0;
                            objArr2[7] = 0;
                            objArr2[8] = 0;
                            objArr2[9] = 0;
                            objArr2[10] = 0;
                            objArr2[11] = 0;
                            objArr2[12] = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e;
                            fVar2.d(21388, objArr2);
                            throw th;
                        }
                    } else {
                        r97 = 0;
                    }
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("C2CErrorToBeRescued", r97);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("scanAndRescueC2CDoneBefore", true);
                    if (j18 < t18) {
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_SCAN_DONE_LONG_SYNC, java.lang.Long.valueOf(j18));
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CalcWxNewService", "Scan and rescue succeeded, rescued = " + r97 + '.');
                    jx3.f fVar3 = jx3.f.INSTANCE;
                    fVar3.t(1912, numArr[2].intValue());
                    gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(j18));
                    if (r97 != 0) {
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_C2C_OTHER_ACCOUNT_WRONG_MIGRANT_INT_SYNC, 4);
                        c19 = 1;
                        fVar3.t(1912, numArr[1].intValue());
                    } else {
                        c19 = 1;
                    }
                    java.lang.Object[] objArr3 = new java.lang.Object[13];
                    objArr3[0] = "@WrongMigration-oneShotScan";
                    objArr3[c19] = 0;
                    objArr3[2] = java.lang.Integer.valueOf((int) r97);
                    objArr3[3] = "";
                    objArr3[4] = 0;
                    objArr3[5] = 0;
                    objArr3[6] = 0;
                    objArr3[7] = 0;
                    objArr3[8] = 0;
                    objArr3[9] = 0;
                    objArr3[10] = 0;
                    objArr3[11] = 0;
                    objArr3[12] = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e;
                    fVar3.d(21388, objArr3);
                } catch (com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26993xde8292f unused2) {
                }
            } catch (java.lang.Throwable th13) {
                th = th13;
            }
        } catch (com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26993xde8292f unused3) {
            r96 = 0;
        } catch (java.lang.Throwable th14) {
            th = th14;
            i27 = 0;
        }
    }

    public static final void s(int i17, long j17, java.lang.Long... size) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(size, "size");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CalcWxNewService", ">> SCENE " + i17 + ": (" + j17 + ") " + kz5.z.d0(size, ", ", null, null, 0, null, null, 62, null));
        jx3.f fVar = jx3.f.INSTANCE;
        p3321xbce91901.jvm.p3324x21ffc6bd.l0 l0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.l0(3);
        l0Var.a(java.lang.Integer.valueOf(i17));
        l0Var.a(java.lang.Long.valueOf(j17));
        l0Var.b(size);
        fVar.d(25464, l0Var.d(new java.lang.Object[l0Var.c()]));
    }

    public final boolean A() {
        boolean z17 = !(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20286xc81bd6f0()) > 0) && (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20289x1c926345()) == 1 || j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20285x33ab383c()) > 0);
        boolean Vi = ((yv1.b1) ((c01.f8) i95.n0.c(c01.f8.class))).Vi();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CalcWxNewService", "tryCreateThirdIndex: clicfg=" + z17 + ", hasIndex=" + Vi);
        if (z17) {
            java.lang.String[] INDEX_CREATE_3RD = ot1.j.f430381n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(INDEX_CREATE_3RD, "INDEX_CREATE_3RD");
            if (j("WxFileIndex3rdIndex", kz5.z.z0(INDEX_CREATE_3RD), !Vi)) {
                ((yv1.b1) ((c01.f8) i95.n0.c(c01.f8.class))).getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanService", "setHasThirdIndex: true");
                yv1.b1.f547530e.a().putBoolean("WxFileIndex3rdIndex", true);
                return true;
            }
        }
        return false;
    }

    public final void B(boolean z17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        int b27 = (int) n().b2(5, 0L);
        int i17 = 4;
        if (b27 >= 4) {
            return;
        }
        if (z17 && (i17 = mt1.n0.f412776b) < b27) {
            i17 = b27;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Need upgrade, ");
        sb6.append(z17 ? "[CRITICAL] " : "");
        sb6.append(' ');
        sb6.append(b27);
        sb6.append(" -> ");
        sb6.append(i17);
        sb6.append(" (4)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CalcWxNewService", sb6.toString());
        int i18 = b27;
        while (i18 < i17) {
            if (c26987xeef691ab != null) {
                try {
                    c26987xeef691ab.m108011xf4ed245c();
                } catch (com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26993xde8292f unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CalcWxNewService", "Upgrade cancelled.");
                    return;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CalcWxNewService", e17, "Upgrade failed.", new java.lang.Object[0]);
                    return;
                }
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append("Upgrade DB version ");
            sb7.append(i18);
            sb7.append(" -> ");
            int i19 = i18 + 1;
            sb7.append(i19);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CalcWxNewService", sb7.toString());
            yz5.q qVar = (yz5.q) ((jz5.l) mt1.n0.f412775a.get(i18)).f384367e;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(b27);
            ot1.j n17 = n();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "<get-wxFileIndexStorage>(...)");
            qVar.mo147xb9724478(valueOf, n17, c26987xeef691ab);
            n().f3(5, java.lang.Integer.valueOf(i19));
            i18 = i19;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CalcWxNewService", "Done upgrade.");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x014e A[Catch: Exception -> 0x0151, all -> 0x01c2, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x000c, B:6:0x0013, B:9:0x001b, B:11:0x0029, B:15:0x0032, B:23:0x0067, B:25:0x006d, B:27:0x0070, B:29:0x0099, B:33:0x00a1, B:61:0x0148, B:63:0x014e, B:65:0x0151, B:67:0x017a, B:80:0x01b8, B:71:0x0182, B:73:0x0190, B:75:0x0198, B:77:0x01ab, B:79:0x01b3, B:42:0x00d9, B:44:0x00df, B:46:0x00e2, B:48:0x010b, B:51:0x0113, B:54:0x0127, B:57:0x0140, B:87:0x01b9, B:18:0x003c, B:19:0x0043, B:21:0x0049), top: B:3:0x000c, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0182 A[Catch: all -> 0x01c2, TryCatch #2 {, blocks: (B:4:0x000c, B:6:0x0013, B:9:0x001b, B:11:0x0029, B:15:0x0032, B:23:0x0067, B:25:0x006d, B:27:0x0070, B:29:0x0099, B:33:0x00a1, B:61:0x0148, B:63:0x014e, B:65:0x0151, B:67:0x017a, B:80:0x01b8, B:71:0x0182, B:73:0x0190, B:75:0x0198, B:77:0x01ab, B:79:0x01b3, B:42:0x00d9, B:44:0x00df, B:46:0x00e2, B:48:0x010b, B:51:0x0113, B:54:0x0127, B:57:0x0140, B:87:0x01b9, B:18:0x003c, B:19:0x0043, B:21:0x0049), top: B:3:0x000c, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[Catch: all -> 0x01c2, SYNTHETIC, TryCatch #2 {, blocks: (B:4:0x000c, B:6:0x0013, B:9:0x001b, B:11:0x0029, B:15:0x0032, B:23:0x0067, B:25:0x006d, B:27:0x0070, B:29:0x0099, B:33:0x00a1, B:61:0x0148, B:63:0x014e, B:65:0x0151, B:67:0x017a, B:80:0x01b8, B:71:0x0182, B:73:0x0190, B:75:0x0198, B:77:0x01ab, B:79:0x01b3, B:42:0x00d9, B:44:0x00df, B:46:0x00e2, B:48:0x010b, B:51:0x0113, B:54:0x0127, B:57:0x0140, B:87:0x01b9, B:18:0x003c, B:19:0x0043, B:21:0x0049), top: B:3:0x000c, inners: #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(java.lang.String r17, java.util.List r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mt1.b0.j(java.lang.String, java.util.List, boolean):boolean");
    }

    public final java.lang.Object[] k(java.util.List list) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!r26.n0.D(str, "Download/", false, 2, null) || (str = com.p314xaae8f345.mm.vfs.w6.i(ot1.h.u0(str), true)) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CalcWxNewService", "findDup fullPath = ".concat(str));
                if (!linkedHashSet.add(str)) {
                    i17 = arrayList.contains(str) ? i17 + 1 : i17 + 2;
                    arrayList.add(str);
                }
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = arrayList;
        objArr[1] = java.lang.Boolean.valueOf(list.size() - i17 >= 2);
        return objArr;
    }

    public final void l(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null || f9Var.m124847x74d37ac6() == 0) {
            return;
        }
        java.util.Map map = mt1.e0.f412746a;
        nt1.c cVar = (nt1.c) map.get(java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0()));
        if (cVar == null) {
            cVar = (nt1.c) map.get(java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.c(f9Var.mo78013xfb85f7b0())));
        }
        java.util.List b17 = cVar != null ? cVar.b(f9Var) : null;
        if (b17 == null) {
            b17 = kz5.p0.f395529d;
        }
        ot1.j n17 = n();
        java.lang.String Q0 = f9Var.Q0();
        long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
        n17.getClass();
        if (Q0 == null || Q0.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxFileIndexStorage", "updateIndicesByMsgId with empty username, msgId: " + m124847x74d37ac6 + ", aborting");
            return;
        }
        d95.b0 b0Var = n17.f430382d;
        b0Var.b();
        try {
            b0Var.j("WxFileIndex3", "DELETE FROM WxFileIndex3 WHERE msgId = ? AND username = ?", new java.lang.Object[]{java.lang.Long.valueOf(m124847x74d37ac6), Q0}, null);
            java.util.Iterator it = b17.iterator();
            while (it.hasNext()) {
                b0Var.l("WxFileIndex3", "msgId", ((ot1.h) it.next()).mo9763xeb27878e());
            }
            n17.O2(Q0, m124847x74d37ac6, false, null);
        } finally {
            b0Var.t();
        }
    }

    public final java.lang.String m(java.lang.String str) {
        java.lang.String q17 = com.p314xaae8f345.mm.vfs.w6.q(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q17);
        if (!r26.n0.B(q17, "/", false)) {
            return q17;
        }
        java.lang.String substring = q17.substring(r26.n0.O(q17, '/', 0, false, 6, null) + 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        return substring;
    }

    public final ot1.j n() {
        return (ot1.j) ((jz5.n) f412727d).mo141623x754a37bb();
    }

    /* JADX WARN: Code restructure failed: missing block: B:215:0x0a2f, code lost:
    
        r60 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0a34, code lost:
    
        vz5.b.a(r73, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0a3b, code lost:
    
        if (r24 <= 0) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0a3d, code lost:
    
        jx3.f.INSTANCE.d(26980, 400, java.lang.Long.valueOf(r24), java.lang.Long.valueOf(r26), "", "", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0a8f, code lost:
    
        if (r10 <= 0) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0a91, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CalcWxNewService", "did linkify, the count : " + r10 + ", the size : " + r12 + ", won't report duplicate file");
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0ab6, code lost:
    
        if (mt1.b0.f412733j == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0aba, code lost:
    
        if (r12 <= 1073741824) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0ac8, code lost:
    
        if (mt1.b0.f412733j == false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0aca, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0acd, code lost:
    
        jx3.f.INSTANCE.d(26980, 200, java.lang.Long.valueOf(r10), java.lang.Long.valueOf(r12), "", "", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - r81), "total", java.lang.Integer.valueOf(r2), java.lang.Long.valueOf(r30), java.lang.Long.valueOf(r32), java.lang.Long.valueOf(r34), java.lang.Long.valueOf(r36), java.lang.Long.valueOf(r38), java.lang.Long.valueOf(r40), java.lang.Long.valueOf(r42), java.lang.Long.valueOf(r58));
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0b40, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0acc, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0abc, code lost:
    
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("LastScanIsLinkify", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0b43, code lost:
    
        if (mt1.b0.f412733j == false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0b45, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CalcWxNewService", "willBreakLinkify is true, not report duplicate file");
        mt1.b0.f412733j = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0b51, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0b52, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0b53, code lost:
    
        mt1.b0.f412733j = false;
        r2 = n().d1(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0b5d, code lost:
    
        r10 = 0;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0b65, code lost:
    
        if (r2.moveToNext() == false) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0b67, code lost:
    
        r10 = r2.getLong(r3);
        r12 = r2.getLong(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0b70, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0b73, code lost:
    
        vz5.b.a(r2, null);
        r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("extreme_storage_wechat_total", -1);
        r7 = 100;
        r6 = (int) ((((float) r4) / ((float) r10)) * r7);
        r6 = (float) r8;
        r12 = (int) ((r6 / ((float) r12)) * r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0b98, code lost:
    
        if (r2 == (-1)) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0b9a, code lost:
    
        r6 = (int) ((r6 / ((float) r2)) * r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0ba0, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CalcWxNewService", "allDuplicatedFileCount = " + r14 + ", allDuplicatedDiskSpace = " + r8 + ", wechatTotalSizeSubCoreMonitor = " + r2 + ", fileDiskSpaceWechatRatio = " + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0bd0, code lost:
    
        if (r8 <= 1073741824) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0bd2, code lost:
    
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("extreme_storage_duplicate_total_space", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0beb, code lost:
    
        if (r60 <= 524288000) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0bed, code lost:
    
        r36 = r14;
        r13 = r60;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("extreme_storage_duplicate_image2_space", r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0c0e, code lost:
    
        if (r22 <= 524288000) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0c10, code lost:
    
        r38 = r2;
        r2 = r22;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("extreme_storage_duplicate_video_space", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0c31, code lost:
    
        if (r20 <= 524288000) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0c33, code lost:
    
        r22 = r8;
        r8 = r20;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("extreme_storage_duplicate_record_space", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0c54, code lost:
    
        if (r56 <= 524288000) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0c56, code lost:
    
        r20 = r4;
        r4 = r56;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("extreme_storage_duplicate_attachment_space", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0c77, code lost:
    
        if (r48 <= 524288000) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0c79, code lost:
    
        r56 = r4;
        r4 = r48;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("extreme_storage_duplicate_download_space", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0c95, code lost:
    
        r12 = r6;
        r6 = java.lang.System.currentTimeMillis() - r81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0c9e, code lost:
    
        if (mt1.b0.f412732i == false) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0ca0, code lost:
    
        r15 = "DuplicateFileScanAL-v3";
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0ca5, code lost:
    
        jx3.f.INSTANCE.d(25355, r15, java.lang.Long.valueOf(r10), java.lang.Long.valueOf(r13), java.lang.Long.valueOf(r2), java.lang.Long.valueOf(r54), java.lang.Long.valueOf(r8), java.lang.Long.valueOf(r20), java.lang.Integer.valueOf(r6), java.lang.Long.valueOf(r52), java.lang.Long.valueOf(r56), java.lang.Long.valueOf(r46), java.lang.Long.valueOf(r50), java.lang.Long.valueOf(r22), java.lang.Integer.valueOf(r12), java.lang.Long.valueOf(r4), java.lang.Long.valueOf(r44), java.lang.Long.valueOf(r38), java.lang.Integer.valueOf(r12), java.lang.Long.valueOf(r36), java.lang.Long.valueOf(r6), java.lang.Long.valueOf(r13), java.lang.Long.valueOf(r2), java.lang.Long.valueOf(r54), java.lang.Long.valueOf(r8), java.lang.Long.valueOf(r28));
        r6 = new org.json.JSONObject();
        r6.put("allFileSize", r10);
        r6.put("v3", true);
        r6.put("image2DuplicateFileDiskSpace", r13);
        r6.put("videoDuplicateFileDiskSpace", r2);
        r6.put("voice2DuplicateFileDiskSpace", r54);
        r6.put("recordDuplicateFileDiskSpace", r8);
        r6.put("allDuplicatedFileSize", r20);
        r6.put("fileSizeRatio", r6);
        r6.put("openapiDuplicateFileDiskSpace", r52);
        r6.put("attachmentDuplicateFileDiskSpace", r56);
        r6.put("emulatedDuplicateFileDiskSpace", r46);
        r6.put("favoriteDuplicateFileDiskSpace", r50);
        r6.put("allDuplicatedDiskSpace", r22);
        r6.put("fileDiskSpaceRatio", r12);
        r6.put("downloadDuplicateFileDiskSpace", r4);
        r6.put("otherDuplicateFileDiskSpace", r44);
        r6.put("wechatTotalSize", r38);
        r6.put("fileDiskSpaceWechatRatio", r12);
        r6.put("allDuplicatedFileCount", r36);
        r6.put("duplicateFileTotalSize", r28);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().D("DuplicateFileDailyReport", r6.toString());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("LastScanIsLinkify", false);
        n().f3(65536, java.lang.Long.valueOf(r79));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CalcWxNewService", "handleDuplicated done, duration = " + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0e2c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0ca3, code lost:
    
        r15 = "DuplicateFileScan-v3";
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0c87, code lost:
    
        r56 = r4;
        r4 = r48;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("extreme_storage_duplicate_download_space", -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0c64, code lost:
    
        r20 = r4;
        r4 = r56;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("extreme_storage_duplicate_attachment_space", -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0c41, code lost:
    
        r22 = r8;
        r8 = r20;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("extreme_storage_duplicate_record_space", -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0c1e, code lost:
    
        r38 = r2;
        r2 = r22;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("extreme_storage_duplicate_video_space", -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0bfb, code lost:
    
        r36 = r14;
        r13 = r60;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("extreme_storage_duplicate_image2_space", -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0bdc, code lost:
    
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("extreme_storage_duplicate_total_space", -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0b9f, code lost:
    
        r6 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0e2d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x09e9, code lost:
    
        r73 = r3;
        r78 = r4;
        r79 = r10;
        r81 = r15;
        r8 = r44;
        r6 = r46;
        r44 = r48;
        r12 = r50;
        r10 = r54;
        r46 = r58;
        r50 = r60;
        r48 = r62;
        r14 = r64;
        r4 = r66;
        r54 = r52;
        r52 = r68;
        r56 = r56;
        r58 = r42;
        r2 = r78;
        r42 = r40;
        r40 = r38;
        r38 = r36;
        r36 = r34;
        r34 = r32;
        r32 = r30;
        r30 = r28;
        r28 = r26;
        r26 = r24;
        r24 = r22;
        r22 = r12;
        r12 = r20;
        r20 = r10;
        r10 = r13;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:163:0x07f6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:98:0x045c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x052b A[Catch: all -> 0x043e, TryCatch #6 {all -> 0x043e, blocks: (B:58:0x01ab, B:60:0x0203, B:61:0x0234, B:64:0x0249, B:69:0x0587, B:70:0x025e, B:72:0x0266, B:73:0x0281, B:75:0x028d, B:76:0x02be, B:78:0x02cc, B:81:0x02d8, B:84:0x02de, B:86:0x02f1, B:88:0x0352, B:90:0x035f, B:91:0x0379, B:94:0x038a, B:96:0x03e2, B:97:0x0458, B:98:0x045c, B:102:0x052b, B:103:0x0534, B:105:0x053a, B:107:0x0550, B:110:0x0567, B:111:0x0571, B:113:0x057d, B:118:0x0469, B:121:0x0475, B:123:0x0492, B:125:0x04aa, B:126:0x04ca, B:128:0x04da, B:131:0x04f8, B:133:0x050c, B:135:0x03fb, B:136:0x043d, B:137:0x0384, B:143:0x05a3, B:145:0x062b, B:147:0x062f, B:149:0x0636, B:150:0x0693, B:152:0x069a, B:153:0x06ee, B:155:0x06f5, B:157:0x074a, B:159:0x0751, B:160:0x07aa, B:214:0x07ae, B:162:0x07e5, B:163:0x07f6, B:173:0x080f, B:176:0x082f, B:178:0x0834, B:181:0x084f, B:182:0x0856, B:186:0x0869, B:187:0x0875, B:190:0x0889, B:191:0x0893, B:193:0x08ba, B:195:0x08c1, B:200:0x08db, B:202:0x08e2, B:204:0x0901, B:205:0x0910, B:208:0x092c, B:210:0x0931), top: B:57:0x01ab }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x053a A[Catch: all -> 0x043e, TryCatch #6 {all -> 0x043e, blocks: (B:58:0x01ab, B:60:0x0203, B:61:0x0234, B:64:0x0249, B:69:0x0587, B:70:0x025e, B:72:0x0266, B:73:0x0281, B:75:0x028d, B:76:0x02be, B:78:0x02cc, B:81:0x02d8, B:84:0x02de, B:86:0x02f1, B:88:0x0352, B:90:0x035f, B:91:0x0379, B:94:0x038a, B:96:0x03e2, B:97:0x0458, B:98:0x045c, B:102:0x052b, B:103:0x0534, B:105:0x053a, B:107:0x0550, B:110:0x0567, B:111:0x0571, B:113:0x057d, B:118:0x0469, B:121:0x0475, B:123:0x0492, B:125:0x04aa, B:126:0x04ca, B:128:0x04da, B:131:0x04f8, B:133:0x050c, B:135:0x03fb, B:136:0x043d, B:137:0x0384, B:143:0x05a3, B:145:0x062b, B:147:0x062f, B:149:0x0636, B:150:0x0693, B:152:0x069a, B:153:0x06ee, B:155:0x06f5, B:157:0x074a, B:159:0x0751, B:160:0x07aa, B:214:0x07ae, B:162:0x07e5, B:163:0x07f6, B:173:0x080f, B:176:0x082f, B:178:0x0834, B:181:0x084f, B:182:0x0856, B:186:0x0869, B:187:0x0875, B:190:0x0889, B:191:0x0893, B:193:0x08ba, B:195:0x08c1, B:200:0x08db, B:202:0x08e2, B:204:0x0901, B:205:0x0910, B:208:0x092c, B:210:0x0931), top: B:57:0x01ab }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0571 A[Catch: all -> 0x043e, TryCatch #6 {all -> 0x043e, blocks: (B:58:0x01ab, B:60:0x0203, B:61:0x0234, B:64:0x0249, B:69:0x0587, B:70:0x025e, B:72:0x0266, B:73:0x0281, B:75:0x028d, B:76:0x02be, B:78:0x02cc, B:81:0x02d8, B:84:0x02de, B:86:0x02f1, B:88:0x0352, B:90:0x035f, B:91:0x0379, B:94:0x038a, B:96:0x03e2, B:97:0x0458, B:98:0x045c, B:102:0x052b, B:103:0x0534, B:105:0x053a, B:107:0x0550, B:110:0x0567, B:111:0x0571, B:113:0x057d, B:118:0x0469, B:121:0x0475, B:123:0x0492, B:125:0x04aa, B:126:0x04ca, B:128:0x04da, B:131:0x04f8, B:133:0x050c, B:135:0x03fb, B:136:0x043d, B:137:0x0384, B:143:0x05a3, B:145:0x062b, B:147:0x062f, B:149:0x0636, B:150:0x0693, B:152:0x069a, B:153:0x06ee, B:155:0x06f5, B:157:0x074a, B:159:0x0751, B:160:0x07aa, B:214:0x07ae, B:162:0x07e5, B:163:0x07f6, B:173:0x080f, B:176:0x082f, B:178:0x0834, B:181:0x084f, B:182:0x0856, B:186:0x0869, B:187:0x0875, B:190:0x0889, B:191:0x0893, B:193:0x08ba, B:195:0x08c1, B:200:0x08db, B:202:0x08e2, B:204:0x0901, B:205:0x0910, B:208:0x092c, B:210:0x0931), top: B:57:0x01ab }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0469 A[Catch: all -> 0x043e, TryCatch #6 {all -> 0x043e, blocks: (B:58:0x01ab, B:60:0x0203, B:61:0x0234, B:64:0x0249, B:69:0x0587, B:70:0x025e, B:72:0x0266, B:73:0x0281, B:75:0x028d, B:76:0x02be, B:78:0x02cc, B:81:0x02d8, B:84:0x02de, B:86:0x02f1, B:88:0x0352, B:90:0x035f, B:91:0x0379, B:94:0x038a, B:96:0x03e2, B:97:0x0458, B:98:0x045c, B:102:0x052b, B:103:0x0534, B:105:0x053a, B:107:0x0550, B:110:0x0567, B:111:0x0571, B:113:0x057d, B:118:0x0469, B:121:0x0475, B:123:0x0492, B:125:0x04aa, B:126:0x04ca, B:128:0x04da, B:131:0x04f8, B:133:0x050c, B:135:0x03fb, B:136:0x043d, B:137:0x0384, B:143:0x05a3, B:145:0x062b, B:147:0x062f, B:149:0x0636, B:150:0x0693, B:152:0x069a, B:153:0x06ee, B:155:0x06f5, B:157:0x074a, B:159:0x0751, B:160:0x07aa, B:214:0x07ae, B:162:0x07e5, B:163:0x07f6, B:173:0x080f, B:176:0x082f, B:178:0x0834, B:181:0x084f, B:182:0x0856, B:186:0x0869, B:187:0x0875, B:190:0x0889, B:191:0x0893, B:193:0x08ba, B:195:0x08c1, B:200:0x08db, B:202:0x08e2, B:204:0x0901, B:205:0x0910, B:208:0x092c, B:210:0x0931), top: B:57:0x01ab }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0492 A[Catch: all -> 0x043e, TryCatch #6 {all -> 0x043e, blocks: (B:58:0x01ab, B:60:0x0203, B:61:0x0234, B:64:0x0249, B:69:0x0587, B:70:0x025e, B:72:0x0266, B:73:0x0281, B:75:0x028d, B:76:0x02be, B:78:0x02cc, B:81:0x02d8, B:84:0x02de, B:86:0x02f1, B:88:0x0352, B:90:0x035f, B:91:0x0379, B:94:0x038a, B:96:0x03e2, B:97:0x0458, B:98:0x045c, B:102:0x052b, B:103:0x0534, B:105:0x053a, B:107:0x0550, B:110:0x0567, B:111:0x0571, B:113:0x057d, B:118:0x0469, B:121:0x0475, B:123:0x0492, B:125:0x04aa, B:126:0x04ca, B:128:0x04da, B:131:0x04f8, B:133:0x050c, B:135:0x03fb, B:136:0x043d, B:137:0x0384, B:143:0x05a3, B:145:0x062b, B:147:0x062f, B:149:0x0636, B:150:0x0693, B:152:0x069a, B:153:0x06ee, B:155:0x06f5, B:157:0x074a, B:159:0x0751, B:160:0x07aa, B:214:0x07ae, B:162:0x07e5, B:163:0x07f6, B:173:0x080f, B:176:0x082f, B:178:0x0834, B:181:0x084f, B:182:0x0856, B:186:0x0869, B:187:0x0875, B:190:0x0889, B:191:0x0893, B:193:0x08ba, B:195:0x08c1, B:200:0x08db, B:202:0x08e2, B:204:0x0901, B:205:0x0910, B:208:0x092c, B:210:0x0931), top: B:57:0x01ab }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04ca A[Catch: all -> 0x043e, TryCatch #6 {all -> 0x043e, blocks: (B:58:0x01ab, B:60:0x0203, B:61:0x0234, B:64:0x0249, B:69:0x0587, B:70:0x025e, B:72:0x0266, B:73:0x0281, B:75:0x028d, B:76:0x02be, B:78:0x02cc, B:81:0x02d8, B:84:0x02de, B:86:0x02f1, B:88:0x0352, B:90:0x035f, B:91:0x0379, B:94:0x038a, B:96:0x03e2, B:97:0x0458, B:98:0x045c, B:102:0x052b, B:103:0x0534, B:105:0x053a, B:107:0x0550, B:110:0x0567, B:111:0x0571, B:113:0x057d, B:118:0x0469, B:121:0x0475, B:123:0x0492, B:125:0x04aa, B:126:0x04ca, B:128:0x04da, B:131:0x04f8, B:133:0x050c, B:135:0x03fb, B:136:0x043d, B:137:0x0384, B:143:0x05a3, B:145:0x062b, B:147:0x062f, B:149:0x0636, B:150:0x0693, B:152:0x069a, B:153:0x06ee, B:155:0x06f5, B:157:0x074a, B:159:0x0751, B:160:0x07aa, B:214:0x07ae, B:162:0x07e5, B:163:0x07f6, B:173:0x080f, B:176:0x082f, B:178:0x0834, B:181:0x084f, B:182:0x0856, B:186:0x0869, B:187:0x0875, B:190:0x0889, B:191:0x0893, B:193:0x08ba, B:195:0x08c1, B:200:0x08db, B:202:0x08e2, B:204:0x0901, B:205:0x0910, B:208:0x092c, B:210:0x0931), top: B:57:0x01ab }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04f8 A[Catch: all -> 0x043e, TryCatch #6 {all -> 0x043e, blocks: (B:58:0x01ab, B:60:0x0203, B:61:0x0234, B:64:0x0249, B:69:0x0587, B:70:0x025e, B:72:0x0266, B:73:0x0281, B:75:0x028d, B:76:0x02be, B:78:0x02cc, B:81:0x02d8, B:84:0x02de, B:86:0x02f1, B:88:0x0352, B:90:0x035f, B:91:0x0379, B:94:0x038a, B:96:0x03e2, B:97:0x0458, B:98:0x045c, B:102:0x052b, B:103:0x0534, B:105:0x053a, B:107:0x0550, B:110:0x0567, B:111:0x0571, B:113:0x057d, B:118:0x0469, B:121:0x0475, B:123:0x0492, B:125:0x04aa, B:126:0x04ca, B:128:0x04da, B:131:0x04f8, B:133:0x050c, B:135:0x03fb, B:136:0x043d, B:137:0x0384, B:143:0x05a3, B:145:0x062b, B:147:0x062f, B:149:0x0636, B:150:0x0693, B:152:0x069a, B:153:0x06ee, B:155:0x06f5, B:157:0x074a, B:159:0x0751, B:160:0x07aa, B:214:0x07ae, B:162:0x07e5, B:163:0x07f6, B:173:0x080f, B:176:0x082f, B:178:0x0834, B:181:0x084f, B:182:0x0856, B:186:0x0869, B:187:0x0875, B:190:0x0889, B:191:0x0893, B:193:0x08ba, B:195:0x08c1, B:200:0x08db, B:202:0x08e2, B:204:0x0901, B:205:0x0910, B:208:0x092c, B:210:0x0931), top: B:57:0x01ab }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x045f A[FALL_THROUGH] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v76 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void o(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab r112) {
        /*
            Method dump skipped, instructions count: 3706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mt1.b0.o(com.tencent.wcdb.support.CancellationSignal):void");
    }

    public final java.lang.Long[] p(java.util.ArrayList arrayList, boolean z17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        java.util.HashMap hashMap;
        if (f412733j) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CalcWxNewService", "handleDuplicatedOneDir willBreakLinkify, return");
            return new java.lang.Long[]{0L, 0L};
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.g0();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.HashMap hashMap3 = new java.util.HashMap();
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.g0();
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var3 = new p3321xbce91901.jvm.p3324x21ffc6bd.g0();
        int size = arrayList.size();
        int i17 = 0;
        int i18 = 0;
        java.lang.String str = "";
        while (i17 < size) {
            java.lang.String u07 = ot1.h.u0(((mt1.a) arrayList.get(i17)).f412721b);
            if (u07 != null) {
                com.p314xaae8f345.mm.vfs.x1 m17 = com.p314xaae8f345.mm.vfs.w6.m(u07);
                if (m17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CalcWxNewService", "file not found, fe = ".concat(u07));
                } else {
                    java.util.HashMap hashMap4 = hashMap3;
                    if (i17 == 0) {
                        g0Var.f391654d = m17.f294766c;
                    }
                    if (m17 instanceof com.p314xaae8f345.mm.vfs.k5) {
                        java.lang.String i19 = com.p314xaae8f345.mm.vfs.w6.i(u07, true);
                        hashMap = hashMap4;
                        hashMap.put(i19, u07);
                        if (hashMap2.containsKey(i19)) {
                            java.lang.Object obj = hashMap2.get(i19);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                            hashMap2.put(i19, java.lang.Long.valueOf(((java.lang.Number) obj).longValue() + 1));
                        } else {
                            hashMap2.put(i19, 1L);
                        }
                    } else {
                        hashMap = hashMap4;
                        i18++;
                        if (str.length() == 0) {
                            str = u07;
                        }
                    }
                    i17++;
                    hashMap3 = hashMap;
                }
            }
            hashMap = hashMap3;
            i17++;
            hashMap3 = hashMap;
        }
        java.lang.String valueOf = hashMap2.size() > 0 ? java.lang.String.valueOf(hashMap3.get(java.lang.String.valueOf(((jz5.l) kz5.n0.F0(kz5.e1.v(hashMap2), new mt1.h()).get(0)).f384366d))) : "";
        java.lang.String str2 = valueOf.length() == 0 ? str : valueOf;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CalcWxNewService", "originalFilePath = " + str2 + ", realPathSet.size = " + hashMap2.size() + ", realFileCount = " + i18 + ", fileSize = " + g0Var.f391654d);
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new mt1.i(str2, arrayList, c26987xeef691ab, z17, g0Var2, g0Var3, g0Var));
        ((ku5.t0) ku5.t0.f394148d).g(futureTask);
        futureTask.get();
        return new java.lang.Long[]{java.lang.Long.valueOf(g0Var2.f391654d), java.lang.Long.valueOf(g0Var3.f391654d)};
    }

    public final void q(long j17, java.lang.String talker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        try {
            if (n().K1() >= j17) {
                n().O2(talker, j17, true, null);
            }
        } catch (java.lang.RuntimeException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CalcWxNewService", e17, "Mark dirty failed: " + j17, new java.lang.Object[0]);
        }
    }

    public final void r(long j17, java.lang.String talker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        java.util.HashSet hashSet = f412729f;
        synchronized (hashSet) {
            hashSet.add(new jz5.l(talker, java.lang.Long.valueOf(j17)));
            if (!f412730g) {
                ((ku5.t0) ku5.t0.f394148d).l(new mt1.m(), 100L, "CalcWxEvents");
                f412730g = true;
            }
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* JADX WARN: Not initialized variable reg: 48, insn: 0x02fc: MOVE (r13 I:??[OBJECT, ARRAY]) = (r48 I:??[OBJECT, ARRAY]), block:B:448:0x02fb */
    public final void t(mt1.r0 r53, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab r54) {
        /*
            Method dump skipped, instructions count: 1872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mt1.b0.t(mt1.r0, com.tencent.wcdb.support.CancellationSignal):void");
    }

    public final void u(long[] jArr, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        try {
            if (c26987xeef691ab == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CalcWxNewService", "scanDuplicated, cs null, return");
                return;
            }
            android.database.Cursor o17 = jArr == null ? n().f430382d.o(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26954x879c8aeb.f58282xe9b6bcea, "SELECT group_concat(rowid), group_concat(path, '|'), group_concat(CASE WHEN hash IS NULL THEN '0' ELSE '1' END), count(path) AS cnt, size FROM WxFileIndex3 GROUP BY size HAVING cnt > 1 AND cnt > count(hash)", null, "WxFileIndex3", c26987xeef691ab) : n().f430382d.o(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26954x879c8aeb.f58282xe9b6bcea, "SELECT group_concat(rowid), group_concat(path, '|'), group_concat(CASE WHEN hash IS NULL THEN '0' ELSE '1' END), count(path) AS cnt, size FROM WxFileIndex3 WHERE size >= ? AND size < ? GROUP BY size HAVING cnt > 1 AND cnt > count(hash)", new java.lang.String[]{java.lang.String.valueOf(jArr[0]), java.lang.String.valueOf(jArr[1])}, "WxFileIndex3", c26987xeef691ab);
            while (o17.moveToNext()) {
                try {
                    c26987xeef691ab.m108011xf4ed245c();
                    java.lang.String string = o17.getString(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    java.util.List y17 = q26.h0.y(q26.h0.o(r26.n0.g0(string, new char[]{','}, false, 0, 6, null), mt1.y.f412808d));
                    java.lang.String string2 = o17.getString(1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                    java.util.List e07 = r26.n0.e0(string2, new char[]{'|'}, false, 0, 6, null);
                    java.lang.String string3 = o17.getString(2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                    java.util.List y18 = q26.h0.y(q26.h0.o(r26.n0.g0(string3, new char[]{','}, false, 0, 6, null), mt1.x.f412807d));
                    if (y17.size() != e07.size()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CalcWxNewService", "List size not matched: " + y17.size() + " <-> " + e07.size());
                    } else {
                        ((ku5.t0) ku5.t0.f394148d).a(new mt1.w(e07, y18, c26987xeef691ab, y17)).get();
                    }
                } finally {
                }
            }
            vz5.b.a(o17, null);
        } catch (com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26993xde8292f unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CalcWxNewService", "HASH calculation cancelled");
        }
    }

    public final void v(boolean z17) {
        f412736m = z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0115, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CalcWxNewService", "setImgInfoIsComplete canceled");
        r2 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046 A[Catch: all -> 0x01c9, TRY_LEAVE, TryCatch #2 {, blocks: (B:5:0x0006, B:9:0x0010, B:11:0x0028, B:12:0x0030, B:14:0x003a, B:19:0x0046, B:22:0x0050, B:24:0x0066, B:27:0x0070, B:29:0x008d, B:30:0x0093, B:32:0x009d, B:35:0x00ae, B:37:0x00e7, B:40:0x00f1, B:50:0x015e, B:52:0x0163, B:53:0x016a, B:66:0x01c5, B:67:0x01c8, B:42:0x0109, B:44:0x010f, B:49:0x0115, B:46:0x011f, B:62:0x01c2), top: B:3:0x0004, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050 A[Catch: all -> 0x01c9, TRY_ENTER, TryCatch #2 {, blocks: (B:5:0x0006, B:9:0x0010, B:11:0x0028, B:12:0x0030, B:14:0x003a, B:19:0x0046, B:22:0x0050, B:24:0x0066, B:27:0x0070, B:29:0x008d, B:30:0x0093, B:32:0x009d, B:35:0x00ae, B:37:0x00e7, B:40:0x00f1, B:50:0x015e, B:52:0x0163, B:53:0x016a, B:66:0x01c5, B:67:0x01c8, B:42:0x0109, B:44:0x010f, B:49:0x0115, B:46:0x011f, B:62:0x01c2), top: B:3:0x0004, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void w(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab r17) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mt1.b0.w(com.tencent.wcdb.support.CancellationSignal):void");
    }

    public final boolean x() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CalcWxNewService", "trigger from push");
        if (!mt1.e0.f412747b) {
            return true;
        }
        mt1.e eVar = f412728e;
        java.lang.Boolean valueOf = eVar != null ? java.lang.Boolean.valueOf(eVar.b()) : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
        return valueOf.booleanValue();
    }

    public final boolean y() {
        return qt0.b.f448024a.c(null);
    }

    public final boolean z() {
        boolean z17 = !(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20288xe0731c5f()) > 0) && (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2529x2ff57c.C20153x41e6d084()) == 1 || j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20287x9a82fceb()) > 0);
        boolean Ui = ((yv1.b1) ((c01.f8) i95.n0.c(c01.f8.class))).Ui();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CalcWxNewService", "tryCreateSecondIndex: clicfg=" + z17 + ", hasIndex=" + Ui);
        if (z17) {
            java.lang.String[] INDEX_CREATE_2ND = ot1.j.f430380m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(INDEX_CREATE_2ND, "INDEX_CREATE_2ND");
            if (j("WxFileIndex2ndIndex", kz5.z.z0(INDEX_CREATE_2ND), !Ui)) {
                ((yv1.b1) ((c01.f8) i95.n0.c(c01.f8.class))).getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanService", "setHasSecondIndex: true");
                yv1.b1.f547530e.a().putBoolean("WxFileIndex2ndIndex", true);
                return true;
            }
        }
        return false;
    }
}
