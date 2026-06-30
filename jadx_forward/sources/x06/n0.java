package x06;

/* loaded from: classes16.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final x06.w0 f532811a;

    /* renamed from: b, reason: collision with root package name */
    public final x06.w0 f532812b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f532813c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f532814d;

    public n0(x06.w0 globalLevel, x06.w0 w0Var, java.util.Map userDefinedLevelForSpecificAnnotation, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        w0Var = (i17 & 2) != 0 ? null : w0Var;
        userDefinedLevelForSpecificAnnotation = (i17 & 4) != 0 ? kz5.q0.f395534d : userDefinedLevelForSpecificAnnotation;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(globalLevel, "globalLevel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userDefinedLevelForSpecificAnnotation, "userDefinedLevelForSpecificAnnotation");
        this.f532811a = globalLevel;
        this.f532812b = w0Var;
        this.f532813c = userDefinedLevelForSpecificAnnotation;
        jz5.h.b(new x06.m0(this));
        x06.w0 w0Var2 = x06.w0.f532863e;
        this.f532814d = globalLevel == w0Var2 && w0Var == w0Var2 && userDefinedLevelForSpecificAnnotation.isEmpty();
    }

    /* renamed from: equals */
    public boolean m174869xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x06.n0)) {
            return false;
        }
        x06.n0 n0Var = (x06.n0) obj;
        return this.f532811a == n0Var.f532811a && this.f532812b == n0Var.f532812b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f532813c, n0Var.f532813c);
    }

    /* renamed from: hashCode */
    public int m174870x8cdac1b() {
        int hashCode = this.f532811a.hashCode() * 31;
        x06.w0 w0Var = this.f532812b;
        return ((hashCode + (w0Var == null ? 0 : w0Var.hashCode())) * 31) + this.f532813c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m174871x9616526c() {
        return "Jsr305Settings(globalLevel=" + this.f532811a + ", migrationLevel=" + this.f532812b + ", userDefinedLevelForSpecificAnnotation=" + this.f532813c + ')';
    }
}
