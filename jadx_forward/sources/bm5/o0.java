package bm5;

/* loaded from: classes12.dex */
public final class o0 {

    /* renamed from: d, reason: collision with root package name */
    public static final long f104247d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f104248e;

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f104249a;

    /* renamed from: b, reason: collision with root package name */
    public long f104250b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f104251c = 0;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        f104247d = timeUnit.toMillis(5L);
        f104248e = timeUnit.toMillis(10L);
    }

    public o0(android.os.Looper looper) {
        this.f104249a = new bm5.n0(this, looper);
    }

    public void a() {
        this.f104249a.sendEmptyMessageDelayed(1, f104247d);
    }
}
