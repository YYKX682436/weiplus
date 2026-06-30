package com.p314xaae8f345.mm.p642xad8b531f;

/* renamed from: com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver */
/* loaded from: classes12.dex */
public class C10295x99bcf443 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p642xad8b531f.g0 f144789a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        try {
            com.p314xaae8f345.mm.p642xad8b531f.g0 g0Var = f144789a;
            if (g0Var != null) {
                g0Var.a(context, intent);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ToolsProcessReceiver", th6, "onReceive error", new java.lang.Object[0]);
        }
    }
}
