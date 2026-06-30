package x36;

/* loaded from: classes16.dex */
public class g extends x36.j0 {

    /* renamed from: h, reason: collision with root package name */
    public static final long f533206h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f533207i;

    /* renamed from: j, reason: collision with root package name */
    public static x36.g f533208j;

    /* renamed from: k, reason: collision with root package name */
    public static final x36.c f533209k = new x36.c(null);

    /* renamed from: e, reason: collision with root package name */
    public boolean f533210e;

    /* renamed from: f, reason: collision with root package name */
    public x36.g f533211f;

    /* renamed from: g, reason: collision with root package name */
    public long f533212g;

    static {
        long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(60L);
        f533206h = millis;
        f533207i = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void i() {
        x36.g gVar;
        long j17 = this.f533225c;
        boolean z17 = this.f533223a;
        if (j17 != 0 || z17) {
            synchronized (x36.g.class) {
                if (!(!this.f533210e)) {
                    throw new java.lang.IllegalStateException("Unbalanced enter/exit".toString());
                }
                this.f533210e = true;
                if (f533208j == null) {
                    f533208j = new x36.g();
                    new x36.d().start();
                }
                long nanoTime = java.lang.System.nanoTime();
                if (j17 != 0 && z17) {
                    this.f533212g = java.lang.Math.min(j17, c() - nanoTime) + nanoTime;
                } else if (j17 != 0) {
                    this.f533212g = j17 + nanoTime;
                } else {
                    if (!z17) {
                        throw new java.lang.AssertionError();
                    }
                    this.f533212g = c();
                }
                long j18 = this.f533212g - nanoTime;
                x36.g gVar2 = f533208j;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar2);
                while (true) {
                    gVar = gVar2.f533211f;
                    if (gVar == null || j18 < gVar.f533212g - nanoTime) {
                        break;
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar);
                    gVar2 = gVar;
                }
                this.f533211f = gVar;
                gVar2.f533211f = this;
                if (gVar2 == f533208j) {
                    x36.g.class.notify();
                }
            }
        }
    }

    public final boolean j() {
        synchronized (x36.g.class) {
            if (!this.f533210e) {
                return false;
            }
            this.f533210e = false;
            x36.g gVar = f533208j;
            while (gVar != null) {
                x36.g gVar2 = gVar.f533211f;
                if (gVar2 == this) {
                    gVar.f533211f = this.f533211f;
                    this.f533211f = null;
                    return false;
                }
                gVar = gVar2;
            }
            return true;
        }
    }

    public java.io.IOException k(java.io.IOException iOException) {
        java.io.InterruptedIOException interruptedIOException = new java.io.InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void l() {
    }
}
