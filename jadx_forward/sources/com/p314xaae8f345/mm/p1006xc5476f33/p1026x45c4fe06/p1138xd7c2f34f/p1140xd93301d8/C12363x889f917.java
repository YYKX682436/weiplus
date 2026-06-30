package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.ClientLaunchEntry$1Observer */
/* loaded from: classes7.dex */
class C12363x889f917 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12573x6a664d3b> implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Application f166464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f166465e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12363x889f917(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.q qVar, android.content.Context context, java.lang.ref.WeakReference weakReference) {
        super(com.p314xaae8f345.mm.app.a0.f134821d);
        this.f166465e = weakReference;
        android.app.Application application = (android.app.Application) context.getApplicationContext();
        this.f166464d = application;
        mo48813x58998cd();
        application.registerActivityLifecycleCallbacks(this);
        this.f39173x3fe91575 = 551436157;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12573x6a664d3b c12573x6a664d3b) {
        android.app.Activity activity = (android.app.Activity) this.f166465e.get();
        if (activity != null) {
            activity.moveTaskToBack(true);
        }
        mo48814x2efc64();
        this.f166464d.unregisterActivityLifecycleCallbacks(this);
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        if (activity == this.f166465e.get()) {
            mo48814x2efc64();
            this.f166464d.unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        if (activity == this.f166465e.get()) {
            mo48814x2efc64();
            this.f166464d.unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        if (activity == this.f166465e.get()) {
            mo48814x2efc64();
            this.f166464d.unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
    }
}
