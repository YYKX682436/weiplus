package e60;

/* loaded from: classes11.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f331278a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f331279b;

    /* renamed from: c, reason: collision with root package name */
    public final int f331280c;

    /* renamed from: d, reason: collision with root package name */
    public final e60.s0 f331281d;

    public v0(java.lang.String mediaPath, java.lang.String thumbPath, int i17, e60.s0 s0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaPath, "mediaPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbPath, "thumbPath");
        this.f331278a = mediaPath;
        this.f331279b = thumbPath;
        this.f331280c = i17;
        this.f331281d = s0Var;
    }

    /* renamed from: equals */
    public boolean m127057xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e60.v0)) {
            return false;
        }
        e60.v0 v0Var = (e60.v0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f331278a, v0Var.f331278a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f331279b, v0Var.f331279b) && this.f331280c == v0Var.f331280c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f331281d, v0Var.f331281d);
    }

    /* renamed from: hashCode */
    public int m127058x8cdac1b() {
        int hashCode = ((((this.f331278a.hashCode() * 31) + this.f331279b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f331280c)) * 31;
        e60.s0 s0Var = this.f331281d;
        return hashCode + (s0Var == null ? 0 : s0Var.m127046x8cdac1b());
    }

    /* renamed from: toString */
    public java.lang.String m127059x9616526c() {
        return "GalleryFileInfo(mediaPath=" + this.f331278a + ", thumbPath=" + this.f331279b + ", videoDurationSec=" + this.f331280c + ", mediaCDNInfo=" + this.f331281d + ')';
    }
}
