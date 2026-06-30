package cb;

/* loaded from: classes13.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f121709d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.PowerManager.WakeLock f121710e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17 f121711f;

    /* renamed from: g, reason: collision with root package name */
    public final cb.f f121712g;

    public r(com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17 c2743x723fba17, cb.f fVar, long j17) {
        this.f121711f = c2743x723fba17;
        this.f121712g = fVar;
        this.f121709d = j17;
        xa.b bVar = c2743x723fba17.f126182a;
        bVar.d();
        android.os.PowerManager.WakeLock newWakeLock = ((android.os.PowerManager) bVar.f534285a.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f121710e = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17 c2743x723fba17 = this.f121711f;
        cb.q k17 = c2743x723fba17.k();
        if (k17 != null && !k17.b(this.f121712g.e())) {
            return true;
        }
        try {
            java.lang.String l17 = c2743x723fba17.l();
            if (l17 == null) {
                return false;
            }
            android.util.Log.isLoggable("FirebaseInstanceId", 3);
            if (k17 == null || !l17.equals(k17.f121704a)) {
                xa.b bVar = c2743x723fba17.f126182a;
                bVar.d();
                android.content.Context context = bVar.f534285a;
                android.content.Intent intent = new android.content.Intent("com.google.firebase.iid.TOKEN_REFRESH");
                android.content.Intent intent2 = new android.content.Intent("com.google.firebase.INSTANCE_ID_EVENT");
                intent2.setClass(context, com.p176xb6135e39.p271xde6bf207.iid.C2744xa1b20126.class);
                intent2.putExtra("wrapped_intent", intent);
                context.sendBroadcast(intent2);
            }
            return true;
        } catch (java.io.IOException | java.lang.SecurityException e17) {
            java.lang.String valueOf = java.lang.String.valueOf(e17.getMessage());
            if (valueOf.length() != 0) {
                "Token retrieval failed: ".concat(valueOf);
            }
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b A[Catch: IOException -> 0x0052, TryCatch #0 {IOException -> 0x0052, blocks: (B:11:0x001e, B:20:0x0047, B:21:0x004e, B:22:0x004b, B:23:0x002b, B:26:0x0035), top: B:10:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            r7 = this;
        L0:
            com.google.firebase.iid.FirebaseInstanceId r0 = r7.f121711f
            monitor-enter(r0)
            cb.p r1 = com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17.f126180h     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r1 = r1.b()     // Catch: java.lang.Throwable -> Lbf
            r2 = 1
            if (r1 != 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbf
            return r2
        Le:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r0 = "!"
            java.lang.String[] r0 = r1.split(r0)
            int r3 = r0.length
            r4 = 2
            r5 = 0
            if (r3 != r4) goto L67
            r3 = r0[r5]
            r0 = r0[r2]
            int r4 = r3.hashCode()     // Catch: java.io.IOException -> L52
            r6 = 83
            if (r4 == r6) goto L35
            r6 = 85
            if (r4 == r6) goto L2b
            goto L3f
        L2b:
            java.lang.String r4 = "U"
            boolean r3 = r3.equals(r4)     // Catch: java.io.IOException -> L52
            if (r3 == 0) goto L3f
            r3 = r2
            goto L40
        L35:
            java.lang.String r4 = "S"
            boolean r3 = r3.equals(r4)     // Catch: java.io.IOException -> L52
            if (r3 == 0) goto L3f
            r3 = r5
            goto L40
        L3f:
            r3 = -1
        L40:
            com.google.firebase.iid.FirebaseInstanceId r4 = r7.f121711f
            if (r3 == 0) goto L4b
            if (r3 == r2) goto L47
            goto L67
        L47:
            r4.h(r0)     // Catch: java.io.IOException -> L52
            goto L4e
        L4b:
            r4.g(r0)     // Catch: java.io.IOException -> L52
        L4e:
            com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17.m()     // Catch: java.io.IOException -> L52
            goto L67
        L52:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L66
            java.lang.String r2 = "Topic sync failed: "
            r2.concat(r0)
        L66:
            r2 = r5
        L67:
            if (r2 != 0) goto L6a
            return r5
        L6a:
            cb.p r0 = com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17.f126180h
            monitor-enter(r0)
            android.content.SharedPreferences r2 = r0.f121696a     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r3 = "topic_operaion_queue"
            java.lang.String r4 = ""
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r3 = ","
            int r4 = r1.length()     // Catch: java.lang.Throwable -> Lbc
            if (r4 == 0) goto L84
            java.lang.String r3 = r3.concat(r1)     // Catch: java.lang.Throwable -> Lbc
            goto L8a
        L84:
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> Lbc
            r4.<init>(r3)     // Catch: java.lang.Throwable -> Lbc
            r3 = r4
        L8a:
            boolean r3 = r2.startsWith(r3)     // Catch: java.lang.Throwable -> Lbc
            if (r3 == 0) goto Lb9
            java.lang.String r3 = ","
            int r4 = r1.length()     // Catch: java.lang.Throwable -> Lbc
            if (r4 == 0) goto L9d
            java.lang.String r1 = r3.concat(r1)     // Catch: java.lang.Throwable -> Lbc
            goto La2
        L9d:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> Lbc
            r1.<init>(r3)     // Catch: java.lang.Throwable -> Lbc
        La2:
            int r1 = r1.length()     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r1 = r2.substring(r1)     // Catch: java.lang.Throwable -> Lbc
            android.content.SharedPreferences r2 = r0.f121696a     // Catch: java.lang.Throwable -> Lbc
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r3 = "topic_operaion_queue"
            android.content.SharedPreferences$Editor r1 = r2.putString(r3, r1)     // Catch: java.lang.Throwable -> Lbc
            r1.apply()     // Catch: java.lang.Throwable -> Lbc
        Lb9:
            monitor-exit(r0)
            goto L0
        Lbc:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        Lbf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbf
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.r.b():boolean");
    }

    public final boolean c() {
        xa.b bVar = this.f121711f.f126182a;
        bVar.d();
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) bVar.f534285a.getSystemService("connectivity");
        android.net.NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17 c2743x723fba17 = this.f121711f;
        android.os.PowerManager.WakeLock wakeLock = this.f121710e;
        yj0.a.c(wakeLock, "com/google/firebase/iid/zzaq", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        wakeLock.acquire();
        yj0.a.f(wakeLock, "com/google/firebase/iid/zzaq", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        try {
            synchronized (c2743x723fba17) {
                z17 = true;
                c2743x723fba17.f126186e = true;
            }
            if (this.f121712g.d() == 0) {
                z17 = false;
            }
            if (!z17) {
                synchronized (c2743x723fba17) {
                    c2743x723fba17.f126186e = false;
                }
                return;
            }
            if (c()) {
                if (a() && b()) {
                    synchronized (c2743x723fba17) {
                        c2743x723fba17.f126186e = false;
                    }
                } else {
                    c2743x723fba17.f(this.f121709d);
                }
                return;
            }
            cb.s sVar = new cb.s(this);
            com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17.m();
            android.content.IntentFilter intentFilter = new android.content.IntentFilter(io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be);
            xa.b bVar = sVar.f121713a.f121711f.f126182a;
            bVar.d();
            bVar.f534285a.registerReceiver(sVar, intentFilter);
            return;
        } finally {
        }
        android.os.PowerManager.WakeLock wakeLock2 = this.f121710e;
        yj0.a.c(wakeLock2, "com/google/firebase/iid/zzaq", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        wakeLock2.release();
        yj0.a.f(wakeLock2, "com/google/firebase/iid/zzaq", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
    }
}
