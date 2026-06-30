package cr0;

/* loaded from: classes12.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f303311a;

    /* renamed from: b, reason: collision with root package name */
    public final long f303312b = java.lang.System.currentTimeMillis();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f303313c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public long f303314d;

    public v1(int i17) {
        this.f303311a = i17;
    }

    public final float a(long j17) {
        float f17 = ((float) (this.f303314d * 10)) * 100.0f;
        long j18 = j17 - this.f303312b;
        if (j18 < 1) {
            j18 = 1;
        }
        return f17 / ((float) j18);
    }
}
