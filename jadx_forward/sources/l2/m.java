package l2;

/* loaded from: classes13.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public static final l2.m f396658c = new l2.m(1.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f396659a;

    /* renamed from: b, reason: collision with root package name */
    public final float f396660b;

    public m(float f17, float f18) {
        this.f396659a = f17;
        this.f396660b = f18;
    }

    /* renamed from: equals */
    public boolean m144916xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2.m)) {
            return false;
        }
        l2.m mVar = (l2.m) obj;
        if (this.f396659a == mVar.f396659a) {
            return (this.f396660b > mVar.f396660b ? 1 : (this.f396660b == mVar.f396660b ? 0 : -1)) == 0;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m144917x8cdac1b() {
        return (java.lang.Float.hashCode(this.f396659a) * 31) + java.lang.Float.hashCode(this.f396660b);
    }

    /* renamed from: toString */
    public java.lang.String m144918x9616526c() {
        return "TextGeometricTransform(scaleX=" + this.f396659a + ", skewX=" + this.f396660b + ')';
    }
}
