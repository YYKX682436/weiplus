package bm5;

/* loaded from: classes12.dex */
public final class o0 {

    /* renamed from: d, reason: collision with root package name */
    public static final long f22714d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f22715e;

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f22716a;

    /* renamed from: b, reason: collision with root package name */
    public long f22717b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f22718c = 0;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        f22714d = timeUnit.toMillis(5L);
        f22715e = timeUnit.toMillis(10L);
    }

    public o0(android.os.Looper looper) {
        this.f22716a = new bm5.n0(this, looper);
    }

    public void a() {
        this.f22716a.sendEmptyMessageDelayed(1, f22714d);
    }
}
