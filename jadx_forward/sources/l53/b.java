package l53;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final m33.k1 f398170a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f398171b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f398172c;

    public b(m33.k1 videoInfo, java.lang.String shareUrl, java.lang.String shareThumbUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoInfo, "videoInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareUrl, "shareUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareThumbUrl, "shareThumbUrl");
        this.f398170a = videoInfo;
        this.f398171b = shareUrl;
        this.f398172c = shareThumbUrl;
    }

    /* renamed from: equals */
    public boolean m145164xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l53.b)) {
            return false;
        }
        l53.b bVar = (l53.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f398170a, bVar.f398170a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f398171b, bVar.f398171b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f398172c, bVar.f398172c);
    }

    /* renamed from: hashCode */
    public int m145165x8cdac1b() {
        return (((this.f398170a.hashCode() * 31) + this.f398171b.hashCode()) * 31) + this.f398172c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m145166x9616526c() {
        return "VideoShareInfo(videoInfo=" + this.f398170a + ", shareUrl=" + this.f398171b + ", shareThumbUrl=" + this.f398172c + ')';
    }
}
