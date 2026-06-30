package xt2;

/* loaded from: classes3.dex */
public final class i5 {

    /* renamed from: a, reason: collision with root package name */
    public final float f538324a;

    /* renamed from: b, reason: collision with root package name */
    public final float f538325b;

    /* renamed from: c, reason: collision with root package name */
    public final float f538326c;

    /* renamed from: d, reason: collision with root package name */
    public final float f538327d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f538328e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f538329f;

    /* renamed from: g, reason: collision with root package name */
    public final float f538330g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f538331h;

    /* renamed from: i, reason: collision with root package name */
    public final float f538332i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f538333j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f538334k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f538335l;

    public i5(float f17, float f18, float f19, float f27, boolean z17, boolean z18, float f28, boolean z19, float f29, boolean z27, boolean z28, boolean z29, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z27 = (i17 & 512) != 0 ? false : z27;
        z28 = (i17 & 1024) != 0 ? false : z28;
        z29 = (i17 & 2048) != 0 ? true : z29;
        this.f538324a = f17;
        this.f538325b = f18;
        this.f538326c = f19;
        this.f538327d = f27;
        this.f538328e = z17;
        this.f538329f = z18;
        this.f538330g = f28;
        this.f538331h = z19;
        this.f538332i = f29;
        this.f538333j = z27;
        this.f538334k = z28;
        this.f538335l = z29;
    }

    /* renamed from: equals */
    public boolean m175950xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt2.i5)) {
            return false;
        }
        xt2.i5 i5Var = (xt2.i5) obj;
        return java.lang.Float.compare(this.f538324a, i5Var.f538324a) == 0 && java.lang.Float.compare(this.f538325b, i5Var.f538325b) == 0 && java.lang.Float.compare(this.f538326c, i5Var.f538326c) == 0 && java.lang.Float.compare(this.f538327d, i5Var.f538327d) == 0 && this.f538328e == i5Var.f538328e && this.f538329f == i5Var.f538329f && java.lang.Float.compare(this.f538330g, i5Var.f538330g) == 0 && this.f538331h == i5Var.f538331h && java.lang.Float.compare(this.f538332i, i5Var.f538332i) == 0 && this.f538333j == i5Var.f538333j && this.f538334k == i5Var.f538334k && this.f538335l == i5Var.f538335l;
    }

    /* renamed from: hashCode */
    public int m175951x8cdac1b() {
        return (((((((((((((((((((((java.lang.Float.hashCode(this.f538324a) * 31) + java.lang.Float.hashCode(this.f538325b)) * 31) + java.lang.Float.hashCode(this.f538326c)) * 31) + java.lang.Float.hashCode(this.f538327d)) * 31) + java.lang.Boolean.hashCode(this.f538328e)) * 31) + java.lang.Boolean.hashCode(this.f538329f)) * 31) + java.lang.Float.hashCode(this.f538330g)) * 31) + java.lang.Boolean.hashCode(this.f538331h)) * 31) + java.lang.Float.hashCode(this.f538332i)) * 31) + java.lang.Boolean.hashCode(this.f538333j)) * 31) + java.lang.Boolean.hashCode(this.f538334k)) * 31) + java.lang.Boolean.hashCode(this.f538335l);
    }

    /* renamed from: toString */
    public java.lang.String m175952x9616526c() {
        return "Config(sellPriceSizePx=" + this.f538324a + ", sellWordingSizePx=" + this.f538325b + ", priceBeginSize=" + this.f538326c + ", priceSuffixSizePx=" + this.f538327d + ", showSellWording=" + this.f538328e + ", showSellWordingBg=" + this.f538329f + ", marketPriceSizePx=" + this.f538330g + ", showMarketPrice=" + this.f538331h + ", maxWidth=" + this.f538332i + ", showBeginPrice=" + this.f538333j + ", showPriceSuffix=" + this.f538334k + ", forceLight=" + this.f538335l + ')';
    }
}
