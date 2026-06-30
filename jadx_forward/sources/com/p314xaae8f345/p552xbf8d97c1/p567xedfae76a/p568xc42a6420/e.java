package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420;

/* loaded from: classes12.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.ComponentName f134248d;

    public e(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.i iVar, android.content.ComponentName componentName) {
        this.f134248d = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.ActivityManager activityManager;
        java.util.List<android.app.ActivityManager.RunningServiceInfo> runningServices;
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.d dVar;
        try {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db c4669x11d5b5db = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db.f19940x4fbc8495;
            activityManager = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db.activityManager;
            if (activityManager == null || (runningServices = activityManager.getRunningServices(Integer.MAX_VALUE)) == null) {
                return;
            }
            java.util.ArrayList<android.app.ActivityManager.RunningServiceInfo> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : runningServices) {
                android.app.ActivityManager.RunningServiceInfo runningServiceInfo = (android.app.ActivityManager.RunningServiceInfo) obj;
                if (runningServiceInfo.pid == android.os.Process.myPid() && runningServiceInfo.uid == android.os.Process.myUid() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(runningServiceInfo.service, this.f134248d) && runningServiceInfo.foreground) {
                    arrayList.add(obj);
                }
            }
            for (android.app.ActivityManager.RunningServiceInfo runningServiceInfo2 : arrayList) {
                oj.j.c("Matrix.lifecycle.FgService", "service turned fg when create: " + runningServiceInfo2.service, new java.lang.Object[0]);
                com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db c4669x11d5b5db2 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db.f19940x4fbc8495;
                dVar = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db.fgServiceHandler;
                if (dVar != null) {
                    android.content.ComponentName componentName = runningServiceInfo2.service;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(componentName, "it.service");
                    dVar.b(componentName);
                }
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.lifecycle.FgService", th6, "", new java.lang.Object[0]);
        }
    }
}
