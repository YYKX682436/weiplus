package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public class z0 implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Queue f90629d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f90630e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f90631f = false;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Application f90632g;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        int i17 = this.f90630e + 1;
        this.f90630e = i17;
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppSingletonRegistry", "AppSingletonRegistry.notifyOnActivityCreated ");
            java.util.Iterator it = this.f90629d.iterator();
            while (it.hasNext()) {
                ((jk1.a) ((com.tencent.mm.plugin.appbrand.utils.y0) it.next())).a(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        android.app.Application application;
        int i17 = this.f90630e - 1;
        this.f90630e = i17;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppSingletonRegistry", "AppSingletonRegistry.notifyOnNoActivityLeft ");
            java.util.Queue queue = this.f90629d;
            java.util.Iterator it = queue.iterator();
            while (it.hasNext()) {
                ((jk1.a) ((com.tencent.mm.plugin.appbrand.utils.y0) it.next())).h();
            }
            if (!this.f90631f || (application = this.f90632g) == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppSingletonRegistry", "AppSingletonRegistry.release ");
            application.unregisterActivityLifecycleCallbacks(this);
            ((java.util.LinkedList) queue).clear();
            this.f90631f = false;
            this.f90632g = null;
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
