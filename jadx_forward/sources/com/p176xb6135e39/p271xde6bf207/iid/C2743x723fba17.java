package com.p176xb6135e39.p271xde6bf207.iid;

/* renamed from: com.google.firebase.iid.FirebaseInstanceId */
/* loaded from: classes13.dex */
public class C2743x723fba17 {

    /* renamed from: g, reason: collision with root package name */
    public static final long f126179g = java.util.concurrent.TimeUnit.HOURS.toSeconds(8);

    /* renamed from: h, reason: collision with root package name */
    public static cb.p f126180h;

    /* renamed from: i, reason: collision with root package name */
    public static java.util.concurrent.ScheduledThreadPoolExecutor f126181i;

    /* renamed from: a, reason: collision with root package name */
    public final xa.b f126182a;

    /* renamed from: b, reason: collision with root package name */
    public final cb.f f126183b;

    /* renamed from: c, reason: collision with root package name */
    public final cb.f0 f126184c;

    /* renamed from: d, reason: collision with root package name */
    public final cb.i f126185d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f126186e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f126187f;

    /* JADX WARN: Code restructure failed: missing block: B:45:0x009c, code lost:
    
        if (r8.serviceInfo != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2743x723fba17(xa.b r8) {
        /*
            r7 = this;
            cb.f r0 = new cb.f
            r8.d()
            android.content.Context r1 = r8.f534285a
            r0.<init>(r1)
            r7.<init>()
            cb.i r1 = new cb.i
            r1.<init>()
            r7.f126185d = r1
            r1 = 0
            r7.f126186e = r1
            java.lang.String r2 = cb.f.a(r8)
            if (r2 == 0) goto Lb2
            java.lang.Class<com.google.firebase.iid.FirebaseInstanceId> r2 = com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17.class
            monitor-enter(r2)
            cb.p r3 = com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17.f126180h     // Catch: java.lang.Throwable -> Laf
            if (r3 != 0) goto L30
            cb.p r3 = new cb.p     // Catch: java.lang.Throwable -> Laf
            r8.d()     // Catch: java.lang.Throwable -> Laf
            android.content.Context r4 = r8.f534285a     // Catch: java.lang.Throwable -> Laf
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Laf
            com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17.f126180h = r3     // Catch: java.lang.Throwable -> Laf
        L30:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Laf
            r7.f126182a = r8
            r7.f126183b = r0
            cb.c0 r2 = new cb.c0
            r2.<init>(r8, r7, r0)
            r7.f126184c = r2
            java.lang.String r0 = "firebase_messaging_auto_init_enabled"
            r8.d()
            java.lang.String r2 = "com.google.firebase.messaging"
            android.content.Context r3 = r8.f534285a
            android.content.SharedPreferences r2 = r3.getSharedPreferences(r2, r1)
            java.lang.String r4 = "auto_init"
            boolean r5 = r2.contains(r4)
            r6 = 1
            if (r5 == 0) goto L57
            boolean r8 = r2.getBoolean(r4, r6)
            goto La0
        L57:
            android.content.pm.PackageManager r2 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7a
            if (r2 == 0) goto L7a
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7a
            r4 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7a
            if (r2 == 0) goto L7a
            android.os.Bundle r3 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7a
            if (r3 == 0) goto L7a
            boolean r3 = r3.containsKey(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7a
            if (r3 == 0) goto L7a
            android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7a
            boolean r8 = r2.getBoolean(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7a
            goto La0
        L7a:
            eb.a r8 = eb.a.f332222b     // Catch: java.lang.ClassNotFoundException -> L7d
            goto L9e
        L7d:
            r8.d()
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "com.google.firebase.MESSAGING_EVENT"
            r0.<init>(r2)
            android.content.Context r8 = r8.f534285a
            java.lang.String r2 = r8.getPackageName()
            r0.setPackage(r2)
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            android.content.pm.ResolveInfo r8 = r8.resolveService(r0, r1)
            if (r8 == 0) goto L9f
            android.content.pm.ServiceInfo r8 = r8.serviceInfo
            if (r8 == 0) goto L9f
        L9e:
            r1 = r6
        L9f:
            r8 = r1
        La0:
            r7.f126187f = r8
            monitor-enter(r7)
            boolean r8 = r7.f126187f     // Catch: java.lang.Throwable -> Lac
            monitor-exit(r7)
            if (r8 == 0) goto Lab
            r7.i()
        Lab:
            return
        Lac:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        Laf:
            r8 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Laf
            throw r8
        Lb2:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17.<init>(xa.b):void");
    }

    public static com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17 b() {
        return m20462x9cf0d20b(xa.b.a());
    }

    /* renamed from: getInstance */
    public static synchronized com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17 m20462x9cf0d20b(xa.b bVar) {
        com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17 c2743x723fba17;
        synchronized (com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17.class) {
            c2743x723fba17 = (com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17) bVar.get(com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17.class);
        }
        return c2743x723fba17;
    }

