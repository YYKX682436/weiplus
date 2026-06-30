package bi1;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f20995a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f20996b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f20997c;

    /* renamed from: d, reason: collision with root package name */
    public int f20998d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f20999e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f21000f;

    /* renamed from: g, reason: collision with root package name */
    public final long f21001g;

    /* renamed from: h, reason: collision with root package name */
    public final long f21002h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f21003i;

    public h(java.lang.String type, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, long j17, long j18, java.lang.String str5, int i18, kotlin.jvm.internal.i iVar) {
        java.lang.String name = (i18 & 2) != 0 ? "" : str;
        java.lang.String path = (i18 & 4) != 0 ? "" : str2;
        int i19 = (i18 & 8) != 0 ? 0 : i17;
        java.lang.String content = (i18 & 16) != 0 ? "" : str3;
        java.lang.String talker = (i18 & 32) != 0 ? "" : str4;
        long j19 = (i18 & 64) != 0 ? 0L : j17;
        long j27 = (i18 & 128) == 0 ? j18 : 0L;
        java.lang.String groupOpenID = (i18 & 256) == 0 ? str5 : "";
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(groupOpenID, "groupOpenID");
        this.f20995a = type;
        this.f20996b = name;
        this.f20997c = path;
        this.f20998d = i19;
        this.f20999e = content;
        this.f21000f = talker;
        this.f21001g = j19;
        this.f21002h = j27;
        this.f21003i = groupOpenID;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi1.h)) {
            return false;
        }
        bi1.h hVar = (bi1.h) obj;
        return kotlin.jvm.internal.o.b(this.f20995a, hVar.f20995a) && kotlin.jvm.internal.o.b(this.f20996b, hVar.f20996b) && kotlin.jvm.internal.o.b(this.f20997c, hVar.f20997c) && this.f20998d == hVar.f20998d && kotlin.jvm.internal.o.b(this.f20999e, hVar.f20999e) && kotlin.jvm.internal.o.b(this.f21000f, hVar.f21000f) && this.f21001g == hVar.f21001g && this.f21002h == hVar.f21002h && kotlin.jvm.internal.o.b(this.f21003i, hVar.f21003i);
    }

    public int hashCode() {
        return (((((((((((((((this.f20995a.hashCode() * 31) + this.f20996b.hashCode()) * 31) + this.f20997c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f20998d)) * 31) + this.f20999e.hashCode()) * 31) + this.f21000f.hashCode()) * 31) + java.lang.Long.hashCode(this.f21001g)) * 31) + java.lang.Long.hashCode(this.f21002h)) * 31) + this.f21003i.hashCode();
    }

    public java.lang.String toString() {
        return "AppBrandOpenMsgMaterial(type=" + this.f20995a + ", name=" + this.f20996b + ", path=" + this.f20997c + ", size=" + this.f20998d + ", content=" + this.f20999e + ", talker=" + this.f21000f + ", timeStamp=" + this.f21001g + ", messageId=" + this.f21002h + ", groupOpenID=" + this.f21003i + ')';
    }
}
