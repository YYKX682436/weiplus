package sj0;

/* loaded from: classes13.dex */
public enum e implements android.view.Choreographer.FrameCallback {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public android.view.Choreographer f489883d;

    /* renamed from: e, reason: collision with root package name */
    public long f489884e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f489885f = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public boolean f489886g = false;

    e() {
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j17) {
        long millis = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(j17);
        long j18 = this.f489884e;
        if (j18 <= 0) {
            this.f489884e = millis;
        } else if (millis - j18 > 500) {
            this.f489884e = millis;
        }
        if (this.f489886g) {
            h().postFrameCallback(this);
        }
    }

    public final android.view.Choreographer h() {
        if (this.f489883d == null) {
            synchronized (this) {
                if (this.f489883d == null) {
                    if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
                        new android.os.Handler(android.os.Looper.getMainLooper()).post(new sj0.d(this));
                        try {
                            synchronized (this.f489885f) {
                                this.f489885f.wait();
                            }
                        } catch (java.lang.InterruptedException unused) {
                        }
                    } else {
                        this.f489883d = android.view.Choreographer.getInstance();
                    }
                }
            }
        }
        return this.f489883d;
    }

    public void i() {
        this.f489884e = 0L;
        this.f489886g = false;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Metronome", "[stop] stack:%s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        h().removeFrameCallback(this);
    }
}
