package a61;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final a61.d f83250a;

    /* renamed from: b, reason: collision with root package name */
    public final a61.c f83251b;

    public a(a61.d uiConfig, a61.c sourceConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiConfig, "uiConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceConfig, "sourceConfig");
        this.f83250a = uiConfig;
        this.f83251b = sourceConfig;
    }

    /* renamed from: equals */
    public boolean m731xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a61.a)) {
            return false;
        }
        a61.a aVar = (a61.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f83250a, aVar.f83250a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f83251b, aVar.f83251b);
    }

    /* renamed from: hashCode */
    public int m732x8cdac1b() {
        return (this.f83250a.hashCode() * 31) + this.f83251b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m733x9616526c() {
        return "MMLivePhotoPlayerConfig(uiConfig=" + this.f83250a + ", sourceConfig=" + this.f83251b + ')';
    }
}
