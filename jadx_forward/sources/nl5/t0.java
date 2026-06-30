package nl5;

/* loaded from: classes14.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f419910a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f419911b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f419912c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f419913d;

    public t0(java.lang.String idName, java.lang.String idPackage, java.lang.String titleName, java.lang.String titlePackage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(idName, "idName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(idPackage, "idPackage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(titleName, "titleName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(titlePackage, "titlePackage");
        this.f419910a = idName;
        this.f419911b = idPackage;
        this.f419912c = titleName;
        this.f419913d = titlePackage;
    }

    /* renamed from: equals */
    public boolean m149757xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl5.t0)) {
            return false;
        }
        nl5.t0 t0Var = (nl5.t0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f419910a, t0Var.f419910a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f419911b, t0Var.f419911b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f419912c, t0Var.f419912c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f419913d, t0Var.f419913d);
    }

    /* renamed from: hashCode */
    public int m149758x8cdac1b() {
        return (((((this.f419910a.hashCode() * 31) + this.f419911b.hashCode()) * 31) + this.f419912c.hashCode()) * 31) + this.f419913d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m149759x9616526c() {
        return "SysMenuConfigItem(idName=" + this.f419910a + ", idPackage=" + this.f419911b + ", titleName=" + this.f419912c + ", titlePackage=" + this.f419913d + ')';
    }
}
