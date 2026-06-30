package com.tencent.matrix.resource.watcher;

/* loaded from: classes12.dex */
public class b extends com.tencent.matrix.lifecycle.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.resource.watcher.f f52974d;

    public b(com.tencent.matrix.resource.watcher.f fVar) {
        this.f52974d = fVar;
    }

    @Override // com.tencent.matrix.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        com.tencent.matrix.resource.watcher.f fVar = this.f52974d;
        fVar.getClass();
        java.lang.String name = activity.getClass().getName();
        wi.b bVar = fVar.f52988m;
        if (bVar == wi.b.NO_DUMP || bVar == wi.b.AUTO_DUMP) {
            fVar.f52980e.f53000h.getClass();
            if (fVar.a(name)) {
                oj.j.c("Matrix.ActivityRefWatcher", "activity leak with name %s had published, just ignore", name);
                this.f52974d.f52985j.postDelayed(new com.tencent.matrix.resource.watcher.a(this), 2000L);
            }
        }
        fVar.f52986k.add(com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo.newInstance(name, activity));
        synchronized (fVar.f52986k) {
            fVar.f52986k.notifyAll();
        }
        oj.j.a("Matrix.ActivityRefWatcher", "mDestroyedActivityInfos add %s", name);
        this.f52974d.f52985j.postDelayed(new com.tencent.matrix.resource.watcher.a(this), 2000L);
    }
}
