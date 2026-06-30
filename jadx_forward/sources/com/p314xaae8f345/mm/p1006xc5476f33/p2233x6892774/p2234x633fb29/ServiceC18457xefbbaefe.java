package com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29;

/* renamed from: com.tencent.mm.plugin.sport.model.SportForegroundService */
/* loaded from: classes12.dex */
public class ServiceC18457xefbbaefe extends android.app.Service {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f253301e;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f253302d;

    public static void a() {
        if (fp.h.c(26)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.SportForegroundService", "stopSportForegroundService");
            f253301e = false;
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.stopService(new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.ServiceC18457xefbbaefe.class));
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.SportForegroundService", "onDestroy");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f253302d;
        if (n3Var != null) {
            n3Var.mo50302x6b17ad39(null);
        }
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.SportForegroundService", "onStartCommand %d", java.lang.Integer.valueOf(i18));
        if (!fp.h.c(26)) {
            return 2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.SportForegroundService", "onStartCommand startForeground");
        f253301e = true;
        android.app.Notification.Builder builder = new android.app.Notification.Builder(getApplicationContext(), "reminder_channel_id");
        builder.setContentTitle(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jjj)).setWhen(java.lang.System.currentTimeMillis());
        try {
            z2.y1.a(this, 419430, builder.build(), android.os.Build.VERSION.SDK_INT >= 34 ? 256 : 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.SportForegroundService", "start foreground service happened error %s", e17.getMessage());
        }
        ((ue4.r) i95.n0.c(ue4.r.class)).Bi().a();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f253302d = n3Var;
        n3Var.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.v(this), p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d);
        return 2;
    }
}
