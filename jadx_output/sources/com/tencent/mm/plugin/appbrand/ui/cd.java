package com.tencent.mm.plugin.appbrand.ui;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/cd;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class cd implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.ipcinvoker.type.IPCVoid, com.tencent.mm.ipcinvoker.type.IPCBoolean> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ui.LauncherUI launcherUI;
        java.lang.Object obj2;
        if (gm0.m.r() || gm0.m.f273236y) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUIAccountReleaseHandler.ICPCheckIfStartLoginUITask", "checkIfNeedManualLogin account hold, return true");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUIAccountReleaseHandler.ICPCheckIfStartLoginUITask", "checkIfNeedManualLogin fallback return true");
        }
        boolean z17 = true;
        if (((hh5.e) i95.n0.c(hh5.e.class)) != null && (launcherUI = com.tencent.mm.ui.LauncherUI.getInstance()) != null) {
            if (com.tencent.mm.sdk.platformtools.c2.c(launcherUI.getIntent(), "Intro_Switch", false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUIAccountReleaseHandler.ICPCheckIfStartLoginUITask", "handleRequest LauncherUI ConstantsUI.Intro.KSwitch==true");
            } else {
                try {
                    java.lang.Object systemService = b3.l.getSystemService(launcherUI, android.app.ActivityManager.class);
                    kotlin.jvm.internal.o.d(systemService);
                    java.util.List<android.app.ActivityManager.RunningTaskInfo> runningTasks = ((android.app.ActivityManager) systemService).getRunningTasks(100);
                    kotlin.jvm.internal.o.f(runningTasks, "getRunningTasks(...)");
                    java.util.Iterator<T> it = runningTasks.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        android.app.ActivityManager.RunningTaskInfo runningTaskInfo = (android.app.ActivityManager.RunningTaskInfo) obj2;
                        if ((android.os.Build.VERSION.SDK_INT >= 29 ? runningTaskInfo.taskId : runningTaskInfo.id) == launcherUI.getTaskId()) {
                            break;
                        }
                    }
                    android.app.ActivityManager.RunningTaskInfo runningTaskInfo2 = (android.app.ActivityManager.RunningTaskInfo) obj2;
                    if (runningTaskInfo2 != null) {
                        java.lang.String[] strArr = {"LoginHistoryUI", "AccountExpiredUI", "LoginSmsUI", "LoginPasswordUI", "LoginVoiceUI", "LoginFaceUI"};
                        for (int i17 = 0; i17 < 6; i17++) {
                            java.lang.String str = strArr[i17];
                            android.content.ComponentName componentName = runningTaskInfo2.topActivity;
                            java.lang.String className = componentName != null ? componentName.getClassName() : null;
                            if (className == null) {
                                className = "";
                            }
                            if (r26.i0.n(className, str, false)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUIAccountReleaseHandler.ICPCheckIfStartLoginUITask", "handleRequest " + str + " already present");
                            }
                        }
                    }
                } catch (java.lang.Exception unused) {
                }
            }
            z17 = false;
            break;
        }
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(z17));
        }
    }
}
