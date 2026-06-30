package ir1;

/* loaded from: classes3.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f375541a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f375542b;

    public j2(int i17, java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f375541a = i17;
        this.f375542b = name;
    }

    /* renamed from: equals */
    public boolean m139727xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir1.j2)) {
            return false;
        }
        ir1.j2 j2Var = (ir1.j2) obj;
        return this.f375541a == j2Var.f375541a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f375542b, j2Var.f375542b);
    }

    /* renamed from: hashCode */
    public int m139728x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f375541a) * 31) + this.f375542b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m139729x9616526c() {
        return "PrivateMsgScope(type=" + this.f375541a + ", name=" + this.f375542b + ')';
    }
}
