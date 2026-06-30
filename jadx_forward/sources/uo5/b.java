package uo5;

/* loaded from: classes13.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final uo5.m f511247a;

    /* renamed from: b, reason: collision with root package name */
    public final uo5.n f511248b;

    /* renamed from: c, reason: collision with root package name */
    public final uo5.p f511249c;

    public b(uo5.m codecProvider, uo5.n configProvider, uo5.p dataCallbackProxy) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codecProvider, "codecProvider");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataCallbackProxy, "dataCallbackProxy");
        this.f511247a = codecProvider;
        this.f511248b = configProvider;
        this.f511249c = dataCallbackProxy;
    }

    /* renamed from: equals */
    public boolean m168338xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo5.b)) {
            return false;
        }
        uo5.b bVar = (uo5.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f511247a, bVar.f511247a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f511248b, bVar.f511248b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f511249c, bVar.f511249c);
    }

    /* renamed from: hashCode */
    public int m168339x8cdac1b() {
        return (((this.f511247a.hashCode() * 31) + this.f511248b.hashCode()) * 31) + this.f511249c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m168340x9616526c() {
        return "CodecContext(codecProvider=" + this.f511247a + ", configProvider=" + this.f511248b + ", dataCallbackProxy=" + this.f511249c + ')';
    }
}
