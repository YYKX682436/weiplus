package com.p314xaae8f345.mm.ui;

/* loaded from: classes7.dex */
public class mk implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r.a f290681d;

    public mk(r.a aVar) {
        this.f290681d = aVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        this.f290681d.mo1850x58b836e(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        com.p314xaae8f345.mm.ui.qk qkVar;
        java.util.WeakHashMap weakHashMap = com.p314xaae8f345.mm.ui.qk.f291107c;
        synchronized (weakHashMap) {
            qkVar = (com.p314xaae8f345.mm.ui.qk) weakHashMap.remove(activity);
        }
        if (qkVar != null) {
            synchronized (qkVar.f291108a) {
                ((java.util.HashSet) qkVar.f291108a).clear();
            }
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
        this.f290681d.mo1850x58b836e(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
    }
}
