package com.tencent.mm.plugin.backup.roambackup.service;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/service/RoamForegroundService;", "Landroid/app/Service;", "<init>", "()V", "no1/c", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class RoamForegroundService extends android.app.Service {

    /* renamed from: g, reason: collision with root package name */
    public static android.content.Intent f92725g;

    /* renamed from: h, reason: collision with root package name */
    public static android.app.NotificationManager f92726h;

    /* renamed from: d, reason: collision with root package name */
    public z2.k0 f92728d;

    /* renamed from: e, reason: collision with root package name */
    public final no1.d f92729e = new no1.d(this);

    /* renamed from: f, reason: collision with root package name */
    public static final no1.c f92724f = new no1.c(null);

    /* renamed from: i, reason: collision with root package name */
    public static final mv.a0 f92727i = (mv.a0) i95.n0.c(mv.a0.class);

    public final android.app.PendingIntent a() {
        mv.e0 e0Var;
        android.content.Intent intent;
        nv.v1 v1Var = (nv.v1) f92727i;
        synchronized (v1Var) {
            synchronized (v1Var.f340401d) {
                e0Var = (mv.e0) v1Var.f340401d.peek();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.TaskStatusService", "[getIntentByInfo] topInfo=" + e0Var);
            if (((com.tencent.mm.plugin.backup.roambackup.p1) ((mv.y) i95.n0.c(mv.y.class))).Ui()) {
                intent = new android.content.Intent().setClassName(com.tencent.mm.sdk.platformtools.x2.f193071a, "com.tencent.mm.ui.LauncherUI");
                kotlin.jvm.internal.o.f(intent, "setClassName(...)");
                intent.addFlags(335544320);
                intent.putExtra("nofification_type", "back_foreground_service_click");
            } else {
                intent = null;
            }
        }
        if (intent == null) {
            return null;
        }
        return android.app.PendingIntent.getActivity(this, 0, intent, 167772160);
    }

    public final void b(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        z2.k0 k0Var = this.f92728d;
        if (k0Var == null) {
            kotlin.jvm.internal.o.o("notificationBuilder");
            throw null;
        }
        k0Var.e(text);
        k0Var.f469463g = a();
        android.app.NotificationManager notificationManager = f92726h;
        if (notificationManager == null) {
            kotlin.jvm.internal.o.o("notificationManager");
            throw null;
        }
        z2.k0 k0Var2 = this.f92728d;
        if (k0Var2 != null) {
            notificationManager.notify(539232009, k0Var2.b());
        } else {
            kotlin.jvm.internal.o.o("notificationBuilder");
            throw null;
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.tencent.mars.xlog.Log.i("MircoMsg.RoamForegroundService", "onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MircoMsg.RoamForegroundService", "onDestroy");
        super.onDestroy();
        no1.d listener = this.f92729e;
        nv.v1 v1Var = (nv.v1) f92727i;
        synchronized (v1Var) {
            kotlin.jvm.internal.o.g(listener, "listener");
            v1Var.f340402e.remove(listener);
        }
        android.app.NotificationManager notificationManager = f92726h;
        if (notificationManager == null) {
            kotlin.jvm.internal.o.o("notificationManager");
            throw null;
        }
        notificationManager.cancel(539232009);
        stopForeground(1);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MircoMsg.RoamForegroundService", "onStartCommand");
        java.lang.Object systemService = getSystemService((java.lang.Class<java.lang.Object>) android.app.NotificationManager.class);
        kotlin.jvm.internal.o.f(systemService, "getSystemService(...)");
        f92726h = (android.app.NotificationManager) systemService;
        int i19 = android.os.Build.VERSION.SDK_INT;
        if (i19 >= 26) {
            android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("ForegroundServiceChannel", "Roam Foreground Service Channel", 2);
            notificationChannel.enableLights(false);
            notificationChannel.enableVibration(false);
            android.app.NotificationManager notificationManager = f92726h;
            if (notificationManager == null) {
                kotlin.jvm.internal.o.o("notificationManager");
                throw null;
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
        z2.k0 k0Var = new z2.k0(this, "ForegroundServiceChannel");
        k0Var.f(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.a7p));
        k0Var.D.icon = com.tencent.mm.R.drawable.c7v;
        k0Var.f469463g = a();
        k0Var.h(2, true);
        k0Var.g(0);
        this.f92728d = k0Var;
        if (i19 >= 31) {
            k0Var.B = 1;
        }
        if (fp.h.c(30)) {
            z2.k0 k0Var2 = this.f92728d;
            if (k0Var2 == null) {
                kotlin.jvm.internal.o.o("notificationBuilder");
                throw null;
            }
            startForeground(539232009, k0Var2.b(), 1);
        } else {
            z2.k0 k0Var3 = this.f92728d;
            if (k0Var3 == null) {
                kotlin.jvm.internal.o.o("notificationBuilder");
                throw null;
            }
            startForeground(539232009, k0Var3.b());
        }
        ((nv.v1) f92727i).Ni(this.f92729e);
        return 2;
    }
}
