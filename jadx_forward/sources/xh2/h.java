package xh2;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final float f536082a;

    /* renamed from: b, reason: collision with root package name */
    public final float f536083b;

    /* renamed from: c, reason: collision with root package name */
    public final float f536084c;

    /* renamed from: d, reason: collision with root package name */
    public final float f536085d;

    public h(float f17, float f18, float f19, float f27) {
        this.f536082a = f17;
        this.f536083b = f18;
        this.f536084c = f19;
        this.f536085d = f27;
    }

    /* renamed from: equals */
    public boolean m175552xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh2.h)) {
            return false;
        }
        xh2.h hVar = (xh2.h) obj;
        return java.lang.Float.compare(this.f536082a, hVar.f536082a) == 0 && java.lang.Float.compare(this.f536083b, hVar.f536083b) == 0 && java.lang.Float.compare(this.f536084c, hVar.f536084c) == 0 && java.lang.Float.compare(this.f536085d, hVar.f536085d) == 0;
    }

    /* renamed from: hashCode */
    public int m175553x8cdac1b() {
        return (((((java.lang.Float.hashCode(this.f536082a) * 31) + java.lang.Float.hashCode(this.f536083b)) * 31) + java.lang.Float.hashCode(this.f536084c)) * 31) + java.lang.Float.hashCode(this.f536085d);
    }

    /* renamed from: toString */
    public java.lang.String m175554x9616526c() {
        return "MicHoleInfo(xRatio=" + this.f536082a + ", yRatio=" + this.f536083b + ", wRatio=" + this.f536084c + ", hRatio=" + this.f536085d + ')';
    }
}
