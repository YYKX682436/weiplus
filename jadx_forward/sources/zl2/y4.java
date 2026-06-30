package zl2;

/* loaded from: classes3.dex */
public final class y4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f555570a;

    /* renamed from: b, reason: collision with root package name */
    public final zl2.x4 f555571b;

    /* renamed from: c, reason: collision with root package name */
    public final long f555572c;

    public y4(java.lang.String stage, zl2.x4 type, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stage, "stage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f555570a = stage;
        this.f555571b = type;
        this.f555572c = j17;
    }

    /* renamed from: equals */
    public boolean m179148xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl2.y4)) {
            return false;
        }
        zl2.y4 y4Var = (zl2.y4) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f555570a, y4Var.f555570a) && this.f555571b == y4Var.f555571b && this.f555572c == y4Var.f555572c;
    }

    /* renamed from: hashCode */
    public int m179149x8cdac1b() {
        return (((this.f555570a.hashCode() * 31) + this.f555571b.hashCode()) * 31) + java.lang.Long.hashCode(this.f555572c);
    }

    /* renamed from: toString */
    public java.lang.String m179150x9616526c() {
        return "PerformanceEvent(stage=" + this.f555570a + ", type=" + this.f555571b + ", timestamp=" + this.f555572c + ')';
    }
}
