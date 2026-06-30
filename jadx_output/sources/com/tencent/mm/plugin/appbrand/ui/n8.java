package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class n8 {

    /* renamed from: a, reason: collision with root package name */
    public boolean[] f89884a = null;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Intent f89885b = null;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.ui.AppBrandUI f89886c = null;

    public static boolean b(android.content.Intent intent, android.app.Activity activity) {
        android.app.ActivityManager activityManager;
        java.util.List<android.app.ActivityManager.AppTask> appTasks;
        android.app.ActivityManager.RecentTaskInfo recentTaskInfo;
        int g17 = com.tencent.mm.sdk.platformtools.c2.g(intent, "key_appbrand_source_android_task_id", 0);
        if (g17 != 0 && (activityManager = (android.app.ActivityManager) b3.l.getSystemService(activity, android.app.ActivityManager.class)) != null && (appTasks = activityManager.getAppTasks()) != null) {
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
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandUIAndroid12CloseAnimationWorkaround", "onActivityNewIntent check taskId:%d is launcherIntent, get unrecognized exception:%s", java.lang.Integer.valueOf(g17), e17);
                    }
                }
            }
        }
        return false;
    }

    public final boolean a(com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC) {
        boolean z17;
        android.view.WindowMetrics currentWindowMetrics;
        android.view.WindowMetrics maximumWindowMetrics;
        com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI2;
        if (this.f89884a == null) {
            boolean[] zArr = new boolean[1];
            android.content.Intent intent = this.f89885b;
            zArr[0] = (intent == null || (appBrandUI2 = this.f89886c) == null) ? false : b(intent, appBrandUI2);
            this.f89884a = zArr;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUIAndroid12CloseAnimationWorkaround", "checkCloseAnimationWorkaroundPrecondition %s, fromAppMainTask:%b, isTaskRoot:%b", appBrandUI, java.lang.Boolean.valueOf(this.f89884a[0]), java.lang.Boolean.valueOf(appBrandUI.isTaskRoot()));
        if (!this.f89884a[0] || appBrandInitConfigWC == null) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = appBrandInitConfigWC.f47269b2;
        if (!(com.tencent.mm.plugin.appbrand.ui.u8.i(appBrandStatObject) == 1023 || com.tencent.mm.plugin.appbrand.ui.u8.i(appBrandStatObject) == 1223)) {
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject2 = appBrandInitConfigWC.f47269b2;
            if (!(com.tencent.mm.plugin.appbrand.ui.u8.i(appBrandStatObject2) == 1113 || com.tencent.mm.plugin.appbrand.ui.u8.i(appBrandStatObject2) == 1114)) {
                z17 = false;
                if (z17 && appBrandUI.isTaskRoot() && !appBrandUI.B && !appBrandUI.A && !appBrandUI.C && !appBrandUI.f89413q.f89445e && !appBrandUI.f89422z) {
                    currentWindowMetrics = appBrandUI.getWindowManager().getCurrentWindowMetrics();
                    maximumWindowMetrics = appBrandUI.getWindowManager().getMaximumWindowMetrics();
                    if (!(currentWindowMetrics.getBounds().width() >= maximumWindowMetrics.getBounds().width() || currentWindowMetrics.getBounds().height() < maximumWindowMetrics.getBounds().height()) && !com.tencent.mm.ui.bk.A()) {
                        if ((!com.tencent.mm.ui.bk.N(appBrandUI.getTaskId()) || com.tencent.mm.ui.bk.P(appBrandUI)) && com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI.f89437g.a(appBrandUI)) {
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
        currentWindowMetrics = appBrandUI.getWindowManager().getCurrentWindowMetrics();
        maximumWindowMetrics = appBrandUI.getWindowManager().getMaximumWindowMetrics();
        if (!(currentWindowMetrics.getBounds().width() >= maximumWindowMetrics.getBounds().width() || currentWindowMetrics.getBounds().height() < maximumWindowMetrics.getBounds().height())) {
            if (!com.tencent.mm.ui.bk.N(appBrandUI.getTaskId()) || com.tencent.mm.ui.bk.P(appBrandUI)) {
            }
        }
        return false;
    }

    public void c(com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI, android.content.Intent intent) {
        android.content.Intent intent2;
        com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI2;
        try {
            if (intent == null) {
                this.f89884a = new boolean[]{false};
            } else if (com.tencent.mm.sdk.platformtools.c2.g(intent, "key_appbrand_source_android_task_id", 0) != appBrandUI.getTaskId()) {
                this.f89884a = null;
            } else if (this.f89884a == null && (intent2 = this.f89885b) != null && (appBrandUI2 = this.f89886c) != null) {
                this.f89884a = new boolean[]{b(intent2, appBrandUI2)};
            }
        } finally {
            this.f89885b = intent;
            this.f89886c = appBrandUI;
        }
    }
}
