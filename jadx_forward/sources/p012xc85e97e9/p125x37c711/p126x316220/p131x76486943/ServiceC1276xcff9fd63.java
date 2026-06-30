package p012xc85e97e9.p125x37c711.p126x316220.p131x76486943;

/* renamed from: androidx.work.impl.foreground.SystemForegroundService */
/* loaded from: classes13.dex */
public class ServiceC1276xcff9fd63 extends p012xc85e97e9.p093xedfae76a.ServiceC1117x1ec0700b implements i5.c {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f94024i = a5.a0.e("SystemFgService");

    /* renamed from: e, reason: collision with root package name */
    public android.os.Handler f94025e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f94026f;

    /* renamed from: g, reason: collision with root package name */
    public i5.d f94027g;

    /* renamed from: h, reason: collision with root package name */
    public android.app.NotificationManager f94028h;

    public final void a() {
        this.f94025e = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f94028h = (android.app.NotificationManager) getApplicationContext().getSystemService("notification");
        i5.d dVar = new i5.d(getApplicationContext());
        this.f94027g = dVar;
        if (dVar.f369974o == null) {
            dVar.f369974o = this;
        } else {
            a5.a0.c().b(i5.d.f369965p, "A callback already exists.", new java.lang.Throwable[0]);
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.ServiceC1117x1ec0700b, android.app.Service
    public void onCreate() {
        super.onCreate();
        a();
    }

    @Override // p012xc85e97e9.p093xedfae76a.ServiceC1117x1ec0700b, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        i5.d dVar = this.f94027g;
        dVar.f369974o = null;
        synchronized (dVar.f369968f) {
            dVar.f369973n.c();
        }
        b5.e eVar = dVar.f369966d.f99433f;
        synchronized (eVar.f99401q) {
            ((java.util.ArrayList) eVar.f99400p).remove(dVar);
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.ServiceC1117x1ec0700b, android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        super.onStartCommand(intent, i17, i18);
        boolean z17 = this.f94026f;
        java.lang.String str = f94024i;
        if (z17) {
            a5.a0.c().d(str, "Re-initializing SystemForegroundService after a request to shut-down.", new java.lang.Throwable[0]);
            i5.d dVar = this.f94027g;
            dVar.f369974o = null;
            synchronized (dVar.f369968f) {
                dVar.f369973n.c();
            }
            b5.e eVar = dVar.f369966d.f99433f;
            synchronized (eVar.f99401q) {
                ((java.util.ArrayList) eVar.f99400p).remove(dVar);
            }
            a();
            this.f94026f = false;
        }
        if (intent == null) {
            return 3;
        }
        i5.d dVar2 = this.f94027g;
        dVar2.getClass();
        java.lang.String action = intent.getAction();
        boolean equals = "ACTION_START_FOREGROUND".equals(action);
        java.lang.String str2 = i5.d.f369965p;
        b5.w wVar = dVar2.f369966d;
        if (equals) {
            a5.a0.c().d(str2, java.lang.String.format("Started foreground service %s", intent), new java.lang.Throwable[0]);
            ((m5.c) dVar2.f369967e).a(new i5.b(dVar2, wVar.f99430c, intent.getStringExtra("KEY_WORKSPEC_ID")));
            dVar2.e(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            dVar2.e(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            a5.a0.c().d(str2, java.lang.String.format("Stopping foreground work for %s", intent), new java.lang.Throwable[0]);
            java.lang.String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra == null || android.text.TextUtils.isEmpty(stringExtra)) {
                return 3;
            }
            java.util.UUID fromString = java.util.UUID.fromString(stringExtra);
            wVar.getClass();
            ((m5.c) wVar.f99431d).a(new k5.a(wVar, fromString));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        a5.a0.c().d(str2, "Stopping foreground service", new java.lang.Throwable[0]);
        i5.c cVar = dVar2.f369974o;
        if (cVar == null) {
            return 3;
        }
        p012xc85e97e9.p125x37c711.p126x316220.p131x76486943.ServiceC1276xcff9fd63 serviceC1276xcff9fd63 = (p012xc85e97e9.p125x37c711.p126x316220.p131x76486943.ServiceC1276xcff9fd63) cVar;
        serviceC1276xcff9fd63.f94026f = true;
        a5.a0.c().a(str, "All commands completed.", new java.lang.Throwable[0]);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            serviceC1276xcff9fd63.stopForeground(true);
        }
        serviceC1276xcff9fd63.stopSelf();
        return 3;
    }
}
