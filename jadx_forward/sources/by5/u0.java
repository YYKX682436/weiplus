package by5;

/* loaded from: classes13.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final by5.y0 f118130a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.FutureTask f118131b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f118132c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f118133d = new java.util.concurrent.atomic.AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f118134e = new java.util.concurrent.atomic.AtomicBoolean();

    public u0() {
        by5.v0 v0Var = new by5.v0(this);
        this.f118130a = v0Var;
        this.f118131b = new by5.w0(this, v0Var);
    }

    public abstract java.lang.Object d(java.lang.Object... objArr);

    public final void e(java.lang.Object... objArr) {
        if (this.f118132c != 0) {
            int i17 = this.f118132c;
            if (i17 == 1) {
                throw new java.lang.IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (i17 == 2) {
                throw new java.lang.IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.f118132c = 1;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: by5.u0$$b
            @Override // java.lang.Runnable
            public final void run() {
                by5.u0.this.h();
            }
        };
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            runnable.run();
        } else {
            yu5.c.b(runnable);
        }
        this.f118130a.f118147d = objArr;
        yu5.b.f547447a.d(this.f118131b, "xweb_serial_async_task");
    }

    public void f(java.lang.Object obj) {
    }

    public abstract void g(java.lang.Object obj);

    public void h() {
    }

    public void i(java.lang.Object... objArr) {
    }

    public final void j(java.lang.Object... objArr) {
        by5.x0 x0Var = new by5.x0(this, objArr);
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            yu5.c.b(x0Var);
        } else {
            x0Var.run();
        }
    }
}
