package kh4;

/* loaded from: classes15.dex */
public enum d implements android.view.Choreographer.FrameCallback {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public android.view.Choreographer f389584d;

    /* renamed from: e, reason: collision with root package name */
    public long f389585e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f389586f = 0;

    /* renamed from: g, reason: collision with root package name */
    public double f389587g = 0.0d;

    /* renamed from: h, reason: collision with root package name */
    public boolean f389588h = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f389589i = new java.lang.Object();

    d() {
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j17) {
        long millis = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(j17);
        long j18 = this.f389585e;
        if (j18 > 0) {
            long j19 = millis - j18;
            this.f389586f = this.f389586f + 1;
            if (j19 > 500) {
                this.f389587g = (r2 * 1000) / j19;
                this.f389585e = millis;
                this.f389586f = 0;
            }
        } else {
            this.f389585e = millis;
        }
        if (this.f389588h) {
            h().postFrameCallback(this);
        }
    }

    public final android.view.Choreographer h() {
        if (this.f389584d == null) {
            synchronized (this) {
                if (this.f389584d == null) {
                    if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
                        new android.os.Handler(android.os.Looper.getMainLooper()).post(new kh4.c(this));
                        try {
                            synchronized (this.f389589i) {
                                this.f389589i.wait();
                            }
                        } catch (java.lang.InterruptedException unused) {
                        }
                    } else {
                        this.f389584d = android.view.Choreographer.getInstance();
                    }
                }
            }
        }
        return this.f389584d;
    }
}
