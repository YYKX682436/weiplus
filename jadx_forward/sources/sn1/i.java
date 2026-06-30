package sn1;

/* loaded from: classes12.dex */
public abstract class i extends com.p314xaae8f345.mm.p944x882e457a.m1 {

    /* renamed from: i, reason: collision with root package name */
    public static sn1.h f491548i;

    /* renamed from: m, reason: collision with root package name */
    public static sn1.e f491549m;

    /* renamed from: s, reason: collision with root package name */
    public static int f491555s;

    /* renamed from: t, reason: collision with root package name */
    public static sn1.g f491556t;

    /* renamed from: d, reason: collision with root package name */
    public int f491557d = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 f491558e = new com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f491545f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f491546g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f491547h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: n, reason: collision with root package name */
    public static int f491550n = -1;

    /* renamed from: o, reason: collision with root package name */
    public static sn1.i0 f491551o = null;

    /* renamed from: p, reason: collision with root package name */
    public static sn1.s0 f491552p = null;

    /* renamed from: q, reason: collision with root package name */
    public static sn1.k0 f491553q = null;

    /* renamed from: r, reason: collision with root package name */
    public static sn1.o0 f491554r = null;

    static {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        f491555s = new java.util.Random(java.lang.System.currentTimeMillis()).nextInt(1147483648);
        f491556t = null;
    }

    public static void H(int i17) {
        sn1.s0 s0Var = f491552p;
        if (s0Var != null) {
            long j17 = i17;
            s0Var.f491619c += j17;
            s0Var.f491621e += j17;
        }
    }

