package ml2;

/* loaded from: classes3.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final so2.v1 f409002a;

    /* renamed from: b, reason: collision with root package name */
    public final int f409003b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f409004c;

    /* renamed from: d, reason: collision with root package name */
    public final ml2.x1 f409005d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f409006e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f409007f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f409008g;

    public g0(so2.v1 feed, int i17, java.lang.String feedId, ml2.x1 actionType, java.lang.String commentscene, boolean z17, java.lang.String nickName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId, "feedId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentscene, "commentscene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickName, "nickName");
        this.f409002a = feed;
        this.f409003b = i17;
        this.f409004c = feedId;
        this.f409005d = actionType;
        this.f409006e = commentscene;
        this.f409007f = z17;
        this.f409008g = nickName;
    }

    /* renamed from: equals */
    public boolean m147521xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml2.g0)) {
            return false;
        }
        ml2.g0 g0Var = (ml2.g0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409002a, g0Var.f409002a) && this.f409003b == g0Var.f409003b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409004c, g0Var.f409004c) && this.f409005d == g0Var.f409005d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409006e, g0Var.f409006e) && this.f409007f == g0Var.f409007f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409008g, g0Var.f409008g);
    }

    /* renamed from: hashCode */
    public int m147522x8cdac1b() {
        return (((((((((((this.f409002a.hashCode() * 31) + java.lang.Integer.hashCode(this.f409003b)) * 31) + this.f409004c.hashCode()) * 31) + this.f409005d.hashCode()) * 31) + this.f409006e.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f409007f)) * 31) + this.f409008g.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m147523x9616526c() {
        return "HellLiveItem(feed=" + this.f409002a + ", pos=" + this.f409003b + ", feedId=" + this.f409004c + ", actionType=" + this.f409005d + ", commentscene=" + this.f409006e + ", liveStatus=" + this.f409007f + ", nickName=" + this.f409008g + ')';
    }
}
