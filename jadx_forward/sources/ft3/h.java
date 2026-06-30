package ft3;

/* loaded from: classes12.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f348088a;

    /* renamed from: b, reason: collision with root package name */
    public final long f348089b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f348090c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f348091d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f348092e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f348093f;

    /* renamed from: g, reason: collision with root package name */
    public final long f348094g;

    /* renamed from: h, reason: collision with root package name */
    public final int f348095h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.gp0 f348096i;

    /* renamed from: j, reason: collision with root package name */
    public final long f348097j;

    public h(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j18, int i17, r45.gp0 dataItem, long j19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataItem, "dataItem");
        this.f348088a = str;
        this.f348089b = j17;
        this.f348090c = str2;
        this.f348091d = str3;
        this.f348092e = str4;
        this.f348093f = str5;
        this.f348094g = j18;
        this.f348095h = i17;
        this.f348096i = dataItem;
        this.f348097j = j19;
    }

    /* renamed from: equals */
    public boolean m130456xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft3.h)) {
            return false;
        }
        ft3.h hVar = (ft3.h) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f348088a, hVar.f348088a) && this.f348089b == hVar.f348089b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f348090c, hVar.f348090c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f348091d, hVar.f348091d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f348092e, hVar.f348092e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f348093f, hVar.f348093f) && this.f348094g == hVar.f348094g && this.f348095h == hVar.f348095h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f348096i, hVar.f348096i) && this.f348097j == hVar.f348097j;
    }

    /* renamed from: hashCode */
    public int m130457x8cdac1b() {
        java.lang.String str = this.f348088a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + java.lang.Long.hashCode(this.f348089b)) * 31;
        java.lang.String str2 = this.f348090c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f348091d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f348092e;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f348093f;
        return ((((((((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.f348094g)) * 31) + java.lang.Integer.hashCode(this.f348095h)) * 31) + this.f348096i.hashCode()) * 31) + java.lang.Long.hashCode(this.f348097j);
    }

    /* renamed from: toString */
    public java.lang.String m130458x9616526c() {
        return "ThumbInfo{dataId: " + this.f348088a + "hostMsgId: " + this.f348089b + "hostMsgTalker: " + this.f348090c + "url: " + this.f348091d + "aesKey: " + this.f348092e + "md5: " + this.f348093f + "imageSize: " + this.f348094g + '}';
    }
}