    public static void I(int i17, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        java.util.Map map = f491545f;
        synchronized (map) {
            if (!((java.util.HashMap) map).containsKey(java.lang.Integer.valueOf(i17))) {
                ((java.util.HashMap) map).put(java.lang.Integer.valueOf(i17), new java.util.HashSet());
            }
            if (!((java.util.Set) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17))).contains(u0Var)) {
                ((java.util.Set) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17))).add(u0Var);
            }
        }
    }

    public static java.lang.String L() {
        sn1.s0 s0Var = f491552p;
        if (s0Var == null) {
            return "";
        }
        float currentTimeMillis = (float) ((s0Var.f491620d / (java.lang.System.currentTimeMillis() + s0Var.f491626j)) * 1000);
        long j17 = s0Var.f491625i;
        long j18 = j17 - s0Var.f491620d;
        long j19 = s0Var.f491618b;
        if (j19 < 1 || j18 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupSpeedCalculator", "getBackupRemainTime totalSize:%d, receiveDataSize:%d, backupSpeed:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(s0Var.f491620d), java.lang.Long.valueOf(s0Var.f491618b));
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.h(com.p314xaae8f345.mm.R.C30867xcad56011.a7k, 1);
        }
        long j27 = currentTimeMillis > 1.0f ? ((float) j18) / currentTimeMillis : j18 / j19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupSpeedCalculator", "getBackupRemainTime totalSize:%d, receiveDataSize:%d, backupSpeed:%d, speed:%f, sec:%d, transferTime:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(s0Var.f491620d), java.lang.Long.valueOf(s0Var.f491618b), java.lang.Float.valueOf(currentTimeMillis), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(s0Var.f491626j));
        if (j27 >= 3600) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.h(com.p314xaae8f345.mm.R.C30867xcad56011.a7j, java.lang.Integer.valueOf((int) java.lang.Math.floor(j27 / 3600.0d)), java.lang.Integer.valueOf((int) java.lang.Math.ceil((j27 % 3600) / 60)));
        }
        if (j27 < 60) {
            j27 = 60;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.h(com.p314xaae8f345.mm.R.C30867xcad56011.a7k, java.lang.Integer.valueOf((int) java.lang.Math.ceil(j27 / 60.0d)));
    }

    public static java.lang.String O() {
        java.lang.String str;
        sn1.s0 s0Var = f491552p;
        if (s0Var == null) {
            return "0B";
        }
        long j17 = s0Var.f491618b;
        if ((j17 >> 30) > 0) {
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.e0(j17, 100.0d);
        } else if ((j17 >> 20) > 0) {
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i0(j17, 100.0d);
        } else if ((j17 >> 9) > 0) {
            str = "" + java.lang.Math.round(((float) j17) / 1024.0f) + " KB";
        } else {
            str = "" + j17 + " B";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupSpeedCalculator", "getBackupSpeed[%s]", str);
        return str;
    }

    public static void Q(int i17, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        java.util.Map map = f491545f;
        synchronized (map) {
            try {
                if (((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17)) != null) {
                    ((java.util.Set) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17))).remove(u0Var);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BackupBaseScene", e17, "removeSceneEndListener failed", new java.lang.Object[0]);
            }
        }
    }

    public static boolean R(byte[] bArr, int i17) {
        com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1();
        synchronized (f491546g) {
            int i18 = f491555s;
            f491555s = i18 + 1;
            on1.f.a(bArr, i18, (short) i17, c19764x527bffc1, f491550n);
            sn1.e eVar = f491549m;
            if (eVar != null) {
                ((ln1.g) eVar).c(i18, c19764x527bffc1.f38861x6ac9171, i17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupBaseScene", "sendBuf sendSeq[%d], type[%d], buflen[%d]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(c19764x527bffc1.f38861x6ac9171.length));
        }
        return true;
    }

    public static boolean S(byte[] bArr, int i17, int i18) {
        com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1();
        on1.f.a(bArr, i18, (short) i17, c19764x527bffc1, f491550n);
        sn1.e eVar = f491549m;
        if (eVar == null) {
            return true;
        }
        ((ln1.g) eVar).c(i18, c19764x527bffc1.f38861x6ac9171, i17);
        return true;
    }

    public static void T() {
        if (f491553q == null) {
            f491553q = new sn1.k0();
        }
        sn1.k0 k0Var = f491553q;
        k0Var.getClass();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupLogManager", "start");
            sn1.k0.f491577c = 0L;
            sn1.k0.f491578d = 0L;
            sn1.k0.f491579e = 0L;
            sn1.k0.f491580f = 0L;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = k0Var.f491582b;
            if (b4Var != null) {
                b4Var.d();
                k0Var.f491582b = null;
            }
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            sn1.k0.f491577c = currentTimeMillis;
            sn1.k0.f491579e = k0Var.a(currentTimeMillis);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BackupLogManager", e17, "start exception", new java.lang.Object[0]);
        }
    }

    public static void U(sn1.n0 n0Var) {
        sn1.o0 o0Var = f491554r;
        if (o0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupBaseScene", "startBackupReconnectHandler, no old backupReconnectHandler is stopped, new one.");
        } else {
            if (!o0Var.f491597c) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupBaseScene", "startBackupReconnectHandler, backupReconnectHandler already running, ignore it.");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupBaseScene", "startBackupReconnectHandler, old backupReconnectHandler is stopped, new one.");
        }
        sn1.o0 o0Var2 = new sn1.o0(n0Var);
        f491554r = o0Var2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupReconnectHandler", "start backupReconnectTimeHandler.");
        sn1.o0.f491594f = 0;
        o0Var2.f491597c = false;
        o0Var2.f491596b = 1;
        if (o0Var2.f491595a != null) {
            o0Var2.f491599e.c(0L, 0L);
        }
    }

    public static void V() {
        sn1.i0 i0Var = f491551o;
        if (i0Var != null && i0Var.f491563e != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupHeartBeatHandler", "stop");
            i0Var.f491563e = java.lang.Boolean.TRUE;
        }
        sn1.i0 i0Var2 = new sn1.i0();
        f491551o = i0Var2;
        i0Var2.b(true);
    }

    public static void W() {
        sn1.s0 s0Var = f491552p;
        if (s0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupBaseScene", "startSpeedCalculator backupSpeedCalculator is null!");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = s0Var.f491629m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupSpeedCalculator", "start backupGetSpeedTimeHandler. hash:%d", java.lang.Integer.valueOf(b4Var.hashCode()));
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        s0Var.f491622f = java.lang.System.currentTimeMillis();
        s0Var.f491619c = 0L;
        s0Var.f491617a = 0L;
        java.util.LinkedList linkedList = (java.util.LinkedList) s0Var.f491627k;
        linkedList.clear();
        s0Var.f491624h = 0;
        s0Var.f491623g = 0L;
        for (int i17 = 0; i17 < 10; i17++) {
            linkedList.offer(204800L);
        }
        b4Var.c(1000L, 1000L);
    }

    public static void X(int i17) {
        sn1.k0 k0Var = f491553q;
        if (k0Var != null) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupLogManager", "end backupMode[%d]", java.lang.Integer.valueOf(i17));
                long j17 = sn1.k0.f491577c;
                if (j17 != 0 && sn1.k0.f491579e != 0) {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    sn1.k0.f491578d = currentTimeMillis;
                    long j18 = 0;
                    for (long j19 = sn1.k0.f491577c; j19 <= currentTimeMillis + 86400000; j19 += 86400000) {
                        j18 += k0Var.a(j19);
                    }
                    sn1.k0.f491580f = j18;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupLogManager", "end, backupMode[%d], endTime[%d], startTime[%d], endLogSize[%d], startLogSize[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(sn1.k0.f491578d), java.lang.Long.valueOf(sn1.k0.f491577c), java.lang.Long.valueOf(sn1.k0.f491580f), java.lang.Long.valueOf(sn1.k0.f491579e));
                    long j27 = sn1.k0.f491580f;
                    if (j27 != 0) {
                        long j28 = sn1.k0.f491579e;
                        if (j27 > j28) {
                            k0Var.b(i17, sn1.k0.f491578d - sn1.k0.f491577c, j27 - j28, false);
                        }
                    }
                    sn1.k0.f491577c = 0L;
                    sn1.k0.f491578d = 0L;
                    sn1.k0.f491579e = 0L;
                    sn1.k0.f491580f = 0L;
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupLogManager", "end is zero, startTime[%d], startLogSize[%d], skip report", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(sn1.k0.f491579e));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BackupLogManager", e17, "end exception", new java.lang.Object[0]);
            }
        }
    }

    public static void Y() {
        sn1.o0 o0Var = f491554r;
        if (o0Var != null) {
            o0Var.f491596b = 0;
            if (o0Var.f491597c) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupReconnectHandler", "stop backupReconnectTimeHandler.");
            o0Var.f491599e.d();
            o0Var.f491597c = true;
        }
    }

    public static void Z() {
        sn1.i0 i0Var = f491551o;
        if (i0Var == null || i0Var.f491563e == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupHeartBeatHandler", "stop");
        i0Var.f491563e = java.lang.Boolean.TRUE;
    }

    public static void a0() {
        sn1.s0 s0Var = f491552p;
        if (s0Var != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = s0Var.f491629m;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupSpeedCalculator", "stop backupGetSpeedTimeHandler. hash:%d", java.lang.Integer.valueOf(b4Var.hashCode()));
            b4Var.d();
            s0Var.f491624h = 0;
        }
    }

    public void J(int i17, int i18, java.lang.String str) {
        f491547h.mo50293x3498a0(new sn1.c(this, i17, i18, str));
    }

    public boolean K() {
        try {
            byte[] mo14344x5f01b1f6 = M().mo14344x5f01b1f6();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f491546g;
            synchronized (concurrentHashMap) {
                int i17 = f491555s;
                f491555s = i17 + 1;
                this.f491557d = i17;
                on1.f.a(mo14344x5f01b1f6, i17, (short) mo808xfb85f7b0(), this.f491558e, f491550n);
                sn1.e eVar = f491549m;
                if (eVar != null) {
                    ((ln1.g) eVar).c(this.f491557d, this.f491558e.f38861x6ac9171, mo808xfb85f7b0());
                }
                concurrentHashMap.put(java.lang.Integer.valueOf(this.f491557d), this);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupBaseScene", "doScene sendSeq[%d], type[%d], buflen[%d], sceneCount:%d", java.lang.Integer.valueOf(this.f491557d), java.lang.Integer.valueOf(mo808xfb85f7b0()), java.lang.Integer.valueOf(this.f491558e.f38861x6ac9171.length), java.lang.Integer.valueOf(concurrentHashMap.size()));
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BackupBaseScene", e17, "req to buf fail: " + e17.toString(), new java.lang.Object[0]);
            return false;
        }
    }

    public abstract com.p314xaae8f345.mm.p2495xc50a8b8b.f M();

    public abstract com.p314xaae8f345.mm.p2495xc50a8b8b.f N();

    public abstract void P(int i17);

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        return 0;
    }
}
