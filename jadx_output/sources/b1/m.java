package b1;

/* loaded from: classes14.dex */
public final class m implements b1.b {

    /* renamed from: a, reason: collision with root package name */
    public static final b1.m f16998a = new b1.m();

    /* renamed from: b, reason: collision with root package name */
    public static final long f16999b;

    /* renamed from: c, reason: collision with root package name */
    public static final p2.s f17000c;

    /* renamed from: d, reason: collision with root package name */
    public static final p2.f f17001d;

    static {
        int i17 = d1.k.f225643d;
        f16999b = d1.k.f225642c;
        f17000c = p2.s.Ltr;
        f17001d = new p2.g(1.0f, 1.0f);
    }

    @Override // b1.b
    public long a() {
        return f16999b;
    }

    @Override // b1.b
    public p2.f getDensity() {
        return f17001d;
    }

    @Override // b1.b
    public p2.s getLayoutDirection() {
        return f17000c;
    }
}
