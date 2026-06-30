package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public final class n0 implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f88123e;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.report.n0 f88122d = new com.tencent.mm.plugin.appbrand.report.n0();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f88124f = new java.util.LinkedHashMap();

    public final com.tencent.mm.plugin.appbrand.report.AppBrandLauncherDesktopReporter a(androidx.fragment.app.FragmentActivity activity) {
        com.tencent.mm.plugin.appbrand.report.AppBrandLauncherDesktopReporter appBrandLauncherDesktopReporter;
        kotlin.jvm.internal.o.g(activity, "activity");
        java.util.Map map = f88124f;
        synchronized (map) {
            if (!f88123e) {
                activity.getApplication().registerActivityLifecycleCallbacks(this);
                f88123e = true;
            }
            appBrandLauncherDesktopReporter = (com.tencent.mm.plugin.appbrand.report.AppBrandLauncherDesktopReporter) ((java.util.LinkedHashMap) map).get(activity);
            if (appBrandLauncherDesktopReporter == null) {
                appBrandLauncherDesktopReporter = new com.tencent.mm.plugin.appbrand.report.AppBrandLauncherDesktopReporter();
                map.put(activity, appBrandLauncherDesktopReporter);
            }
        }
        return appBrandLauncherDesktopReporter;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        java.util.Map map = f88124f;
        synchronized (map) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }
}
