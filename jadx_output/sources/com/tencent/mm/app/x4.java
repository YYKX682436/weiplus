package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class x4 implements java.lang.Runnable {
    public x4(com.tencent.mm.app.v4 v4Var) {
    }

    public final android.app.ActivityManager.ProcessErrorStateInfo a() {
        java.util.List<android.app.ActivityManager.ProcessErrorStateInfo> processesInErrorState = ((android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getProcessesInErrorState();
        if (processesInErrorState == null) {
            return null;
        }
        for (android.app.ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
            if (processErrorStateInfo.uid == android.os.Process.myUid() && processErrorStateInfo.condition == 2) {
                return processErrorStateInfo;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x018a, code lost:
    
        if (r14 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018c, code lost:
    
        r14.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0259 A[LOOP:1: B:30:0x00b2->B:65:0x0259, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0192 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.app.x4.run():void");
    }
}
