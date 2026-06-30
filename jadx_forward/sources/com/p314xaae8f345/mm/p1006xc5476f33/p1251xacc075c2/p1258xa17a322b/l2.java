package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b;

/* loaded from: classes5.dex */
public final class l2 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f174178b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f174179c;

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2 f174177a = new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f174180d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLong f174181e = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f174182f = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.C12847xc0f9a393 f174183g = new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.C12847xc0f9a393();

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.d2 f174184h = new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.d2();

    public final synchronized void a() {
        if (f174178b) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.RoamBackup.RoamServiceInitializer", "start basic initialize");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.a();
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.b2 b2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.b2.f174109d;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.t(b2Var, 5555L, null);
        f174178b = true;
    }

    public final synchronized void b() {
        if (f174179c) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.RoamBackup.RoamServiceInitializer", "start roam backup initialize");
        ho1.c.f364165a.a();
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.i2 i2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.i2.f174154d;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(i2Var, 8000L, false);
        ro1.t tVar = ro1.t.f479541d;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
        context.registerReceiver(ro1.t.f479544g, intentFilter);
        ku5.u0 u0Var2 = ku5.t0.f394148d;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.backup.roambackup.j2
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2.this.getClass();
                if (gm0.j1.a() && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.RoamBackup.RoamServiceInitializer", "initAutoBackupEventAsync");
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2.f174180d.compareAndSet(false, true)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.g(true, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.f2.f174128d);
                    }
                }
            }
        };
        ku5.t0 t0Var2 = (ku5.t0) u0Var2;
        t0Var2.getClass();
        t0Var2.t(runnable, 9110L, null);
        f174179c = true;
    }
}
