package androidx.core.widget;

/* loaded from: classes15.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public int f11074a;

    /* renamed from: b, reason: collision with root package name */
    public int f11075b;

    /* renamed from: c, reason: collision with root package name */
    public float f11076c;

    /* renamed from: d, reason: collision with root package name */
    public float f11077d;

    /* renamed from: h, reason: collision with root package name */
    public float f11081h;

    /* renamed from: i, reason: collision with root package name */
    public int f11082i;

    /* renamed from: e, reason: collision with root package name */
    public long f11078e = Long.MIN_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public long f11080g = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f11079f = 0;

    public final float a(long j17) {
        long j18 = this.f11078e;
        if (j17 < j18) {
            return 0.0f;
        }
        long j19 = this.f11080g;
        if (j19 < 0 || j17 < j19) {
            return androidx.core.widget.c.b(((float) (j17 - j18)) / this.f11074a, 0.0f, 1.0f) * 0.5f;
        }
        float f17 = this.f11081h;
        return (1.0f - f17) + (f17 * androidx.core.widget.c.b(((float) (j17 - j19)) / this.f11082i, 0.0f, 1.0f));
    }
}
