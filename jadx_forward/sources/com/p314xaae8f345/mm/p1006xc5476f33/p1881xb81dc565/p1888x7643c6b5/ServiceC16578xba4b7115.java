package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1888x7643c6b5;

/* renamed from: com.tencent.mm.plugin.multitalk.service.MultiTalkingForegroundService */
/* loaded from: classes13.dex */
public class ServiceC16578xba4b7115 extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public boolean f231760d = false;

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkingForegroundService", "onBind");
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkingForegroundService", "MultiTalkingForegroundService onCreate");
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkingForegroundService", "MultiTalkingForegroundService onDestroy");
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).f(43);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkingForegroundService", "VoipForegroundService onDestroy");
        try {
            stopForeground(true);
            this.f231760d = false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalkingForegroundService", "onDestroy happened error %s", e17);
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkingForegroundService", "onRebind");
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiTalkingForegroundService", "null intent");
            stopSelf();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().H = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkManager", "markForegroundServiceStartFailed isBindSmallService: false");
            return 2;
        }
        gm0.j1.i();
        if (!gm0.j1.b().m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalkingForegroundService", "error called voip foreground service in onStartCommand process");
            stopSelf();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().H = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkManager", "markForegroundServiceStartFailed isBindSmallService: false");
            return 2;
        }
        if (fp.h.a(26)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkingForegroundService", "version below oreo");
            stopSelf();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().H = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkManager", "markForegroundServiceStartFailed isBindSmallService: false");
            return 2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkingForegroundService", "foreground service is on bind ");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkingForegroundService", "setNotificationBind");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkingForegroundService", "voip notification type is 43");
        if (this.f231760d) {
            stopForeground(true);
            this.f231760d = false;
        }
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h0y);
        java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h2o);
        intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2.class);
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 43, intent, fp.g0.a(134217728));
        int i19 = fp.h.a(19) ? com.p314xaae8f345.mm.R.C30861xcebc809e.c7u : com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
        z2.k0 k0Var = new z2.k0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "reminder_channel_id");
        k0Var.m(string2);
        k0Var.D.when = java.lang.System.currentTimeMillis();
        k0Var.f(string);
        k0Var.e(string2);
        k0Var.h(2, true);
        k0Var.f550996g = activity;
        android.app.Notification a17 = vq4.p0.a(k0Var);
        a17.icon = i19;
        a17.flags |= 32;
        int intExtra = intent.getIntExtra("enterMainUiWithPermission", 0);
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).n(43, a17, false);
        try {
            if (android.os.Build.VERSION.SDK_INT < 30) {
                intExtra = 0;
            }
            z2.y1.a(this, 43, a17, intExtra);
            this.f231760d = true;
        } catch (java.lang.SecurityException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MultiTalkingForegroundService", e17, "startForeground error: %s", e17.getMessage());
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().H = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkManager", "markForegroundServiceStartFailed isBindSmallService: false");
        }
        ((kg0.p) ((lg0.m) i95.n0.c(lg0.m.class))).Ai();
        return 3;
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkingForegroundService", "MultiTalkingForegroundService onUnbind");
        stopSelf();
        return super.onUnbind(intent);
    }
}
