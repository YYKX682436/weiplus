package f93;

/* loaded from: classes3.dex */
public final class r5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f341983a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f341984b;

    /* renamed from: c, reason: collision with root package name */
    public final int f341985c;

    public r5(java.lang.String id6, java.lang.String name, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f341983a = id6;
        this.f341984b = name;
        this.f341985c = i17;
    }

    /* renamed from: equals */
    public boolean m129227xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f93.r5)) {
            return false;
        }
        f93.r5 r5Var = (f93.r5) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f341983a, r5Var.f341983a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f341984b, r5Var.f341984b) && this.f341985c == r5Var.f341985c;
    }

    /* renamed from: hashCode */
    public int m129228x8cdac1b() {
        return (((this.f341983a.hashCode() * 31) + this.f341984b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f341985c);
    }

    /* renamed from: toString */
    public java.lang.String m129229x9616526c() {
        return "LabelInfo(id=" + this.f341983a + ", name=" + this.f341984b + ", count=" + this.f341985c + ')';
    }
}
