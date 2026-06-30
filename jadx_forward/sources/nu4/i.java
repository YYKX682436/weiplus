package nu4;

/* loaded from: classes.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final nu4.i f421786d = new nu4.i();

    public i() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.q1 q1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.s1.f263505a;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.t1.a().getInt("prefetchUsePkg", qk.ka.a() ? 1 : -1);
        if (i17 == 0) {
            return java.lang.Boolean.FALSE;
        }
        if (i17 == 1) {
            return java.lang.Boolean.TRUE;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_open_prefetcher_use_pkg_v2, 0) == 1);
        boolean booleanValue = valueOf.booleanValue();
        nu4.k kVar = nu4.b0.f421774J;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherJsEngine", "prefetchUsePkgOpen open " + booleanValue);
        return valueOf;
    }
}
