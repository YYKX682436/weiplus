package i95;

/* loaded from: classes12.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static android.app.Application f371350a;

    /* renamed from: b, reason: collision with root package name */
    public static i95.y f371351b;

    /* renamed from: c, reason: collision with root package name */
    public static java.util.concurrent.ForkJoinPool f371352c;

    /* renamed from: d, reason: collision with root package name */
    public static java.util.concurrent.ForkJoinPool f371353d;

    /* renamed from: e, reason: collision with root package name */
    public static final k95.a[] f371354e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean[] f371355f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Set f371356g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f371357h;

    /* renamed from: i, reason: collision with root package name */
    public static final boolean[] f371358i;

    /* renamed from: j, reason: collision with root package name */
    public static final boolean[] f371359j;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f371360k;

    /* renamed from: l, reason: collision with root package name */
    public static final boolean[] f371361l;

    /* renamed from: m, reason: collision with root package name */
    public static final android.os.Handler f371362m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.ThreadLocal f371363n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.Runnable f371364o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.Runnable f371365p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.Runnable f371366q;

    /* renamed from: r, reason: collision with root package name */
    public static final android.app.Application.ActivityLifecycleCallbacks f371367r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.Map f371368s;

    static {
        java.lang.Runtime.getRuntime().availableProcessors();
        f371352c = null;
        f371353d = null;
        f371354e = new k95.a[]{null};
        f371355f = new boolean[]{false};
        f371356g = new java.util.LinkedHashSet(64);
        f371357h = false;
        f371358i = new boolean[]{false};
        f371359j = new boolean[]{false};
        f371360k = false;
        f371361l = new boolean[]{false};
        f371362m = new android.os.Handler(android.os.Looper.getMainLooper());
        f371363n = new java.lang.ThreadLocal();
        f371364o = new i95.a0();
        f371365p = new i95.b0();
        f371366q = new i95.c0();
        f371367r = new i95.e0();
        f371368s = new java.util.concurrent.ConcurrentHashMap(64);
    }

    public static void a(java.lang.Iterable iterable, i95.r rVar, boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ServiceManager", "[+] preload feature service: '%s', dest_status: %s, wait: %s, callAccountInitNowIfPossible: %s", iterable, rVar, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        java.lang.Throwable th6 = new java.lang.Throwable();
        java.util.ArrayList arrayList = new java.util.ArrayList(512);
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            i95.g0 g0Var = new i95.g0((fs.q) it.next(), th6, rVar, z18);
            if (z17) {
                arrayList.add(f371352c.submit((java.lang.Runnable) g0Var));
            } else {
                f371353d.execute(g0Var);
            }
        }
        if (z17) {
            l(arrayList, true);
        }
    }

    public static void b(java.lang.String str) {
        boolean[] zArr = f371355f;
        if (zArr[0]) {
            return;
        }
        synchronized (zArr) {
            if (!zArr[0]) {
                throw new java.lang.IllegalStateException("please call initialize(...) first before " + str);
            }
        }
    }

    public static i95.m c(java.lang.Class cls) {
        b("calling getService(...)");
        return (i95.m) f(new i95.f0(cls, false));
    }

    public static void d(android.app.Application application, i95.y yVar, k95.a aVar) {
        boolean[] zArr = f371355f;
        synchronized (zArr) {
            if (zArr[0]) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ServiceManager", "Already initialized.");
            } else {
                f371350a = application;
                java.util.Objects.requireNonNull(yVar);
                f371351b = yVar;
                i95.m0 m0Var = i95.m0.INSTANCE;
                f371352c = new java.util.concurrent.ForkJoinPool(6, m0Var, null, false);
                f371353d = new java.util.concurrent.ForkJoinPool(6, m0Var, null, false);
                k95.a[] aVarArr = f371354e;
                synchronized (aVarArr) {
                    aVarArr[0] = aVar;
                }
                if (com.p314xaae8f345.mm.app.v5.a(f371350a) == com.p314xaae8f345.mm.app.v5.f135384h) {
                    application.registerActivityLifecycleCallbacks(f371367r);
                    f371362m.post(f371364o);
                }
                zArr[0] = true;
            }
        }
    }

    public static void e(boolean z17, boolean z18) {
        boolean z19;
        boolean z27;
        boolean z28;
        b("calling initializeAccountForActivatedServices()");
        boolean[] zArr = f371359j;
        synchronized (zArr) {
            zArr[0] = false;
        }
        if (!z17) {
            b("isAccountInitialized");
            k95.a[] aVarArr = f371354e;
            synchronized (aVarArr) {
                ((com.p314xaae8f345.mm.app.q0) aVarArr[0]).getClass();
                z27 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2534xf84d0b50.C20224x3c1db5ce()) == 1;
            }
            if (!z27) {
                boolean[] zArr2 = f371361l;
                synchronized (zArr2) {
                    z28 = zArr2[0];
                }
                if (z28) {
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ServiceManager", "[+] initializeAccountForActivatedServices(%s,%s), delay actual works to stage after first screen or 5s later.", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
            android.os.Handler handler = f371362m;
            java.lang.Runnable runnable = f371366q;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, 5000L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ServiceManager", "[+] ASYNC preload onAccountInitialized() watchdog task posted.");
            return;
        }
        if (f371357h) {
            return;
        }
        java.lang.Throwable th6 = new java.lang.Throwable();
        java.util.ArrayList arrayList = new java.util.ArrayList(128);
        java.util.Set set = f371356g;
        synchronized (set) {
            try {
                if (f371357h) {
                    return;
                }
                f371357h = true;
                java.util.Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    i95.w wVar = (i95.w) it.next();
                    boolean[] zArr3 = f371359j;
                    synchronized (zArr3) {
                        z19 = zArr3[0];
                    }
                    if (z19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ServiceManager", "[-] account release was notified, skip notifying account init for rest services.");
                        break;
                    } else if (!wVar.m134975xfd957e9(i95.r.INITIALIZED)) {
                        i95.i0 i0Var = new i95.i0(wVar, th6, z18);
                        if (z18) {
                            arrayList.add(f371353d.submit((java.lang.Runnable) i0Var));
                        } else {
                            i0Var.run();
                        }
                    }
                }
                i95.j0 j0Var = new i95.j0(z18);
                if (z18) {
                    arrayList.add(f371353d.submit((java.lang.Runnable) j0Var));
                } else {
                    j0Var.run();
                }
                if (z18) {
                    l(arrayList, true);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ServiceManager", "[+] initializeAccountForActivatedServices actually executed.");
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object f(java.util.concurrent.Callable r6) {
        /*
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 == 0) goto Lb
            java.lang.Object r6 = r6.call()
            return r6
        Lb:
            i95.m0 r0 = i95.m0.INSTANCE
            java.lang.reflect.Field r0 = r0.f371348d
            java.lang.String r1 = "MicroMsg.ServiceManager"
            if (r0 != 0) goto L1d
            java.lang.String r0 = "[-] Fail to get Looper TLS field at last, invoke action without looper."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r0)
            java.lang.Object r6 = r6.call()
            return r6
        L1d:
            r2 = 0
            java.lang.Object r3 = r0.get(r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.ThreadLocal r3 = (java.lang.ThreadLocal) r3     // Catch: java.lang.Throwable -> L3f
            if (r3 != 0) goto L33
            java.lang.ThreadLocal r4 = new java.lang.ThreadLocal     // Catch: java.lang.Throwable -> L3d
            r4.<init>()     // Catch: java.lang.Throwable -> L3d
            r0.set(r2, r4)     // Catch: java.lang.Throwable -> L30
            r3 = r4
            goto L33
        L30:
            r0 = move-exception
            r3 = r4
            goto L41
        L33:
            i95.k0 r0 = i95.k0.INSTANCE     // Catch: java.lang.Throwable -> L3d
            android.os.Looper r0 = r0.h()     // Catch: java.lang.Throwable -> L3d
            r3.set(r0)     // Catch: java.lang.Throwable -> L3d
            goto L4a
        L3d:
            r0 = move-exception
            goto L41
        L3f:
            r0 = move-exception
            r3 = r2
        L41:
            java.lang.String r4 = "[-] Fail to inject companion Looper."
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L54
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r0, r4, r5)     // Catch: java.lang.Throwable -> L54
            r3 = r2
        L4a:
            java.lang.Object r6 = r6.call()     // Catch: java.lang.Throwable -> L54
            if (r3 == 0) goto L53
            r3.set(r2)
        L53:
            return r6
        L54:
            r6 = move-exception
            if (r3 == 0) goto L5a
            r3.set(r2)
        L5a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i95.n0.f(java.util.concurrent.Callable):java.lang.Object");
    }

    public static boolean g() {
        boolean z17;
        b("isAccountInitialized");
        k95.a[] aVarArr = f371354e;
        synchronized (aVarArr) {
            z17 = false;
            ((com.p314xaae8f345.mm.app.q0) aVarArr[0]).getClass();
            if (gm0.j1.h() && gm0.j1.a()) {
                z17 = true;
            }
        }
        return z17;
    }

    public static boolean h(java.lang.Class cls) {
        boolean z17;
        java.util.Map map = f371368s;
        java.lang.Boolean bool = (java.lang.Boolean) ((java.util.concurrent.ConcurrentHashMap) map).get(cls);
        if (bool == null) {
            java.util.Iterator it = ((fs.c) fs.g.f(cls)).all().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                if (fs.g.e(f371350a, (fs.q) it.next())) {
                    z17 = true;
                    break;
                }
            }
            ((java.util.concurrent.ConcurrentHashMap) map).put(cls, java.lang.Boolean.valueOf(z17));
            bool = java.lang.Boolean.valueOf(z17);
        }
        return bool.booleanValue();
    }

    public static void i() {
        b("calling notifyPreCreateForLegacyComponentServices()");
        java.lang.Iterable all = ((fs.c) fs.g.f(i95.x.class)).all();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = all.iterator();
        while (it.hasNext()) {
            arrayList.add(f371352c.submit((java.lang.Runnable) new i95.h0((fs.q) it.next())));
        }
        l(arrayList, true);
    }

    public static void j(i95.w wVar, i95.w wVar2, i95.r rVar, boolean z17, boolean z18, boolean z19) {
        boolean z27;
        boolean z28;
        boolean z29;
        i95.r rVar2;
        boolean z37;
        android.app.Application application = f371350a;
        i95.y yVar = f371351b;
        java.util.concurrent.ForkJoinPool forkJoinPool = f371352c;
        i95.r rVar3 = i95.r.INACTIVE;
        i95.r rVar4 = i95.r.ACTIVATED;
        if (wVar2.m134979xe0bd59d3(application, yVar, forkJoinPool, wVar, rVar3, rVar4, z18, true, z19)) {
            java.util.Set set = f371356g;
            synchronized (set) {
                set.add(wVar2);
            }
        }
        boolean[] zArr = f371359j;
        synchronized (zArr) {
            z27 = zArr[0];
        }
        if (z27) {
            z28 = false;
        } else if (z18) {
            z28 = g();
        } else {
            synchronized (f371356g) {
                z37 = f371357h;
            }
            z28 = z37;
        }
        if (z28) {
            wVar2.m134979xe0bd59d3(f371350a, f371351b, f371353d, wVar, rVar4, rVar, z18, z17, z19);
            return;
        }
        synchronized (zArr) {
            z29 = zArr[0];
        }
        if (!z29 || rVar == (rVar2 = i95.r.INITIALIZED)) {
            return;
        }
        wVar2.m134979xe0bd59d3(f371350a, f371351b, f371352c, wVar, rVar2, rVar, z18, z17, z19);
    }

    public static void k(boolean z17) {
        b("calling preloadServicesWithAsyncMode()");
        boolean[] zArr = f371358i;
        if (zArr[0]) {
            return;
        }
        synchronized (zArr) {
            if (zArr[0]) {
                return;
            }
            zArr[0] = true;
            i95.y yVar = f371351b;
            j95.a aVar = j95.a.ASYNC;
            yVar.getClass();
            a(new fs.e(((fs.c) fs.g.f(i95.w.class)).all(), new com.p314xaae8f345.mm.app.o0((com.p314xaae8f345.mm.app.p0) yVar, aVar)), i95.r.INITIALIZED, z17, false);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:38:0x0049 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void l(java.util.Collection r3, boolean r4) {
        /*
            if (r4 == 0) goto L2e
            java.util.Iterator r3 = r3.iterator()
        L6:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L62
            java.lang.Object r4 = r3.next()
            java.util.concurrent.Future r4 = (java.util.concurrent.Future) r4
            r4.get()     // Catch: java.lang.Throwable -> L16
            goto L6
        L16:
            r3 = move-exception
            java.lang.Throwable r4 = r3.getCause()
        L1b:
            boolean r0 = r4 instanceof java.util.concurrent.ExecutionException
            if (r0 == 0) goto L2a
            java.lang.Throwable r0 = r4.getCause()
            if (r0 == 0) goto L2a
            java.lang.Throwable r4 = r4.getCause()
            goto L1b
        L2a:
            if (r4 == 0) goto L2d
            r3 = r4
        L2d:
            throw r3
        L2e:
            java.util.Iterator r3 = r3.iterator()
        L32:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L62
            java.lang.Object r4 = r3.next()
            java.util.concurrent.Future r4 = (java.util.concurrent.Future) r4
        L3e:
            r4.get()     // Catch: java.lang.Throwable -> L42
            goto L32
        L42:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L56
        L47:
            boolean r2 = r1 instanceof java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L58
            java.lang.Throwable r2 = r1.getCause()     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L58
            java.lang.Throwable r1 = r1.getCause()     // Catch: java.lang.Throwable -> L56
            goto L47
        L56:
            r0 = move-exception
            goto L5c
        L58:
            if (r1 == 0) goto L5b
            r0 = r1
        L5b:
            throw r0     // Catch: java.lang.Throwable -> L56
        L5c:
            boolean r1 = r0 instanceof java.lang.InterruptedException
            if (r1 == 0) goto L61
            goto L3e
        L61:
            throw r0
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i95.n0.l(java.util.Collection, boolean):void");
    }
}
