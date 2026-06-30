package hw;

/* loaded from: classes14.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f366957a;

    /* renamed from: b, reason: collision with root package name */
    public final int f366958b;

    /* renamed from: c, reason: collision with root package name */
    public final int f366959c;

    /* renamed from: d, reason: collision with root package name */
    public final int f366960d;

    /* renamed from: e, reason: collision with root package name */
    public final int f366961e;

    public r(int i17, int i18, int i19, int i27, int i28) {
        this.f366957a = i17;
        this.f366958b = i18;
        this.f366959c = i19;
        this.f366960d = i27;
        this.f366961e = i28;
    }

    /* renamed from: equals */
    public boolean m134205xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw.r)) {
            return false;
        }
        hw.r rVar = (hw.r) obj;
        return this.f366957a == rVar.f366957a && this.f366958b == rVar.f366958b && this.f366959c == rVar.f366959c && this.f366960d == rVar.f366960d && this.f366961e == rVar.f366961e;
    }

    /* renamed from: hashCode */
    public int m134206x8cdac1b() {
        return (((((((java.lang.Integer.hashCode(this.f366957a) * 31) + java.lang.Integer.hashCode(this.f366958b)) * 31) + java.lang.Integer.hashCode(this.f366959c)) * 31) + java.lang.Integer.hashCode(this.f366960d)) * 31) + java.lang.Integer.hashCode(this.f366961e);
    }

    /* renamed from: toString */
    public java.lang.String m134207x9616526c() {
        return "BrandCoverViewAttribute(left=" + this.f366957a + ", top=" + this.f366958b + ", width=" + this.f366959c + ", height=" + this.f366960d + ", hide=" + this.f366961e + ')';
    }
}
