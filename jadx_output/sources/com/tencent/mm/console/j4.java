package com.tencent.mm.console;

/* loaded from: classes5.dex */
public class j4 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        java.util.Iterator<android.app.ActivityManager.AppTask> it = ((android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getAppTasks().iterator();
        while (it.hasNext()) {
            it.next().getTaskInfo();
        }
    }
}
