package al3;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public al3.h f5856c;

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f5854a = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public long f5857d = com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Runnable f5855b = new al3.e(this);

    public final void a(long j17) {
        if (j17 < 0) {
            return;
        }
        this.f5857d = j17;
        android.os.Handler handler = this.f5854a;
        java.lang.Runnable runnable = this.f5855b;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, this.f5857d);
    }
}
