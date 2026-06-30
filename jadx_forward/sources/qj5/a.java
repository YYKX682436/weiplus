package qj5;

/* loaded from: classes15.dex */
public final class a implements gr5.n {

    /* renamed from: b, reason: collision with root package name */
    public final float f445499b;

    public a(float f17) {
        this.f445499b = f17;
    }

    @Override // gr5.n
    public long a(long j17, long j18) {
        float b17 = zq5.t.b(j17);
        float min = java.lang.Math.min(zq5.t.b(j18) / b17, zq5.t.a(j18) / java.lang.Math.min(zq5.t.a(j17), b17 / this.f445499b));
        return zq5.s.a(min, min);
    }

    /* renamed from: equals */
    public boolean m160274xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qj5.a) && java.lang.Float.compare(this.f445499b, ((qj5.a) obj).f445499b) == 0;
    }

    /* renamed from: hashCode */
    public int m160275x8cdac1b() {
        return java.lang.Float.hashCode(this.f445499b);
    }

    /* renamed from: toString */
    public java.lang.String m160276x9616526c() {
        return "ImageBottomSheetContentScaleCompat(minRatio=" + this.f445499b + ')';
    }
}
