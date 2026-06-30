package bb2;

/* loaded from: classes5.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f100521a;

    /* renamed from: b, reason: collision with root package name */
    public int f100522b;

    public s0(boolean z17, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i18 & 1) != 0 ? false : z17;
        i17 = (i18 & 2) != 0 ? 0 : i17;
        this.f100521a = z17;
        this.f100522b = i17;
    }

    /* renamed from: equals */
    public boolean m10148xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb2.s0)) {
            return false;
        }
        bb2.s0 s0Var = (bb2.s0) obj;
        return this.f100521a == s0Var.f100521a && this.f100522b == s0Var.f100522b;
    }

    /* renamed from: hashCode */
    public int m10149x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f100521a) * 31) + java.lang.Integer.hashCode(this.f100522b);
    }

    /* renamed from: toString */
    public java.lang.String m10150x9616526c() {
        return "FixedCenterDanmakuState(hasPlusOne=" + this.f100521a + ", stepAnimatorCount=" + this.f100522b + ')';
    }
}
