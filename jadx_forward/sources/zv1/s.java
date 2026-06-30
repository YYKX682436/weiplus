package zv1;

/* loaded from: classes15.dex */
public final class s {

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f557900f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f557901g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f557902h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f557903i;

    /* renamed from: a, reason: collision with root package name */
    public final long f557904a;

    /* renamed from: b, reason: collision with root package name */
    public final long f557905b;

    /* renamed from: c, reason: collision with root package name */
    public final long f557906c;

    /* renamed from: d, reason: collision with root package name */
    public final int f557907d;

    /* renamed from: e, reason: collision with root package name */
    public final int f557908e;

    /* renamed from: j, reason: collision with root package name */
    public final long f557909j;

    /* renamed from: k, reason: collision with root package name */
    public final int f557910k;

    /* renamed from: l, reason: collision with root package name */
    public final int f557911l;

    static {
        int i17 = 1;
        f557900f = z65.c.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c;
        f557901g = z65.c.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c;
        f557902h = z65.c.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c;
        if (!z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
            i17 = 24;
        }
        f557903i = i17;
    }

    public s(long j17, long j18, long j19, long j27, int i17, int i18, int i19, int i27) {
        this.f557904a = j17;
        this.f557905b = j18;
        this.f557906c = j19;
        this.f557909j = j27;
        this.f557907d = i17;
        this.f557908e = i18;
        this.f557910k = i19;
        this.f557911l = i27;
    }

    /* renamed from: equals */
    public boolean m179766xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv1.s)) {
            return false;
        }
        zv1.s sVar = (zv1.s) obj;
        return this.f557904a == sVar.f557904a && this.f557905b == sVar.f557905b && this.f557906c == sVar.f557906c && this.f557909j == sVar.f557909j && this.f557907d == sVar.f557907d && this.f557908e == sVar.f557908e && this.f557910k == sVar.f557910k && this.f557911l == sVar.f557911l;
    }

    /* renamed from: hashCode */
    public int m179767x8cdac1b() {
        return (((((((((((((java.lang.Long.hashCode(this.f557904a) * 31) + java.lang.Long.hashCode(this.f557905b)) * 31) + java.lang.Long.hashCode(this.f557906c)) * 31) + java.lang.Long.hashCode(this.f557909j)) * 31) + java.lang.Integer.hashCode(this.f557907d)) * 31) + java.lang.Integer.hashCode(this.f557908e)) * 31) + java.lang.Integer.hashCode(this.f557910k)) * 31) + java.lang.Integer.hashCode(this.f557911l);
    }

    /* renamed from: toString */
    public java.lang.String m179768x9616526c() {
        return "CleanCacheExptConfig(bizThreshold=" + this.f557904a + ", totalThreshold=" + this.f557905b + ", cleanIntervalForPerfMs=" + this.f557906c + ", cleanIntervalForProdMs=" + this.f557909j + ", reportSamplingBase=" + this.f557907d + ", logExpireDays=" + this.f557908e + ", applyOtherTypeClean=" + this.f557910k + ", applyVfsExpireClean=" + this.f557911l + ')';
    }
}
