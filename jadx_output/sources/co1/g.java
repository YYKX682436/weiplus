package co1;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f43769b = true;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f43771d;

    /* renamed from: j, reason: collision with root package name */
    public static volatile java.lang.Boolean f43777j;

    /* renamed from: a, reason: collision with root package name */
    public static final co1.g f43768a = new co1.g();

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f43770c = com.tencent.mm.sdk.platformtools.o4.J("RoamBackup", gm0.j1.b().h(), 1);

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentSkipListSet f43772e = new java.util.concurrent.ConcurrentSkipListSet();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentSkipListSet f43773f = new java.util.concurrent.ConcurrentSkipListSet();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentSkipListSet f43774g = new java.util.concurrent.ConcurrentSkipListSet();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f43775h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f43776i = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: k, reason: collision with root package name */
    public static final byte[] f43778k = new byte[0];

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
        kotlin.jvm.internal.o.g(conversationId, "conversationId");
        if (f43777j != null) {
            java.lang.Boolean bool = f43777j;
            kotlin.jvm.internal.o.e(bool, "null cannot be cast to non-null type kotlin.Boolean");
            return bool.booleanValue();
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        xg3.m0 g17 = tn1.f.f().e().g();
        synchronized (f43778k) {
            if (f43777j == null) {
                f43777j = java.lang.Boolean.valueOf(((com.tencent.mm.storage.g9) g17).s0(conversationId, 5000));
                java.lang.System.currentTimeMillis();
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupLogical", "checkFilterFlag: %s, duration: %s", f43777j, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        java.lang.Boolean bool2 = f43777j;
        kotlin.jvm.internal.o.e(bool2, "null cannot be cast to non-null type kotlin.Boolean");
        return bool2.booleanValue();
    }

    public final boolean c(final java.lang.String talker) {
        long j17;
        kotlin.jvm.internal.o.g(talker, "talker");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f43776i;
        if (concurrentHashMap.containsKey(talker)) {
            java.lang.Long l17 = (java.lang.Long) concurrentHashMap.get(talker);
            if (l17 == null) {
                l17 = 0L;
            }
            return l17.longValue() > 0;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        final com.tencent.mm.storage.g9 g9Var = (com.tencent.mm.storage.g9) tn1.f.f().e().g();
        java.lang.String X8 = g9Var.X8(talker);
        final int i17 = 50;
        if (g9Var.Da(X8)) {
            j17 = ot0.c3.l().f("getMsgCountByTalkerAndType", new yz5.a() { // from class: com.tencent.mm.storage.g9$$a4
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    return java.lang.Long.valueOf(ot0.z2.f348822a.X0(com.tencent.mm.storage.g9.this.f193989r, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, talker, i17));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$b4
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    com.tencent.mm.storage.g9 g9Var2 = com.tencent.mm.storage.g9.this;
                    g9Var2.getClass();
                    android.database.Cursor f17 = g9Var2.f193989r.f("SELECT COUNT(*) FROM message WHERE talker='" + talker + "' AND type = " + i17, null, 2);
                    long j18 = f17.moveToFirst() ? f17.getLong(0) : 0L;
                    f17.close();
                    return java.lang.Long.valueOf(j18);
                }
            });
        } else {
            boolean Pb = g9Var.Pb(X8);
            l75.k0 k0Var = g9Var.f193989r;
            if (Pb) {
                j17 = ot0.z2.f348822a.X0(k0Var, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, talker, 50);
            } else {
                android.database.Cursor f17 = k0Var.f("SELECT COUNT(*) FROM message WHERE talker='" + talker + "' AND type = 50", null, 2);
                j17 = f17.moveToFirst() ? f17.getLong(0) : 0L;
                f17.close();
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupLogical", "conversationHasVoipMessage, talker = " + talker + ", count = " + j17 + ", duration = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        concurrentHashMap.put(talker, java.lang.Long.valueOf(j17));
        return j17 > 0;
    }

    public final void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupLogical", "endRecover");
        f43772e.clear();
        f43773f.clear();
        f43774g.clear();
        f43775h.clear();
        f43776i.clear();
        com.tencent.mm.sdk.platformtools.o4 mmkv = f43770c;
        kotlin.jvm.internal.o.f(mmkv, "mmkv");
        mmkv.d();
        new com.tencent.mm.autogen.events.CleanWxFileIndexEvent().e();
        new com.tencent.mm.autogen.events.BackupResetAccUinEvent().e();
        tn1.c d17 = tn1.f.f().d();
        d17.f420797b.post(new tn1.a(d17));
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().tb();
        new com.tencent.mm.autogen.events.ShouldRescanMessagesEvent().e();
        fq3.n nVar = (fq3.n) ((gq3.e) i95.n0.c(gq3.e.class));
        nVar.getClass();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(nVar.C, null);
        new com.tencent.mm.autogen.events.ShouldRescanMessagesEvent().e();
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupLogical", "endRecover done");
        ((ku5.t0) ku5.t0.f312615d).k(co1.e.f43764d, 3600000L);
    }

    public final void e(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupLogical", "fillPayMsgKey, talker is null");
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f43775h;
        if (concurrentHashMap.containsKey(str)) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor x86 = ((com.tencent.mm.storage.g9) tn1.f.f().e().g()).x8(str);
        if (x86 == null) {
            return;
        }
        while (x86.moveToNext()) {
            android.util.Pair q17 = com.tencent.mm.pluginsdk.model.app.k0.q(x86.getString(0));
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
        kotlin.jvm.internal.o.g(convId, "convId");
        kotlin.jvm.internal.o.g(svrIdList, "svrIdList");
        kotlin.jvm.internal.o.g(mediaIdList, "mediaIdList");
        kotlin.jvm.internal.o.g(mediaTypeList, "mediaTypeList");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (!b(convId)) {
            return new jz5.l(0L, arrayList2);
        }
        xg3.m0 g17 = tn1.f.f().e().g();
        int size = mediaIdList.size();
        com.tencent.mm.storage.f9 f9Var = null;
        int i17 = 0;
        long j18 = 0;
        while (i17 < size) {
            java.lang.Object obj = svrIdList.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            int i18 = size;
            long longValue = ((java.lang.Number) obj).longValue();
            java.lang.Object obj2 = mediaIdList.get(i17);
            kotlin.jvm.internal.o.f(obj2, "get(...)");
            java.lang.String str = (java.lang.String) obj2;
            java.lang.Object obj3 = mediaTypeList.get(i17);
            kotlin.jvm.internal.o.f(obj3, "get(...)");
            int intValue = ((java.lang.Number) obj3).intValue();
            com.tencent.mm.storage.f9 o27 = (f9Var == null || longValue != f9Var.I0()) ? ((com.tencent.mm.storage.g9) g17).o2(convId, longValue) : f9Var;
            if (o27 == null) {
                j17 = 0;
            } else {
                do1.b a17 = co1.d.f43762a.a(o27.getType());
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
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupLogical", "ConversationId = " + convId + ", filteredSize = " + j18 + ", filteredMediaIdList.size = " + arrayList2.size() + ", duration = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
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
    public final com.tencent.mm.storage.f9 g(java.lang.String r8, bw5.u0 r9, bw5.t0 r10, jz5.l r11, co1.c r12) {
        /*
            r7 = this;
            java.lang.String r0 = co1.g.f43771d
            r1 = 2
            if (r0 != 0) goto L15
            c01.f r0 = c01.d9.b()
            com.tencent.mm.storage.n3 r0 = r0.p()
            java.lang.String r2 = ""
            java.lang.String r0 = r0.u(r1, r2)
            co1.g.f43771d = r0
        L15:
            java.lang.String r0 = co1.g.f43771d
            java.lang.String r2 = r9.f33672e
            boolean r0 = kotlin.jvm.internal.o.b(r0, r2)
            if (r0 != 0) goto L40
            tn1.f r0 = tn1.f.f()
            tn1.d r0 = r0.e()
            int r2 = r0.f420812o
            if (r2 == 0) goto L3a
            xg3.r0 r0 = r0.f420804g
            java.lang.String r2 = r9.f33672e
            com.tencent.mm.storage.ka r0 = (com.tencent.mm.storage.ka) r0
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
            int r3 = r9.f33671d
            r2.setType(r3)
            long r3 = r9.f33675h
            r2.e1(r3)
            java.lang.String r3 = r9.f33676i
            r2.u3(r3)
            long r3 = r9.f33677m
            r2.o1(r3)
            long r3 = r9.f33678n
            r2.n1(r3)
            r2.u1(r8)
            long r3 = r2.getCreateTime()
            java.lang.Object r8 = r11.f302833d
            com.tencent.mm.pointers.PLong r8 = (com.tencent.mm.pointers.PLong) r8
            long r5 = r8.value
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            java.lang.Object r11 = r11.f302834e
            if (r3 != 0) goto L83
            com.tencent.mm.pointers.PLong r11 = (com.tencent.mm.pointers.PLong) r11
            long r3 = r11.value
            r5 = 1
            long r3 = r3 + r5
            r2.e1(r3)
            long r3 = r2.getCreateTime()
            r11.value = r3
            goto L91
        L83:
            long r3 = r2.getCreateTime()
            r8.value = r3
            com.tencent.mm.pointers.PLong r11 = (com.tencent.mm.pointers.PLong) r11
            long r3 = r2.getCreateTime()
            r11.value = r3
        L91:
            r2.j1(r0)
            if (r0 == 0) goto L97
            goto L98
        L97:
            r1 = 4
        L98:
            r2.r1(r1)
            co1.d r8 = co1.d.f43762a
            int r11 = r9.f33671d
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
            boolean r8 = kotlin.jvm.internal.o.b(r8, r9)
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
    public final void h(com.tencent.mm.storage.f9 r25, co1.a r26, boolean r27, yz5.p r28) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co1.g.h(com.tencent.mm.storage.f9, co1.a, boolean, yz5.p):void");
    }

    public final void i(java.lang.String str) {
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
        if ((n17 == null || ((int) n17.E2) == 0) && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            tn1.c d17 = tn1.f.f().d();
            d17.f420796a.add(new tn1.b(d17, 2, str));
            boolean z17 = ((com.tencent.mm.storage.k4) tn1.f.f().e().c()).i0(new com.tencent.mm.storage.z3(str)) > 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupLogical", "insert contact " + str + ", res:" + z17);
            if (z17) {
                return;
            }
            kn1.p pVar = kn1.q.f309658a;
            kn1.q.a(kn1.m.f309640p, kn1.o.f309649e, "InsertContactFail: talker=" + str);
        }
    }

    public final void j(long j17, java.lang.String fullPath) {
        kotlin.jvm.internal.o.g(fullPath, "fullPath");
        f43770c.D(java.lang.String.valueOf(j17), fullPath);
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
    public final java.lang.Object k(java.lang.String r71, bw5.w0 r72, long r73, kotlin.coroutines.Continuation r75) {
        /*
            Method dump skipped, instructions count: 3053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co1.g.k(java.lang.String, bw5.w0, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void l() {
        f43772e.clear();
        f43773f.clear();
        f43774g.clear();
        f43775h.clear();
        f43776i.clear();
        tn1.f.f().c();
        z65.c.f470458d = true;
        ((com.tencent.mm.booter.notification.x) c01.d9.f()).k(true);
        fq3.n nVar = (fq3.n) ((gq3.e) i95.n0.c(gq3.e.class));
        nVar.getClass();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(nVar.C);
    }

    public final void m(java.lang.String talker) {
        kotlin.jvm.internal.o.g(talker, "talker");
        tn1.d e17 = tn1.f.f().e();
        com.tencent.mm.storage.f9 x57 = ((com.tencent.mm.storage.g9) e17.g()).x5(talker, " and not ( type = 10000 and isSend != 2 ) ");
        if (x57 == null) {
            return;
        }
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) e17.d()).p(talker);
        boolean z17 = true;
        if (p17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupLogical", "updateConversation, cvs is null, talker".concat(talker));
            p17 = new com.tencent.mm.storage.l4(talker);
        } else {
            if (p17.w0() >= x57.getCreateTime() && p17.w0() != com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
                java.lang.String j17 = p17.j();
                if (j17 != null && j17.length() != 0) {
                    z17 = false;
                }
                if (!z17 && p17.T0() == 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.RoamBackupLogical", "Ignore updateConvFromLastMsg, talker".concat(talker));
                    return;
                }
            }
            z17 = false;
        }
        p17.h2(x57);
        p17.S1(java.lang.String.valueOf(x57.getType()));
        p17.z1((p17.G0() & 4611686018427387904L) | (x57.getCreateTime() & 72057594037927935L));
        p17.R1(0);
        if (((com.tencent.mm.storage.m4) tn1.f.f().e().d()).w() != null) {
            com.tencent.mm.pointers.PString pString = new com.tencent.mm.pointers.PString();
            com.tencent.mm.pointers.PString pString2 = new com.tencent.mm.pointers.PString();
            com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
            try {
                qm.a0.d(x57, pString, pString2, pInt, p17.d2(2097152));
                p17.o1(pString.value);
                p17.p1(pString2.value);
                p17.K1(pInt.value);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BackupStorageLogic", "getDigest error, cvs = " + p17.h1() + ", error = " + th6.getMessage());
            }
        } else {
            try {
                java.lang.String L = ((com.tencent.mm.storage.m4) tn1.f.f().e().d()).L(x57.getType(), p17.j());
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String y07 = p17.y0();
                java.lang.String str = "";
                if (y07 == null) {
                    y07 = "";
                }
                sb6.append(y07);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(L)) {
                    if (L == null) {
                        L = "";
                    }
                    str = " ".concat(L);
                }
                sb6.append(str);
                p17.o1(sb6.toString());
            } catch (java.lang.Throwable th7) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BackupStorageLogic", "parseMsgContentTitle error, cvs = " + p17.h1() + ", error = " + th7.getMessage());
            }
        }
        vg3.s3 s3Var = (vg3.s3) i95.n0.c(vg3.s3.class);
        if (s3Var != null) {
            ((r01.s1) s3Var).Di(x57, p17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupLogical", "updateConversation, isNewConv:" + z17 + ", talker" + talker + ", flag:" + p17.G0() + ", digest = " + p17.y0());
        if (z17) {
            ((com.tencent.mm.storage.m4) e17.d()).G(p17);
        } else {
            ((com.tencent.mm.storage.m4) e17.d()).W(p17, talker);
        }
        if (e17.f420812o == 0) {
            throw new c01.c();
        }
        ((com.tencent.mm.storage.x4) e17.f420810m).u0(talker, 0L);
    }
}
