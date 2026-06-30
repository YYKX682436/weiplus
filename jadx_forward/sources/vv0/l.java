package vv0;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final float f521923a;

    /* renamed from: b, reason: collision with root package name */
    public final float f521924b;

    /* renamed from: c, reason: collision with root package name */
    public final float f521925c;

    /* renamed from: d, reason: collision with root package name */
    public final float f521926d;

    /* renamed from: e, reason: collision with root package name */
    public final float f521927e;

    /* renamed from: f, reason: collision with root package name */
    public final float f521928f;

    public l(float f17, float f18, float f19, float f27, float f28, float f29) {
        this.f521923a = f17;
        this.f521924b = f18;
        this.f521925c = f19;
        this.f521926d = f27;
        this.f521927e = f28;
        this.f521928f = f29;
    }

    /* renamed from: equals */
    public boolean m172701xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv0.l)) {
            return false;
        }
        vv0.l lVar = (vv0.l) obj;
        return java.lang.Float.compare(this.f521923a, lVar.f521923a) == 0 && java.lang.Float.compare(this.f521924b, lVar.f521924b) == 0 && java.lang.Float.compare(this.f521925c, lVar.f521925c) == 0 && java.lang.Float.compare(this.f521926d, lVar.f521926d) == 0 && java.lang.Float.compare(this.f521927e, lVar.f521927e) == 0 && java.lang.Float.compare(this.f521928f, lVar.f521928f) == 0;
    }

    /* renamed from: hashCode */
    public int m172702x8cdac1b() {
        return (((((((((java.lang.Float.hashCode(this.f521923a) * 31) + java.lang.Float.hashCode(this.f521924b)) * 31) + java.lang.Float.hashCode(this.f521925c)) * 31) + java.lang.Float.hashCode(this.f521926d)) * 31) + java.lang.Float.hashCode(this.f521927e)) * 31) + java.lang.Float.hashCode(this.f521928f);
    }

    /* renamed from: toString */
    public java.lang.String m172703x9616526c() {
        return "MJSegmentColorInfo(brightness=" + this.f521923a + ", contrast=" + this.f521924b + ", saturation=" + this.f521925c + ", temperature=" + this.f521926d + ", vignette=" + this.f521927e + ", sharpness=" + this.f521928f + ')';
    }
}
