package v11;

/* loaded from: classes11.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f513961a;

    /* renamed from: b, reason: collision with root package name */
    public final int f513962b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f513963c;

    /* renamed from: d, reason: collision with root package name */
    public final v11.l0 f513964d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f513965e;

    /* renamed from: f, reason: collision with root package name */
    public final v11.s f513966f;

    public k0(int i17, int i18, boolean z17, v11.l0 alignment, java.util.List runs, v11.s sVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alignment, "alignment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runs, "runs");
        this.f513961a = i17;
        this.f513962b = i18;
        this.f513963c = z17;
        this.f513964d = alignment;
        this.f513965e = runs;
        this.f513966f = sVar;
    }

    public static v11.k0 a(v11.k0 k0Var, int i17, int i18, boolean z17, v11.l0 l0Var, java.util.List list, v11.s sVar, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            i17 = k0Var.f513961a;
        }
        if ((i19 & 2) != 0) {
            i18 = k0Var.f513962b;
        }
        int i27 = i18;
        if ((i19 & 4) != 0) {
            z17 = k0Var.f513963c;
        }
        boolean z18 = z17;
        if ((i19 & 8) != 0) {
            l0Var = k0Var.f513964d;
        }
        v11.l0 alignment = l0Var;
        if ((i19 & 16) != 0) {
            list = k0Var.f513965e;
        }
        java.util.List runs = list;
        if ((i19 & 32) != 0) {
            sVar = k0Var.f513966f;
        }
        k0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alignment, "alignment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runs, "runs");
        return new v11.k0(i17, i27, z18, alignment, runs, sVar);
    }

    /* renamed from: equals */
    public boolean m170914xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.k0)) {
            return false;
        }
        v11.k0 k0Var = (v11.k0) obj;
        return this.f513961a == k0Var.f513961a && this.f513962b == k0Var.f513962b && this.f513963c == k0Var.f513963c && this.f513964d == k0Var.f513964d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513965e, k0Var.f513965e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513966f, k0Var.f513966f);
    }

    /* renamed from: hashCode */
    public int m170915x8cdac1b() {
        int hashCode = ((((((((java.lang.Integer.hashCode(this.f513961a) * 31) + java.lang.Integer.hashCode(this.f513962b)) * 31) + java.lang.Boolean.hashCode(this.f513963c)) * 31) + this.f513964d.hashCode()) * 31) + this.f513965e.hashCode()) * 31;
        v11.s sVar = this.f513966f;
        return hashCode + (sVar == null ? 0 : sVar.m170946x8cdac1b());
    }

    /* renamed from: toString */
    public java.lang.String m170916x9616526c() {
        return "TableCellUiModel(row=" + this.f513961a + ", column=" + this.f513962b + ", isHeader=" + this.f513963c + ", alignment=" + this.f513964d + ", runs=" + this.f513965e + ", sourceRange=" + this.f513966f + ')';
    }
}
