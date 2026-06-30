package cb;

/* loaded from: classes13.dex */
public final class y implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f121726d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Intent f121727e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ScheduledExecutorService f121728f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Queue f121729g;

    /* renamed from: h, reason: collision with root package name */
    public cb.w f121730h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f121731i;

    public y(android.content.Context context, java.lang.String str) {
        java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new java.util.concurrent.ScheduledThreadPoolExecutor(0);
        this.f121729g = new java.util.ArrayDeque();
        this.f121731i = false;
        android.content.Context applicationContext = context.getApplicationContext();
        this.f121726d = applicationContext;
        this.f121727e = new android.content.Intent(str).setPackage(applicationContext.getPackageName());
        this.f121728f = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        android.util.Log.isLoggable("EnhancedIntentService", 3);
        while (!((java.util.ArrayDeque) this.f121729g).isEmpty()) {
            android.util.Log.isLoggable("EnhancedIntentService", 3);
            cb.w wVar = this.f121730h;
            if (wVar == null || !wVar.isBinderAlive()) {
                if (android.util.Log.isLoggable("EnhancedIntentService", 3)) {
                    boolean z17 = this.f121731i;
                }
                if (!this.f121731i) {
                    this.f121731i = true;
                    try {
                        if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1980x61745a5a.m18493x9cf0d20b().m18494x54856bb8(this.f121726d, this.f121727e, this, 65)) {
                            return;
                        }
                    } catch (java.lang.SecurityException unused) {
                    }
                    while (!((java.util.ArrayDeque) this.f121729g).isEmpty()) {
                        ((cb.u) ((java.util.ArrayDeque) this.f121729g).poll()).a();
                    }
                }
                return;
            }
            android.util.Log.isLoggable("EnhancedIntentService", 3);
            this.f121730h.a((cb.u) ((java.util.ArrayDeque) this.f121729g).poll());
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        synchronized (this) {
            this.f121731i = false;
            this.f121730h = (cb.w) iBinder;
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
