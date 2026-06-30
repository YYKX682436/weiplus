package wv3;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final r26.t f531579a;

    /* renamed from: b, reason: collision with root package name */
    public final wv3.k f531580b;

    public a(r26.t regex, wv3.k type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(regex, "regex");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f531579a = regex;
        this.f531580b = type;
    }

    /* renamed from: equals */
    public boolean m174533xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv3.a)) {
            return false;
        }
        wv3.a aVar = (wv3.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f531579a, aVar.f531579a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f531580b, aVar.f531580b);
    }

    /* renamed from: hashCode */
    public int m174534x8cdac1b() {
        return (this.f531579a.hashCode() * 31) + this.f531580b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m174535x9616526c() {
        return "MusicPattern(regex=" + this.f531579a + ", type=" + this.f531580b + ')';
    }
}
