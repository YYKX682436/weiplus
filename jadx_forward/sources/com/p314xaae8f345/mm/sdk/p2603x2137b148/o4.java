package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class o4 implements android.content.SharedPreferences, android.content.SharedPreferences.Editor {

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Set f274426i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Map f274427m;

    /* renamed from: n, reason: collision with root package name */
    public static final boolean f274428n;

    /* renamed from: o, reason: collision with root package name */
    public static final kk.l f274429o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.Map f274430p;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b f274431d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.Pair f274432e;

    /* renamed from: f, reason: collision with root package name */
    public final int f274433f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock f274434g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock f274435h;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        f274426i = hashSet;
        f274427m = new java.util.concurrent.ConcurrentHashMap();
        f274429o = new kk.l(45, new com.p314xaae8f345.mm.sdk.p2603x2137b148.m4());
        fp.d0.o("mmkv");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b.m83976x33ebcb90(context, context.getFilesDir().getAbsolutePath() + "/mmkv", null, ir5.e.LevelInfo, com.p314xaae8f345.mm.sdk.p2603x2137b148.n4.f274403a);
        com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b.m83940xc3ac13ab();
        int m84061x1eb51f21 = com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b.m83934xe5f0f8cc(2, null).m84061x1eb51f21(bm5.f1.a() + "_mFdLimit", -1);
        boolean z17 = m84061x1eb51f21 <= 1024 && m84061x1eb51f21 > 0;
        f274428n = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiProcessMMKV", "mFdLimit = %d", java.lang.Integer.valueOf(m84061x1eb51f21));
        if (z17) {
            hashSet.add(android.util.Pair.create("MULTIPROCESSMMKV_SINGLE_DEFAULT", null));
            hashSet.add(android.util.Pair.create("MULTIPROCESSMMKV_MULTI_DEFAULT", null));
            hashSet.add(android.util.Pair.create("_webview_web_prefetcher_info", null));
        }
        f274430p = new android.util.ArrayMap();
    }

    public o4(java.lang.String str, java.lang.String str2, int i17, com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b sharedPreferencesC22993x242b0b) {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.f274434g = reentrantReadWriteLock.readLock();
        this.f274435h = reentrantReadWriteLock.writeLock();
        this.f274431d = sharedPreferencesC22993x242b0b;
        this.f274432e = android.util.Pair.create(str, str2);
        this.f274433f = i17;
    }

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 J(java.lang.String str, int i17, int i18) {
        return O(str, lp0.b.e() + kk.k.g(("mm" + i17).getBytes()) + "/mmkv_private", i18, null);
    }

    public static com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b K(java.lang.String str, java.lang.String str2, int i17) {
        try {
            return com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b.m83999x8c190b4c(str, i17, (java.lang.String) null, str2);
        } catch (java.lang.IllegalArgumentException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiProcessMMKV", "getCoreMMKV mode error name : %s ,mode : %d", str, java.lang.Integer.valueOf(i17));
            jx3.f.INSTANCE.mo68477x336bdfd8(941L, 150L, 1L, true);
            return i17 == 2 ? com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b.m83999x8c190b4c(str, 1, (java.lang.String) null, str2) : com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b.m83999x8c190b4c(str, i17, (java.lang.String) null, str2);
        }
    }

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L() {
        return N("MULTIPROCESSMMKV_MULTI_DEFAULT", 2, com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b.m83934xe5f0f8cc(2, null));
    }

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M(java.lang.String str) {
        return N(str, 2, null);
    }

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 N(java.lang.String str, int i17, com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b sharedPreferencesC22993x242b0b) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, "MULTIPROCESSMMKV_PERSERVED_NAME")) {
            return O(str, null, i17, sharedPreferencesC22993x242b0b);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiProcessMMKV", "getMMKV name is illegal");
        return null;
    }

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 O(java.lang.String str, java.lang.String str2, int i17, com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b sharedPreferencesC22993x242b0b) {
        java.util.concurrent.locks.ReentrantLock reentrantLock;
        boolean z17;
        android.util.Pair create = android.util.Pair.create(str, str2);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 P = P(create, i17);
        if (P == null) {
            java.util.Map map = f274430p;
            synchronized (map) {
                android.util.ArrayMap arrayMap = (android.util.ArrayMap) map;
                reentrantLock = (java.util.concurrent.locks.ReentrantLock) arrayMap.get(create);
                z17 = true;
                if (reentrantLock == null) {
                    reentrantLock = new java.util.concurrent.locks.ReentrantLock(true);
                    arrayMap.put(create, reentrantLock);
                }
            }
            try {
                reentrantLock.lock();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 P2 = P(create, i17);
                if (P2 != null) {
                    return P2;
                }
                P = sharedPreferencesC22993x242b0b == null ? new com.p314xaae8f345.mm.sdk.p2603x2137b148.o4(str, str2, i17, K(str, str2, i17)) : new com.p314xaae8f345.mm.sdk.p2603x2137b148.o4(str, str2, i17, sharedPreferencesC22993x242b0b);
                long Y = P.Y();
                if (Y > 1048576) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiProcessMMKV", "MMKV file is too big, name : %s, path : %s, size : %d, please contact with leafjia", str, str2, java.lang.Long.valueOf(Y));
                    if (Y <= 5242880) {
                        jx3.f.INSTANCE.mo68477x336bdfd8(941L, 10L, 1L, true);
                    } else if (Y <= 10485760) {
                        jx3.f.INSTANCE.mo68477x336bdfd8(941L, 11L, 1L, true);
                    } else if (Y <= com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.f56078x428b3be8) {
                        jx3.f.INSTANCE.mo68477x336bdfd8(941L, 12L, 1L, true);
                    } else {
                        jx3.f.INSTANCE.mo68477x336bdfd8(941L, 13L, 1L, true);
                    }
                    jx3.f fVar = jx3.f.INSTANCE;
                    fVar.d(18378, str, java.lang.Long.valueOf(Y));
                    if (Y > 5242880) {
                        fVar.mo68477x336bdfd8(941L, 100L, 1L, true);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiProcessMMKV", "start to trim, before size : %d", java.lang.Long.valueOf(Y));
                        P.a0();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiProcessMMKV", "trim is over, after size : %d", java.lang.Long.valueOf(P.Y()));
                        if (Y > 52428800) {
                            fVar.d(24632, str, 3, java.lang.Long.valueOf(Y), java.lang.Long.valueOf(P.Y()), com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
                        }
                    }
                }
                if (!f274428n || f274429o == null || ((java.util.HashSet) f274426i).contains(create)) {
                    z17 = false;
                }
                if (z17) {
                    f274429o.put(create, P);
                    ((java.util.concurrent.ConcurrentHashMap) f274427m).put(create, P);
                } else {
                    ((java.util.concurrent.ConcurrentHashMap) f274427m).put(create, P);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        return P;
    }

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 P(android.util.Pair pair, int i17) {
        boolean z17 = f274428n;
        kk.l lVar = f274429o;
        boolean z18 = (!z17 || lVar == null || ((java.util.HashSet) f274426i).contains(pair)) ? false : true;
        java.util.Map map = f274427m;
        if (!z18) {
            return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((java.util.concurrent.ConcurrentHashMap) map).get(pair);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) lVar.get(pair);
        if (o4Var != null) {
            return o4Var;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((java.util.concurrent.ConcurrentHashMap) map).get(pair);
        if (o4Var2 == null) {
            return o4Var2;
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = o4Var2.f274434g;
        readLock.lock();
        o4Var2.c(pair);
        lVar.put(pair, o4Var2);
        readLock.unlock();
        return o4Var2;
    }

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Q(java.lang.String str) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = M(str);
        Z(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(str, 4), M);
        return M;
    }

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R(java.lang.String str) {
        return N(str, 1, null);
    }

    public static boolean V(java.lang.String str) {
        try {
            return O("MULTIPROCESSMMKV_PERSERVED_NAME", null, 2, null).i(str, false);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b.class.getClassLoader();
            fp.d0.n("mmkv");
            return O("MULTIPROCESSMMKV_PERSERVED_NAME", null, 2, null).i(str, false);
        }
    }

    public static int Z(android.content.SharedPreferences sharedPreferences, com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var) {
        if (sharedPreferences == null || o4Var == null) {
            return 0;
        }
        android.util.Pair pair = o4Var.f274432e;
        java.lang.String str = (java.lang.String) pair.first;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiProcessMMKV", "transport2MMKV, name : %s", str);
        if (V(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiProcessMMKV", "%s transport2MMKV has Done, return", str);
            return 0;
        }
        O("MULTIPROCESSMMKV_PERSERVED_NAME", null, 2, null).G(str, true);
        jx3.f.INSTANCE.mo68477x336bdfd8(941L, 2L, 1L, true);
        if (!o4Var.U()) {
            return o4Var.f274431d.m84097x3b7ed024(sharedPreferences);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = o4Var.f274434g;
        readLock.lock();
        o4Var.c(pair);
        int m84097x3b7ed024 = o4Var.f274431d.m84097x3b7ed024(sharedPreferences);
        readLock.unlock();
        return m84097x3b7ed024;
    }

    public boolean A(java.lang.String str, int i17) {
        if (!T(str, java.lang.Integer.valueOf(i17))) {
            return false;
        }
        if (!U()) {
            return this.f274431d.m84079xb2963e16(str, i17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        boolean m84079xb2963e16 = this.f274431d.m84079xb2963e16(str, i17);
        readLock.unlock();
        return m84079xb2963e16;
    }

    public boolean B(java.lang.String str, long j17) {
        if (!T(str, java.lang.Long.valueOf(j17))) {
            return false;
        }
        if (!U()) {
            return this.f274431d.m84081xb2963e16(str, j17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        boolean m84081xb2963e16 = this.f274431d.m84081xb2963e16(str, j17);
        readLock.unlock();
        return m84081xb2963e16;
    }

    public boolean C(java.lang.String str, android.os.Parcelable parcelable) {
        if (!T(str, parcelable)) {
            return false;
        }
        if (!U()) {
            return this.f274431d.m84083xb2963e16(str, parcelable);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        boolean m84083xb2963e16 = this.f274431d.m84083xb2963e16(str, parcelable);
        readLock.unlock();
        return m84083xb2963e16;
    }

    public boolean D(java.lang.String str, java.lang.String str2) {
        if (!T(str, str2)) {
            return false;
        }
        if (!U()) {
            return this.f274431d.m84085xb2963e16(str, str2);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        boolean m84085xb2963e16 = this.f274431d.m84085xb2963e16(str, str2);
        readLock.unlock();
        return m84085xb2963e16;
    }

    public boolean E(java.lang.String str, java.lang.String str2, int i17) {
        if (!T(str, str2)) {
            return false;
        }
        if (!U()) {
            return this.f274431d.m84086xb2963e16(str, str2, i17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        boolean m84086xb2963e16 = this.f274431d.m84086xb2963e16(str, str2, i17);
        readLock.unlock();
        return m84086xb2963e16;
    }

    public boolean F(java.lang.String str, java.util.Set set) {
        if (!T(str, set)) {
            return false;
        }
        if (!U()) {
            return this.f274431d.m84087xb2963e16(str, (java.util.Set<java.lang.String>) set);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        boolean m84087xb2963e16 = this.f274431d.m84087xb2963e16(str, (java.util.Set<java.lang.String>) set);
        readLock.unlock();
        return m84087xb2963e16;
    }

    public boolean G(java.lang.String str, boolean z17) {
        if (!T(str, java.lang.Boolean.valueOf(z17))) {
            return false;
        }
        if (!U()) {
            return this.f274431d.m84089xb2963e16(str, z17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        boolean m84089xb2963e16 = this.f274431d.m84089xb2963e16(str, z17);
        readLock.unlock();
        return m84089xb2963e16;
    }

    public boolean H(java.lang.String str, byte[] bArr) {
        if (!T(str, bArr)) {
            return false;
        }
        if (!U()) {
            return this.f274431d.m84091xb2963e16(str, bArr);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        boolean m84091xb2963e16 = this.f274431d.m84091xb2963e16(str, bArr);
        readLock.unlock();
        return m84091xb2963e16;
    }

    public boolean I(java.lang.String str, byte[] bArr, int i17) {
        if (!T(str, bArr)) {
            return false;
        }
        if (!U()) {
            return this.f274431d.m84092xb2963e16(str, bArr, i17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        boolean m84092xb2963e16 = this.f274431d.m84092xb2963e16(str, bArr, i17);
        readLock.unlock();
        return m84092xb2963e16;
    }

    public final boolean S() {
        java.lang.String str;
        if (U()) {
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
            readLock.lock();
            java.lang.String m84101xc02e032a = this.f274431d.m84101xc02e032a();
            readLock.unlock();
            str = m84101xc02e032a;
        } else {
            str = this.f274431d.m84101xc02e032a();
        }
        return str == null;
    }

    public final boolean T(java.lang.String str, java.lang.Object obj) {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || obj == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) this.f274432e.first)) ? false : true;
    }

    public boolean U() {
        return f274428n && f274429o != null;
    }

    public void W(java.lang.String str) {
        if (!U()) {
            this.f274431d.m84112xd4d5283(str);
            return;
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        this.f274431d.m84112xd4d5283(str);
        readLock.unlock();
    }

    public void X(java.lang.String[] strArr) {
        if (!U()) {
            this.f274431d.m84113xb5f320b7(strArr);
            return;
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        this.f274431d.m84113xb5f320b7(strArr);
        readLock.unlock();
    }

    public long Y() {
        if (!U()) {
            return this.f274431d.m84115xdd96ed65();
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        long m84115xdd96ed65 = this.f274431d.m84115xdd96ed65();
        readLock.unlock();
        return m84115xdd96ed65;
    }

    public long a() {
        if (!U()) {
            return this.f274431d.m84035xd12b86af();
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        long m84035xd12b86af = this.f274431d.m84035xd12b86af();
        readLock.unlock();
        return m84035xd12b86af;
    }

    public void a0() {
        if (!U()) {
            this.f274431d.m84116x367422();
            return;
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        this.f274431d.m84116x367422();
        readLock.unlock();
    }

    @Override // android.content.SharedPreferences.Editor
    public void apply() {
    }

    public java.lang.String[] b() {
        if (!U()) {
            return this.f274431d.m84036xc99d6335();
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        java.lang.String[] m84036xc99d6335 = this.f274431d.m84036xc99d6335();
        readLock.unlock();
        return m84036xc99d6335;
    }

    public final void c(android.util.Pair pair) {
        if (f274426i.contains(pair)) {
            return;
        }
        kk.l lVar = f274429o;
        lVar.m(pair);
        if (S()) {
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
            readLock.unlock();
            java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = this.f274435h;
            writeLock.lock();
            if (S()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiProcessMMKV", "MMKV : %s has bean closed, reopen now, my hashcode = %d, core mmkv hashcode = %d ", pair.first, java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(this.f274431d.hashCode()));
                android.util.Pair pair2 = this.f274432e;
                this.f274431d = K((java.lang.String) pair2.first, (java.lang.String) pair2.second, this.f274433f);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiProcessMMKV", "MMKV : %s has bean closed, reopen done", pair.first);
                lVar.put(pair, this);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiProcessMMKV", "MMKV : %s checkReopen done", pair.first);
            }
            readLock.lock();
            writeLock.unlock();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor clear() {
        if (U()) {
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
            readLock.lock();
            c(this.f274432e);
            this.f274431d.clear();
            readLock.unlock();
        } else {
            this.f274431d.clear();
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public boolean commit() {
        return true;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(java.lang.String str) {
        if (!U()) {
            return this.f274431d.contains(str);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        boolean contains = this.f274431d.contains(str);
        readLock.unlock();
        return contains;
    }

    public void d() {
        if (!U()) {
            this.f274431d.m84044x2f1a8c14();
            return;
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        this.f274431d.m84044x2f1a8c14();
        readLock.unlock();
    }

    public void e() {
        if (!U()) {
            this.f274431d.m84046xc3a2ea74();
            return;
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        this.f274431d.m84046xc3a2ea74();
        readLock.unlock();
    }

    @Override // android.content.SharedPreferences
    public android.content.SharedPreferences.Editor edit() {
        return this;
    }

    public boolean f(java.lang.String str) {
        if (!U()) {
            return this.f274431d.m84048xc6607c0(str);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        boolean m84048xc6607c0 = this.f274431d.m84048xc6607c0(str);
        readLock.unlock();
        return m84048xc6607c0;
    }

    /* renamed from: finalize */
    public void m77795xd764dc1e() {
    }

    public long g() {
        if (!U()) {
            return this.f274431d.m84049x5a7510f();
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        long m84049x5a7510f = this.f274431d.m84049x5a7510f();
        readLock.unlock();
        return m84049x5a7510f;
    }

    @Override // android.content.SharedPreferences
    public java.util.Map getAll() {
        if (!U()) {
            return this.f274431d.getAll();
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        java.util.Map<java.lang.String, ?> all = this.f274431d.getAll();
        readLock.unlock();
        return all;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(java.lang.String str, boolean z17) {
        if (!U()) {
            return this.f274431d.getBoolean(str, z17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        boolean z18 = this.f274431d.getBoolean(str, z17);
        readLock.unlock();
        return z18;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(java.lang.String str, float f17) {
        if (!U()) {
            return this.f274431d.getFloat(str, f17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        float f18 = this.f274431d.getFloat(str, f17);
        readLock.unlock();
        return f18;
    }

    @Override // android.content.SharedPreferences
    public int getInt(java.lang.String str, int i17) {
        if (!U()) {
            return this.f274431d.getInt(str, i17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        int i18 = this.f274431d.getInt(str, i17);
        readLock.unlock();
        return i18;
    }

    @Override // android.content.SharedPreferences
    public long getLong(java.lang.String str, long j17) {
        if (!U()) {
            return this.f274431d.getLong(str, j17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        long j18 = this.f274431d.getLong(str, j17);
        readLock.unlock();
        return j18;
    }

    @Override // android.content.SharedPreferences
    public java.lang.String getString(java.lang.String str, java.lang.String str2) {
        if (!U()) {
            return this.f274431d.getString(str, str2);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        java.lang.String string = this.f274431d.getString(str, str2);
        readLock.unlock();
        return string;
    }

    @Override // android.content.SharedPreferences
    public java.util.Set getStringSet(java.lang.String str, java.util.Set set) {
        if (!U()) {
            return this.f274431d.getStringSet(str, set);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        java.util.Set<java.lang.String> stringSet = this.f274431d.getStringSet(str, set);
        readLock.unlock();
        return stringSet;
    }

    public boolean h(java.lang.String str) {
        if (!U()) {
            return this.f274431d.m84052xb7eb99f8(str);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        boolean m84052xb7eb99f8 = this.f274431d.m84052xb7eb99f8(str);
        readLock.unlock();
        return m84052xb7eb99f8;
    }

    public boolean i(java.lang.String str, boolean z17) {
        if (!U()) {
            return this.f274431d.m84053xb7eb99f8(str, z17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        boolean m84053xb7eb99f8 = this.f274431d.m84053xb7eb99f8(str, z17);
        readLock.unlock();
        return m84053xb7eb99f8;
    }

    public byte[] j(java.lang.String str) {
        if (!U()) {
            return this.f274431d.m84054x458c431d(str);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        byte[] m84054x458c431d = this.f274431d.m84054x458c431d(str);
        readLock.unlock();
        return m84054x458c431d;
    }

    public double k(java.lang.String str) {
        if (!U()) {
            return this.f274431d.m84056x6ed94f5f(str);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        double m84056x6ed94f5f = this.f274431d.m84056x6ed94f5f(str);
        readLock.unlock();
        return m84056x6ed94f5f;
    }

    public float l(java.lang.String str) {
        if (!U()) {
            return this.f274431d.m84058x45bea50e(str);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        float m84058x45bea50e = this.f274431d.m84058x45bea50e(str);
        readLock.unlock();
        return m84058x45bea50e;
    }

    public float m(java.lang.String str, float f17) {
        if (!U()) {
            return this.f274431d.m84059x45bea50e(str, f17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        float m84059x45bea50e = this.f274431d.m84059x45bea50e(str, f17);
        readLock.unlock();
        return m84059x45bea50e;
    }

    public int n(java.lang.String str) {
        if (!U()) {
            return this.f274431d.m84060x1eb51f21(str);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        int m84060x1eb51f21 = this.f274431d.m84060x1eb51f21(str);
        readLock.unlock();
        return m84060x1eb51f21;
    }

    public int o(java.lang.String str, int i17) {
        if (!U()) {
            return this.f274431d.m84061x1eb51f21(str, i17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        int m84061x1eb51f21 = this.f274431d.m84061x1eb51f21(str, i17);
        readLock.unlock();
        return m84061x1eb51f21;
    }

    public long p(java.lang.String str) {
        if (!U()) {
            return this.f274431d.m84062xb7f0258a(str);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        long m84062xb7f0258a = this.f274431d.m84062xb7f0258a(str);
        readLock.unlock();
        return m84062xb7f0258a;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putBoolean(java.lang.String str, boolean z17) {
        if (!T(str, java.lang.Boolean.valueOf(z17))) {
            return this;
        }
        if (U()) {
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
            readLock.lock();
            c(this.f274432e);
            this.f274431d.putBoolean(str, z17);
            readLock.unlock();
        } else {
            this.f274431d.putBoolean(str, z17);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putFloat(java.lang.String str, float f17) {
        if (!T(str, java.lang.Float.valueOf(f17))) {
            return this;
        }
        if (U()) {
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
            readLock.lock();
            c(this.f274432e);
            this.f274431d.putFloat(str, f17);
            readLock.unlock();
        } else {
            this.f274431d.putFloat(str, f17);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putInt(java.lang.String str, int i17) {
        if (!T(str, java.lang.Integer.valueOf(i17))) {
            return this;
        }
        if (U()) {
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
            readLock.lock();
            c(this.f274432e);
            this.f274431d.putInt(str, i17);
            readLock.unlock();
        } else {
            this.f274431d.putInt(str, i17);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putLong(java.lang.String str, long j17) {
        if (!T(str, java.lang.Long.valueOf(j17))) {
            return this;
        }
        if (U()) {
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
            readLock.lock();
            c(this.f274432e);
            this.f274431d.putLong(str, j17);
            readLock.unlock();
        } else {
            this.f274431d.putLong(str, j17);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putString(java.lang.String str, java.lang.String str2) {
        if (!T(str, str2)) {
            return this;
        }
        if (U()) {
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
            readLock.lock();
            c(this.f274432e);
            this.f274431d.putString(str, str2);
            readLock.unlock();
        } else {
            this.f274431d.putString(str, str2);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putStringSet(java.lang.String str, java.util.Set set) {
        if (!T(str, set)) {
            return this;
        }
        if (U()) {
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
            readLock.lock();
            c(this.f274432e);
            this.f274431d.putStringSet(str, set);
            readLock.unlock();
        } else {
            this.f274431d.putStringSet(str, set);
        }
        return this;
    }

    public long q(java.lang.String str, long j17) {
        if (!U()) {
            return this.f274431d.m84063xb7f0258a(str, j17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        long m84063xb7f0258a = this.f274431d.m84063xb7f0258a(str, j17);
        readLock.unlock();
        return m84063xb7f0258a;
    }

    public android.os.Parcelable r(java.lang.String str, java.lang.Class cls) {
        if (!U()) {
            return this.f274431d.m84064x268c571(str, cls);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        android.os.Parcelable m84064x268c571 = this.f274431d.m84064x268c571(str, cls);
        readLock.unlock();
        return m84064x268c571;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor remove(java.lang.String str) {
        if (U()) {
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
            readLock.lock();
            c(this.f274432e);
            this.f274431d.remove(str);
            readLock.unlock();
        } else {
            this.f274431d.remove(str);
        }
        return this;
    }

    public android.os.Parcelable s(java.lang.String str, java.lang.Class cls, android.os.Parcelable parcelable) {
        if (!U()) {
            return this.f274431d.m84065x268c571(str, cls, parcelable);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        android.os.Parcelable m84065x268c571 = this.f274431d.m84065x268c571(str, cls, parcelable);
        readLock.unlock();
        return m84065x268c571;
    }

    public java.lang.String t(java.lang.String str) {
        if (!U()) {
            return this.f274431d.m84066x88b7339f(str);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        java.lang.String m84066x88b7339f = this.f274431d.m84066x88b7339f(str);
        readLock.unlock();
        return m84066x88b7339f;
    }

    public java.lang.String u(java.lang.String str, java.lang.String str2) {
        if (!U()) {
            return this.f274431d.m84067x88b7339f(str, str2);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        java.lang.String m84067x88b7339f = this.f274431d.m84067x88b7339f(str, str2);
        readLock.unlock();
        return m84067x88b7339f;
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    public java.util.Set v(java.lang.String str) {
        if (!U()) {
            return this.f274431d.m84068xbf617843(str);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        java.util.Set<java.lang.String> m84068xbf617843 = this.f274431d.m84068xbf617843(str);
        readLock.unlock();
        return m84068xbf617843;
    }

    public java.util.Set w(java.lang.String str, java.util.Set set) {
        if (!U()) {
            return this.f274431d.m84069xbf617843(str, (java.util.Set<java.lang.String>) set);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        java.util.Set<java.lang.String> m84069xbf617843 = this.f274431d.m84069xbf617843(str, (java.util.Set<java.lang.String>) set);
        readLock.unlock();
        return m84069xbf617843;
    }

    public boolean x(int i17) {
        if (!U()) {
            return this.f274431d.m84073xea5e92ac(i17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        boolean m84073xea5e92ac = this.f274431d.m84073xea5e92ac(i17);
        readLock.unlock();
        return m84073xea5e92ac;
    }

    public boolean y(java.lang.String str, double d17) {
        if (!T(str, java.lang.Double.valueOf(d17))) {
            return false;
        }
        if (!U()) {
            return this.f274431d.m84075xb2963e16(str, d17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        boolean m84075xb2963e16 = this.f274431d.m84075xb2963e16(str, d17);
        readLock.unlock();
        return m84075xb2963e16;
    }

    public boolean z(java.lang.String str, float f17) {
        if (!T(str, java.lang.Float.valueOf(f17))) {
            return false;
        }
        if (!U()) {
            return this.f274431d.m84077xb2963e16(str, f17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f274434g;
        readLock.lock();
        c(this.f274432e);
        boolean m84077xb2963e16 = this.f274431d.m84077xb2963e16(str, f17);
        readLock.unlock();
        return m84077xb2963e16;
    }
}
