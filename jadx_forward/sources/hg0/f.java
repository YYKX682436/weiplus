package hg0;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final w21.w0 f362847a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f362848b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f362849c;

    public f(w21.w0 w0Var, java.lang.String str, boolean z17) {
        this.f362847a = w0Var;
        this.f362848b = str;
        this.f362849c = z17;
    }

    /* renamed from: equals */
    public boolean m133525xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg0.f)) {
            return false;
        }
        hg0.f fVar = (hg0.f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362847a, fVar.f362847a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362848b, fVar.f362848b) && this.f362849c == fVar.f362849c;
    }

    /* renamed from: hashCode */
    public int m133526x8cdac1b() {
        w21.w0 w0Var = this.f362847a;
        int hashCode = (w0Var == null ? 0 : w0Var.hashCode()) * 31;
        java.lang.String str = this.f362848b;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f362849c);
    }

    /* renamed from: toString */
    public java.lang.String m133527x9616526c() {
        return "OutcomeContext(info=" + this.f362847a + ", forcedOtherInfo=" + this.f362848b + ", durationOverrideNegOne=" + this.f362849c + ')';
    }

    public /* synthetic */ f(w21.w0 w0Var, java.lang.String str, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(w0Var, (i17 & 2) != 0 ? null : str, (i17 & 4) != 0 ? false : z17);
    }
}
