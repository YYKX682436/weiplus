package ev2;

/* loaded from: classes10.dex */
public final class t extends ev2.e {

    /* renamed from: c, reason: collision with root package name */
    public final iv2.b f338466c;

    /* renamed from: d, reason: collision with root package name */
    public final jv2.c f338467d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f338468e;

    /* renamed from: f, reason: collision with root package name */
    public final int f338469f;

    /* renamed from: g, reason: collision with root package name */
    public final long f338470g;

    /* renamed from: h, reason: collision with root package name */
    public final int f338471h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(iv2.b feedItem, jv2.c comment, boolean z17, int i17, ev2.j jVar) {
        super(jVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedItem, "feedItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        this.f338466c = feedItem;
        this.f338467d = comment;
        this.f338468e = z17;
        this.f338469f = i17;
        this.f338470g = feedItem.a();
        this.f338471h = i17;
    }

    /* renamed from: toString */
    public java.lang.String m128245x9616526c() {
        return "action_" + this.f338466c.f376663f + '_' + this.f338467d.t0() + '_' + this.f338468e + '_' + this.f338469f;
    }
}
