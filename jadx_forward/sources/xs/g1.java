package xs;

/* loaded from: classes3.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f537784a;

    /* renamed from: b, reason: collision with root package name */
    public final long f537785b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f537786c;

    public g1(long j17, long j18, java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f537784a = j17;
        this.f537785b = j18;
        this.f537786c = path;
    }

    /* renamed from: equals */
    public boolean m175830xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs.g1)) {
            return false;
        }
        xs.g1 g1Var = (xs.g1) obj;
        return this.f537784a == g1Var.f537784a && this.f537785b == g1Var.f537785b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f537786c, g1Var.f537786c);
    }

    /* renamed from: hashCode */
    public int m175831x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f537784a) * 31) + java.lang.Long.hashCode(this.f537785b)) * 31) + this.f537786c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m175832x9616526c() {
        return "ImageInfo(mediaId=" + this.f537784a + ", addTime=" + this.f537785b + ", path=" + this.f537786c + ')';
    }
}
