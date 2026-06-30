package bb2;

/* loaded from: classes5.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f18988a;

    /* renamed from: b, reason: collision with root package name */
    public int f18989b;

    public s0(boolean z17, int i17, int i18, kotlin.jvm.internal.i iVar) {
        z17 = (i18 & 1) != 0 ? false : z17;
        i17 = (i18 & 2) != 0 ? 0 : i17;
        this.f18988a = z17;
        this.f18989b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb2.s0)) {
            return false;
        }
        bb2.s0 s0Var = (bb2.s0) obj;
        return this.f18988a == s0Var.f18988a && this.f18989b == s0Var.f18989b;
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f18988a) * 31) + java.lang.Integer.hashCode(this.f18989b);
    }

    public java.lang.String toString() {
        return "FixedCenterDanmakuState(hasPlusOne=" + this.f18988a + ", stepAnimatorCount=" + this.f18989b + ')';
    }
}
