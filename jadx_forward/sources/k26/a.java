package k26;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f385300a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f385301b;

    public a(java.lang.Object obj, java.lang.Object obj2) {
        this.f385300a = obj;
        this.f385301b = obj2;
    }

    /* renamed from: equals */
    public boolean m141861xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k26.a)) {
            return false;
        }
        k26.a aVar = (k26.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f385300a, aVar.f385300a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f385301b, aVar.f385301b);
    }

    /* renamed from: hashCode */
    public int m141862x8cdac1b() {
        java.lang.Object obj = this.f385300a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        java.lang.Object obj2 = this.f385301b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m141863x9616526c() {
        return "ApproximationBounds(lower=" + this.f385300a + ", upper=" + this.f385301b + ')';
    }
}
