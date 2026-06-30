package cm1;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f124815a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f124816b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f124817c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f124818d;

    /* renamed from: e, reason: collision with root package name */
    public final int f124819e;

    /* renamed from: f, reason: collision with root package name */
    public final long f124820f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f124821g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f124822h;

    /* renamed from: i, reason: collision with root package name */
    public final int f124823i;

    /* renamed from: j, reason: collision with root package name */
    public final long f124824j;

    /* renamed from: k, reason: collision with root package name */
    public final int f124825k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f124826l;

    /* renamed from: m, reason: collision with root package name */
    public final int f124827m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f124828n;

    public f(java.lang.String AppId, java.lang.String roomId, java.lang.String enterPath, java.lang.String enterPathAutoAccept, int i17, long j17, java.lang.String name, java.lang.String roomType, int i18, long j18, int i19, java.lang.String str, int i27, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(AppId, "AppId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomId, "roomId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterPath, "enterPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterPathAutoAccept, "enterPathAutoAccept");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomType, "roomType");
        this.f124815a = AppId;
        this.f124816b = roomId;
        this.f124817c = enterPath;
        this.f124818d = enterPathAutoAccept;
        this.f124819e = i17;
        this.f124820f = j17;
        this.f124821g = name;
        this.f124822h = roomType;
        this.f124823i = i18;
        this.f124824j = j18;
        this.f124825k = i19;
        this.f124826l = str;
        this.f124827m = i27;
        this.f124828n = str2;
    }

    /* renamed from: equals */
    public boolean m15274xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm1.f)) {
            return false;
        }
        cm1.f fVar = (cm1.f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f124815a, fVar.f124815a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f124816b, fVar.f124816b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f124817c, fVar.f124817c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f124818d, fVar.f124818d) && this.f124819e == fVar.f124819e && this.f124820f == fVar.f124820f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f124821g, fVar.f124821g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f124822h, fVar.f124822h) && this.f124823i == fVar.f124823i && this.f124824j == fVar.f124824j && this.f124825k == fVar.f124825k && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f124826l, fVar.f124826l) && this.f124827m == fVar.f124827m && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f124828n, fVar.f124828n);
    }

    /* renamed from: hashCode */
    public int m15275x8cdac1b() {
        int hashCode = ((((((((((((((((((((this.f124815a.hashCode() * 31) + this.f124816b.hashCode()) * 31) + this.f124817c.hashCode()) * 31) + this.f124818d.hashCode()) * 31) + java.lang.Integer.hashCode(this.f124819e)) * 31) + java.lang.Long.hashCode(this.f124820f)) * 31) + this.f124821g.hashCode()) * 31) + this.f124822h.hashCode()) * 31) + java.lang.Integer.hashCode(this.f124823i)) * 31) + java.lang.Long.hashCode(this.f124824j)) * 31) + java.lang.Integer.hashCode(this.f124825k)) * 31;
        java.lang.String str = this.f124826l;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f124827m)) * 31;
        java.lang.String str2 = this.f124828n;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m15276x9616526c() {
        return "EnterWxaVoipCallingTask(AppId=" + this.f124815a + ", roomId=" + this.f124816b + ", enterPath=" + this.f124817c + ", enterPathAutoAccept=" + this.f124818d + ", versionType=" + this.f124819e + ", callingInstanceId=" + this.f124820f + ", name=" + this.f124821g + ", roomType=" + this.f124822h + ", expireTime=" + this.f124823i + ", msgId=" + this.f124824j + ", createTime=" + this.f124825k + ", iconUrl=" + this.f124826l + ", voipType=" + this.f124827m + ", subName=" + this.f124828n + ')';
    }
}
