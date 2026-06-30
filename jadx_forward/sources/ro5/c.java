package ro5;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f479700a;

    /* renamed from: b, reason: collision with root package name */
    public final double f479701b;

    /* renamed from: c, reason: collision with root package name */
    public final long f479702c;

    /* renamed from: d, reason: collision with root package name */
    public final double f479703d;

    /* renamed from: e, reason: collision with root package name */
    public final double f479704e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f479705f;

    /* renamed from: g, reason: collision with root package name */
    public final long f479706g;

    public c(long j17, double d17, long j18, double d18, double d19, boolean z17, long j19) {
        this.f479700a = j17;
        this.f479701b = d17;
        this.f479702c = j18;
        this.f479703d = d18;
        this.f479704e = d19;
        this.f479705f = z17;
        this.f479706g = j19;
    }

    /* renamed from: equals */
    public boolean m162804xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro5.c)) {
            return false;
        }
        ro5.c cVar = (ro5.c) obj;
        return this.f479700a == cVar.f479700a && java.lang.Double.compare(this.f479701b, cVar.f479701b) == 0 && this.f479702c == cVar.f479702c && java.lang.Double.compare(this.f479703d, cVar.f479703d) == 0 && java.lang.Double.compare(this.f479704e, cVar.f479704e) == 0 && this.f479705f == cVar.f479705f && this.f479706g == cVar.f479706g;
    }

    /* renamed from: hashCode */
    public int m162805x8cdac1b() {
        return (((((((((((java.lang.Long.hashCode(this.f479700a) * 31) + java.lang.Double.hashCode(this.f479701b)) * 31) + java.lang.Long.hashCode(this.f479702c)) * 31) + java.lang.Double.hashCode(this.f479703d)) * 31) + java.lang.Double.hashCode(this.f479704e)) * 31) + java.lang.Boolean.hashCode(this.f479705f)) * 31) + java.lang.Long.hashCode(this.f479706g);
    }

    /* renamed from: toString */
    public java.lang.String m162806x9616526c() {
        return "TextureInfo(texId=" + this.f479700a + ", ratio=" + this.f479701b + ", rotate=" + this.f479702c + ", width=" + this.f479703d + ", height=" + this.f479704e + ", isLandscapeMode=" + this.f479705f + ", surfacePtr=" + this.f479706g + ')';
    }
}
