package et2;

/* loaded from: classes10.dex */
public final class b implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ et2.e f338111d;

    public b(et2.e eVar) {
        this.f338111d = eVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (activity instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity;
            et2.e eVar = this.f338111d;
            eVar.getClass();
            int hashCode = activityC21401x6ce6f73f.hashCode();
            java.lang.Integer num = (java.lang.Integer) eVar.f338118b.get(java.lang.Integer.valueOf(hashCode));
            if (num == null) {
                num = 0;
            }
            if (num.intValue() <= 0) {
                et2.d dVar = new et2.d(activityC21401x6ce6f73f, eVar, hashCode, null);
                p3325xe03a0797.p3326xc267989b.l.c(eVar.f338117a, oz5.m.f431862d, p3325xe03a0797.p3326xc267989b.a1.DEFAULT, dVar);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        int hashCode = activity.hashCode();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f338111d.f338118b;
        concurrentHashMap.remove(java.lang.Integer.valueOf(hashCode));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderJumpDataManager", "[clearTaskId] activityId=" + hashCode + ", taskIdMap.size=" + concurrentHashMap.size());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        et2.e eVar = this.f338111d;
        eVar.getClass();
        int hashCode = activity.hashCode();
        java.lang.Integer num = (java.lang.Integer) eVar.f338118b.get(java.lang.Integer.valueOf(hashCode));
        if (num == null) {
            return;
        }
        int intValue = num.intValue();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = eVar.f338119c;
        et2.a aVar = (et2.a) concurrentHashMap.get(java.lang.Integer.valueOf(intValue));
        if (aVar == null || aVar.f338110b != hashCode) {
            return;
        }
        concurrentHashMap.remove(java.lang.Integer.valueOf(intValue));
        java.util.HashMap hashMap = eVar.f338120d;
        if (((et2.f) hashMap.get(java.lang.Integer.valueOf(hashCode))) != null) {
            if (activity instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
                nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            } else {
                nyVar = null;
            }
            if (nyVar != null) {
                nyVar.B = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommonFeatureService", "[onClear] jumpInfo");
        }
        hashMap.remove(java.lang.Integer.valueOf(hashCode));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderJumpDataManager", "[clearIds] activityId=" + hashCode + ", sourceId=" + aVar.f338109a + " jumpDataMap.size=" + concurrentHashMap.size());
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
    }
}
