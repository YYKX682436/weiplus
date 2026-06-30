package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368;

/* loaded from: classes12.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.r f134397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea f134398e;

    public q(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.r rVar, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea c4689x7ffeacea) {
        this.f134397d = rVar;
        this.f134398e = c4689x7ffeacea;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object[] array;
        java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
        if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134266o.mo40960xab2f7f06() || com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db.f19940x4fbc8495.m41022xd258878() || com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4670x2e7549c9.f19946x4fbc8495.m41038x913b4288()) {
            java.lang.String a17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v.a(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v.f134416f);
            try {
                com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k.getClass();
                com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j jVar = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134362f;
                if (jVar != null) {
                    jVar.Ka(this.f134398e);
                }
            } catch (java.lang.Throwable th6) {
                oj.j.d(a17, th6, "", new java.lang.Object[0]);
            }
            oj.j.c(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k.b(), "recheck: process is on foreground", new java.lang.Object[0]);
            return;
        }
        java.lang.String a18 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v.a(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v.f134416f);
        try {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k.getClass();
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j jVar2 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134362f;
            if (jVar2 != null) {
                jVar2.lf(this.f134398e);
            }
        } catch (java.lang.Throwable th7) {
            oj.j.d(a18, th7, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0 d0Var = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k;
        java.lang.String b17 = d0Var.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("actual kill !!! supervisor = ");
        d0Var.getClass();
        sb6.append(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134362f);
        oj.j.b(b17, sb6.toString(), new java.lang.Object[0]);
        java.lang.String b18 = oj.m.b(this.f134397d.f134401f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b18, "MatrixUtil.getProcessName(app)");
        android.app.ActivityManager activityManager = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134254c;
        if (activityManager == null) {
            throw new java.lang.IllegalStateException("NOT initialized yet");
        }
        android.app.ActivityManager.AppTask[] appTaskArr = new android.app.ActivityManager.AppTask[0];
        try {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activityManager);
            java.util.List<android.app.ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appTasks, "activityManager!!.appTasks");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : appTasks) {
                android.app.ActivityManager.AppTask it = (android.app.ActivityManager.AppTask) obj;
                com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0 f0Var = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134275x;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "it");
                android.app.ActivityManager.RecentTaskInfo taskInfo = it.getTaskInfo();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(taskInfo, "it.taskInfo");
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
            java.lang.String b19 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k.b();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("removed task ");
            android.app.ActivityManager.RecentTaskInfo taskInfo2 = appTask.getTaskInfo();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(taskInfo2, "it.taskInfo");
            sb7.append(oj.z.a(taskInfo2));
            oj.j.b(b19, sb7.toString(), new java.lang.Object[0]);
            appTask.finishAndRemoveTask();
        }
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/matrix/lifecycle/supervisor/ProcessSubordinate$Subordinate$dispatchKill$1$1", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(obj2, "com/tencent/matrix/lifecycle/supervisor/ProcessSubordinate$Subordinate$dispatchKill$1$1", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }
}
