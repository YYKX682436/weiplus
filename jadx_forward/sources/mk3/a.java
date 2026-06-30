package mk3;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public r45.kr4 f408674a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f408675b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f408676c;

    public a(r45.kr4 kr4Var, boolean z17, boolean z18) {
        this.f408674a = kr4Var;
        this.f408675b = z17;
        this.f408676c = z18;
    }

    /* renamed from: equals */
    public boolean m147414xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk3.a)) {
            return false;
        }
        mk3.a aVar = (mk3.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408674a, aVar.f408674a) && this.f408675b == aVar.f408675b && this.f408676c == aVar.f408676c;
    }

    /* renamed from: hashCode */
    public int m147415x8cdac1b() {
        r45.kr4 kr4Var = this.f408674a;
        return ((((kr4Var == null ? 0 : kr4Var.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f408675b)) * 31) + java.lang.Boolean.hashCode(this.f408676c);
    }

    /* renamed from: toString */
    public java.lang.String m147416x9616526c() {
        return "MultiTaskAddExtraParams(reportData=" + this.f408674a + ", starOpt=" + this.f408675b + ", isSync=" + this.f408676c + ')';
    }

    public /* synthetic */ a(r45.kr4 kr4Var, boolean z17, boolean z18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? null : kr4Var, (i17 & 2) != 0 ? true : z17, (i17 & 4) != 0 ? false : z18);
    }
}
