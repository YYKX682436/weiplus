package zl2;

/* loaded from: classes3.dex */
public final class z4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f555584a;

    /* renamed from: b, reason: collision with root package name */
    public long f555585b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f555586c;

    public z4(java.lang.String stage, long j17, java.util.List children, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        children = (i17 & 4) != 0 ? new java.util.ArrayList() : children;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stage, "stage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(children, "children");
        this.f555584a = stage;
        this.f555585b = j17;
        this.f555586c = children;
    }

    /* renamed from: equals */
    public boolean m179151xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl2.z4)) {
            return false;
        }
        zl2.z4 z4Var = (zl2.z4) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f555584a, z4Var.f555584a) && this.f555585b == z4Var.f555585b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f555586c, z4Var.f555586c);
    }

    /* renamed from: hashCode */
    public int m179152x8cdac1b() {
        return (((this.f555584a.hashCode() * 31) + java.lang.Long.hashCode(this.f555585b)) * 31) + this.f555586c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m179153x9616526c() {
        return "TreeNode(stage=" + this.f555584a + ", cost=" + this.f555585b + ", children=" + this.f555586c + ')';
    }
}
