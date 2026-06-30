package gj;

/* loaded from: classes7.dex */
public class o implements java.lang.Runnable {

    /* renamed from: n, reason: collision with root package name */
    public static final gj.o f353900n = new gj.o();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f353901d = false;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f353902e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public long f353903f = 16666666;

    /* renamed from: g, reason: collision with root package name */
    public int[] f353904g = new int[3];

    /* renamed from: h, reason: collision with root package name */
    public boolean[] f353905h = new boolean[3];

    /* renamed from: i, reason: collision with root package name */
    public long[] f353906i = new long[3];

    /* renamed from: m, reason: collision with root package name */
    public boolean f353907m = false;

    public final synchronized void a(int i17, java.lang.Runnable runnable, boolean z17) {
        if (this.f353905h[i17]) {
            oj.j.f("Matrix.UIThreadMonitor", "[addFrameCallback] this type %s callback has exist! isAddHeader:%s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
            return;
        }
        if (!this.f353901d && i17 == 0) {
            oj.j.f("Matrix.UIThreadMonitor", "[addFrameCallback] UIThreadMonitor is not alive!", new java.lang.Object[0]);
            return;
        }
        try {
            throw null;
        } catch (java.lang.Exception e17) {
            oj.j.b("Matrix.UIThreadMonitor", e17.toString(), new java.lang.Object[0]);
        }
    }

    public void b(jj.f fVar) {
        if (!this.f353901d) {
            e();
        }
        synchronized (this.f353902e) {
            this.f353902e.add(fVar);
        }
    }

    public final void c(int i17) {
        this.f353904g[i17] = 1;
        this.f353906i[i17] = java.lang.System.nanoTime();
    }

    public final void d(int i17) {
        this.f353904g[i17] = 2;
        this.f353906i[i17] = java.lang.System.nanoTime() - this.f353906i[i17];
        synchronized (this) {
            this.f353905h[i17] = false;
        }
    }

    public synchronized void e() {
        if (!this.f353907m) {
            oj.j.b("Matrix.UIThreadMonitor", "[onStart] is never init.", new java.lang.Object[0]);
            return;
        }
        if (!this.f353901d) {
            this.f353901d = true;
            synchronized (this) {
                oj.j.c("Matrix.UIThreadMonitor", "[onStart] callbackExist:%s %s", java.util.Arrays.toString(this.f353905h), lj.f.c());
                this.f353905h = new boolean[3];
                this.f353904g = new int[3];
                this.f353906i = new long[3];
                a(0, this, true);
            }
        }
    }

    public synchronized void f() {
        if (!this.f353907m) {
            oj.j.b("Matrix.UIThreadMonitor", "[onStart] is never init.", new java.lang.Object[0]);
            return;
        }
        if (this.f353901d) {
            this.f353901d = false;
            oj.j.c("Matrix.UIThreadMonitor", "[onStop] callbackExist:%s %s", java.util.Arrays.toString(this.f353905h), lj.f.c());
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.System.nanoTime();
        c(0);
        a(1, new gj.m(this), true);
        a(2, new gj.n(this), true);
        throw null;
    }
}
