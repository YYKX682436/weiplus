package com.p176xb6135e39.p177xcca8366f.gms.iid;

/* loaded from: classes13.dex */
public final class zzk implements android.content.ServiceConnection {

    /* renamed from: zzbl */
    private final android.content.Intent f6144x394b8a;

    /* renamed from: zzbm */
    private final java.util.concurrent.ScheduledExecutorService f6145x394b8b;

    /* renamed from: zzbn */
    private final java.util.Queue<com.p176xb6135e39.p177xcca8366f.gms.iid.zzg> f6146x394b8c;

    /* renamed from: zzbo */
    private com.p176xb6135e39.p177xcca8366f.gms.iid.zzi f6147x394b8d;

    /* renamed from: zzbp */
    private boolean f6148x394b8e;
    private final android.content.Context zzk;

    public zzk(android.content.Context context, java.lang.String str) {
        this(context, str, new java.util.concurrent.ScheduledThreadPoolExecutor(0));
    }

    private final synchronized void zzl() {
        android.util.Log.isLoggable("EnhancedIntentService", 3);
        while (!this.f6146x394b8c.isEmpty()) {
            android.util.Log.isLoggable("EnhancedIntentService", 3);
            com.p176xb6135e39.p177xcca8366f.gms.iid.zzi zziVar = this.f6147x394b8d;
            if (zziVar == null || !zziVar.isBinderAlive()) {
                if (android.util.Log.isLoggable("EnhancedIntentService", 3)) {
                    boolean z17 = this.f6148x394b8e;
                }
                if (!this.f6148x394b8e) {
                    this.f6148x394b8e = true;
                    try {
                        if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1980x61745a5a.m18493x9cf0d20b().m18494x54856bb8(this.zzk, this.f6144x394b8a, this, 65)) {
                            return;
                        }
                    } catch (java.lang.SecurityException unused) {
                    }
                    while (!this.f6146x394b8c.isEmpty()) {
                        this.f6146x394b8c.poll().m18773xb4098c93();
                    }
                }
                return;
            }
            android.util.Log.isLoggable("EnhancedIntentService", 3);
            this.f6147x394b8d.zzd(this.f6146x394b8c.poll());
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        synchronized (this) {
            this.f6148x394b8e = false;
            this.f6147x394b8d = (com.p176xb6135e39.p177xcca8366f.gms.iid.zzi) iBinder;
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
        this.f6146x394b8c.add(new com.p176xb6135e39.p177xcca8366f.gms.iid.zzg(intent, pendingResult, this.f6145x394b8b));
        zzl();
    }

    private zzk(android.content.Context context, java.lang.String str, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.f6146x394b8c = new java.util.ArrayDeque();
        this.f6148x394b8e = false;
        android.content.Context applicationContext = context.getApplicationContext();
        this.zzk = applicationContext;
        this.f6144x394b8a = new android.content.Intent(str).setPackage(applicationContext.getPackageName());
        this.f6145x394b8b = scheduledExecutorService;
    }
}