    public static java.lang.String j() {
        cb.h0 h0Var;
        cb.p pVar = f126180h;
        synchronized (pVar) {
            h0Var = (cb.h0) ((x.n) pVar.f121699d).m174751x4aabfc28("", null);
            if (h0Var == null) {
                try {
                    cb.g0 g0Var = pVar.f121698c;
                    android.content.Context context = pVar.f121697b;
                    cb.h0 g17 = g0Var.g(context, "");
                    h0Var = g17 != null ? g17 : g0Var.e(context, "");
                } catch (cb.i0 unused) {
                    b().n();
                    h0Var = pVar.f121698c.e(pVar.f121697b, "");
                }
                ((x.n) pVar.f121699d).put("", h0Var);
            }
        }
        try {
            byte[] digest = java.security.MessageDigest.getInstance("SHA1").digest(h0Var.f121660a.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return android.util.Base64.encodeToString(digest, 0, 8, 11);
        } catch (java.security.NoSuchAlgorithmException unused2) {
            return null;
        }
    }

    public static boolean m() {
        return android.util.Log.isLoggable("FirebaseInstanceId", 3);
    }

    public void a() {
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            throw new java.io.IOException("MAIN_THREAD");
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("iid-operation", "delete");
        bundle.putString("delete", "1");
        e("*", "*", bundle);
        n();
    }

    public java.lang.String c() {
        cb.q k17 = k();
        if (k17 == null || k17.b(this.f126183b.e())) {
            d();
        }
        if (k17 != null) {
            return k17.f121704a;
        }
        return null;
    }

    public final synchronized void d() {
        if (!this.f126186e) {
            f(0L);
        }
    }

    public final java.lang.String e(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        cb.c0 c0Var = (cb.c0) this.f126184c;
        c0Var.b(str, str2, bundle);
        return c0Var.a(c0Var.f121646d.b(bundle));
    }

    public final synchronized void f(long j17) {
        cb.r rVar = new cb.r(this, this.f126183b, java.lang.Math.min(java.lang.Math.max(30L, j17 << 1), f126179g));
        synchronized (com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17.class) {
            if (f126181i == null) {
                f126181i = new java.util.concurrent.ScheduledThreadPoolExecutor(1);
            }
            f126181i.schedule(rVar, j17, java.util.concurrent.TimeUnit.SECONDS);
        }
        this.f126186e = true;
    }

    public final void g(java.lang.String str) {
        cb.q k17 = k();
        if (k17 == null || k17.b(this.f126183b.e())) {
            throw new java.io.IOException("token not available");
        }
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String valueOf = java.lang.String.valueOf(str);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new java.lang.String("/topics/"));
        java.lang.String valueOf2 = java.lang.String.valueOf(str);
        e(k17.f121704a, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new java.lang.String("/topics/"), bundle);
    }

