package vz5;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.File f523315a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f523316b;

    public d(java.io.File root, java.util.List segments) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segments, "segments");
        this.f523315a = root;
        this.f523316b = segments;
    }

    /* renamed from: equals */
    public boolean m173018xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz5.d)) {
            return false;
        }
        vz5.d dVar = (vz5.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f523315a, dVar.f523315a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f523316b, dVar.f523316b);
    }

    /* renamed from: hashCode */
    public int m173019x8cdac1b() {
        return (this.f523315a.hashCode() * 31) + this.f523316b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m173020x9616526c() {
        return "FilePathComponents(root=" + this.f523315a + ", segments=" + this.f523316b + ')';
    }
}
