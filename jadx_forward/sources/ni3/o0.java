package ni3;

/* loaded from: classes10.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f419180a;

    /* renamed from: b, reason: collision with root package name */
    public final int f419181b;

    /* renamed from: c, reason: collision with root package name */
    public final int f419182c;

    /* renamed from: d, reason: collision with root package name */
    public int f419183d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f419184e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f419185f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f419186g;

    public o0(java.lang.String contextId, int i17, int i18, int i19, java.lang.String description, java.lang.String specFormat, java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextId, "contextId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(description, "description");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(specFormat, "specFormat");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        this.f419180a = contextId;
        this.f419181b = i17;
        this.f419182c = i18;
        this.f419183d = i19;
        this.f419184e = description;
        this.f419185f = specFormat;
        this.f419186g = mediaId;
    }

    public final void a(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.f419184e = str;
    }

    /* renamed from: equals */
    public boolean m149659xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni3.o0)) {
            return false;
        }
        ni3.o0 o0Var = (ni3.o0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f419180a, o0Var.f419180a) && this.f419181b == o0Var.f419181b && this.f419182c == o0Var.f419182c && this.f419183d == o0Var.f419183d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f419184e, o0Var.f419184e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f419185f, o0Var.f419185f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f419186g, o0Var.f419186g);
    }

    /* renamed from: hashCode */
    public int m149660x8cdac1b() {
        return (((((((((((this.f419180a.hashCode() * 31) + java.lang.Integer.hashCode(this.f419181b)) * 31) + java.lang.Integer.hashCode(this.f419182c)) * 31) + java.lang.Integer.hashCode(this.f419183d)) * 31) + this.f419184e.hashCode()) * 31) + this.f419185f.hashCode()) * 31) + this.f419186g.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m149661x9616526c() {
        return this.f419183d + '.' + hc2.b0.k(this.f419184e, 0, 0, 3, null) + '.' + this.f419185f;
    }
}
