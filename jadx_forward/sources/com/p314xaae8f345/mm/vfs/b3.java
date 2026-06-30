package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class b3 implements android.os.Handler.Callback {
    public static volatile android.content.Context E = null;
    public static volatile com.p314xaae8f345.mm.vfs.v2 F = null;
    public static volatile boolean G = true;
    public static volatile int H;
    public static volatile com.p314xaae8f345.mm.vfs.u2 I;
    public final android.content.BroadcastReceiver A;
    public volatile java.util.HashMap B;
    public volatile boolean C;
    public volatile android.content.BroadcastReceiver D;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f294346d;

    /* renamed from: e, reason: collision with root package name */
    public final int f294347e;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.vfs.r5 f294349g;

    /* renamed from: h, reason: collision with root package name */
    public int f294350h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.vfs.z2 f294351i;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.vfs.o5 f294353n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.vfs.o5 f294354o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.vfs.o5 f294355p;

    /* renamed from: q, reason: collision with root package name */
    public final java.io.File f294356q;

    /* renamed from: r, reason: collision with root package name */
    public final android.os.HandlerThread f294357r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.w2 f294358s;

    /* renamed from: t, reason: collision with root package name */
    public final android.os.Handler f294359t;

    /* renamed from: u, reason: collision with root package name */
    public android.os.Message[] f294360u;

    /* renamed from: v, reason: collision with root package name */
    public volatile long f294361v;

    /* renamed from: w, reason: collision with root package name */
    public volatile long f294362w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f294363x;

    /* renamed from: y, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.vfs.x2 f294364y;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f294348f = new java.lang.Object();

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f294352m = new java.lang.Object();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f294365z = new java.util.concurrent.atomic.AtomicReference();

    public b3(com.p314xaae8f345.mm.vfs.r2 r2Var) {
        android.content.Context context = E;
        this.f294346d = context;
        this.f294347e = H;
        if (context == null) {
            throw new java.lang.IllegalStateException("Call FileSystemManager.setContext(Context) before calling instance()");
        }
        java.io.File parentFile = context.getFilesDir().getParentFile();
        this.f294356q = new java.io.File(parentFile == null ? context.getCacheDir() : parentFile, ".vfs");
        this.f294360u = new android.os.Message[3];
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("VFS.Maintenance", 1);
        this.f294357r = handlerThread;
        handlerThread.start();
        this.f294359t = new android.os.Handler(handlerThread.getLooper(), this);
        this.f294358s = new com.p314xaae8f345.mm.vfs.w2(this, null);
        this.f294361v = -1L;
        this.f294362w = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        this.C = true;
        this.A = new com.p314xaae8f345.mm.vfs.s2(this);
        this.B = g(context);
        com.p314xaae8f345.mm.vfs.o5 o5Var = new com.p314xaae8f345.mm.vfs.o5();
        java.util.Map map = o5Var.f294643a;
        com.p314xaae8f345.mm.vfs.n2 n2Var = com.p314xaae8f345.mm.vfs.C22749x3a6b1587.f39815x681a0c0c;
        com.p314xaae8f345.mm.vfs.t5 t5Var = com.p314xaae8f345.mm.vfs.n2.f294613a;
        map.put(null, t5Var);
        map.put("", t5Var);
        map.put("file", t5Var);
        com.p314xaae8f345.mm.vfs.m8 m8Var = com.p314xaae8f345.mm.vfs.C22773x3a504265.f39834x681a0c0c;
        map.put("wcf", com.p314xaae8f345.mm.vfs.m8.f294612a);
        java.util.Map map2 = o5Var.f294644b;
        android.os.Parcelable.Creator<com.p314xaae8f345.mm.vfs.C22759xc55eb7d2> creator = com.p314xaae8f345.mm.vfs.C22759xc55eb7d2.f39821x681a0c0c;
        map2.put("null", com.p314xaae8f345.mm.vfs.j4.f294546a);
        java.util.Map map3 = o5Var.f294647e;
        map3.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, context.getCacheDir().getParent());
        map3.put("dataCache", context.getCacheDir().getPath());
        this.f294355p = o5Var;
        com.p314xaae8f345.mm.vfs.o5.c(o5Var.f294647e, this.B);
        this.f294353n = new com.p314xaae8f345.mm.vfs.o5();
        this.f294354o = new com.p314xaae8f345.mm.vfs.o5();
        this.f294349g = new com.p314xaae8f345.mm.vfs.r5(this.f294355p);
        this.f294350h = 0;
        this.f294351i = new com.p314xaae8f345.mm.vfs.z2(null, null, 0, null);
    }

    public static java.util.HashMap g(android.content.Context context) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.io.File externalCacheDir = context.getExternalCacheDir();
        hashMap.put("extData", externalCacheDir == null ? null : externalCacheDir.getParent());
        hashMap.put("extCache", externalCacheDir == null ? null : externalCacheDir.getPath());
        java.io.File externalStorageDirectory = android.os.Environment.getExternalStorageDirectory();
        hashMap.put("storage", externalStorageDirectory != null ? externalStorageDirectory.getPath() : null);
        return hashMap;
    }

    public com.p314xaae8f345.mm.vfs.m5 a() {
        com.p314xaae8f345.mm.vfs.r5 r5Var;
        synchronized (this.f294348f) {
            r5Var = this.f294349g;
        }
        return r5Var;
    }

    public void b(long j17, long j18, boolean z17) {
        long j19 = this.f294361v;
        if (j17 >= 0 && j19 < 0) {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            int i17 = android.os.Build.VERSION.SDK_INT;
            if (i17 < 33 || this.f294346d.getApplicationInfo().targetSdkVersion < 33) {
                this.f294346d.registerReceiver(this.f294358s, intentFilter);
            } else {
                this.f294346d.registerReceiver(this.f294358s, intentFilter, 4);
            }
            com.p314xaae8f345.mm.vfs.w2 w2Var = this.f294358s;
            android.content.Context context = this.f294346d;
            w2Var.getClass();
            w2Var.f294757b = ((android.os.PowerManager) context.getSystemService("power")).isScreenOn();
            android.content.IntentFilter intentFilter2 = new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED");
            android.content.Intent registerReceiver = (i17 < 33 || context.getApplicationInfo().targetSdkVersion < 33) ? context.registerReceiver(null, intentFilter2) : context.registerReceiver(null, intentFilter2, 4);
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra("status", -1);
                w2Var.f294756a = intExtra == 2 || intExtra == 5;
            }
            w2Var.a();
        } else if (j17 < 0 && j19 >= 0) {
            this.f294346d.unregisterReceiver(this.f294358s);
            this.f294359t.removeMessages(2);
        }
        this.f294361v = j17;
        this.f294362w = j18;
        this.f294363x = z17;
    }

    public java.util.Map c() {
        return ((com.p314xaae8f345.mm.vfs.r5) a()).a();
    }

    public com.p314xaae8f345.mm.vfs.z7 d(com.p314xaae8f345.mm.vfs.z7 z7Var) {
        com.p314xaae8f345.mm.vfs.r5 r5Var;
        synchronized (this.f294348f) {
            r5Var = this.f294349g;
        }
        com.p314xaae8f345.mm.vfs.s5 f17 = r5Var.f(z7Var.f294810d);
        if (f17 == null) {
            return null;
        }
        return f17.c(r5Var, z7Var);
    }

    public java.util.Map e() {
        return ((com.p314xaae8f345.mm.vfs.r5) a()).c();
    }

    public final android.os.Bundle h() {
        java.io.DataInputStream dataInputStream;
        java.io.File file = new java.io.File(this.f294356q, "fs.bin");
        long length = file.length();
        if (length > 8388608 || length <= 8) {
            throw new java.io.IOException("Invalid parcel file size: " + length);
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        java.io.DataInputStream dataInputStream2 = null;
        try {
            dataInputStream = new java.io.DataInputStream(new java.io.FileInputStream(file));
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            int readInt = dataInputStream.readInt();
            if (readInt != 5) {
                throw new com.p314xaae8f345.mm.vfs.d8(com.p314xaae8f345.mm.vfs.b3.class, readInt, 5);
            }
            int readInt2 = dataInputStream.readInt();
            int i17 = this.f294347e;
            if (readInt2 != i17) {
                throw new com.p314xaae8f345.mm.vfs.d8(com.p314xaae8f345.mm.vfs.b3.class, readInt2, i17);
            }
            int i18 = ((int) length) - 8;
            byte[] bArr = new byte[i18];
            int i19 = 0;
            while (i19 < i18) {
                i19 += dataInputStream.read(bArr, i19, i18 - i19);
            }
            obtain.unmarshall(bArr, 0, i19);
            obtain.setDataPosition(0);
            android.os.Bundle readBundle = obtain.readBundle(com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb.class.getClassLoader());
            com.p314xaae8f345.mm.vfs.e8.d(dataInputStream);
            obtain.recycle();
            return readBundle;
        } catch (java.lang.Throwable th7) {
            th = th7;
            dataInputStream2 = dataInputStream;
            com.p314xaae8f345.mm.vfs.e8.d(dataInputStream2);
            obtain.recycle();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0122, code lost:
    
        if (r3.isHeld() != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015b, code lost:
    
        r12 = r3;
        yj0.a.c(r12, "com/tencent/mm/vfs/FileSystemManager", "doMaintenance", "(Landroid/os/CancellationSignal;)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        r3.release();
        yj0.a.f(r12, "com/tencent/mm/vfs/FileSystemManager", "doMaintenance", "(Landroid/os/CancellationSignal;)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0159, code lost:
    
        if (r3.isHeld() != false) goto L63;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handleMessage(android.os.Message r21) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.vfs.b3.handleMessage(android.os.Message):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(android.os.CancellationSignal r12) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.vfs.b3.i(android.os.CancellationSignal):void");
    }

    public long j() {
        com.p314xaae8f345.mm.vfs.y2 y2Var = (com.p314xaae8f345.mm.vfs.y2) this.f294365z.get();
        if (y2Var == null || y2Var.f294788a != android.os.Process.myTid()) {
            return Long.MIN_VALUE;
        }
        return y2Var.f294789b;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(android.os.Bundle r9) {
        /*
            r8 = this;
            java.lang.String r0 = "VFS.FileSystemManager"
            java.lang.String r1 = "Cannot write parcel file: "
            android.os.Parcel r2 = android.os.Parcel.obtain()
            r2.writeBundle(r9)
            byte[] r3 = r2.marshall()
            r2.recycle()
            java.io.File r2 = new java.io.File
            java.io.File r4 = r8.f294356q
            java.lang.String r5 = "fs.bin.tmp"
            r2.<init>(r4, r5)
            java.io.File r5 = new java.io.File
            java.lang.String r6 = "fs.bin"
            r5.<init>(r4, r6)
            r4 = 0
            java.io.DataOutputStream r6 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            r4 = 5
            r6.writeInt(r4)     // Catch: java.io.IOException -> L48 java.lang.Throwable -> Lcb
            int r4 = r8.f294347e     // Catch: java.io.IOException -> L48 java.lang.Throwable -> Lcb
            r6.writeInt(r4)     // Catch: java.io.IOException -> L48 java.lang.Throwable -> Lcb
            r6.write(r3)     // Catch: java.io.IOException -> L48 java.lang.Throwable -> Lcb
            r6.close()     // Catch: java.io.IOException -> L48 java.lang.Throwable -> Lcb
            java.lang.String r4 = r2.getPath()     // Catch: java.io.IOException -> L48 java.lang.Throwable -> Lcb
            java.lang.String r5 = r5.getPath()     // Catch: java.io.IOException -> L48 java.lang.Throwable -> Lcb
            com.p314xaae8f345.mm.vfs.z3.a(r4, r5)     // Catch: java.io.IOException -> L48 java.lang.Throwable -> Lcb
            goto L66
        L48:
            r4 = move-exception
            goto L50
        L4a:
            r9 = move-exception
            goto Lcd
        L4d:
            r5 = move-exception
            r6 = r4
            r4 = r5
        L50:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcb
            r5.<init>(r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = r4.getMessage()     // Catch: java.lang.Throwable -> Lcb
            r5.append(r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> Lcb
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e(r0, r1)     // Catch: java.lang.Throwable -> Lcb
            r2.delete()     // Catch: java.lang.Throwable -> Lcb
        L66:
            com.p314xaae8f345.mm.vfs.e8.d(r6)
            android.content.Context r1 = r8.f294346d
            java.lang.String r2 = r1.getPackageName()
            android.content.Intent r4 = new android.content.Intent
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r2 = ".REFRESH_VFS"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2)
            int r2 = r3.length
            r5 = 131072(0x20000, float:1.83671E-40)
            java.lang.String r6 = "fromFile"
            if (r2 >= r5) goto L90
            r4.putExtras(r9)
            goto L94
        L90:
            r9 = 1
            r4.putExtra(r6, r9)
        L94:
            java.lang.String r9 = "pid"
            int r2 = android.os.Process.myPid()
            r4.putExtra(r9, r2)
            java.lang.String r9 = "uid"
            int r2 = android.os.Process.myUid()
            r4.putExtra(r9, r2)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "Bundle published - size: "
            r9.<init>(r2)
            int r2 = r3.length
            r9.append(r2)
            java.lang.String r2 = ", fromFile: "
            r9.append(r2)
            r2 = 0
            boolean r2 = r4.getBooleanExtra(r6, r2)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i(r0, r9)
            r1.sendBroadcast(r4)
            return
        Lcb:
            r9 = move-exception
            r4 = r6
        Lcd:
            com.p314xaae8f345.mm.vfs.e8.d(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.vfs.b3.k(android.os.Bundle):void");
    }

    public final void l(boolean z17) {
        if (z17) {
            this.f294355p = this.f294355p.f();
            this.f294354o = this.f294354o.f();
            this.f294353n = this.f294353n.f();
        }
        com.p314xaae8f345.mm.vfs.o5 o5Var = new com.p314xaae8f345.mm.vfs.o5(this.f294355p);
        o5Var.a(this.f294354o);
        o5Var.a(this.f294353n);
        com.p314xaae8f345.mm.vfs.r5 r5Var = new com.p314xaae8f345.mm.vfs.r5(o5Var);
        synchronized (this.f294348f) {
            this.f294349g = r5Var;
            int i17 = this.f294350h + 1;
            this.f294350h = i17;
            this.f294351i = new com.p314xaae8f345.mm.vfs.z2(null, null, i17, null);
        }
    }

    public com.p314xaae8f345.mm.vfs.z2 m(com.p314xaae8f345.mm.vfs.z7 z7Var, com.p314xaae8f345.mm.vfs.z2 z2Var) {
        android.util.Pair a17;
        synchronized (this.f294348f) {
            if (z2Var != null) {
                if (z2Var.f294801c == this.f294350h) {
                    return z2Var;
                }
            }
            com.p314xaae8f345.mm.vfs.r5 r5Var = this.f294349g;
            int i17 = this.f294350h;
            com.p314xaae8f345.mm.vfs.z2 z2Var2 = this.f294351i;
            com.p314xaae8f345.mm.vfs.s5 f17 = r5Var.f(z7Var.f294810d);
            return (f17 == null || (a17 = f17.a(r5Var, z7Var)) == null) ? z2Var2 : new com.p314xaae8f345.mm.vfs.z2((com.p314xaae8f345.mm.vfs.q2) a17.first, (java.lang.String) a17.second, i17, null);
        }
    }
}
