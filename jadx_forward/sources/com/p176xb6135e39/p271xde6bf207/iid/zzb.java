package com.p176xb6135e39.p271xde6bf207.iid;

/* loaded from: classes13.dex */
public abstract class zzb extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f126190d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.Binder f126191e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f126192f;

    /* renamed from: g, reason: collision with root package name */
    public int f126193g;

    /* renamed from: h, reason: collision with root package name */
    public int f126194h;

    public zzb() {
        java.lang.String simpleName = getClass().getSimpleName();
        this.f126190d = java.util.concurrent.Executors.newSingleThreadExecutor(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.p219xa7ffe5b7.ThreadFactoryC2016x24211507(simpleName.length() != 0 ? "Firebase-".concat(simpleName) : new java.lang.String("Firebase-")));
        this.f126192f = new java.lang.Object();
        this.f126194h = 0;
    }

    public final void a(android.content.Intent intent) {
        if (intent != null) {
            p012xc85e97e9.p090xbe0af3c9.p091x38b73479.AbstractC1111x43921d97.m7784xb060689c(intent);
        }
        synchronized (this.f126192f) {
            int i17 = this.f126194h - 1;
            this.f126194h = i17;
            if (i17 == 0) {
                stopSelfResult(this.f126193g);
            }
        }
    }

    public android.content.Intent b(android.content.Intent intent) {
        return intent;
    }

    public boolean c(android.content.Intent intent) {
        return false;
    }

    public abstract void d(android.content.Intent intent);

    @Override // android.app.Service
    public final synchronized android.os.IBinder onBind(android.content.Intent intent) {
        android.util.Log.isLoggable("EnhancedIntentService", 3);
        if (this.f126191e == null) {
            this.f126191e = new cb.w(this);
        }
        return this.f126191e;
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent intent, int i17, int i18) {
        synchronized (this.f126192f) {
            this.f126193g = i18;
            this.f126194h++;
        }
        android.content.Intent b17 = b(intent);
        if (b17 == null) {
            a(intent);
            return 2;
        }
        if (c(b17)) {
            a(intent);
            return 2;
        }
        this.f126190d.execute(new cb.t(this, b17, intent));
        return 3;
    }
}
