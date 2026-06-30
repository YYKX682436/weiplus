package ze;

/* loaded from: classes7.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze.n f553262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 f553263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 f553264f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ze.l f553265g;

    public h(ze.l lVar, ze.n nVar, com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 c3897xbc286aa1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559) {
        this.f553265g = lVar;
        this.f553262d = nVar;
        this.f553263e = c3897xbc286aa1;
        this.f553264f = c12559xbdae8559;
    }

    @Override // java.lang.Runnable
    public void run() {
        ze.l lVar = this.f553265g;
        android.app.Activity w17 = lVar.w();
        java.util.LinkedList linkedList = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1.f172995u;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 h1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1) w17.findViewById(com.p314xaae8f345.mm.R.id.a0o);
        if (h1Var != null) {
            h1Var.c();
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 c3897xbc286aa1 = this.f553263e;
        ze.n nVar = this.f553262d;
        if (nVar == null) {
            lVar.J(c3897xbc286aa1.f158811d);
        }
        ze.n nVar2 = (ze.n) lVar.L(c3897xbc286aa1.f158811d);
        if (nVar2 != null && lVar.mo48805xd384d23c() == nVar2 && nVar2.J1()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AppBrandRuntimeContainerLU[AppBrandSplashAd]", "can't launch runtime that support mutilPageStack when it is active");
            return;
        }
        c3897xbc286aa1.f128802b2 = this.f553264f;
        if (nVar2 == null) {
            c3897xbc286aa1.f158823s = sj1.l.f(c3897xbc286aa1.f158811d, "public:prepare", "小程序环境初始化");
            sj1.l.e(c3897xbc286aa1.f158811d, "internal:prepare", "createRuntime");
            nVar2 = (ze.n) lVar.I(c3897xbc286aa1);
            sj1.l.g(c3897xbc286aa1.f158811d);
            if (nVar2 != null && nVar2.u0() != null) {
                n91.g gVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) nVar2).K2;
                if (!(gVar != null && gVar.f417406c.ordinal() <= 1)) {
                    boolean v07 = nVar2.v0();
                    xi1.o oVar = xi1.o.PORTRAIT;
                    if (v07) {
                        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 u07 = nVar2.u0();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a activityC12666xc288131a = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.b8) lVar.f156374t).f171112a;
                        if (activityC12666xc288131a != null && !activityC12666xc288131a.isFinishing()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.j mo51612x60543150 = lVar.mo51612x60543150();
                            if (mo51612x60543150 == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AppBrandRuntimeContainerLU[AppBrandSplashAd]", "tryRequestOrientationWithSplashAd, appId:%s, orientation:%s, NULL orientationHandler", u07.f158811d, u07.f158815h);
                            } else {
                                java.lang.String str = u07.f158811d;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandRuntimeContainerLU[AppBrandSplashAd]", "tryRequestOrientationWithSplashAd, appId:%s, config.Orientation:%s", str, u07.f158815h);
                                mo51612x60543150.b(oVar, new ze.i(lVar, str));
                            }
                        }
                    } else {
                        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 u08 = nVar2.u0();
                        if (!android.text.TextUtils.isEmpty(u08.f158815h) && u08.k()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.j mo51612x605431502 = lVar.mo51612x60543150();
                            if (mo51612x605431502 == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AppBrandRuntimeContainerLU[AppBrandSplashAd]", "tryRequestOrientationWithoutAd appId[%s] orientation[%s], NULL orientationHandler", u08.f158811d, u08.f158815h);
                            } else {
                                java.lang.String str2 = u08.f158811d;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandRuntimeContainerLU[AppBrandSplashAd]", "tryRequestOrientationWithoutAd, appId:%s, config.Orientation:%s", str2, u08.f158815h);
                                java.lang.String str3 = u08.f158815h;
                                xi1.o d17 = android.text.TextUtils.isEmpty(str3) ? null : xi1.o.d(str3);
                                if (d17 != null) {
                                    oVar = d17;
                                }
                                mo51612x605431502.b(oVar, new ze.j(lVar, str2));
                            }
                        }
                    }
                }
            }
            sj1.l.e(c3897xbc286aa1.f158811d, "internal:prepare", "loadNew");
            lVar.O(nVar, nVar2, c3897xbc286aa1);
            sj1.l.g(c3897xbc286aa1.f158811d);
        } else if (nVar == nVar2) {
            lVar.N(null, nVar2, c3897xbc286aa1);
            lVar.Q();
        } else {
            lVar.N(nVar, nVar2, c3897xbc286aa1);
        }
        if (nVar2.V1() || !lVar.n(nVar2)) {
            return;
        }
        if (nVar2.B0() != null) {
            nVar2.M1(true);
        } else {
            nVar2.M1(false);
        }
    }
}
