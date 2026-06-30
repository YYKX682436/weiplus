package c06;

/* loaded from: classes10.dex */
public final class g extends c06.e implements java.io.Serializable {

    /* renamed from: f, reason: collision with root package name */
    public int f37718f;

    /* renamed from: g, reason: collision with root package name */
    public int f37719g;

    /* renamed from: h, reason: collision with root package name */
    public int f37720h;

    /* renamed from: i, reason: collision with root package name */
    public int f37721i;

    /* renamed from: m, reason: collision with root package name */
    public int f37722m;

    /* renamed from: n, reason: collision with root package name */
    public int f37723n;

    public g(int i17, int i18) {
        int i19 = ~i17;
        this.f37718f = i17;
        this.f37719g = i18;
        this.f37720h = 0;
        this.f37721i = 0;
        this.f37722m = i19;
        this.f37723n = (i17 << 10) ^ (i18 >>> 4);
        if (!(((((i17 | i18) | 0) | 0) | i19) != 0)) {
            throw new java.lang.IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
        }
        for (int i27 = 0; i27 < 64; i27++) {
            c();
        }
    }

    @Override // c06.e
    public int a(int i17) {
        return ((-i17) >> 31) & (c() >>> (32 - i17));
    }

    @Override // c06.e
    public int c() {
        int i17 = this.f37718f;
        int i18 = i17 ^ (i17 >>> 2);
        this.f37718f = this.f37719g;
        this.f37719g = this.f37720h;
        this.f37720h = this.f37721i;
        int i19 = this.f37722m;
        this.f37721i = i19;
        int i27 = ((i18 ^ (i18 << 1)) ^ i19) ^ (i19 << 4);
        this.f37722m = i27;
        int i28 = this.f37723n + 362437;
        this.f37723n = i28;
        return i27 + i28;
    }
}
