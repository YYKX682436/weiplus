package androidx.work.impl.background.systemalarm;

/* loaded from: classes13.dex */
public class SystemAlarmService extends androidx.lifecycle.LifecycleService implements d5.i {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f12484g = a5.a0.e("SystemAlarmService");

    /* renamed from: e, reason: collision with root package name */
    public d5.k f12485e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12486f;

    public final void a() {
        d5.k kVar = new d5.k(this);
        this.f12485e = kVar;
        if (kVar.f226507p == null) {
            kVar.f226507p = this;
        } else {
            a5.a0.c().b(d5.k.f226497q, "A completion listener for SystemAlarmDispatcher already exists.", new java.lang.Throwable[0]);
        }
    }

    public void b() {
        this.f12486f = true;
        a5.a0.c().a(f12484g, "All commands completed in dispatcher", new java.lang.Throwable[0]);
        java.lang.String str = k5.o.f304147a;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.WeakHashMap weakHashMap = k5.o.f304148b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (android.os.PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                a5.a0.c().f(k5.o.f304147a, java.lang.String.format("WakeLock held for %s", hashMap.get(wakeLock)), new java.lang.Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        a();
        this.f12486f = false;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f12486f = true;
        this.f12485e.c();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        super.onStartCommand(intent, i17, i18);
        if (this.f12486f) {
            a5.a0.c().d(f12484g, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new java.lang.Throwable[0]);
            this.f12485e.c();
            a();
            this.f12486f = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f12485e.a(intent, i18);
        return 3;
    }
}
