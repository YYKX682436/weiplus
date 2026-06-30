package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public class MMReceivers$SandBoxProcessReceiver extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.booter.g0 f63255a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mm.booter.g0 g0Var = f63255a;
        if (g0Var != null) {
            g0Var.a(context, intent);
        }
    }
}
