package ey2;

/* loaded from: classes2.dex */
public final class s2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f339032a;

    /* renamed from: b, reason: collision with root package name */
    public final float f339033b;

    public s2(long j17, float f17) {
        this.f339032a = j17;
        this.f339033b = f17;
    }

    /* renamed from: equals */
    public boolean m128383xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey2.s2)) {
            return false;
        }
        ey2.s2 s2Var = (ey2.s2) obj;
        return this.f339032a == s2Var.f339032a && java.lang.Float.compare(this.f339033b, s2Var.f339033b) == 0;
    }

    /* renamed from: hashCode */
    public int m128384x8cdac1b() {
        return (java.lang.Long.hashCode(this.f339032a) * 31) + java.lang.Float.hashCode(this.f339033b);
    }

    /* renamed from: toString */
    public java.lang.String m128385x9616526c() {
        return "ImageFeedCache(feedId=" + this.f339032a + ", speedRatio=" + this.f339033b + ')';
    }
}
