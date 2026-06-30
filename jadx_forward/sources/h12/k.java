package h12;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f359628a;

    /* renamed from: b, reason: collision with root package name */
    public final int f359629b;

    /* renamed from: c, reason: collision with root package name */
    public final h12.l f359630c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f359631d;

    public k(int i17, int i18, h12.l type, java.lang.String content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        this.f359628a = i17;
        this.f359629b = i18;
        this.f359630c = type;
        this.f359631d = content;
    }

    /* renamed from: equals */
    public boolean m132666xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h12.k)) {
            return false;
        }
        h12.k kVar = (h12.k) obj;
        return this.f359628a == kVar.f359628a && this.f359629b == kVar.f359629b && this.f359630c == kVar.f359630c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f359631d, kVar.f359631d);
    }

    /* renamed from: hashCode */
    public int m132667x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f359628a) * 31) + java.lang.Integer.hashCode(this.f359629b)) * 31) + this.f359630c.hashCode()) * 31) + this.f359631d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m132668x9616526c() {
        return "Clip(start=" + this.f359628a + ", end=" + this.f359629b + ", type=" + this.f359630c + ", content=" + this.f359631d + ')';
    }
}
