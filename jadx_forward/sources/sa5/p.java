package sa5;

/* loaded from: classes14.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final float f486896a;

    /* renamed from: b, reason: collision with root package name */
    public final float f486897b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.animation.Interpolator f486898c;

    /* renamed from: d, reason: collision with root package name */
    public final sa5.v f486899d;

    public p(float f17, float f18, android.view.animation.Interpolator interpolator, sa5.v scaleType, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        interpolator = (i17 & 4) != 0 ? null : interpolator;
        scaleType = (i17 & 8) != 0 ? sa5.r.f486902a : scaleType;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scaleType, "scaleType");
        this.f486896a = f17;
        this.f486897b = f18;
        this.f486898c = interpolator;
        this.f486899d = scaleType;
    }

    /* renamed from: equals */
    public boolean m164196xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa5.p)) {
            return false;
        }
        sa5.p pVar = (sa5.p) obj;
        return java.lang.Float.compare(this.f486896a, pVar.f486896a) == 0 && java.lang.Float.compare(this.f486897b, pVar.f486897b) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f486898c, pVar.f486898c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f486899d, pVar.f486899d);
    }

    /* renamed from: hashCode */
    public int m164197x8cdac1b() {
        int hashCode = ((java.lang.Float.hashCode(this.f486896a) * 31) + java.lang.Float.hashCode(this.f486897b)) * 31;
        android.view.animation.Interpolator interpolator = this.f486898c;
        return ((hashCode + (interpolator == null ? 0 : interpolator.hashCode())) * 31) + this.f486899d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m164198x9616526c() {
        return "ScaleData(scaleX=" + this.f486896a + ", scaleY=" + this.f486897b + ", interpolator=" + this.f486898c + ", scaleType=" + this.f486899d + ')';
    }
}
