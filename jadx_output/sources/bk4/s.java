package bk4;

/* loaded from: classes11.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public boolean f21554a;

    /* renamed from: b, reason: collision with root package name */
    public bi4.t1 f21555b;

    public s(boolean z17, bi4.t1 t1Var, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        t1Var = (i17 & 2) != 0 ? null : t1Var;
        this.f21554a = z17;
        this.f21555b = t1Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk4.s)) {
            return false;
        }
        bk4.s sVar = (bk4.s) obj;
        return this.f21554a == sVar.f21554a && kotlin.jvm.internal.o.b(this.f21555b, sVar.f21555b);
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f21554a) * 31;
        bi4.t1 t1Var = this.f21555b;
        return hashCode + (t1Var == null ? 0 : t1Var.hashCode());
    }

    public java.lang.String toString() {
        return "SquareRedDotResult(isShow=" + this.f21554a + ", durationData=" + this.f21555b + ')';
    }
}
