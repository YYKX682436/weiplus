package com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1766x7643c6b5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/gamelive/service/GameLiveForegroundService;", "Landroid/app/Service;", "<init>", "()V", "plugin-gamelive_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.gamelive.service.GameLiveForegroundService */
/* loaded from: classes7.dex */
public final class ServiceC16073xa10d4774 extends android.app.Service {
    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveForegroundService", "foreground service onCreate");
        if (!gm0.j1.b().m()) {
            stopSelf();
            return;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
        r45.wp1 wp1Var = dk2.ef.f314923j.f315217b;
        java.lang.String m75945x2fec8307 = wp1Var != null ? wp1Var.m75945x2fec8307(3) : null;
        java.lang.String r17 = i65.a.r(this, com.p314xaae8f345.mm.R.C30867xcad56011.a0r);
        z2.k0 k0Var = new z2.k0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "reminder_channel_id");
        k0Var.m(r17);
        k0Var.e(r17);
        k0Var.f(m75945x2fec8307);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.app.Notification notification = k0Var.D;
        notification.when = currentTimeMillis;
        notification.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
        k0Var.h(2, true);
        android.app.Notification b17 = k0Var.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "build(...)");
        try {
            startForeground(46, b17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveForegroundService", "start foreground service happened error %s", e17.getMessage());
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveForegroundService", "foreground service onDestroy");
        try {
            stopForeground(true);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameLiveForegroundService", "onDestroy happened error %s", e17);
        }
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).f(46);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveForegroundService", "foreground service onStartCommand");
        if (gm0.j1.b().m()) {
            return 3;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameLiveForegroundService", "error called foreground service in onStartCommand process");
        stopSelf();
        return 2;
    }
}
