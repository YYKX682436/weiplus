package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class l4 implements android.content.SharedPreferences {

    /* renamed from: s, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f274354s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.Object f274355t = new java.lang.Object();

    /* renamed from: u, reason: collision with root package name */
    public static final android.util.LruCache f274356u = new android.util.LruCache(5);

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.C20992x3fea691 f274357d;

    /* renamed from: e, reason: collision with root package name */
    public final java.io.File f274358e;

    /* renamed from: f, reason: collision with root package name */
    public final java.io.File f274359f;

    /* renamed from: g, reason: collision with root package name */
    public final int f274360g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f274361h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.Map f274362i = null;

    /* renamed from: m, reason: collision with root package name */
    public int f274363m = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f274364n = false;

    /* renamed from: o, reason: collision with root package name */
    public long f274365o = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f274366p = 0;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Object f274367q = new java.lang.Object();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.WeakHashMap f274368r = new java.util.WeakHashMap();

    public l4(android.content.Context context, java.lang.String str, int i17) {
        this.f274357d = null;
        this.f274358e = null;
        this.f274359f = null;
        this.f274360g = 0;
        this.f274361h = false;
        android.content.Context applicationContext = context.getApplicationContext();
        if (f274354s == null) {
            f274354s = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        }
        java.lang.String str2 = applicationContext.getApplicationInfo().dataDir;
        if (str2 == null || str2.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiProcSharedPreferences", "Failed to retrive data path by ApplicationInfo.dataDir, use prefix hardcoded version instead.");
            str2 = applicationContext.getCacheDir().getParent();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiProcSharedPreferences", "Path to store sp data: " + str2);
        java.io.File file = new java.io.File(str2, "shared_prefs");
        if (!file.exists()) {
            file.mkdirs();
        } else if (!file.canRead() || !file.canWrite()) {
            file.setReadable(true, true);
            file.setWritable(true, true);
        }
        java.io.File file2 = new java.io.File(file, str + ".xml");
        this.f274358e = file2;
        this.f274359f = new java.io.File(file2.getPath() + ".bak");
        this.f274360g = i17;
        boolean z17 = (i17 & 4) != 0;
        this.f274361h = z17;
        if (z17) {
            this.f274357d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.C20992x3fea691(file2.getPath() + ".lock", true);
        }
        d();
    }

    public static void a(com.p314xaae8f345.mm.sdk.p2603x2137b148.l4 l4Var) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.C20992x3fea691 c20992x3fea691 = l4Var.f274357d;
        boolean z17 = l4Var.f274361h;
        if (z17) {
            try {
                c20992x3fea691.b();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MultiProcSharedPreferences", e17, "", new java.lang.Object[0]);
            }
        }
        try {
            if (!l4Var.f274364n) {
                java.io.File file = l4Var.f274359f;
                boolean exists = file.exists();
                java.io.File file2 = l4Var.f274358e;
                if (exists) {
                    file2.delete();
                    file.renameTo(file2);
                }
                if (file2.exists() && !file2.canRead()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiProcSharedPreferences", "Attempt to read preferences file " + file2 + " without permission");
                }
                java.util.HashMap hashMap = null;
                if (file2.canRead()) {
                    try {
                        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(file2), 16384);
                        hashMap = com.p314xaae8f345.mm.sdk.p2603x2137b148.ba.a(bufferedInputStream);
                        bufferedInputStream.close();
                    } catch (java.io.FileNotFoundException e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiProcSharedPreferences", "getSharedPreferences", e18);
                    } catch (java.io.IOException e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiProcSharedPreferences", "getSharedPreferences", e19);
                    } catch (org.xmlpull.v1.XmlPullParserException e27) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiProcSharedPreferences", "getSharedPreferences", e27);
                    }
                }
                l4Var.f274364n = true;
                if (hashMap != null) {
                    l4Var.f274362i = hashMap;
                    l4Var.f274365o = file2.lastModified();
                    l4Var.f274366p = file2.length();
                } else {
                    l4Var.f274362i = new java.util.HashMap();
                }
                l4Var.notifyAll();
                if (!z17) {
                    return;
                }
            } else if (!z17) {
                return;
            }
            try {
                c20992x3fea691.e();
            } catch (java.lang.Exception unused) {
            }
        } catch (java.lang.Throwable th6) {
            if (z17) {
                try {
                    c20992x3fea691.e();
                } catch (java.lang.Exception unused2) {
                }
            }
            throw th6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.SharedPreferences c(android.content.Context r8, java.lang.String r9, int r10, boolean r11) {
        /*
            com.tencent.mm.sdk.platformtools.o4 r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(r9)
            java.lang.String r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.e4.f274085c
            android.content.Context r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.String r3 = "pref_MultiProcSP_dyncfg"
            r4 = 4
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r4)
            com.p314xaae8f345.mm.sdk.p2603x2137b148.e4.f274083a = r2
            r3 = 0
            if (r2 != 0) goto L1e
            java.lang.String r1 = "MicroMsg.MultiProcSharedPreferences"
            java.lang.String r2 = "SharedPreferences in DynamicConfigStorage initialize failed."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r2)
            r1 = r3
            goto L22
        L1e:
            boolean r1 = r2.getBoolean(r1, r3)
        L22:
            r2 = 1
            if (r1 != 0) goto L45
            java.lang.String r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.e4.f274084b
            android.content.Context r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.String r6 = "pref_MultiProcSP_dyncfg"
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r6, r4)
            com.p314xaae8f345.mm.sdk.p2603x2137b148.e4.f274083a = r5
            if (r5 != 0) goto L3d
            java.lang.String r1 = "MicroMsg.MultiProcSharedPreferences"
            java.lang.String r5 = "SharedPreferences in DynamicConfigStorage initialize failed."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r5)
            r1 = r3
            goto L41
        L3d:
            boolean r1 = r5.getBoolean(r1, r3)
        L41:
            if (r1 == 0) goto L45
            r1 = r2
            goto L46
        L45:
            r1 = r3
        L46:
            if (r1 == 0) goto L9e
            java.lang.String r1 = "MicroMsg.MultiProcSharedPreferences"
            java.lang.String r5 = "sp: %s, use Flock version MultiProcessSP."
            java.lang.Object[] r6 = new java.lang.Object[]{r9}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r5, r6)
            android.util.LruCache r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l4.f274356u
            java.lang.Object r5 = r1.get(r9)
            com.tencent.mm.sdk.platformtools.l4 r5 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.l4) r5
            if (r5 != 0) goto L67
            com.tencent.mm.sdk.platformtools.l4 r5 = new com.tencent.mm.sdk.platformtools.l4
            r5.<init>(r8, r9, r10)
            r1.put(r9, r5)
            goto L9a
        L67:
            r8 = r10 & 4
            if (r8 == 0) goto L9a
            if (r11 == 0) goto L71
            r5.d()
            goto L9a
        L71:
            monitor-enter(r5)
            int r8 = r5.f274363m     // Catch: java.lang.Throwable -> L97
            if (r8 <= 0) goto L77
            goto L8e
        L77:
            long r8 = r5.f274365o     // Catch: java.lang.Throwable -> L97
            java.io.File r10 = r5.f274358e     // Catch: java.lang.Throwable -> L97
            long r6 = r10.lastModified()     // Catch: java.lang.Throwable -> L97
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 != 0) goto L8d
            long r8 = r5.f274366p     // Catch: java.lang.Throwable -> L97
            long r10 = r10.length()     // Catch: java.lang.Throwable -> L97
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L8e
        L8d:
            r3 = r2
        L8e:
            if (r3 != 0) goto L92
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L97
            goto L9a
        L92:
            r5.d()     // Catch: java.lang.Throwable -> L97
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L97
            goto L9a
        L97:
            r8 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L97
            throw r8
        L9a:
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.Z(r5, r0)
            return r0
        L9e:
            java.lang.String r11 = "MicroMsg.MultiProcSharedPreferences"
            java.lang.String r0 = "sp: %s, use system sp."
            java.lang.Object[] r1 = new java.lang.Object[]{r9}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r11, r0, r1)
            android.content.SharedPreferences r8 = r8.getSharedPreferences(r9, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.sdk.p2603x2137b148.l4.c(android.content.Context, java.lang.String, int, boolean):android.content.SharedPreferences");
    }

    public final void b() {
        while (!this.f274364n) {
            try {
                wait();
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(java.lang.String str) {
        boolean containsKey;
        synchronized (this) {
            b();
            containsKey = this.f274362i.containsKey(str);
        }
        return containsKey;
    }

    public final void d() {
        synchronized (this) {
            this.f274364n = false;
        }
        ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.sdk.p2603x2137b148.d4(this));
    }

    @Override // android.content.SharedPreferences
    public android.content.SharedPreferences.Editor edit() {
        synchronized (this) {
            b();
        }
        return new com.p314xaae8f345.mm.sdk.p2603x2137b148.j4(this, null);
    }

    @Override // android.content.SharedPreferences
    public java.util.Map getAll() {
        java.util.HashMap hashMap;
        synchronized (this) {
            b();
            hashMap = new java.util.HashMap(this.f274362i);
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(java.lang.String str, boolean z17) {
        synchronized (this) {
            b();
            java.lang.Boolean bool = (java.lang.Boolean) this.f274362i.get(str);
            if (bool != null) {
                z17 = bool.booleanValue();
            }
        }
        return z17;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(java.lang.String str, float f17) {
        synchronized (this) {
            b();
            java.lang.Float f18 = (java.lang.Float) this.f274362i.get(str);
            if (f18 != null) {
                f17 = f18.floatValue();
            }
        }
        return f17;
    }

    @Override // android.content.SharedPreferences
    public int getInt(java.lang.String str, int i17) {
        synchronized (this) {
            b();
            java.lang.Integer num = (java.lang.Integer) this.f274362i.get(str);
            if (num != null) {
                i17 = num.intValue();
            }
        }
        return i17;
    }

    @Override // android.content.SharedPreferences
    public long getLong(java.lang.String str, long j17) {
        synchronized (this) {
            b();
            java.lang.Long l17 = (java.lang.Long) this.f274362i.get(str);
            if (l17 != null) {
                j17 = l17.longValue();
            }
        }
        return j17;
    }

    @Override // android.content.SharedPreferences
    public java.lang.String getString(java.lang.String str, java.lang.String str2) {
        synchronized (this) {
            b();
            java.lang.String str3 = (java.lang.String) this.f274362i.get(str);
            if (str3 != null) {
                str2 = str3;
            }
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public java.util.Set getStringSet(java.lang.String str, java.util.Set set) {
        synchronized (this) {
            b();
            java.util.Set set2 = (java.util.Set) this.f274362i.get(str);
            if (set2 != null) {
                set = set2;
            }
        }
        return set;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this) {
            this.f274368r.put(onSharedPreferenceChangeListener, f274355t);
        }
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this) {
            this.f274368r.remove(onSharedPreferenceChangeListener);
        }
    }
}
