package mv;

/* loaded from: classes5.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f413017a;

    /* renamed from: b, reason: collision with root package name */
    public final int f413018b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f413019c;

    public c0(int i17, int i18, java.lang.String tempPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tempPath, "tempPath");
        this.f413017a = i17;
        this.f413018b = i18;
        this.f413019c = tempPath;
    }

    /* renamed from: equals */
    public boolean m148410xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv.c0)) {
            return false;
        }
        mv.c0 c0Var = (mv.c0) obj;
        return this.f413017a == c0Var.f413017a && this.f413018b == c0Var.f413018b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413019c, c0Var.f413019c);
    }

    /* renamed from: hashCode */
    public int m148411x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f413017a) * 31) + java.lang.Integer.hashCode(this.f413018b)) * 31) + this.f413019c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m148412x9616526c() {
        return "MediaLoadResultInfo(error=" + this.f413017a + ", deviceType=" + this.f413018b + ", tempPath=" + this.f413019c + ')';
    }
}
