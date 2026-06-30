package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

/* loaded from: classes10.dex */
public final class a3 implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3 f207533d;

    public a3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3 l3Var) {
        this.f207533d = l3Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3 l3Var = this.f207533d;
        if (l3Var.Di(activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMultiTaskService", "onActivityCreated: non finder activity = ".concat(activity.getClass().getSimpleName()));
            l3Var.f207670w.add(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3 l3Var = this.f207533d;
        l3Var.f207669v.remove(activity);
        if (l3Var.f207670w.remove(activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMultiTaskService", "onActivityDestroyed: non finder activity same task activity = ".concat(activity.getClass().getSimpleName()));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f207533d.f207668u = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f207533d.f207668u = new java.lang.ref.WeakReference(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3 l3Var = this.f207533d;
        if (l3Var.Di(activity)) {
            java.util.Set set = l3Var.f207669v;
            if (set.contains(activity)) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMultiTaskService", "onNonFinderActivityForeground: activity = ".concat(activity.getClass().getSimpleName()));
            set.add(activity);
            l3Var.f207663p = 0L;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3 l3Var = this.f207533d;
        if (l3Var.Di(activity)) {
            java.util.Set set = l3Var.f207669v;
            set.remove(activity);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMultiTaskService", "onNonFinderActivityBackground: activity = ".concat(activity.getClass().getSimpleName()));
            if (set.size() == 0 && l3Var.f207665r.size() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMultiTaskService", "onNonFinderActivityBackground: record finder background timestamp");
                l3Var.f207663p = java.lang.System.currentTimeMillis();
            }
        }
    }
}
