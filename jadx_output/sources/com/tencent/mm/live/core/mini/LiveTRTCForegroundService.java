package com.tencent.mm.live.core.mini;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/live/core/mini/LiveTRTCForegroundService;", "Landroid/app/Service;", "<init>", "()V", "plugin-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class LiveTRTCForegroundService extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f68575d = new com.tencent.mm.sdk.platformtools.b4("check-live-alive", (com.tencent.mm.sdk.platformtools.a4) new fo0.r(this), true);

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveTRTCForegroundService", "foreground service onCreate");
        if (!gm0.j1.b().m()) {
            stopSelf();
            return;
        }
        if (fp.h.c(26)) {
            z2.k0 k0Var = new z2.k0(com.tencent.mm.sdk.platformtools.x2.f193071a, "reminder_channel_id");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            android.app.Notification notification = k0Var.D;
            notification.when = currentTimeMillis;
            notification.icon = com.tencent.mm.R.drawable.c7v;
            k0Var.h(2, true);
            android.app.Notification b17 = k0Var.b();
            kotlin.jvm.internal.o.f(b17, "build(...)");
            try {
                startForeground(46, b17);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiveTRTCForegroundService", "start foreground service happened error %s", e17.getMessage());
            }
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveTRTCForegroundService", "foreground service onDestroy");
        try {
            stopForeground(true);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiveTRTCForegroundService", "onDestroy happened error %s", e17);
        }
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f(46);
        super.onDestroy();
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f68575d;
        b4Var.d();
        b4Var.quitSafely();
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveTRTCForegroundService", "foreground service onStartCommand");
        if (!gm0.j1.b().m()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiveTRTCForegroundService", "error called foreground service in onStartCommand process");
            stopSelf();
            return 2;
        }
        if (fp.h.c(26) && intent != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveTRTCForegroundService", "startNotification");
            if (gm0.j1.b().m()) {
                intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, java.lang.Class.forName(intent.getStringExtra("PARAM_ACTIVITY_NAME")));
                intent.setFlags(268435456);
                java.lang.String stringExtra = intent.getStringExtra("PARAM_TITLE");
                java.lang.String stringExtra2 = intent.getStringExtra("PARAM_CONTENT");
                java.lang.String stringExtra3 = intent.getStringExtra("PARAM_TICKER");
                com.tencent.mars.xlog.Log.i("MicroMsg.LiveTRTCForegroundService", "parseCreateNotification title: " + stringExtra + " content: " + stringExtra2 + " ticker: " + stringExtra3);
                if (stringExtra == null) {
                    stringExtra = "";
                }
                if (stringExtra2 == null) {
                    stringExtra2 = "";
                }
                if (stringExtra3 == null) {
                    stringExtra3 = "";
                }
                android.app.PendingIntent activity = android.app.PendingIntent.getActivity(com.tencent.mm.sdk.platformtools.x2.f193071a, 46, intent, fp.g0.a(134217728));
                z2.k0 k0Var = new z2.k0(com.tencent.mm.sdk.platformtools.x2.f193071a, "reminder_channel_id");
                k0Var.m(stringExtra3);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                android.app.Notification notification = k0Var.D;
                notification.when = currentTimeMillis;
                k0Var.f(stringExtra);
                k0Var.e(stringExtra2);
                k0Var.f469463g = activity;
                notification.icon = com.tencent.mm.R.drawable.c7v;
                k0Var.h(2, true);
                android.app.Notification b17 = k0Var.b();
                kotlin.jvm.internal.o.f(b17, "build(...)");
                ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).n(46, b17, false);
                com.tencent.mm.sdk.platformtools.b4 b4Var = this.f68575d;
                b4Var.c(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
                b4Var.setLogging(false);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiveTRTCForegroundService", "error called foreground service in startNotification process");
                stopSelf();
            }
        }
        return 2;
    }
}
