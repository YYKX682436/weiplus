package com.p314xaae8f345.mm.p849xbf8d97c1;

/* loaded from: classes12.dex */
public class v implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.f f150381d = null;

    public v(com.p314xaae8f345.mm.p849xbf8d97c1.o oVar) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.x xVar;
        if (this.f150381d == null && ih.d.c() && (xVar = (com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.x) ih.d.d().a(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.x.class)) != null) {
            this.f150381d = xVar.f134534i;
        }
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.f fVar = this.f150381d;
        if (fVar != null) {
            fVar.c(activity);
            fVar.f134518j.postDelayed(new com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.d(fVar), 2000L);
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
