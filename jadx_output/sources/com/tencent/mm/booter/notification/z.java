package com.tencent.mm.booter.notification;

@j95.b
/* loaded from: classes11.dex */
public class z extends i95.w implements oo3.i {
    public void Ai(int i17, android.app.Notification notification) {
        if (gm0.j1.b().m()) {
            ((com.tencent.mm.booter.notification.x) c01.d9.f()).n(i17, notification, true);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMNotificationService", "notify no login ");
        }
    }

    public void Bi() {
        com.tencent.mm.booter.notification.e0 e0Var = com.tencent.mm.booter.notification.l0.f63501a.f63504a.f63499a;
        e0Var.getClass();
        boolean i17 = ip.b.i();
        boolean b17 = ip.b.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.Notification.AppMsg.Handle", "simulateMessageSoundVibrate vibrate:%s, sound:%s", java.lang.Boolean.valueOf(i17), java.lang.Boolean.valueOf(b17));
        if (i17) {
            com.tencent.mm.sdk.platformtools.t8.L1(e0Var.f63479b, true);
        }
        if (b17) {
            android.util.Pair i18 = ip.l.i();
            com.tencent.mars.xlog.Log.i("MicroMsg.Notification.AppMsg.Handle", "notification.playSound: is simulateMessageSoundVibrate: %s", i18.second);
            qm.z zVar = e0Var.f63478a;
            java.lang.String str = (java.lang.String) i18.second;
            boolean booleanValue = ((java.lang.Boolean) i18.first).booleanValue();
            zVar.getClass();
            (qm.n.f364643c ? qm.n.f364642b : qm.n.f364641a).a(str, false, booleanValue);
        }
    }

    public void wi() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NotificationChannelFactory", "createLoginChannel");
        try {
            if (fp.h.c(26)) {
                android.content.SharedPreferences v17 = gm0.m.v();
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class);
                android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("login_channel_id", context.getString(com.tencent.mm.R.string.f492643hb3), 4);
                notificationChannel.setDescription(context.getString(com.tencent.mm.R.string.f492642hb2));
                notificationChannel.enableLights(true);
                notificationChannel.setLightColor(-16711936);
                notificationChannel.setVibrationPattern(com.tencent.mm.sdk.platformtools.t8.f192990b);
                notificationChannel.enableVibration(true);
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    notificationChannel.setAllowBubbles(true);
                }
                notificationChannel.setLockscreenVisibility(-1);
                notificationChannel.setSound(android.provider.Settings.System.DEFAULT_NOTIFICATION_URI, android.app.Notification.AUDIO_ATTRIBUTES_DEFAULT);
                notificationManager.createNotificationChannel(notificationChannel);
                v17.edit().putString("login_channel_id", "login_channel_id").commit();
                n25.a.f334319c = "login_channel_id";
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NotificationChannelFactory", "createLoginChannel " + e17.getClass().getSimpleName() + ", " + e17.getMessage());
        }
    }
}
