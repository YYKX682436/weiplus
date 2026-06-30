package d0;

/* loaded from: classes14.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public float f306689a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f306690b;

    /* renamed from: c, reason: collision with root package name */
    public d0.p0 f306691c;

    public k2(float f17, boolean z17, d0.p0 p0Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        f17 = (i17 & 1) != 0 ? 0.0f : f17;
        z17 = (i17 & 2) != 0 ? true : z17;
        p0Var = (i17 & 4) != 0 ? null : p0Var;
        this.f306689a = f17;
        this.f306690b = z17;
        this.f306691c = p0Var;
    }

    /* renamed from: equals */
    public boolean m123231xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0.k2)) {
            return false;
        }
        d0.k2 k2Var = (d0.k2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f306689a), java.lang.Float.valueOf(k2Var.f306689a)) && this.f306690b == k2Var.f306690b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f306691c, k2Var.f306691c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: hashCode */
    public int m123232x8cdac1b() {
        int hashCode = java.lang.Float.hashCode(this.f306689a) * 31;
        boolean z17 = this.f306690b;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        int i18 = (hashCode + i17) * 31;
        d0.p0 p0Var = this.f306691c;
        return i18 + (p0Var == null ? 0 : p0Var.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m123233x9616526c() {
        return "RowColumnParentData(weight=" + this.f306689a + ", fill=" + this.f306690b + ", crossAxisAlignment=" + this.f306691c + ')';
    }
}
