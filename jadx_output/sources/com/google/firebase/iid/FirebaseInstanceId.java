package com.google.firebase.iid;

/* loaded from: classes13.dex */
public class FirebaseInstanceId {

    /* renamed from: g, reason: collision with root package name */
    public static final long f44646g = java.util.concurrent.TimeUnit.HOURS.toSeconds(8);

    /* renamed from: h, reason: collision with root package name */
    public static cb.p f44647h;

    /* renamed from: i, reason: collision with root package name */
    public static java.util.concurrent.ScheduledThreadPoolExecutor f44648i;

    /* renamed from: a, reason: collision with root package name */
    public final xa.b f44649a;

    /* renamed from: b, reason: collision with root package name */
    public final cb.f f44650b;

    /* renamed from: c, reason: collision with root package name */
    public final cb.f0 f44651c;

    /* renamed from: d, reason: collision with root package name */
    public final cb.i f44652d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f44653e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f44654f;

    /* JADX WARN: Code restructure failed: missing block: B:45:0x009c, code lost:
    
        if (r8.serviceInfo != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FirebaseInstanceId(xa.b r8) {
        /*
            r7 = this;
            cb.f r0 = new cb.f
            r8.d()
            android.content.Context r1 = r8.f452752a
            r0.<init>(r1)
            r7.<init>()
            cb.i r1 = new cb.i
            r1.<init>()
            r7.f44652d = r1
            r1 = 0
            r7.f44653e = r1
            java.lang.String r2 = cb.f.a(r8)
            if (r2 == 0) goto Lb2
            java.lang.Class<com.google.firebase.iid.FirebaseInstanceId> r2 = com.google.firebase.iid.FirebaseInstanceId.class
            monitor-enter(r2)
            cb.p r3 = com.google.firebase.iid.FirebaseInstanceId.f44647h     // Catch: java.lang.Throwable -> Laf
            if (r3 != 0) goto L30
            cb.p r3 = new cb.p     // Catch: java.lang.Throwable -> Laf
            r8.d()     // Catch: java.lang.Throwable -> Laf
            android.content.Context r4 = r8.f452752a     // Catch: java.lang.Throwable -> Laf
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Laf
            com.google.firebase.iid.FirebaseInstanceId.f44647h = r3     // Catch: java.lang.Throwable -> Laf
        L30:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Laf
            r7.f44649a = r8
            r7.f44650b = r0
            cb.c0 r2 = new cb.c0
            r2.<init>(r8, r7, r0)
            r7.f44651c = r2
            java.lang.String r0 = "firebase_messaging_auto_init_enabled"
            r8.d()
            java.lang.String r2 = "com.google.firebase.messaging"
            android.content.Context r3 = r8.f452752a
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
            eb.a r8 = eb.a.f250689b     // Catch: java.lang.ClassNotFoundException -> L7d
            goto L9e
        L7d:
            r8.d()
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "com.google.firebase.MESSAGING_EVENT"
            r0.<init>(r2)
            android.content.Context r8 = r8.f452752a
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
            r7.f44654f = r8
            monitor-enter(r7)
            boolean r8 = r7.f44654f     // Catch: java.lang.Throwable -> Lac
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceId.<init>(xa.b):void");
    }

    public static com.google.firebase.iid.FirebaseInstanceId b() {
        return getInstance(xa.b.a());
    }

    public static synchronized com.google.firebase.iid.FirebaseInstanceId getInstance(xa.b bVar) {
        com.google.firebase.iid.FirebaseInstanceId firebaseInstanceId;
        synchronized (com.google.firebase.iid.FirebaseInstanceId.class) {
            firebaseInstanceId = (com.google.firebase.iid.FirebaseInstanceId) bVar.get(com.google.firebase.iid.FirebaseInstanceId.class);
        }
        return firebaseInstanceId;
    }

    public static java.lang.String j() {
        cb.h0 h0Var;
        cb.p pVar = f44647h;
        synchronized (pVar) {
            h0Var = (cb.h0) ((x.n) pVar.f40166d).getOrDefault("", null);
            if (h0Var == null) {
                try {
                    cb.g0 g0Var = pVar.f40165c;
                    android.content.Context context = pVar.f40164b;
                    cb.h0 g17 = g0Var.g(context, "");
                    h0Var = g17 != null ? g17 : g0Var.e(context, "");
                } catch (cb.i0 unused) {
                    b().n();
                    h0Var = pVar.f40165c.e(pVar.f40164b, "");
                }
                ((x.n) pVar.f40166d).put("", h0Var);
            }
        }
        try {
            byte[] digest = java.security.MessageDigest.getInstance("SHA1").digest(h0Var.f40127a.getPublic().getEncoded());
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
        if (k17 == null || k17.b(this.f44650b.e())) {
            d();
        }
        if (k17 != null) {
            return k17.f40171a;
        }
        return null;
    }

    public final synchronized void d() {
        if (!this.f44653e) {
            f(0L);
        }
    }

    public final java.lang.String e(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        cb.c0 c0Var = (cb.c0) this.f44651c;
        c0Var.b(str, str2, bundle);
        return c0Var.a(c0Var.f40113d.b(bundle));
    }

    public final synchronized void f(long j17) {
        cb.r rVar = new cb.r(this, this.f44650b, java.lang.Math.min(java.lang.Math.max(30L, j17 << 1), f44646g));
        synchronized (com.google.firebase.iid.FirebaseInstanceId.class) {
            if (f44648i == null) {
                f44648i = new java.util.concurrent.ScheduledThreadPoolExecutor(1);
            }
            f44648i.schedule(rVar, j17, java.util.concurrent.TimeUnit.SECONDS);
        }
        this.f44653e = true;
    }

    public final void g(java.lang.String str) {
        cb.q k17 = k();
        if (k17 == null || k17.b(this.f44650b.e())) {
            throw new java.io.IOException("token not available");
        }
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String valueOf = java.lang.String.valueOf(str);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new java.lang.String("/topics/"));
        java.lang.String valueOf2 = java.lang.String.valueOf(str);
        e(k17.f40171a, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new java.lang.String("/topics/"), bundle);
    }

    public final void h(java.lang.String str) {
        cb.q k17 = k();
        if (k17 == null || k17.b(this.f44650b.e())) {
            throw new java.io.IOException("token not available");
        }
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String valueOf = java.lang.String.valueOf(str);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new java.lang.String("/topics/"));
        bundle.putString("delete", "1");
        java.lang.String valueOf2 = java.lang.String.valueOf(str);
        e(k17.f40171a, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new java.lang.String("/topics/"), bundle);
    }

    public final void i() {
        cb.q k17 = k();
        if (k17 == null || k17.b(this.f44650b.e()) || f44647h.b() != null) {
            d();
        }
    }

    public final cb.q k() {
        cb.q a17;
        cb.p pVar = f44647h;
        java.lang.String a18 = cb.f.a(this.f44649a);
        synchronized (pVar) {
            a17 = cb.q.a(pVar.f40163a.getString(cb.p.a("", a18, "*"), null));
        }
        return a17;
    }

    public final java.lang.String l() {
        cb.q a17;
        cb.l lVar;
        final java.lang.String a18 = cb.f.a(this.f44649a);
        final java.lang.String str = "*";
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            throw new java.io.IOException("MAIN_THREAD");
        }
        cb.p pVar = f44647h;
        synchronized (pVar) {
            a17 = cb.q.a(pVar.f40163a.getString(cb.p.a("", a18, "*"), null));
        }
        if (a17 != null && !a17.b(this.f44650b.e())) {
            return a17.f40171a;
        }
        final cb.i iVar = this.f44652d;
        final cb.l lVar2 = new cb.l(this, a18, str) { // from class: cb.b0

            /* renamed from: a, reason: collision with root package name */
            public final com.google.firebase.iid.FirebaseInstanceId f40103a;

