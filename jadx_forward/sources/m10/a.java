package m10;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f404150a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f404151b;

    public a(int i17, java.lang.String description) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(description, "description");
        this.f404150a = i17;
        this.f404151b = description;
    }

    /* renamed from: equals */
    public boolean m146612xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m10.a)) {
            return false;
        }
        m10.a aVar = (m10.a) obj;
        return this.f404150a == aVar.f404150a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f404151b, aVar.f404151b);
    }

    /* renamed from: hashCode */
    public int m146613x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f404150a) * 31) + this.f404151b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m146614x9616526c() {
        return "JsApiVersionInfo(version=" + this.f404150a + ", description=" + this.f404151b + ')';
    }
}
