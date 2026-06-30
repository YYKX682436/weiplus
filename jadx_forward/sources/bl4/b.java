package bl4;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public bw5.eq0 f103265a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f103266b;

    /* renamed from: c, reason: collision with root package name */
    public int f103267c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f103268d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f103269e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.lp0 f103270f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.o50 f103271g;

    public b(bw5.eq0 bizType, java.lang.String id6, int i17, java.lang.String title, java.lang.String coverUrl, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizType, "bizType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverUrl, "coverUrl");
        this.f103265a = bizType;
        this.f103266b = id6;
        this.f103267c = i17;
        this.f103268d = title;
        this.f103269e = coverUrl;
    }

    public final boolean a(bl4.b bVar) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f103266b, bVar != null ? bVar.f103266b : null);
    }

    /* renamed from: toString */
    public java.lang.String m10730x9616526c() {
        return "TingFloatBallViewInfo [bizType: " + this.f103265a + ", title: " + this.f103268d + ", status: " + this.f103267c + ", id: " + this.f103266b + ']';
    }
}
