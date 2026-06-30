package com.tencent.mapsdk.internal;

/* loaded from: classes16.dex */
public abstract class id {

    /* renamed from: a, reason: collision with root package name */
    public static final long f49878a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f49879b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f49880c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f49881d = 2;

    /* renamed from: e, reason: collision with root package name */
    protected long f49882e;

    /* renamed from: h, reason: collision with root package name */
    private boolean f49885h;

    /* renamed from: i, reason: collision with root package name */
    private long f49886i;

    /* renamed from: g, reason: collision with root package name */
    private long f49884g = -1;

    /* renamed from: f, reason: collision with root package name */
    protected int f49883f = 0;

    public id(long j17) {
        this.f49882e = j17;
    }

    private void a(long j17) {
        this.f49886i = j17;
    }

    private void e() {
        this.f49883f = 2;
    }

    private boolean f() {
        return this.f49883f == 1;
    }

    public abstract void a(javax.microedition.khronos.opengles.GL10 gl10, long j17);

    public void b() {
        this.f49883f = 1;
        this.f49884g = -1L;
    }

    public boolean c() {
        return this.f49883f == 2;
    }

    public void d() {
        this.f49883f = 1;
        this.f49884g = -1L;
    }

    private void a(boolean z17) {
        this.f49885h = z17;
    }

    public final long a() {
        return this.f49882e;
    }

    public void a(javax.microedition.khronos.opengles.GL10 gl10) {
        if (this.f49883f != 1) {
            return;
        }
        if (this.f49884g == -1) {
            this.f49884g = android.os.SystemClock.elapsedRealtime();
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f49884g;
        long j17 = this.f49886i;
        if (j17 - elapsedRealtime > 0) {
            return;
        }
        long j18 = elapsedRealtime - j17;
        if (j18 >= this.f49882e) {
            if (this.f49885h) {
                d();
            }
            this.f49883f = 2;
        }
        a(gl10, j18);
    }
}
