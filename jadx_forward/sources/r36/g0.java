package r36;

/* loaded from: classes16.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public long f450928a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f450929b;

    /* renamed from: c, reason: collision with root package name */
    public final int f450930c;

    /* renamed from: d, reason: collision with root package name */
    public final r36.z f450931d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Deque f450932e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f450933f;

    /* renamed from: g, reason: collision with root package name */
    public final r36.e0 f450934g;

    /* renamed from: h, reason: collision with root package name */
    public final r36.d0 f450935h;

    /* renamed from: i, reason: collision with root package name */
    public final r36.f0 f450936i;

    /* renamed from: j, reason: collision with root package name */
    public final r36.f0 f450937j;

    /* renamed from: k, reason: collision with root package name */
    public r36.b f450938k;

    public g0(int i17, r36.z zVar, boolean z17, boolean z18, l36.i0 i0Var) {
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        this.f450932e = arrayDeque;
        this.f450936i = new r36.f0(this);
        this.f450937j = new r36.f0(this);
        this.f450938k = null;
        if (zVar == null) {
            throw new java.lang.NullPointerException("connection == null");
        }
        this.f450930c = i17;
        this.f450931d = zVar;
        this.f450929b = zVar.f451022y.a();
        r36.e0 e0Var = new r36.e0(this, zVar.f451021x.a());
        this.f450934g = e0Var;
        r36.d0 d0Var = new r36.d0(this);
        this.f450935h = d0Var;
        e0Var.f450919h = z18;
        d0Var.f450905f = z17;
        if (i0Var != null) {
            arrayDeque.add(i0Var);
        }
        if (e() && i0Var != null) {
            throw new java.lang.IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!e() && i0Var == null) {
            throw new java.lang.IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    public void a() {
        boolean z17;
        boolean f17;
        synchronized (this) {
            r36.e0 e0Var = this.f450934g;
            if (!e0Var.f450919h && e0Var.f450918g) {
                r36.d0 d0Var = this.f450935h;
                if (d0Var.f450905f || d0Var.f450904e) {
                    z17 = true;
                    f17 = f();
                }
            }
            z17 = false;
            f17 = f();
        }
        if (z17) {
            c(r36.b.CANCEL);
        } else {
            if (f17) {
                return;
            }
            this.f450931d.i(this.f450930c);
        }
    }

    public void b() {
        r36.d0 d0Var = this.f450935h;
        if (d0Var.f450904e) {
            throw new java.io.IOException("stream closed");
        }
        if (d0Var.f450905f) {
            throw new java.io.IOException("stream finished");
        }
        if (this.f450938k != null) {
            throw new r36.n0(this.f450938k);
        }
    }

    public void c(r36.b bVar) {
        if (d(bVar)) {
            this.f450931d.A.k(this.f450930c, bVar);
        }
    }

    public final boolean d(r36.b bVar) {
        synchronized (this) {
            if (this.f450938k != null) {
                return false;
            }
            if (this.f450934g.f450919h && this.f450935h.f450905f) {
                return false;
            }
            this.f450938k = bVar;
            notifyAll();
            this.f450931d.i(this.f450930c);
            return true;
        }
    }

    public boolean e() {
        return this.f450931d.f451004d == ((this.f450930c & 1) == 1);
    }

    public synchronized boolean f() {
        if (this.f450938k != null) {
            return false;
        }
        r36.e0 e0Var = this.f450934g;
        if (e0Var.f450919h || e0Var.f450918g) {
            r36.d0 d0Var = this.f450935h;
            if (d0Var.f450905f || d0Var.f450904e) {
                if (this.f450933f) {
                    return false;
                }
            }
        }
        return true;
    }

    public void g() {
        try {
            wait();
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            throw new java.io.InterruptedIOException();
        }
    }
}
