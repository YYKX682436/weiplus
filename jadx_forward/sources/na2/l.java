package na2;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f417510a;

    /* renamed from: b, reason: collision with root package name */
    public final int f417511b;

    public l(java.lang.String name, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f417510a = name;
        this.f417511b = i17;
    }

    /* renamed from: equals */
    public boolean m149355xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na2.l)) {
            return false;
        }
        na2.l lVar = (na2.l) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f417510a, lVar.f417510a) && this.f417511b == lVar.f417511b;
    }

    /* renamed from: hashCode */
    public int m149356x8cdac1b() {
        return (this.f417510a.hashCode() * 31) + java.lang.Integer.hashCode(this.f417511b);
    }

    /* renamed from: toString */
    public java.lang.String m149357x9616526c() {
        return "TabInfo(name=" + this.f417510a + ", tabId=" + this.f417511b + ')';
    }
}
