package cb;

/* loaded from: classes13.dex */
public final class y implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f40193d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Intent f40194e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ScheduledExecutorService f40195f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Queue f40196g;

    /* renamed from: h, reason: collision with root package name */
    public cb.w f40197h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f40198i;

    public y(android.content.Context context, java.lang.String str) {
        java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new java.util.concurrent.ScheduledThreadPoolExecutor(0);
        this.f40196g = new java.util.ArrayDeque();
        this.f40198i = false;
        android.content.Context applicationContext = context.getApplicationContext();
        this.f40193d = applicationContext;
        this.f40194e = new android.content.Intent(str).setPackage(applicationContext.getPackageName());
        this.f40195f = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        android.util.Log.isLoggable("EnhancedIntentService", 3);
        while (!((java.util.ArrayDeque) this.f40196g).isEmpty()) {
            android.util.Log.isLoggable("EnhancedIntentService", 3);
            cb.w wVar = this.f40197h;
            if (wVar == null || !wVar.isBinderAlive()) {
                if (android.util.Log.isLoggable("EnhancedIntentService", 3)) {
                    boolean z17 = this.f40198i;
                }
                if (!this.f40198i) {
                    this.f40198i = true;
                    try {
                        if (com.google.android.gms.common.stats.ConnectionTracker.getInstance().bindService(this.f40193d, this.f40194e, this, 65)) {
                            return;
                        }
                    } catch (java.lang.SecurityException unused) {
                    }
                    while (!((java.util.ArrayDeque) this.f40196g).isEmpty()) {
                        ((cb.u) ((java.util.ArrayDeque) this.f40196g).poll()).a();
                    }
                }
                return;
            }
            android.util.Log.isLoggable("EnhancedIntentService", 3);
            this.f40197h.a((cb.u) ((java.util.ArrayDeque) this.f40196g).poll());
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        synchronized (this) {
            this.f40198i = false;
            this.f40197h = (cb.w) iBinder;
            if (android.util.Log.isLoggable("EnhancedIntentService", 3)) {
                new java.lang.StringBuilder(java.lang.String.valueOf(componentName).length() + 20);
            }
            a();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        if (android.util.Log.isLoggable("EnhancedIntentService", 3)) {
            new java.lang.StringBuilder(java.lang.String.valueOf(componentName).length() + 23);
        }
        a();
    }
}
