package nc5;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final nc5.a f417721a = new nc5.a();

    public final void a() {
        java.lang.String str = aq.o.f94454b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryStorage", "deleteDirtyImageByRoomId >> ".concat(str));
        jm0.i iVar = jm0.k.f381802h;
        ((com.p314xaae8f345.mm.p2621x8fb0427b.h3) ((com.p314xaae8f345.mm.p2621x8fb0427b.n8) iVar.a(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class)).P6(com.p314xaae8f345.mm.p2621x8fb0427b.h3.class)).X6(str);
        ((com.p314xaae8f345.mm.p2621x8fb0427b.u4) ((com.p314xaae8f345.mm.p2621x8fb0427b.n8) iVar.a(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class)).P6(com.p314xaae8f345.mm.p2621x8fb0427b.u4.class)).X6(str);
        ((com.p314xaae8f345.mm.p2621x8fb0427b.k9) ((com.p314xaae8f345.mm.p2621x8fb0427b.n8) iVar.a(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class)).P6(com.p314xaae8f345.mm.p2621x8fb0427b.k9.class)).X6(str);
    }

    public final void b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, int i17) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryQueryImageUtils", "deleteMsgToNotifyPlugin >> msgId: " + msgInfo.m124847x74d37ac6() + ", fromSource: " + i17);
        if (msgInfo.J2() || msgInfo.o2()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryQueryImageUtils", "deleteMsgToNotifyPlugin delete image");
            qk.x7 x7Var = (qk.x7) i95.n0.c(qk.x7.class);
            java.lang.String Q0 = msgInfo.Q0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
            long m124847x74d37ac6 = msgInfo.m124847x74d37ac6();
            ((c61.ec) x7Var).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryPlugin", "deleteImageStorage >> rooId: " + Q0 + ", msgId: " + m124847x74d37ac6);
            bm5.t0 t0Var = bm5.t0.f104271a;
            if (t0Var.a() && t0Var.b()) {
                if (aq.o.f94455c == null) {
                    aq.o.f94455c = new aq.n();
                    com.p314xaae8f345.mm.p2621x8fb0427b.s8.f276847a.a();
                }
                z17 = true;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryDataModel", "checkInitDB >> entrance is close");
                z17 = false;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryStorage", "deleteImage >> msgId: " + m124847x74d37ac6 + ", talker: " + Q0);
                p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p2621x8fb0427b.o8(m124847x74d37ac6, Q0, null), 2, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x000e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList c(android.database.Cursor r14, boolean r15) {
        /*
            r13 = this;
            java.lang.String r0 = "cursor"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r14, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            long r1 = java.lang.System.currentTimeMillis()
        Le:
            boolean r3 = r14.moveToNext()     // Catch: java.lang.Throwable -> L9e
            if (r3 == 0) goto L99
            com.tencent.mm.storage.f9 r3 = new com.tencent.mm.storage.f9     // Catch: java.lang.Throwable -> L9e
            r3.<init>()     // Catch: java.lang.Throwable -> L9e
            r3.mo9015xbf5d97fd(r14)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r4 = "MicroMsg.HistoryQueryImageUtils"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9e
            r5.<init>()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r6 = "getImageFromCursor >> "
            r5.append(r6)     // Catch: java.lang.Throwable -> L9e
            long r6 = r3.mo78012x3fdd41df()     // Catch: java.lang.Throwable -> L9e
            r5.append(r6)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r6 = ", "
            r5.append(r6)     // Catch: java.lang.Throwable -> L9e
            r5.append(r1)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L9e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r5)     // Catch: java.lang.Throwable -> L9e
            if (r15 == 0) goto L4f
            long r4 = r3.mo78012x3fdd41df()     // Catch: java.lang.Throwable -> L9e
            long r4 = r4 - r1
            r6 = 63115200000(0xeb1f58600, double:3.11830520504E-313)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L4f
            goto L99
        L4f:
            boolean r4 = r3.J2()     // Catch: java.lang.Throwable -> L9e
            if (r4 != 0) goto L5b
            boolean r4 = r3.o2()     // Catch: java.lang.Throwable -> L9e
            if (r4 == 0) goto Le
        L5b:
            nc5.a r4 = nc5.a.f417721a     // Catch: java.lang.Throwable -> L9e
            java.lang.String r12 = r4.f(r3)     // Catch: java.lang.Throwable -> L9e
            fe5.a r4 = fe5.a.f343104a     // Catch: java.lang.Throwable -> L9e
            java.lang.String r11 = r4.a(r3)     // Catch: java.lang.Throwable -> L9e
            r4 = 0
            r5 = 1
            if (r12 == 0) goto L74
            int r6 = r12.length()     // Catch: java.lang.Throwable -> L9e
            if (r6 != 0) goto L72
            goto L74
        L72:
            r6 = r4
            goto L75
        L74:
            r6 = r5
        L75:
            if (r6 != 0) goto Le
            if (r11 == 0) goto L7f
            int r6 = r11.length()     // Catch: java.lang.Throwable -> L9e
            if (r6 != 0) goto L80
        L7f:
            r4 = r5
        L80:
            if (r4 != 0) goto Le
            com.tencent.mm.api.QueryImageData r4 = new com.tencent.mm.api.QueryImageData     // Catch: java.lang.Throwable -> L9e
            long r6 = r3.mo78012x3fdd41df()     // Catch: java.lang.Throwable -> L9e
            long r8 = r3.m124847x74d37ac6()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r10 = r3.Q0()     // Catch: java.lang.Throwable -> L9e
            r5 = r4
            r5.<init>(r6, r8, r10, r11, r12)     // Catch: java.lang.Throwable -> L9e
            r0.add(r4)     // Catch: java.lang.Throwable -> L9e
            goto Le
        L99:
            r15 = 0
            vz5.b.a(r14, r15)
            return r0
        L9e:
            r15 = move-exception
            throw r15     // Catch: java.lang.Throwable -> La0
        La0:
            r0 = move-exception
            vz5.b.a(r14, r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nc5.a.c(android.database.Cursor, boolean):java.util.ArrayList");
    }

    public final long d(java.lang.String talker) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryQueryImageUtils", "getLastIdentifyTimeStamp >> ".concat(talker));
        java.lang.String str2 = aq.o.f94454b;
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.h3 h3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.h3) ((com.p314xaae8f345.mm.p2621x8fb0427b.n8) a17).P6(com.p314xaae8f345.mm.p2621x8fb0427b.h3.class);
        p75.r0 r0Var = new p75.r0("chat_room_id", str2);
        p75.i0 i17 = dm.d2.f317842p.i();
        i17.f434189c = "MicroMsg.ClsLabelInfoStorage";
        i17.f434190d = r0Var;
        i17.f434192f = kz5.b0.c(dm.d2.f317843q.u());
        i17.c(1, 0);
        java.util.List k17 = i17.a().k(h3Var.f274680g.Q4(), com.p314xaae8f345.mm.p2621x8fb0427b.g3.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getLatestImage: ");
        java.util.ArrayList arrayList = (java.util.ArrayList) k17;
        sb6.append(arrayList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ClsLabelInfoStorage", sb6.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryStorage", "selectClsLatestImage >> " + str2 + ' ' + arrayList.size());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.g3 g3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.g3) it.next();
            arrayList2.add(new com.p314xaae8f345.mm.api.C4988x89c61bdd(g3Var.f66228x9de75411, g3Var.f66225x6583d7e, g3Var.f66220x206c903d, g3Var.f66222x4ac6dd27, g3Var.f66227xeab3e73d, g3Var.f66224xa8fb27eb, g3Var.f66221x22f9ac90, g3Var.f66226xa779eec3));
        }
        if (arrayList2.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryQueryImageUtils", "late image is null, so image is all need to rec");
            f65.p.f341471e = 0;
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.j9 i18 = com.p314xaae8f345.mm.p2621x8fb0427b.s8.f276847a.i(aq.o.f94454b);
            if (i18 == null || (str = i18.f66269x5965408d) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryQueryImageUtils", "history image is null, so use late image in cls");
                f65.p.f341471e = 1;
                f417721a.a();
            } else {
                f65.p.f341470d = str;
                java.lang.String str3 = ((com.p314xaae8f345.mm.api.C4988x89c61bdd) arrayList2.get(0)).f134739g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getScanImagePath(...)");
                f65.p.f341484r = str3;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, ((com.p314xaae8f345.mm.api.C4988x89c61bdd) arrayList2.get(0)).f134739g)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryQueryImageUtils", "two late image is similar");
                    long j17 = ((com.p314xaae8f345.mm.api.C4988x89c61bdd) arrayList2.get(0)).f134737e;
                    f65.p.f341471e = 3;
                    return j17;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryQueryImageUtils", "two late image is not similar");
                f417721a.a();
                f65.p.f341471e = 2;
            }
        }
        return -1L;
    }

    public final long e(java.lang.String talker) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryQueryImageUtils", "getOldestIdentifiedTimeStamp >> ".concat(talker));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryStorage", "selectClsOldestImage >> roomId: ".concat(talker));
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.h3 h3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.h3) ((com.p314xaae8f345.mm.p2621x8fb0427b.n8) a17).P6(com.p314xaae8f345.mm.p2621x8fb0427b.h3.class);
        p75.r0 r0Var = new p75.r0("chat_room_id", talker);
        p75.i0 i17 = dm.d2.f317842p.i();
        i17.f434189c = "MicroMsg.ClsLabelInfoStorage";
        i17.f434190d = r0Var;
        i17.f434192f = kz5.b0.c(dm.d2.f317843q.v());
        com.p314xaae8f345.mm.p2621x8fb0427b.g3 g3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.g3) i17.a().o(h3Var.f274680g.Q4(), com.p314xaae8f345.mm.p2621x8fb0427b.g3.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("result >> ");
        sb6.append(g3Var != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ClsLabelInfoStorage", sb6.toString());
        if (g3Var != null) {
            return g3Var.f66228x9de75411;
        }
        return -1L;
    }

    public final java.lang.String f(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return null;
        }
        if (!f9Var.J2() && !f9Var.o2()) {
            return null;
        }
        boolean z17 = true;
        if (f9Var.A0() == 1) {
            long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 T1 = m11.b1.Di().T1(f9Var.Q0(), m124847x74d37ac6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(T1, "getByMsgLocalId(...)");
            if (T1.f404166a == 0) {
                long I0 = f9Var.I0();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryQueryImageUtils", "getImagePath img invalid and try get by msgSvrId: %s", java.lang.Long.valueOf(I0));
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                T1 = m11.b1.Di().b2(f9Var.Q0(), I0);
            }
            m11.b0 b0Var = T1;
            java.lang.String str = b0Var.f404170e;
            java.lang.String aj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.c0.f104083a.d(b0Var.l()), str, "", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryQueryImageUtils", "getImagePath bigImagePath %s, %s", str, aj6);
            if (!(aj6 == null || aj6.length() == 0) && com.p314xaae8f345.mm.vfs.w6.j(aj6) && !r26.i0.o(aj6, ".temp", false, 2, null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryQueryImageUtils", "getScanImage >> sender is find >> ".concat(aj6));
                return aj6;
            }
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            java.lang.String G2 = m11.b1.Di().G2(f9Var.Q0(), b0Var);
            java.lang.String aj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.f0.f104095g, G2, "", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryQueryImageUtils", "getImagePath hdImagePath %s, %s", G2, aj7);
            if (aj7 != null && aj7.length() != 0) {
                z17 = false;
            }
            if (!z17 && com.p314xaae8f345.mm.vfs.w6.j(aj7) && !r26.i0.o(aj7, ".temp", false, 2, null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryQueryImageUtils", "getScanImage >> sender is find in next>> ".concat(aj7));
                return aj7;
            }
        } else {
            long I02 = f9Var.I0();
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 b27 = m11.b1.Di().b2(f9Var.Q0(), I02);
            java.lang.String str2 = b27.f404170e;
            java.lang.String aj8 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.c0.f104083a.d(b27.l()), str2, "", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryQueryImageUtils", "getImagePath receiver bigImagePath %s, %s", str2, aj8);
            if (!(aj8 == null || aj8.length() == 0) && com.p314xaae8f345.mm.vfs.w6.j(aj8) && !r26.i0.o(aj8, ".temp", false, 2, null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryQueryImageUtils", "getScanImage >> receiver is find >> ".concat(aj8));
                return aj8;
            }
            if (b27.j()) {
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                java.lang.String G22 = m11.b1.Di().G2(f9Var.Q0(), b27);
                java.lang.String aj9 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.f0.f104095g, G22, "", "");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryQueryImageUtils", "getImagePath receiver hdImagePath %s, %s", G22, aj9);
                if (aj9 != null && aj9.length() != 0) {
                    z17 = false;
                }
                if (!z17 && com.p314xaae8f345.mm.vfs.w6.j(aj9) && !r26.i0.o(aj9, ".temp", false, 2, null)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryQueryImageUtils", "getScanImage >> receiver is find in next>> ".concat(aj9));
                    return aj9;
                }
            }
        }
        return null;
    }

    public final android.util.Pair g(java.lang.String talker, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryQueryImageUtils", "getToIdentifyImageData >> talker: " + talker + ", isFromOpenFeature: " + z17 + ", " + java.lang.Thread.currentThread());
        long d17 = d(talker);
        if (d17 == -1) {
            android.database.Cursor A6 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).A6(talker, 500);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(A6, "getLimitImage(...)");
            return new android.util.Pair(c(A6, true), new java.util.ArrayList());
        }
        android.database.Cursor J3 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).J3(talker, d17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(J3, "getImageLargeThanTime(...)");
        java.util.ArrayList c17 = c(J3, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryQueryImageUtils", "getToIdentifyImageData >> latestListData: " + c17.size());
        long e17 = e(talker);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryQueryImageUtils", "getToIdentifyImageData >> " + e17);
        if (e17 != -1 && e17 != d17) {
            android.database.Cursor K3 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).K3(talker, e17, 50);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(K3, "getImageSmallThanTime(...)");
            java.util.ArrayList c18 = c(K3, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryQueryImageUtils", "getToIdentifyImageData >> oldestDataSize: " + c18.size());
            c17.addAll(c18);
        }
        java.util.ArrayList d18 = com.p314xaae8f345.mm.p2621x8fb0427b.s8.f276847a.d(talker, "0");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryQueryImageUtils", "getToIdentifyData >> oldDataInIdentifyDBSize: " + d18.size());
        return new android.util.Pair(c17, d18);
    }
}
