package com.tencent.mm.booter;

/* loaded from: classes11.dex */
public class MMReceivers$AlarmReceiver extends android.content.BroadcastReceiver {
    public static void a(android.content.Context context) {
        com.tencent.mars.xlog.Log.w("MicroMsg.AlarmReceiver", "keep awaker");
        com.tencent.mm.network.x2[] x2VarArr = com.tencent.mm.network.x2.f72169j;
        java.lang.String a17 = c01.b9.f37069c.a("login_user_name", "");
        if (a17 != null) {
            a17 = a17.replaceAll("[/\\\\]", "#").trim();
        }
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("notify_key_pref" + a17, 4);
        int i17 = sharedPreferences.getInt("wakeup_alarm_launch_cnt", 0);
        int i18 = sharedPreferences.getInt("wakeup_alarm_last_cnt", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPushCore", "isFrequentlyLaunch cnt:%d, thisCnt:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        long j17 = (i17 > 10) | (i18 > 10) ? 300000 : 900000;
        jk.b.e(context, 110, 0, java.lang.System.currentTimeMillis() + j17, j17, new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.booter.MMReceivers$AlarmReceiver.class), fp.g0.a(268435456));
    }

    public static void b(android.content.Context context) {
        long a17 = com.tencent.mm.sdk.platformtools.u2.a();
        if (a17 > 1860000) {
            return;
        }
        if (a17 < 30000) {
            a17 = 30000;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AlarmReceiver", "reset bumper, interval=" + a17);
        jk.b.d(context, 109, 0, java.lang.System.currentTimeMillis() + a17, new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.booter.MMReceivers$AlarmReceiver.class).putExtra("MMBoot_Bump", true), fp.g0.a(268435456), true);
    }

    public static void c(android.content.Context context) {
        com.tencent.mars.xlog.Log.w("MicroMsg.AlarmReceiver", "stop awaker");
        android.app.PendingIntent b17 = jk.b.b(context, 110, new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.booter.MMReceivers$AlarmReceiver.class), fp.g0.a(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING), true);
        if (b17 != null) {
            jk.b.a(context, 110, b17);
            b17.cancel();
        }
    }

    public static void d(android.content.Context context) {
        android.app.PendingIntent b17 = jk.b.b(context, 109, new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.booter.MMReceivers$AlarmReceiver.class).putExtra("MMBoot_Bump", true), fp.g0.a(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING), true);
        if (b17 != null) {
            jk.b.a(context, 109, b17);
            b17.cancel();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        if (!gm0.m.v().getBoolean("keepaliveserviceswitch", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AlarmReceiver", "onReceive() MMHandlerThread() publish PushKeepAliveEvent");
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.booter.f0(this), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        }
        boolean booleanExtra = intent.getBooleanExtra("MMBoot_Bump", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.AlarmReceiver", "[ALARM NOTIFICATION] bump:" + booleanExtra);
        if (booleanExtra) {
            b(context);
        } else {
            if (com.tencent.mm.booter.n.a(context, "alarm", true)) {
                return;
            }
            c(context);
            com.tencent.mars.xlog.Log.appenderFlush();
        }
    }
}
