package com.p314xaae8f345.mm.app;

/* loaded from: classes11.dex */
public class d0 implements android.content.ServiceConnection {

    /* renamed from: m, reason: collision with root package name */
    public static boolean f134899m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.Object f134900n = new java.lang.Object();

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String f134901o = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ":push";

    /* renamed from: p, reason: collision with root package name */
    public static int f134902p = 0;

    /* renamed from: q, reason: collision with root package name */
    public static int f134903q = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54059x396cc171;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f134904d = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: e, reason: collision with root package name */
    public boolean f134905e = false;

    /* renamed from: f, reason: collision with root package name */
    public android.os.IBinder f134906f = null;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.f0 f134907g = new com.p314xaae8f345.mm.app.f0(this);

    /* renamed from: h, reason: collision with root package name */
    public long f134908h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f134909i = 0;

    public static int b(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreServiceConnection", "getPicByProcessName() processName == null");
            return -1;
        }
        try {
            java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreServiceConnection", "getPicByProcessName() processes == null");
                return -1;
            }
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo.pid;
                }
            }
            return -1;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CoreServiceConnection", "getPidByProcessName() %s %s %s", str, e17.getClass().getSimpleName(), e17.getMessage());
            return -1;
        }
    }

    public static int c(boolean z17) {
        int i17 = f134903q;
        if (z17) {
            int i18 = f134902p + 1;
            f134902p = i18;
            if (i18 == 5 && i17 < 600000) {
                int i19 = i17 + com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059;
                f134903q = i19;
                f134902p = 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreServiceConnection", "ZOMBIE_CHECK_TIME:%s", java.lang.Integer.valueOf(i19));
            }
        }
        return i17;
    }

    public static void d(int i17) {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/app/CoreServiceConnection", "killProcess", "(I)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(obj, "com/tencent/mm/app/CoreServiceConnection", "killProcess", "(I)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CoreServiceConnection", "killProcess %s, %s %s", java.lang.Integer.valueOf(i17), e17.getClass().getSimpleName(), e17.getMessage());
        }
    }

    public static void e() {
        int b17 = b(f134901o);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CoreServiceConnection", "killPushProcess() pid = %s, stack[%s]", java.lang.Integer.valueOf(b17), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        d(b17);
    }

    public void a(android.content.Context context) {
        int[] iArr = nm.a.f419933a;
        gm0.c2.b("bindCore");
        try {
            this.f134904d.lock();
            android.os.IBinder iBinder = this.f134906f;
            boolean z17 = iBinder != null && iBinder.isBinderAlive();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreServiceConnection", "enter bindCore, isBinding: %b, binderAlive: %b", java.lang.Boolean.valueOf(this.f134905e), java.lang.Boolean.valueOf(z17));
            boolean z18 = this.f134905e;
            if (z18 || z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CoreServiceConnection", "bindCore reenter, isBinding: %b, binderAlive: %b, return directly.", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17));
                return;
            }
            this.f134904d.unlock();
            if (com.p314xaae8f345.mm.p642xad8b531f.o.d()) {
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6.class);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreServiceConnection", "prepare dispatcher / bind core service");
                try {
                    if (!context.bindService(intent, this, 1)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CoreServiceConnection", "bindService failed, may be caused by some crashes");
                        return;
                    }
                    try {
                        this.f134904d.lock();
                        this.f134905e = true;
                        this.f134904d.unlock();
                        synchronized (f134900n) {
                            if (!f134899m) {
                                f134899m = true;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreServiceConnection", "ZombieWaker posted.");
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this.f134907g, c(false));
                            }
                        }
                        return;
                    } finally {
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CoreServiceConnection", "CoreServiceConnection bindService Exception:%s", e17.getMessage());
                    return;
                }
            }
            if (!com.p314xaae8f345.mm.p642xad8b531f.n.a(context, "noop", false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreServiceConnection", "ensureServiceInstance return false");
                return;
            }
            try {
                this.f134904d.lock();
                this.f134905e = true;
                this.f134904d.unlock();
                synchronized (f134900n) {
                    if (!f134899m) {
                        f134899m = true;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreServiceConnection", "ZombieWaker posted.");
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this.f134907g, c(false));
                    }
                }
                android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6.class);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreServiceConnection", "prepare dispatcher / bind core service");
                try {
                    if (context.bindService(intent2, this, 1)) {
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CoreServiceConnection", "bindService failed, may be caused by some crashes");
                    try {
                        this.f134904d.lock();
                        this.f134905e = false;
                        this.f134904d.unlock();
                        com.p314xaae8f345.mm.p642xad8b531f.o.g();
                    } finally {
                    }
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CoreServiceConnection", "bindCore() bindService Exception:%S", e18.getMessage());
                }
            } finally {
            }
        } finally {
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(final android.content.ComponentName componentName, final android.os.IBinder iBinder) {
        final long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.f134908h = elapsedRealtime;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CoreServiceConnection", "onServiceConnected:%s", java.lang.Long.valueOf(elapsedRealtime));
        b(f134901o);
        if (!com.p314xaae8f345.mm.p642xad8b531f.o.d()) {
            if (((km0.c) gm0.j1.p().a()).a()) {
                synchronized (f134900n) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreServiceConnection", "remove zombie killer.");
                    com.p314xaae8f345.mm.app.f0 f0Var = this.f134907g;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(f0Var);
                    f0Var.f134947d = 0;
                    f134899m = false;
                }
                try {
                    this.f134904d.lock();
                    this.f134905e = false;
                    this.f134906f = iBinder;
                    this.f134904d.unlock();
                    java.lang.Runnable runnable = new java.lang.Runnable(componentName, iBinder, elapsedRealtime) { // from class: com.tencent.mm.app.d0$$a

                        /* renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ android.os.IBinder f134911e;

                        /* renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ long f134912f;

                        {
                            this.f134911e = iBinder;
                            this.f134912f = elapsedRealtime;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            com.p314xaae8f345.mm.p971x6de15a2e.v uVar;
                            byte[] bArr;
                            com.p314xaae8f345.mm.app.d0 d0Var = com.p314xaae8f345.mm.app.d0.this;
                            android.os.IBinder iBinder2 = this.f134911e;
                            long j17 = this.f134912f;
                            d0Var.getClass();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreServiceConnection", "onServiceConnectedImpl called %s", java.lang.Long.valueOf(j17));
                            int[] iArr = nm.a.f419933a;
                            gm0.c2.b("onServiceConnected");
                            if (iBinder2 == null) {
                                iz5.a.g("WorkerProfile onServiceConnected binder == null", false);
                                z65.c.b("WorkerProfile onServiceConnected binder == null", "it will result in accInfo being null");
                            }
                            int i17 = com.p314xaae8f345.mm.p971x6de15a2e.t.f153667d;
                            byte[] bArr2 = null;
                            if (iBinder2 == null) {
                                uVar = null;
                            } else {
                                android.os.IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.tencent.mm.network.IDispatcher_AIDL");
                                uVar = (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.mm.p971x6de15a2e.v)) ? new com.p314xaae8f345.mm.p971x6de15a2e.u(iBinder2) : (com.p314xaae8f345.mm.p971x6de15a2e.v) queryLocalInterface;
                            }
                            com.p314xaae8f345.mm.p944x882e457a.m2 m2Var = new com.p314xaae8f345.mm.p944x882e457a.m2(uVar);
                            try {
                                uVar.Nd(new com.p314xaae8f345.mm.app.e0(d0Var));
                            } catch (java.lang.Exception e17) {
                                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                            }
                            com.p314xaae8f345.mm.p971x6de15a2e.s[] sVarArr = com.p314xaae8f345.mm.app.i3.f134982a;
                            synchronized (sVarArr) {
                                m2Var.a(com.p314xaae8f345.mm.app.i3.f134985d);
                                sVarArr[0] = m2Var;
                            }
                            gm0.j1.i();
                            gm0.y n17 = gm0.j1.n();
                            n17.getClass();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMKernel.CoreNetwork", "setting up remote dispatcher " + m2Var);
                            n17.f354820a.k(m2Var);
                            m2Var.b(new gm0.q(n17));
                            try {
                                com.p314xaae8f345.mm.p971x6de15a2e.h0 s17 = m2Var.s1();
                                if (s17 != null) {
                                    s17.q5(n17.f354823d);
                                }
                            } catch (android.os.RemoteException e18) {
                                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMKernel.CoreNetwork", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
                            }
                            m2Var.c(new gm0.r(n17));
                            com.p314xaae8f345.mm.p971x6de15a2e.o G = m2Var.G();
                            if (G == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MMKernel.CoreNetwork", "accInfo is null, it would assert before!!!");
                                n17.f354821b.r();
                                n17.f354821b.s();
                            } else {
                                gm0.s sVar = new gm0.s(n17);
                                z65.a[] aVarArr = com.p314xaae8f345.mm.app.i4.f134988c;
                                synchronized (aVarArr) {
                                    aVarArr[0] = sVar;
                                }
                                gm0.j1.i();
                                com.p314xaae8f345.mm.p2621x8fb0427b.j3 j3Var = gm0.j1.u().f354681a;
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setAutoAuth, getSysCfg() is null, stack = ");
                                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
                                iz5.a.g(sb6.toString(), j3Var != null);
                                int c17 = j3Var.c(47, 0);
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
                                m2Var.n1((c17 & 1) == 0);
                                gm0.j1.i();
                                gm0.m b17 = gm0.j1.b();
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
                                if (gm0.j1.a() && gm0.j1.b().f354787q) {
                                    com.p314xaae8f345.mm.p944x882e457a.l2 l2Var = (com.p314xaae8f345.mm.p944x882e457a.l2) G;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKernel.CoreNetwork", "setAutoAuth differrent accStg uin[%d], accInfo uin[%d], acc init[%b]", java.lang.Integer.valueOf(b17.h()), java.lang.Integer.valueOf(l2Var.mo9862xb5887524()), java.lang.Boolean.valueOf(gm0.j1.b().m()));
                                    if (b17.h() != l2Var.mo9862xb5887524()) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMKernel.CoreNetwork", "update acc info with acc stg: uin =" + l2Var.mo9862xb5887524());
                                        java.lang.String str = "setAutoAuth, getConfigStg() is null, stack = " + new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3();
                                        gm0.j1.i();
                                        iz5.a.g(str, gm0.j1.u().c() != null);
                                        gm0.j1.i();
                                        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(2, null);
                                        l2Var.E(new byte[0], new byte[0], new byte[0], b17.h(), 0L);
                                        try {
                                            l2Var.f152216d.mo48332x66bc2758(str2);
                                        } catch (android.os.RemoteException e19) {
                                            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RAccInfo", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e19));
                                        }
                                    }
                                    n17.f354821b.t(m2Var);
                                    com.p314xaae8f345.mm.p971x6de15a2e.n.h(new gm0.u(n17));
                                    com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37953x6c4ebec7(new com.p314xaae8f345.p542x3306d5.cdn.C4448x9e020106());
                                    gm0.x xVar = gm0.x.f354818a;
                                    if (xVar == null) {
                                        synchronized (gm0.x.class) {
                                            if (gm0.x.f354818a == null) {
                                                gm0.x.f354818a = new gm0.x();
                                            }
                                        }
                                        xVar = gm0.x.f354818a;
                                    }
                                    com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37954xda26af9c(xVar);
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMKernel.CoreNetwork", "need to clear acc info and maybe stop networking accHasReady():%b isInitializedNotifyAllDone:%b", java.lang.Boolean.valueOf(gm0.j1.a()), java.lang.Boolean.valueOf(gm0.j1.b().f354787q));
                                    jx3.f fVar = jx3.f.INSTANCE;
                                    fVar.mo68477x336bdfd8(148L, gm0.j1.a() ? 44L : 43L, 1L, false);
                                    com.p314xaae8f345.mm.p944x882e457a.l2 l2Var2 = (com.p314xaae8f345.mm.p944x882e457a.l2) G;
                                    l2Var2.mo9866x6761d4f();
                                    m2Var.mo48028x6761d4f();
                                    n17.f354821b.t(m2Var);
                                    com.p314xaae8f345.mm.p971x6de15a2e.n.h(new gm0.t(n17));
                                    com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37953x6c4ebec7(new com.p314xaae8f345.p542x3306d5.cdn.C4448x9e020106());
                                    gm0.x xVar2 = gm0.x.f354818a;
                                    if (xVar2 == null) {
                                        synchronized (gm0.x.class) {
                                            if (gm0.x.f354818a == null) {
                                                gm0.x.f354818a = new gm0.x();
                                            }
                                        }
                                        xVar2 = gm0.x.f354818a;
                                    }
                                    com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37954xda26af9c(xVar2);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKernel.CoreNetwork", "CronetLogic setCallback init");
                                    if (b17.h() != l2Var2.mo9862xb5887524()) {
                                        fVar.mo68477x336bdfd8(148L, 45L, 1L, false);
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMKernel.CoreNetwork", "summerauth update acc info with acc stg: old acc uin=%d, acc stg uin=%d, acc init %b %b", java.lang.Integer.valueOf(l2Var2.mo9862xb5887524()), java.lang.Integer.valueOf(b17.h()), java.lang.Boolean.valueOf(gm0.j1.b().m()), java.lang.Boolean.valueOf(gm0.j1.b().f354787q));
                                        l2Var2.a(b17.h());
                                    } else {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKernel.CoreNetwork", "acc info uin same with acc stg", java.lang.Integer.valueOf(l2Var2.mo9862xb5887524()), java.lang.Integer.valueOf(b17.h()));
                                    }
                                }
                            }
                            boolean l17 = j62.e.g().l("clicfg_reuse_session", true, true, true);
                            if (l17 && c01.b.b()) {
                                try {
                                    gm0.j1.i();
                                    c01.b bVar = gm0.j1.b().f354776f;
                                    if (bVar != null) {
                                        gm0.j1.i();
                                        if (gm0.j1.n().f354821b.f152297d != null) {
                                            com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af = bVar.f118598a;
                                            if (binderC11173x1cfac0af == null) {
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfoCacheInWorker", "tryReuseToPush but backupAccInfo is null.");
                                            } else {
                                                bVar.c(binderC11173x1cfac0af);
                                            }
                                        }
                                    }
                                    gm0.j1.i();
                                    gm0.j1.i();
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfoCacheInWorker", "tryReuseToPush but object is null [%s, %s]", gm0.j1.b().f354776f, gm0.j1.n().f354821b.f152297d);
                                } catch (java.lang.Throwable th6) {
                                    boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AccInfoCacheInWorker", "tryReuseToPush Exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(th6));
                                }
                            }
                            if (gm0.j1.a()) {
                                gm0.j1.i();
                                if (gm0.j1.n().f354821b != null) {
                                    gm0.j1.i();
                                    if (gm0.j1.n().f354821b.f152297d != null) {
                                        gm0.j1.i();
                                        gm0.j1.n().f354821b.f152297d.C(true);
                                    }
                                }
                            }
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5286xd13c3d86 c5286xd13c3d86 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5286xd13c3d86();
                            c5286xd13c3d86.f135608g.f88932d = l17;
                            com.p314xaae8f345.mm.p971x6de15a2e.o G2 = m2Var.G();
                            if (G2 != null) {
                                com.p314xaae8f345.mm.p944x882e457a.l2 l2Var3 = (com.p314xaae8f345.mm.p944x882e457a.l2) G2;
                                c5286xd13c3d86.f135608g.f88929a = l2Var3.mo9862xb5887524();
                                am.n3 n3Var = c5286xd13c3d86.f135608g;
                                try {
                                    bArr = l2Var3.f152216d.xb();
                                } catch (android.os.RemoteException e27) {
                                    boolean z29 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RAccInfo", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e27));
                                    bArr = null;
                                }
                                n3Var.f88930b = bArr;
                                am.n3 n3Var2 = c5286xd13c3d86.f135608g;
                                try {
                                    bArr2 = l2Var3.f152216d.qh();
                                } catch (android.os.RemoteException e28) {
                                    boolean z37 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RAccInfo", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e28));
                                }
                                n3Var2.f88931c = bArr2;
                            }
                            c5286xd13c3d86.e();
                            gm0.c2.b("onServiceConnected done");
                            d0Var.f134909i = j17;
                        }
                    };
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreServiceConnection", "onServiceConnectedInThreadPool() called");
                    ((ku5.t0) ku5.t0.f394148d).h(runnable, "MicroMsg.CoreServiceConnection");
                    return;
                } finally {
                }
            }
            return;
        }
        if (iBinder == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CoreServiceConnection", "onServiceConnected binder == null");
            return;
        }
        if (((km0.c) gm0.j1.p().a()).a()) {
            synchronized (f134900n) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreServiceConnection", "remove zombie killer.");
                com.p314xaae8f345.mm.app.f0 f0Var2 = this.f134907g;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(f0Var2);
                f0Var2.f134947d = 0;
                f134899m = false;
            }
            try {
                this.f134904d.lock();
                this.f134905e = false;
                android.os.IBinder iBinder2 = this.f134906f;
                if (iBinder2 != null) {
                    if (iBinder2.hashCode() == iBinder.hashCode()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CoreServiceConnection", "onServiceConnected binder == serviceBinder");
                        return;
                    }
                }
                this.f134906f = iBinder;
                this.f134904d.unlock();
                java.lang.Runnable runnable2 = new java.lang.Runnable(componentName, iBinder, elapsedRealtime) { // from class: com.tencent.mm.app.d0$$a

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ android.os.IBinder f134911e;

                    /* renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ long f134912f;

                    {
                        this.f134911e = iBinder;
                        this.f134912f = elapsedRealtime;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.p971x6de15a2e.v uVar;
                        byte[] bArr;
                        com.p314xaae8f345.mm.app.d0 d0Var = com.p314xaae8f345.mm.app.d0.this;
                        android.os.IBinder iBinder22 = this.f134911e;
                        long j17 = this.f134912f;
                        d0Var.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreServiceConnection", "onServiceConnectedImpl called %s", java.lang.Long.valueOf(j17));
                        int[] iArr = nm.a.f419933a;
                        gm0.c2.b("onServiceConnected");
                        if (iBinder22 == null) {
                            iz5.a.g("WorkerProfile onServiceConnected binder == null", false);
                            z65.c.b("WorkerProfile onServiceConnected binder == null", "it will result in accInfo being null");
                        }
                        int i17 = com.p314xaae8f345.mm.p971x6de15a2e.t.f153667d;
                        byte[] bArr2 = null;
                        if (iBinder22 == null) {
                            uVar = null;
                        } else {
                            android.os.IInterface queryLocalInterface = iBinder22.queryLocalInterface("com.tencent.mm.network.IDispatcher_AIDL");
                            uVar = (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.mm.p971x6de15a2e.v)) ? new com.p314xaae8f345.mm.p971x6de15a2e.u(iBinder22) : (com.p314xaae8f345.mm.p971x6de15a2e.v) queryLocalInterface;
                        }
                        com.p314xaae8f345.mm.p944x882e457a.m2 m2Var = new com.p314xaae8f345.mm.p944x882e457a.m2(uVar);
                        try {
                            uVar.Nd(new com.p314xaae8f345.mm.app.e0(d0Var));
                        } catch (java.lang.Exception e17) {
                            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                        }
                        com.p314xaae8f345.mm.p971x6de15a2e.s[] sVarArr = com.p314xaae8f345.mm.app.i3.f134982a;
                        synchronized (sVarArr) {
                            m2Var.a(com.p314xaae8f345.mm.app.i3.f134985d);
                            sVarArr[0] = m2Var;
                        }
                        gm0.j1.i();
                        gm0.y n17 = gm0.j1.n();
                        n17.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMKernel.CoreNetwork", "setting up remote dispatcher " + m2Var);
                        n17.f354820a.k(m2Var);
                        m2Var.b(new gm0.q(n17));
                        try {
                            com.p314xaae8f345.mm.p971x6de15a2e.h0 s17 = m2Var.s1();
                            if (s17 != null) {
                                s17.q5(n17.f354823d);
                            }
                        } catch (android.os.RemoteException e18) {
                            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMKernel.CoreNetwork", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
                        }
                        m2Var.c(new gm0.r(n17));
                        com.p314xaae8f345.mm.p971x6de15a2e.o G = m2Var.G();
                        if (G == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MMKernel.CoreNetwork", "accInfo is null, it would assert before!!!");
                            n17.f354821b.r();
                            n17.f354821b.s();
                        } else {
                            gm0.s sVar = new gm0.s(n17);
                            z65.a[] aVarArr = com.p314xaae8f345.mm.app.i4.f134988c;
                            synchronized (aVarArr) {
                                aVarArr[0] = sVar;
                            }
                            gm0.j1.i();
                            com.p314xaae8f345.mm.p2621x8fb0427b.j3 j3Var = gm0.j1.u().f354681a;
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setAutoAuth, getSysCfg() is null, stack = ");
                            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
                            iz5.a.g(sb6.toString(), j3Var != null);
                            int c17 = j3Var.c(47, 0);
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
                            m2Var.n1((c17 & 1) == 0);
                            gm0.j1.i();
                            gm0.m b17 = gm0.j1.b();
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
                            if (gm0.j1.a() && gm0.j1.b().f354787q) {
                                com.p314xaae8f345.mm.p944x882e457a.l2 l2Var = (com.p314xaae8f345.mm.p944x882e457a.l2) G;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKernel.CoreNetwork", "setAutoAuth differrent accStg uin[%d], accInfo uin[%d], acc init[%b]", java.lang.Integer.valueOf(b17.h()), java.lang.Integer.valueOf(l2Var.mo9862xb5887524()), java.lang.Boolean.valueOf(gm0.j1.b().m()));
                                if (b17.h() != l2Var.mo9862xb5887524()) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMKernel.CoreNetwork", "update acc info with acc stg: uin =" + l2Var.mo9862xb5887524());
                                    java.lang.String str = "setAutoAuth, getConfigStg() is null, stack = " + new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3();
                                    gm0.j1.i();
                                    iz5.a.g(str, gm0.j1.u().c() != null);
                                    gm0.j1.i();
                                    java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(2, null);
                                    l2Var.E(new byte[0], new byte[0], new byte[0], b17.h(), 0L);
                                    try {
                                        l2Var.f152216d.mo48332x66bc2758(str2);
                                    } catch (android.os.RemoteException e19) {
                                        boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RAccInfo", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e19));
                                    }
                                }
                                n17.f354821b.t(m2Var);
                                com.p314xaae8f345.mm.p971x6de15a2e.n.h(new gm0.u(n17));
                                com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37953x6c4ebec7(new com.p314xaae8f345.p542x3306d5.cdn.C4448x9e020106());
                                gm0.x xVar = gm0.x.f354818a;
                                if (xVar == null) {
                                    synchronized (gm0.x.class) {
                                        if (gm0.x.f354818a == null) {
                                            gm0.x.f354818a = new gm0.x();
                                        }
                                    }
                                    xVar = gm0.x.f354818a;
                                }
                                com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37954xda26af9c(xVar);
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMKernel.CoreNetwork", "need to clear acc info and maybe stop networking accHasReady():%b isInitializedNotifyAllDone:%b", java.lang.Boolean.valueOf(gm0.j1.a()), java.lang.Boolean.valueOf(gm0.j1.b().f354787q));
                                jx3.f fVar = jx3.f.INSTANCE;
                                fVar.mo68477x336bdfd8(148L, gm0.j1.a() ? 44L : 43L, 1L, false);
                                com.p314xaae8f345.mm.p944x882e457a.l2 l2Var2 = (com.p314xaae8f345.mm.p944x882e457a.l2) G;
                                l2Var2.mo9866x6761d4f();
                                m2Var.mo48028x6761d4f();
                                n17.f354821b.t(m2Var);
                                com.p314xaae8f345.mm.p971x6de15a2e.n.h(new gm0.t(n17));
                                com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37953x6c4ebec7(new com.p314xaae8f345.p542x3306d5.cdn.C4448x9e020106());
                                gm0.x xVar2 = gm0.x.f354818a;
                                if (xVar2 == null) {
                                    synchronized (gm0.x.class) {
                                        if (gm0.x.f354818a == null) {
                                            gm0.x.f354818a = new gm0.x();
                                        }
                                    }
                                    xVar2 = gm0.x.f354818a;
                                }
                                com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37954xda26af9c(xVar2);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKernel.CoreNetwork", "CronetLogic setCallback init");
                                if (b17.h() != l2Var2.mo9862xb5887524()) {
                                    fVar.mo68477x336bdfd8(148L, 45L, 1L, false);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMKernel.CoreNetwork", "summerauth update acc info with acc stg: old acc uin=%d, acc stg uin=%d, acc init %b %b", java.lang.Integer.valueOf(l2Var2.mo9862xb5887524()), java.lang.Integer.valueOf(b17.h()), java.lang.Boolean.valueOf(gm0.j1.b().m()), java.lang.Boolean.valueOf(gm0.j1.b().f354787q));
                                    l2Var2.a(b17.h());
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKernel.CoreNetwork", "acc info uin same with acc stg", java.lang.Integer.valueOf(l2Var2.mo9862xb5887524()), java.lang.Integer.valueOf(b17.h()));
                                }
                            }
                        }
                        boolean l17 = j62.e.g().l("clicfg_reuse_session", true, true, true);
                        if (l17 && c01.b.b()) {
                            try {
                                gm0.j1.i();
                                c01.b bVar = gm0.j1.b().f354776f;
                                if (bVar != null) {
                                    gm0.j1.i();
                                    if (gm0.j1.n().f354821b.f152297d != null) {
                                        com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af = bVar.f118598a;
                                        if (binderC11173x1cfac0af == null) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfoCacheInWorker", "tryReuseToPush but backupAccInfo is null.");
                                        } else {
                                            bVar.c(binderC11173x1cfac0af);
                                        }
                                    }
                                }
                                gm0.j1.i();
                                gm0.j1.i();
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfoCacheInWorker", "tryReuseToPush but object is null [%s, %s]", gm0.j1.b().f354776f, gm0.j1.n().f354821b.f152297d);
                            } catch (java.lang.Throwable th6) {
                                boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AccInfoCacheInWorker", "tryReuseToPush Exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(th6));
                            }
                        }
                        if (gm0.j1.a()) {
                            gm0.j1.i();
                            if (gm0.j1.n().f354821b != null) {
                                gm0.j1.i();
                                if (gm0.j1.n().f354821b.f152297d != null) {
                                    gm0.j1.i();
                                    gm0.j1.n().f354821b.f152297d.C(true);
                                }
                            }
                        }
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5286xd13c3d86 c5286xd13c3d86 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5286xd13c3d86();
                        c5286xd13c3d86.f135608g.f88932d = l17;
                        com.p314xaae8f345.mm.p971x6de15a2e.o G2 = m2Var.G();
                        if (G2 != null) {
                            com.p314xaae8f345.mm.p944x882e457a.l2 l2Var3 = (com.p314xaae8f345.mm.p944x882e457a.l2) G2;
                            c5286xd13c3d86.f135608g.f88929a = l2Var3.mo9862xb5887524();
                            am.n3 n3Var = c5286xd13c3d86.f135608g;
                            try {
                                bArr = l2Var3.f152216d.xb();
                            } catch (android.os.RemoteException e27) {
                                boolean z29 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RAccInfo", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e27));
                                bArr = null;
                            }
                            n3Var.f88930b = bArr;
                            am.n3 n3Var2 = c5286xd13c3d86.f135608g;
                            try {
                                bArr2 = l2Var3.f152216d.qh();
                            } catch (android.os.RemoteException e28) {
                                boolean z37 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RAccInfo", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e28));
                            }
                            n3Var2.f88931c = bArr2;
                        }
                        c5286xd13c3d86.e();
                        gm0.c2.b("onServiceConnected done");
                        d0Var.f134909i = j17;
                    }
                };
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreServiceConnection", "onServiceConnectedInThreadPool() called");
                ((ku5.t0) ku5.t0.f394148d).h(runnable2, "MicroMsg.CoreServiceConnection");
            } finally {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(final android.content.ComponentName componentName) {
        final long j17 = this.f134908h;
        if (((km0.c) gm0.j1.p().a()).a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CoreServiceConnection", "onServiceDisconnected connectTime:%s", java.lang.Long.valueOf(j17));
            try {
                this.f134904d.lock();
                this.f134905e = false;
                this.f134906f = null;
                this.f134904d.unlock();
                ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable(componentName, j17) { // from class: com.tencent.mm.app.d0$$b

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ long f134914e;

                    {
                        this.f134914e = j17;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.app.d0 d0Var = com.p314xaae8f345.mm.app.d0.this;
                        d0Var.getClass();
                        long j18 = this.f134914e;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreServiceConnection", "onServiceDisconnectedImpl() called with connectTime=%s", java.lang.Long.valueOf(j18));
                        long j19 = d0Var.f134909i;
                        boolean z17 = true;
                        boolean z18 = j18 < j19;
                        android.os.IBinder iBinder = d0Var.f134906f;
                        boolean z19 = iBinder != null && iBinder.isBinderAlive();
                        if (!z19 && !d0Var.f134905e) {
                            z17 = false;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreServiceConnection", "tryReportDisconnect() connectTime:%s lastConnectImplTime:%s isDisconnectTimeError:%s isError:%s", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17));
                        if (z17 && z19 && z18) {
                            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c c6423x452b9f7c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c();
                            c6423x452b9f7c.f137646e = 2878L;
                            c6423x452b9f7c.f137650i = z17 ? 1L : 0L;
                            c6423x452b9f7c.f137651j = z19 ? 1L : 0L;
                            c6423x452b9f7c.f137652k = d0Var.f134905e ? 1L : 0L;
                            c6423x452b9f7c.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
                            c6423x452b9f7c.s(z18 ? "1" : "0");
                            c6423x452b9f7c.t("1");
                            c6423x452b9f7c.o();
                            c6423x452b9f7c.k();
                        }
                        if (!gm0.j1.b().n() || gm0.m.r()) {
                            gm0.j1.i();
                            gm0.j1.n().f354821b.s();
                            gm0.j1.i();
                            gm0.j1.n().f354821b.r();
                            return;
                        }
                        gm0.j1.i();
                        gm0.j1.n().f354821b.f();
                        gm0.j1.i();
                        gm0.j1.n().f354821b.s();
                        d0Var.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                    }
                }, "MicroMsg.CoreServiceConnection");
            } catch (java.lang.Throwable th6) {
                this.f134904d.unlock();
                throw th6;
            }
        }
    }
}
