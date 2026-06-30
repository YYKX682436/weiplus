package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public final class q3 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f155662b;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Set f155664d;

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.q3 f155661a = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.q3();

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f155663c = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    static {
        java.util.Set synchronizedSet = java.util.Collections.synchronizedSet(java.util.Collections.newSetFromMap(new java.util.WeakHashMap()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(synchronizedSet, "synchronizedSet(...)");
        f155664d = synchronizedSet;
    }

    public static final boolean b(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return m1Var != null && (m1Var instanceof h11.e) && f155664d.contains(m1Var) && ((h11.e) m1Var).M() == 16;
    }

    public static final void c(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.l3 options) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(options, "options");
        if (activity.isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LoginByMobileSendSmsLauncher", "start: activity invalid");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(options.f155530a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LoginByMobileSendSmsLauncher", "start: fromMobile is empty");
            return;
        }
        if (f155662b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginByMobileSendSmsLauncher", "start: already in progress, skip");
            return;
        }
        f155662b = true;
        h11.e eVar = new h11.e(options.f155530a, 16, "", 0, "", 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.o3 o3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.o3(activity, options, eVar);
        f155664d.add(eVar);
        gm0.j1.d().a(145, o3Var);
        if (!gm0.j1.d().h(eVar, 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LoginByMobileSendSmsLauncher", "start: doScene enqueue failed, rollback");
            f155661a.a(o3Var, eVar);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.p3(o3Var, eVar));
        o3Var.f155614h = Q;
        if (o3Var.f155616m && Q != null && Q.isShowing()) {
            Q.dismiss();
        }
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.o3 o3Var, h11.e eVar) {
        try {
            o3Var.a();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LoginByMobileSendSmsLauncher", "detach failed", th6);
        }
        gm0.j1.d().d(eVar);
        f155662b = false;
    }
}
