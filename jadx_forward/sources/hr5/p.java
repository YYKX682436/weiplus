package hr5;

/* loaded from: classes15.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f365964a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f365965b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f365966c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f365967d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f365968e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f365969f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f365970g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f365971h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f365972i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f365973j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f365974k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f365975l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f365976m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f365977n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f365978o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f365979p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f365980q;

    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public p(int i17) {
        this.f365964a = i17;
        ?? r07 = (i17 & 1) != 0 ? 1 : 0;
        this.f365965b = r07;
        boolean z17 = (i17 & 2) != 0;
        this.f365966c = z17;
        boolean z18 = (i17 & 4) != 0;
        this.f365967d = z18;
        boolean z19 = (i17 & 8) != 0;
        this.f365968e = z19;
        boolean z27 = (i17 & 16) != 0;
        this.f365969f = z27;
        boolean z28 = (i17 & 32) != 0;
        this.f365970g = z28;
        boolean z29 = (i17 & 2048) != 0;
        this.f365971h = z29;
        boolean z37 = (i17 & 64) != 0;
        this.f365972i = z37;
        boolean z38 = (i17 & 128) != 0;
        this.f365973j = z38;
        boolean z39 = (i17 & 256) != 0;
        this.f365974k = z39;
        boolean z47 = (i17 & 512) != 0;
        this.f365975l = z47;
        boolean z48 = (i17 & 1024) != 0;
        this.f365976m = z48;
        int i18 = z17 ? r07 + 1 : r07;
        i18 = z18 ? i18 + 1 : i18;
        i18 = z19 ? i18 + 1 : i18;
        i18 = z27 ? i18 + 1 : i18;
        i18 = z28 ? i18 + 1 : i18;
        i18 = z29 ? i18 + 1 : i18;
        i18 = z37 ? i18 + 1 : i18;
        i18 = z38 ? i18 + 1 : i18;
        i18 = z39 ? i18 + 1 : i18;
        i18 = z47 ? i18 + 1 : i18;
        i18 = z48 ? i18 + 1 : i18;
        this.f365977n = i18 == 0;
        this.f365978o = i18 == 1 && r07 != 0;
        if (i18 != 1 || !z17) {
        }
        this.f365979p = i18 == 1 && z18;
        this.f365980q = jz5.h.b(new hr5.o(this));
    }

    /* renamed from: equals */
    public boolean m134016xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && hr5.p.class == obj.getClass() && this.f365964a == ((hr5.p) obj).f365964a;
    }

    /* renamed from: hashCode */
    public int m134017x8cdac1b() {
        return this.f365964a;
    }

    /* renamed from: toString */
    public java.lang.String m134018x9616526c() {
        return "ResetParamsDiffResult(" + ((java.lang.String) ((jz5.n) this.f365980q).mo141623x754a37bb()) + ')';
    }
}
