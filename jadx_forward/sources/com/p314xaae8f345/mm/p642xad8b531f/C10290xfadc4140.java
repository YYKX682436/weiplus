package com.p314xaae8f345.mm.p642xad8b531f;

/* renamed from: com.tencent.mm.booter.MMReceivers$AlarmReceiver */
/* loaded from: classes11.dex */
public class C10290xfadc4140 extends android.content.BroadcastReceiver {
    public static void a(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AlarmReceiver", "keep awaker");
        com.p314xaae8f345.mm.p971x6de15a2e.x2[] x2VarArr = com.p314xaae8f345.mm.p971x6de15a2e.x2.f153702j;
        java.lang.String a17 = c01.b9.f118602c.a("login_user_name", "");
        if (a17 != null) {
            a17 = a17.replaceAll("[/\\\\]", "#").trim();
        }
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("notify_key_pref" + a17, 4);
        int i17 = sharedPreferences.getInt("wakeup_alarm_launch_cnt", 0);
        int i18 = sharedPreferences.getInt("wakeup_alarm_last_cnt", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPushCore", "isFrequentlyLaunch cnt:%d, thisCnt:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        long j17 = (i17 > 10) | (i18 > 10) ? 300000 : 900000;
        jk.b.e(context, 110, 0, java.lang.System.currentTimeMillis() + j17, j17, new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p642xad8b531f.C10290xfadc4140.class), fp.g0.a(268435456));
    }

    public static void b(android.content.Context context) {
        long a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.u2.a();
        if (a17 > 1860000) {
            return;
        }
        if (a17 < 30000) {
            a17 = 30000;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AlarmReceiver", "reset bumper, interval=" + a17);
        jk.b.d(context, 109, 0, java.lang.System.currentTimeMillis() + a17, new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p642xad8b531f.C10290xfadc4140.class).putExtra("MMBoot_Bump", true), fp.g0.a(268435456), true);
    }

    public static void c(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AlarmReceiver", "stop awaker");
        android.app.PendingIntent b17 = jk.b.b(context, 110, new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p642xad8b531f.C10290xfadc4140.class), fp.g0.a(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965), true);
        if (b17 != null) {
            jk.b.a(context, 110, b17);
            b17.cancel();
        }
    }

    public static void d(android.content.Context context) {
        android.app.PendingIntent b17 = jk.b.b(context, 109, new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p642xad8b531f.C10290xfadc4140.class).putExtra("MMBoot_Bump", true), fp.g0.a(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965), true);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlarmReceiver", "onReceive() MMHandlerThread() publish PushKeepAliveEvent");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p642xad8b531f.f0(this), com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        }
        boolean booleanExtra = intent.getBooleanExtra("MMBoot_Bump", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlarmReceiver", "[ALARM NOTIFICATION] bump:" + booleanExtra);
        if (booleanExtra) {
            b(context);
        } else {
            if (com.p314xaae8f345.mm.p642xad8b531f.n.a(context, "alarm", true)) {
                return;
            }
            c(context);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40529x312e01fd();
        }
    }
}
