package cg2;

/* loaded from: classes10.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f122646a;

    /* renamed from: b, reason: collision with root package name */
    public so2.h1 f122647b;

    /* renamed from: c, reason: collision with root package name */
    public vp.x f122648c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f122649d;

    /* renamed from: e, reason: collision with root package name */
    public vp.w f122650e;

    /* renamed from: f, reason: collision with root package name */
    public cg2.c0 f122651f;

    /* renamed from: g, reason: collision with root package name */
    public cg2.w f122652g;

    /* renamed from: h, reason: collision with root package name */
    public r45.qx3 f122653h;

    /* renamed from: i, reason: collision with root package name */
    public we2.p f122654i;

    static {
        xp.i f17 = xp.d.f();
        f17.f537379c = 3;
        f17.f537394r = 3;
        f17.f537384h = true;
        ae2.in inVar = ae2.in.f85221a;
        f17.f537377a = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.K3).mo141623x754a37bb()).r()).intValue();
        f17.f537378b = xp.i.a(0);
        f17.f537390n = xp.i.a(0.0f);
        f17.f537391o = xp.i.a(0.0f);
        f17.f537380d = xp.i.a(6.0f);
        f17.f537381e = xp.i.a(24);
        f17.b(true);
    }

    public p(android.view.View bulletView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bulletView, "bulletView");
        this.f122646a = bulletView;
        xp.c cVar = new xp.c(null);
        cVar.f537356a = cg2.m.f122643a;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f122651f = new cg2.c0(context, this.f122654i);
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        cg2.w wVar = new cg2.w(context2);
        this.f122652g = wVar;
        cVar.f537359d = cg2.n.f122644a;
        ((java.util.ArrayList) cVar.f537358c).addAll(kz5.c0.i(this.f122651f, wVar));
        cVar.f537357b = new cg2.o(this);
        this.f122648c = new vp.x(bulletView, new xp.d(cVar, null), false);
    }

    public final vp.x a() {
        vp.x xVar = this.f122648c;
        if (xVar != null) {
            return xVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("danmakuManager");
        throw null;
    }

    public final void b(so2.h1 feed) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveBulletManager", "onAttach: id = " + pm0.v.u(feed.mo2128x1ed62e84()) + "， this=" + hashCode());
        c();
        this.f122649d = true;
        this.f122647b = feed;
        vp.w wVar = this.f122650e;
        if (wVar != null) {
            a().f520385d.i6(wVar);
        }
        a().f520385d.f0(false);
        a().n(c01.id.c());
    }

    public final void c() {
        if (this.f122649d && this.f122647b != null) {
            this.f122649d = false;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetach: id = ");
            so2.h1 h1Var = this.f122647b;
            if (h1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObject");
                throw null;
            }
            sb6.append(pm0.v.u(h1Var.mo2128x1ed62e84()));
            sb6.append("， this=");
            sb6.append(hashCode());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveBulletManager", sb6.toString());
            a().f520385d.mo172412x41012807();
        }
    }

    public final void d(int i17, boolean z17) {
        lb2.j jVar;
        xp.i f17 = xp.d.f();
        f17.f537379c = i17;
        f17.f537394r = i17;
        f17.b(z17);
        float f18 = f17.f537393q;
        if (z17) {
            ae2.in inVar = ae2.in.f85221a;
            jVar = (lb2.j) ((jz5.n) ae2.in.K3).mo141623x754a37bb();
        } else {
            jVar = (lb2.j) ((jz5.n) ae2.in.L3).mo141623x754a37bb();
        }
        float intValue = ((java.lang.Number) jVar.r()).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        f17.f537377a = (int) ((intValue * ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209265h8).mo141623x754a37bb()).r()).floatValue()) / f18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveBulletManager", "setDanmakuRow: rowCount=" + f17.f537379c + ", isVertical=" + z17 + ", duration=" + f17.f537377a + ", playSpeedRatio=" + f17.f537393q);
        a().j5();
    }
}
