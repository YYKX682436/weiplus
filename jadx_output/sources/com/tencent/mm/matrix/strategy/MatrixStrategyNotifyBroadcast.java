package com.tencent.mm.matrix.strategy;

/* loaded from: classes12.dex */
public class MatrixStrategyNotifyBroadcast extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f68844a = com.tencent.mm.sdk.platformtools.x2.f193072b + ".matrix.strategynotify";

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            oj.j.b("Matrix.StrategyNotifyBroadcast", "MatrixStrategyNotifyBroadcast intent == null", new java.lang.Object[0]);
            return;
        }
        oj.j.c("Matrix.StrategyNotifyBroadcast", "receive MatrixStrategyNotifyBroadcast, process: %s, strategy:%s action:%s", bm5.f1.a(), null, intent.getAction());
        com.tencent.mm.matrix.e0.a(context, intent);
    }
}
