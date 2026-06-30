package com.p176xb6135e39.p177xcca8366f.gms.iid;

/* loaded from: classes13.dex */
final class zzg {

    /* renamed from: intent */
    final android.content.Intent f6135xb971369c;

    /* renamed from: zzbe */
    private final android.content.BroadcastReceiver.PendingResult f6136x394b83;

    /* renamed from: zzbf */
    private boolean f6137x394b84 = false;

    /* renamed from: zzbg */
    private final java.util.concurrent.ScheduledFuture<?> f6138x394b85;

    public zzg(android.content.Intent intent, android.content.BroadcastReceiver.PendingResult pendingResult, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.f6135xb971369c = intent;
        this.f6136x394b83 = pendingResult;
        this.f6138x394b85 = scheduledExecutorService.schedule(new com.p176xb6135e39.p177xcca8366f.gms.iid.zzh(this, intent), 9500L, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    /* renamed from: finish */
    public final synchronized void m18773xb4098c93() {
        if (!this.f6137x394b84) {
            this.f6136x394b83.finish();
            this.f6138x394b85.cancel(false);
            this.f6137x394b84 = true;
        }
    }
}
