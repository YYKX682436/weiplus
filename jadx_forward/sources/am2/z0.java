package am2;

/* loaded from: classes3.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f90312a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f90313b;

    public z0(java.lang.String giftId, java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftId, "giftId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f90312a = giftId;
        this.f90313b = name;
    }

    /* renamed from: equals */
    public boolean m2363xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am2.z0)) {
            return false;
        }
        am2.z0 z0Var = (am2.z0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f90312a, z0Var.f90312a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f90313b, z0Var.f90313b);
    }

    /* renamed from: hashCode */
    public int m2364x8cdac1b() {
        return (this.f90312a.hashCode() * 31) + this.f90313b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m2365x9616526c() {
        return "GiftInfo(giftId=" + this.f90312a + ", name=" + this.f90313b + ')';
    }
}
