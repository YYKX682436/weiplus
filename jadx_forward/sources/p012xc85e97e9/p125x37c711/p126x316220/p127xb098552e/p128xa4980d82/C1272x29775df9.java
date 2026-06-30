package p012xc85e97e9.p125x37c711.p126x316220.p127xb098552e.p128xa4980d82;

/* renamed from: androidx.work.impl.background.systemalarm.RescheduleReceiver */
/* loaded from: classes13.dex */
public class C1272x29775df9 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f94016a = a5.a0.e("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        a5.a0.c().a(f94016a, java.lang.String.format("Received intent %s", intent), new java.lang.Throwable[0]);
        try {
            b5.w c17 = b5.w.c(context);
            android.content.BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (b5.w.f99427l) {
                c17.f99436i = goAsync;
                if (c17.f99435h) {
                    goAsync.finish();
                    c17.f99436i = null;
                }
            }
        } catch (java.lang.IllegalStateException e17) {
            a5.a0.c().b(f94016a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e17);
        }
    }
}
