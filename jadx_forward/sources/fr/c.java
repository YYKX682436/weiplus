package fr;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f347213a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f347214b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f347215c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f347216d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f347217e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f347218f;

    /* renamed from: g, reason: collision with root package name */
    public final int f347219g;

    public c(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo, java.lang.String verifyMd5, boolean z17, java.lang.String aesKey, java.lang.String path, java.lang.String tempPath, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(verifyMd5, "verifyMd5");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aesKey, "aesKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tempPath, "tempPath");
        this.f347213a = emojiInfo;
        this.f347214b = verifyMd5;
        this.f347215c = z17;
        this.f347216d = aesKey;
        this.f347217e = path;
        this.f347218f = tempPath;
        this.f347219g = i17;
    }

    /* renamed from: equals */
    public boolean m130036xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fr.c)) {
            return false;
        }
        fr.c cVar = (fr.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f347213a, cVar.f347213a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f347214b, cVar.f347214b) && this.f347215c == cVar.f347215c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f347216d, cVar.f347216d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f347217e, cVar.f347217e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f347218f, cVar.f347218f) && this.f347219g == cVar.f347219g;
    }

    /* renamed from: hashCode */
    public int m130037x8cdac1b() {
        return (((((((((((this.f347213a.hashCode() * 31) + this.f347214b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f347215c)) * 31) + this.f347216d.hashCode()) * 31) + this.f347217e.hashCode()) * 31) + this.f347218f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f347219g);
    }

    /* renamed from: toString */
    public java.lang.String m130038x9616526c() {
        return "EmojiVerifyConfig(emojiInfo=" + this.f347213a + ", verifyMd5=" + this.f347214b + ", needDecrypt=" + this.f347215c + ", aesKey=" + this.f347216d + ", path=" + this.f347217e + ", tempPath=" + this.f347218f + ", fetcherType=" + this.f347219g + ')';
    }
}
