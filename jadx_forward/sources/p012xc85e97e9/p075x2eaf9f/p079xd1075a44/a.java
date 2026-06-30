package p012xc85e97e9.p075x2eaf9f.p079xd1075a44;

/* loaded from: classes15.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public int f92607a;

    /* renamed from: b, reason: collision with root package name */
    public int f92608b;

    /* renamed from: c, reason: collision with root package name */
    public float f92609c;

    /* renamed from: d, reason: collision with root package name */
    public float f92610d;

    /* renamed from: h, reason: collision with root package name */
    public float f92614h;

    /* renamed from: i, reason: collision with root package name */
    public int f92615i;

    /* renamed from: e, reason: collision with root package name */
    public long f92611e = Long.MIN_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public long f92613g = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f92612f = 0;

    public final float a(long j17) {
        long j18 = this.f92611e;
        if (j17 < j18) {
            return 0.0f;
        }
        long j19 = this.f92613g;
        if (j19 < 0 || j17 < j19) {
            return p012xc85e97e9.p075x2eaf9f.p079xd1075a44.c.b(((float) (j17 - j18)) / this.f92607a, 0.0f, 1.0f) * 0.5f;
        }
        float f17 = this.f92614h;
        return (1.0f - f17) + (f17 * p012xc85e97e9.p075x2eaf9f.p079xd1075a44.c.b(((float) (j17 - j19)) / this.f92615i, 0.0f, 1.0f));
    }
}
