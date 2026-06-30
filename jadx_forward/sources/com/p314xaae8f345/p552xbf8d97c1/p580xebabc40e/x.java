package com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e;

/* loaded from: classes12.dex */
public class x extends qi.b {

    /* renamed from: h, reason: collision with root package name */
    public final wi.c f134533h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.f f134534i = null;

    public x(wi.c cVar) {
        this.f134533h = cVar;
    }

    @Override // qi.b, ei.a
    public void a(boolean z17) {
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.f fVar;
        oj.j.a("Matrix.ResourcePlugin", "onForeground: %s", java.lang.Boolean.valueOf(z17));
        if (!(this.f444988g == 2) || (fVar = this.f134534i) == null) {
            return;
        }
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.j jVar = fVar.f134514f;
        if (!z17) {
            long j17 = fVar.f134516h;
            oj.j.c("Matrix.ActivityRefWatcher", "we are in background, modify scan time[%sms].", java.lang.Long.valueOf(j17));
            jVar.f134532c = j17;
        } else {
            long j18 = fVar.f134517i;
            oj.j.c("Matrix.ActivityRefWatcher", "we are in foreground, modify scan time[%sms].", java.lang.Long.valueOf(j18));
            jVar.f134530a.removeCallbacksAndMessages(null);
            jVar.f134531b.removeCallbacksAndMessages(null);
            jVar.f134532c = j18;
            jVar.a(fVar.f134523o, 0);
        }
    }

    @Override // qi.b
    public java.lang.String b() {
        return "memory";
    }

    @Override // qi.b
    public void c(android.app.Application application, qi.c cVar) {
        super.c(application, cVar);
        this.f134534i = new com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.f(application, this);
    }

    @Override // qi.b
    public void e() {
        super.e();
        if (!this.f444987f) {
            oj.j.b("Matrix.ResourcePlugin", "ResourcePlugin start, ResourcePlugin is not supported, just return", new java.lang.Object[0]);
            return;
        }
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.f fVar = this.f134534i;
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.x xVar = fVar.f134513e;
        android.app.Application application = xVar.f444986e;
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = fVar.f134522n;
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.j jVar = fVar.f134514f;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            jVar.f134530a.removeCallbacksAndMessages(null);
            jVar.f134531b.removeCallbacksAndMessages(null);
            fVar.f134519k.clear();
        }
        android.app.Application application2 = xVar.f444986e;
        if (application2 != null) {
            application2.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
            jVar.a(fVar.f134523o, 0);
            oj.j.c("Matrix.ActivityRefWatcher", "watcher is started.", new java.lang.Object[0]);
        }
        oj.g.a().post(new com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.w(this));
    }
}
