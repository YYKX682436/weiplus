package c06;

/* loaded from: classes10.dex */
public final class g extends c06.e implements java.io.Serializable {

    /* renamed from: f, reason: collision with root package name */
    public int f119251f;

    /* renamed from: g, reason: collision with root package name */
    public int f119252g;

    /* renamed from: h, reason: collision with root package name */
    public int f119253h;

    /* renamed from: i, reason: collision with root package name */
    public int f119254i;

    /* renamed from: m, reason: collision with root package name */
    public int f119255m;

    /* renamed from: n, reason: collision with root package name */
    public int f119256n;

    public g(int i17, int i18) {
        int i19 = ~i17;
        this.f119251f = i17;
        this.f119252g = i18;
        this.f119253h = 0;
        this.f119254i = 0;
        this.f119255m = i19;
        this.f119256n = (i17 << 10) ^ (i18 >>> 4);
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
        int i17 = this.f119251f;
        int i18 = i17 ^ (i17 >>> 2);
        this.f119251f = this.f119252g;
        this.f119252g = this.f119253h;
        this.f119253h = this.f119254i;
        int i19 = this.f119255m;
        this.f119254i = i19;
        int i27 = ((i18 ^ (i18 << 1)) ^ i19) ^ (i19 << 4);
        this.f119255m = i27;
        int i28 = this.f119256n + 362437;
        this.f119256n = i28;
        return i27 + i28;
    }
}
