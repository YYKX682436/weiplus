package vp5;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final vp5.c f520633a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f520634b;

    public d(vp5.c errnoCode, java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errnoCode, "errnoCode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f520633a = errnoCode;
        this.f520634b = path;
    }

    /* renamed from: equals */
    public boolean m172452xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp5.d)) {
            return false;
        }
        vp5.d dVar = (vp5.d) obj;
        return this.f520633a == dVar.f520633a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f520634b, dVar.f520634b);
    }

    /* renamed from: hashCode */
    public int m172453x8cdac1b() {
        return (this.f520633a.hashCode() * 31) + this.f520634b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m172454x9616526c() {
        return "FileResult(errnoCode=" + this.f520633a + ", path=" + this.f520634b + ")";
    }
}
