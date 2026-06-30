package f00;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final float f339829a;

    /* renamed from: b, reason: collision with root package name */
    public final float f339830b;

    /* renamed from: c, reason: collision with root package name */
    public final float f339831c;

    /* renamed from: d, reason: collision with root package name */
    public final float f339832d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f339833e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f339834f;

    /* renamed from: g, reason: collision with root package name */
    public final float f339835g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f339836h;

    /* renamed from: i, reason: collision with root package name */
    public final float f339837i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f339838j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f339839k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f339840l;

    public f(float f17, float f18, float f19, float f27, boolean z17, boolean z18, float f28, boolean z19, float f29, boolean z27, boolean z28, boolean z29, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z27 = (i17 & 512) != 0 ? false : z27;
        z28 = (i17 & 1024) != 0 ? false : z28;
        z29 = (i17 & 2048) != 0 ? true : z29;
        this.f339829a = f17;
        this.f339830b = f18;
        this.f339831c = f19;
        this.f339832d = f27;
        this.f339833e = z17;
        this.f339834f = z18;
        this.f339835g = f28;
        this.f339836h = z19;
        this.f339837i = f29;
        this.f339838j = z27;
        this.f339839k = z28;
        this.f339840l = z29;
    }

    /* renamed from: equals */
    public boolean m128535xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f00.f)) {
            return false;
        }
        f00.f fVar = (f00.f) obj;
        return java.lang.Float.compare(this.f339829a, fVar.f339829a) == 0 && java.lang.Float.compare(this.f339830b, fVar.f339830b) == 0 && java.lang.Float.compare(this.f339831c, fVar.f339831c) == 0 && java.lang.Float.compare(this.f339832d, fVar.f339832d) == 0 && this.f339833e == fVar.f339833e && this.f339834f == fVar.f339834f && java.lang.Float.compare(this.f339835g, fVar.f339835g) == 0 && this.f339836h == fVar.f339836h && java.lang.Float.compare(this.f339837i, fVar.f339837i) == 0 && this.f339838j == fVar.f339838j && this.f339839k == fVar.f339839k && this.f339840l == fVar.f339840l;
    }

    /* renamed from: hashCode */
    public int m128536x8cdac1b() {
        return (((((((((((((((((((((java.lang.Float.hashCode(this.f339829a) * 31) + java.lang.Float.hashCode(this.f339830b)) * 31) + java.lang.Float.hashCode(this.f339831c)) * 31) + java.lang.Float.hashCode(this.f339832d)) * 31) + java.lang.Boolean.hashCode(this.f339833e)) * 31) + java.lang.Boolean.hashCode(this.f339834f)) * 31) + java.lang.Float.hashCode(this.f339835g)) * 31) + java.lang.Boolean.hashCode(this.f339836h)) * 31) + java.lang.Float.hashCode(this.f339837i)) * 31) + java.lang.Boolean.hashCode(this.f339838j)) * 31) + java.lang.Boolean.hashCode(this.f339839k)) * 31) + java.lang.Boolean.hashCode(this.f339840l);
    }

    /* renamed from: toString */
    public java.lang.String m128537x9616526c() {
        return "Config(sellPriceSizePx=" + this.f339829a + ", sellWordingSizePx=" + this.f339830b + ", priceBeginSize=" + this.f339831c + ", priceSuffixSizePx=" + this.f339832d + ", showSellWording=" + this.f339833e + ", showSellWordingBg=" + this.f339834f + ", marketPriceSizePx=" + this.f339835g + ", showMarketPrice=" + this.f339836h + ", maxWidth=" + this.f339837i + ", showBeginPrice=" + this.f339838j + ", showPriceSuffix=" + this.f339839k + ", forceLight=" + this.f339840l + ')';
    }
}
