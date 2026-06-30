package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1256xcd3633ce;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/backup/migration/MigrationForegroundService;", "Landroid/app/Service;", "Lyn1/m;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.backup.migration.MigrationForegroundService */
/* loaded from: classes11.dex */
public final class ServiceC12841x401e91e4 extends android.app.Service implements yn1.m {

    /* renamed from: d, reason: collision with root package name */
    public static android.content.Intent f174079d;

    /* renamed from: e, reason: collision with root package name */
    public static android.app.NotificationManager f174080e;

    /* renamed from: f, reason: collision with root package name */
    public static z2.k0 f174081f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f174082g;

    @Override // yn1.m
    public void E2() {
        java.lang.String string;
        boolean l17 = yn1.z0.f545466a.l();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        bw5.o0 o0Var = yn1.z0.f545472g;
        if (o0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("progressModel");
            throw null;
        }
        float f17 = o0Var.f112397f;
        if (o0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("progressModel");
            throw null;
        }
        long j17 = o0Var.f112398g;
        if (f17 <= 0.0f || j17 <= 0) {
            java.lang.String string2 = context.getString(l17 ? com.p314xaae8f345.mm.R.C30867xcad56011.o9a : com.p314xaae8f345.mm.R.C30867xcad56011.o9j);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            pm0.v.X(new yn1.i0(string2));
            return;
        }
        java.lang.String S1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.S1(f17);
        if (j17 > 3600) {
            long j18 = j17 / 3600;
            if (j18 > 999) {
                j18 = 999;
            }
            string = context.getString(l17 ? com.p314xaae8f345.mm.R.C30867xcad56011.o99 : com.p314xaae8f345.mm.R.C30867xcad56011.o9h, java.lang.Long.valueOf(j18), S1);
        } else {
            long j19 = j17 / 60;
            if (j19 < 1) {
                j19 = 1;
            }
            string = context.getString(l17 ? com.p314xaae8f345.mm.R.C30867xcad56011.o9_ : com.p314xaae8f345.mm.R.C30867xcad56011.o9i, java.lang.Long.valueOf(j19), S1);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        pm0.v.X(new yn1.i0(string));
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MigrationForegroundService", "onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        yn1.z0.f545466a.u(this);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MigrationForegroundService", "onStartCommand");
        int i19 = android.os.Build.VERSION.SDK_INT;
        if (i19 >= 26) {
            android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("MigrationFSChannel", "Migration Foreground Service Channel", 2);
            notificationChannel.enableLights(false);
            notificationChannel.enableVibration(false);
            android.app.NotificationManager notificationManager = (android.app.NotificationManager) getSystemService(android.app.NotificationManager.class);
            f174080e = notificationManager;
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(this, 0, new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1256xcd3633ce.ActivityC12839xb44f1cdd.class), 201326592);
        z2.k0 k0Var = new z2.k0(this, "MigrationFSChannel");
        k0Var.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o9t));
        k0Var.D.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
        k0Var.f550996g = activity;
        k0Var.h(2, true);
        k0Var.g(0);
        f174081f = k0Var;
        if (i19 >= 31) {
            k0Var.B = 1;
        }
        if (fp.h.c(30)) {
            z2.k0 k0Var2 = f174081f;
            if (k0Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("notificationBuilder");
                throw null;
            }
            startForeground(539298089, k0Var2.b(), 1);
        } else {
            z2.k0 k0Var3 = f174081f;
            if (k0Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("notificationBuilder");
                throw null;
            }
            startForeground(539298089, k0Var3.b());
        }
        yn1.z0.f545466a.q(this);
        return 2;
    }
}
