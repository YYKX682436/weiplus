package qe5;

/* loaded from: classes8.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f443706a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f443707b;

    /* renamed from: c, reason: collision with root package name */
    public final int f443708c;

    /* renamed from: d, reason: collision with root package name */
    public final int f443709d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f443710e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f443711f;

    public q0(java.lang.String prefix, java.lang.String suffix, int i17, int i18, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(suffix, "suffix");
        this.f443706a = prefix;
        this.f443707b = suffix;
        this.f443708c = i17;
        this.f443709d = i18;
        this.f443710e = z17;
        this.f443711f = z18;
    }

    /* renamed from: equals */
    public boolean m159923xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe5.q0)) {
            return false;
        }
        qe5.q0 q0Var = (qe5.q0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f443706a, q0Var.f443706a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f443707b, q0Var.f443707b) && this.f443708c == q0Var.f443708c && this.f443709d == q0Var.f443709d && this.f443710e == q0Var.f443710e && this.f443711f == q0Var.f443711f;
    }

    /* renamed from: hashCode */
    public int m159924x8cdac1b() {
        return (((((((((this.f443706a.hashCode() * 31) + this.f443707b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f443708c)) * 31) + java.lang.Integer.hashCode(this.f443709d)) * 31) + java.lang.Boolean.hashCode(this.f443710e)) * 31) + java.lang.Boolean.hashCode(this.f443711f);
    }

    /* renamed from: toString */
    public java.lang.String m159925x9616526c() {
        return "FileMatchRule(prefix=" + this.f443706a + ", suffix=" + this.f443707b + ", labelResId=" + this.f443708c + ", resultId=" + this.f443709d + ", ignoreCase=" + this.f443710e + ", isDebugOnly=" + this.f443711f + ')';
    }

    public /* synthetic */ q0(java.lang.String str, java.lang.String str2, int i17, int i18, boolean z17, boolean z18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, str2, i17, i18, (i19 & 16) != 0 ? false : z17, (i19 & 32) != 0 ? false : z18);
    }
}
