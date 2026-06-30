package com.tencent.mm.matrix;

/* loaded from: classes12.dex */
public class v implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.matrix.resource.watcher.f f68848d = null;

    public v(com.tencent.mm.matrix.o oVar) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        com.tencent.matrix.resource.x xVar;
        if (this.f68848d == null && ih.d.c() && (xVar = (com.tencent.matrix.resource.x) ih.d.d().a(com.tencent.matrix.resource.x.class)) != null) {
            this.f68848d = xVar.f53001i;
        }
        com.tencent.matrix.resource.watcher.f fVar = this.f68848d;
        if (fVar != null) {
            fVar.c(activity);
            fVar.f52985j.postDelayed(new com.tencent.matrix.resource.watcher.d(fVar), 2000L);
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
