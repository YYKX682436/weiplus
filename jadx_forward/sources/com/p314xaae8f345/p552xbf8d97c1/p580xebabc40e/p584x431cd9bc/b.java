package com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc;

/* loaded from: classes12.dex */
public class b extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.f f134507d;

    public b(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.f fVar) {
        this.f134507d = fVar;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.f fVar = this.f134507d;
        fVar.getClass();
        java.lang.String name = activity.getClass().getName();
        wi.b bVar = fVar.f134521m;
        if (bVar == wi.b.NO_DUMP || bVar == wi.b.AUTO_DUMP) {
            fVar.f134513e.f134533h.getClass();
            if (fVar.a(name)) {
                oj.j.c("Matrix.ActivityRefWatcher", "activity leak with name %s had published, just ignore", name);
                this.f134507d.f134518j.postDelayed(new com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.a(this), 2000L);
            }
        }
        fVar.f134519k.add(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p581xc2f04ca6.p582x633fb29.C4706x164388f6.m41233x6bff0255(name, activity));
        synchronized (fVar.f134519k) {
            fVar.f134519k.notifyAll();
        }
        oj.j.a("Matrix.ActivityRefWatcher", "mDestroyedActivityInfos add %s", name);
        this.f134507d.f134518j.postDelayed(new com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.a(this), 2000L);
    }
}
