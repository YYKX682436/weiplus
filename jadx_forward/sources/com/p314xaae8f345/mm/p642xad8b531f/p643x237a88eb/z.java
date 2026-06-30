package com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb;

@j95.b
/* loaded from: classes11.dex */
public class z extends i95.w implements oo3.i {
    public void Ai(int i17, android.app.Notification notification) {
        if (gm0.j1.b().m()) {
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).n(i17, notification, true);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNotificationService", "notify no login ");
        }
    }

    public void Bi() {
        com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.e0 e0Var = com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.l0.f145034a.f145037a.f145032a;
        e0Var.getClass();
        boolean i17 = ip.b.i();
        boolean b17 = ip.b.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.AppMsg.Handle", "simulateMessageSoundVibrate vibrate:%s, sound:%s", java.lang.Boolean.valueOf(i17), java.lang.Boolean.valueOf(b17));
        if (i17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L1(e0Var.f145012b, true);
        }
        if (b17) {
            android.util.Pair i18 = ip.l.i();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.AppMsg.Handle", "notification.playSound: is simulateMessageSoundVibrate: %s", i18.second);
            qm.z zVar = e0Var.f145011a;
            java.lang.String str = (java.lang.String) i18.second;
            boolean booleanValue = ((java.lang.Boolean) i18.first).booleanValue();
            zVar.getClass();
            (qm.n.f446176c ? qm.n.f446175b : qm.n.f446174a).a(str, false, booleanValue);
        }
    }

    public void wi() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationChannelFactory", "createLoginChannel");
        try {
            if (fp.h.c(26)) {
                android.content.SharedPreferences v17 = gm0.m.v();
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class);
                android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("login_channel_id", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574176hb3), 4);
                notificationChannel.setDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574175hb2));
                notificationChannel.enableLights(true);
                notificationChannel.setLightColor(-16711936);
                notificationChannel.setVibrationPattern(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274523b);
                notificationChannel.enableVibration(true);
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    notificationChannel.setAllowBubbles(true);
                }
                notificationChannel.setLockscreenVisibility(-1);
                notificationChannel.setSound(android.provider.Settings.System.DEFAULT_NOTIFICATION_URI, android.app.Notification.AUDIO_ATTRIBUTES_DEFAULT);
                notificationManager.createNotificationChannel(notificationChannel);
                v17.edit().putString("login_channel_id", "login_channel_id").commit();
                n25.a.f415852c = "login_channel_id";
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NotificationChannelFactory", "createLoginChannel " + e17.getClass().getSimpleName() + ", " + e17.getMessage());
        }
    }
}
