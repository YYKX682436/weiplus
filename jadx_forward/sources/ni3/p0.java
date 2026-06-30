package ni3;

/* loaded from: classes10.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final so2.j5 f419203a;

    /* renamed from: b, reason: collision with root package name */
    public final ni3.o0 f419204b;

    /* renamed from: c, reason: collision with root package name */
    public ni3.r0 f419205c;

    /* renamed from: d, reason: collision with root package name */
    public final ni3.q0 f419206d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f419207e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f419208f;

    /* renamed from: g, reason: collision with root package name */
    public final ni3.s0 f419209g;

    /* renamed from: h, reason: collision with root package name */
    public final ni3.s0 f419210h;

    /* renamed from: i, reason: collision with root package name */
    public final ni3.s0 f419211i;

    public p0(so2.j5 feed, ni3.o0 feedContext, ni3.r0 feedPlayInfo, ni3.q0 feedLifeTimeMs, boolean z17, boolean z18, ni3.s0 stageOneLoadLife, ni3.s0 stageTwoLoadLife, ni3.s0 stagePreRenderLoadLife) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedContext, "feedContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedPlayInfo, "feedPlayInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedLifeTimeMs, "feedLifeTimeMs");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stageOneLoadLife, "stageOneLoadLife");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stageTwoLoadLife, "stageTwoLoadLife");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stagePreRenderLoadLife, "stagePreRenderLoadLife");
        this.f419203a = feed;
        this.f419204b = feedContext;
        this.f419205c = feedPlayInfo;
        this.f419206d = feedLifeTimeMs;
        this.f419207e = z17;
        this.f419208f = z18;
        this.f419209g = stageOneLoadLife;
        this.f419210h = stageTwoLoadLife;
        this.f419211i = stagePreRenderLoadLife;
    }

    /* renamed from: equals */
    public boolean m149665xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni3.p0)) {
            return false;
        }
        ni3.p0 p0Var = (ni3.p0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f419203a, p0Var.f419203a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f419204b, p0Var.f419204b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f419205c, p0Var.f419205c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f419206d, p0Var.f419206d) && this.f419207e == p0Var.f419207e && this.f419208f == p0Var.f419208f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f419209g, p0Var.f419209g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f419210h, p0Var.f419210h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f419211i, p0Var.f419211i);
    }

    /* renamed from: hashCode */
    public int m149666x8cdac1b() {
        return (((((((((((((((this.f419203a.hashCode() * 31) + this.f419204b.m149660x8cdac1b()) * 31) + this.f419205c.m149675x8cdac1b()) * 31) + this.f419206d.m149669x8cdac1b()) * 31) + java.lang.Boolean.hashCode(this.f419207e)) * 31) + java.lang.Boolean.hashCode(this.f419208f)) * 31) + this.f419209g.m149678x8cdac1b()) * 31) + this.f419210h.m149678x8cdac1b()) * 31) + this.f419211i.m149678x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m149667x9616526c() {
        ni3.o0 o0Var = this.f419204b;
        return o0Var.f419183d != -1 ? o0Var.m149661x9616526c() : hc2.b0.h(this.f419203a, false, 1, null);
    }
}
