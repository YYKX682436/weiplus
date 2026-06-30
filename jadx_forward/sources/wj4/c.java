package wj4;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f528286a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f528287b;

    /* renamed from: c, reason: collision with root package name */
    public final float f528288c;

    /* renamed from: d, reason: collision with root package name */
    public final float f528289d;

    /* renamed from: e, reason: collision with root package name */
    public final int f528290e;

    /* renamed from: f, reason: collision with root package name */
    public final float f528291f;

    /* renamed from: g, reason: collision with root package name */
    public final int f528292g;

    /* renamed from: h, reason: collision with root package name */
    public final int f528293h;

    /* renamed from: i, reason: collision with root package name */
    public final double f528294i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f528295j;

    public c(java.lang.String branchName, boolean z17, float f17, float f18, int i17, float f19, int i18, int i19, double d17, java.lang.String analysisSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(branchName, "branchName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(analysisSource, "analysisSource");
        this.f528286a = branchName;
        this.f528287b = z17;
        this.f528288c = f17;
        this.f528289d = f18;
        this.f528290e = i17;
        this.f528291f = f19;
        this.f528292g = i18;
        this.f528293h = i19;
        this.f528294i = d17;
        this.f528295j = analysisSource;
    }

    /* renamed from: equals */
    public boolean m174051xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj4.c)) {
            return false;
        }
        wj4.c cVar = (wj4.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f528286a, cVar.f528286a) && this.f528287b == cVar.f528287b && java.lang.Float.compare(this.f528288c, cVar.f528288c) == 0 && java.lang.Float.compare(this.f528289d, cVar.f528289d) == 0 && this.f528290e == cVar.f528290e && java.lang.Float.compare(this.f528291f, cVar.f528291f) == 0 && this.f528292g == cVar.f528292g && this.f528293h == cVar.f528293h && java.lang.Double.compare(this.f528294i, cVar.f528294i) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f528295j, cVar.f528295j);
    }

    /* renamed from: hashCode */
    public int m174052x8cdac1b() {
        return (((((((((((((((((this.f528286a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f528287b)) * 31) + java.lang.Float.hashCode(this.f528288c)) * 31) + java.lang.Float.hashCode(this.f528289d)) * 31) + java.lang.Integer.hashCode(this.f528290e)) * 31) + java.lang.Float.hashCode(this.f528291f)) * 31) + java.lang.Integer.hashCode(this.f528292g)) * 31) + java.lang.Integer.hashCode(this.f528293h)) * 31) + java.lang.Double.hashCode(this.f528294i)) * 31) + this.f528295j.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m174053x9616526c() {
        return "CardStrokeRenderSpec(branchName=" + this.f528286a + ", isDarkMode=" + this.f528287b + ", cornerRadiusPx=" + this.f528288c + ", primaryWidthPx=" + this.f528289d + ", primaryColor=" + this.f528290e + ", supportWidthPx=" + this.f528291f + ", supportColor=" + this.f528292g + ", edgeColor=" + this.f528293h + ", contrastRatio=" + this.f528294i + ", analysisSource=" + this.f528295j + ')';
    }
}
