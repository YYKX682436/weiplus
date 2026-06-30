package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes7.dex */
public final class j extends com.p314xaae8f345.mm.app.w6 {
    @Override // com.p314xaae8f345.mm.app.w6, com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityCreated */
    public void mo9958x78cb4fa(android.app.Activity activity, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d dVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d.f156578a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ActivityCrossProcessManager", "onActivityCreated " + activity + ' ');
        if (r26.n0.B(activity.getClass().getSimpleName(), "com.tencent.mm.ui.LauncherUI", false)) {
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) systemService).getRunningAppProcesses();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(runningAppProcesses, "getRunningAppProcesses(...)");
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(runningAppProcessInfo.processName, bm5.f1.a())) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d.f156578a.a();
                } else {
                    com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(runningAppProcessInfo.processName, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.f0.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.a.f156534d);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d.f156579b.addLast(new cf.a(activity, android.os.SystemClock.elapsedRealtime()));
    }

    @Override // com.p314xaae8f345.mm.app.w6, com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityDestroyed */
    public void mo9959xa9f48fab(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d dVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d.f156578a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ActivityCrossProcessManager", "onActivityDestroy " + activity + ' ');
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d.f156579b.removeIf(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.b(activity));
    }
}
