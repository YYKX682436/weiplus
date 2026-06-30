package cb;

/* loaded from: classes13.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Intent f40184a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.BroadcastReceiver.PendingResult f40185b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f40186c = false;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ScheduledFuture f40187d;

    public u(android.content.Intent intent, android.content.BroadcastReceiver.PendingResult pendingResult, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.f40184a = intent;
        this.f40185b = pendingResult;
        this.f40187d = scheduledExecutorService.schedule(new cb.v(this, intent), 9500L, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public final synchronized void a() {
        if (!this.f40186c) {
            this.f40185b.finish();
            this.f40187d.cancel(false);
            this.f40186c = true;
        }
    }
}
