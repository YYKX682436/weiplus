package wo4;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f529783a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p1 f529784b;

    /* renamed from: c, reason: collision with root package name */
    public final fs0.f f529785c;

    /* renamed from: d, reason: collision with root package name */
    public final hs0.a f529786d;

    /* renamed from: e, reason: collision with root package name */
    public final long f529787e;

    /* renamed from: f, reason: collision with root package name */
    public final long f529788f;

    public d(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p1 material, fs0.f decoder, hs0.a mediaExtractor, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(material, "material");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(decoder, "decoder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaExtractor, "mediaExtractor");
        this.f529783a = i17;
        this.f529784b = material;
        this.f529785c = decoder;
        this.f529786d = mediaExtractor;
        this.f529787e = j17;
        this.f529788f = j18;
    }

    /* renamed from: equals */
    public boolean m174276xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo4.d)) {
            return false;
        }
        wo4.d dVar = (wo4.d) obj;
        return this.f529783a == dVar.f529783a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f529784b, dVar.f529784b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f529785c, dVar.f529785c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f529786d, dVar.f529786d) && this.f529787e == dVar.f529787e && this.f529788f == dVar.f529788f;
    }

    /* renamed from: hashCode */
    public int m174277x8cdac1b() {
        return (((((((((java.lang.Integer.hashCode(this.f529783a) * 31) + this.f529784b.hashCode()) * 31) + this.f529785c.hashCode()) * 31) + this.f529786d.hashCode()) * 31) + java.lang.Long.hashCode(this.f529787e)) * 31) + java.lang.Long.hashCode(this.f529788f);
    }

    /* renamed from: toString */
    public java.lang.String m174278x9616526c() {
        return "VideoDecoder(index=" + this.f529783a + ", material=" + this.f529784b + ", decoder=" + this.f529785c + ", mediaExtractor=" + this.f529786d + ", startTime=" + this.f529787e + ", endTime=" + this.f529788f + ')';
    }
}
