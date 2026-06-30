package uf;

/* loaded from: classes7.dex */
public final class o1 extends xi1.c implements uf.f, uf.j {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f508604u = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(uf.o1.class, "_castState", "get_castState()Lcom/tencent/luggage/xweb_ext/extendplugin/component/cast/CastState;", 0))};

    /* renamed from: d, reason: collision with root package name */
    public final int f508605d;

    /* renamed from: e, reason: collision with root package name */
    public final sf.f f508606e;

    /* renamed from: f, reason: collision with root package name */
    public final uf.d2 f508607f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f508608g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f508609h;

    /* renamed from: i, reason: collision with root package name */
    public final b06.d f508610i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f508611m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f508612n;

    /* renamed from: o, reason: collision with root package name */
    public final uf.h f508613o;

    /* renamed from: p, reason: collision with root package name */
    public final uf.l f508614p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f508615q;

    /* renamed from: r, reason: collision with root package name */
    public final uf.l1 f508616r;

    /* renamed from: s, reason: collision with root package name */
    public final uf.n1 f508617s;

    /* renamed from: t, reason: collision with root package name */
    public final uf.f1 f508618t;

    public o1(int i17, sf.f invokeContext, uf.d2 mediaType, uf.g eventHandlerFactory, uf.k reportHandlerFactory) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeContext, "invokeContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaType, "mediaType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventHandlerFactory, "eventHandlerFactory");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportHandlerFactory, "reportHandlerFactory");
        this.f508605d = i17;
        this.f508606e = invokeContext;
        this.f508607f = mediaType;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(invokeContext.c().optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306), "optString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m17 = invokeContext.m();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) m17 : null;
        this.f508608g = yVar != null ? yVar.t3() : null;
        this.f508609h = "";
        this.f508610i = new uf.j1(uf.b.f508504d, this);
        this.f508612n = jz5.h.b(new uf.h1(this));
        this.f508613o = new zf1.h(this, null);
        this.f508614p = reportHandlerFactory.a(this);
        this.f508616r = new uf.l1(this);
        this.f508617s = new uf.n1(this);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f508618t = new uf.f1(context, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastHandler", "<init>");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m18 = invokeContext.m();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar = m18 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t) m18 : null;
        if (tVar != null) {
            tVar.U(new uf.d1(this));
            tVar.R(new uf.e1(this));
        }
    }

    @Override // uf.j
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastHandler", "onError");
        ((zf1.h) this.f508613o).a();
    }

    @Override // uf.j
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastHandler", "onEnd");
        ((zf1.h) this.f508613o).b();
    }

    @Override // uf.j
    public void c(int i17) {
        this.f508613o.getClass();
    }

    @Override // uf.j
    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastHandler", "onPlay");
        ((zf1.h) this.f508613o).f();
    }

    @Override // uf.j
    public void g(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastHandler", "onCastStartResult, success: " + z17);
        ((zf1.h) this.f508613o).g(z17);
    }

    @Override // uf.j
    public void i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastHandler", "onCastInterruptUnexpectedly");
        ((zf1.h) this.f508613o).i();
    }

    @Override // uf.j
    public void j(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastHandler", "onCastDeviceSelectResult, success: " + z17);
        ((zf1.h) this.f508613o).j(z17);
        if (z17) {
            s(uf.b.f508506f);
        }
    }

    @Override // uf.j
    public void l(int i17, int i18) {
        this.f508613o.getClass();
    }

    @Override // uf.j
    public void m() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastHandler", "onWaiting");
        ((zf1.h) this.f508613o).m();
    }

    @Override // xi1.c
    public void o() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastHandler", "onEnterFullscreen");
        this.f508611m = true;
    }

    @Override // uf.j
    /* renamed from: onPause */
    public void mo167945xb01dfb57() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastHandler", "onPause");
        ((zf1.h) this.f508613o).mo167945xb01dfb57();
    }

    @Override // xi1.c
    public void p() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastHandler", "onExitFullscreen");
        this.f508611m = false;
    }

    public final uf.o0 q() {
        return (uf.o0) ((jz5.n) this.f508612n).mo141623x754a37bb();
    }

    public final uf.b r() {
        return (uf.b) ((b06.b) this.f508610i).b(this, f508604u[0]);
    }

    public final void s(uf.b bVar) {
        ((b06.b) this.f508610i).a(this, f508604u[0], bVar);
    }
}
