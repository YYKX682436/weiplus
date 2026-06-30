package androidx.work.impl.diagnostics;

/* loaded from: classes13.dex */
public class DiagnosticsReceiver extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f12490a = a5.a0.e("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        java.lang.String str = f12490a;
        a5.a0.c().a(str, "Requesting diagnostics", new java.lang.Throwable[0]);
        try {
            b5.w.c(context).a((a5.d0) new a5.c0(androidx.work.impl.workers.DiagnosticsWorker.class).a());
        } catch (java.lang.IllegalStateException e17) {
            a5.a0.c().b(str, "WorkManager is not initialized", e17);
        }
    }
}
