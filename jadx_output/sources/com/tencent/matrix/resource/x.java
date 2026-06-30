package com.tencent.matrix.resource;

/* loaded from: classes12.dex */
public class x extends qi.b {

    /* renamed from: h, reason: collision with root package name */
    public final wi.c f53000h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.matrix.resource.watcher.f f53001i = null;

    public x(wi.c cVar) {
        this.f53000h = cVar;
    }

    @Override // qi.b, ei.a
    public void a(boolean z17) {
        com.tencent.matrix.resource.watcher.f fVar;
        oj.j.a("Matrix.ResourcePlugin", "onForeground: %s", java.lang.Boolean.valueOf(z17));
        if (!(this.f363455g == 2) || (fVar = this.f53001i) == null) {
            return;
        }
        com.tencent.matrix.resource.watcher.j jVar = fVar.f52981f;
        if (!z17) {
            long j17 = fVar.f52983h;
            oj.j.c("Matrix.ActivityRefWatcher", "we are in background, modify scan time[%sms].", java.lang.Long.valueOf(j17));
            jVar.f52999c = j17;
        } else {
            long j18 = fVar.f52984i;
            oj.j.c("Matrix.ActivityRefWatcher", "we are in foreground, modify scan time[%sms].", java.lang.Long.valueOf(j18));
            jVar.f52997a.removeCallbacksAndMessages(null);
            jVar.f52998b.removeCallbacksAndMessages(null);
            jVar.f52999c = j18;
            jVar.a(fVar.f52990o, 0);
        }
    }

    @Override // qi.b
    public java.lang.String b() {
        return "memory";
    }

    @Override // qi.b
    public void c(android.app.Application application, qi.c cVar) {
        super.c(application, cVar);
        this.f53001i = new com.tencent.matrix.resource.watcher.f(application, this);
    }

    @Override // qi.b
    public void e() {
        super.e();
        if (!this.f363454f) {
            oj.j.b("Matrix.ResourcePlugin", "ResourcePlugin start, ResourcePlugin is not supported, just return", new java.lang.Object[0]);
            return;
        }
        com.tencent.matrix.resource.watcher.f fVar = this.f53001i;
        com.tencent.matrix.resource.x xVar = fVar.f52980e;
        android.app.Application application = xVar.f363453e;
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = fVar.f52989n;
        com.tencent.matrix.resource.watcher.j jVar = fVar.f52981f;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            jVar.f52997a.removeCallbacksAndMessages(null);
            jVar.f52998b.removeCallbacksAndMessages(null);
            fVar.f52986k.clear();
        }
        android.app.Application application2 = xVar.f363453e;
        if (application2 != null) {
            application2.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
            jVar.a(fVar.f52990o, 0);
            oj.j.c("Matrix.ActivityRefWatcher", "watcher is started.", new java.lang.Object[0]);
        }
        oj.g.a().post(new com.tencent.matrix.resource.w(this));
    }
}
