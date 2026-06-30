package ln1;

/* loaded from: classes12.dex */
public class x {
    public static boolean B = false;
    public static int C = 8;
    public static final boolean D = j62.e.g().l("clicfg_backup_recover_merge_optimize", false, true, true);
    public static final boolean E = j62.e.g().l("clicfg_backup_recover_merge_mem_strictly", false, true, true);
    public static final boolean F = j62.e.g().l("clicfg_backup_recover_merge_mem_loosely", false, true, true);
    public static final boolean G;
    public int A;

    /* renamed from: a, reason: collision with root package name */
    public boolean f401380a;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f401383d;

    /* renamed from: f, reason: collision with root package name */
    public final int f401385f;

    /* renamed from: g, reason: collision with root package name */
    public final long f401386g;

    /* renamed from: h, reason: collision with root package name */
    public volatile long f401387h;

    /* renamed from: j, reason: collision with root package name */
    public final kn1.f f401389j;

    /* renamed from: k, reason: collision with root package name */
    public final int f401390k;

    /* renamed from: m, reason: collision with root package name */
    public kn1.e f401392m;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f401394o;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f401396q;

    /* renamed from: t, reason: collision with root package name */
    public java.util.concurrent.ExecutorService f401399t;

    /* renamed from: z, reason: collision with root package name */
    public boolean f401405z;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f401381b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f401382c = false;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f401384e = new java.util.HashSet();

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f401388i = new java.lang.Object();

    /* renamed from: l, reason: collision with root package name */
    public long f401391l = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f401393n = 0;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6334xad1e0c67 f401395p = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6334xad1e0c67();

    /* renamed from: r, reason: collision with root package name */
    public long f401397r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Map f401398s = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentSkipListSet f401400u = new java.util.concurrent.ConcurrentSkipListSet();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentSkipListSet f401401v = new java.util.concurrent.ConcurrentSkipListSet();

    /* renamed from: w, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentSkipListSet f401402w = new java.util.concurrent.ConcurrentSkipListSet();

    /* renamed from: x, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f401403x = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: y, reason: collision with root package name */
    public long f401404y = 0;

    static {
        j62.e.g().l("clicfg_backup_recover_merge_complement_media", false, true, true);
        G = j62.e.g().l("clicfg_backup_recover_avoid_same_message", false, true, true);
    }

