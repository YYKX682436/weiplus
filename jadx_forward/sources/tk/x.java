package tk;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f501416a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f501417b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f501418c;

    public x(java.lang.String path, boolean z17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f501416a = path;
        this.f501417b = z17;
        this.f501418c = str;
    }

    /* renamed from: equals */
    public boolean m166705xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk.x)) {
            return false;
        }
        tk.x xVar = (tk.x) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f501416a, xVar.f501416a) && this.f501417b == xVar.f501417b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f501418c, xVar.f501418c);
    }

    /* renamed from: hashCode */
    public int m166706x8cdac1b() {
        int hashCode = ((this.f501416a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f501417b)) * 31;
        java.lang.String str = this.f501418c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m166707x9616526c() {
        return "SnsPhotoInfo(path=" + this.f501416a + ", isLivePhoto=" + this.f501417b + ", videoPath=" + this.f501418c + ')';
    }
}
