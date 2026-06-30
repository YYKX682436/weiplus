package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class l2 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f92645b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f92646c;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.backup.roambackup.l2 f92644a = new com.tencent.mm.plugin.backup.roambackup.l2();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f92647d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLong f92648e = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f92649f = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.backup.roambackup.RoamServiceInitializer$wifiEventReceiver$1 f92650g = new com.tencent.mm.plugin.backup.roambackup.RoamServiceInitializer$wifiEventReceiver$1();

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.plugin.backup.roambackup.d2 f92651h = new com.tencent.mm.plugin.backup.roambackup.d2();

    public final synchronized void a() {
        if (f92645b) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MM.RoamBackup.RoamServiceInitializer", "start basic initialize");
        com.tencent.mm.plugin.backup.roambackup.u.f92737a.a();
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.backup.roambackup.b2 b2Var = com.tencent.mm.plugin.backup.roambackup.b2.f92576d;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.t(b2Var, 5555L, null);
        f92645b = true;
    }

    public final synchronized void b() {
        if (f92646c) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MM.RoamBackup.RoamServiceInitializer", "start roam backup initialize");
        ho1.c.f282632a.a();
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.backup.roambackup.i2 i2Var = com.tencent.mm.plugin.backup.roambackup.i2.f92621d;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(i2Var, 8000L, false);
        ro1.t tVar = ro1.t.f398008d;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
        context.registerReceiver(ro1.t.f398011g, intentFilter);
        ku5.u0 u0Var2 = ku5.t0.f312615d;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.backup.roambackup.j2
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.backup.roambackup.l2.this.getClass();
                if (gm0.j1.a() && com.tencent.mm.sdk.platformtools.x2.n()) {
                    com.tencent.mars.xlog.Log.i("MM.RoamBackup.RoamServiceInitializer", "initAutoBackupEventAsync");
                    if (com.tencent.mm.plugin.backup.roambackup.l2.f92647d.compareAndSet(false, true)) {
                        com.tencent.mm.plugin.backup.roambackup.r0.f92684a.g(true, com.tencent.mm.plugin.backup.roambackup.f2.f92595d);
                    }
                }
            }
        };
        ku5.t0 t0Var2 = (ku5.t0) u0Var2;
        t0Var2.getClass();
        t0Var2.t(runnable, 9110L, null);
        f92646c = true;
    }
}
