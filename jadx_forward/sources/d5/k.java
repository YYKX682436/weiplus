package d5;

/* loaded from: classes13.dex */
public class k implements b5.b {

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String f308030q = a5.a0.e("SystemAlarmDispatcher");

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f308031d;

    /* renamed from: e, reason: collision with root package name */
    public final m5.a f308032e;

    /* renamed from: f, reason: collision with root package name */
    public final k5.y f308033f;

    /* renamed from: g, reason: collision with root package name */
    public final b5.e f308034g;

    /* renamed from: h, reason: collision with root package name */
    public final b5.w f308035h;

    /* renamed from: i, reason: collision with root package name */
    public final d5.b f308036i;

    /* renamed from: m, reason: collision with root package name */
    public final android.os.Handler f308037m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f308038n;

    /* renamed from: o, reason: collision with root package name */
    public android.content.Intent f308039o;

    /* renamed from: p, reason: collision with root package name */
    public d5.i f308040p;

    public k(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.f308031d = applicationContext;
        this.f308036i = new d5.b(applicationContext);
        this.f308033f = new k5.y();
        b5.w c17 = b5.w.c(context);
        this.f308035h = c17;
        b5.e eVar = c17.f99433f;
        this.f308034g = eVar;
        this.f308032e = c17.f99431d;
        eVar.a(this);
        this.f308038n = new java.util.ArrayList();
        this.f308039o = null;
        this.f308037m = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public boolean a(android.content.Intent intent, int i17) {
        boolean z17;
        a5.a0 c17 = a5.a0.c();
        java.lang.String str = f308030q;
        c17.a(str, java.lang.String.format("Adding command %s (%s)", intent, java.lang.Integer.valueOf(i17)), new java.lang.Throwable[0]);
        b();
        java.lang.String action = intent.getAction();
        if (android.text.TextUtils.isEmpty(action)) {
            a5.a0.c().f(str, "Unknown command. Ignoring", new java.lang.Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.f308038n) {
                java.util.Iterator it = ((java.util.ArrayList) this.f308038n).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z17 = false;
                        break;
                    }
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((android.content.Intent) it.next()).getAction())) {
                        z17 = true;
                        break;
                    }
                }
            }
            if (z17) {
                return false;
            }
        }
        intent.putExtra("KEY_START_ID", i17);
        synchronized (this.f308038n) {
            boolean z18 = ((java.util.ArrayList) this.f308038n).isEmpty() ? false : true;
            ((java.util.ArrayList) this.f308038n).add(intent);
            if (!z18) {
                f();
            }
        }
        return true;
    }

    public final void b() {
        if (this.f308037m.getLooper().getThread() != java.lang.Thread.currentThread()) {
            throw new java.lang.IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public void c() {
        a5.a0.c().a(f308030q, "Destroying SystemAlarmDispatcher", new java.lang.Throwable[0]);
        b5.e eVar = this.f308034g;
        synchronized (eVar.f99401q) {
            ((java.util.ArrayList) eVar.f99400p).remove(this);
        }
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.f308033f.f385705a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.f308040p = null;
    }

    @Override // b5.b
    public void d(java.lang.String str, boolean z17) {
        java.lang.String str2 = d5.b.f308003g;
        android.content.Intent intent = new android.content.Intent(this.f308031d, (java.lang.Class<?>) p012xc85e97e9.p125x37c711.p126x316220.p127xb098552e.p128xa4980d82.ServiceC1273x1138b13.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z17);
        e(new d5.h(this, intent, 0));
    }

    public void e(java.lang.Runnable runnable) {
        this.f308037m.post(runnable);
    }

    public final void f() {
        b();
        android.os.PowerManager.WakeLock a17 = k5.o.a(this.f308031d, "ProcessCommand");
        try {
            yj0.a.c(a17, "androidx/work/impl/background/systemalarm/SystemAlarmDispatcher", "processCommand", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            a17.acquire();
            yj0.a.f(a17, "androidx/work/impl/background/systemalarm/SystemAlarmDispatcher", "processCommand", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            ((m5.c) this.f308035h.f99431d).a(new d5.g(this));
        } finally {
            yj0.a.c(a17, "androidx/work/impl/background/systemalarm/SystemAlarmDispatcher", "processCommand", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            a17.release();
            yj0.a.f(a17, "androidx/work/impl/background/systemalarm/SystemAlarmDispatcher", "processCommand", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        }
    }
}
