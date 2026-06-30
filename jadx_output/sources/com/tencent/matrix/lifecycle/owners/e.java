package com.tencent.matrix.lifecycle.owners;

/* loaded from: classes12.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.ComponentName f52715d;

    public e(com.tencent.matrix.lifecycle.owners.i iVar, android.content.ComponentName componentName) {
        this.f52715d = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.ActivityManager activityManager;
        java.util.List<android.app.ActivityManager.RunningServiceInfo> runningServices;
        com.tencent.matrix.lifecycle.owners.d dVar;
        try {
            com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner foregroundServiceLifecycleOwner = com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner.INSTANCE;
            activityManager = com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner.activityManager;
            if (activityManager == null || (runningServices = activityManager.getRunningServices(Integer.MAX_VALUE)) == null) {
                return;
            }
            java.util.ArrayList<android.app.ActivityManager.RunningServiceInfo> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : runningServices) {
                android.app.ActivityManager.RunningServiceInfo runningServiceInfo = (android.app.ActivityManager.RunningServiceInfo) obj;
                if (runningServiceInfo.pid == android.os.Process.myPid() && runningServiceInfo.uid == android.os.Process.myUid() && kotlin.jvm.internal.o.b(runningServiceInfo.service, this.f52715d) && runningServiceInfo.foreground) {
                    arrayList.add(obj);
                }
            }
            for (android.app.ActivityManager.RunningServiceInfo runningServiceInfo2 : arrayList) {
                oj.j.c("Matrix.lifecycle.FgService", "service turned fg when create: " + runningServiceInfo2.service, new java.lang.Object[0]);
                com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner foregroundServiceLifecycleOwner2 = com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner.INSTANCE;
                dVar = com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner.fgServiceHandler;
                if (dVar != null) {
                    android.content.ComponentName componentName = runningServiceInfo2.service;
                    kotlin.jvm.internal.o.f(componentName, "it.service");
                    dVar.b(componentName);
                }
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.lifecycle.FgService", th6, "", new java.lang.Object[0]);
        }
    }
}