    public final void h(java.lang.String str) {
        cb.q k17 = k();
        if (k17 == null || k17.b(this.f126183b.e())) {
            throw new java.io.IOException("token not available");
        }
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String valueOf = java.lang.String.valueOf(str);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new java.lang.String("/topics/"));
        bundle.putString("delete", "1");
        java.lang.String valueOf2 = java.lang.String.valueOf(str);
        e(k17.f121704a, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new java.lang.String("/topics/"), bundle);
    }

    public final void i() {
        cb.q k17 = k();
        if (k17 == null || k17.b(this.f126183b.e()) || f126180h.b() != null) {
            d();
        }
    }

    public final cb.q k() {
        cb.q a17;
        cb.p pVar = f126180h;
        java.lang.String a18 = cb.f.a(this.f126182a);
        synchronized (pVar) {
            a17 = cb.q.a(pVar.f121696a.getString(cb.p.a("", a18, "*"), null));
        }
        return a17;
    }

    public final java.lang.String l() {
        cb.q a17;
        cb.l lVar;
        final java.lang.String a18 = cb.f.a(this.f126182a);
        final java.lang.String str = "*";
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            throw new java.io.IOException("MAIN_THREAD");
        }
        cb.p pVar = f126180h;
        synchronized (pVar) {
            a17 = cb.q.a(pVar.f121696a.getString(cb.p.a("", a18, "*"), null));
        }
        if (a17 != null && !a17.b(this.f126183b.e())) {
            return a17.f121704a;
        }
        final cb.i iVar = this.f126185d;
        final cb.l lVar2 = new cb.l(this, a18, str) { // from class: cb.b0

            /* renamed from: a, reason: collision with root package name */
            public final com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17 f121636a;

            /* renamed from: b, reason: collision with root package name */
            public final java.lang.String f121637b;

            /* renamed from: c, reason: collision with root package name */
            public final java.lang.String f121638c;

            {
                this.f121636a = this;
                this.f121637b = a18;
                this.f121638c = str;
            }

            @Override // cb.l
            public final java.lang.String a() {
                java.lang.String str2;
                com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17 c2743x723fba17 = this.f121636a;
                java.lang.String str3 = this.f121637b;
                java.lang.String str4 = this.f121638c;
                final cb.c0 c0Var = (cb.c0) c2743x723fba17.f126184c;
                c0Var.getClass();
                final android.os.Bundle bundle = new android.os.Bundle();
                c0Var.b(str3, str4, bundle);
                final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc c2440x4f4de6dc = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc();
                java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = c0Var.f121647e;
                scheduledThreadPoolExecutor.execute(new java.lang.Runnable(c0Var, bundle, c2440x4f4de6dc) { // from class: cb.d0

                    /* renamed from: d, reason: collision with root package name */
                    public final cb.c0 f121649d;

                    /* renamed from: e, reason: collision with root package name */
                    public final android.os.Bundle f121650e;

                    /* renamed from: f, reason: collision with root package name */
                    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc f121651f;

                    {
                        this.f121649d = c0Var;
                        this.f121650e = bundle;
                        this.f121651f = c2440x4f4de6dc;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        android.os.Bundle bundle2 = this.f121650e;
                        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc c2440x4f4de6dc2 = this.f121651f;
                        cb.c0 c0Var2 = this.f121649d;
                        c0Var2.getClass();
                        try {
                            c2440x4f4de6dc2.m19604x209a1f1f(c0Var2.f121646d.b(bundle2));
                        } catch (java.io.IOException e17) {
                            c2440x4f4de6dc2.m19603xb411020d(e17);
                        }
                    }
                });
                try {
                    java.lang.String str5 = (java.lang.String) com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2442x4cd8b6e.m19608x58e7956(c2440x4f4de6dc.m19602xfb859dfb().mo19591xd315a60d(scheduledThreadPoolExecutor, new cb.e0(c0Var)));
                    cb.p pVar2 = com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17.f126180h;
                    java.lang.String e17 = c2743x723fba17.f126183b.e();
                    synchronized (pVar2) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        int i17 = cb.q.f121703e;
                        try {
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put("token", str5);
                            jSONObject.put("appVersion", e17);
                            jSONObject.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, currentTimeMillis);
                            str2 = jSONObject.toString();
                        } catch (org.json.JSONException e18) {
                            new java.lang.StringBuilder(java.lang.String.valueOf(e18).length() + 24);
                            str2 = null;
                        }
                        if (str2 != null) {
                            android.content.SharedPreferences.Editor edit = pVar2.f121696a.edit();
                            edit.putString(cb.p.a("", str3, str4), str2);
                            edit.commit();
                        }
                    }
                    return str5;
                } catch (java.lang.InterruptedException unused) {
                    throw new java.io.IOException("SERVICE_NOT_AVAILABLE");
                } catch (java.util.concurrent.ExecutionException e19) {
                    java.lang.Throwable cause = e19.getCause();
                    if (cause instanceof java.io.IOException) {
                        throw ((java.io.IOException) cause);
                    }
                    if (cause instanceof java.lang.RuntimeException) {
                        throw new java.io.IOException(cause);
                    }
                    throw new java.io.IOException(e19);
                }
            }
        };
        synchronized (iVar) {
            final android.util.Pair pair = new android.util.Pair(a18, "*");
            final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc c2440x4f4de6dc = (com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc) ((x.n) iVar.f121662a).m174751x4aabfc28(pair, null);
            if (c2440x4f4de6dc != null) {
                if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                    new java.lang.StringBuilder(java.lang.String.valueOf(pair).length() + 29);
                }
                lVar = new cb.l(c2440x4f4de6dc) { // from class: cb.j

                    /* renamed from: a, reason: collision with root package name */
                    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc f121663a;

                    {
                        this.f121663a = c2440x4f4de6dc;
                    }

                    @Override // cb.l
                    public final java.lang.String a() {
                        try {
                            return (java.lang.String) com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2442x4cd8b6e.m19608x58e7956(this.f121663a.m19602xfb859dfb());
                        } catch (java.lang.InterruptedException e17) {
                            throw new java.io.IOException(e17);
                        } catch (java.util.concurrent.ExecutionException e18) {
                            java.lang.Throwable cause = e18.getCause();
                            if (cause instanceof java.io.IOException) {
                                throw ((java.io.IOException) cause);
                            }
                            if (cause instanceof java.lang.RuntimeException) {
                                throw ((java.lang.RuntimeException) cause);
                            }
                            throw new java.io.IOException(cause);
                        }
                    }
                };
            } else {
                if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                    new java.lang.StringBuilder(java.lang.String.valueOf(pair).length() + 24);
                }
                final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc c2440x4f4de6dc2 = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc();
                ((x.n) iVar.f121662a).put(pair, c2440x4f4de6dc2);
                lVar = new cb.l(iVar, lVar2, c2440x4f4de6dc2, pair) { // from class: cb.k

                    /* renamed from: a, reason: collision with root package name */
                    public final cb.i f121669a;

                    /* renamed from: b, reason: collision with root package name */
                    public final cb.l f121670b;

                    /* renamed from: c, reason: collision with root package name */
                    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc f121671c;

                    /* renamed from: d, reason: collision with root package name */
                    public final android.util.Pair f121672d;

                    {
                        this.f121669a = iVar;
                        this.f121670b = lVar2;
                        this.f121671c = c2440x4f4de6dc2;
                        this.f121672d = pair;
                    }

                    @Override // cb.l
                    public final java.lang.String a() {
                        cb.i iVar2 = this.f121669a;
                        cb.l lVar3 = this.f121670b;
                        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc c2440x4f4de6dc3 = this.f121671c;
                        android.util.Pair pair2 = this.f121672d;
                        iVar2.getClass();
                        try {
                            try {
                                java.lang.String a19 = lVar3.a();
                                c2440x4f4de6dc3.m19604x209a1f1f(a19);
                                synchronized (iVar2) {
                                    ((x.n) iVar2.f121662a).m174754xc84af884(pair2);
                                }
                                return a19;
                            } catch (java.lang.Throwable th6) {
                                synchronized (iVar2) {
                                    ((x.n) iVar2.f121662a).m174754xc84af884(pair2);
                                    throw th6;
                                }
                            }
                        } catch (java.io.IOException | java.lang.RuntimeException e17) {
                            c2440x4f4de6dc3.m19603xb411020d(e17);
                            throw e17;
                        }
                    }
                };
            }
        }
        return lVar.a();
    }

    public final synchronized void n() {
        f126180h.c();
        synchronized (this) {
        }
        if (this.f126187f) {
            d();
        }
    }
}
