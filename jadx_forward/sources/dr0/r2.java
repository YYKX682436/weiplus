package dr0;

/* loaded from: classes12.dex */
public final class r2 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr0.t2 f324053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f324054e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f324055f;

    public r2(dr0.t2 t2Var, java.util.List list, boolean z17) {
        this.f324053d = t2Var;
        this.f324054e = list;
        this.f324055f = z17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("post to ipc disconnect, proc=");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274587b;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Recycler", sb6.toString());
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(bm5.f1.a()), dr0.b1.class, new dr0.q2(countDownLatch));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Recycler", "wait push proc to unbind");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Recycler", "await: " + countDownLatch.await((this.f324053d.f324086b ? 3 : 5) * 1000, java.util.concurrent.TimeUnit.MILLISECONDS));
        } catch (java.lang.InterruptedException unused) {
        }
        dr0.t2 t2Var = this.f324053d;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = dr0.t2.f324084f;
        if (t2Var.a()) {
            dr0.a3.c(dr0.a3.f323936d.a());
            this.f324053d.c();
            dr0.x0.f324104a.b("recycle-" + this.f324053d.f324085a, "abort", "5");
            return;
        }
        dr0.p1 a17 = dr0.p1.f324022d.a();
        java.lang.String PROCESS_MAIN = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_MAIN, "PROCESS_MAIN");
        a17.a(PROCESS_MAIN);
        dr0.t0 t0Var = dr0.t0.f324073k;
        t0Var.i().m46684xc460d886(this.f324053d.f324085a);
        t0Var.i().m46683x9afadd76(java.lang.System.currentTimeMillis() - this.f324053d.f324088d);
        this.f324053d.f324088d = 0L;
        t0Var.h();
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.f3.f149103a.a(true);
        ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).getClass();
        com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.l0.f145034a.c(-1, null);
        dr0.w1 w1Var = dr0.a3.f323936d;
        w1Var.a().getClass();
        if (this.f324053d.a()) {
            dr0.a3.c(w1Var.a());
            this.f324053d.c();
            dr0.x0.f324104a.b("recycle-" + this.f324053d.f324085a, "abort", "6");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Recycler", "No way to abort any more");
        dr0.x0.f324104a.b("recycle-" + this.f324053d.f324085a, "finish");
        if (this.f324053d.f324086b) {
            w1Var.a().q("完成回收... 1s");
            try {
                java.util.List<m3.d> procList = this.f324054e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(procList, "$procList");
                for (m3.d dVar : procList) {
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, dVar.f404626b) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274587b, dVar.f404626b)) {
                        java.lang.Object obj2 = dVar.f404625a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                        int intValue = ((java.lang.Number) obj2).intValue();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(java.lang.Integer.valueOf(intValue));
                        java.lang.Object obj3 = new java.lang.Object();
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(obj3, arrayList.toArray(), "com/tencent/mm/matrix/battery/accumulate/ProcLifeRecycler$RecycleTask$recycle$2$1", "onCallback", "(Lcom/tencent/mm/ipcinvoker/type/IPCVoid;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(obj3, "com/tencent/mm/matrix/battery/accumulate/ProcLifeRecycler$RecycleTask$recycle$2$1", "onCallback", "(Lcom/tencent/mm/ipcinvoker/type/IPCVoid;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    }
                }
                java.lang.Thread.sleep(1000L);
            } catch (java.lang.Exception unused2) {
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putInt("battery-accproclife-lastpid-recycle-test", android.os.Process.myPid());
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putInt("battery-accproclife-lastpid-recycle", android.os.Process.myPid());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putLong("battery-accproclife-suicide-last-ms", java.lang.System.currentTimeMillis());
        dr0.p1 a18 = dr0.p1.f324022d.a();
        int n17 = dr0.a3.f323936d.a().n();
        boolean z17 = this.f324055f;
        a18.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Manager", "#recycleMainPoc");
        if (z17 && !a18.f324026c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Manager", "skip recycle: non-quiet launching");
            return;
        }
        cr0.k4 k4Var = cr0.k4.f303202a;
        if (((java.lang.Boolean) cr0.k4.f303203b.mo141623x754a37bb()).booleanValue() && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putBoolean("key_process_track_starting", true);
        }
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        java.util.List<android.app.ActivityManager.AppTask> appTasks = ((android.app.ActivityManager) systemService).getAppTasks();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appTasks, "getAppTasks(...)");
        for (android.app.ActivityManager.AppTask appTask : appTasks) {
            android.content.ComponentName componentName = appTask.getTaskInfo().topActivity;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(componentName != null ? componentName.getClassName() : null, "com.tencent.mm.ui.LauncherUI")) {
                appTask.setExcludeFromRecents(true);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Manager", "bye! mode=" + n17);
        if (n17 == 1) {
            int myPid = android.os.Process.myPid();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(myPid));
            java.lang.Object obj4 = new java.lang.Object();
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(obj4, arrayList2.toArray(), "com/tencent/mm/matrix/battery/accumulate/ProcLifeManager", "suicide", "(I)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            android.os.Process.killProcess(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(obj4, "com/tencent/mm/matrix/battery/accumulate/ProcLifeManager", "suicide", "(I)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            return;
        }
        if (n17 != 2) {
            if (n17 == 3) {
                java.lang.Runtime.getRuntime().exit(0);
                return;
            } else if (n17 != 4) {
                java.lang.Runtime.getRuntime().exit(0);
                return;
            } else {
                ((ku5.t0) ku5.t0.f394148d).B(dr0.n1.f324007d);
                return;
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(0);
        java.lang.Object obj5 = new java.lang.Object();
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(obj5, arrayList3.toArray(), "com/tencent/mm/matrix/battery/accumulate/ProcLifeManager", "suicide", "(I)V", "java/lang/System_EXEC_", "exit", "(I)V");
        java.lang.System.exit(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(obj5, "com/tencent/mm/matrix/battery/accumulate/ProcLifeManager", "suicide", "(I)V", "java/lang/System_EXEC_", "exit", "(I)V");
        throw new java.lang.RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
