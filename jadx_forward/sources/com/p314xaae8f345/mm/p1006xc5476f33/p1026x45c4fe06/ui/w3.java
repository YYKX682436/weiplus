package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI f171823d;

    public w3(com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI) {
        this.f171823d = appBrandDebugUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            java.util.ArrayList<android.app.ActivityManager.RunningAppProcessInfo> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : runningAppProcesses) {
                java.lang.String processName = ((android.app.ActivityManager.RunningAppProcessInfo) obj).processName;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(processName, "processName");
                if (r26.i0.y(processName, "com.tencent.mm", false)) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList<jz5.l> arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
                arrayList2.add(new jz5.l(runningAppProcessInfo.processName, java.lang.Integer.valueOf(runningAppProcessInfo.pid)));
            }
            for (jz5.l lVar : arrayList2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.a5.a((java.lang.String) lVar.f384366d, ((java.lang.Number) lVar.f384367e).intValue(), true, true);
            }
            com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI = this.f171823d;
            if (((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u3(appBrandDebugUI)) != null) {
                return;
            }
        }
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.v3(this.f171823d));
    }
}
