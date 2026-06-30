package com.google.android.gms.iid;

/* loaded from: classes13.dex */
public final class zzk implements android.content.ServiceConnection {
    private final android.content.Intent zzbl;
    private final java.util.concurrent.ScheduledExecutorService zzbm;
    private final java.util.Queue<com.google.android.gms.iid.zzg> zzbn;
    private com.google.android.gms.iid.zzi zzbo;
    private boolean zzbp;
    private final android.content.Context zzk;

    public zzk(android.content.Context context, java.lang.String str) {
        this(context, str, new java.util.concurrent.ScheduledThreadPoolExecutor(0));
    }

    private final synchronized void zzl() {
        android.util.Log.isLoggable("EnhancedIntentService", 3);
        while (!this.zzbn.isEmpty()) {
            android.util.Log.isLoggable("EnhancedIntentService", 3);
            com.google.android.gms.iid.zzi zziVar = this.zzbo;
            if (zziVar == null || !zziVar.isBinderAlive()) {
                if (android.util.Log.isLoggable("EnhancedIntentService", 3)) {
                    boolean z17 = this.zzbp;
                }
                if (!this.zzbp) {
                    this.zzbp = true;
                    try {
                        if (com.google.android.gms.common.stats.ConnectionTracker.getInstance().bindService(this.zzk, this.zzbl, this, 65)) {
                            return;
                        }
                    } catch (java.lang.SecurityException unused) {
                    }
                    while (!this.zzbn.isEmpty()) {
                        this.zzbn.poll().finish();
                    }
                }
                return;
            }
            android.util.Log.isLoggable("EnhancedIntentService", 3);
            this.zzbo.zzd(this.zzbn.poll());
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        synchronized (this) {
            this.zzbp = false;
            this.zzbo = (com.google.android.gms.iid.zzi) iBinder;
            if (android.util.Log.isLoggable("EnhancedIntentService", 3)) {
                new java.lang.StringBuilder(java.lang.String.valueOf(componentName).length() + 20);
            }
            zzl();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        if (android.util.Log.isLoggable("EnhancedIntentService", 3)) {
            new java.lang.StringBuilder(java.lang.String.valueOf(componentName).length() + 23);
        }
        zzl();
    }

    public final synchronized void zzd(android.content.Intent intent, android.content.BroadcastReceiver.PendingResult pendingResult) {
        android.util.Log.isLoggable("EnhancedIntentService", 3);
        this.zzbn.add(new com.google.android.gms.iid.zzg(intent, pendingResult, this.zzbm));
        zzl();
    }

    private zzk(android.content.Context context, java.lang.String str, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.zzbn = new java.util.ArrayDeque();
        this.zzbp = false;
        android.content.Context applicationContext = context.getApplicationContext();
        this.zzk = applicationContext;
        this.zzbl = new android.content.Intent(str).setPackage(applicationContext.getPackageName());
        this.zzbm = scheduledExecutorService;
    }
}
