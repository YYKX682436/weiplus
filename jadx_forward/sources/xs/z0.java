package xs;

/* loaded from: classes12.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f537814a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f537815b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f537816c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f537817d;

    public z0(java.lang.String thumbPath, java.lang.String hdThumbPath, java.lang.String thumbWritePath, java.lang.String hdThumbWritePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbPath, "thumbPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hdThumbPath, "hdThumbPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbWritePath, "thumbWritePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hdThumbWritePath, "hdThumbWritePath");
        this.f537814a = thumbPath;
        this.f537815b = hdThumbPath;
        this.f537816c = thumbWritePath;
        this.f537817d = hdThumbWritePath;
    }

    /* renamed from: equals */
    public boolean m175860xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs.z0)) {
            return false;
        }
        xs.z0 z0Var = (xs.z0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f537814a, z0Var.f537814a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f537815b, z0Var.f537815b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f537816c, z0Var.f537816c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f537817d, z0Var.f537817d);
    }

    /* renamed from: hashCode */
    public int m175861x8cdac1b() {
        return (((((this.f537814a.hashCode() * 31) + this.f537815b.hashCode()) * 31) + this.f537816c.hashCode()) * 31) + this.f537817d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m175862x9616526c() {
        return "ImagePaths(thumbPath=" + this.f537814a + ", hdThumbPath=" + this.f537815b + ", thumbWritePath=" + this.f537816c + ", hdThumbWritePath=" + this.f537817d + ')';
    }
}
