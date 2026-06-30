package cg2;

/* loaded from: classes10.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f41113a;

    /* renamed from: b, reason: collision with root package name */
    public so2.h1 f41114b;

    /* renamed from: c, reason: collision with root package name */
    public vp.x f41115c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f41116d;

    /* renamed from: e, reason: collision with root package name */
    public vp.w f41117e;

    /* renamed from: f, reason: collision with root package name */
    public cg2.c0 f41118f;

    /* renamed from: g, reason: collision with root package name */
    public cg2.w f41119g;

    /* renamed from: h, reason: collision with root package name */
    public r45.qx3 f41120h;

    /* renamed from: i, reason: collision with root package name */
    public we2.p f41121i;

    static {
        xp.i f17 = xp.d.f();
        f17.f455846c = 3;
        f17.f455861r = 3;
        f17.f455851h = true;
        ae2.in inVar = ae2.in.f3688a;
        f17.f455844a = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.K3).getValue()).r()).intValue();
        f17.f455845b = xp.i.a(0);
        f17.f455857n = xp.i.a(0.0f);
        f17.f455858o = xp.i.a(0.0f);
        f17.f455847d = xp.i.a(6.0f);
        f17.f455848e = xp.i.a(24);
        f17.b(true);
    }

    public p(android.view.View bulletView) {
        kotlin.jvm.internal.o.g(bulletView, "bulletView");
        this.f41113a = bulletView;
        xp.c cVar = new xp.c(null);
        cVar.f455823a = cg2.m.f41110a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f41118f = new cg2.c0(context, this.f41121i);
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        cg2.w wVar = new cg2.w(context2);
        this.f41119g = wVar;
        cVar.f455826d = cg2.n.f41111a;
        ((java.util.ArrayList) cVar.f455825c).addAll(kz5.c0.i(this.f41118f, wVar));
        cVar.f455824b = new cg2.o(this);
        this.f41115c = new vp.x(bulletView, new xp.d(cVar, null), false);
    }

    public final vp.x a() {
        vp.x xVar = this.f41115c;
        if (xVar != null) {
            return xVar;
        }
        kotlin.jvm.internal.o.o("danmakuManager");
        throw null;
    }

    public final void b(so2.h1 feed) {
        kotlin.jvm.internal.o.g(feed, "feed");
        com.tencent.mars.xlog.Log.i("LiveBulletManager", "onAttach: id = " + pm0.v.u(feed.getItemId()) + "， this=" + hashCode());
        c();
        this.f41116d = true;
        this.f41114b = feed;
        vp.w wVar = this.f41117e;
        if (wVar != null) {
            a().f438852d.i6(wVar);
        }
        a().f438852d.f0(false);
        a().n(c01.id.c());
    }

    public final void c() {
        if (this.f41116d && this.f41114b != null) {
            this.f41116d = false;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetach: id = ");
            so2.h1 h1Var = this.f41114b;
            if (h1Var == null) {
                kotlin.jvm.internal.o.o("feedObject");
                throw null;
            }
            sb6.append(pm0.v.u(h1Var.getItemId()));
            sb6.append("， this=");
            sb6.append(hashCode());
            com.tencent.mars.xlog.Log.i("LiveBulletManager", sb6.toString());
            a().f438852d.release();
        }
    }

    public final void d(int i17, boolean z17) {
        lb2.j jVar;
        xp.i f17 = xp.d.f();
        f17.f455846c = i17;
        f17.f455861r = i17;
        f17.b(z17);
        float f18 = f17.f455860q;
        if (z17) {
            ae2.in inVar = ae2.in.f3688a;
            jVar = (lb2.j) ((jz5.n) ae2.in.K3).getValue();
        } else {
            jVar = (lb2.j) ((jz5.n) ae2.in.L3).getValue();
        }
        float intValue = ((java.lang.Number) jVar.r()).intValue();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        f17.f455844a = (int) ((intValue * ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127732h8).getValue()).r()).floatValue()) / f18);
        com.tencent.mars.xlog.Log.i("LiveBulletManager", "setDanmakuRow: rowCount=" + f17.f455846c + ", isVertical=" + z17 + ", duration=" + f17.f455844a + ", playSpeedRatio=" + f17.f455860q);
        a().j5();
    }
}
