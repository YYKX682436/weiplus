package sy;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f495308a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f495309b;

    public a(java.lang.String url, java.lang.String aesKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aesKey, "aesKey");
        this.f495308a = url;
        this.f495309b = aesKey;
    }

    /* renamed from: equals */
    public boolean m165464xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy.a)) {
            return false;
        }
        sy.a aVar = (sy.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f495308a, aVar.f495308a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f495309b, aVar.f495309b);
    }

    /* renamed from: hashCode */
    public int m165465x8cdac1b() {
        return (this.f495308a.hashCode() * 31) + this.f495309b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m165466x9616526c() {
        return "CdnFileLocator(url=" + this.f495308a + ", aesKey=" + this.f495309b + ')';
    }
}
