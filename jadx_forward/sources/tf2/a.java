package tf2;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f500419a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f500420b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f500421c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f500422d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f500423e;

    /* renamed from: f, reason: collision with root package name */
    public final int f500424f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f500425g;

    /* renamed from: h, reason: collision with root package name */
    public final int f500426h;

    /* renamed from: i, reason: collision with root package name */
    public final long f500427i;

    /* renamed from: j, reason: collision with root package name */
    public final int f500428j;

    public a(java.lang.String animationId, java.lang.String url, java.lang.String urlResMd5, java.lang.String fromUsername, java.lang.String toUsername, int i17, java.lang.String giftId, int i18, long j17, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationId, "animationId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(urlResMd5, "urlResMd5");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromUsername, "fromUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUsername, "toUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftId, "giftId");
        this.f500419a = animationId;
        this.f500420b = url;
        this.f500421c = urlResMd5;
        this.f500422d = fromUsername;
        this.f500423e = toUsername;
        this.f500424f = i17;
        this.f500425g = giftId;
        this.f500426h = i18;
        this.f500427i = j17;
        this.f500428j = i19;
    }

    /* renamed from: equals */
    public boolean m166418xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf2.a)) {
            return false;
        }
        tf2.a aVar = (tf2.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500419a, aVar.f500419a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500420b, aVar.f500420b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500421c, aVar.f500421c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500422d, aVar.f500422d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500423e, aVar.f500423e) && this.f500424f == aVar.f500424f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500425g, aVar.f500425g) && this.f500426h == aVar.f500426h && this.f500427i == aVar.f500427i && this.f500428j == aVar.f500428j;
    }

    /* renamed from: hashCode */
    public int m166419x8cdac1b() {
        return (((((((((((((((((this.f500419a.hashCode() * 31) + this.f500420b.hashCode()) * 31) + this.f500421c.hashCode()) * 31) + this.f500422d.hashCode()) * 31) + this.f500423e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f500424f)) * 31) + this.f500425g.hashCode()) * 31) + java.lang.Integer.hashCode(this.f500426h)) * 31) + java.lang.Long.hashCode(this.f500427i)) * 31) + java.lang.Integer.hashCode(this.f500428j);
    }

    /* renamed from: toString */
    public java.lang.String m166420x9616526c() {
        return "ScheduleQueueData(animationId=" + this.f500419a + ", url=" + this.f500420b + ", urlResMd5=" + this.f500421c + ", fromUsername=" + this.f500422d + ", toUsername=" + this.f500423e + ", upgradeNum=" + this.f500424f + ", giftId=" + this.f500425g + ", foregroundHeightPercentage=" + this.f500426h + ", attackGiftNumber=" + this.f500427i + ", timestamp=" + this.f500428j + ')';
    }
}
