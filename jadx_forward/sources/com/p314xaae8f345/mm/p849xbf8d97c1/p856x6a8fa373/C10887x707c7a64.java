package com.p314xaae8f345.mm.p849xbf8d97c1.p856x6a8fa373;

/* renamed from: com.tencent.mm.matrix.strategy.MatrixStrategyNotifyBroadcast */
/* loaded from: classes12.dex */
public class C10887x707c7a64 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f150377a = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ".matrix.strategynotify";

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            oj.j.b("Matrix.StrategyNotifyBroadcast", "MatrixStrategyNotifyBroadcast intent == null", new java.lang.Object[0]);
            return;
        }
        oj.j.c("Matrix.StrategyNotifyBroadcast", "receive MatrixStrategyNotifyBroadcast, process: %s, strategy:%s action:%s", bm5.f1.a(), null, intent.getAction());
        com.p314xaae8f345.mm.p849xbf8d97c1.e0.a(context, intent);
    }
}
