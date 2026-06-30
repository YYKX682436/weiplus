package hy2;

/* loaded from: classes10.dex */
public final class h implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f f367592d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f c15485xead19c2f) {
        this.f367592d = c15485xead19c2f;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        boolean z17 = activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f c15485xead19c2f = this.f367592d;
        if (z17 || c15485xead19c2f.f218266g.contains(activity.getClass())) {
            if (c15485xead19c2f.Q6()) {
                jz2.x0.f384287a.b(activity);
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TEEN_MODE_ENJOY_IS_CURFEW_CLOSE_BOOLEAN_SYNC;
            if (!c17.o(u3Var, false) || c15485xead19c2f.R6()) {
                return;
            }
            gm0.j1.u().c().x(u3Var, java.lang.Boolean.FALSE);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) {
            jz2.x0.f384287a.b(activity);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f c15485xead19c2f = this.f367592d;
            if (c15485xead19c2f.f218271o <= 0) {
                com.p314xaae8f345.mm.app.w.INSTANCE.p(c15485xead19c2f);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f.N6(this.f367592d, activity)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f c15485xead19c2f = this.f367592d;
            if (!c15485xead19c2f.Q6()) {
                c15485xead19c2f.V6();
                return;
            }
            c15485xead19c2f.f218271o++;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTeenModeLimitVM", "handleFinderUIStart enjoyFinderMs:" + c15485xead19c2f.f218268i + ", enterRefCount:" + c15485xead19c2f.f218271o);
            if (c15485xead19c2f.f218271o == 1) {
                c15485xead19c2f.f218269m = c01.id.c();
                c15485xead19c2f.f218268i = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TEEN_MODE_ENJOY_TIME_LONG_SYNC, 0L);
                com.p314xaae8f345.mm.app.w.INSTANCE.a(c15485xead19c2f);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTeenModeLimitVM", "startCheckTeenModeTimer enjoyFinderMs:" + c15485xead19c2f.f218268i);
                hy2.o oVar = c15485xead19c2f.f218264e;
                oVar.f367603b = new hy2.j(c15485xead19c2f);
                if (oVar.f367602a == null) {
                    oVar.f367602a = ((ku5.t0) ku5.t0.f394148d).d(new hy2.n(oVar), 500L, 60000L);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f c15485xead19c2f = this.f367592d;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f.N6(c15485xead19c2f, activity)) {
            if (!c15485xead19c2f.Q6()) {
                c15485xead19c2f.V6();
                return;
            }
            c15485xead19c2f.f218271o--;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTeenModeLimitVM", "handleFinderUIStop enjoyFinderMs:" + c15485xead19c2f.f218268i + ", enterRefCount:" + c15485xead19c2f.f218271o);
            if (c15485xead19c2f.f218271o <= 0) {
                c15485xead19c2f.T6();
                c15485xead19c2f.V6();
            }
        }
    }
}
