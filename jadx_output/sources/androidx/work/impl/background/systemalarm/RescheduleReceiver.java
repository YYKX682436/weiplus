package androidx.work.impl.background.systemalarm;

/* loaded from: classes13.dex */
public class RescheduleReceiver extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f12483a = a5.a0.e("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        a5.a0.c().a(f12483a, java.lang.String.format("Received intent %s", intent), new java.lang.Throwable[0]);
        try {
            b5.w c17 = b5.w.c(context);
            android.content.BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (b5.w.f17894l) {
                c17.f17903i = goAsync;
                if (c17.f17902h) {
                    goAsync.finish();
                    c17.f17903i = null;
                }
            }
        } catch (java.lang.IllegalStateException e17) {
            a5.a0.c().b(f12483a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e17);
        }
    }
}
