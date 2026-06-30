package xs5;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f537937a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f537938b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f537939c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f537940d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f537941e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f537942f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f537943g;

    public a(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i17 & 1) != 0 ? 0L : j17;
        str = (i17 & 2) != 0 ? "" : str;
        str2 = (i17 & 4) != 0 ? "" : str2;
        str3 = (i17 & 8) != 0 ? "" : str3;
        str4 = (i17 & 16) != 0 ? "" : str4;
        str5 = (i17 & 32) != 0 ? "" : str5;
        str6 = (i17 & 64) != 0 ? "" : str6;
        this.f537937a = j17;
        this.f537938b = str;
        this.f537939c = str2;
        this.f537940d = str3;
        this.f537941e = str4;
        this.f537942f = str5;
        this.f537943g = str6;
    }

    /* renamed from: equals */
    public boolean m175888xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs5.a)) {
            return false;
        }
        xs5.a aVar = (xs5.a) obj;
        return this.f537937a == aVar.f537937a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f537938b, aVar.f537938b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f537939c, aVar.f537939c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f537940d, aVar.f537940d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f537941e, aVar.f537941e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f537942f, aVar.f537942f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f537943g, aVar.f537943g);
    }

    /* renamed from: hashCode */
    public int m175889x8cdac1b() {
        int hashCode = java.lang.Long.hashCode(this.f537937a) * 31;
        java.lang.String str = this.f537938b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f537939c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f537940d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f537941e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f537942f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f537943g;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m175890x9616526c() {
        return "feedObjectId: " + this.f537937a + "  redIconUrl: " + this.f537938b + " jumpTabId: " + this.f537939c + " nonceId: " + this.f537940d + " userName: " + this.f537941e + " finderNickName: " + this.f537942f + " coverUrl: " + this.f537943g;
    }
}
