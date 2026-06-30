package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes11.dex */
public final class b5 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f274012a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f274013b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f274014c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f274015d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f274016e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.SharedPreferences f274017f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f274018g;

    /* renamed from: h, reason: collision with root package name */
    public final long f274019h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f274020i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f274021j;

    public b5(java.lang.String str, long j17, boolean z17, boolean z18) {
        this(str, j17, z17, z18, false);
    }

    public final synchronized void a() {
        if (this.f274017f != null) {
            return;
        }
        try {
            this.f274017f = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.Q(this.f274016e);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PeriodRecorder", th6, "exception happened.", new java.lang.Object[0]);
            try {
                this.f274017f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(this.f274016e, 4);
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PeriodRecorder", th7, "fail to get sharedpreferences, disable PeriodRecorder.", new java.lang.Object[0]);
                this.f274017f = null;
            }
        }
        android.content.SharedPreferences sharedPreferences = this.f274017f;
        if (sharedPreferences != null && this.f274014c && sharedPreferences.getInt("ik_last_client_version", 0) != com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PeriodRecorder", "Client version changed, reset all keys in '%s'", this.f274016e);
            synchronized (this.f274015d) {
                if (!this.f274015d[0]) {
                    this.f274017f.edit().clear().putInt("ik_last_client_version", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h).apply();
                    this.f274015d[0] = true;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0086, code lost:
    
        if (((r0 % r7) + r3) > r7) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean b(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "ek_"
            monitor-enter(r9)
            r9.a()     // Catch: java.lang.Throwable -> Lb7
            android.content.SharedPreferences r1 = r9.f274017f     // Catch: java.lang.Throwable -> Lb7
            r2 = 0
            if (r1 != 0) goto L14
            java.lang.String r10 = "MicroMsg.PeriodRecorder"
            java.lang.String r0 = "PeriodRecorder is disabled."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r10, r0)     // Catch: java.lang.Throwable -> Lb7
            monitor-exit(r9)
            return r2
        L14:
            if (r10 == 0) goto Laf
            r9.c()     // Catch: java.lang.Throwable -> Lb7
            boolean r1 = r9.f274012a     // Catch: java.lang.Throwable -> Lb7
            if (r1 == 0) goto L22
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb7
            goto L26
        L22:
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Lb7
        L26:
            java.lang.String r10 = r0.concat(r10)     // Catch: java.lang.Throwable -> Lb7
            java.util.Map r0 = r9.f274018g     // Catch: java.lang.Throwable -> Lb7
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch: java.lang.Throwable -> Lb7
            boolean r0 = r0.containsKey(r10)     // Catch: java.lang.Throwable -> Lb7
            if (r0 != 0) goto L50
            java.util.Map r0 = r9.f274018g     // Catch: java.lang.Throwable -> Lb7
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> Lb7
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch: java.lang.Throwable -> Lb7
            r0.put(r10, r1)     // Catch: java.lang.Throwable -> Lb7
            android.content.SharedPreferences r0 = r9.f274017f     // Catch: java.lang.Throwable -> Lb7
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> Lb7
            android.content.SharedPreferences$Editor r10 = r0.putLong(r10, r3)     // Catch: java.lang.Throwable -> Lb7
            r10.apply()     // Catch: java.lang.Throwable -> Lb7
            boolean r10 = r9.f274013b     // Catch: java.lang.Throwable -> Lb7
            monitor-exit(r9)
            return r10
        L50:
            java.util.Map r0 = r9.f274018g     // Catch: java.lang.Throwable -> Lb7
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r0 = r0.get(r10)     // Catch: java.lang.Throwable -> Lb7
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> Lb7
            long r0 = r0.longValue()     // Catch: java.lang.Throwable -> Lb7
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r6 = 1
            if (r5 >= 0) goto L8a
            boolean r5 = r9.f274012a     // Catch: java.lang.Throwable -> Lb7
            if (r5 == 0) goto L80
            java.util.Map r0 = r9.f274018g     // Catch: java.lang.Throwable -> Lb7
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> Lb7
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch: java.lang.Throwable -> Lb7
            r0.put(r10, r1)     // Catch: java.lang.Throwable -> Lb7
            android.content.SharedPreferences r0 = r9.f274017f     // Catch: java.lang.Throwable -> Lb7
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> Lb7
            android.content.SharedPreferences$Editor r0 = r0.putLong(r10, r3)     // Catch: java.lang.Throwable -> Lb7
            r0.apply()     // Catch: java.lang.Throwable -> Lb7
            goto L93
        L80:
            long r7 = r9.f274019h     // Catch: java.lang.Throwable -> Lb7
            long r0 = r0 % r7
            long r0 = r0 + r3
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 <= 0) goto L93
        L88:
            r2 = r6
            goto L93
        L8a:
            long r0 = r3 - r0
            long r7 = r9.f274019h     // Catch: java.lang.Throwable -> Lb7
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 <= 0) goto L93
            goto L88
        L93:
            if (r2 == 0) goto Lad
            java.util.Map r0 = r9.f274018g     // Catch: java.lang.Throwable -> Lb7
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> Lb7
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch: java.lang.Throwable -> Lb7
            r0.put(r10, r1)     // Catch: java.lang.Throwable -> Lb7
            android.content.SharedPreferences r0 = r9.f274017f     // Catch: java.lang.Throwable -> Lb7
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> Lb7
            android.content.SharedPreferences$Editor r10 = r0.putLong(r10, r3)     // Catch: java.lang.Throwable -> Lb7
            r10.apply()     // Catch: java.lang.Throwable -> Lb7
        Lad:
            monitor-exit(r9)
            return r2
        Laf:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r0 = "key is null."
            r10.<init>(r0)     // Catch: java.lang.Throwable -> Lb7
            throw r10     // Catch: java.lang.Throwable -> Lb7
        Lb7:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.sdk.p2603x2137b148.b5.b(java.lang.String):boolean");
    }

    public final void c() {
        android.content.SharedPreferences sharedPreferences;
        synchronized (this.f274020i) {
            if (!this.f274021j && (sharedPreferences = this.f274017f) != null) {
                if (sharedPreferences instanceof com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) {
                    java.lang.String[] b17 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) sharedPreferences).b();
                    if (b17 == null) {
                        return;
                    }
                    for (java.lang.String str : b17) {
                        if (str.startsWith("ek_")) {
                            try {
                                long j17 = this.f274017f.getLong(str, 0L);
                                if (j17 != 0) {
                                    ((java.util.concurrent.ConcurrentHashMap) this.f274018g).put(str, java.lang.Long.valueOf(j17));
                                }
                            } catch (java.lang.Throwable th6) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PeriodRecorder", th6, "exception occurred.", new java.lang.Object[0]);
                            }
                        }
                    }
                } else {
                    java.util.Map<java.lang.String, ?> all = sharedPreferences.getAll();
                    if (all == null) {
                        return;
                    }
                    for (java.util.Map.Entry<java.lang.String, ?> entry : all.entrySet()) {
                        java.lang.String key = entry.getKey();
                        if (key.startsWith("ek_")) {
                            java.lang.Object value = entry.getValue();
                            if (value instanceof java.lang.Long) {
                                ((java.util.concurrent.ConcurrentHashMap) this.f274018g).put(key, (java.lang.Long) value);
                            }
                        }
                    }
                }
                this.f274021j = true;
            }
        }
    }

    public b5(java.lang.String str, long j17, boolean z17, boolean z18, boolean z19) {
        this.f274015d = new boolean[]{false};
        this.f274019h = 0L;
        this.f274020i = new byte[0];
        this.f274021j = false;
        if (str != null) {
            this.f274012a = z17;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("prm_");
            sb6.append(str);
            sb6.append("_");
            sb6.append(j17);
            sb6.append(z17 ? "_c" : "");
            this.f274016e = sb6.toString();
            this.f274018g = new java.util.concurrent.ConcurrentHashMap(20);
            this.f274019h = j17;
            this.f274013b = z18;
            this.f274014c = z19;
            return;
        }
        throw new java.lang.IllegalArgumentException("scene is null.");
    }
}
