package co1;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f125302b = true;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f125304d;

    /* renamed from: j, reason: collision with root package name */
    public static volatile java.lang.Boolean f125310j;

    /* renamed from: a, reason: collision with root package name */
    public static final co1.g f125301a = new co1.g();

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f125303c = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("RoamBackup", gm0.j1.b().h(), 1);

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentSkipListSet f125305e = new java.util.concurrent.ConcurrentSkipListSet();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentSkipListSet f125306f = new java.util.concurrent.ConcurrentSkipListSet();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentSkipListSet f125307g = new java.util.concurrent.ConcurrentSkipListSet();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f125308h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f125309i = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: k, reason: collision with root package name */
    public static final byte[] f125311k = new byte[0];

    /* JADX WARN: Code restructure failed: missing block: B:33:0x020b, code lost:
    
        if (r2 == false) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jz5.o a(final java.lang.String r35, long r36, final long r38, long r40, long r42, final int r44, do1.a r45) {
        /*
            Method dump skipped, instructions count: 1087
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co1.g.a(java.lang.String, long, long, long, long, int, do1.a):jz5.o");
    }

    public final boolean b(java.lang.String conversationId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conversationId, "conversationId");
        if (f125310j != null) {
            java.lang.Boolean bool = f125310j;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(bool, "null cannot be cast to non-null type kotlin.Boolean");
            return bool.booleanValue();
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        xg3.m0 g17 = tn1.f.f().e().g();
        synchronized (f125311k) {
            if (f125310j == null) {
                f125310j = java.lang.Boolean.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.g9) g17).s0(conversationId, 5000));
                java.lang.System.currentTimeMillis();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackupLogical", "checkFilterFlag: %s, duration: %s", f125310j, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        java.lang.Boolean bool2 = f125310j;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(bool2, "null cannot be cast to non-null type kotlin.Boolean");
        return bool2.booleanValue();
    }

    public final boolean c(final java.lang.String talker) {
        long j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f125309i;
        if (concurrentHashMap.containsKey(talker)) {
            java.lang.Long l17 = (java.lang.Long) concurrentHashMap.get(talker);
            if (l17 == null) {
                l17 = 0L;
            }
            return l17.longValue() > 0;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        final com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.g9) tn1.f.f().e().g();
        java.lang.String X8 = g9Var.X8(talker);
        final int i17 = 50;
        if (g9Var.Da(X8)) {
            j17 = ot0.c3.l().f("getMsgCountByTalkerAndType", new yz5.a() { // from class: com.tencent.mm.storage.g9$$a4
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return java.lang.Long.valueOf(ot0.z2.f430355a.X0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, talker, i17));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$b4
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var2.getClass();
                    android.database.Cursor f17 = g9Var2.f275522r.f("SELECT COUNT(*) FROM message WHERE talker='" + talker + "' AND type = " + i17, null, 2);
                    long j18 = f17.moveToFirst() ? f17.getLong(0) : 0L;
                    f17.close();
                    return java.lang.Long.valueOf(j18);
                }
            });
        } else {
            boolean Pb = g9Var.Pb(X8);
            l75.k0 k0Var = g9Var.f275522r;
            if (Pb) {
                j17 = ot0.z2.f430355a.X0(k0Var, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, talker, 50);
            } else {
                android.database.Cursor f17 = k0Var.f("SELECT COUNT(*) FROM message WHERE talker='" + talker + "' AND type = 50", null, 2);
                j17 = f17.moveToFirst() ? f17.getLong(0) : 0L;
                f17.close();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackupLogical", "conversationHasVoipMessage, talker = " + talker + ", count = " + j17 + ", duration = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        concurrentHashMap.put(talker, java.lang.Long.valueOf(j17));
        return j17 > 0;
    }

    public final void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackupLogical", "endRecover");
        f125305e.clear();
        f125306f.clear();
        f125307g.clear();
        f125308h.clear();
        f125309i.clear();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 mmkv = f125303c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mmkv, "mmkv");
        mmkv.d();
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5270x49b3890e().e();
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5181x6d2f4734().e();
        tn1.c d17 = tn1.f.f().d();
        d17.f502330b.mo50293x3498a0(new tn1.a(d17));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().tb();
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6018xb4c9a28b().e();
        fq3.n nVar = (fq3.n) ((gq3.e) i95.n0.c(gq3.e.class));
        nVar.getClass();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(nVar.C, null);
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6018xb4c9a28b().e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackupLogical", "endRecover done");
        ((ku5.t0) ku5.t0.f394148d).k(co1.e.f125297d, 3600000L);
    }

    public final void e(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackupLogical", "fillPayMsgKey, talker is null");
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f125308h;
        if (concurrentHashMap.containsKey(str)) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor x86 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) tn1.f.f().e().g()).x8(str);
        if (x86 == null) {
            return;
        }
        while (x86.moveToNext()) {
            android.util.Pair q17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.q(x86.getString(0));
            java.lang.Integer num = (java.lang.Integer) q17.first;
            java.lang.String str2 = (java.lang.String) q17.second;
            if (str2 != null) {
                if (str2.length() > 0) {
                    arrayList.add(new jz5.l(num, str2));
                }
            }
        }
        x86.close();
        concurrentHashMap.put(str, arrayList);
    }

    public final jz5.l f(java.lang.String convId, java.util.ArrayList arrayList, java.util.ArrayList mediaIdList, java.util.ArrayList mediaTypeList) {
        long j17;
        java.util.ArrayList svrIdList = arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convId, "convId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(svrIdList, "svrIdList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaIdList, "mediaIdList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaTypeList, "mediaTypeList");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (!b(convId)) {
            return new jz5.l(0L, arrayList2);
        }
        xg3.m0 g17 = tn1.f.f().e().g();
        int size = mediaIdList.size();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = null;
        int i17 = 0;
        long j18 = 0;
        while (i17 < size) {
            java.lang.Object obj = svrIdList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            int i18 = size;
            long longValue = ((java.lang.Number) obj).longValue();
            java.lang.Object obj2 = mediaIdList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
            java.lang.String str = (java.lang.String) obj2;
            java.lang.Object obj3 = mediaTypeList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
            int intValue = ((java.lang.Number) obj3).intValue();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = (f9Var == null || longValue != f9Var.I0()) ? ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) g17).o2(convId, longValue) : f9Var;
            if (o27 == null) {
                j17 = 0;
            } else {
                do1.b a17 = co1.d.f125295a.a(o27.mo78013xfb85f7b0());
                if (a17 != null) {
                    long g18 = a17.g(o27, str, intValue);
                    j17 = 0;
                    if (g18 > 0) {
                        j18 += g18;
                        arrayList2.add(str);
                    }
                } else {
                    j17 = 0;
                }
                f9Var = o27;
            }
            i17++;
            svrIdList = arrayList;
            size = i18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackupLogical", "ConversationId = " + convId + ", filteredSize = " + j18 + ", filteredMediaIdList.size = " + arrayList2.size() + ", duration = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        return new jz5.l(java.lang.Long.valueOf(j18), arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 g(java.lang.String r8, bw5.u0 r9, bw5.t0 r10, jz5.l r11, co1.c r12) {
        /*
            r7 = this;
            java.lang.String r0 = co1.g.f125304d
            r1 = 2
            if (r0 != 0) goto L15
            c01.f r0 = c01.d9.b()
            com.tencent.mm.storage.n3 r0 = r0.p()
            java.lang.String r2 = ""
            java.lang.String r0 = r0.u(r1, r2)
            co1.g.f125304d = r0
        L15:
            java.lang.String r0 = co1.g.f125304d
            java.lang.String r2 = r9.f115205e
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r2)
            if (r0 != 0) goto L40
            tn1.f r0 = tn1.f.f()
            tn1.d r0 = r0.e()
            int r2 = r0.f502345o
            if (r2 == 0) goto L3a
            xg3.r0 r0 = r0.f502337g
            java.lang.String r2 = r9.f115205e
            com.tencent.mm.storage.ka r0 = (com.p314xaae8f345.mm.p2621x8fb0427b.ka) r0
            boolean r0 = r0.s0(r2)
            if (r0 == 0) goto L38
            goto L40
        L38:
            r0 = 0
            goto L41
        L3a:
            c01.c r8 = new c01.c
            r8.<init>()
            throw r8
        L40:
            r0 = 1
        L41:
            com.tencent.mm.storage.f9 r2 = new com.tencent.mm.storage.f9
            r2.<init>()
            int r3 = r9.f115204d
            r2.m124850x7650bebc(r3)
            long r3 = r9.f115208h
            r2.e1(r3)
            java.lang.String r3 = r9.f115209i
            r2.u3(r3)
            long r3 = r9.f115210m
            r2.o1(r3)
            long r3 = r9.f115211n
            r2.n1(r3)
            r2.u1(r8)
            long r3 = r2.mo78012x3fdd41df()
            java.lang.Object r8 = r11.f384366d
            com.tencent.mm.pointers.PLong r8 = (com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec) r8
            long r5 = r8.f38866x6ac9171
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            java.lang.Object r11 = r11.f384367e
            if (r3 != 0) goto L83
            com.tencent.mm.pointers.PLong r11 = (com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec) r11
            long r3 = r11.f38866x6ac9171
            r5 = 1
            long r3 = r3 + r5
            r2.e1(r3)
            long r3 = r2.mo78012x3fdd41df()
            r11.f38866x6ac9171 = r3
            goto L91
        L83:
            long r3 = r2.mo78012x3fdd41df()
            r8.f38866x6ac9171 = r3
            com.tencent.mm.pointers.PLong r11 = (com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec) r11
            long r3 = r2.mo78012x3fdd41df()
            r11.f38866x6ac9171 = r3
        L91:
            r2.j1(r0)
            if (r0 == 0) goto L97
            goto L98
        L97:
            r1 = 4
        L98:
            r2.r1(r1)
            co1.d r8 = co1.d.f125295a
            int r11 = r9.f115204d
            do1.b r8 = r8.a(r11)
            r11 = 0
            if (r8 == 0) goto Laf
            boolean r8 = r8.d(r2, r9, r10, r12)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            goto Lb0
        Laf:
            r8 = r11
        Lb0:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            boolean r8 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r8, r9)
            if (r8 == 0) goto Lb9
            goto Lba
        Lb9:
            r2 = r11
        Lba:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: co1.g.g(java.lang.String, bw5.u0, bw5.t0, jz5.l, co1.c):com.tencent.mm.storage.f9");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r25, co1.a r26, boolean r27, yz5.p r28) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co1.g.h(com.tencent.mm.storage.f9, co1.a, boolean, yz5.p):void");
    }

    public final void i(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true);
        if ((n17 == null || ((int) n17.E2) == 0) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            tn1.c d17 = tn1.f.f().d();
            d17.f502329a.add(new tn1.b(d17, 2, str));
            boolean z17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) tn1.f.f().e().c()).i0(new com.p314xaae8f345.mm.p2621x8fb0427b.z3(str)) > 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackupLogical", "insert contact " + str + ", res:" + z17);
            if (z17) {
                return;
            }
            kn1.p pVar = kn1.q.f391191a;
            kn1.q.a(kn1.m.f391173p, kn1.o.f391182e, "InsertContactFail: talker=" + str);
        }
    }

    public final void j(long j17, java.lang.String fullPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fullPath, "fullPath");
        f125303c.D(java.lang.String.valueOf(j17), fullPath);
    }

    /* JADX WARN: Code restructure failed: missing block: B:240:0x0ad3, code lost:
    
        if (r2 == null) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x028c, code lost:
    
        if (r4 != false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0b08 A[Catch: all -> 0x0b7d, TryCatch #15 {all -> 0x0b7d, blocks: (B:239:0x0acd, B:209:0x0ad7, B:212:0x0b08, B:214:0x0b1c), top: B:238:0x0acd }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0b98 A[LOOP:3: B:220:0x0b92->B:222:0x0b98, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0b63  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0acd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x09e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r71, bw5.w0 r72, long r73, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r75) {
        /*
            Method dump skipped, instructions count: 3053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co1.g.k(java.lang.String, bw5.w0, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void l() {
        f125305e.clear();
        f125306f.clear();
        f125307g.clear();
        f125308h.clear();
        f125309i.clear();
        tn1.f.f().c();
        z65.c.f551991d = true;
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).k(true);
        fq3.n nVar = (fq3.n) ((gq3.e) i95.n0.c(gq3.e.class));
        nVar.getClass();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(nVar.C);
    }

    public final void m(java.lang.String talker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        tn1.d e17 = tn1.f.f().e();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 x57 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) e17.g()).x5(talker, " and not ( type = 10000 and isSend != 2 ) ");
        if (x57 == null) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) e17.d()).p(talker);
        boolean z17 = true;
        if (p17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackupLogical", "updateConversation, cvs is null, talker".concat(talker));
            p17 = new com.p314xaae8f345.mm.p2621x8fb0427b.l4(talker);
        } else {
            if (p17.w0() >= x57.mo78012x3fdd41df() && p17.w0() != com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
                java.lang.String j17 = p17.j();
                if (j17 != null && j17.length() != 0) {
                    z17 = false;
                }
                if (!z17 && p17.T0() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RoamBackupLogical", "Ignore updateConvFromLastMsg, talker".concat(talker));
                    return;
                }
            }
            z17 = false;
        }
        p17.h2(x57);
        p17.S1(java.lang.String.valueOf(x57.mo78013xfb85f7b0()));
        p17.z1((p17.G0() & 4611686018427387904L) | (x57.mo78012x3fdd41df() & 72057594037927935L));
        p17.R1(0);
        if (((com.p314xaae8f345.mm.p2621x8fb0427b.m4) tn1.f.f().e().d()).w() != null) {
            com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd0812 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            try {
                qm.a0.d(x57, c19772x1c2cd081, c19772x1c2cd0812, c19767x257d7f, p17.d2(2097152));
                p17.o1(c19772x1c2cd081.f38869x6ac9171);
                p17.p1(c19772x1c2cd0812.f38869x6ac9171);
                p17.K1(c19767x257d7f.f38864x6ac9171);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupStorageLogic", "getDigest error, cvs = " + p17.h1() + ", error = " + th6.getMessage());
            }
        } else {
            try {
                java.lang.String L = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) tn1.f.f().e().d()).L(x57.mo78013xfb85f7b0(), p17.j());
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String y07 = p17.y0();
                java.lang.String str = "";
                if (y07 == null) {
                    y07 = "";
                }
                sb6.append(y07);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(L)) {
                    if (L == null) {
                        L = "";
                    }
                    str = " ".concat(L);
                }
                sb6.append(str);
                p17.o1(sb6.toString());
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupStorageLogic", "parseMsgContentTitle error, cvs = " + p17.h1() + ", error = " + th7.getMessage());
            }
        }
        vg3.s3 s3Var = (vg3.s3) i95.n0.c(vg3.s3.class);
        if (s3Var != null) {
            ((r01.s1) s3Var).Di(x57, p17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackupLogical", "updateConversation, isNewConv:" + z17 + ", talker" + talker + ", flag:" + p17.G0() + ", digest = " + p17.y0());
        if (z17) {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) e17.d()).G(p17);
        } else {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) e17.d()).W(p17, talker);
        }
        if (e17.f502345o == 0) {
            throw new c01.c();
        }
        ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) e17.f502343m).u0(talker, 0L);
    }
}
