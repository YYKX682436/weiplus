package d30;

@j95.b
/* loaded from: classes15.dex */
public class a extends i95.w implements e30.e {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f307655e = lp0.b.u();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f307656f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f307657g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f307658d = new java.util.HashSet();

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(lp0.b.h() + "/emoji/");
        sb6.append("egg_spring/");
        java.lang.String sb7 = sb6.toString();
        f307656f = sb7;
        f307657g = sb7 + "innerLuckyBag.wxam";
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EggSpringFeatureService", "onAccountInitialized");
        s75.d.b(new d30.b(this), "init_egg_spring_dir");
        f21.g K = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).K();
        if (K == null || K.f340431d.isEmpty()) {
            return;
        }
        java.util.Iterator it = K.f340431d.iterator();
        while (it.hasNext()) {
            final f21.e eVar = (f21.e) it.next();
            if (eVar.f340414q == 5) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.n6 n6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.n6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.n6.class);
                if (n6Var != null) {
                    f21.h hVar = eVar.f340419v;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EggSpringFeatureService", "registerPkgSpecs success, username:%s, appId:%s", hVar.f340438e, hVar.f340437d);
                    f21.h hVar2 = eVar.f340419v;
                    n6Var.Eb(hVar2.f340438e, hVar2.f340437d, 1189);
                } else {
                    ku5.u0 u0Var = ku5.t0.f394148d;
                    java.lang.Runnable runnable = new java.lang.Runnable() { // from class: d30.a$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.n6 n6Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.n6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.n6.class);
                            if (n6Var2 != null) {
                                f21.e eVar2 = f21.e.this;
                                f21.h hVar3 = eVar2.f340419v;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EggSpringFeatureService", "registerPkgSpecs success by last check, username:%s, appId:%s", hVar3.f340438e, hVar3.f340437d);
                                f21.h hVar4 = eVar2.f340419v;
                                n6Var2.Eb(hVar4.f340438e, hVar4.f340437d, 1189);
                            }
                        }
                    };
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    t0Var.z(runnable, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EggSpringFeatureService", "registerPkgSpecs Failed, IWxaPkgDownloaderExportService Null");
                }
            }
        }
    }

    public void wi(java.lang.String str) {
        ((java.util.HashSet) this.f307658d).add(str);
        ((j60.a0) ((k60.f) i95.n0.c(k60.f.class))).getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1.c(str) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EggSpringFeatureService", "has prefetch %s", str);
            return;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_egg_preload_url, 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EggSpringFeatureService", "prefetch %s: config %s", str, java.lang.Integer.valueOf(Ni));
        if (Ni == 1) {
            k60.f fVar = (k60.f) i95.n0.c(k60.f.class);
            ((k60.f) i95.n0.c(k60.f.class)).getClass();
            d30.c cVar = new d30.c(this);
            ((j60.a0) fVar).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1.e(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.s1.class, str, cVar);
        }
    }
}
