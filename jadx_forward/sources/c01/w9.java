package c01;

/* loaded from: classes11.dex */
public abstract class w9 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile long f119071a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f119072b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f119073c = false;

    public static java.lang.String A(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return str;
        }
        return str2 + ": " + str;
    }

    public static void B() {
        android.database.Cursor O0;
        final com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        if (cj6.Da(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7)) {
            O0 = ot0.c3.l().c("testAnr", new yz5.a() { // from class: com.tencent.mm.storage.g9$$b7
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.O0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "%aaaabbbbbfdf%");
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$c7
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r.f("select * from message where content like '%aaaabbbbbfdf%'", null, 2);
                }
            });
        } else {
            boolean Pb = cj6.Pb(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
            l75.k0 k0Var = cj6.f275522r;
            O0 = Pb ? ot0.z2.f430355a.O0(k0Var, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "%aaaabbbbbfdf%") : k0Var.f("select * from message wherecontent like '%aaaabbbbbfdf%'", null, 2);
        }
        O0.getCount();
        android.os.SystemClock.sleep(5000L);
        O0.close();
    }

    public static void C(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(f9Var.Q0(), true);
        if (n17 == null || ((int) n17.E2) == 0) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3(f9Var.Q0());
            z3Var.mo43621x7650bebc(2);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5712x456c629a c5712x456c629a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5712x456c629a();
            c5712x456c629a.f136033g.f89915a = z3Var;
            c5712x456c629a.e();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h0(z3Var);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var.m124847x74d37ac6(), f9Var, true);
    }

    public static int a() {
        if (f119073c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorageLogic", "checkUnfinishedDeleteMsgTask already started.");
            return -1;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.x4 x4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni();
        x4Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            long s07 = x4Var.s0("SELECT reserved2 FROM DeletedConversationInfo WHERE userName=''", null);
            android.database.Cursor o17 = x4Var.f277860e.o(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26954x879c8aeb.f58282xe9b6bcea, "SELECT userName, reserved2 FROM DeletedConversationInfo WHERE reserved2 > 0", null, "DeletedConversationInfo", null);
            while (o17.moveToNext()) {
                java.lang.String string = o17.getString(0);
                long j17 = o17.getLong(1);
                if (j17 == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
                    j17 = 0;
                }
                ((lt0.f) x4Var.f277859d).j(string, java.lang.Long.valueOf(java.lang.Math.max(s07, j17)));
                hashMap.put(string, java.lang.Long.valueOf(j17));
            }
            o17.close();
        } catch (java.lang.IllegalStateException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DeletedConversationInfoStorage", e17, "getAllUnfinishDeleteTalker failed", new java.lang.Object[0]);
        }
        if (hashMap.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorageLogic", "summerdel checkUnfinishedDeleteMsgTask all finished!");
            return 0;
        }
        s75.d.b(new c01.x9(hashMap), "checkUnfinishedDeleteMsgTask");
        return hashMap.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static void b(long j17, int i17) {
        java.lang.Throwable th6;
        java.lang.Throwable th7;
        java.lang.String str;
        int i18;
        int i19;
        ?? r27 = i17;
        java.lang.String str2 = "MicroMsg.MsgInfoStorageLogic";
        java.lang.System.currentTimeMillis();
        if (r27 == 1) {
            c01.ga.b();
        }
        try {
            try {
                c01.ga gaVar = new c01.ga();
                try {
                    try {
                        android.database.Cursor K1 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().K1(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, j17);
                        try {
                            gaVar.f118746g = java.lang.System.currentTimeMillis();
                            int i27 = 0;
                            int i28 = 0;
                            int i29 = 0;
                            int i37 = 0;
                            int i38 = 0;
                            int i39 = 0;
                            while (K1.moveToNext()) {
                                try {
                                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                                    f9Var.mo9015xbf5d97fd(K1);
                                    int mo78013xfb85f7b0 = f9Var.mo78013xfb85f7b0();
                                    switch (mo78013xfb85f7b0) {
                                        case -1879048191:
                                        case -1879048190:
                                        case -1879048189:
                                            str = str2;
                                            i18 = 3;
                                            i19 = 49;
                                            break;
                                        default:
                                            i19 = mo78013xfb85f7b0;
                                            str = str2;
                                            i18 = 3;
                                            break;
                                    }
                                    if (i19 == i18 || i19 == 23) {
                                        i27++;
                                    } else if (i19 == 34) {
                                        i28++;
                                    } else if (i19 == 49) {
                                        i29++;
                                    } else if (i19 == 62 || i19 == 486539313 || i19 == 43 || i19 == 44) {
                                        i37++;
                                    }
                                    i38++;
                                    try {
                                        e(f9Var, true);
                                        i39++;
                                        if (i39 >= 100) {
                                            gaVar.a();
                                            gaVar.f118746g = java.lang.System.currentTimeMillis();
                                            i39 = 0;
                                        }
                                        str2 = str;
                                    } catch (java.lang.Throwable th8) {
                                        th = th8;
                                        th7 = th;
                                        r27 = str;
                                        if (K1 == null) {
                                            throw th7;
                                        }
                                        try {
                                            K1.close();
                                            throw th7;
                                        } catch (java.lang.Throwable th9) {
                                            th7.addSuppressed(th9);
                                            throw th7;
                                        }
                                    }
                                } catch (java.lang.Throwable th10) {
                                    th = th10;
                                    str = str2;
                                }
                            }
                            java.lang.String str3 = str2;
                            try {
                                K1.close();
                                gaVar.a();
                                gaVar.f118746g = java.lang.System.currentTimeMillis();
                                int y07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().y0(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, j17);
                                gaVar.a();
                                jx3.f fVar = jx3.f.INSTANCE;
                                fVar.m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.w.f34445x366c91de, 10, 3, y07, true);
                                long j18 = gaVar.f118745f;
                                fVar.mo68477x336bdfd8(1333L, 8L, j18 / 1000, true);
                                if (r27 == 1) {
                                    try {
                                        fVar.mo68477x336bdfd8(1333L, 1L, 1L, true);
                                    } catch (java.lang.Throwable th11) {
                                        th6 = th11;
                                        r27 = str3;
                                        try {
                                            gaVar.close();
                                            throw th6;
                                        } catch (java.lang.Throwable th12) {
                                            th6.addSuppressed(th12);
                                            throw th6;
                                        }
                                    }
                                }
                                fVar.mo68477x336bdfd8(1333L, y07 >= 10000000 ? 26 : y07 >= 1000000 ? 25 : y07 >= 100000 ? 24 : y07 >= 10000 ? 23 : y07 >= 1000 ? 22 : 21, 1L, true);
                                fVar.mo68477x336bdfd8(1333L, j18 >= 1800000 ? 36 : j18 >= 600000 ? 35 : j18 >= 180000 ? 34 : j18 >= 60000 ? 33 : j18 >= com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d ? 32 : 31, 1L, true);
                                if (y07 > 0) {
                                    fVar.mo68477x336bdfd8(1333L, 12L, j18 / y07, true);
                                }
                                fVar.d(18923, java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i17), 0, java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i28));
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "Clear all messages, time: %d, total: %d, app: %d, image: %d, video: %d, voice: %d", java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i28));
                                gaVar.close();
                            } catch (java.lang.Throwable th13) {
                                th = th13;
                                r27 = str3;
                                th6 = th;
                                r27 = r27;
                                gaVar.close();
                                throw th6;
                            }
                        } catch (java.lang.Throwable th14) {
                            r27 = str2;
                            th7 = th14;
                        }
                    } catch (java.lang.Throwable th15) {
                        th = th15;
                    }
                } catch (java.lang.Throwable th16) {
                    th = th16;
                    r27 = "MicroMsg.MsgInfoStorageLogic";
                }
            } catch (java.io.IOException e17) {
                e = e17;
                r27 = "MicroMsg.MsgInfoStorageLogic";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r27, e, "", new java.lang.Object[0]);
                c01.ga.b();
            }
        } catch (java.io.IOException e18) {
            e = e18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r27, e, "", new java.lang.Object[0]);
            c01.ga.b();
        }
        c01.ga.b();
    }

    public static void c() {
        java.util.List u17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().u1("qmessage");
        if (u17 != null) {
            for (int i17 = 0; i17 < u17.size(); i17++) {
                e((com.p314xaae8f345.mm.p2621x8fb0427b.f9) u17.get(i17), true);
            }
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().z0("qmessage");
    }

    public static void d() {
        java.util.List u17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().u1("tmessage");
        if (u17 != null) {
            for (int i17 = 0; i17 < u17.size(); i17++) {
                e((com.p314xaae8f345.mm.p2621x8fb0427b.f9) u17.get(i17), true);
            }
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().z0("tmessage");
    }

    public static void e(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17) {
        if (f9Var == null) {
            return;
        }
        c01.x7 x7Var = (c01.x7) i95.n0.c(c01.x7.class);
        int mo78013xfb85f7b0 = f9Var.mo78013xfb85f7b0();
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h0) x7Var).getClass();
        com.p314xaae8f345.mm.p944x882e457a.t0 a17 = com.p314xaae8f345.mm.p944x882e457a.s0.a(java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.c(mo78013xfb85f7b0)));
        if (a17 != null) {
            a17.x5(new com.p314xaae8f345.mm.p944x882e457a.r0(f9Var));
        }
        if (z17) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5297xfbfc3e84 c5297xfbfc3e84 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5297xfbfc3e84();
            long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
            am.y3 y3Var = c5297xfbfc3e84.f135619g;
            y3Var.f89958a = m124847x74d37ac6;
            y3Var.f89959b = f9Var.I0();
            y3Var.f89960c = f9Var.Q0();
            y3Var.f89961d = f9Var.mo78013xfb85f7b0();
            y3Var.f89962e = f9Var.mo78012x3fdd41df();
            c5297xfbfc3e84.e();
        }
    }

    public static int f(long j17, java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str, j17);
        if (Li.m124847x74d37ac6() != j17) {
            return 0;
        }
        e(Li, true);
        return pt0.f0.P7(Li.Q0(), j17);
    }

    public static int g(java.lang.String str, long j17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(str, j17);
        if (o27 == null || o27.I0() != j17) {
            return 0;
        }
        e(o27, true);
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().D0(str, j17);
    }

    public static void h(java.lang.String str, c01.da daVar) {
        i(java.util.Collections.singletonList(str), daVar, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
    }

    public static void i(java.util.List list, c01.da daVar, long j17) {
        java.lang.String objects = java.util.Objects.toString(list);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorageLogic", "summerdel deleteMsgByTalker[%s] stack[%s]", objects, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("LATEST_STORAGE_DATA", gm0.j1.b().h(), 1).putLong("latest_clean_chat_log_time", java.lang.System.currentTimeMillis());
        c01.y9 y9Var = new c01.y9(daVar);
        if (list != null && !list.isEmpty()) {
            s75.d.b(new c01.aa(list, j17, y9Var), "AsyncDeleteMessageStage1");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorageLogic", "summerdel deleteMsgByTalker is null or empty");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(y9Var);
        }
    }

    public static int j(java.util.List list, c01.fa faVar, long j17, final long j18, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        c01.j8 j8Var;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        int i17;
        int i18;
        java.lang.String str4;
        c01.fa faVar2 = faVar;
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab2 = c26987xeef691ab;
        java.lang.String str5 = " AND (type = ";
        java.lang.String str6 = "voiceinfo";
        java.lang.String str7 = "ImgInfo2";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorageLogic", "deleteMsgByTalkerSync ");
        if (c26987xeef691ab2 != null && c26987xeef691ab.m108008xc9602be3()) {
            if (faVar2 != null) {
                faVar2.d(true, 0);
            }
            return 0;
        }
        final c01.j8 j8Var2 = (c01.j8) i95.n0.c(c01.j8.class);
        l75.k0 k0Var = gm0.j1.u().f354686f;
        int size = list.size() * 10;
        if (faVar2 != null) {
            faVar2.b(0, size);
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
        java.lang.String str8 = "MicroMsg.MsgInfoStorageLogic";
        sb6.append(android.text.TextUtils.join(",", java.util.Arrays.asList(43, 62, 44, 486539313)));
        sb6.append(")");
        java.lang.String sb7 = sb6.toString();
        java.util.Iterator it = list.iterator();
        int i19 = 0;
        int i27 = 0;
        while (it.hasNext()) {
            java.util.Iterator it6 = it;
            final java.lang.String str9 = (java.lang.String) it.next();
            long nanoTime = java.lang.System.nanoTime();
            int i28 = size;
            java.lang.String str10 = str5;
            ((ku5.t0) ku5.t0.f394148d).b(new java.lang.Runnable() { // from class: c01.w9$$b
                @Override // java.lang.Runnable
                public final void run() {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.r3) c01.j8.this).Ai(str9, j18);
                }
            }, "SyncDeleteFTSTalker");
            int i29 = i19;
            int i37 = 0;
            while (true) {
                k0Var.b();
                try {
                    try {
                        objArr[0] = str9;
                        objArr[1] = java.lang.Long.valueOf(j17);
                        objArr[2] = java.lang.Long.valueOf(j18);
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                        j8Var = j8Var2;
                        sb8.append("DELETE FROM ImgInfo2 WHERE id IN (SELECT ImgInfo2.reserved1 FROM message JOIN ImgInfo2 ON message.msgId = ImgInfo2.msglocalid OR message.msgSvrId = ImgInfo2.msgSvrId WHERE ");
                        sb8.append("message.msgId IN (SELECT msgId FROM message WHERE talker = ?1 AND createTime >= ?2 AND createTime < ?3 LIMIT 2000)");
                        sb8.append(" AND type = ");
                        sb8.append(3);
                        sb8.append(")");
                        k0Var.j(str7, sb8.toString(), objArr, c26987xeef691ab2);
                        k0Var.j(str7, "DELETE FROM ImgInfo2 WHERE msglocalid IN (SELECT msgId FROM message WHERE message.msgId IN (SELECT msgId FROM message WHERE talker = ?1 AND createTime >= ?2 AND createTime < ?3 LIMIT 2000) AND type = 3)", objArr, c26987xeef691ab2);
                        k0Var.j(str7, "DELETE FROM ImgInfo2 WHERE msgSvrId IN (SELECT msgSvrId FROM message WHERE message.msgId IN (SELECT msgId FROM message WHERE talker = ?1 AND createTime >= ?2 AND createTime < ?3 LIMIT 2000) AND type = 3)", objArr, c26987xeef691ab2);
                        k0Var.j("videoinfo2", "DELETE FROM videoinfo2 WHERE filename IN (SELECT videoinfo2.origin_file_name FROM message JOIN videoinfo2 ON message.imgPath = videoInfo2.filename WHERE message.msgId IN (SELECT msgId FROM message WHERE talker = ?1 AND createTime >= ?2 AND createTime < ?3 LIMIT 2000) AND type IN " + sb7 + ")", objArr, c26987xeef691ab2);
                        k0Var.j("videoinfo2", "DELETE FROM videoinfo2 WHERE filename IN (SELECT imgPath FROM message WHERE message.msgId IN (SELECT msgId FROM message WHERE talker = ?1 AND createTime >= ?2 AND createTime < ?3 LIMIT 2000) AND type IN " + sb7 + ")", objArr, c26987xeef691ab2);
                        pt0.e0 e0Var = pt0.f0.f439742b1;
                        if (e0Var.i()) {
                            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                            str = str7;
                            sb9.append("DELETE FROM videoinfo2 WHERE msglocalid IN (SELECT msgId FROM message WHERE ");
                            sb9.append("message.msgId IN (SELECT msgId FROM message WHERE talker = ?1 AND createTime >= ?2 AND createTime < ?3 LIMIT 2000)");
                            sb9.append(" AND type IN ");
                            sb9.append(sb7);
                            sb9.append(")");
                            k0Var.j("videoinfo2", sb9.toString(), objArr, c26987xeef691ab2);
                        } else {
                            str = str7;
                        }
                        k0Var.j(str6, "DELETE FROM voiceinfo WHERE FileName IN (SELECT imgPath FROM message WHERE message.msgId IN (SELECT msgId FROM message WHERE talker = ?1 AND createTime >= ?2 AND createTime < ?3 LIMIT 2000) AND type = 34)", objArr, c26987xeef691ab2);
                        if (e0Var.j()) {
                            k0Var.j(str6, "DELETE FROM voiceinfo WHERE MsgLocalId IN (SELECT msgId FROM message WHERE message.msgId IN (SELECT msgId FROM message WHERE talker = ?1 AND createTime >= ?2 AND createTime < ?3 LIMIT 2000) AND type = 34)", objArr, c26987xeef691ab2);
                        }
                        java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                        sb10.append("DELETE FROM appattach WHERE msgInfoId IN (SELECT msgId FROM message WHERE ");
                        sb10.append("message.msgId IN (SELECT msgId FROM message WHERE talker = ?1 AND createTime >= ?2 AND createTime < ?3 LIMIT 2000)");
                        str2 = str10;
                        sb10.append(str2);
                        str3 = str6;
                        sb10.append(49);
                        sb10.append(" OR type = ");
                        sb10.append(1090519089);
                        sb10.append("))");
                        k0Var.j("appattach", sb10.toString(), objArr, c26987xeef691ab2);
                        k0Var.j("AppMessage", "DELETE FROM AppMessage WHERE msgId IN (SELECT msgId FROM message WHERE message.msgId IN (SELECT msgId FROM message WHERE talker = ?1 AND createTime >= ?2 AND createTime < ?3 LIMIT 2000)" + str2 + "49 OR type >= 65585))", objArr, c26987xeef691ab2);
                        java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
                        sb11.append("DELETE FROM message WHERE ");
                        sb11.append("message.msgId IN (SELECT msgId FROM message WHERE talker = ?1 AND createTime >= ?2 AND createTime < ?3 LIMIT 2000)");
                        p75.e0 e0Var2 = (p75.e0) k0Var.z(sb11.toString());
                        e0Var2.a(objArr);
                        int b17 = e0Var2.b(c26987xeef691ab2);
                        k0Var.r();
                        try {
                            k0Var.t();
                        } catch (java.lang.RuntimeException unused) {
                        }
                        i17 = i29 + b17;
                        if (i37 < 10) {
                            i37++;
                        }
                        if (faVar != null) {
                            i18 = i28;
                            faVar.b(i27 + i37, i18);
                        } else {
                            i18 = i28;
                        }
                        int i38 = i37;
                        str4 = str8;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "(time: %d, messages: %d) deleteMsgByTalkerSync: %s", java.lang.Long.valueOf((java.lang.System.nanoTime() - nanoTime) / 1000000), java.lang.Integer.valueOf(b17), str9);
                        if (b17 < 2000) {
                            break;
                        }
                        str8 = str4;
                        i37 = i38;
                        j8Var2 = j8Var;
                        i29 = i17;
                        str6 = str3;
                        str7 = str;
                        i28 = i18;
                        str10 = str2;
                        c26987xeef691ab2 = c26987xeef691ab;
                    } catch (java.lang.Throwable th6) {
                        try {
                            k0Var.t();
                        } catch (java.lang.RuntimeException unused2) {
                        }
                        throw th6;
                    }
                } catch (com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26993xde8292f e17) {
                    if (faVar == null) {
                        throw e17;
                    }
                    faVar.d(true, i29);
                    try {
                        k0Var.t();
                    } catch (java.lang.RuntimeException unused3) {
                    }
                    return i29;
                }
            }
            int i39 = i27 + 10;
            if (faVar != null) {
                faVar.b(i39, i18);
            }
            it = it6;
            i27 = i39;
            str8 = str4;
            faVar2 = faVar;
            str5 = str2;
            j8Var2 = j8Var;
            i19 = i17;
            str6 = str3;
            str7 = str;
            size = i18;
            c26987xeef691ab2 = c26987xeef691ab;
        }
        c01.fa faVar3 = faVar2;
        int i47 = i19;
        if (faVar3 != null) {
            faVar3.d(false, i47);
        }
        return i47;
    }

    public static int k(java.lang.String str) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().J0(str);
    }

    public static java.lang.String l(boolean z17, java.lang.String str, int i17) {
        return (z17 && str != null && i17 == 0) ? u(str) : str;
    }

    public static long m(java.lang.String str, long j17) {
        if (str != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 q57 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(str);
            r3 = q57 != null ? q57.T1() + 1 : 0L;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorageLogic", "[oneliang] fix recv msg db create time, last:%s", java.lang.Long.valueOf(r3));
        }
        long j18 = j17 * 1000;
        if (r3 <= j18) {
            r3 = j18;
        }
        java.util.Map map = f119072b;
        if (((java.util.HashMap) map).containsKey(str)) {
            long r17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1((java.lang.Long) ((java.util.HashMap) map).get(str));
            if (r3 == r17) {
                r3 = r17 + 1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorageLogic", "[oneliang] fix recv msg create time, check lastRecvMsgCreateTime %s, fixedTime is :%s", java.lang.Long.valueOf(r17), java.lang.Long.valueOf(r3));
            }
        }
        ((java.util.HashMap) map).put(str, java.lang.Long.valueOf(r3));
        return r3;
    }

    public static void n(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        r45.j4 j4Var;
        int i17;
        if (f9Var == null || p0Var == null || (j4Var = p0Var.f152259a) == null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorageLogic", "summerbadcr fixRecvMsgWithAddMsgInfo error input is null, stack[%s]", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            return;
        }
        if (f9Var.I0() != j4Var.f459101r) {
            return;
        }
        int A0 = f9Var.A0();
        boolean z18 = p0Var.f152263e;
        long j17 = p0Var.f152264f;
        if (A0 != 0 && j4Var.f459102s == 0) {
            if (f9Var.m124847x74d37ac6() == 0 && z18) {
                if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorageLogic", "fixRecvMsgWithAddMsgInfo fixtime case 1, fixTime:%s content:%s", java.lang.Long.valueOf(j17), f9Var.j());
                }
                f9Var.e1(j17);
                return;
            }
            return;
        }
        if (f9Var.F0() == 0 && (i17 = j4Var.f459102s) != 0) {
            f9Var.n1(i17);
        }
        int w07 = f9Var.w0();
        boolean z19 = p0Var.f152260b;
        int i18 = z19 ? w07 | 2 : w07 & (-3);
        int i19 = p0Var.f152261c ? i18 | 1 : i18 & (-2);
        f9Var.f1(p0Var.f152262d ? i19 | 4 : i19 & (-5));
        if (f9Var.m124847x74d37ac6() == 0) {
            if (z19 || z18) {
                if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorageLogic", "fixRecvMsgWithAddMsgInfo fixtime case 2 fixTime:%s content:%s", java.lang.Long.valueOf(j17), f9Var.j());
                }
                f9Var.e1(j17);
            }
        }
    }

    public static long o(java.lang.String str) {
        long j17;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 q57;
        long p17 = p();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorageLogic", "[oneliang] fix send msg create time, after fix, now is :%s", java.lang.Long.valueOf(p17));
        if (str != null && (q57 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(str)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorageLogic", "[oneliang] fix send msg create time, before return, msg id:%s, now is :%s createTime:%s", java.lang.Long.valueOf(q57.m124847x74d37ac6()), java.lang.Long.valueOf(p17), java.lang.Long.valueOf(q57.mo78012x3fdd41df()));
            if (q57.mo78012x3fdd41df() + 1 > p17) {
                j17 = q57.mo78012x3fdd41df() + 1;
                if (j17 <= f119071a && j17 > f119071a - 100) {
                    j17 = f119071a + 1;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorageLogic", "[oneliang] fix send msg create time, check lastSendMsgCreateTime %s, now is :%s", java.lang.Long.valueOf(f119071a), java.lang.Long.valueOf(p17));
                }
                f119071a = j17;
                return j17;
            }
        }
        j17 = p17;
        if (j17 <= f119071a) {
            j17 = f119071a + 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorageLogic", "[oneliang] fix send msg create time, check lastSendMsgCreateTime %s, now is :%s", java.lang.Long.valueOf(f119071a), java.lang.Long.valueOf(p17));
        }
        f119071a = j17;
        return j17;
    }

    public static long p() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long c17 = c01.id.c();
        if (java.lang.Math.abs(currentTimeMillis - c17) > 300000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfoStorageLogic", "[getFixTime] nowServer:" + c17 + " now:" + currentTimeMillis);
        }
        return c17;
    }

    public static int q(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        int i17 = p0Var.f152260b ? 2 : 0;
        if (p0Var.f152261c) {
            i17 |= 1;
        }
        return p0Var.f152262d ? i17 | 4 : i17;
    }

    public static java.lang.String r(java.lang.String str) {
        int t17 = t(str);
        return t17 != -1 ? str.substring(t17 + 1).trim() : str;
    }

    public static java.lang.String s(java.lang.String str) {
        int t17 = t(str);
        if (t17 == -1) {
            return null;
        }
        return str.substring(0, t17);
    }

    public static int t(java.lang.String str) {
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorageLogic", "dz[getGroupChatMsgTalkerPos text is null]");
            return -1;
        }
        if (str.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorageLogic", "dz[getGroupChatMsgTalkerPos length < 0]");
            return -1;
        }
        if (str.startsWith("~SEMI_XML~")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorageLogic", "dz[getGroupChatMsgTalkerPos startsWith(SemiXml.MAGIC_HEAD)]");
            return -1;
        }
        int indexOf = str.indexOf(58);
        if (indexOf == -1 || !str.substring(0, indexOf).contains("<")) {
            return indexOf;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorageLogic", "dz[reject illegal character]");
        return -1;
    }

    public static java.lang.String u(java.lang.String str) {
        int i17;
        int t17 = t(str);
        return (t17 != -1 && (i17 = t17 + 2) < str.length()) ? str.substring(i17) : str;
    }

    public static int v(java.lang.String str) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().x7(str);
    }

    public static c01.ea w(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        try {
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msgsource", null);
            if (d17 != null && !d17.isEmpty()) {
                c01.ea eaVar = new c01.ea();
                eaVar.f118675a = (java.lang.String) d17.get(".msgsource.bizmsg.msgcluster");
                eaVar.f118680f = (java.lang.String) d17.get(".msgsource.kf.kf_worker");
                eaVar.f118681g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msgsource.kf.kf_type_new"), 0);
                java.lang.String str2 = (java.lang.String) d17.get(".msgsource.bizmsg.bizclientmsgid");
                java.lang.String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                eaVar.f118679e = str2;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    java.lang.String str4 = (java.lang.String) d17.get(".msgsource.enterprise_info.climsgid");
                    if (str4 == null) {
                        str4 = "";
                    }
                    eaVar.f118679e = str4;
                }
                java.lang.String str5 = (java.lang.String) d17.get(".msgsource.enterprise_info.qy_msg_type");
                if (str5 == null) {
                    str5 = "";
                }
                eaVar.f118685k = str5;
                java.lang.String str6 = (java.lang.String) d17.get(".msgsource.enterprise_info.chat_type");
                if (str6 == null) {
                    str6 = "";
                }
                eaVar.f118686l = str6;
                java.lang.String str7 = (java.lang.String) d17.get(".msgsource.enterprise_info.bizchat_id");
                if (str7 == null) {
                    str7 = "";
                }
                eaVar.f118687m = str7;
                java.lang.String str8 = (java.lang.String) d17.get(".msgsource.enterprise_info.bizchat_ver");
                if (str8 == null) {
                    str8 = "";
                }
                eaVar.f118688n = str8;
                java.lang.String str9 = (java.lang.String) d17.get(".msgsource.enterprise_info.user_id");
                if (str9 == null) {
                    str9 = "";
                }
                eaVar.f118689o = str9;
                java.lang.String str10 = (java.lang.String) d17.get(".msgsource.enterprise_info.user_nickname");
                if (str10 == null) {
                    str10 = "";
                }
                eaVar.f118690p = str10;
                java.lang.String str11 = (java.lang.String) d17.get(".msgsource.enterprise_info.sync_from_qy_im");
                if (str11 == null) {
                    str11 = "";
                }
                eaVar.f118691q = str11;
                eaVar.f118683i = (java.lang.String) d17.get(".msgsource.strangerantispamticket.$ticket");
                eaVar.f118684j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msgsource.strangerantispamticket.$scene"), 0);
                eaVar.f118692r = (java.lang.String) d17.get(".msgsource.NotAutoDownloadRange");
                eaVar.f118693s = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msgsource.DownloadLimitKbps"), 0);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msgsource.videopreloadlen"), 0);
                eaVar.f118694t = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msgsource.PreDownload"), 0);
                eaVar.f118695u = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msgsource.PreDownloadNetType"), 0);
                eaVar.f118696v = (java.lang.String) d17.get(".msgsource.NoPreDownloadRange");
                eaVar.f118676b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msgsource.msg_cluster_type"), -1);
                eaVar.f118677c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msgsource.service_type"), -1);
                eaVar.f118678d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msgsource.scene"), -1);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msgsource.bizmsg.msg_predict"), 0);
                eaVar.f118682h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".msgsource.bizflag"), 0L);
                java.lang.String str12 = (java.lang.String) d17.get(".msgsource.byp_sessionId");
                if (str12 == null) {
                    str12 = "";
                }
                eaVar.f118697w = str12;
                boolean z17 = true;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msgsource.msg_wording.is_show"), 0) != 1) {
                    z17 = false;
                }
                eaVar.f118698x = z17;
                java.lang.String str13 = (java.lang.String) d17.get(".msgsource.msg_wording.wording");
                if (str13 != null) {
                    str3 = str13;
                }
                eaVar.f118699y = str3;
                eaVar.f118700z = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msgsource.mass_send_type"), 0);
                return eaVar;
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorageLogic", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorageLogic", "Exception in getMsgSourceValue, %s", e17.getMessage());
            return null;
        }
    }

    public static long x(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(f9Var.Q0(), true);
        if (n17 == null || ((int) n17.E2) == 0) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3(f9Var.Q0());
            z3Var.mo43621x7650bebc(2);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5712x456c629a c5712x456c629a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5712x456c629a();
            c5712x456c629a.f136033g.f89915a = z3Var;
            c5712x456c629a.e();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h0(z3Var);
        }
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
    }

    public static boolean y(int i17) {
        switch (i17) {
            case 22:
            case 23:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
                return true;
            case 25:
            default:
                return false;
        }
    }

    public static int z(java.lang.String str) {
        return t(str);
    }
}
