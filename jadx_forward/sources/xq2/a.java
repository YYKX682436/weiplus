package xq2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f537562a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f537563b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f537564c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f537565d;

    /* renamed from: e, reason: collision with root package name */
    public int f537566e;

    /* renamed from: f, reason: collision with root package name */
    public int f537567f;

    /* renamed from: g, reason: collision with root package name */
    public long f537568g;

    /* renamed from: h, reason: collision with root package name */
    public r45.yz2 f537569h;

    public a(java.lang.String themeId, java.lang.String themeTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(themeId, "themeId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(themeTag, "themeTag");
        this.f537562a = themeId;
        this.f537563b = themeTag;
        this.f537564c = new java.util.LinkedList();
        this.f537565d = new java.util.LinkedList();
    }

    /* renamed from: equals */
    public boolean m175771xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq2.a)) {
            return false;
        }
        xq2.a aVar = (xq2.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f537562a, aVar.f537562a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f537563b, aVar.f537563b);
    }

    /* renamed from: hashCode */
    public int m175772x8cdac1b() {
        return (this.f537562a.hashCode() * 31) + this.f537563b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m175773x9616526c() {
        return "Cache(themeId=" + this.f537562a + ", themeTag=" + this.f537563b + ')';
    }
}
