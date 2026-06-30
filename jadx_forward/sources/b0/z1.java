package b0;

/* loaded from: classes14.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f98151a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f98152b;

    /* renamed from: c, reason: collision with root package name */
    public final d0.d2 f98153c;

    public z1(long j17, boolean z17, d0.d2 d2Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i17 & 1) != 0 ? e1.a0.c(4284900966L) : j17;
        z17 = (i17 & 2) != 0 ? false : z17;
        d2Var = (i17 & 4) != 0 ? d0.a2.b(0.0f, 0.0f, 3, null) : d2Var;
        this.f98151a = j17;
        this.f98152b = z17;
        this.f98153c = d2Var;
    }

    /* renamed from: equals */
    public boolean m9442xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b0.z1.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.compose.foundation.gestures.OverScrollConfiguration");
        }
        b0.z1 z1Var = (b0.z1) obj;
        return e1.y.c(this.f98151a, z1Var.f98151a) && this.f98152b == z1Var.f98152b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f98153c, z1Var.f98153c);
    }

    /* renamed from: hashCode */
    public int m9443x8cdac1b() {
        int i17 = e1.y.f327854l;
        return (((java.lang.Long.hashCode(this.f98151a) * 31) + java.lang.Boolean.hashCode(this.f98152b)) * 31) + this.f98153c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m9444x9616526c() {
        return "OverScrollConfiguration(glowColor=" + ((java.lang.Object) e1.y.i(this.f98151a)) + ", forceShowAlways=" + this.f98152b + ", drawPadding=" + this.f98153c + ')';
    }
}
