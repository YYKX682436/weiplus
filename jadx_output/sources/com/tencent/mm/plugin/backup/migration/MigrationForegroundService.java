package com.tencent.mm.plugin.backup.migration;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/backup/migration/MigrationForegroundService;", "Landroid/app/Service;", "Lyn1/m;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class MigrationForegroundService extends android.app.Service implements yn1.m {

    /* renamed from: d, reason: collision with root package name */
    public static android.content.Intent f92546d;

    /* renamed from: e, reason: collision with root package name */
    public static android.app.NotificationManager f92547e;

    /* renamed from: f, reason: collision with root package name */
    public static z2.k0 f92548f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f92549g;

    @Override // yn1.m
    public void E2() {
        java.lang.String string;
        boolean l17 = yn1.z0.f463933a.l();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        bw5.o0 o0Var = yn1.z0.f463939g;
        if (o0Var == null) {
            kotlin.jvm.internal.o.o("progressModel");
            throw null;
        }
        float f17 = o0Var.f30864f;
        if (o0Var == null) {
            kotlin.jvm.internal.o.o("progressModel");
            throw null;
        }
        long j17 = o0Var.f30865g;
        if (f17 <= 0.0f || j17 <= 0) {
            java.lang.String string2 = context.getString(l17 ? com.tencent.mm.R.string.o9a : com.tencent.mm.R.string.o9j);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            pm0.v.X(new yn1.i0(string2));
            return;
        }
        java.lang.String S1 = com.tencent.mm.sdk.platformtools.t8.S1(f17);
        if (j17 > 3600) {
            long j18 = j17 / 3600;
            if (j18 > 999) {
                j18 = 999;
            }
            string = context.getString(l17 ? com.tencent.mm.R.string.o99 : com.tencent.mm.R.string.o9h, java.lang.Long.valueOf(j18), S1);
        } else {
            long j19 = j17 / 60;
            if (j19 < 1) {
                j19 = 1;
            }
            string = context.getString(l17 ? com.tencent.mm.R.string.o9_ : com.tencent.mm.R.string.o9i, java.lang.Long.valueOf(j19), S1);
        }
        kotlin.jvm.internal.o.d(string);
        pm0.v.X(new yn1.i0(string));
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.tencent.mars.xlog.Log.i("MicroMsg.MigrationForegroundService", "onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        yn1.z0.f463933a.u(this);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MigrationForegroundService", "onStartCommand");
        int i19 = android.os.Build.VERSION.SDK_INT;
        if (i19 >= 26) {
            android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("MigrationFSChannel", "Migration Foreground Service Channel", 2);
            notificationChannel.enableLights(false);
            notificationChannel.enableVibration(false);
            android.app.NotificationManager notificationManager = (android.app.NotificationManager) getSystemService(android.app.NotificationManager.class);
            f92547e = notificationManager;
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(this, 0, new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.backup.migration.MigrationActivity.class), 201326592);
        z2.k0 k0Var = new z2.k0(this, "MigrationFSChannel");
        k0Var.f(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.o9t));
        k0Var.D.icon = com.tencent.mm.R.drawable.c7v;
        k0Var.f469463g = activity;
        k0Var.h(2, true);
        k0Var.g(0);
        f92548f = k0Var;
        if (i19 >= 31) {
            k0Var.B = 1;
        }
        if (fp.h.c(30)) {
            z2.k0 k0Var2 = f92548f;
            if (k0Var2 == null) {
                kotlin.jvm.internal.o.o("notificationBuilder");
                throw null;
            }
            startForeground(539298089, k0Var2.b(), 1);
        } else {
            z2.k0 k0Var3 = f92548f;
            if (k0Var3 == null) {
                kotlin.jvm.internal.o.o("notificationBuilder");
                throw null;
            }
            startForeground(539298089, k0Var3.b());
        }
        yn1.z0.f463933a.q(this);
        return 2;
    }
}
