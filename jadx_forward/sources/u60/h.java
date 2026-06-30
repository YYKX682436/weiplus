package u60;

/* loaded from: classes15.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final double f506401a;

    /* renamed from: b, reason: collision with root package name */
    public final double f506402b;

    /* renamed from: c, reason: collision with root package name */
    public int f506403c;

    /* renamed from: d, reason: collision with root package name */
    public int f506404d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f506405e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f506406f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f506407g;

    public h(double d17, double d18) {
        this(d17, d18, false);
    }

    /* renamed from: equals */
    public boolean m167630xb2c87fbf(java.lang.Object obj) {
        if (obj == null || !(obj instanceof u60.h)) {
            return false;
        }
        return ((u60.h) obj).m167631x9616526c().equals(m167631x9616526c());
    }

    /* renamed from: toString */
    public java.lang.String m167631x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((int) (this.f506401a * 1000000.0d));
        java.lang.String str = "";
        sb6.append("");
        sb6.append((int) (this.f506402b * 1000000.0d));
        java.lang.Object obj = this.f506406f;
        if (obj != null) {
            if ((obj instanceof java.lang.Integer) || (obj instanceof java.lang.Long) || (obj instanceof java.lang.Double) || (obj instanceof java.lang.Float) || (obj instanceof java.lang.String)) {
                str = this.f506406f + "";
            } else if (obj instanceof com.p314xaae8f345.mm.p2621x8fb0427b.f9) {
                str = ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) this.f506406f).m124847x74d37ac6() + "_" + ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) this.f506406f).Q0();
            } else {
                str = obj.toString();
            }
        }
        sb6.append(str);
        return sb6.toString();
    }

    public h(double d17, double d18, boolean z17) {
        this.f506406f = "";
        this.f506401a = d17;
        this.f506402b = d18;
        this.f506407g = z17;
    }

    public h(double d17, double d18, int i17, java.lang.Object obj, boolean z17) {
        this.f506401a = d17;
        this.f506402b = d18;
        this.f506406f = obj;
        this.f506403c = i17;
        this.f506407g = z17;
    }
}
