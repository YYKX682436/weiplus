package zy2;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f558867a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f558868b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f558869c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f558870d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f558871e;

    public a(java.lang.String sdkUserId, java.lang.String userName, boolean z17, java.lang.String nickName, java.lang.String avatarUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sdkUserId, "sdkUserId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickName, "nickName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(avatarUrl, "avatarUrl");
        this.f558867a = sdkUserId;
        this.f558868b = userName;
        this.f558869c = z17;
        this.f558870d = nickName;
        this.f558871e = avatarUrl;
    }

    /* renamed from: equals */
    public boolean m179912xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy2.a)) {
            return false;
        }
        zy2.a aVar = (zy2.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558867a, aVar.f558867a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558868b, aVar.f558868b) && this.f558869c == aVar.f558869c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558870d, aVar.f558870d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558871e, aVar.f558871e);
    }

    /* renamed from: hashCode */
    public int m179913x8cdac1b() {
        return (((((((this.f558867a.hashCode() * 31) + this.f558868b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f558869c)) * 31) + this.f558870d.hashCode()) * 31) + this.f558871e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m179914x9616526c() {
        return "AnchorData(sdkUserId=" + this.f558867a + ", userName=" + this.f558868b + ", audioMode=" + this.f558869c + ", nickName=" + this.f558870d + ", avatarUrl=" + this.f558871e + ')';
    }

    public /* synthetic */ a(java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, java.lang.String str4, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? "" : str, (i17 & 2) != 0 ? "" : str2, (i17 & 4) != 0 ? false : z17, (i17 & 8) != 0 ? "" : str3, (i17 & 16) != 0 ? "" : str4);
    }
}
