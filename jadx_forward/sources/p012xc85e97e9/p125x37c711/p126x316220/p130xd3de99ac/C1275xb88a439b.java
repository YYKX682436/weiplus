package p012xc85e97e9.p125x37c711.p126x316220.p130xd3de99ac;

/* renamed from: androidx.work.impl.diagnostics.DiagnosticsReceiver */
/* loaded from: classes13.dex */
public class C1275xb88a439b extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f94023a = a5.a0.e("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        java.lang.String str = f94023a;
        a5.a0.c().a(str, "Requesting diagnostics", new java.lang.Throwable[0]);
        try {
            b5.w.c(context).a((a5.d0) new a5.c0(p012xc85e97e9.p125x37c711.p126x316220.p133x5ae81cb5.C1280x9f03282a.class).a());
        } catch (java.lang.IllegalStateException e17) {
            a5.a0.c().b(str, "WorkManager is not initialized", e17);
        }
    }
}
