package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

/* loaded from: classes10.dex */
public final class b3 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3 f207544a;

    public b3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3 l3Var) {
        this.f207544a = l3Var;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onEnterForeground */
    public void mo8896x832bee5c() {
        android.app.Activity activity;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMultiTaskService", "APP EnterForeground");
        java.lang.ref.WeakReference weakReference = this.f207544a.f207668u;
        if (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMultiTaskService", "globalTopActivity is null!");
            return;
        }
        i95.m c17 = i95.n0.c(zy2.gb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        au2.q qVar = (au2.q) ((zy2.gb) c17);
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderShortcutsService", "checkIfRemoveShortcut, account not ready, return!");
            return;
        }
        i95.m c18 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        dq.b bVar = ((cq.k) c18).f302759g;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = bVar.f323817a;
        boolean h17 = o4Var != null ? o4Var.h("kFinderIsShortcutsExistKey") : false;
        boolean Bi = qVar.Bi(activity);
        if (!h17 && Bi) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = bVar.f323817a;
            if (o4Var2 != null) {
                o4Var2.G("kFinderIsShortcutsExistKey", true);
            }
        } else if (h17 && !Bi) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var3 = bVar.f323817a;
            if (o4Var3 != null) {
                o4Var3.G("kFinderIsShortcutsExistKey", false);
            }
            i95.m c19 = i95.n0.c(dy1.r.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
            ((cy1.a) ((dy1.r) c19)).yj("finder_quick_remove", null, null, 1, true);
        }
        if (!(activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderShortcutsService", "currentActivity is not MMFinderUI!");
            return;
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderShortcutsService", "current Activity is MMLiveFinderUI, skip!");
            return;
        }
        i95.m c27 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) c27).Di(activity)) {
            pm0.v.X(new au2.o(qVar, activity, Bi));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderShortcutsService", "currentActivity is not in finder stack!");
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onExitForeground */
    public void mo8897xa55158c0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMultiTaskService", "APP ExitForeground");
        i95.m c17 = i95.n0.c(zy2.gb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((au2.q) ((zy2.gb) c17)).f95623h = -1;
    }
}
