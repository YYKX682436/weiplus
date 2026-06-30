package bk4;

/* loaded from: classes11.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public boolean f103087a;

    /* renamed from: b, reason: collision with root package name */
    public bi4.t1 f103088b;

    public s(boolean z17, bi4.t1 t1Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        t1Var = (i17 & 2) != 0 ? null : t1Var;
        this.f103087a = z17;
        this.f103088b = t1Var;
    }

    /* renamed from: equals */
    public boolean m10707xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk4.s)) {
            return false;
        }
        bk4.s sVar = (bk4.s) obj;
        return this.f103087a == sVar.f103087a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f103088b, sVar.f103088b);
    }

    /* renamed from: hashCode */
    public int m10708x8cdac1b() {
        int hashCode = java.lang.Boolean.hashCode(this.f103087a) * 31;
        bi4.t1 t1Var = this.f103088b;
        return hashCode + (t1Var == null ? 0 : t1Var.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m10709x9616526c() {
        return "SquareRedDotResult(isShow=" + this.f103087a + ", durationData=" + this.f103088b + ')';
    }
}
