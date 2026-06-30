package uo5;

/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f511244a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f511245b;

    /* renamed from: c, reason: collision with root package name */
    public final android.media.MediaFormat f511246c;

    public a(boolean z17, java.lang.String mime, android.media.MediaFormat mediaFormat) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mime, "mime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaFormat, "mediaFormat");
        this.f511244a = z17;
        this.f511245b = mime;
        this.f511246c = mediaFormat;
    }

    /* renamed from: equals */
    public boolean m168335xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo5.a)) {
            return false;
        }
        uo5.a aVar = (uo5.a) obj;
        return this.f511244a == aVar.f511244a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f511245b, aVar.f511245b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f511246c, aVar.f511246c);
    }

    /* renamed from: hashCode */
    public int m168336x8cdac1b() {
        return (((java.lang.Boolean.hashCode(this.f511244a) * 31) + this.f511245b.hashCode()) * 31) + this.f511246c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m168337x9616526c() {
        return "CodecConfig(encode=" + this.f511244a + ", mime=" + this.f511245b + ", mediaFormat=" + this.f511246c + ')';
    }
}
