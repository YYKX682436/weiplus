package tj4;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f501346a;

    /* renamed from: b, reason: collision with root package name */
    public final int f501347b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f501348c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f501349d;

    /* renamed from: e, reason: collision with root package name */
    public int f501350e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f501351f;

    /* renamed from: g, reason: collision with root package name */
    public int f501352g;

    public a(java.lang.String dateStr, int i17, java.util.ArrayList iconIdList, java.util.ArrayList bgIdList, int i18, java.lang.String statusId, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dateStr, "dateStr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconIdList, "iconIdList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bgIdList, "bgIdList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusId, "statusId");
        this.f501346a = dateStr;
        this.f501347b = i17;
        this.f501348c = iconIdList;
        this.f501349d = bgIdList;
        this.f501350e = i18;
        this.f501351f = statusId;
        this.f501352g = i19;
    }

    /* renamed from: equals */
    public boolean m166675xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj4.a)) {
            return false;
        }
        tj4.a aVar = (tj4.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f501346a, aVar.f501346a) && this.f501347b == aVar.f501347b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f501348c, aVar.f501348c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f501349d, aVar.f501349d) && this.f501350e == aVar.f501350e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f501351f, aVar.f501351f) && this.f501352g == aVar.f501352g;
    }

    /* renamed from: hashCode */
    public int m166676x8cdac1b() {
        return (((((((((((this.f501346a.hashCode() * 31) + java.lang.Integer.hashCode(this.f501347b)) * 31) + this.f501348c.hashCode()) * 31) + this.f501349d.hashCode()) * 31) + java.lang.Integer.hashCode(this.f501350e)) * 31) + this.f501351f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f501352g);
    }

    /* renamed from: toString */
    public java.lang.String m166677x9616526c() {
        return "SelfIconData(dateStr=" + this.f501346a + ", dayDiff=" + this.f501347b + ", iconIdList=" + this.f501348c + ", bgIdList=" + this.f501349d + ", iconType=" + this.f501350e + ", statusId=" + this.f501351f + ", createTime=" + this.f501352g + ')';
    }
}
