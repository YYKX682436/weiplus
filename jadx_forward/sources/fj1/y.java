package fj1;

/* loaded from: classes7.dex */
public final class y extends ej1.f {

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.C12319xdc45d1ef f344676c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f344677d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f344678e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f344679f;

    /* renamed from: g, reason: collision with root package name */
    public final int f344680g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 f344681h;

    /* renamed from: i, reason: collision with root package name */
    public ej1.c f344682i;

    /* renamed from: j, reason: collision with root package name */
    public fj1.h f344683j;

    /* renamed from: k, reason: collision with root package name */
    public fj1.b0 f344684k;

    /* renamed from: l, reason: collision with root package name */
    public fj1.t f344685l;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u5 f344686m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f344687n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f344688o;

    /* renamed from: p, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f344689p;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.C12319xdc45d1ef launchParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(launchParams, "launchParams");
        this.f344676c = launchParams;
        java.lang.String str = "MicroMsg.WAMagicBrushFrameRuntime(" + launchParams.f165787i + ':' + hashCode() + ')';
        this.f344677d = str;
        this.f344680g = launchParams.f165777f;
        this.f344687n = jz5.h.b(new fj1.u(this));
        this.f344688o = jz5.h.b(new fj1.x(this));
        java.lang.String str2 = launchParams.f165775d;
        if (!(str2 == null || str2.length() == 0)) {
            java.lang.String username = launchParams.f165775d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(username, "username");
            this.f344678e = username;
        }
        java.lang.String str3 = launchParams.f165776e;
        if (!(str3 == null || str3.length() == 0)) {
            java.lang.String appId = launchParams.f165776e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId, "appId");
            this.f344679f = appId;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "<init>");
        this.f344689p = p3325xe03a0797.p3326xc267989b.z0.b();
    }

    public static final void a(fj1.y yVar, ej1.g to6) {
        yVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(to6, "to");
        if (yVar.f334811a == to6) {
            return;
        }
        ej1.g gVar = yVar.f334811a;
        gVar.getClass();
        ej1.g gVar2 = ej1.g.DESTROYED;
        if (!((gVar2 == gVar || ej1.g.CREATED == to6 || (to6.ordinal() < gVar.ordinal() && (ej1.g.PAUSED != gVar || ej1.g.RESUMED != to6))) ? false : true)) {
            throw new java.lang.IllegalStateException(yVar.f334811a + " can't transit to " + to6);
        }
        ej1.g from = yVar.f334811a;
        yVar.f334811a = to6;
        java.util.Iterator it = yVar.f334812b.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            ej1.d dVar = (ej1.d) it.next();
            ej1.g ev6 = yVar.f334811a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.g0 g0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.g0) dVar;
            g0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
            if (ev6 == ej1.g.INITIALIZED) {
                g0Var.f165817a.mo152xb9724478();
                fj1.y yVar2 = g0Var.f165818b;
                yVar2.getClass();
                yVar2.f334812b.remove(g0Var);
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(yVar.f344677d, "handleLifecycleEventChanged " + from + " -> " + to6);
        if (gVar2 == to6) {
            fj1.t tVar = yVar.f344685l;
            if (tVar != null) {
                if (tVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgReader");
                    throw null;
                }
                tVar.f344671b.mo49253x5a5ddf8();
            }
            if (yVar.f344683j != null) {
                uh1.t tVar2 = uh1.s.f509433a;
                fj1.h d17 = yVar.d();
                uh1.z zVar = (uh1.z) tVar2.f509436a;
                zVar.getClass();
                uh1.w wVar = (uh1.w) zVar.f509479b.remove(uh1.a0.a(d17));
                if (wVar != null) {
                    wVar.mo168031x41012807();
                }
            }
        }
        if (gVar2 == yVar.f334811a) {
            yVar.f334812b.clear();
        }
    }

    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f344677d, "finish " + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        pm0.v.X(new fj1.v(this));
        p3325xe03a0797.p3326xc267989b.z0.e(this.f344689p, null, 1, null);
    }

    public java.lang.String c() {
        java.lang.String str = this.f344679f;
        if (str != null) {
            return str;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appId");
        throw null;
    }

    public final fj1.h d() {
        fj1.h hVar = this.f344683j;
        if (hVar != null) {
            return hVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("jsapiInvokeComponent");
        throw null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 c11813xf952a195 = this.f344681h;
        if (c11813xf952a195 != null) {
            return c11813xf952a195;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sysConfig");
        throw null;
    }
}
