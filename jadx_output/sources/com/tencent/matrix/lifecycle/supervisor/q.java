package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.supervisor.r f52864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.supervisor.ProcessToken f52865e;

    public q(com.tencent.matrix.lifecycle.supervisor.r rVar, com.tencent.matrix.lifecycle.supervisor.ProcessToken processToken) {
        this.f52864d = rVar;
        this.f52865e = processToken;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object[] array;
        java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        if (com.tencent.matrix.lifecycle.owners.f0.f52733o.active() || com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner.INSTANCE.hasForegroundService() || com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner.INSTANCE.hasVisibleWindow()) {
            java.lang.String a17 = com.tencent.matrix.lifecycle.supervisor.v.a(com.tencent.matrix.lifecycle.supervisor.v.f52883f);
            try {
                com.tencent.matrix.lifecycle.supervisor.d0.f52834k.getClass();
                com.tencent.matrix.lifecycle.supervisor.j jVar = com.tencent.matrix.lifecycle.supervisor.d0.f52829f;
                if (jVar != null) {
                    jVar.Ka(this.f52865e);
                }
            } catch (java.lang.Throwable th6) {
                oj.j.d(a17, th6, "", new java.lang.Object[0]);
            }
            oj.j.c(com.tencent.matrix.lifecycle.supervisor.d0.f52834k.b(), "recheck: process is on foreground", new java.lang.Object[0]);
            return;
        }
        java.lang.String a18 = com.tencent.matrix.lifecycle.supervisor.v.a(com.tencent.matrix.lifecycle.supervisor.v.f52883f);
        try {
            com.tencent.matrix.lifecycle.supervisor.d0.f52834k.getClass();
            com.tencent.matrix.lifecycle.supervisor.j jVar2 = com.tencent.matrix.lifecycle.supervisor.d0.f52829f;
            if (jVar2 != null) {
                jVar2.lf(this.f52865e);
            }
        } catch (java.lang.Throwable th7) {
            oj.j.d(a18, th7, "", new java.lang.Object[0]);
        }
        com.tencent.matrix.lifecycle.supervisor.d0 d0Var = com.tencent.matrix.lifecycle.supervisor.d0.f52834k;
        java.lang.String b17 = d0Var.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("actual kill !!! supervisor = ");
        d0Var.getClass();
        sb6.append(com.tencent.matrix.lifecycle.supervisor.d0.f52829f);
        oj.j.b(b17, sb6.toString(), new java.lang.Object[0]);
        java.lang.String b18 = oj.m.b(this.f52864d.f52868f);
        kotlin.jvm.internal.o.f(b18, "MatrixUtil.getProcessName(app)");
        android.app.ActivityManager activityManager = com.tencent.matrix.lifecycle.owners.f0.f52721c;
        if (activityManager == null) {
            throw new java.lang.IllegalStateException("NOT initialized yet");
        }
        android.app.ActivityManager.AppTask[] appTaskArr = new android.app.ActivityManager.AppTask[0];
        try {
            kotlin.jvm.internal.o.d(activityManager);
            java.util.List<android.app.ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
            kotlin.jvm.internal.o.f(appTasks, "activityManager!!.appTasks");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : appTasks) {
                android.app.ActivityManager.AppTask it = (android.app.ActivityManager.AppTask) obj;
                com.tencent.matrix.lifecycle.owners.f0 f0Var = com.tencent.matrix.lifecycle.owners.f0.f52742x;
                kotlin.jvm.internal.o.f(it, "it");
                android.app.ActivityManager.RecentTaskInfo taskInfo = it.getTaskInfo();
                kotlin.jvm.internal.o.f(taskInfo, "it.taskInfo");
                if (f0Var.b(taskInfo, b18)) {
                    arrayList.add(obj);
                }
            }
            array = arrayList.toArray(new android.app.ActivityManager.AppTask[0]);
        } catch (java.lang.Throwable th8) {
            oj.j.d("Matrix.ProcessLifecycle", th8, "", new java.lang.Object[0]);
        }
        if (array == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        appTaskArr = (android.app.ActivityManager.AppTask[]) array;
        for (android.app.ActivityManager.AppTask appTask : appTaskArr) {
            java.lang.String b19 = com.tencent.matrix.lifecycle.supervisor.d0.f52834k.b();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("removed task ");
            android.app.ActivityManager.RecentTaskInfo taskInfo2 = appTask.getTaskInfo();
            kotlin.jvm.internal.o.f(taskInfo2, "it.taskInfo");
            sb7.append(oj.z.a(taskInfo2));
            oj.j.b(b19, sb7.toString(), new java.lang.Object[0]);
            appTask.finishAndRemoveTask();
        }
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/matrix/lifecycle/supervisor/ProcessSubordinate$Subordinate$dispatchKill$1$1", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(obj2, "com/tencent/matrix/lifecycle/supervisor/ProcessSubordinate$Subordinate$dispatchKill$1$1", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }
}
