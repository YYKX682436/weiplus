package com.p314xaae8f345.p3210x3857dc.p3219x84f3d9cd;

/* renamed from: com.tencent.xweb.remotedebug.XWebRemoteDebugService */
/* loaded from: classes13.dex */
public class ServiceC27863x9718f944 extends android.app.Service {
    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            java.lang.String string = getString(com.p314xaae8f345.p3222x9cba06de.R.C27876xcad56011.f61394xecbb51f9);
            java.lang.String string2 = getString(com.p314xaae8f345.p3222x9cba06de.R.C27876xcad56011.f61393xecb6d5ff);
            android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("channel_id_xweb_remote_debug", string, 3);
            notificationChannel.setDescription(string2);
            android.app.NotificationManager notificationManager = (android.app.NotificationManager) getSystemService(android.app.NotificationManager.class);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
                by5.c4.f("XWebRemoteDebugService", "createNotificationChannel");
            }
        }
        android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(this, 0, new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.p3210x3857dc.p3219x84f3d9cd.C27864x12e1bb75.class), 201326592);
        z2.k0 k0Var = new z2.k0(this, "channel_id_xweb_remote_debug");
        k0Var.D.icon = com.p314xaae8f345.p3222x9cba06de.R.C27874xcebc809e.f61259xa187ac97;
        k0Var.f(getString(com.p314xaae8f345.p3222x9cba06de.R.C27876xcad56011.f61396x41ecffa0));
        k0Var.e(getString(com.p314xaae8f345.p3222x9cba06de.R.C27876xcad56011.f61395x23215849));
        k0Var.f550996g = broadcast;
        k0Var.f550999j = 0;
        k0Var.h(16, true);
        by5.c4.f("XWebRemoteDebugService", "createNotification");
        try {
            startForeground(-120410, k0Var.b());
        } catch (java.lang.Exception e17) {
            by5.c4.d("XWebRemoteDebugService", "startForeground error:", e17);
        }
    }
}
