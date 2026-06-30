package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1261x7643c6b5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/service/RoamForegroundService;", "Landroid/app/Service;", "<init>", "()V", "no1/c", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.backup.roambackup.service.RoamForegroundService */
/* loaded from: classes11.dex */
public final class ServiceC12852xd025bba9 extends android.app.Service {

    /* renamed from: g, reason: collision with root package name */
    public static android.content.Intent f174258g;

    /* renamed from: h, reason: collision with root package name */
    public static android.app.NotificationManager f174259h;

    /* renamed from: d, reason: collision with root package name */
    public z2.k0 f174261d;

    /* renamed from: e, reason: collision with root package name */
    public final no1.d f174262e = new no1.d(this);

    /* renamed from: f, reason: collision with root package name */
    public static final no1.c f174257f = new no1.c(null);

    /* renamed from: i, reason: collision with root package name */
    public static final mv.a0 f174260i = (mv.a0) i95.n0.c(mv.a0.class);

    public final android.app.PendingIntent a() {
        mv.e0 e0Var;
        android.content.Intent intent;
        nv.v1 v1Var = (nv.v1) f174260i;
        synchronized (v1Var) {
            synchronized (v1Var.f421934d) {
                e0Var = (mv.e0) v1Var.f421934d.peek();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.TaskStatusService", "[getIntentByInfo] topInfo=" + e0Var);
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1) ((mv.y) i95.n0.c(mv.y.class))).Ui()) {
                intent = new android.content.Intent().setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "com.tencent.mm.ui.LauncherUI");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(intent, "setClassName(...)");
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        z2.k0 k0Var = this.f174261d;
        if (k0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("notificationBuilder");
            throw null;
        }
        k0Var.e(text);
        k0Var.f550996g = a();
        android.app.NotificationManager notificationManager = f174259h;
        if (notificationManager == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("notificationManager");
            throw null;
        }
        z2.k0 k0Var2 = this.f174261d;
        if (k0Var2 != null) {
            notificationManager.notify(539232009, k0Var2.b());
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("notificationBuilder");
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.RoamForegroundService", "onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.RoamForegroundService", "onDestroy");
        super.onDestroy();
        no1.d listener = this.f174262e;
        nv.v1 v1Var = (nv.v1) f174260i;
        synchronized (v1Var) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
            v1Var.f421935e.remove(listener);
        }
        android.app.NotificationManager notificationManager = f174259h;
        if (notificationManager == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("notificationManager");
            throw null;
        }
        notificationManager.cancel(539232009);
        stopForeground(1);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.RoamForegroundService", "onStartCommand");
        java.lang.Object systemService = getSystemService((java.lang.Class<java.lang.Object>) android.app.NotificationManager.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(systemService, "getSystemService(...)");
        f174259h = (android.app.NotificationManager) systemService;
        int i19 = android.os.Build.VERSION.SDK_INT;
        if (i19 >= 26) {
            android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("ForegroundServiceChannel", "Roam Foreground Service Channel", 2);
            notificationChannel.enableLights(false);
            notificationChannel.enableVibration(false);
            android.app.NotificationManager notificationManager = f174259h;
            if (notificationManager == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("notificationManager");
                throw null;
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
        z2.k0 k0Var = new z2.k0(this, "ForegroundServiceChannel");
        k0Var.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a7p));
        k0Var.D.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
        k0Var.f550996g = a();
        k0Var.h(2, true);
        k0Var.g(0);
        this.f174261d = k0Var;
        if (i19 >= 31) {
            k0Var.B = 1;
        }
        if (fp.h.c(30)) {
            z2.k0 k0Var2 = this.f174261d;
            if (k0Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("notificationBuilder");
                throw null;
            }
            startForeground(539232009, k0Var2.b(), 1);
        } else {
            z2.k0 k0Var3 = this.f174261d;
            if (k0Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("notificationBuilder");
                throw null;
            }
            startForeground(539232009, k0Var3.b());
        }
        ((nv.v1) f174260i).Ni(this.f174262e);
        return 2;
    }
}
