package yq5;

/* loaded from: classes5.dex */
public final class b implements yq5.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f546122a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f546123b;

    public b(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f546122a = path;
        this.f546123b = "file://" + path;
    }

    /* renamed from: equals */
    public boolean m177514xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yq5.b.class != obj.getClass()) {
            return false;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f546122a, ((yq5.b) obj).f546122a);
    }

    /* renamed from: hashCode */
    public int m177515x8cdac1b() {
        return this.f546122a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m177516x9616526c() {
        return "FileImageSource('" + this.f546122a + "')";
    }
}
