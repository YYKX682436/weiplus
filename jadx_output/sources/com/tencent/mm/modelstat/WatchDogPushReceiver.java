package com.tencent.mm.modelstat;

/* loaded from: classes11.dex */
public class WatchDogPushReceiver extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f71482a = "";

    public static java.lang.String a() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(f71482a)) {
            f71482a = "com.tencent.mm.modelstat.WatchDogPushReceiver";
        }
        return f71482a;
    }

    public static void b() {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("com.tencent.mm.WatchDogPushReceiver");
        intent.setComponent(new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193072b, a()));
        intent.putExtra("type", 3);
        com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
    }

    public static void c(int i17) {
        if (z65.c.a()) {
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("com.tencent.mm.WatchDogPushReceiver");
            intent.setComponent(new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193072b, a()));
            intent.putExtra("type", 5);
            intent.putExtra("jni", i17);
            com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WatchDogPushReceiver", "onReceive intent == null");
            return;
        }
        int intExtra = intent.getIntExtra("type", 0);
        if (intExtra != 1) {
            if (intExtra == 2 || intExtra == 3 || intExtra == 4) {
                return;
            }
            if (intExtra != 5 || !z65.c.a()) {
                if (intExtra == 6) {
                    com.tencent.mars.xlog.Log.appenderFlush();
                    return;
                }
                return;
            } else {
                if (intent.getIntExtra("jni", 1) != 1) {
                    com.tencent.mm.protocal.MMProtocalJni.setClientPackVersion(-1);
                    return;
                }
                iz5.a.g("test errlog push " + new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS).format(new java.util.Date()), false);
                return;
            }
        }
        long intExtra2 = intent.getIntExtra("rtType", 0);
        long longExtra = intent.getLongExtra("beginTime", 0L);
        long longExtra2 = intent.getLongExtra("endTime", 0L);
        if (intent.getBooleanExtra("isSend", false)) {
            intent.getLongExtra("dataLen", 0L);
        } else {
            intent.getLongExtra("dataLen", 0L);
        }
        intent.getLongExtra("cost", 0L);
        long longExtra3 = intent.getLongExtra("doSceneCount", 0L);
        if (longExtra3 == 0 || intExtra2 == 0 || longExtra == 0 || longExtra2 == 0 || longExtra2 - longExtra <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WatchDogPushReceiver", "onRecv: count:" + longExtra3 + " rtType:" + intExtra2 + " begin:" + longExtra + " end:" + longExtra2);
        }
    }
}
