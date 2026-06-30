package bi1;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f102528a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f102529b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f102530c;

    /* renamed from: d, reason: collision with root package name */
    public int f102531d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f102532e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f102533f;

    /* renamed from: g, reason: collision with root package name */
    public final long f102534g;

    /* renamed from: h, reason: collision with root package name */
    public final long f102535h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f102536i;

    public h(java.lang.String type, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, long j17, long j18, java.lang.String str5, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        java.lang.String name = (i18 & 2) != 0 ? "" : str;
        java.lang.String path = (i18 & 4) != 0 ? "" : str2;
        int i19 = (i18 & 8) != 0 ? 0 : i17;
        java.lang.String content = (i18 & 16) != 0 ? "" : str3;
        java.lang.String talker = (i18 & 32) != 0 ? "" : str4;
        long j19 = (i18 & 64) != 0 ? 0L : j17;
        long j27 = (i18 & 128) == 0 ? j18 : 0L;
        java.lang.String groupOpenID = (i18 & 256) == 0 ? str5 : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupOpenID, "groupOpenID");
        this.f102528a = type;
        this.f102529b = name;
        this.f102530c = path;
        this.f102531d = i19;
        this.f102532e = content;
        this.f102533f = talker;
        this.f102534g = j19;
        this.f102535h = j27;
        this.f102536i = groupOpenID;
    }

    /* renamed from: equals */
    public boolean m10585xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi1.h)) {
            return false;
        }
        bi1.h hVar = (bi1.h) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f102528a, hVar.f102528a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f102529b, hVar.f102529b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f102530c, hVar.f102530c) && this.f102531d == hVar.f102531d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f102532e, hVar.f102532e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f102533f, hVar.f102533f) && this.f102534g == hVar.f102534g && this.f102535h == hVar.f102535h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f102536i, hVar.f102536i);
    }

    /* renamed from: hashCode */
    public int m10586x8cdac1b() {
        return (((((((((((((((this.f102528a.hashCode() * 31) + this.f102529b.hashCode()) * 31) + this.f102530c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f102531d)) * 31) + this.f102532e.hashCode()) * 31) + this.f102533f.hashCode()) * 31) + java.lang.Long.hashCode(this.f102534g)) * 31) + java.lang.Long.hashCode(this.f102535h)) * 31) + this.f102536i.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m10587x9616526c() {
        return "AppBrandOpenMsgMaterial(type=" + this.f102528a + ", name=" + this.f102529b + ", path=" + this.f102530c + ", size=" + this.f102531d + ", content=" + this.f102532e + ", talker=" + this.f102533f + ", timeStamp=" + this.f102534g + ", messageId=" + this.f102535h + ", groupOpenID=" + this.f102536i + ')';
    }
}
