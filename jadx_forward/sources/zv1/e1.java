package zv1;

/* loaded from: classes14.dex */
public final class e1 {

    /* renamed from: f, reason: collision with root package name */
    public static final zv1.d1 f557825f = new zv1.d1(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f557826a;

    /* renamed from: b, reason: collision with root package name */
    public final long f557827b;

    /* renamed from: c, reason: collision with root package name */
    public final long f557828c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f557829d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.l f557830e;

    public e1(java.lang.String path, long j17, long j18, boolean z17, jz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f557826a = path;
        this.f557827b = j17;
        this.f557828c = j18;
        this.f557829d = z17;
        this.f557830e = lVar;
    }

    /* renamed from: equals */
    public boolean m179741xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv1.e1)) {
            return false;
        }
        zv1.e1 e1Var = (zv1.e1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557826a, e1Var.f557826a) && this.f557827b == e1Var.f557827b && this.f557828c == e1Var.f557828c && this.f557829d == e1Var.f557829d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557830e, e1Var.f557830e);
    }

    /* renamed from: hashCode */
    public int m179742x8cdac1b() {
        int hashCode = ((((((this.f557826a.hashCode() * 31) + java.lang.Long.hashCode(this.f557827b)) * 31) + java.lang.Long.hashCode(this.f557828c)) * 31) + java.lang.Boolean.hashCode(this.f557829d)) * 31;
        jz5.l lVar = this.f557830e;
        return hashCode + (lVar == null ? 0 : lVar.m141638x8cdac1b());
    }

    /* renamed from: toString */
    public java.lang.String m179743x9616526c() {
        return "FileTimeInfo(path=" + this.f557826a + ", sizeOfCurrFile=" + this.f557827b + ", time=" + this.f557828c + ", isDirectory=" + this.f557829d + ", isExempted=" + this.f557830e + ')';
    }
}
