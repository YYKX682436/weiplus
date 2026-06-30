package dr0;

/* loaded from: classes12.dex */
public final class p1 {

    /* renamed from: d, reason: collision with root package name */
    public static final dr0.h1 f324022d = new dr0.h1(null);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f324023e = jz5.h.a(jz5.i.f384362d, dr0.g1.f323960d);

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f324024a = jz5.h.b(dr0.j1.f323972d);

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f324025b = jz5.h.a(jz5.i.f384362d, dr0.l1.f323992d);

    /* renamed from: c, reason: collision with root package name */
    public boolean f324026c = true;

    public p1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(java.lang.String procName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(procName, "procName");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bm5.f1.a(), procName)) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p pVar = (com.p314xaae8f345.mm.p794xb0fa9b5e.p) ((java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.mm.p794xb0fa9b5e.q.b().f149923c).get(procName);
            if (pVar != null && pVar.f149916c) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Manager", "wait for connecting");
                try {
                    java.lang.Thread.sleep(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
                } catch (java.lang.InterruptedException unused) {
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Manager", "ipc disconnect, proc=" + procName + ", from=" + bm5.f1.a());
        com.p314xaae8f345.mm.p794xb0fa9b5e.q b17 = com.p314xaae8f345.mm.p794xb0fa9b5e.q.b();
        b17.getClass();
        if (!((com.p314xaae8f345.mm.p794xb0fa9b5e.y.b(procName) || ((java.util.concurrent.ConcurrentHashMap) b17.f149923c).get(procName) == null) ? false : true)) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.q.b().c(procName);
        }
        synchronized (l85.s0.f398741d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicoMsg.proc.ServiceConnection", "detach all service conn to proc: ".concat(procName));
            java.util.List list = (java.util.List) ((java.util.HashMap) l85.s0.f398742e.mo141623x754a37bb()).get(procName);
            if (list != null) {
                kz5.h0.B(list, l85.p0.f398736d);
            }
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, procName)) {
            j45.l.D(new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p642xad8b531f.C10296x7f15878.NotifyService.class));
            j45.l.D(new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21029xe89c2284.class));
        }
        java.util.Map map = ri.a.f477365a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Matrix.battery.AmsInvokeListener", "#unbindProcess, proc=".concat(procName));
        java.util.Map map2 = ri.a.f477365a;
        synchronized (map2) {
            java.util.List<android.util.Pair> list2 = (java.util.List) ((java.util.LinkedHashMap) map2).get(procName);
            if (list2 != null && !list2.isEmpty()) {
                synchronized (list2) {
                    try {
                        for (android.util.Pair pair : list2) {
                            android.content.ServiceConnection serviceConnection = (android.content.ServiceConnection) ((java.lang.ref.WeakReference) pair.second).get();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Matrix.battery.AmsInvokeListener", "unbind service conn: " + ((java.lang.String) pair.first) + "@" + serviceConnection + ", proc=" + procName);
                            if (serviceConnection != null) {
                                try {
                                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unbindService(serviceConnection);
                                } catch (java.lang.Throwable th6) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Matrix.battery.AmsInvokeListener", "unbindService failed: " + th6.getMessage());
                                }
                            }
                            try {
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.stopService(new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, java.lang.Class.forName((java.lang.String) pair.first)));
                            } catch (java.lang.Throwable th7) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Matrix.battery.AmsInvokeListener", "stopService failed: " + th7.getMessage());
                            }
                        }
                        list2.clear();
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Matrix.battery.AmsInvokeListener", "modify err: " + e17.getMessage());
                    }
                }
            }
        }
    }

    public final android.app.ApplicationExitInfo b(java.lang.String procName, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(procName, "procName");
        try {
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            android.app.ActivityManager activityManager = (android.app.ActivityManager) systemService;
            if (android.os.Build.VERSION.SDK_INT < 30) {
                return null;
            }
            java.util.List<android.app.ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, i17, 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(historicalProcessExitReasons, "getHistoricalProcessExitReasons(...)");
            for (android.app.ApplicationExitInfo applicationExitInfo : historicalProcessExitReasons) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(applicationExitInfo.getProcessName(), procName)) {
                    return applicationExitInfo;
                }
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final java.util.List c() {
        try {
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            android.app.ActivityManager activityManager = (android.app.ActivityManager) systemService;
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                java.util.List<android.app.ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, 0, 0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(historicalProcessExitReasons, "getHistoricalProcessExitReasons(...)");
                return historicalProcessExitReasons;
            }
        } catch (java.lang.Exception unused) {
        }
        return kz5.p0.f395529d;
    }

    public final java.util.List d(java.lang.String procName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(procName, "procName");
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            java.util.List c17 = c();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : c17) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((android.app.ApplicationExitInfo) obj).getProcessName(), procName)) {
                    arrayList.add(obj);
                }
            }
            return kz5.n0.S0(arrayList);
        }
        java.util.List c18 = c();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : c18) {
            android.app.ApplicationExitInfo applicationExitInfo = (android.app.ApplicationExitInfo) obj2;
            if (android.os.Build.VERSION.SDK_INT < 30) {
                throw new java.lang.IllegalStateException("Stub!");
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(applicationExitInfo.getProcessName(), procName)) {
                arrayList2.add(obj2);
            }
        }
        return kz5.n0.S0(arrayList2);
    }

    public final int e(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        try {
            java.lang.Object systemService = context.getSystemService("usagestats");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.usage.UsageStatsManager");
            android.app.usage.UsageStatsManager usageStatsManager = (android.app.usage.UsageStatsManager) systemService;
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                return usageStatsManager.getAppStandbyBucket();
            }
            return -1;
        } catch (java.lang.Exception unused) {
            return -1;
        }
    }

    public final java.util.List f() {
        return (java.util.List) ((jz5.n) this.f324024a).mo141623x754a37bb();
    }

    public final java.util.List g(android.content.Context context) {
        kz5.p0 p0Var = kz5.p0.f395529d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        try {
            java.lang.Object systemService = context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) systemService).getRunningAppProcesses();
            return runningAppProcesses == null ? p0Var : runningAppProcesses;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Manager", "getRunningTasks err: " + e17.getMessage());
            return p0Var;
        }
    }

    public final java.util.List h(android.content.Context context) {
        kz5.p0 p0Var = kz5.p0.f395529d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        try {
            java.lang.Object systemService = context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            java.util.List<android.app.ActivityManager.RunningTaskInfo> runningTasks = ((android.app.ActivityManager) systemService).getRunningTasks(Integer.MAX_VALUE);
            return runningTasks == null ? p0Var : runningTasks;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Manager", "getRunningTasks err: " + e17.getMessage());
            return p0Var;
        }
    }

    public final boolean i(android.content.Context context) {
        int e17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        try {
            java.lang.Object systemService = context.getSystemService("usagestats");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.usage.UsageStatsManager");
            return ((android.app.usage.UsageStatsManager) systemService).isAppInactive(context.getPackageName());
        } catch (java.lang.Exception unused) {
            return android.os.Build.VERSION.SDK_INT >= 28 && (e17 = e(context)) >= 0 && e17 >= 40;
        }
    }

    public final boolean j(java.lang.String procName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(procName, "procName");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        java.util.Iterator it = ((java.util.ArrayList) sh.c.n(context)).iterator();
        while (it.hasNext()) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(procName, ((m3.d) it.next()).f404626b)) {
                return true;
            }
        }
        return false;
    }

    public final void k(boolean z17) {
        if (z17) {
            cr0.k4 k4Var = cr0.k4.f303202a;
            if (((java.lang.Boolean) cr0.k4.f303203b.mo141623x754a37bb()).booleanValue() && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putBoolean("key_process_track_starting", true);
            }
        } else {
            cr0.k4.f303202a.a();
        }
        l(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Manager", "notify other proc to update mainProcStandby: " + z17);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.util.List n17 = sh.c.n(context);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("curr proc count=");
        java.util.ArrayList arrayList = (java.util.ArrayList) n17;
        sb6.append(arrayList.size());
        sb6.append(", list=");
        sb6.append(n17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Manager", sb6.toString());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m3.d dVar = (m3.d) it.next();
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bm5.f1.a(), dVar.f404626b)) {
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d((java.lang.String) dVar.f404626b, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(z17), dr0.c1.class, null);
            }
        }
    }

    public final void l(boolean z17) {
        if (!z17 || dr0.a3.f323936d.a().m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Manager", "#updateMainProcStandbyLocal: " + z17);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274610g = z17;
            synchronized (f()) {
                if (!f().isEmpty()) {
                    ((ku5.t0) ku5.t0.f394148d).g(new dr0.o1(this, z17));
                }
            }
        }
    }

    public final void m(boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Manager", "#updateQuietLaunchingDirectly: " + z17);
            this.f324026c = z17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Manager", "notify other proc to update quietLaunch: " + z17);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.util.List n17 = sh.c.n(context);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("curr proc count=");
            java.util.ArrayList arrayList = (java.util.ArrayList) n17;
            sb6.append(arrayList.size());
            sb6.append(", list=");
            sb6.append(n17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Manager", sb6.toString());
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m3.d dVar = (m3.d) it.next();
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bm5.f1.a(), dVar.f404626b)) {
                    com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d((java.lang.String) dVar.f404626b, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(z17), dr0.f1.class, null);
                }
            }
        }
    }
}
