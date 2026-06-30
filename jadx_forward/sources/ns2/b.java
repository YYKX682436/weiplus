package ns2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f420888a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f420889b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.h32 f420890c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.qt2 f420891d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f420892e;

    /* renamed from: f, reason: collision with root package name */
    public final long f420893f;

    /* renamed from: g, reason: collision with root package name */
    public final int f420894g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f420895h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f420896i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f420897j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f420898k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f420899l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f420900m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f420901n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Integer f420902o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Integer f420903p;

    public b(android.content.Context context, java.lang.String username, r45.h32 liveNoticeInfo, r45.qt2 reportContextObj, java.lang.String commentScene, long j17, int i17, java.lang.String refPageType, boolean z17, boolean z18, boolean z19, java.lang.String fromQrcode, java.lang.String str, java.lang.String activityId, java.lang.Integer num, java.lang.Integer num2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveNoticeInfo, "liveNoticeInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportContextObj, "reportContextObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentScene, "commentScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refPageType, "refPageType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromQrcode, "fromQrcode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityId, "activityId");
        this.f420888a = context;
        this.f420889b = username;
        this.f420890c = liveNoticeInfo;
        this.f420891d = reportContextObj;
        this.f420892e = commentScene;
        this.f420893f = j17;
        this.f420894g = i17;
        this.f420895h = refPageType;
        this.f420896i = z17;
        this.f420897j = z18;
        this.f420898k = z19;
        this.f420899l = fromQrcode;
        this.f420900m = str;
        this.f420901n = activityId;
        this.f420902o = num;
        this.f420903p = num2;
    }

    /* renamed from: equals */
    public boolean m149945xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns2.b)) {
            return false;
        }
        ns2.b bVar = (ns2.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f420888a, bVar.f420888a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f420889b, bVar.f420889b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f420890c, bVar.f420890c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f420891d, bVar.f420891d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f420892e, bVar.f420892e) && this.f420893f == bVar.f420893f && this.f420894g == bVar.f420894g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f420895h, bVar.f420895h) && this.f420896i == bVar.f420896i && this.f420897j == bVar.f420897j && this.f420898k == bVar.f420898k && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f420899l, bVar.f420899l) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f420900m, bVar.f420900m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f420901n, bVar.f420901n) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f420902o, bVar.f420902o) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f420903p, bVar.f420903p);
    }

    /* renamed from: hashCode */
    public int m149946x8cdac1b() {
        int hashCode = ((((((((((((((((((((((this.f420888a.hashCode() * 31) + this.f420889b.hashCode()) * 31) + this.f420890c.hashCode()) * 31) + this.f420891d.hashCode()) * 31) + this.f420892e.hashCode()) * 31) + java.lang.Long.hashCode(this.f420893f)) * 31) + java.lang.Integer.hashCode(this.f420894g)) * 31) + this.f420895h.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f420896i)) * 31) + java.lang.Boolean.hashCode(this.f420897j)) * 31) + java.lang.Boolean.hashCode(this.f420898k)) * 31) + this.f420899l.hashCode()) * 31;
        java.lang.String str = this.f420900m;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f420901n.hashCode()) * 31;
        java.lang.Integer num = this.f420902o;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.f420903p;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m149947x9616526c() {
        return "ReserveContext(context=" + this.f420888a + ", username=" + this.f420889b + ", liveNoticeInfo=" + this.f420890c + ", reportContextObj=" + this.f420891d + ", commentScene=" + this.f420892e + ", fromFeedId=" + this.f420893f + ", fromCommentScene=" + this.f420894g + ", refPageType=" + this.f420895h + ", isSelfFlag=" + this.f420896i + ", previewOnly=" + this.f420897j + ", isHalfScreenMode=" + this.f420898k + ", fromQrcode=" + this.f420899l + ", promotionToken=" + this.f420900m + ", activityId=" + this.f420901n + ", scene=" + this.f420902o + ", pullSource=" + this.f420903p + ')';
    }
}
