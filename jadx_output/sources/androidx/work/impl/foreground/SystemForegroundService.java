package androidx.work.impl.foreground;

/* loaded from: classes13.dex */
public class SystemForegroundService extends androidx.lifecycle.LifecycleService implements i5.c {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f12491i = a5.a0.e("SystemFgService");

    /* renamed from: e, reason: collision with root package name */
    public android.os.Handler f12492e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12493f;

    /* renamed from: g, reason: collision with root package name */
    public i5.d f12494g;

    /* renamed from: h, reason: collision with root package name */
    public android.app.NotificationManager f12495h;

    public final void a() {
        this.f12492e = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f12495h = (android.app.NotificationManager) getApplicationContext().getSystemService("notification");
        i5.d dVar = new i5.d(getApplicationContext());
        this.f12494g = dVar;
        if (dVar.f288441o == null) {
            dVar.f288441o = this;
        } else {
            a5.a0.c().b(i5.d.f288432p, "A callback already exists.", new java.lang.Throwable[0]);
        }
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        i5.d dVar = this.f12494g;
        dVar.f288441o = null;
        synchronized (dVar.f288435f) {
            dVar.f288440n.c();
        }
        b5.e eVar = dVar.f288433d.f17900f;
        synchronized (eVar.f17868q) {
            ((java.util.ArrayList) eVar.f17867p).remove(dVar);
        }
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        super.onStartCommand(intent, i17, i18);
        boolean z17 = this.f12493f;
        java.lang.String str = f12491i;
        if (z17) {
            a5.a0.c().d(str, "Re-initializing SystemForegroundService after a request to shut-down.", new java.lang.Throwable[0]);
            i5.d dVar = this.f12494g;
            dVar.f288441o = null;
            synchronized (dVar.f288435f) {
                dVar.f288440n.c();
            }
            b5.e eVar = dVar.f288433d.f17900f;
            synchronized (eVar.f17868q) {
                ((java.util.ArrayList) eVar.f17867p).remove(dVar);
            }
            a();
            this.f12493f = false;
        }
        if (intent == null) {
            return 3;
        }
        i5.d dVar2 = this.f12494g;
        dVar2.getClass();
        java.lang.String action = intent.getAction();
        boolean equals = "ACTION_START_FOREGROUND".equals(action);
        java.lang.String str2 = i5.d.f288432p;
        b5.w wVar = dVar2.f288433d;
        if (equals) {
            a5.a0.c().d(str2, java.lang.String.format("Started foreground service %s", intent), new java.lang.Throwable[0]);
            ((m5.c) dVar2.f288434e).a(new i5.b(dVar2, wVar.f17897c, intent.getStringExtra("KEY_WORKSPEC_ID")));
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
            ((m5.c) wVar.f17898d).a(new k5.a(wVar, fromString));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        a5.a0.c().d(str2, "Stopping foreground service", new java.lang.Throwable[0]);
        i5.c cVar = dVar2.f288441o;
        if (cVar == null) {
            return 3;
        }
        androidx.work.impl.foreground.SystemForegroundService systemForegroundService = (androidx.work.impl.foreground.SystemForegroundService) cVar;
        systemForegroundService.f12493f = true;
        a5.a0.c().a(str, "All commands completed.", new java.lang.Throwable[0]);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            systemForegroundService.stopForeground(true);
        }
        systemForegroundService.stopSelf();
        return 3;
    }
}
