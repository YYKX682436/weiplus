package bg0;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f101398a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f101399b;

    /* renamed from: c, reason: collision with root package name */
    public final long f101400c;

    /* renamed from: d, reason: collision with root package name */
    public final long f101401d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 f101402e;

    /* renamed from: f, reason: collision with root package name */
    public double f101403f;

    /* renamed from: g, reason: collision with root package name */
    public final int f101404g;

    public y(java.lang.String id6, java.lang.String originPath, long j17, long j18, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078, double d17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originPath, "originPath");
        this.f101398a = id6;
        this.f101399b = originPath;
        this.f101400c = j17;
        this.f101401d = j18;
        this.f101402e = abstractC15633xee433078;
        this.f101403f = d17;
        this.f101404g = i17;
    }

    /* renamed from: equals */
    public boolean m10385xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg0.y)) {
            return false;
        }
        bg0.y yVar = (bg0.y) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f101398a, yVar.f101398a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f101399b, yVar.f101399b) && this.f101400c == yVar.f101400c && this.f101401d == yVar.f101401d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f101402e, yVar.f101402e) && java.lang.Double.compare(this.f101403f, yVar.f101403f) == 0 && this.f101404g == yVar.f101404g;
    }

    /* renamed from: hashCode */
    public int m10386x8cdac1b() {
        int hashCode = ((((((this.f101398a.hashCode() * 31) + this.f101399b.hashCode()) * 31) + java.lang.Long.hashCode(this.f101400c)) * 31) + java.lang.Long.hashCode(this.f101401d)) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = this.f101402e;
        return ((((hashCode + (abstractC15633xee433078 == null ? 0 : abstractC15633xee433078.hashCode())) * 31) + java.lang.Double.hashCode(this.f101403f)) * 31) + java.lang.Integer.hashCode(this.f101404g);
    }

    /* renamed from: toString */
    public java.lang.String m10387x9616526c() {
        return "SegmentClipData(id=" + this.f101398a + ", originPath=" + this.f101399b + ", clipDurationMS=" + this.f101400c + ", totalDurationMS=" + this.f101401d + ", mediaItem=" + this.f101402e + ", clipRangeStartTimeMS=" + this.f101403f + ", minThumbViewCount=" + this.f101404g + ')';
    }
}
