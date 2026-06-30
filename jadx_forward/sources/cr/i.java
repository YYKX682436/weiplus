package cr;

/* loaded from: classes12.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f303101a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f303102b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f303103c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f303104d;

    /* renamed from: e, reason: collision with root package name */
    public final int f303105e;

    public i(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo, java.lang.String url, java.lang.String path, java.lang.String authKey, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authKey, "authKey");
        this.f303101a = emojiInfo;
        this.f303102b = url;
        this.f303103c = path;
        this.f303104d = authKey;
        this.f303105e = i17;
    }

    /* renamed from: equals */
    public boolean m122488xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr.i)) {
            return false;
        }
        cr.i iVar = (cr.i) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f303101a, iVar.f303101a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f303102b, iVar.f303102b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f303103c, iVar.f303103c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f303104d, iVar.f303104d) && this.f303105e == iVar.f303105e;
    }

    /* renamed from: hashCode */
    public int m122489x8cdac1b() {
        return (((((((this.f303101a.hashCode() * 31) + this.f303102b.hashCode()) * 31) + this.f303103c.hashCode()) * 31) + this.f303104d.hashCode()) * 31) + java.lang.Integer.hashCode(this.f303105e);
    }

    /* renamed from: toString */
    public java.lang.String m122490x9616526c() {
        return "EmojiFetcherConfig(emojiInfo=" + this.f303101a + ", url=" + this.f303102b + ", path=" + this.f303103c + ", authKey=" + this.f303104d + ", fetcherType=" + this.f303105e + ')';
    }
}
