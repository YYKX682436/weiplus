package gp2;

/* loaded from: classes10.dex */
public final class a extends gp2.b {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f355728b;

    /* renamed from: c, reason: collision with root package name */
    public final so2.h1 f355729c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f355730d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String liveUrl, so2.h1 feed, boolean z17) {
        super(liveUrl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveUrl, "liveUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        this.f355728b = liveUrl;
        this.f355729c = feed;
        this.f355730d = z17;
    }

    /* renamed from: toString */
    public java.lang.String m131966x9616526c() {
        return "feed:" + this.f355729c + " liveUrl:" + this.f355728b + " isLeftPos:" + this.f355730d;
    }
}
