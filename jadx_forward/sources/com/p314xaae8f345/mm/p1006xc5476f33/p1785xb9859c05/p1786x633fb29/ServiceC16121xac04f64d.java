package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/ipcall/model/IPCallForegroundService;", "Landroid/app/Service;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ipcall.model.IPCallForegroundService */
/* loaded from: classes7.dex */
public final class ServiceC16121xac04f64d extends android.app.Service {
    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallForegroundService", "onBind");
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallForegroundService", "IPCallForegroundService onCreate");
        super.onCreate();
        if (!gm0.j1.b().m()) {
            stopSelf();
            return;
        }
        if (fp.h.c(26)) {
            z2.k0 k0Var = new z2.k0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "reminder_channel_id");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            android.app.Notification notification = k0Var.D;
            notification.when = currentTimeMillis;
            notification.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
            k0Var.h(2, true);
            android.app.Notification a17 = vq4.p0.a(k0Var);
            try {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.m()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallForegroundService", "current mmprocess is exits");
                }
                startForeground(42, a17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallForegroundService", "start foreground service happened error %s", e17.getMessage());
            }
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallForegroundService", "IPCallForegroundService onDestroy");
        try {
            stopForeground(true);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallForegroundService", "onDestroy happened error %s", e17);
        }
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).f(42);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        if (!gm0.j1.b().m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallForegroundService", "error called ipcall foreground service in onStartCommand process");
            stopSelf();
            return 2;
        }
        if (!fp.h.c(26) || intent == null) {
            return 3;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallForegroundService", "foreground service is on bind ");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallForegroundService", "setNotificationBind");
        intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16150x8f474cc5.class);
        intent.setFlags(268435456);
        intent.putExtra("IPCallTalkUI_isFromMiniNotification", true);
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573870g40);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallForegroundService", "IPCallForegroundService notification type is 42");
        if (!gm0.j1.b().m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallForegroundService", "error called ipcall foreground service in setNotification process");
            stopSelf();
            return 3;
        }
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 42, intent, fp.g0.a(134217728));
        z2.k0 k0Var = new z2.k0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "reminder_channel_id");
        k0Var.m(string);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.app.Notification notification = k0Var.D;
        notification.when = currentTimeMillis;
        k0Var.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3s));
        k0Var.e(string);
        notification.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
        k0Var.f550996g = activity;
        k0Var.h(2, true);
        android.app.Notification a17 = vq4.p0.a(k0Var);
        a17.flags |= 32;
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).n(42, a17, false);
        return 3;
    }
}
