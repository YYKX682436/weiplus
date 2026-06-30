package ty2;

/* loaded from: classes9.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final bw5.q5 f504631a;

    /* renamed from: b, reason: collision with root package name */
    public final float f504632b;

    /* renamed from: c, reason: collision with root package name */
    public final float f504633c;

    /* renamed from: d, reason: collision with root package name */
    public final int f504634d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f504635e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f504636f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f504637g;

    public p(bw5.q5 item, float f17, float f18, int i17, boolean z17, boolean z18, boolean z19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f504631a = item;
        this.f504632b = f17;
        this.f504633c = f18;
        this.f504634d = i17;
        this.f504635e = z17;
        this.f504636f = z18;
        this.f504637g = z19;
    }

    public static ty2.p a(ty2.p pVar, bw5.q5 item, float f17, float f18, int i17, boolean z17, boolean z18, boolean z19, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            item = pVar.f504631a;
        }
        if ((i18 & 2) != 0) {
            f17 = pVar.f504632b;
        }
        float f19 = f17;
        if ((i18 & 4) != 0) {
            f18 = pVar.f504633c;
        }
        float f27 = f18;
        if ((i18 & 8) != 0) {
            i17 = pVar.f504634d;
        }
        int i19 = i17;
        if ((i18 & 16) != 0) {
            z17 = pVar.f504635e;
        }
        boolean z27 = z17;
        if ((i18 & 32) != 0) {
            z18 = pVar.f504636f;
        }
        boolean z28 = z18;
        if ((i18 & 64) != 0) {
            z19 = pVar.f504637g;
        }
        pVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        return new ty2.p(item, f19, f27, i19, z27, z28, z19);
    }

    /* renamed from: equals */
    public boolean m167227xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty2.p)) {
            return false;
        }
        ty2.p pVar = (ty2.p) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f504631a, pVar.f504631a) && java.lang.Float.compare(this.f504632b, pVar.f504632b) == 0 && java.lang.Float.compare(this.f504633c, pVar.f504633c) == 0 && this.f504634d == pVar.f504634d && this.f504635e == pVar.f504635e && this.f504636f == pVar.f504636f && this.f504637g == pVar.f504637g;
    }

    /* renamed from: hashCode */
    public int m167228x8cdac1b() {
        return (((((((((((this.f504631a.hashCode() * 31) + java.lang.Float.hashCode(this.f504632b)) * 31) + java.lang.Float.hashCode(this.f504633c)) * 31) + java.lang.Integer.hashCode(this.f504634d)) * 31) + java.lang.Boolean.hashCode(this.f504635e)) * 31) + java.lang.Boolean.hashCode(this.f504636f)) * 31) + java.lang.Boolean.hashCode(this.f504637g);
    }

    /* renamed from: toString */
    public java.lang.String m167229x9616526c() {
        return "Config(item=" + this.f504631a + ", priceSizePx=" + this.f504632b + ", sellWordingSizePx=" + this.f504633c + ", maxWidthPx=" + this.f504634d + ", showSellWording=" + this.f504635e + ", showSaleNum=" + this.f504636f + ", showBegin=" + this.f504637g + ')';
    }
}
