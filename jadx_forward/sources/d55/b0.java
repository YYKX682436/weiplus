package d55;

/* loaded from: classes12.dex */
public abstract class b0 implements d55.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f308097d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f308098e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f308099f;

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseArray f308100g;

    /* renamed from: h, reason: collision with root package name */
    public final d55.b0 f308101h;

    /* renamed from: i, reason: collision with root package name */
    public android.os.Handler f308102i;

    /* renamed from: m, reason: collision with root package name */
    public long f308103m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f308104n;

    /* renamed from: o, reason: collision with root package name */
    public d55.j f308105o;

    /* renamed from: p, reason: collision with root package name */
    public d55.j f308106p;

    /* renamed from: q, reason: collision with root package name */
    public d55.a0 f308107q;

    public b0(android.content.Context context) {
        java.lang.String str;
        android.content.pm.PackageInfo packageInfo;
        this.f308097d = context;
        this.f308098e = new android.os.Handler(android.os.Looper.getMainLooper());
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.RuntimeException e17) {
            d55.q0.a("MicroMsg.recovery.utils", "get version name fail", e17);
        }
        if (packageInfo != null) {
            str = packageInfo.versionName;
            this.f308104n = str;
            this.f308107q = null;
            d55.e eVar = new d55.e();
            eVar.f308086a = null;
            this.f308099f = new java.util.concurrent.atomic.AtomicReference(eVar);
            android.util.SparseArray sparseArray = new android.util.SparseArray(2);
            this.f308100g = sparseArray;
            sparseArray.put(1, new java.util.ArrayList());
            sparseArray.put(2, new java.util.ArrayList());
            android.content.Context context2 = this.f308097d;
            d55.v vVar = new d55.v(context2, "recovery_crash_count");
            vVar.a();
            d55.k kVar = new d55.k(vVar);
            d55.j jVar = new d55.j(kVar, new d55.v(context2, "recovery_crash"));
            kVar.f308130a = java.lang.Math.max(vVar.mo123525xb58848b9("crash_count", 0), 0);
            this.f308106p = jVar;
        }
        str = null;
        this.f308104n = str;
        this.f308107q = null;
        d55.e eVar2 = new d55.e();
        eVar2.f308086a = null;
        this.f308099f = new java.util.concurrent.atomic.AtomicReference(eVar2);
        android.util.SparseArray sparseArray2 = new android.util.SparseArray(2);
        this.f308100g = sparseArray2;
        sparseArray2.put(1, new java.util.ArrayList());
        sparseArray2.put(2, new java.util.ArrayList());
        android.content.Context context22 = this.f308097d;
        d55.v vVar2 = new d55.v(context22, "recovery_crash_count");
        vVar2.a();
        d55.k kVar2 = new d55.k(vVar2);
        d55.j jVar2 = new d55.j(kVar2, new d55.v(context22, "recovery_crash"));
        kVar2.f308130a = java.lang.Math.max(vVar2.mo123525xb58848b9("crash_count", 0), 0);
        this.f308106p = jVar2;
    }

    public void a() {
        b();
        android.content.Context context = this.f308097d;
        d55.j b17 = d55.j.b(context);
        b17.d();
        b17.e();
        d55.j c17 = d55.j.c(context);
        c17.d();
        c17.e();
    }

    public void b() {
        this.f308105o.d();
    }

    public void c() {
        d55.a0 a0Var = this.f308107q;
        android.content.Context context = this.f308097d;
        if (a0Var == null) {
            this.f308107q = new d55.a0(context);
            ((d55.a) ((d55.h) this.f308099f.get())).f308086a = this.f308107q;
        }
        if (this.f308106p == null) {
            d55.v vVar = new d55.v(context, "recovery_crash_count");
            vVar.a();
            d55.k kVar = new d55.k(vVar);
            d55.j jVar = new d55.j(kVar, new d55.v(context, "recovery_crash"));
            kVar.f308130a = java.lang.Math.max(vVar.mo123525xb58848b9("crash_count", 0), 0);
            this.f308106p = jVar;
        }
        this.f308106p.a();
        if (this.f308105o == null) {
            d55.j jVar2 = this.f308106p;
            long j17 = jVar2.f308121a;
            java.lang.String str = jVar2.f308122b;
            d55.k kVar2 = jVar2.f308124d;
            this.f308105o = new d55.j(j17, str, new d55.k(kVar2.f308130a, kVar2.f308131b), jVar2.f308123c);
        }
    }

    public int d() {
        return this.f308106p.f308124d.f308130a;
    }

    public void e() {
        d55.j jVar = this.f308105o;
        jVar.f308124d.f308130a++;
        jVar.f308122b = this.f308104n;
        jVar.f308121a = this.f308103m;
    }

    public boolean f() {
        d55.o0.a(4, "MicroMsg.recovery.trigger", "onLaunchRecovery");
        try {
            ((d55.h) this.f308099f.get()).b(this.f308097d, this.f308105o);
            return true;
        } catch (java.lang.Throwable th6) {
            d55.q0.a("MicroMsg.recovery.trigger", "on launch recovery action error, mission aborted", th6);
            return false;
        }
    }

    public void g(int i17) {
        d55.o0.a(4, "MicroMsg.recovery.trigger", "recovery event, level = " + i17);
        java.util.Iterator it = ((java.util.List) this.f308100g.get(i17)).iterator();
        while (it.hasNext()) {
            try {
                ((d55.l) it.next()).a(this.f308097d, this.f308105o, i17);
            } catch (java.lang.Throwable th6) {
                d55.q0.a("MicroMsg.recovery.trigger", "recovery event error", th6);
            }
        }
    }

    public void h() {
        d55.o0.a(4, "MicroMsg.recovery.trigger", "#onTerminate");
        try {
            ((d55.h) this.f308099f.get()).a(this.f308097d, this.f308105o);
        } catch (java.lang.Throwable unused) {
        }
    }

    public void i(boolean z17) {
        if (z17) {
            this.f308105o.e();
            return;
        }
        d55.j jVar = this.f308105o;
        d55.k kVar = jVar.f308124d;
        kVar.f308131b.mo123529xc5c55e60("crash_count", kVar.f308130a).d();
        jVar.f308123c.mo123531xe4673800("crash_version", jVar.f308122b).mo123530xf2e7ce2b("crash_time", jVar.f308121a).d();
    }

    public b0(d55.b0 b0Var) {
        this.f308101h = b0Var;
        this.f308097d = b0Var.f308097d;
        this.f308098e = b0Var.f308098e;
        this.f308102i = b0Var.f308102i;
        this.f308104n = b0Var.f308104n;
        this.f308106p = b0Var.f308106p;
        this.f308107q = b0Var.f308107q;
        this.f308099f = b0Var.f308099f;
        this.f308100g = b0Var.f308100g;
    }
}