            /* renamed from: b, reason: collision with root package name */
            public final java.lang.String f40104b;

            /* renamed from: c, reason: collision with root package name */
            public final java.lang.String f40105c;

            {
                this.f40103a = this;
                this.f40104b = a18;
                this.f40105c = str;
            }

            @Override // cb.l
            public final java.lang.String a() {
                java.lang.String str2;
                com.google.firebase.iid.FirebaseInstanceId firebaseInstanceId = this.f40103a;
                java.lang.String str3 = this.f40104b;
                java.lang.String str4 = this.f40105c;
                final cb.c0 c0Var = (cb.c0) firebaseInstanceId.f44651c;
                c0Var.getClass();
                final android.os.Bundle bundle = new android.os.Bundle();
                c0Var.b(str3, str4, bundle);
                final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
                java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = c0Var.f40114e;
                scheduledThreadPoolExecutor.execute(new java.lang.Runnable(c0Var, bundle, taskCompletionSource) { // from class: cb.d0

                    /* renamed from: d, reason: collision with root package name */
                    public final cb.c0 f40116d;

                    /* renamed from: e, reason: collision with root package name */
                    public final android.os.Bundle f40117e;

                    /* renamed from: f, reason: collision with root package name */
                    public final com.google.android.gms.tasks.TaskCompletionSource f40118f;

                    {
                        this.f40116d = c0Var;
                        this.f40117e = bundle;
                        this.f40118f = taskCompletionSource;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        android.os.Bundle bundle2 = this.f40117e;
                        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2 = this.f40118f;
                        cb.c0 c0Var2 = this.f40116d;
                        c0Var2.getClass();
                        try {
                            taskCompletionSource2.setResult(c0Var2.f40113d.b(bundle2));
                        } catch (java.io.IOException e17) {
                            taskCompletionSource2.setException(e17);
                        }
                    }
                });
                try {
                    java.lang.String str5 = (java.lang.String) com.google.android.gms.tasks.Tasks.await(taskCompletionSource.getTask().continueWith(scheduledThreadPoolExecutor, new cb.e0(c0Var)));
                    cb.p pVar2 = com.google.firebase.iid.FirebaseInstanceId.f44647h;
                    java.lang.String e17 = firebaseInstanceId.f44650b.e();
                    synchronized (pVar2) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        int i17 = cb.q.f40170e;
                        try {
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put("token", str5);
                            jSONObject.put("appVersion", e17);
                            jSONObject.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, currentTimeMillis);
                            str2 = jSONObject.toString();
                        } catch (org.json.JSONException e18) {
                            new java.lang.StringBuilder(java.lang.String.valueOf(e18).length() + 24);
                            str2 = null;
                        }
                        if (str2 != null) {
                            android.content.SharedPreferences.Editor edit = pVar2.f40163a.edit();
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
            final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = (com.google.android.gms.tasks.TaskCompletionSource) ((x.n) iVar.f40129a).getOrDefault(pair, null);
            if (taskCompletionSource != null) {
                if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                    new java.lang.StringBuilder(java.lang.String.valueOf(pair).length() + 29);
                }
                lVar = new cb.l(taskCompletionSource) { // from class: cb.j

                    /* renamed from: a, reason: collision with root package name */
                    public final com.google.android.gms.tasks.TaskCompletionSource f40130a;

                    {
                        this.f40130a = taskCompletionSource;
                    }

                    @Override // cb.l
                    public final java.lang.String a() {
                        try {
                            return (java.lang.String) com.google.android.gms.tasks.Tasks.await(this.f40130a.getTask());
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
                final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2 = new com.google.android.gms.tasks.TaskCompletionSource();
                ((x.n) iVar.f40129a).put(pair, taskCompletionSource2);
                lVar = new cb.l(iVar, lVar2, taskCompletionSource2, pair) { // from class: cb.k

                    /* renamed from: a, reason: collision with root package name */
                    public final cb.i f40136a;

                    /* renamed from: b, reason: collision with root package name */
                    public final cb.l f40137b;

                    /* renamed from: c, reason: collision with root package name */
                    public final com.google.android.gms.tasks.TaskCompletionSource f40138c;

                    /* renamed from: d, reason: collision with root package name */
                    public final android.util.Pair f40139d;

                    {
                        this.f40136a = iVar;
                        this.f40137b = lVar2;
                        this.f40138c = taskCompletionSource2;
                        this.f40139d = pair;
                    }

                    @Override // cb.l
                    public final java.lang.String a() {
                        cb.i iVar2 = this.f40136a;
                        cb.l lVar3 = this.f40137b;
                        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource3 = this.f40138c;
                        android.util.Pair pair2 = this.f40139d;
                        iVar2.getClass();
                        try {
                            try {
                                java.lang.String a19 = lVar3.a();
                                taskCompletionSource3.setResult(a19);
                                synchronized (iVar2) {
                                    ((x.n) iVar2.f40129a).remove(pair2);
                                }
                                return a19;
                            } catch (java.lang.Throwable th6) {
                                synchronized (iVar2) {
                                    ((x.n) iVar2.f40129a).remove(pair2);
                                    throw th6;
                                }
                            }
                        } catch (java.io.IOException | java.lang.RuntimeException e17) {
                            taskCompletionSource3.setException(e17);
                            throw e17;
                        }
                    }
                };
            }
        }
        return lVar.a();
    }

    public final synchronized void n() {
        f44647h.c();
        synchronized (this) {
        }
        if (this.f44654f) {
            d();
        }
    }
}
