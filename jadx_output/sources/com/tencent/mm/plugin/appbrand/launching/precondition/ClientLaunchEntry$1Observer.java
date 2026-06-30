package com.tencent.mm.plugin.appbrand.launching.precondition;

/* loaded from: classes7.dex */
class ClientLaunchEntry$1Observer extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.appbrand.service.AppBrandUIEnterAnimationCompleteEvent> implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Application f84931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f84932e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientLaunchEntry$1Observer(com.tencent.mm.plugin.appbrand.launching.precondition.q qVar, android.content.Context context, java.lang.ref.WeakReference weakReference) {
        super(com.tencent.mm.app.a0.f53288d);
        this.f84932e = weakReference;
        android.app.Application application = (android.app.Application) context.getApplicationContext();
        this.f84931d = application;
        alive();
        application.registerActivityLifecycleCallbacks(this);
        this.__eventId = 551436157;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.plugin.appbrand.service.AppBrandUIEnterAnimationCompleteEvent appBrandUIEnterAnimationCompleteEvent) {
        android.app.Activity activity = (android.app.Activity) this.f84932e.get();
        if (activity != null) {
            activity.moveTaskToBack(true);
        }
        dead();
        this.f84931d.unregisterActivityLifecycleCallbacks(this);
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        if (activity == this.f84932e.get()) {
            dead();
            this.f84931d.unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        if (activity == this.f84932e.get()) {
            dead();
            this.f84931d.unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        if (activity == this.f84932e.get()) {
            dead();
            this.f84931d.unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
    }
}
