package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.app.s1 f75268a = new com.tencent.mm.plugin.appbrand.app.s1();

    public final boolean a(android.app.ActivityManager.AppTask appTask) {
        android.content.Intent intent;
        android.content.ComponentName component;
        kotlin.jvm.internal.o.g(appTask, "appTask");
        android.app.ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
        if (taskInfo != null && (intent = taskInfo.baseIntent) != null && !kotlin.jvm.internal.o.b(intent.getAction(), "android.intent.action.MAIN")) {
            java.util.Set<java.lang.String> categories = intent.getCategories();
            if ((categories != null && categories.contains("android.intent.category.LAUNCHER")) || (component = intent.getComponent()) == null) {
                return false;
            }
            java.lang.String className = component.getClassName();
            kotlin.jvm.internal.o.f(className, "getClassName(...)");
            if (r26.i0.y(className, com.tencent.mm.plugin.appbrand.ui.AppBrandUI.class.getName(), false)) {
                return true;
            }
            if (com.tencent.mm.plugin.appbrand.app.g2.f75095m) {
                java.lang.String className2 = component.getClassName();
                kotlin.jvm.internal.o.f(className2, "getClassName(...)");
                if (r26.i0.y(className2, com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI.class.getName(), false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
