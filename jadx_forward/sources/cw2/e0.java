package cw2;

/* loaded from: classes15.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final kk4.c f305192a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd f305193b;

    /* renamed from: c, reason: collision with root package name */
    public cw2.w9 f305194c;

    /* renamed from: d, reason: collision with root package name */
    public final int f305195d;

    /* renamed from: e, reason: collision with root package name */
    public final int f305196e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f305197f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f305198g;

    /* renamed from: h, reason: collision with root package name */
    public int f305199h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f305200i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f305201j;

    /* renamed from: k, reason: collision with root package name */
    public so2.i3 f305202k;

    public e0(kk4.c player, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd proxy) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proxy, "proxy");
        this.f305192a = player;
        this.f305193b = proxy;
        this.f305195d = 10000;
        this.f305196e = 15000;
        this.f305200i = "";
        this.f305195d = ((c61.l7) i95.n0.c(c61.l7.class)).ek().A * 1000;
        this.f305196e = ((c61.l7) i95.n0.c(c61.l7.class)).ek().f546241y * 1000;
    }

    public final long a() {
        kk4.c cVar = this.f305192a;
        return ((kk4.f0) cVar).mo100920x21a0b6d0() - ((kk4.f0) cVar).mo100915xddd35a52();
    }

    public final java.lang.String b() {
        return this.f305200i + ".FinderBufferProgressConsumer";
    }

    public final boolean c(cw2.wa waVar) {
        float a17 = (float) a();
        float f17 = this.f305195d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return a17 >= f17 * (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Jf).mo141623x754a37bb()).r()).booleanValue() ? this.f305193b.getPlaySpeedRatio() : 1.0f);
    }
}
