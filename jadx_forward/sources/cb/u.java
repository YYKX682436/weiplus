package cb;

/* loaded from: classes13.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Intent f121717a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.BroadcastReceiver.PendingResult f121718b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f121719c = false;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ScheduledFuture f121720d;

    public u(android.content.Intent intent, android.content.BroadcastReceiver.PendingResult pendingResult, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.f121717a = intent;
        this.f121718b = pendingResult;
        this.f121720d = scheduledExecutorService.schedule(new cb.v(this, intent), 9500L, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public final synchronized void a() {
        if (!this.f121719c) {
            this.f121718b.finish();
            this.f121720d.cancel(false);
            this.f121719c = true;
        }
    }
}
