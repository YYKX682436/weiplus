package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final /* synthetic */ class d4$$b implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            android.app.ActivityManager activityManager = (android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (activityManager == null) {
                return;
            }
            int i17 = 25;
            while (i17 > 0) {
                i17--;
                java.util.List<android.app.ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
                if (processesInErrorState != null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MMCrashReporter", "errorStateInfos.size = " + processesInErrorState.size());
                    for (android.app.ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                        if (processErrorStateInfo.pid == android.os.Process.myPid()) {
                            oj.j.c("MicroMsg.MMCrashReporter", "ANR error sate condition = %d", java.lang.Integer.valueOf(processErrorStateInfo.condition));
                            oj.j.c("MicroMsg.MMCrashReporter", "ANR error sate longMsg = %s", processErrorStateInfo.longMsg);
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MMCrashReporter", "errorStateInfos == null");
                }
                java.lang.Thread.sleep(1000L);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMCrashReporter", "get errorStateInfos error : " + th6.getMessage());
        }
    }
}
