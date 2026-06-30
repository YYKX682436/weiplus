package com.p314xaae8f345.mm.p959x883644fd;

/* renamed from: com.tencent.mm.modelstat.WatchDogPushReceiver */
/* loaded from: classes11.dex */
public class C11139x914131d6 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f153015a = "";

    public static java.lang.String a() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f153015a)) {
            f153015a = "com.tencent.mm.modelstat.WatchDogPushReceiver";
        }
        return f153015a;
    }

    public static void b() {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("com.tencent.mm.WatchDogPushReceiver");
        intent.setComponent(new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, a()));
        intent.putExtra("type", 3);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
    }

    public static void c(int i17) {
        if (z65.c.a()) {
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("com.tencent.mm.WatchDogPushReceiver");
            intent.setComponent(new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, a()));
            intent.putExtra("type", 5);
            intent.putExtra("jni", i17);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WatchDogPushReceiver", "onReceive intent == null");
            return;
        }
        int intExtra = intent.getIntExtra("type", 0);
        if (intExtra != 1) {
            if (intExtra == 2 || intExtra == 3 || intExtra == 4) {
                return;
            }
            if (intExtra != 5 || !z65.c.a()) {
                if (intExtra == 6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40529x312e01fd();
                    return;
                }
                return;
            } else {
                if (intent.getIntExtra("jni", 1) != 1) {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.C19776x5804ff1f.m75994xcb5dff72(-1);
                    return;
                }
                iz5.a.g("test errlog push " + new java.text.SimpleDateFormat(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f).format(new java.util.Date()), false);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WatchDogPushReceiver", "onRecv: count:" + longExtra3 + " rtType:" + intExtra2 + " begin:" + longExtra + " end:" + longExtra2);
        }
    }
}
