package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes16.dex */
public abstract class id {

    /* renamed from: a, reason: collision with root package name */
    public static final long f131411a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f131412b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f131413c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f131414d = 2;

    /* renamed from: e, reason: collision with root package name */
    protected long f131415e;

    /* renamed from: h, reason: collision with root package name */
    private boolean f131418h;

    /* renamed from: i, reason: collision with root package name */
    private long f131419i;

    /* renamed from: g, reason: collision with root package name */
    private long f131417g = -1;

    /* renamed from: f, reason: collision with root package name */
    protected int f131416f = 0;

    public id(long j17) {
        this.f131415e = j17;
    }

    private void a(long j17) {
        this.f131419i = j17;
    }

    private void e() {
        this.f131416f = 2;
    }

    private boolean f() {
        return this.f131416f == 1;
    }

    public abstract void a(javax.microedition.khronos.opengles.GL10 gl10, long j17);

    public void b() {
        this.f131416f = 1;
        this.f131417g = -1L;
    }

    public boolean c() {
        return this.f131416f == 2;
    }

    public void d() {
        this.f131416f = 1;
        this.f131417g = -1L;
    }

    private void a(boolean z17) {
        this.f131418h = z17;
    }

    public final long a() {
        return this.f131415e;
    }

    public void a(javax.microedition.khronos.opengles.GL10 gl10) {
        if (this.f131416f != 1) {
            return;
        }
        if (this.f131417g == -1) {
            this.f131417g = android.os.SystemClock.elapsedRealtime();
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f131417g;
        long j17 = this.f131419i;
        if (j17 - elapsedRealtime > 0) {
            return;
        }
        long j18 = elapsedRealtime - j17;
        if (j18 >= this.f131415e) {
            if (this.f131418h) {
                d();
            }
            this.f131416f = 2;
        }
        a(gl10, j18);
    }
}
