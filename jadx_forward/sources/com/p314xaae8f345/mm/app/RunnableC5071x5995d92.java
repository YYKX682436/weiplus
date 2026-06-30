package com.p314xaae8f345.mm.app;

/* renamed from: com.tencent.mm.app.d4$$b */
/* loaded from: classes12.dex */
public final /* synthetic */ class RunnableC5071x5995d92 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            android.app.ActivityManager activityManager = (android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            if (activityManager == null) {
                return;
            }
            int i17 = 25;
            while (i17 > 0) {
                i17--;
                java.util.List<android.app.ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
                if (processesInErrorState != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMCrashReporter", "errorStateInfos.size = " + processesInErrorState.size());
                    for (android.app.ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                        if (processErrorStateInfo.pid == android.os.Process.myPid()) {
                            oj.j.c("MicroMsg.MMCrashReporter", "ANR error sate condition = %d", java.lang.Integer.valueOf(processErrorStateInfo.condition));
                            oj.j.c("MicroMsg.MMCrashReporter", "ANR error sate longMsg = %s", processErrorStateInfo.longMsg);
                        }
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMCrashReporter", "errorStateInfos == null");
                }
                java.lang.Thread.sleep(1000L);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMCrashReporter", "get errorStateInfos error : " + th6.getMessage());
        }
    }
}
