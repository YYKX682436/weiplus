package x06;

/* loaded from: classes16.dex */
public final class i0 {

    /* renamed from: d, reason: collision with root package name */
    public static final x06.i0 f532793d = new x06.i0(x06.w0.f532865g, null, null, 6, null);

    /* renamed from: a, reason: collision with root package name */
    public final x06.w0 f532794a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.f f532795b;

    /* renamed from: c, reason: collision with root package name */
    public final x06.w0 f532796c;

    public i0(x06.w0 reportLevelBefore, jz5.f fVar, x06.w0 reportLevelAfter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportLevelBefore, "reportLevelBefore");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportLevelAfter, "reportLevelAfter");
        this.f532794a = reportLevelBefore;
        this.f532795b = fVar;
        this.f532796c = reportLevelAfter;
    }

    /* renamed from: equals */
    public boolean m174859xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x06.i0)) {
            return false;
        }
        x06.i0 i0Var = (x06.i0) obj;
        return this.f532794a == i0Var.f532794a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f532795b, i0Var.f532795b) && this.f532796c == i0Var.f532796c;
    }

    /* renamed from: hashCode */
    public int m174860x8cdac1b() {
        int hashCode = this.f532794a.hashCode() * 31;
        jz5.f fVar = this.f532795b;
        return ((hashCode + (fVar == null ? 0 : fVar.f384358g)) * 31) + this.f532796c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m174861x9616526c() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f532794a + ", sinceVersion=" + this.f532795b + ", reportLevelAfter=" + this.f532796c + ')';
    }

    public i0(x06.w0 w0Var, jz5.f fVar, x06.w0 w0Var2, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(w0Var, (i17 & 2) != 0 ? new jz5.f(1, 0, 0) : fVar, (i17 & 4) != 0 ? w0Var : w0Var2);
    }
}
