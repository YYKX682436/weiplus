package wr3;

/* loaded from: classes3.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    public final float f530343a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f530344b;

    public g2(float f17, boolean z17, boolean z18) {
        this.f530343a = f17;
        this.f530344b = z18;
    }

    /* renamed from: equals */
    public boolean m174339xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr3.g2)) {
            return false;
        }
        wr3.g2 g2Var = (wr3.g2) obj;
        return java.lang.Float.compare(this.f530343a, g2Var.f530343a) == 0 && this.f530344b == g2Var.f530344b;
    }

    /* renamed from: hashCode */
    public int m174340x8cdac1b() {
        return (((java.lang.Float.hashCode(this.f530343a) * 31) + java.lang.Boolean.hashCode(true)) * 31) + java.lang.Boolean.hashCode(this.f530344b);
    }

    /* renamed from: toString */
    public java.lang.String m174341x9616526c() {
        return "ImageRadiusInfo(radius=" + this.f530343a + ", topRound=true, bottomRound=" + this.f530344b + ')';
    }
}
