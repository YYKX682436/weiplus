package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class n8 {

    /* renamed from: a, reason: collision with root package name */
    public boolean[] f171417a = null;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Intent f171418b = null;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a f171419c = null;

    public static boolean b(android.content.Intent intent, android.app.Activity activity) {
        android.app.ActivityManager activityManager;
        java.util.List<android.app.ActivityManager.AppTask> appTasks;
        android.app.ActivityManager.RecentTaskInfo recentTaskInfo;
        int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(intent, "key_appbrand_source_android_task_id", 0);
        if (g17 != 0 && (activityManager = (android.app.ActivityManager) b3.l.m9714xac92a5d0(activity, android.app.ActivityManager.class)) != null && (appTasks = activityManager.getAppTasks()) != null) {
            java.util.Iterator<android.app.ActivityManager.AppTask> it = appTasks.iterator();
            while (it.hasNext()) {
                try {
                    recentTaskInfo = it.next().getTaskInfo();
                } catch (java.lang.IllegalArgumentException unused) {
                    recentTaskInfo = null;
                }
                if (recentTaskInfo != null && g17 == recentTaskInfo.id) {
                    try {
                        android.content.Intent intent2 = recentTaskInfo.baseIntent;
                        if (intent2 != null && "android.intent.action.MAIN".equals(intent2.getAction()) && intent2.getCategories() != null && intent2.getCategories().contains("android.intent.category.LAUNCHER")) {
                            return true;
                        }
                        android.content.ComponentName componentName = recentTaskInfo.baseActivity;
                        if (componentName != null && u46.l.b(componentName.getShortClassName(), ".ui.LauncherUI")) {
                            return true;
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandUIAndroid12CloseAnimationWorkaround", "onActivityNewIntent check taskId:%d is launcherIntent, get unrecognized exception:%s", java.lang.Integer.valueOf(g17), e17);
                    }
                }
            }
        }
        return false;
    }

    public final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a activityC12666xc288131a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4) {
        boolean z17;
        android.view.WindowMetrics currentWindowMetrics;
        android.view.WindowMetrics maximumWindowMetrics;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a activityC12666xc288131a2;
        if (this.f171417a == null) {
            boolean[] zArr = new boolean[1];
            android.content.Intent intent = this.f171418b;
            zArr[0] = (intent == null || (activityC12666xc288131a2 = this.f171419c) == null) ? false : b(intent, activityC12666xc288131a2);
            this.f171417a = zArr;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUIAndroid12CloseAnimationWorkaround", "checkCloseAnimationWorkaroundPrecondition %s, fromAppMainTask:%b, isTaskRoot:%b", activityC12666xc288131a, java.lang.Boolean.valueOf(this.f171417a[0]), java.lang.Boolean.valueOf(activityC12666xc288131a.isTaskRoot()));
        if (!this.f171417a[0] || c11809xbc286be4 == null) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = c11809xbc286be4.f128802b2;
        if (!(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u8.i(c12559xbdae8559) == 1023 || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u8.i(c12559xbdae8559) == 1223)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae85592 = c11809xbc286be4.f128802b2;
            if (!(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u8.i(c12559xbdae85592) == 1113 || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u8.i(c12559xbdae85592) == 1114)) {
                z17 = false;
                if (z17 && activityC12666xc288131a.isTaskRoot() && !activityC12666xc288131a.B && !activityC12666xc288131a.A && !activityC12666xc288131a.C && !activityC12666xc288131a.f170946q.f170978e && !activityC12666xc288131a.f170955z) {
                    currentWindowMetrics = activityC12666xc288131a.getWindowManager().getCurrentWindowMetrics();
                    maximumWindowMetrics = activityC12666xc288131a.getWindowManager().getMaximumWindowMetrics();
                    if (!(currentWindowMetrics.getBounds().width() >= maximumWindowMetrics.getBounds().width() || currentWindowMetrics.getBounds().height() < maximumWindowMetrics.getBounds().height()) && !com.p314xaae8f345.mm.ui.bk.A()) {
                        if ((!com.p314xaae8f345.mm.ui.bk.N(activityC12666xc288131a.getTaskId()) || com.p314xaae8f345.mm.ui.bk.P(activityC12666xc288131a)) && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12683x695b32b4.f170970g.a(activityC12666xc288131a)) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        z17 = true;
        if (z17) {
            return false;
        }
        currentWindowMetrics = activityC12666xc288131a.getWindowManager().getCurrentWindowMetrics();
        maximumWindowMetrics = activityC12666xc288131a.getWindowManager().getMaximumWindowMetrics();
        if (!(currentWindowMetrics.getBounds().width() >= maximumWindowMetrics.getBounds().width() || currentWindowMetrics.getBounds().height() < maximumWindowMetrics.getBounds().height())) {
            if (!com.p314xaae8f345.mm.ui.bk.N(activityC12666xc288131a.getTaskId()) || com.p314xaae8f345.mm.ui.bk.P(activityC12666xc288131a)) {
            }
        }
        return false;
    }

    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a activityC12666xc288131a, android.content.Intent intent) {
        android.content.Intent intent2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a activityC12666xc288131a2;
        try {
            if (intent == null) {
                this.f171417a = new boolean[]{false};
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(intent, "key_appbrand_source_android_task_id", 0) != activityC12666xc288131a.getTaskId()) {
                this.f171417a = null;
            } else if (this.f171417a == null && (intent2 = this.f171418b) != null && (activityC12666xc288131a2 = this.f171419c) != null) {
                this.f171417a = new boolean[]{b(intent2, activityC12666xc288131a2)};
            }
        } finally {
            this.f171418b = intent;
            this.f171419c = activityC12666xc288131a;
        }
    }
}
