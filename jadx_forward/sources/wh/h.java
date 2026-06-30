package wh;

/* loaded from: classes12.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final long f527325a = android.os.SystemClock.uptimeMillis();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f527326b;

    /* renamed from: c, reason: collision with root package name */
    public final long f527327c;

    public h(java.lang.Object obj, long j17) {
        this.f527326b = obj;
        this.f527327c = j17;
    }

    public final boolean a() {
        return android.os.SystemClock.uptimeMillis() - this.f527325a >= this.f527327c;
    }
}
