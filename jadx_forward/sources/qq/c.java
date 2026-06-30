package qq;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f447393a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f447394b;

    public c(java.lang.String title, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f447393a = title;
        this.f447394b = obj;
    }

    /* renamed from: equals */
    public boolean m160693xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq.c)) {
            return false;
        }
        qq.c cVar = (qq.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f447393a, cVar.f447393a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f447394b, cVar.f447394b);
    }

    /* renamed from: hashCode */
    public int m160694x8cdac1b() {
        int hashCode = this.f447393a.hashCode() * 31;
        java.lang.Object obj = this.f447394b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m160695x9616526c() {
        return "ConfigOption(title=" + this.f447393a + ", value=" + this.f447394b + ')';
    }
}
