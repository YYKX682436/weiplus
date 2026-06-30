package z82;

/* loaded from: classes9.dex */
public class c implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 f552256a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1417x3ea1c99c.ui.ActivityC13629xedc2457d f552257b;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1417x3ea1c99c.ui.ActivityC13629xedc2457d activityC13629xedc2457d, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504) {
        this.f552257b = activityC13629xedc2457d;
        this.f552256a = c11286x34a5504;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public void a(boolean z17, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1417x3ea1c99c.ui.ActivityC13629xedc2457d activityC13629xedc2457d = this.f552257b;
        if (!z17) {
            activityC13629xedc2457d.finish();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.c(activityC13629xedc2457d, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.a(activityC13629xedc2457d.getIntent().getExtras(), 0), true, true);
            return;
        }
        int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(activityC13629xedc2457d.getIntent(), com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32808x6604d593, 0);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(activityC13629xedc2457d.f183217f);
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = this.f552256a;
        if (h17 != null) {
            java.lang.String str2 = h17.f67370x28d45f97;
            java.lang.String str3 = h17.f67372x453d1e07;
            boolean k17 = h17.k();
            int m48467xfb85f7b0 = c11286x34a5504.m48467xfb85f7b0();
            try {
                java.lang.String b17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a.b(c11286x34a5504);
                java.lang.String b18 = fp.s0.b(b17 == null ? "" : b17, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                java.lang.String a17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a.a(c11286x34a5504);
                java.lang.String b19 = fp.s0.b(a17 == null ? "" : a17, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                java.lang.String str4 = c11286x34a5504.f33130x6942258;
                if (str4 == null) {
                    str4 = "";
                }
                java.lang.String b27 = fp.s0.b(str4, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                java.lang.String str5 = c11286x34a5504.f33121x993583fc;
                if (str5 == null) {
                    str5 = "";
                }
                java.lang.String b28 = fp.s0.b(str5, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareReport", g17 + "," + str2 + "," + str3 + "," + (k17 ? 1 : 0) + "," + m48467xfb85f7b0 + ",3,1,," + b27 + "," + b28 + "," + b18 + "," + b19);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16492, java.lang.Integer.valueOf(g17), str2, str3, java.lang.Integer.valueOf(k17 ? 1 : 0), java.lang.Integer.valueOf(m48467xfb85f7b0), 3, 1, "", b27, b28, b18, "", "", "", b19);
            } catch (java.io.UnsupportedEncodingException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareReport", "URLEncoder.encode Error");
            }
        }
        if (c11286x34a5504 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavOpenApiEntry", "deal fail, WXMediaMessage is null");
        } else {
            int m48467xfb85f7b02 = c11286x34a5504.m48467xfb85f7b0();
            if (m48467xfb85f7b02 != 76) {
                if (m48467xfb85f7b02 != 130) {
                    switch (m48467xfb85f7b02) {
                        case 1:
                            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11296xa95b008d c11296xa95b008d = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11296xa95b008d) c11286x34a5504.f33122xe4128443;
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11296xa95b008d.f33229x36452d)) {
                                o72.r2 r2Var = new o72.r2();
                                r2Var.f67657x2262335f = 1;
                                activityC13629xedc2457d.W6(c11286x34a5504, r2Var);
                                r2Var.f67640x5ab01132.e(c11296xa95b008d.f33229x36452d);
                                activityC13629xedc2457d.Y6(r2Var, c11286x34a5504);
                                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.a0.a(r2Var);
                                break;
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavOpenApiEntry", "addText null!");
                                break;
                            }
                        case 2:
                            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11283x90d63ed9 c11283x90d63ed9 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11283x90d63ed9) c11286x34a5504.f33122xe4128443;
                            if (c11283x90d63ed9.f33104xcba0e7a5 != null || com.p314xaae8f345.mm.vfs.w6.j(c11283x90d63ed9.f33105xcba65c20)) {
                                o72.r2 r2Var2 = new o72.r2();
                                r2Var2.f67657x2262335f = 2;
                                activityC13629xedc2457d.W6(c11286x34a5504, r2Var2);
                                activityC13629xedc2457d.Y6(r2Var2, c11286x34a5504);
                                r2Var2.f67640x5ab01132.f452497f.add(activityC13629xedc2457d.V6(c11286x34a5504, c11283x90d63ed9.f33105xcba65c20, c11283x90d63ed9.f33104xcba0e7a5, r2Var2.f67657x2262335f));
                                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.a0.a(r2Var2);
                                break;
                            }
                            break;
                        case 3:
                            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11288x597a4423 c11288x597a4423 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11288x597a4423) c11286x34a5504.f33122xe4128443;
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11288x597a4423.f33182xc58aab80) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11288x597a4423.f33185x324c710a) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11288x597a4423.f33184xc6370d0b)) {
                                o72.r2 r2Var3 = new o72.r2();
                                r2Var3.f67657x2262335f = 7;
                                activityC13629xedc2457d.W6(c11286x34a5504, r2Var3);
                                r45.gp0 gp0Var = new r45.gp0();
                                gp0Var.K0(c11288x597a4423.f33185x324c710a);
                                gp0Var.J0(c11288x597a4423.f33184xc6370d0b);
                                gp0Var.I0(c11288x597a4423.f33182xc58aab80);
                                gp0Var.O0(c11286x34a5504.f33130x6942258);
                                gp0Var.m0(c11286x34a5504.f33121x993583fc);
                                activityC13629xedc2457d.X6(c11286x34a5504, gp0Var, r2Var3.f67657x2262335f);
                                gp0Var.x0(true);
                                gp0Var.h0(r2Var3.f67657x2262335f);
                                gp0Var.D0(c11288x597a4423.f33186x239f8b5);
                                gp0Var.E0(c11288x597a4423.f33187x1478a44a);
                                r2Var3.f67640x5ab01132.f452497f.add(gp0Var);
                                activityC13629xedc2457d.Y6(r2Var3, c11286x34a5504);
                                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.a0.a(r2Var3);
                                break;
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavOpenApiEntry", "addMusic, both url null");
                                break;
                            }
                            break;
                        case 4:
                            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11298x4d56d1f9 c11298x4d56d1f9 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11298x4d56d1f9) c11286x34a5504.f33122xe4128443;
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11298x4d56d1f9.f33237x3accbfe1) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11298x4d56d1f9.f33238x44a0a2f4)) {
                                o72.r2 r2Var4 = new o72.r2();
                                r2Var4.f67657x2262335f = 4;
                                activityC13629xedc2457d.W6(c11286x34a5504, r2Var4);
                                r45.gp0 gp0Var2 = new r45.gp0();
                                gp0Var2.K0(c11298x4d56d1f9.f33238x44a0a2f4);
                                gp0Var2.J0(c11298x4d56d1f9.f33237x3accbfe1);
                                gp0Var2.O0(c11286x34a5504.f33130x6942258);
                                gp0Var2.m0(c11286x34a5504.f33121x993583fc);
                                activityC13629xedc2457d.X6(c11286x34a5504, gp0Var2, r2Var4.f67657x2262335f);
                                gp0Var2.x0(true);
                                gp0Var2.h0(r2Var4.f67657x2262335f);
                                r2Var4.f67640x5ab01132.f452497f.add(gp0Var2);
                                activityC13629xedc2457d.Y6(r2Var4, c11286x34a5504);
                                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.a0.a(r2Var4);
                                break;
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavOpenApiEntry", "addVideo, both url null");
                                break;
                            }
                            break;
                        case 5:
                            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1 c11300x89dbd7a1 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1) c11286x34a5504.f33122xe4128443;
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11300x89dbd7a1.f33249xa1713a8c)) {
                                o72.r2 r2Var5 = new o72.r2();
                                r2Var5.f67648xbed8694c = activityC13629xedc2457d.getIntent().getStringExtra("reportSessionId");
                                r2Var5.f67657x2262335f = 5;
                                activityC13629xedc2457d.W6(c11286x34a5504, r2Var5);
                                activityC13629xedc2457d.Y6(r2Var5, c11286x34a5504);
                                r2Var5.f67640x5ab01132.f452495d.f(c11300x89dbd7a1.f33249xa1713a8c);
                                if (c11286x34a5504.f33128x4f3b3aa0 != null) {
                                    r45.gp0 gp0Var3 = new r45.gp0();
                                    gp0Var3.O0(c11286x34a5504.f33130x6942258);
                                    gp0Var3.m0(c11286x34a5504.f33121x993583fc);
                                    activityC13629xedc2457d.X6(c11286x34a5504, gp0Var3, r2Var5.f67657x2262335f);
                                    gp0Var3.x0(true);
                                    gp0Var3.h0(r2Var5.f67657x2262335f);
                                    r2Var5.f67640x5ab01132.f452497f.add(gp0Var3);
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.a0.a(r2Var5);
                                break;
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavOpenApiEntry", "addUrl null!");
                                break;
                            }
                        case 6:
                            break;
                        default:
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavOpenApiEntry", "unsupport type = " + m48467xfb85f7b02);
                            break;
                    }
                }
                com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11280xa65cf99c c11280xa65cf99c = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11280xa65cf99c) c11286x34a5504.f33122xe4128443;
                if (c11280xa65cf99c.f33092xd4213b46 != null || com.p314xaae8f345.mm.vfs.w6.j(c11280xa65cf99c.f33093xd426afc1)) {
                    o72.r2 r2Var6 = new o72.r2();
                    r2Var6.f67657x2262335f = 8;
                    activityC13629xedc2457d.W6(c11286x34a5504, r2Var6);
                    activityC13629xedc2457d.Y6(r2Var6, c11286x34a5504);
                    r2Var6.f67640x5ab01132.f452497f.add(activityC13629xedc2457d.V6(c11286x34a5504, c11280xa65cf99c.f33093xd426afc1, c11280xa65cf99c.f33092xd4213b46, r2Var6.f67657x2262335f));
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.a0.a(r2Var6);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavOpenApiEntry", "addFile data null");
                }
            } else {
                com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936 c11289x4ff06936 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936) c11286x34a5504.f33122xe4128443;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11289x4ff06936.f33201x324c710a) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11289x4ff06936.f33198xc58aab80)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavOpenApiEntry", "addMusic, both url null");
                } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11289x4ff06936.f33195x4b66fa4)) {
                    c11286x34a5504.f33122xe4128443 = c11289x4ff06936;
                    activityC13629xedc2457d.U6(c11286x34a5504, null);
                } else {
                    ((ku5.t0) ku5.t0.f394148d).h(new dk5.f2(c11289x4ff06936.f33195x4b66fa4, new z82.d(activityC13629xedc2457d, c11286x34a5504, c11289x4ff06936)), "MusicVideoShareUploadImage");
                }
            }
            activityC13629xedc2457d.finish();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.c(activityC13629xedc2457d, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.a(activityC13629xedc2457d.getIntent().getExtras(), 0), true, false);
    }
}
