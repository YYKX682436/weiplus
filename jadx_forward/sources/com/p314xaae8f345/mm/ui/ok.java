package com.p314xaae8f345.mm.ui;

/* loaded from: classes7.dex */
public class ok implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f291013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f291014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Application f291015f;

    public ok(com.p314xaae8f345.mm.ui.pk pkVar, android.app.Activity activity, android.view.View view, android.app.Application application) {
        this.f291013d = activity;
        this.f291014e = view;
        this.f291015f = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        if (this.f291013d == activity) {
            this.f291014e.setOnApplyWindowInsetsListener(null);
            this.f291015f.unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
    }
}
