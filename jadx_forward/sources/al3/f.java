package al3;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public al3.h f87389c;

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f87387a = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public long f87390d = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Runnable f87388b = new al3.e(this);

    public final void a(long j17) {
        if (j17 < 0) {
            return;
        }
        this.f87390d = j17;
        android.os.Handler handler = this.f87387a;
        java.lang.Runnable runnable = this.f87388b;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, this.f87390d);
    }
}
