package u04;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public long f505013a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f505014b = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Runnable f505015c = new u04.e(this);

    /* renamed from: d, reason: collision with root package name */
    public u04.g f505016d;

    public f(long j17) {
        this.f505013a = j17;
    }

    public final void a() {
        android.os.Handler handler = this.f505014b;
        java.lang.Runnable runnable = this.f505015c;
        handler.removeCallbacks(runnable);
        long j17 = this.f505013a;
        if (j17 < 0) {
            return;
        }
        this.f505013a = j17;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, this.f505013a);
    }
}
