package com.google.android.gms.iid;

/* loaded from: classes13.dex */
final class zzg {
    final android.content.Intent intent;
    private final android.content.BroadcastReceiver.PendingResult zzbe;
    private boolean zzbf = false;
    private final java.util.concurrent.ScheduledFuture<?> zzbg;

    public zzg(android.content.Intent intent, android.content.BroadcastReceiver.PendingResult pendingResult, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.intent = intent;
        this.zzbe = pendingResult;
        this.zzbg = scheduledExecutorService.schedule(new com.google.android.gms.iid.zzh(this, intent), 9500L, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public final synchronized void finish() {
        if (!this.zzbf) {
            this.zzbe.finish();
            this.zzbg.cancel(false);
            this.zzbf = true;
        }
    }
}
