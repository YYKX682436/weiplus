package p012xc85e97e9.p125x37c711.p126x316220.p127xb098552e.p128xa4980d82;

/* renamed from: androidx.work.impl.background.systemalarm.SystemAlarmService */
/* loaded from: classes13.dex */
public class ServiceC1273x1138b13 extends p012xc85e97e9.p093xedfae76a.ServiceC1117x1ec0700b implements d5.i {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f94017g = a5.a0.e("SystemAlarmService");

    /* renamed from: e, reason: collision with root package name */
    public d5.k f94018e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f94019f;

    public final void a() {
        d5.k kVar = new d5.k(this);
        this.f94018e = kVar;
        if (kVar.f308040p == null) {
            kVar.f308040p = this;
        } else {
            a5.a0.c().b(d5.k.f308030q, "A completion listener for SystemAlarmDispatcher already exists.", new java.lang.Throwable[0]);
        }
    }

    public void b() {
        this.f94019f = true;
        a5.a0.c().a(f94017g, "All commands completed in dispatcher", new java.lang.Throwable[0]);
        java.lang.String str = k5.o.f385680a;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.WeakHashMap weakHashMap = k5.o.f385681b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (android.os.PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                a5.a0.c().f(k5.o.f385680a, java.lang.String.format("WakeLock held for %s", hashMap.get(wakeLock)), new java.lang.Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // p012xc85e97e9.p093xedfae76a.ServiceC1117x1ec0700b, android.app.Service
    public void onCreate() {
        super.onCreate();
        a();
        this.f94019f = false;
    }

    @Override // p012xc85e97e9.p093xedfae76a.ServiceC1117x1ec0700b, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f94019f = true;
        this.f94018e.c();
    }

    @Override // p012xc85e97e9.p093xedfae76a.ServiceC1117x1ec0700b, android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        super.onStartCommand(intent, i17, i18);
        if (this.f94019f) {
            a5.a0.c().d(f94017g, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new java.lang.Throwable[0]);
            this.f94018e.c();
            a();
            this.f94019f = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f94018e.a(intent, i18);
        return 3;
    }
}
