package aw1;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f96016a;

    /* renamed from: b, reason: collision with root package name */
    public final int f96017b;

    /* renamed from: c, reason: collision with root package name */
    public final int f96018c;

    /* renamed from: d, reason: collision with root package name */
    public final int f96019d;

    /* renamed from: e, reason: collision with root package name */
    public final float f96020e;

    /* renamed from: f, reason: collision with root package name */
    public final int f96021f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f96022g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 f96023h;

    public a(int i17, int i18, int i19, int i27, float f17, int i28, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 c17683x770f5025) {
        this.f96016a = i17;
        this.f96017b = i18;
        this.f96018c = i19;
        this.f96019d = i27;
        this.f96020e = f17;
        this.f96021f = i28;
        this.f96022g = z17;
        this.f96023h = c17683x770f5025;
    }

    /* renamed from: equals */
    public boolean m9131xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw1.a)) {
            return false;
        }
        aw1.a aVar = (aw1.a) obj;
        return this.f96016a == aVar.f96016a && this.f96017b == aVar.f96017b && this.f96018c == aVar.f96018c && this.f96019d == aVar.f96019d && java.lang.Float.compare(this.f96020e, aVar.f96020e) == 0 && this.f96021f == aVar.f96021f && this.f96022g == aVar.f96022g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f96023h, aVar.f96023h);
    }

    /* renamed from: hashCode */
    public int m9132x8cdac1b() {
        int hashCode = ((((((((((((java.lang.Integer.hashCode(this.f96016a) * 31) + java.lang.Integer.hashCode(this.f96017b)) * 31) + java.lang.Integer.hashCode(this.f96018c)) * 31) + java.lang.Integer.hashCode(this.f96019d)) * 31) + java.lang.Float.hashCode(this.f96020e)) * 31) + java.lang.Integer.hashCode(this.f96021f)) * 31) + java.lang.Boolean.hashCode(this.f96022g)) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 c17683x770f5025 = this.f96023h;
        return hashCode + (c17683x770f5025 == null ? 0 : c17683x770f5025.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m9133x9616526c() {
        return "ABAResult(errCode=" + this.f96016a + ", width=" + this.f96017b + ", height=" + this.f96018c + ", bitrate=" + this.f96019d + ", crf=" + this.f96020e + ", vbvbuffersize=" + this.f96021f + ", skipCompress=" + this.f96022g + ", abaParams=" + this.f96023h + ')';
    }
}
