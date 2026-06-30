package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes12.dex */
public class l2 implements com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h3 {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f270894e;

    /* renamed from: f, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.l2 f270895f;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.j2 f270896d;

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h3
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u3 u3Var) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.k2 k2Var;
        java.util.Map d17;
        if (gm0.j1.a()) {
            if (u3Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GetUserInfoInAppLogic", "scene == null");
                return;
            }
            if (i17 == 0 && i18 == 0 && u3Var.b() == 14) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a == null || ap3.e.a() == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GetUserInfoInAppLogic", "wrong environment");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GetUserInfoInAppLogic", "NetSceneGetUserInfoInApp come back", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.k3 k3Var = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.k3) u3Var;
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.j2 j2Var = this.f270896d;
                if (j2Var != null) {
                    n62.e eVar = (n62.e) j2Var;
                    com.p314xaae8f345.mm.p944x882e457a.o oVar = k3Var.f270623d;
                    java.util.Iterator it = (oVar == null ? null : (r45.nq3) oVar.f152244b.f152233a).f463129e.iterator();
                    boolean z17 = false;
                    while (it.hasNext()) {
                        r45.ew6 ew6Var = (r45.ew6) it.next();
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ew6Var.f455298d) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ew6Var.f455299e)) {
                            com.p314xaae8f345.mm.p2621x8fb0427b.z3 q17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).q(ew6Var.f455298d);
                            if (q17 == null || ((int) q17.E2) <= 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreExt", "contact is null");
                            } else if (q17.k2()) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SubCoreExt", "isBizContact");
                            } else {
                                java.lang.String str2 = ew6Var.f455299e;
                                if (str2 != null && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str2, "PersonalAppSetting", null)) != null) {
                                    java.lang.String str3 = (java.lang.String) d17.get(".PersonalAppSetting.OpenID");
                                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                                        k2Var = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.k2();
                                        k2Var.f270885a = str3;
                                        if (k2Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k2Var.f270885a)) {
                                            n62.k.Ui().mo11260x413cb2b4(new com.p314xaae8f345.mm.p2621x8fb0427b.eb(k3Var.f270886e, ew6Var.f455298d, k2Var.f270885a));
                                            z17 = true;
                                        }
                                    }
                                }
                                k2Var = null;
                                if (k2Var != null) {
                                    n62.k.Ui().mo11260x413cb2b4(new com.p314xaae8f345.mm.p2621x8fb0427b.eb(k3Var.f270886e, ew6Var.f455298d, k2Var.f270885a));
                                    z17 = true;
                                }
                            }
                        }
                    }
                    if (z17) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = eVar.f416723a.f416736m;
                        n3Var.mo50303x856b99f0(0);
                        n3Var.mo50307xb9e94560(0, 1600L);
                    }
                }
            }
        }
    }
}
