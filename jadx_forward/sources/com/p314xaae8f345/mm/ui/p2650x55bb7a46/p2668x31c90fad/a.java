package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad;

/* loaded from: classes.dex */
public final class a implements com.p314xaae8f345.mm.app.v6 {
    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityCreated */
    public void mo9958x78cb4fa(android.app.Activity activity, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        bm5.m mVar = bm5.m.f104234a;
        ((jz5.n) bm5.m.f104236c).mo141623x754a37bb();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActivityStatusManager", "onActivityCreate[" + activity.getClass().getName() + "][" + mVar.f(activity) + ']');
        if (!r26.n0.N(r0)) {
            mVar.a("MMKVKey_CreatedActivity", activity);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActivityStatusManager", "[onActivityCreated] getCreatedActivities:".concat(kz5.n0.g0(mVar.c(), ";", null, null, 0, null, bm5.g.f104113d, 30, null)));
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityDestroyed */
    public void mo9959xa9f48fab(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        bm5.m mVar = bm5.m.f104234a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActivityStatusManager", "onActivityDestroy[" + activity.getClass().getName() + "][" + mVar.f(activity) + ']');
        if (!r26.n0.N(r1)) {
            mVar.h("MMKVKey_CreatedActivity", activity);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActivityStatusManager", "[onActivityDestroyed] getCreatedActivities:".concat(kz5.n0.g0(mVar.c(), ";", null, null, 0, null, bm5.h.f104115d, 30, null)));
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityPaused */
    public void mo27324x99a658dc(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        bm5.m mVar = bm5.m.f104234a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActivityStatusManager", "onActivityPaused[" + activity.getClass().getName() + "][" + mVar.f(activity) + ']');
        if (!r26.n0.N(r1)) {
            mVar.h("MMKVKey_ResumedActivity", activity);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActivityStatusManager", "[onActivityPaused] getResumedActivities:".concat(kz5.n0.g0(mVar.d(), ";", null, null, 0, null, bm5.i.f104223d, 30, null)));
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityResumed */
    public void mo27339xba973e9(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        bm5.m mVar = bm5.m.f104234a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActivityStatusManager", "onActivityResumed[" + activity.getClass().getName() + "][" + mVar.f(activity) + ']');
        if (!r26.n0.N(r1)) {
            mVar.a("MMKVKey_ResumedActivity", activity);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActivityStatusManager", "[onActivityResumed] getResumedActivities:".concat(kz5.n0.g0(mVar.d(), ";", null, null, 0, null, bm5.j.f104227d, 30, null)));
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivitySaveInstanceState */
    public void mo27340x634d9e11(android.app.Activity activity, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityStarted */
    public void mo27341x59297693(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        bm5.m mVar = bm5.m.f104234a;
        ((jz5.n) bm5.m.f104236c).mo141623x754a37bb();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActivityStatusManager", "onActivityStarted[" + activity.getClass().getName() + "][" + mVar.f(activity) + ']');
        if (!r26.n0.N(r1)) {
            mVar.a("MMKVKey_StartedActivity", activity);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActivityStatusManager", "[onActivityStarted] getStartedActivities:".concat(kz5.n0.g0(mVar.e(), ";", null, null, 0, null, bm5.k.f104229d, 30, null)));
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityStopped */
    public void mo27342x59edc7df(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        bm5.m mVar = bm5.m.f104234a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActivityStatusManager", "onActivityStopped[" + activity.getClass().getName() + "][" + mVar.f(activity) + ']');
        if (!r26.n0.N(r1)) {
            mVar.h("MMKVKey_StartedActivity", activity);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActivityStatusManager", "[onActivityStopped] getStartedActivities:".concat(kz5.n0.g0(mVar.e(), ";", null, null, 0, null, bm5.l.f104231d, 30, null)));
    }
}
