package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/cd;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class cd implements com.p314xaae8f345.mm.p794xb0fa9b5e.i<com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c> {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 m78443x9cf0d20b;
        java.lang.Object obj2;
        if (gm0.m.r() || gm0.m.f354769y) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUIAccountReleaseHandler.ICPCheckIfStartLoginUITask", "checkIfNeedManualLogin account hold, return true");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUIAccountReleaseHandler.ICPCheckIfStartLoginUITask", "checkIfNeedManualLogin fallback return true");
        }
        boolean z17 = true;
        if (((hh5.e) i95.n0.c(hh5.e.class)) != null && (m78443x9cf0d20b = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b()) != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(m78443x9cf0d20b.getIntent(), "Intro_Switch", false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUIAccountReleaseHandler.ICPCheckIfStartLoginUITask", "handleRequest LauncherUI ConstantsUI.Intro.KSwitch==true");
            } else {
                try {
                    java.lang.Object m9714xac92a5d0 = b3.l.m9714xac92a5d0(m78443x9cf0d20b, android.app.ActivityManager.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m9714xac92a5d0);
                    java.util.List<android.app.ActivityManager.RunningTaskInfo> runningTasks = ((android.app.ActivityManager) m9714xac92a5d0).getRunningTasks(100);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(runningTasks, "getRunningTasks(...)");
                    java.util.Iterator<T> it = runningTasks.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        android.app.ActivityManager.RunningTaskInfo runningTaskInfo = (android.app.ActivityManager.RunningTaskInfo) obj2;
                        if ((android.os.Build.VERSION.SDK_INT >= 29 ? runningTaskInfo.taskId : runningTaskInfo.id) == m78443x9cf0d20b.getTaskId()) {
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
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUIAccountReleaseHandler.ICPCheckIfStartLoginUITask", "handleRequest " + str + " already present");
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
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(z17));
        }
    }
}
