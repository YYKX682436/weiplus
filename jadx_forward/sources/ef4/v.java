package ef4;

/* loaded from: classes4.dex */
public final class v {
    public v(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a() {
        ye4.e eVar = (ye4.e) ((ze4.f) i95.n0.c(ze4.f.class));
        eVar.getClass();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getCacheDir().getAbsolutePath() + '/' + eVar.f542768d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getAccStoryCachePath(...)");
        return str;
    }

    public final java.lang.String b() {
        java.lang.String wi6 = ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).wi();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wi6, "getAccStoryPath(...)");
        return wi6;
    }

    public final ef4.w c() {
        ef4.w wVar = (ef4.w) i95.n0.c(ef4.w.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wVar);
        return wVar;
    }

    public final d95.b0 d() {
        ef4.w c17 = c();
        d95.b0 b0Var = c17.f334016s;
        if (b0Var == null) {
            synchronized (this) {
                ef4.w.wi(c17);
                b0Var = c17.f334016s;
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b0Var);
        return b0Var;
    }

    public final java.lang.String e() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(2, null);
        if (str == null) {
            ef4.v vVar = ef4.w.f334001t;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("error getSelfName ");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryCore", sb6.toString());
        }
        return str == null ? "" : str;
    }

    public final nf4.a f() {
        gm0.j1.b().c();
        if (c().f334009i == null) {
            c().f334009i = new nf4.a(d());
        }
        nf4.a aVar = c().f334009i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
        return aVar;
    }

    public final nf4.g g() {
        gm0.j1.b().c();
        if (c().f334007g == null) {
            c().f334007g = new nf4.g(d());
        }
        nf4.g gVar = c().f334007g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar);
        return gVar;
    }

    public final nf4.i h() {
        gm0.j1.b().c();
        if (c().f334011n == null) {
            c().f334011n = new nf4.i(d());
        }
        nf4.i iVar = c().f334011n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar);
        return iVar;
    }

    public final nf4.l i() {
        gm0.j1.b().c();
        if (c().f334006f == null) {
            c().f334006f = new nf4.l(d());
        }
        nf4.l lVar = c().f334006f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(lVar);
        return lVar;
    }

    public final ef4.f0 j() {
        gm0.j1.b().c();
        if (c().f334013p == null) {
            c().f334013p = new ef4.f0();
        }
        ef4.f0 f0Var = c().f334013p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f0Var);
        return f0Var;
    }

    public final nf4.p k() {
        gm0.j1.b().c();
        if (c().f334010m == null) {
            c().f334010m = new nf4.p(d());
        }
        nf4.p pVar = c().f334010m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pVar);
        return pVar;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 l() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 d17 = gm0.j1.e().d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getWorkerHandler(...)");
        return d17;
    }

    public final vo0.d m() {
        gm0.j1.b().c();
        if (c().f334012o == null) {
            c().f334012o = new hf4.f();
        }
        hf4.f fVar = c().f334012o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar);
        return fVar.f362760a;
    }
}
