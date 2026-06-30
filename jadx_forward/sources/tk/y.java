package tk;

/* loaded from: classes4.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f501419a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f501420b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f501421c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f501422d;

    /* renamed from: e, reason: collision with root package name */
    public final float f501423e;

    /* renamed from: f, reason: collision with root package name */
    public final float f501424f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f501425g;

    public y(java.util.List list, java.lang.String content, java.lang.String poiName, java.lang.String poiAddress, float f17, float f18, java.lang.String poiId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(poiName, "poiName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(poiAddress, "poiAddress");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(poiId, "poiId");
        this.f501419a = list;
        this.f501420b = content;
        this.f501421c = poiName;
        this.f501422d = poiAddress;
        this.f501423e = f17;
        this.f501424f = f18;
        this.f501425g = poiId;
    }

    /* renamed from: equals */
    public boolean m166708xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk.y)) {
            return false;
        }
        tk.y yVar = (tk.y) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f501419a, yVar.f501419a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f501420b, yVar.f501420b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f501421c, yVar.f501421c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f501422d, yVar.f501422d) && java.lang.Float.compare(this.f501423e, yVar.f501423e) == 0 && java.lang.Float.compare(this.f501424f, yVar.f501424f) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f501425g, yVar.f501425g);
    }

    /* renamed from: hashCode */
    public int m166709x8cdac1b() {
        java.util.List list = this.f501419a;
        return ((((((((((((list == null ? 0 : list.hashCode()) * 31) + this.f501420b.hashCode()) * 31) + this.f501421c.hashCode()) * 31) + this.f501422d.hashCode()) * 31) + java.lang.Float.hashCode(this.f501423e)) * 31) + java.lang.Float.hashCode(this.f501424f)) * 31) + this.f501425g.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m166710x9616526c() {
        return "SnsPublishedInfo(photos=" + this.f501419a + ", content=" + this.f501420b + ", poiName=" + this.f501421c + ", poiAddress=" + this.f501422d + ", longitude=" + this.f501423e + ", latitude=" + this.f501424f + ", poiId=" + this.f501425g + ')';
    }
}
