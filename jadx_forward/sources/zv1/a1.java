package zv1;

/* loaded from: classes14.dex */
public final class a1 {

    /* renamed from: f, reason: collision with root package name */
    public static final zv1.z0 f557792f = new zv1.z0(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f557793a;

    /* renamed from: b, reason: collision with root package name */
    public final long f557794b;

    /* renamed from: c, reason: collision with root package name */
    public final long f557795c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f557796d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.l f557797e;

    public a1(java.lang.String path, long j17, long j18, boolean z17, jz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f557793a = path;
        this.f557794b = j17;
        this.f557795c = j18;
        this.f557796d = z17;
        this.f557797e = lVar;
    }

    /* renamed from: equals */
    public boolean m179724xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv1.a1)) {
            return false;
        }
        zv1.a1 a1Var = (zv1.a1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557793a, a1Var.f557793a) && this.f557794b == a1Var.f557794b && this.f557795c == a1Var.f557795c && this.f557796d == a1Var.f557796d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557797e, a1Var.f557797e);
    }

    /* renamed from: hashCode */
    public int m179725x8cdac1b() {
        int hashCode = ((((((this.f557793a.hashCode() * 31) + java.lang.Long.hashCode(this.f557794b)) * 31) + java.lang.Long.hashCode(this.f557795c)) * 31) + java.lang.Boolean.hashCode(this.f557796d)) * 31;
        jz5.l lVar = this.f557797e;
        return hashCode + (lVar == null ? 0 : lVar.m141638x8cdac1b());
    }

    /* renamed from: toString */
    public java.lang.String m179726x9616526c() {
        return "FileSizeInfo(path=" + this.f557793a + ", sizeIncludeSubFiles=" + this.f557794b + ", time=" + this.f557795c + ", isDirectory=" + this.f557796d + ", isExempted=" + this.f557797e + ')';
    }
}
