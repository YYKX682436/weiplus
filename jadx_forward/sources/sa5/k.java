package sa5;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final float f486886a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.animation.Interpolator f486887b;

    public k(float f17, android.view.animation.Interpolator interpolator, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        interpolator = (i17 & 2) != 0 ? null : interpolator;
        this.f486886a = f17;
        this.f486887b = interpolator;
    }

    /* renamed from: equals */
    public boolean m164190xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa5.k)) {
            return false;
        }
        sa5.k kVar = (sa5.k) obj;
        return java.lang.Float.compare(this.f486886a, kVar.f486886a) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f486887b, kVar.f486887b);
    }

    /* renamed from: hashCode */
    public int m164191x8cdac1b() {
        int hashCode = java.lang.Float.hashCode(this.f486886a) * 31;
        android.view.animation.Interpolator interpolator = this.f486887b;
        return hashCode + (interpolator == null ? 0 : interpolator.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m164192x9616526c() {
        return "FadeData(alpha=" + this.f486886a + ", interpolator=" + this.f486887b + ')';
    }
}
