package gt2;

/* loaded from: classes10.dex */
public final class b implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gt2.d f356910d;

    public b(gt2.d dVar) {
        this.f356910d = dVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.String name = activity.getClass().getName();
        gt2.d dVar = this.f356910d;
        if (dVar.a(activity) > 0) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = dVar.f356913a;
            gt2.a aVar = (gt2.a) concurrentHashMap.get(name);
            if (aVar != null) {
                aVar.f356908c = c01.id.c();
                dVar.b(name, aVar, "onDestroy");
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(concurrentHashMap).remove(name);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.String name = activity.getClass().getName();
        gt2.d dVar = this.f356910d;
        if (dVar.f356913a.contains(name)) {
            return;
        }
        if (dVar.a(activity) > 0) {
            long c17 = c01.id.c();
            pf5.z zVar = pf5.z.f435481a;
            if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).c(zy2.ra.class))).V6();
            int a17 = dVar.a(activity);
            dVar.f356913a.put(name, new gt2.a(a17, c17, 0L, V6, 4, null));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProcessOutReporter", "onActivityResumed activity:" + name + " processId:" + a17 + " inTime:" + c17);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.String name = activity.getClass().getName();
        if (activity.isFinishing()) {
            gt2.d dVar = this.f356910d;
            if (dVar.a(activity) > 0) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = dVar.f356913a;
                gt2.a aVar = (gt2.a) concurrentHashMap.get(name);
                if (aVar != null) {
                    aVar.f356908c = c01.id.c();
                    dVar.b(name, aVar, "onStop");
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(concurrentHashMap).remove(name);
            }
        }
    }
}
