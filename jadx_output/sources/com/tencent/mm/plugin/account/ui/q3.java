package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public final class q3 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f74129b;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Set f74131d;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.account.ui.q3 f74128a = new com.tencent.mm.plugin.account.ui.q3();

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.n3 f74130c = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    static {
        java.util.Set synchronizedSet = java.util.Collections.synchronizedSet(java.util.Collections.newSetFromMap(new java.util.WeakHashMap()));
        kotlin.jvm.internal.o.f(synchronizedSet, "synchronizedSet(...)");
        f74131d = synchronizedSet;
    }

    public static final boolean b(com.tencent.mm.modelbase.m1 m1Var) {
        return m1Var != null && (m1Var instanceof h11.e) && f74131d.contains(m1Var) && ((h11.e) m1Var).M() == 16;
    }

    public static final void c(android.app.Activity activity, com.tencent.mm.plugin.account.ui.l3 options) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(options, "options");
        if (activity.isFinishing()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LoginByMobileSendSmsLauncher", "start: activity invalid");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(options.f73997a)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LoginByMobileSendSmsLauncher", "start: fromMobile is empty");
            return;
        }
        if (f74129b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LoginByMobileSendSmsLauncher", "start: already in progress, skip");
            return;
        }
        f74129b = true;
        h11.e eVar = new h11.e(options.f73997a, 16, "", 0, "", 1);
        com.tencent.mm.plugin.account.ui.o3 o3Var = new com.tencent.mm.plugin.account.ui.o3(activity, options, eVar);
        f74131d.add(eVar);
        gm0.j1.d().a(145, o3Var);
        if (!gm0.j1.d().h(eVar, 0)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LoginByMobileSendSmsLauncher", "start: doScene enqueue failed, rollback");
            f74128a.a(o3Var, eVar);
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(activity, activity.getString(com.tencent.mm.R.string.f490573yv), activity.getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.account.ui.p3(o3Var, eVar));
        o3Var.f74081h = Q;
        if (o3Var.f74083m && Q != null && Q.isShowing()) {
            Q.dismiss();
        }
    }

    public final void a(com.tencent.mm.plugin.account.ui.o3 o3Var, h11.e eVar) {
        try {
            o3Var.a();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LoginByMobileSendSmsLauncher", "detach failed", th6);
        }
        gm0.j1.d().d(eVar);
        f74129b = false;
    }
}
