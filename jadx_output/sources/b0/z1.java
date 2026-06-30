package b0;

/* loaded from: classes14.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f16618a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16619b;

    /* renamed from: c, reason: collision with root package name */
    public final d0.d2 f16620c;

    public z1(long j17, boolean z17, d0.d2 d2Var, int i17, kotlin.jvm.internal.i iVar) {
        j17 = (i17 & 1) != 0 ? e1.a0.c(4284900966L) : j17;
        z17 = (i17 & 2) != 0 ? false : z17;
        d2Var = (i17 & 4) != 0 ? d0.a2.b(0.0f, 0.0f, 3, null) : d2Var;
        this.f16618a = j17;
        this.f16619b = z17;
        this.f16620c = d2Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(b0.z1.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.compose.foundation.gestures.OverScrollConfiguration");
        }
        b0.z1 z1Var = (b0.z1) obj;
        return e1.y.c(this.f16618a, z1Var.f16618a) && this.f16619b == z1Var.f16619b && kotlin.jvm.internal.o.b(this.f16620c, z1Var.f16620c);
    }

    public int hashCode() {
        int i17 = e1.y.f246321l;
        return (((java.lang.Long.hashCode(this.f16618a) * 31) + java.lang.Boolean.hashCode(this.f16619b)) * 31) + this.f16620c.hashCode();
    }

    public java.lang.String toString() {
        return "OverScrollConfiguration(glowColor=" + ((java.lang.Object) e1.y.i(this.f16618a)) + ", forceShowAlways=" + this.f16619b + ", drawPadding=" + this.f16620c + ')';
    }
}
