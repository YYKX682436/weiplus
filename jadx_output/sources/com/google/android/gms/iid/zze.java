package com.google.android.gms.iid;

/* loaded from: classes13.dex */
public abstract class zze extends android.app.Service {
    private android.os.Binder zzay;
    private int zzaz;
    final java.util.concurrent.ExecutorService zzax = java.util.concurrent.Executors.newSingleThreadExecutor();
    private final java.lang.Object lock = new java.lang.Object();
    private int zzba = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzf(android.content.Intent intent) {
        if (intent != null) {
            androidx.legacy.content.WakefulBroadcastReceiver.completeWakefulIntent(intent);
        }
        synchronized (this.lock) {
            int i17 = this.zzba - 1;
            this.zzba = i17;
            if (i17 == 0) {
                stopSelfResult(this.zzaz);
            }
        }
    }

    public abstract void handleIntent(android.content.Intent intent);

    @Override // android.app.Service
    public final synchronized android.os.IBinder onBind(android.content.Intent intent) {
        android.util.Log.isLoggable("EnhancedIntentService", 3);
        if (this.zzay == null) {
            this.zzay = new com.google.android.gms.iid.zzi(this);
        }
        return this.zzay;
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent intent, int i17, int i18) {
        synchronized (this.lock) {
            this.zzaz = i18;
            this.zzba++;
        }
        if (intent == null) {
            zzf(intent);
            return 2;
        }
        this.zzax.execute(new com.google.android.gms.iid.zzf(this, intent, intent));
        return 3;
    }
}
