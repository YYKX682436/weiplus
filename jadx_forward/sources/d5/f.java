package d5;

/* loaded from: classes13.dex */
public class f implements f5.c, b5.b, k5.w {

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String f308015p = a5.a0.e("DelayMetCommandHandler");

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f308016d;

    /* renamed from: e, reason: collision with root package name */
    public final int f308017e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f308018f;

    /* renamed from: g, reason: collision with root package name */
    public final d5.k f308019g;

    /* renamed from: h, reason: collision with root package name */
    public final f5.d f308020h;

    /* renamed from: n, reason: collision with root package name */
    public android.os.PowerManager.WakeLock f308023n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f308024o = false;

    /* renamed from: m, reason: collision with root package name */
    public int f308022m = 0;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f308021i = new java.lang.Object();

    public f(android.content.Context context, int i17, java.lang.String str, d5.k kVar) {
        this.f308016d = context;
        this.f308017e = i17;
        this.f308019g = kVar;
        this.f308018f = str;
        this.f308020h = new f5.d(context, kVar.f308032e, this);
    }

    @Override // f5.c
    public void a(java.util.List list) {
        e();
    }

    public final void b() {
        synchronized (this.f308021i) {
            this.f308020h.c();
            this.f308019g.f308033f.b(this.f308018f);
            android.os.PowerManager.WakeLock wakeLock = this.f308023n;
            if (wakeLock != null && wakeLock.isHeld()) {
                a5.a0.c().a(f308015p, java.lang.String.format("Releasing wakelock %s for WorkSpec %s", this.f308023n, this.f308018f), new java.lang.Throwable[0]);
                android.os.PowerManager.WakeLock wakeLock2 = this.f308023n;
                yj0.a.c(wakeLock2, "androidx/work/impl/background/systemalarm/DelayMetCommandHandler", "cleanUp", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                wakeLock2.release();
                yj0.a.f(wakeLock2, "androidx/work/impl/background/systemalarm/DelayMetCommandHandler", "cleanUp", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            }
        }
    }

    public void c() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f308017e);
        java.lang.String str = this.f308018f;
        this.f308023n = k5.o.a(this.f308016d, java.lang.String.format("%s (%s)", str, valueOf));
        java.lang.String str2 = f308015p;
        a5.a0.c().a(str2, java.lang.String.format("Acquiring wakelock %s for WorkSpec %s", this.f308023n, str), new java.lang.Throwable[0]);
        android.os.PowerManager.WakeLock wakeLock = this.f308023n;
        yj0.a.c(wakeLock, "androidx/work/impl/background/systemalarm/DelayMetCommandHandler", "handleProcessWork", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        wakeLock.acquire();
        yj0.a.f(wakeLock, "androidx/work/impl/background/systemalarm/DelayMetCommandHandler", "handleProcessWork", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        j5.w i17 = ((j5.g0) this.f308019g.f308035h.f99430c.n()).i(str);
        if (i17 == null) {
            e();
            return;
        }
        boolean b17 = i17.b();
        this.f308024o = b17;
        if (b17) {
            this.f308020h.b(java.util.Collections.singletonList(i17));
        } else {
            a5.a0.c().a(str2, java.lang.String.format("No constraints for %s", str), new java.lang.Throwable[0]);
            f(java.util.Collections.singletonList(str));
        }
    }

    @Override // b5.b
    public void d(java.lang.String str, boolean z17) {
        a5.a0.c().a(f308015p, java.lang.String.format("onExecuted %s, %s", str, java.lang.Boolean.valueOf(z17)), new java.lang.Throwable[0]);
        b();
        int i17 = this.f308017e;
        d5.k kVar = this.f308019g;
        android.content.Context context = this.f308016d;
        if (z17) {
            kVar.e(new d5.h(kVar, d5.b.b(context, this.f308018f), i17));
        }
        if (this.f308024o) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) p012xc85e97e9.p125x37c711.p126x316220.p127xb098552e.p128xa4980d82.ServiceC1273x1138b13.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            kVar.e(new d5.h(kVar, intent, i17));
        }
    }

    public final void e() {
        synchronized (this.f308021i) {
            if (this.f308022m < 2) {
                this.f308022m = 2;
                a5.a0 c17 = a5.a0.c();
                java.lang.String str = f308015p;
                c17.a(str, java.lang.String.format("Stopping work for WorkSpec %s", this.f308018f), new java.lang.Throwable[0]);
                android.content.Context context = this.f308016d;
                java.lang.String str2 = this.f308018f;
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) p012xc85e97e9.p125x37c711.p126x316220.p127xb098552e.p128xa4980d82.ServiceC1273x1138b13.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str2);
                d5.k kVar = this.f308019g;
                kVar.e(new d5.h(kVar, intent, this.f308017e));
                if (this.f308019g.f308034g.c(this.f308018f)) {
                    a5.a0.c().a(str, java.lang.String.format("WorkSpec %s needs to be rescheduled", this.f308018f), new java.lang.Throwable[0]);
                    android.content.Intent b17 = d5.b.b(this.f308016d, this.f308018f);
                    d5.k kVar2 = this.f308019g;
                    kVar2.e(new d5.h(kVar2, b17, this.f308017e));
                } else {
                    a5.a0.c().a(str, java.lang.String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f308018f), new java.lang.Throwable[0]);
                }
            } else {
                a5.a0.c().a(f308015p, java.lang.String.format("Already stopped work for %s", this.f308018f), new java.lang.Throwable[0]);
            }
        }
    }

    @Override // f5.c
    public void f(java.util.List list) {
        if (list.contains(this.f308018f)) {
            synchronized (this.f308021i) {
                if (this.f308022m == 0) {
                    this.f308022m = 1;
                    a5.a0.c().a(f308015p, java.lang.String.format("onAllConstraintsMet for %s", this.f308018f), new java.lang.Throwable[0]);
                    if (this.f308019g.f308034g.f(this.f308018f, null)) {
                        this.f308019g.f308033f.a(this.f308018f, 600000L, this);
                    } else {
                        b();
                    }
                } else {
                    a5.a0.c().a(f308015p, java.lang.String.format("Already started work for %s", this.f308018f), new java.lang.Throwable[0]);
                }
            }
        }
    }
}
