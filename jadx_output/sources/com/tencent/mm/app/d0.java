package com.tencent.mm.app;

/* loaded from: classes11.dex */
public class d0 implements android.content.ServiceConnection {

    /* renamed from: m, reason: collision with root package name */
    public static boolean f53366m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.Object f53367n = new java.lang.Object();

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String f53368o = com.tencent.mm.sdk.platformtools.x2.f193072b + ":push";

    /* renamed from: p, reason: collision with root package name */
    public static int f53369p = 0;

    /* renamed from: q, reason: collision with root package name */
    public static int f53370q = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ILLEGAL;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f53371d = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: e, reason: collision with root package name */
    public boolean f53372e = false;

    /* renamed from: f, reason: collision with root package name */
    public android.os.IBinder f53373f = null;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.app.f0 f53374g = new com.tencent.mm.app.f0(this);

    /* renamed from: h, reason: collision with root package name */
    public long f53375h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f53376i = 0;

    public static int b(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceConnection", "getPicByProcessName() processName == null");
            return -1;
        }
        try {
            java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceConnection", "getPicByProcessName() processes == null");
                return -1;
            }
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo.pid;
                }
            }
            return -1;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CoreServiceConnection", "getPidByProcessName() %s %s %s", str, e17.getClass().getSimpleName(), e17.getMessage());
            return -1;
        }
    }

    public static int c(boolean z17) {
        int i17 = f53370q;
        if (z17) {
            int i18 = f53369p + 1;
            f53369p = i18;
            if (i18 == 5 && i17 < 600000) {
                int i19 = i17 + com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL;
                f53370q = i19;
                f53369p = 0;
                com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceConnection", "ZOMBIE_CHECK_TIME:%s", java.lang.Integer.valueOf(i19));
            }
        }
        return i17;
    }

    public static void d(int i17) {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/app/CoreServiceConnection", "killProcess", "(I)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(obj, "com/tencent/mm/app/CoreServiceConnection", "killProcess", "(I)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CoreServiceConnection", "killProcess %s, %s %s", java.lang.Integer.valueOf(i17), e17.getClass().getSimpleName(), e17.getMessage());
        }
    }

    public static void e() {
        int b17 = b(f53368o);
        com.tencent.mars.xlog.Log.e("MicroMsg.CoreServiceConnection", "killPushProcess() pid = %s, stack[%s]", java.lang.Integer.valueOf(b17), new com.tencent.mm.sdk.platformtools.z3());
        d(b17);
    }

    public void a(android.content.Context context) {
        int[] iArr = nm.a.f338400a;
        gm0.c2.b("bindCore");
        try {
            this.f53371d.lock();
            android.os.IBinder iBinder = this.f53373f;
            boolean z17 = iBinder != null && iBinder.isBinderAlive();
            com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceConnection", "enter bindCore, isBinding: %b, binderAlive: %b", java.lang.Boolean.valueOf(this.f53372e), java.lang.Boolean.valueOf(z17));
            boolean z18 = this.f53372e;
            if (z18 || z17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.CoreServiceConnection", "bindCore reenter, isBinding: %b, binderAlive: %b, return directly.", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17));
                return;
            }
            this.f53371d.unlock();
            if (com.tencent.mm.booter.o.d()) {
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.booter.CoreService.class);
                com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceConnection", "prepare dispatcher / bind core service");
                try {
                    if (!context.bindService(intent, this, 1)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.CoreServiceConnection", "bindService failed, may be caused by some crashes");
                        return;
                    }
                    try {
                        this.f53371d.lock();
                        this.f53372e = true;
                        this.f53371d.unlock();
                        synchronized (f53367n) {
                            if (!f53366m) {
                                f53366m = true;
                                com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceConnection", "ZombieWaker posted.");
                                com.tencent.mm.sdk.platformtools.u3.i(this.f53374g, c(false));
                            }
                        }
                        return;
                    } finally {
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.CoreServiceConnection", "CoreServiceConnection bindService Exception:%s", e17.getMessage());
                    return;
                }
            }
            if (!com.tencent.mm.booter.n.a(context, "noop", false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceConnection", "ensureServiceInstance return false");
                return;
            }
            try {
                this.f53371d.lock();
                this.f53372e = true;
                this.f53371d.unlock();
                synchronized (f53367n) {
                    if (!f53366m) {
                        f53366m = true;
                        com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceConnection", "ZombieWaker posted.");
                        com.tencent.mm.sdk.platformtools.u3.i(this.f53374g, c(false));
                    }
                }
                android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.booter.CoreService.class);
                com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceConnection", "prepare dispatcher / bind core service");
                try {
                    if (context.bindService(intent2, this, 1)) {
                        return;
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.CoreServiceConnection", "bindService failed, may be caused by some crashes");
                    try {
                        this.f53371d.lock();
                        this.f53372e = false;
                        this.f53371d.unlock();
                        com.tencent.mm.booter.o.g();
                    } finally {
                    }
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.CoreServiceConnection", "bindCore() bindService Exception:%S", e18.getMessage());
                }
            } finally {
            }
        } finally {
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(final android.content.ComponentName componentName, final android.os.IBinder iBinder) {
        final long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.f53375h = elapsedRealtime;
        com.tencent.mars.xlog.Log.w("MicroMsg.CoreServiceConnection", "onServiceConnected:%s", java.lang.Long.valueOf(elapsedRealtime));
        b(f53368o);
        if (!com.tencent.mm.booter.o.d()) {
            if (((km0.c) gm0.j1.p().a()).a()) {
                synchronized (f53367n) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceConnection", "remove zombie killer.");
                    com.tencent.mm.app.f0 f0Var = this.f53374g;
                    com.tencent.mm.sdk.platformtools.u3.l(f0Var);
                    f0Var.f53414d = 0;
                    f53366m = false;
                }
                try {
                    this.f53371d.lock();
                    this.f53372e = false;
                    this.f53373f = iBinder;
                    this.f53371d.unlock();
                    java.lang.Runnable runnable = new java.lang.Runnable(componentName, iBinder, elapsedRealtime) { // from class: com.tencent.mm.app.d0$$a

                        /* renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ android.os.IBinder f53378e;

                        /* renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ long f53379f;

                        {
                            this.f53378e = iBinder;
                            this.f53379f = elapsedRealtime;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            com.tencent.mm.network.v uVar;
                            byte[] bArr;
                            com.tencent.mm.app.d0 d0Var = com.tencent.mm.app.d0.this;
                            android.os.IBinder iBinder2 = this.f53378e;
                            long j17 = this.f53379f;
                            d0Var.getClass();
                            com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceConnection", "onServiceConnectedImpl called %s", java.lang.Long.valueOf(j17));
                            int[] iArr = nm.a.f338400a;
                            gm0.c2.b("onServiceConnected");
                            if (iBinder2 == null) {
                                iz5.a.g("WorkerProfile onServiceConnected binder == null", false);
                                z65.c.b("WorkerProfile onServiceConnected binder == null", "it will result in accInfo being null");
                            }
                            int i17 = com.tencent.mm.network.t.f72134d;
                            byte[] bArr2 = null;
                            if (iBinder2 == null) {
                                uVar = null;
                            } else {
                                android.os.IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.tencent.mm.network.IDispatcher_AIDL");
                                uVar = (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.mm.network.v)) ? new com.tencent.mm.network.u(iBinder2) : (com.tencent.mm.network.v) queryLocalInterface;
                            }
                            com.tencent.mm.modelbase.m2 m2Var = new com.tencent.mm.modelbase.m2(uVar);
                            try {
                                uVar.Nd(new com.tencent.mm.app.e0(d0Var));
                            } catch (java.lang.Exception e17) {
                                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                            }
                            com.tencent.mm.network.s[] sVarArr = com.tencent.mm.app.i3.f53449a;
                            synchronized (sVarArr) {
                                m2Var.a(com.tencent.mm.app.i3.f53452d);
                                sVarArr[0] = m2Var;
                            }
                            gm0.j1.i();
                            gm0.y n17 = gm0.j1.n();
                            n17.getClass();
                            com.tencent.mars.xlog.Log.w("MMKernel.CoreNetwork", "setting up remote dispatcher " + m2Var);
                            n17.f273287a.k(m2Var);
                            m2Var.b(new gm0.q(n17));
                            try {
                                com.tencent.mm.network.h0 s17 = m2Var.s1();
                                if (s17 != null) {
                                    s17.q5(n17.f273290d);
                                }
                            } catch (android.os.RemoteException e18) {
                                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                com.tencent.mars.xlog.Log.e("MMKernel.CoreNetwork", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
                            }
                            m2Var.c(new gm0.r(n17));
                            com.tencent.mm.network.o G = m2Var.G();
                            if (G == null) {
                                com.tencent.mars.xlog.Log.f("MMKernel.CoreNetwork", "accInfo is null, it would assert before!!!");
                                n17.f273288b.r();
                                n17.f273288b.s();
                            } else {
                                gm0.s sVar = new gm0.s(n17);
                                z65.a[] aVarArr = com.tencent.mm.app.i4.f53455c;
                                synchronized (aVarArr) {
                                    aVarArr[0] = sVar;
                                }
                                gm0.j1.i();
                                com.tencent.mm.storage.j3 j3Var = gm0.j1.u().f273148a;
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setAutoAuth, getSysCfg() is null, stack = ");
                                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                sb6.append(new com.tencent.mm.sdk.platformtools.z3());
                                iz5.a.g(sb6.toString(), j3Var != null);
                                int c17 = j3Var.c(47, 0);
                                com.tencent.mm.sdk.platformtools.z3.b(true);
                                m2Var.n1((c17 & 1) == 0);
                                gm0.j1.i();
                                gm0.m b17 = gm0.j1.b();
                                com.tencent.mm.sdk.platformtools.z3.b(true);
                                if (gm0.j1.a() && gm0.j1.b().f273254q) {
                                    com.tencent.mm.modelbase.l2 l2Var = (com.tencent.mm.modelbase.l2) G;
                                    com.tencent.mars.xlog.Log.i("MMKernel.CoreNetwork", "setAutoAuth differrent accStg uin[%d], accInfo uin[%d], acc init[%b]", java.lang.Integer.valueOf(b17.h()), java.lang.Integer.valueOf(l2Var.getUin()), java.lang.Boolean.valueOf(gm0.j1.b().m()));
                                    if (b17.h() != l2Var.getUin()) {
                                        com.tencent.mars.xlog.Log.w("MMKernel.CoreNetwork", "update acc info with acc stg: uin =" + l2Var.getUin());
                                        java.lang.String str = "setAutoAuth, getConfigStg() is null, stack = " + new com.tencent.mm.sdk.platformtools.z3();
                                        gm0.j1.i();
                                        iz5.a.g(str, gm0.j1.u().c() != null);
                                        gm0.j1.i();
                                        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(2, null);
                                        l2Var.E(new byte[0], new byte[0], new byte[0], b17.h(), 0L);
                                        try {
                                            l2Var.f70683d.setUsername(str2);
                                        } catch (android.os.RemoteException e19) {
                                            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                            com.tencent.mars.xlog.Log.e("MicroMsg.RAccInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e19));
                                        }
                                    }
                                    n17.f273288b.t(m2Var);
                                    com.tencent.mm.network.n.h(new gm0.u(n17));
                                    com.tencent.mars.cdn.CronetLogic.setCallback(new com.tencent.mars.cdn.CronetLogicCallBack());
                                    gm0.x xVar = gm0.x.f273285a;
                                    if (xVar == null) {
                                        synchronized (gm0.x.class) {
                                            if (gm0.x.f273285a == null) {
                                                gm0.x.f273285a = new gm0.x();
                                            }
                                        }
                                        xVar = gm0.x.f273285a;
                                    }
                                    com.tencent.mars.cdn.CronetLogic.setGetHostImpl(xVar);
                                } else {
                                    com.tencent.mars.xlog.Log.w("MMKernel.CoreNetwork", "need to clear acc info and maybe stop networking accHasReady():%b isInitializedNotifyAllDone:%b", java.lang.Boolean.valueOf(gm0.j1.a()), java.lang.Boolean.valueOf(gm0.j1.b().f273254q));
                                    jx3.f fVar = jx3.f.INSTANCE;
                                    fVar.idkeyStat(148L, gm0.j1.a() ? 44L : 43L, 1L, false);
                                    com.tencent.mm.modelbase.l2 l2Var2 = (com.tencent.mm.modelbase.l2) G;
                                    l2Var2.reset();
                                    m2Var.reset();
                                    n17.f273288b.t(m2Var);
                                    com.tencent.mm.network.n.h(new gm0.t(n17));
                                    com.tencent.mars.cdn.CronetLogic.setCallback(new com.tencent.mars.cdn.CronetLogicCallBack());
                                    gm0.x xVar2 = gm0.x.f273285a;
                                    if (xVar2 == null) {
                                        synchronized (gm0.x.class) {
                                            if (gm0.x.f273285a == null) {
                                                gm0.x.f273285a = new gm0.x();
                                            }
                                        }
                                        xVar2 = gm0.x.f273285a;
                                    }
                                    com.tencent.mars.cdn.CronetLogic.setGetHostImpl(xVar2);
                                    com.tencent.mars.xlog.Log.i("MMKernel.CoreNetwork", "CronetLogic setCallback init");
                                    if (b17.h() != l2Var2.getUin()) {
                                        fVar.idkeyStat(148L, 45L, 1L, false);
                                        com.tencent.mars.xlog.Log.w("MMKernel.CoreNetwork", "summerauth update acc info with acc stg: old acc uin=%d, acc stg uin=%d, acc init %b %b", java.lang.Integer.valueOf(l2Var2.getUin()), java.lang.Integer.valueOf(b17.h()), java.lang.Boolean.valueOf(gm0.j1.b().m()), java.lang.Boolean.valueOf(gm0.j1.b().f273254q));
                                        l2Var2.a(b17.h());
                                    } else {
                                        com.tencent.mars.xlog.Log.i("MMKernel.CoreNetwork", "acc info uin same with acc stg", java.lang.Integer.valueOf(l2Var2.getUin()), java.lang.Integer.valueOf(b17.h()));
                                    }
                                }
                            }
                            boolean l17 = j62.e.g().l("clicfg_reuse_session", true, true, true);
                            if (l17 && c01.b.b()) {
                                try {
                                    gm0.j1.i();
                                    c01.b bVar = gm0.j1.b().f273243f;
                                    if (bVar != null) {
                                        gm0.j1.i();
                                        if (gm0.j1.n().f273288b.f70764d != null) {
                                            com.tencent.mm.network.AccInfo accInfo = bVar.f37065a;
                                            if (accInfo == null) {
                                                com.tencent.mars.xlog.Log.i("MicroMsg.AccInfoCacheInWorker", "tryReuseToPush but backupAccInfo is null.");
                                            } else {
                                                bVar.c(accInfo);
                                            }
                                        }
                                    }
                                    gm0.j1.i();
                                    gm0.j1.i();
                                    com.tencent.mars.xlog.Log.i("MicroMsg.AccInfoCacheInWorker", "tryReuseToPush but object is null [%s, %s]", gm0.j1.b().f273243f, gm0.j1.n().f273288b.f70764d);
                                } catch (java.lang.Throwable th6) {
                                    boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                    com.tencent.mars.xlog.Log.e("MicroMsg.AccInfoCacheInWorker", "tryReuseToPush Exception:%s", com.tencent.mm.sdk.platformtools.z3.c(th6));
                                }
                            }
                            if (gm0.j1.a()) {
                                gm0.j1.i();
                                if (gm0.j1.n().f273288b != null) {
                                    gm0.j1.i();
                                    if (gm0.j1.n().f273288b.f70764d != null) {
                                        gm0.j1.i();
                                        gm0.j1.n().f273288b.f70764d.C(true);
                                    }
                                }
                            }
                            com.tencent.mm.autogen.events.CoreNetworkReadyEvent coreNetworkReadyEvent = new com.tencent.mm.autogen.events.CoreNetworkReadyEvent();
                            coreNetworkReadyEvent.f54075g.f7399d = l17;
                            com.tencent.mm.network.o G2 = m2Var.G();
                            if (G2 != null) {
                                com.tencent.mm.modelbase.l2 l2Var3 = (com.tencent.mm.modelbase.l2) G2;
                                coreNetworkReadyEvent.f54075g.f7396a = l2Var3.getUin();
                                am.n3 n3Var = coreNetworkReadyEvent.f54075g;
                                try {
                                    bArr = l2Var3.f70683d.xb();
                                } catch (android.os.RemoteException e27) {
                                    boolean z29 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                    com.tencent.mars.xlog.Log.e("MicroMsg.RAccInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e27));
                                    bArr = null;
                                }
                                n3Var.f7397b = bArr;
                                am.n3 n3Var2 = coreNetworkReadyEvent.f54075g;
                                try {
                                    bArr2 = l2Var3.f70683d.qh();
                                } catch (android.os.RemoteException e28) {
                                    boolean z37 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                    com.tencent.mars.xlog.Log.e("MicroMsg.RAccInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e28));
                                }
                                n3Var2.f7398c = bArr2;
                            }
                            coreNetworkReadyEvent.e();
                            gm0.c2.b("onServiceConnected done");
                            d0Var.f53376i = j17;
                        }
                    };
                    com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceConnection", "onServiceConnectedInThreadPool() called");
                    ((ku5.t0) ku5.t0.f312615d).h(runnable, "MicroMsg.CoreServiceConnection");
                    return;
                } finally {
                }
            }
            return;
        }
        if (iBinder == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CoreServiceConnection", "onServiceConnected binder == null");
            return;
        }
        if (((km0.c) gm0.j1.p().a()).a()) {
            synchronized (f53367n) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceConnection", "remove zombie killer.");
                com.tencent.mm.app.f0 f0Var2 = this.f53374g;
                com.tencent.mm.sdk.platformtools.u3.l(f0Var2);
                f0Var2.f53414d = 0;
                f53366m = false;
            }
            try {
                this.f53371d.lock();
                this.f53372e = false;
                android.os.IBinder iBinder2 = this.f53373f;
                if (iBinder2 != null) {
                    if (iBinder2.hashCode() == iBinder.hashCode()) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.CoreServiceConnection", "onServiceConnected binder == serviceBinder");
                        return;
                    }
                }
                this.f53373f = iBinder;
                this.f53371d.unlock();
                java.lang.Runnable runnable2 = new java.lang.Runnable(componentName, iBinder, elapsedRealtime) { // from class: com.tencent.mm.app.d0$$a

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ android.os.IBinder f53378e;

                    /* renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ long f53379f;

                    {
                        this.f53378e = iBinder;
                        this.f53379f = elapsedRealtime;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.network.v uVar;
                        byte[] bArr;
                        com.tencent.mm.app.d0 d0Var = com.tencent.mm.app.d0.this;
                        android.os.IBinder iBinder22 = this.f53378e;
                        long j17 = this.f53379f;
                        d0Var.getClass();
                        com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceConnection", "onServiceConnectedImpl called %s", java.lang.Long.valueOf(j17));
                        int[] iArr = nm.a.f338400a;
                        gm0.c2.b("onServiceConnected");
                        if (iBinder22 == null) {
                            iz5.a.g("WorkerProfile onServiceConnected binder == null", false);
                            z65.c.b("WorkerProfile onServiceConnected binder == null", "it will result in accInfo being null");
                        }
                        int i17 = com.tencent.mm.network.t.f72134d;
                        byte[] bArr2 = null;
                        if (iBinder22 == null) {
                            uVar = null;
                        } else {
                            android.os.IInterface queryLocalInterface = iBinder22.queryLocalInterface("com.tencent.mm.network.IDispatcher_AIDL");
                            uVar = (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.mm.network.v)) ? new com.tencent.mm.network.u(iBinder22) : (com.tencent.mm.network.v) queryLocalInterface;
                        }
                        com.tencent.mm.modelbase.m2 m2Var = new com.tencent.mm.modelbase.m2(uVar);
                        try {
                            uVar.Nd(new com.tencent.mm.app.e0(d0Var));
                        } catch (java.lang.Exception e17) {
                            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                        }
                        com.tencent.mm.network.s[] sVarArr = com.tencent.mm.app.i3.f53449a;
                        synchronized (sVarArr) {
                            m2Var.a(com.tencent.mm.app.i3.f53452d);
                            sVarArr[0] = m2Var;
                        }
                        gm0.j1.i();
                        gm0.y n17 = gm0.j1.n();
                        n17.getClass();
                        com.tencent.mars.xlog.Log.w("MMKernel.CoreNetwork", "setting up remote dispatcher " + m2Var);
                        n17.f273287a.k(m2Var);
                        m2Var.b(new gm0.q(n17));
                        try {
                            com.tencent.mm.network.h0 s17 = m2Var.s1();
                            if (s17 != null) {
                                s17.q5(n17.f273290d);
                            }
                        } catch (android.os.RemoteException e18) {
                            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            com.tencent.mars.xlog.Log.e("MMKernel.CoreNetwork", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
                        }
                        m2Var.c(new gm0.r(n17));
                        com.tencent.mm.network.o G = m2Var.G();
                        if (G == null) {
                            com.tencent.mars.xlog.Log.f("MMKernel.CoreNetwork", "accInfo is null, it would assert before!!!");
                            n17.f273288b.r();
                            n17.f273288b.s();
                        } else {
                            gm0.s sVar = new gm0.s(n17);
                            z65.a[] aVarArr = com.tencent.mm.app.i4.f53455c;
                            synchronized (aVarArr) {
                                aVarArr[0] = sVar;
                            }
                            gm0.j1.i();
                            com.tencent.mm.storage.j3 j3Var = gm0.j1.u().f273148a;
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setAutoAuth, getSysCfg() is null, stack = ");
                            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            sb6.append(new com.tencent.mm.sdk.platformtools.z3());
                            iz5.a.g(sb6.toString(), j3Var != null);
                            int c17 = j3Var.c(47, 0);
                            com.tencent.mm.sdk.platformtools.z3.b(true);
                            m2Var.n1((c17 & 1) == 0);
                            gm0.j1.i();
                            gm0.m b17 = gm0.j1.b();
                            com.tencent.mm.sdk.platformtools.z3.b(true);
                            if (gm0.j1.a() && gm0.j1.b().f273254q) {
                                com.tencent.mm.modelbase.l2 l2Var = (com.tencent.mm.modelbase.l2) G;
                                com.tencent.mars.xlog.Log.i("MMKernel.CoreNetwork", "setAutoAuth differrent accStg uin[%d], accInfo uin[%d], acc init[%b]", java.lang.Integer.valueOf(b17.h()), java.lang.Integer.valueOf(l2Var.getUin()), java.lang.Boolean.valueOf(gm0.j1.b().m()));
                                if (b17.h() != l2Var.getUin()) {
                                    com.tencent.mars.xlog.Log.w("MMKernel.CoreNetwork", "update acc info with acc stg: uin =" + l2Var.getUin());
                                    java.lang.String str = "setAutoAuth, getConfigStg() is null, stack = " + new com.tencent.mm.sdk.platformtools.z3();
                                    gm0.j1.i();
                                    iz5.a.g(str, gm0.j1.u().c() != null);
                                    gm0.j1.i();
                                    java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(2, null);
                                    l2Var.E(new byte[0], new byte[0], new byte[0], b17.h(), 0L);
                                    try {
                                        l2Var.f70683d.setUsername(str2);
                                    } catch (android.os.RemoteException e19) {
                                        boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                        com.tencent.mars.xlog.Log.e("MicroMsg.RAccInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e19));
                                    }
                                }
                                n17.f273288b.t(m2Var);
                                com.tencent.mm.network.n.h(new gm0.u(n17));
                                com.tencent.mars.cdn.CronetLogic.setCallback(new com.tencent.mars.cdn.CronetLogicCallBack());
                                gm0.x xVar = gm0.x.f273285a;
                                if (xVar == null) {
                                    synchronized (gm0.x.class) {
                                        if (gm0.x.f273285a == null) {
                                            gm0.x.f273285a = new gm0.x();
                                        }
                                    }
                                    xVar = gm0.x.f273285a;
                                }
                                com.tencent.mars.cdn.CronetLogic.setGetHostImpl(xVar);
                            } else {
                                com.tencent.mars.xlog.Log.w("MMKernel.CoreNetwork", "need to clear acc info and maybe stop networking accHasReady():%b isInitializedNotifyAllDone:%b", java.lang.Boolean.valueOf(gm0.j1.a()), java.lang.Boolean.valueOf(gm0.j1.b().f273254q));
                                jx3.f fVar = jx3.f.INSTANCE;
                                fVar.idkeyStat(148L, gm0.j1.a() ? 44L : 43L, 1L, false);
                                com.tencent.mm.modelbase.l2 l2Var2 = (com.tencent.mm.modelbase.l2) G;
                                l2Var2.reset();
                                m2Var.reset();
                                n17.f273288b.t(m2Var);
                                com.tencent.mm.network.n.h(new gm0.t(n17));
                                com.tencent.mars.cdn.CronetLogic.setCallback(new com.tencent.mars.cdn.CronetLogicCallBack());
                                gm0.x xVar2 = gm0.x.f273285a;
                                if (xVar2 == null) {
                                    synchronized (gm0.x.class) {
                                        if (gm0.x.f273285a == null) {
                                            gm0.x.f273285a = new gm0.x();
                                        }
                                    }
                                    xVar2 = gm0.x.f273285a;
                                }
                                com.tencent.mars.cdn.CronetLogic.setGetHostImpl(xVar2);
                                com.tencent.mars.xlog.Log.i("MMKernel.CoreNetwork", "CronetLogic setCallback init");
                                if (b17.h() != l2Var2.getUin()) {
                                    fVar.idkeyStat(148L, 45L, 1L, false);
                                    com.tencent.mars.xlog.Log.w("MMKernel.CoreNetwork", "summerauth update acc info with acc stg: old acc uin=%d, acc stg uin=%d, acc init %b %b", java.lang.Integer.valueOf(l2Var2.getUin()), java.lang.Integer.valueOf(b17.h()), java.lang.Boolean.valueOf(gm0.j1.b().m()), java.lang.Boolean.valueOf(gm0.j1.b().f273254q));
                                    l2Var2.a(b17.h());
                                } else {
                                    com.tencent.mars.xlog.Log.i("MMKernel.CoreNetwork", "acc info uin same with acc stg", java.lang.Integer.valueOf(l2Var2.getUin()), java.lang.Integer.valueOf(b17.h()));
                                }
                            }
                        }
                        boolean l17 = j62.e.g().l("clicfg_reuse_session", true, true, true);
                        if (l17 && c01.b.b()) {
                            try {
                                gm0.j1.i();
                                c01.b bVar = gm0.j1.b().f273243f;
                                if (bVar != null) {
                                    gm0.j1.i();
                                    if (gm0.j1.n().f273288b.f70764d != null) {
                                        com.tencent.mm.network.AccInfo accInfo = bVar.f37065a;
                                        if (accInfo == null) {
                                            com.tencent.mars.xlog.Log.i("MicroMsg.AccInfoCacheInWorker", "tryReuseToPush but backupAccInfo is null.");
                                        } else {
                                            bVar.c(accInfo);
                                        }
                                    }
                                }
                                gm0.j1.i();
                                gm0.j1.i();
                                com.tencent.mars.xlog.Log.i("MicroMsg.AccInfoCacheInWorker", "tryReuseToPush but object is null [%s, %s]", gm0.j1.b().f273243f, gm0.j1.n().f273288b.f70764d);
                            } catch (java.lang.Throwable th6) {
                                boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                com.tencent.mars.xlog.Log.e("MicroMsg.AccInfoCacheInWorker", "tryReuseToPush Exception:%s", com.tencent.mm.sdk.platformtools.z3.c(th6));
                            }
                        }
                        if (gm0.j1.a()) {
                            gm0.j1.i();
                            if (gm0.j1.n().f273288b != null) {
                                gm0.j1.i();
                                if (gm0.j1.n().f273288b.f70764d != null) {
                                    gm0.j1.i();
                                    gm0.j1.n().f273288b.f70764d.C(true);
                                }
                            }
                        }
                        com.tencent.mm.autogen.events.CoreNetworkReadyEvent coreNetworkReadyEvent = new com.tencent.mm.autogen.events.CoreNetworkReadyEvent();
                        coreNetworkReadyEvent.f54075g.f7399d = l17;
                        com.tencent.mm.network.o G2 = m2Var.G();
                        if (G2 != null) {
                            com.tencent.mm.modelbase.l2 l2Var3 = (com.tencent.mm.modelbase.l2) G2;
                            coreNetworkReadyEvent.f54075g.f7396a = l2Var3.getUin();
                            am.n3 n3Var = coreNetworkReadyEvent.f54075g;
                            try {
                                bArr = l2Var3.f70683d.xb();
                            } catch (android.os.RemoteException e27) {
                                boolean z29 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                com.tencent.mars.xlog.Log.e("MicroMsg.RAccInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e27));
                                bArr = null;
                            }
                            n3Var.f7397b = bArr;
                            am.n3 n3Var2 = coreNetworkReadyEvent.f54075g;
                            try {
                                bArr2 = l2Var3.f70683d.qh();
                            } catch (android.os.RemoteException e28) {
                                boolean z37 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                com.tencent.mars.xlog.Log.e("MicroMsg.RAccInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e28));
                            }
                            n3Var2.f7398c = bArr2;
                        }
                        coreNetworkReadyEvent.e();
                        gm0.c2.b("onServiceConnected done");
                        d0Var.f53376i = j17;
                    }
                };
                com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceConnection", "onServiceConnectedInThreadPool() called");
                ((ku5.t0) ku5.t0.f312615d).h(runnable2, "MicroMsg.CoreServiceConnection");
            } finally {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(final android.content.ComponentName componentName) {
        final long j17 = this.f53375h;
        if (((km0.c) gm0.j1.p().a()).a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CoreServiceConnection", "onServiceDisconnected connectTime:%s", java.lang.Long.valueOf(j17));
            try {
                this.f53371d.lock();
                this.f53372e = false;
                this.f53373f = null;
                this.f53371d.unlock();
                ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable(componentName, j17) { // from class: com.tencent.mm.app.d0$$b

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ long f53381e;

                    {
                        this.f53381e = j17;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.app.d0 d0Var = com.tencent.mm.app.d0.this;
                        d0Var.getClass();
                        long j18 = this.f53381e;
                        com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceConnection", "onServiceDisconnectedImpl() called with connectTime=%s", java.lang.Long.valueOf(j18));
                        long j19 = d0Var.f53376i;
                        boolean z17 = true;
                        boolean z18 = j18 < j19;
                        android.os.IBinder iBinder = d0Var.f53373f;
                        boolean z19 = iBinder != null && iBinder.isBinderAlive();
                        if (!z19 && !d0Var.f53372e) {
                            z17 = false;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceConnection", "tryReportDisconnect() connectTime:%s lastConnectImplTime:%s isDisconnectTimeError:%s isError:%s", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17));
                        if (z17 && z19 && z18) {
                            com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct errorMsgInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct();
                            errorMsgInfoStruct.f56113e = 2878L;
                            errorMsgInfoStruct.f56117i = z17 ? 1L : 0L;
                            errorMsgInfoStruct.f56118j = z19 ? 1L : 0L;
                            errorMsgInfoStruct.f56119k = d0Var.f53372e ? 1L : 0L;
                            errorMsgInfoStruct.r(com.tencent.mm.sdk.platformtools.z.f193109e);
                            errorMsgInfoStruct.s(z18 ? "1" : "0");
                            errorMsgInfoStruct.t("1");
                            errorMsgInfoStruct.o();
                            errorMsgInfoStruct.k();
                        }
                        if (!gm0.j1.b().n() || gm0.m.r()) {
                            gm0.j1.i();
                            gm0.j1.n().f273288b.s();
                            gm0.j1.i();
                            gm0.j1.n().f273288b.r();
                            return;
                        }
                        gm0.j1.i();
                        gm0.j1.n().f273288b.f();
                        gm0.j1.i();
                        gm0.j1.n().f273288b.s();
                        d0Var.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
                    }
                }, "MicroMsg.CoreServiceConnection");
            } catch (java.lang.Throwable th6) {
                this.f53371d.unlock();
                throw th6;
            }
        }
    }
}
