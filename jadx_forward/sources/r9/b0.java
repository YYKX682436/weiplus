package r9;

/* loaded from: classes15.dex */
public final class b0 extends android.os.Handler implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final r9.c0 f474875d;

    /* renamed from: e, reason: collision with root package name */
    public final r9.a0 f474876e;

    /* renamed from: f, reason: collision with root package name */
    public final int f474877f;

    /* renamed from: g, reason: collision with root package name */
    public final long f474878g;

    /* renamed from: h, reason: collision with root package name */
    public java.io.IOException f474879h;

    /* renamed from: i, reason: collision with root package name */
    public int f474880i;

    /* renamed from: m, reason: collision with root package name */
    public volatile java.lang.Thread f474881m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f474882n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r9.g0 f474883o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(r9.g0 g0Var, android.os.Looper looper, r9.c0 c0Var, r9.a0 a0Var, int i17, long j17) {
        super(looper);
        this.f474883o = g0Var;
        this.f474875d = c0Var;
        this.f474876e = a0Var;
        this.f474877f = i17;
        this.f474878g = j17;
    }

    public void b(boolean z17) {
        this.f474882n = z17;
        this.f474879h = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z17) {
                sendEmptyMessage(1);
            }
        } else {
            this.f474875d.c();
            if (this.f474881m != null) {
                this.f474881m.interrupt();
            }
        }
        if (z17) {
            this.f474883o.f474899b = null;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            this.f474876e.q(this.f474875d, elapsedRealtime, elapsedRealtime - this.f474878g, true);
        }
    }

    public void c(long j17) {
        r9.g0 g0Var = this.f474883o;
        t9.a.d(g0Var.f474899b == null);
        g0Var.f474899b = this;
        if (j17 > 0) {
            sendEmptyMessageDelayed(0, j17);
        } else {
            this.f474879h = null;
            g0Var.f474898a.execute(g0Var.f474899b);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        if (this.f474882n) {
            return;
        }
        int i17 = message.what;
        if (i17 == 0) {
            this.f474879h = null;
            r9.g0 g0Var = this.f474883o;
            g0Var.f474898a.execute(g0Var.f474899b);
            return;
        }
        if (i17 == 4) {
            throw ((java.lang.Error) message.obj);
        }
        this.f474883o.f474899b = null;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j17 = elapsedRealtime - this.f474878g;
        if (this.f474875d.b()) {
            this.f474876e.q(this.f474875d, elapsedRealtime, j17, false);
            return;
        }
        int i18 = message.what;
        if (i18 == 1) {
            this.f474876e.q(this.f474875d, elapsedRealtime, j17, false);
            return;
        }
        if (i18 == 2) {
            this.f474876e.e(this.f474875d, elapsedRealtime, j17);
            return;
        }
        if (i18 != 3) {
            return;
        }
        java.io.IOException iOException = (java.io.IOException) message.obj;
        this.f474879h = iOException;
        int g17 = this.f474876e.g(this.f474875d, elapsedRealtime, j17, iOException);
        if (g17 == 3) {
            this.f474883o.f474900c = this.f474879h;
        } else if (g17 != 2) {
            this.f474880i = g17 != 1 ? 1 + this.f474880i : 1;
            c(java.lang.Math.min((r1 - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f474881m = java.lang.Thread.currentThread();
            if (!this.f474875d.b()) {
                this.f474875d.getClass();
                int i17 = t9.d0.f498031a;
                try {
                    this.f474875d.a();
                } catch (java.lang.Throwable th6) {
                    int i18 = t9.d0.f498031a;
                    throw th6;
                }
            }
            if (this.f474882n) {
                return;
            }
            sendEmptyMessage(2);
        } catch (java.io.IOException e17) {
            if (this.f474882n) {
                return;
            }
            obtainMessage(3, e17).sendToTarget();
        } catch (java.lang.OutOfMemoryError e18) {
            if (this.f474882n) {
                return;
            }
            obtainMessage(3, new r9.f0(e18)).sendToTarget();
        } catch (java.lang.Error e19) {
            if (!this.f474882n) {
                obtainMessage(4, e19).sendToTarget();
            }
            throw e19;
        } catch (java.lang.InterruptedException unused) {
            t9.a.d(this.f474875d.b());
            if (this.f474882n) {
                return;
            }
            sendEmptyMessage(2);
        } catch (java.lang.Exception e27) {
            if (this.f474882n) {
                return;
            }
            obtainMessage(3, new r9.f0(e27)).sendToTarget();
        }
    }
}
