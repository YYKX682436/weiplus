package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class t4 extends ik1.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer f88964d;

    public t4(com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer appBrandRuntimeContainer) {
        this.f88964d = appBrandRuntimeContainer;
    }

    @Override // ik1.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer appBrandRuntimeContainer = this.f88964d;
        if (appBrandRuntimeContainer.w() == activity) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeContainer", "onActivityDestroyed %s", activity.getLocalClassName());
            appBrandRuntimeContainer.S();
        }
    }

    @Override // ik1.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer appBrandRuntimeContainer = this.f88964d;
        if (appBrandRuntimeContainer.w() == activity) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeContainer", "onActivityPaused %s", activity.getLocalClassName());
            appBrandRuntimeContainer.f74843v = false;
            appBrandRuntimeContainer.f74844w = true;
            appBrandRuntimeContainer.getOrientationHandler().onPause();
        }
    }

    @Override // ik1.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer appBrandRuntimeContainer = this.f88964d;
        if (appBrandRuntimeContainer.w() == activity) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeContainer", "onActivityResumed %s", activity.getLocalClassName());
            appBrandRuntimeContainer.f74843v = true;
            appBrandRuntimeContainer.f74844w = false;
            appBrandRuntimeContainer.getOrientationHandler().onResume();
        }
    }
}
