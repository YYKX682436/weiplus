package com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p832x332457;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/live/core/mini/LiveForegroundService;", "Landroid/app/Service;", "<init>", "()V", "plugin-core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.live.core.mini.LiveForegroundService */
/* loaded from: classes7.dex */
public final class ServiceC10842xd12fe846 extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f150107d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("check-live-alive", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new fo0.g(this), true);

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveForegroundService", "foreground service onCreate");
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
            android.app.Notification b17 = k0Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "build(...)");
            try {
                startForeground(46, b17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveForegroundService", "start foreground service happened error %s", e17.getMessage());
            }
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveForegroundService", "foreground service onDestroy");
        try {
            stopForeground(true);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiveForegroundService", "onDestroy happened error %s", e17);
        }
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).f(46);
        super.onDestroy();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f150107d;
        b4Var.d();
        b4Var.m77787xbe88f509();
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        android.app.Notification b17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveForegroundService", "foreground service onStartCommand");
        if (!gm0.j1.b().m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiveForegroundService", "error called foreground service in onStartCommand process");
            stopSelf();
            return 2;
        }
        if (!fp.h.c(26)) {
            return 3;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveForegroundService", "startNotification");
        if (!gm0.j1.b().m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiveForegroundService", "error called foreground service in startNotification process");
            stopSelf();
            return 2;
        }
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiveForegroundService", "error called foreground service in startNotification process: intent is null");
            stopSelf();
            return 2;
        }
        java.lang.String stringExtra = intent.getStringExtra("PARAM_ACTIVITY_NAME");
        if (stringExtra == null || stringExtra.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiveForegroundService", "error called foreground service in startNotification process: activityName is null");
            stopSelf();
            return 2;
        }
        intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, java.lang.Class.forName(stringExtra));
        intent.setFlags(268435456);
        java.lang.String stringExtra2 = intent.getStringExtra("PARAM_TITLE");
        java.lang.String stringExtra3 = intent.getStringExtra("PARAM_CONTENT");
        java.lang.String stringExtra4 = intent.getStringExtra("PARAM_TICKER");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra4);
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 46, intent, fp.g0.a(134217728));
        z2.k0 k0Var = new z2.k0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "reminder_channel_id");
        k0Var.m(stringExtra4);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.app.Notification notification = k0Var.D;
        notification.when = currentTimeMillis;
        k0Var.f(stringExtra2);
        k0Var.e(stringExtra3);
        k0Var.f550996g = activity;
        notification.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
        k0Var.h(2, true);
        if (fp.h.a(16)) {
            b17 = k0Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "build(...)");
        } else {
            b17 = k0Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "build(...)");
        }
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).n(46, b17, false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f150107d;
        b4Var.c(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        b4Var.m77789xc5a5549d(false);
        return 3;
    }
}
