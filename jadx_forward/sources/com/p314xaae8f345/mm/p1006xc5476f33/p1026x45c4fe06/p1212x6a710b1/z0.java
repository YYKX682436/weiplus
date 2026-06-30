package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public class z0 implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Queue f172162d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f172163e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f172164f = false;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Application f172165g;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        int i17 = this.f172163e + 1;
        this.f172163e = i17;
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppSingletonRegistry", "AppSingletonRegistry.notifyOnActivityCreated ");
            java.util.Iterator it = this.f172162d.iterator();
            while (it.hasNext()) {
                ((jk1.a) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y0) it.next())).a(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        android.app.Application application;
        int i17 = this.f172163e - 1;
        this.f172163e = i17;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppSingletonRegistry", "AppSingletonRegistry.notifyOnNoActivityLeft ");
            java.util.Queue queue = this.f172162d;
            java.util.Iterator it = queue.iterator();
            while (it.hasNext()) {
                ((jk1.a) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y0) it.next())).h();
            }
            if (!this.f172164f || (application = this.f172165g) == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppSingletonRegistry", "AppSingletonRegistry.release ");
            application.unregisterActivityLifecycleCallbacks(this);
            ((java.util.LinkedList) queue).clear();
            this.f172164f = false;
            this.f172165g = null;
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
