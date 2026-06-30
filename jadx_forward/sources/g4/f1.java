package g4;

/* loaded from: classes5.dex */
public final class f1 extends g4.l1 {

    /* renamed from: a, reason: collision with root package name */
    public final g4.a1 f349812a;

    /* renamed from: b, reason: collision with root package name */
    public final int f349813b;

    /* renamed from: c, reason: collision with root package name */
    public final int f349814c;

    /* renamed from: d, reason: collision with root package name */
    public final int f349815d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(g4.a1 loadType, int i17, int i18, int i19) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadType, "loadType");
        this.f349812a = loadType;
        this.f349813b = i17;
        this.f349814c = i18;
        this.f349815d = i19;
        if (!(loadType != g4.a1.REFRESH)) {
            throw new java.lang.IllegalArgumentException("Drop load type must be PREPEND or APPEND".toString());
        }
        if (!(b() > 0)) {
            throw new java.lang.IllegalArgumentException(("Drop count must be > 0, but was " + b()).toString());
        }
        if (i19 >= 0) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("Invalid placeholdersRemaining " + i19).toString());
    }

    public final int b() {
        return (this.f349814c - this.f349813b) + 1;
    }

    /* renamed from: equals */
    public boolean m130833xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4.f1)) {
            return false;
        }
        g4.f1 f1Var = (g4.f1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f349812a, f1Var.f349812a) && this.f349813b == f1Var.f349813b && this.f349814c == f1Var.f349814c && this.f349815d == f1Var.f349815d;
    }

    /* renamed from: hashCode */
    public int m130834x8cdac1b() {
        g4.a1 a1Var = this.f349812a;
        return ((((((a1Var != null ? a1Var.hashCode() : 0) * 31) + java.lang.Integer.hashCode(this.f349813b)) * 31) + java.lang.Integer.hashCode(this.f349814c)) * 31) + java.lang.Integer.hashCode(this.f349815d);
    }

    /* renamed from: toString */
    public java.lang.String m130835x9616526c() {
        return "Drop(loadType=" + this.f349812a + ", minPageOffset=" + this.f349813b + ", maxPageOffset=" + this.f349814c + ", placeholdersRemaining=" + this.f349815d + ")";
    }
}
