package a82;

/* loaded from: classes12.dex */
public final class o0 extends jm0.g implements o72.z3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(jm0.o service) {
        super(service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        T6();
    }

    @Override // jm0.g
    public void S6() {
        jm0.o service = this.f381800d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        if (!jm0.g.class.isAssignableFrom(a82.n0.class)) {
            throw new java.lang.IllegalArgumentException(service.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(service.getViewModel(), new jm0.e(service)).a(a82.n0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        ((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) ((a82.n0) ((jm0.g) a17)).f83621h).mo141623x754a37bb()).m77667xac79a11b();
    }

    public void T6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavCheckCdnProxyFSC", "run");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6437x6cfac3ae b17 = o72.w2.f425042a.b();
        if (b17 != null) {
            b17.f137759k = 1;
        }
        jm0.o service = this.f381800d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        if (!jm0.g.class.isAssignableFrom(a82.n0.class)) {
            throw new java.lang.IllegalArgumentException(service.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(service.getViewModel(), new jm0.e(service)).a(a82.n0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        a82.n0 n0Var = (a82.n0) ((jm0.g) a17);
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) n0Var.f83621h).mo141623x754a37bb(), null, new a82.h0(n0Var, null), 1, null);
    }
}