    public x(kn1.f fVar, int i17, kn1.e eVar, int i18, boolean z17, java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        long j17;
        com.p314xaae8f345.mm.p2621x8fb0427b.o h17 = c01.d9.b().h();
        h17.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        android.database.Cursor mo78085xb5882a6b = h17.mo78085xb5882a6b();
        if (mo78085xb5882a6b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupRecoverMsgListDataIdStorage", "getAllData failed.");
        } else {
            while (mo78085xb5882a6b.moveToNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.n nVar = new com.p314xaae8f345.mm.p2621x8fb0427b.n();
                nVar.mo9015xbf5d97fd(mo78085xb5882a6b);
                hashMap.put(nVar.f68234xd5d4f07f, nVar.f68235x6a658e7c);
            }
            mo78085xb5882a6b.close();
        }
        this.f401383d = hashMap;
        this.f401389j = fVar;
        this.f401390k = i17;
        this.f401392m = eVar;
        this.f401385f = i18;
        B = z17;
        com.p314xaae8f345.mm.p2621x8fb0427b.o h18 = c01.d9.b().h();
        h18.getClass();
        android.database.Cursor cursor = null;
        try {
            try {
                cursor = h18.f276721d.B("SELECT COUNT(*) FROM BackupRecoverMsgListDataId", null);
                j17 = cursor.moveToLast() ? cursor.getLong(0) : 0L;
                cursor.close();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BackupRecoverMsgListDataIdStorage", e17, "longForQuery failed", new java.lang.Object[0]);
                if (cursor != null) {
                    cursor.close();
                }
                j17 = 0;
            }
            this.f401386g = j17;
            java.util.HashMap hashMap2 = new java.util.HashMap();
            java.util.Iterator it = linkedList2.iterator();
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                java.lang.String str = (java.lang.String) it6.next();
                if (it.hasNext()) {
                    long longValue = ((java.lang.Long) it.next()).longValue();
                    longValue = longValue == 0 ? Long.MIN_VALUE : longValue;
                    if (!it.hasNext()) {
                        break;
                    }
                    long longValue2 = ((java.lang.Long) it.next()).longValue();
                    hashMap2.put(str, new android.util.Pair(java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(longValue2 == 0 ? com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 : longValue2)));
                }
            }
            this.f401396q = hashMap2;
            this.f401384e.clear();
            this.f401387h = 0L;
            this.f401394o = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_BACKUP");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRecoverMerger", "BackupRecoverMerger, msgListDataIdHashMap[%d], backupMode[%d], totalMsgList[%d], totalSession[%d], isQuickBackup[%b]", java.lang.Integer.valueOf(this.f401383d.size()), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(this.f401386g), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17));
        } catch (java.lang.Throwable th6) {
            if (cursor != null) {
                cursor.close();
            }
            throw th6;
        }
    }

    public static void a(ln1.x xVar, boolean z17, int i17) {
        int i18 = xVar.f401393n;
        if (i18 == 1 || i18 == 0) {
            if (i18 == 1) {
                xVar.c();
            }
            xVar.f401393n = 2;
            if (z17) {
                int i19 = xVar.f401390k;
                if (i19 == 1) {
                    c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BACKUP_PC_MERGERING_BOOLEAN, java.lang.Boolean.FALSE);
                } else if (i19 == 2) {
                    c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BACKUP_MOVE_MERGERING_BOOLEAN, java.lang.Boolean.FALSE);
                }
                ((ku5.t0) ku5.t0.f394148d).g(new ln1.w(xVar));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRecoverMerger", "cancel and restart sync");
            if (i17 != 0) {
                xVar.f401389j.e().f391142a = i17;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                xVar.i(i17);
            }
            xVar.f401393n = 0;
            synchronized (xVar) {
                xVar.f401382c = false;
            }
            int i27 = xVar.f401394o.getInt("MMKV_BACKUP_TRY_TIME", 0);
            xVar.f401394o.A("MMKV_BACKUP_TRY_TIME", i27 > 0 ? i27 - 1 : 0);
            xVar.f401394o.G("MMKV_BACKUP_NEED_REPORT", false);
            xVar.f401394o.D("MMKV_BACKUP_ERROR_CACHE", "");
            xVar.f401389j.g();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x020e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022a A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02f8 A[Catch: all -> 0x0302, TryCatch #1 {all -> 0x0302, blocks: (B:163:0x0253, B:164:0x025a, B:166:0x0260, B:269:0x0272, B:274:0x0282, B:272:0x028a, B:191:0x02f2, B:193:0x02f8, B:200:0x030a, B:202:0x0314, B:204:0x0318, B:206:0x031e, B:211:0x0343, B:213:0x0361, B:215:0x0379, B:216:0x0399, B:225:0x0468, B:227:0x048f, B:230:0x03ce, B:232:0x03e2, B:234:0x03ec, B:235:0x03f1, B:236:0x03f2, B:238:0x03fa, B:240:0x0408, B:242:0x0416, B:244:0x0422, B:246:0x042a, B:247:0x0443, B:249:0x0458, B:250:0x045d, B:251:0x045e, B:169:0x0298, B:257:0x02ae, B:259:0x02ba, B:265:0x02c3, B:177:0x02c9, B:181:0x02d7, B:183:0x02e3, B:190:0x02ed, B:277:0x04a3, B:208:0x0324), top: B:162:0x0253, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x02ae A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(ln1.x r33, java.lang.String r34, java.util.Map r35, android.util.Pair r36, java.lang.String r37, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 r38, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a r39) {
        /*
            Method dump skipped, instructions count: 1512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ln1.x.b(ln1.x, java.lang.String, java.util.Map, android.util.Pair, java.lang.String, com.tencent.mm.pointers.PString, com.tencent.mm.pointers.PBool):int");
    }

    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRecoverMerger", "backupFinishMerge");
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5270x49b3890e().e();
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5181x6d2f4734().e();
        tn1.c d17 = tn1.f.f().d();
        d17.f502330b.mo50293x3498a0(new tn1.a(d17));
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).tb();
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6018xb4c9a28b().e();
        z65.c.f551991d = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a = false;
        fq3.n nVar = (fq3.n) ((gq3.e) i95.n0.c(gq3.e.class));
        nVar.getClass();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(nVar.C, null);
        on1.c.f428342d.clear();
        this.f401400u.clear();
        this.f401401v.clear();
        this.f401402w.clear();
        this.f401403x.clear();
        if (G && this.f401404y > 0) {
            jx3.f.INSTANCE.d(21019, 0, java.lang.Long.valueOf(this.f401404y), java.lang.Integer.valueOf(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761), "existMsgSvrIdSet_finish");
        }
        java.util.concurrent.ExecutorService executorService = this.f401399t;
        if (executorService != null) {
            executorService.shutdownNow();
        }
    }

    public void d(boolean z17, int i17) {
        synchronized (this.f401388i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRecoverMerger", "cancel, needClearContinueRecoverData[%b], mergeState[%d], updateState[%d]", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f401393n), java.lang.Integer.valueOf(i17));
            this.f401380a = true;
        }
        if (G && this.f401404y > 0) {
            jx3.f.INSTANCE.d(21019, 0, java.lang.Long.valueOf(this.f401404y), java.lang.Integer.valueOf(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761), "existMsgSvrIdSet_cancel");
        }
        this.f401405z = z17;
        this.A = i17;
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).k(false);
        this.f401389j.g();
        this.f401392m = null;
        java.util.concurrent.ExecutorService executorService = this.f401399t;
        if (executorService != null) {
            executorService.shutdownNow();
        }
    }

    public final r45.ed e(java.lang.String str, java.util.List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        r45.ed edVar = (r45.ed) list.get(0);
        r45.k55 k55Var = new r45.k55();
        k55Var.f459918d = str;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            k55Var.f459919e.addAll(bm5.d1.e(((r45.ed) it.next()).f454816h.f454289d).f459919e);
        }
        ot0.q qVar = new ot0.q();
        mp3.a aVar = new mp3.a();
        aVar.f411983b = k55Var;
        qVar.f(aVar);
        qVar.f430199i = 62;
        qVar.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
        qVar.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
        r45.du5 du5Var = new r45.du5();
        java.lang.String u17 = ot0.q.u(qVar, "", null);
        du5Var.c(u17 != null ? u17 : "");
        edVar.f454816h = du5Var;
        return edVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String f(r45.ed r3, java.lang.String r4) {
        /*
            r2 = this;
            r45.du5 r0 = r3.f454814f
            java.lang.String r0 = r0.f454289d
            r45.du5 r3 = r3.f454815g
            java.lang.String r3 = r3.f454289d
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L2d
            tn1.f r4 = tn1.f.f()
            tn1.d r4 = r4.e()
            int r1 = r4.f502345o
            if (r1 == 0) goto L27
            xg3.r0 r4 = r4.f502337g
            com.tencent.mm.storage.ka r4 = (com.p314xaae8f345.mm.p2621x8fb0427b.ka) r4
            boolean r4 = r4.s0(r0)
            if (r4 == 0) goto L25
            goto L2d
        L25:
            r4 = 0
            goto L2e
        L27:
            c01.c r3 = new c01.c
            r3.<init>()
            throw r3
        L2d:
            r4 = 1
        L2e:
            if (r4 == 0) goto L31
            r0 = r3
        L31:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ln1.x.f(r45.ed, java.lang.String):java.lang.String");
    }

    public void g(boolean z17) {
        boolean z18;
        int i17;
        synchronized (this) {
            if (this.f401382c) {
                z18 = true;
            } else {
                this.f401382c = true;
                z18 = false;
            }
        }
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupRecoverMerger", "Already start merge, return.");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRecoverMerger", "startMerge");
        this.f401391l = 0L;
        z65.c.f551991d = true;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a = true;
        this.f401389j.f();
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).k(true);
        fq3.n nVar = (fq3.n) ((gq3.e) i95.n0.c(gq3.e.class));
        nVar.getClass();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(nVar.C);
        boolean z19 = D;
        java.util.HashMap hashMap = this.f401383d;
        if (E) {
            java.util.Iterator it = hashMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.String str = (java.lang.String) it.next();
                java.lang.String str2 = kn1.k.m(str) + str;
                long k17 = com.p314xaae8f345.mm.vfs.w6.k(str2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRecoverMerger", "itemPath = " + str2 + ", fileSize = " + k17);
                if (k17 > 10485760) {
                    C = 1;
                    break;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRecoverMerger", "chooseRecoverMode, INSERT_THREAD_POOL_SIZE = " + C + ", duration" + (java.lang.System.currentTimeMillis() - 0) + ", sOptimizeExpt = " + z19);
        } else if (F) {
            long j17 = 0;
            for (java.lang.String str3 : hashMap.keySet()) {
                java.lang.String str4 = kn1.k.m(str3) + str3;
                long k18 = com.p314xaae8f345.mm.vfs.w6.k(str4);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRecoverMerger", "itemPath = " + str4 + ", fileSize = " + k18);
                j17 = java.lang.Math.max(k18, j17);
            }
            int i18 = C;
            if (j17 > 10485760) {
                int i19 = (int) ((157286400 / j17) / 2);
                i17 = i19 == 0 ? 1 : java.lang.Math.min(i19, i18);
            } else {
                i17 = i18;
            }
            C = i17;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - 0;
            jx3.f.INSTANCE.d(21019, java.lang.Integer.valueOf(C), java.lang.Long.valueOf(j17), 261, "maxFileSize", "", java.lang.Long.valueOf(currentTimeMillis));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRecoverMerger", "chooseRecoverMode, maxFileSize = " + j17 + ", duration = " + currentTimeMillis + ", INSERT_THREAD_POOL_SIZE = " + C + ", sOptimizeExpt = " + z19);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRecoverMerger", "startMerge optimize open");
        ((ku5.t0) ku5.t0.f394148d).h(new ln1.u(this, z17), "startMergeImplOptimize");
    }

    public final void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRecoverMerger", "startMergeImplOptimizeDone");
        this.f401389j.e().f391153l = this.f401391l;
        this.f401389j.e().f391143b = java.lang.Math.min(this.f401384e.size(), this.f401385f);
        this.f401389j.e().f391144c = this.f401385f;
        this.f401389j.e().f391145d = (int) (this.f401387h <= this.f401386g ? (this.f401387h * 100) / this.f401386g : 100L);
        i(30);
        tn1.e.a(this.f401398s, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRecoverMerger", "startMergeImpl buildConversation finish! transferMsgList[%d], totalMsgList[%d], transferSession[%d], totalSession[%d]", java.lang.Long.valueOf(this.f401387h), java.lang.Long.valueOf(this.f401386g), java.lang.Integer.valueOf(this.f401384e.size()), java.lang.Integer.valueOf(this.f401385f));
        if (this.f401393n != 2) {
            this.f401393n = 2;
            c();
            int i17 = this.f401390k;
            if (i17 == 1) {
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BACKUP_PC_MERGERING_BOOLEAN, java.lang.Boolean.FALSE);
            } else if (i17 == 2) {
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BACKUP_MOVE_MERGERING_BOOLEAN, java.lang.Boolean.FALSE);
            }
            this.f401394o.A("MMKV_BACKUP_TRY_TIME", 0);
            this.f401394o.G("MMKV_BACKUP_NEED_REPORT", false);
            this.f401394o.D("MMKV_BACKUP_ERROR_CACHE", "");
            kn1.e eVar = this.f401392m;
            if (eVar != null) {
                eVar.c();
            }
            kn1.g e17 = this.f401389j.e();
            int size = this.f401384e.size();
            int i18 = this.f401385f;
            if (size <= i18) {
                i18 = this.f401384e.size();
            }
            e17.a(27, i18, this.f401385f);
            i(27);
            kn1.k.i();
            if (!kn1.k.f391163a) {
                kn1.k.k(kn1.k.o());
                kn1.k.h();
            }
            this.f401393n = 0;
            synchronized (this) {
                this.f401382c = false;
            }
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).k(false);
            this.f401389j.g();
        }
    }

    public void i(int i17) {
        kn1.e eVar = this.f401392m;
        if (eVar != null) {
            eVar.a(i17);
        }
    }
}
