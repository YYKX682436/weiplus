package x36;

/* loaded from: classes16.dex */
public class j0 {

    /* renamed from: d, reason: collision with root package name */
    public static final x36.j0 f533222d = new x36.i0();

    /* renamed from: a, reason: collision with root package name */
    public boolean f533223a;

    /* renamed from: b, reason: collision with root package name */
    public long f533224b;

    /* renamed from: c, reason: collision with root package name */
    public long f533225c;

    public x36.j0 a() {
        this.f533223a = false;
        return this;
    }

    public x36.j0 b() {
        this.f533225c = 0L;
        return this;
    }

    public long c() {
        if (this.f533223a) {
            return this.f533224b;
        }
        throw new java.lang.IllegalStateException("No deadline".toString());
    }

    public x36.j0 d(long j17) {
        this.f533223a = true;
        this.f533224b = j17;
        return this;
    }

    public boolean e() {
        return this.f533223a;
    }

    public void f() {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(currentThread, "Thread.currentThread()");
        if (currentThread.isInterrupted()) {
            throw new java.io.InterruptedIOException("interrupted");
        }
        if (this.f533223a && this.f533224b - java.lang.System.nanoTime() <= 0) {
            throw new java.io.InterruptedIOException("deadline reached");
        }
    }

    public x36.j0 g(long j17, java.util.concurrent.TimeUnit unit) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unit, "unit");
        if (j17 >= 0) {
            this.f533225c = unit.toNanos(j17);
            return this;
        }
        throw new java.lang.IllegalArgumentException(("timeout < 0: " + j17).toString());
    }

    public long h() {
        return this.f533225c;
    }
}
