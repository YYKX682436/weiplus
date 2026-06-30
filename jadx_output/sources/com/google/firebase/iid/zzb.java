package com.google.firebase.iid;

/* loaded from: classes13.dex */
public abstract class zzb extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f44657d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.Binder f44658e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f44659f;

    /* renamed from: g, reason: collision with root package name */
    public int f44660g;

    /* renamed from: h, reason: collision with root package name */
    public int f44661h;

    public zzb() {
        java.lang.String simpleName = getClass().getSimpleName();
        this.f44657d = java.util.concurrent.Executors.newSingleThreadExecutor(new com.google.android.gms.common.util.concurrent.NamedThreadFactory(simpleName.length() != 0 ? "Firebase-".concat(simpleName) : new java.lang.String("Firebase-")));
        this.f44659f = new java.lang.Object();
        this.f44661h = 0;
    }

    public final void a(android.content.Intent intent) {
        if (intent != null) {
            androidx.legacy.content.WakefulBroadcastReceiver.completeWakefulIntent(intent);
        }
        synchronized (this.f44659f) {
            int i17 = this.f44661h - 1;
            this.f44661h = i17;
            if (i17 == 0) {
                stopSelfResult(this.f44660g);
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
        if (this.f44658e == null) {
            this.f44658e = new cb.w(this);
        }
        return this.f44658e;
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent intent, int i17, int i18) {
        synchronized (this.f44659f) {
            this.f44660g = i18;
            this.f44661h++;
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
        this.f44657d.execute(new cb.t(this, b17, intent));
        return 3;
    }
}
