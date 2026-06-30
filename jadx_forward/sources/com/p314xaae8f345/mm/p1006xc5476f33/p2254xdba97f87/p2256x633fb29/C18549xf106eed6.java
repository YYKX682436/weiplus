package com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.p2256x633fb29;

/* renamed from: com.tencent.mm.plugin.talkroom.model.TalkRoomReceiver */
/* loaded from: classes11.dex */
public class C18549xf106eed6 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f253981a = 0;

    public static void a(android.content.Context context) {
        long a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.u2.a();
        if (a17 > 600000) {
            return;
        }
        if (a17 < 30000) {
            a17 = 30000;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TalkRoomReceiver", "reset bumper, interval:%d, now:%d", java.lang.Long.valueOf(a17), java.lang.Long.valueOf(elapsedRealtime));
        jk.b.d(context, 107, 2, elapsedRealtime + a17, new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.p2256x633fb29.C18549xf106eed6.class).putExtra("MMBoot_Bump", true), fp.g0.a(268435456), true);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomReceiver", "[ALARM NOTIFICATION] bump:" + intent.getBooleanExtra("MMBoot_Bump", false));
        a(context);
    }
}
