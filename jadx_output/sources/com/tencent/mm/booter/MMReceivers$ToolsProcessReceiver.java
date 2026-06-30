package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public class MMReceivers$ToolsProcessReceiver extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.booter.g0 f63256a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        try {
            com.tencent.mm.booter.g0 g0Var = f63256a;
            if (g0Var != null) {
                g0Var.a(context, intent);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ToolsProcessReceiver", th6, "onReceive error", new java.lang.Object[0]);
        }
    }
}
