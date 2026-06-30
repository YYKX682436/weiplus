package com.p176xb6135e39.p177xcca8366f.gms.iid;

/* loaded from: classes13.dex */
public abstract class zze extends android.app.Service {

    /* renamed from: zzay */
    private android.os.Binder f6129x394b78;

    /* renamed from: zzaz */
    private int f6130x394b79;

    /* renamed from: zzax */
    final java.util.concurrent.ExecutorService f6128x394b77 = java.util.concurrent.Executors.newSingleThreadExecutor();

    /* renamed from: lock */
    private final java.lang.Object f6127x32c52b = new java.lang.Object();

    /* renamed from: zzba */
    private int f6131x394b7f = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzf(android.content.Intent intent) {
        if (intent != null) {
            p012xc85e97e9.p090xbe0af3c9.p091x38b73479.AbstractC1111x43921d97.m7784xb060689c(intent);
        }
        synchronized (this.f6127x32c52b) {
            int i17 = this.f6131x394b7f - 1;
            this.f6131x394b7f = i17;
            if (i17 == 0) {
                stopSelfResult(this.f6130x394b79);
            }
        }
    }

    /* renamed from: handleIntent */
    public abstract void mo18695xa1c752e4(android.content.Intent intent);

    @Override // android.app.Service
    public final synchronized android.os.IBinder onBind(android.content.Intent intent) {
        android.util.Log.isLoggable("EnhancedIntentService", 3);
        if (this.f6129x394b78 == null) {
            this.f6129x394b78 = new com.p176xb6135e39.p177xcca8366f.gms.iid.zzi(this);
        }
        return this.f6129x394b78;
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent intent, int i17, int i18) {
        synchronized (this.f6127x32c52b) {
            this.f6130x394b79 = i18;
            this.f6131x394b7f++;
        }
        if (intent == null) {
            zzf(intent);
            return 2;
        }
        this.f6128x394b77.execute(new com.p176xb6135e39.p177xcca8366f.gms.iid.zzf(this, intent, intent));
        return 3;
    }
}
