package r33;

/* loaded from: classes8.dex */
public class b implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m33.h1 f450496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f450497b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r33.f f450498c;

    public b(r33.f fVar, m33.h1 h1Var, android.content.Context context) {
        this.f450498c = fVar;
        this.f450496a = h1Var;
        this.f450497b = context;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        int parseColor;
        int parseColor2;
        m53.g3 g3Var;
        if (i17 != 0 || i18 != 0 || (fVar = oVar.f152244b.f152233a) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CgiGetLaunchGameInfo", "GetLaunchGameInfo cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, oVar.f152244b.f152233a);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("error", "GetLaunchGameInfo cgi failed");
            this.f450496a.b(hashMap);
            return;
        }
        m53.i2 i2Var = (m53.i2) fVar;
        m53.t3 t3Var = i2Var.f405314d;
        if (t3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CgiGetLaunchGameInfo", "GetLaunchGameInfo cgi fail, gameInfo is null");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("error", "GetLaunchGameInfo cgi failed, gameInfo is null");
            this.f450496a.b(hashMap2);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiGetLaunchGameInfo", "GetLaunchGameInfo cgi success, game appId:%s appName:%s iconUrl:%s", t3Var.f405605d, t3Var.f405606e, t3Var.f405607f);
        int i19 = i2Var.f405315e;
        if (i19 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CgiGetLaunchGameInfo", "GetLaunchGameInfo cgi failed, actionType is error, errMsg: %s", i2Var.f405316f);
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("error", i2Var.f405316f);
            r33.f fVar2 = this.f450498c;
            if (fVar2.f450512c == "waapp") {
                hashMap3.put("type", "showAlert");
            } else {
                android.content.Context context = this.f450497b;
                java.lang.String str2 = i2Var.f405316f;
                fVar2.getClass();
                ((ku5.t0) ku5.t0.f394148d).B(new r33.d(fVar2, context, str2));
            }
            this.f450496a.b(hashMap3);
            return;
        }
        if (i19 == 3) {
            m53.l2 l2Var = i2Var.f405318h;
            if (l2Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CgiGetLaunchGameInfo", "GetLaunchGameInfo cgi fail, actionType is liteApp but info is nil");
                java.util.HashMap hashMap4 = new java.util.HashMap();
                hashMap4.put("error", "GetLaunchGameInfo cgi fail, actionType is liteApp but info is nil");
                this.f450496a.b(hashMap4);
                return;
            }
            r33.f fVar3 = this.f450498c;
            android.content.Context context2 = this.f450497b;
            m53.t3 t3Var2 = i2Var.f405314d;
            m33.h1 h1Var = this.f450496a;
            fVar3.getClass();
            q80.d0 d0Var = new q80.d0();
            boolean z17 = l2Var.f405404h;
            boolean z18 = l2Var.f405405i;
            java.lang.String str3 = l2Var.f405400d;
            d0Var.f442182a = str3;
            d0Var.f442183b = l2Var.f405401e;
            d0Var.f442184c = l2Var.f405402f;
            d0Var.f442185d = java.lang.Boolean.valueOf(l2Var.f405410q);
            if (l2Var.f405407n) {
                d0Var.f442190i = 1;
            }
            d0Var.f442191j = l2Var.f405408o;
            d0Var.f442187f = l2Var.f405411r;
            java.lang.String str4 = l2Var.f405406m;
            if (str4 == null || str4.length() <= 0) {
                d0Var.f442197p = com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea;
                d0Var.f442198q = com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed;
            } else if (str4.equals("modal")) {
                d0Var.f442197p = com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0;
                d0Var.f442198q = com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1;
            } else if (str4.equals(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19904x66446a63)) {
                d0Var.f442197p = com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea;
                d0Var.f442198q = com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiGetLaunchGameInfo", "open liteapp:" + str3 + ", page:" + l2Var.f405401e);
            d0Var.f442199r = z17;
            d0Var.f442200s = z18;
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80();
            java.lang.String str5 = fVar3.f450512c;
            if (str5 == "webview") {
                c3708xc1f46f80.f14311x683188c = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.WEB_VIEW;
            } else if (str5 == "waapp") {
                c3708xc1f46f80.f14311x683188c = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.WA_APP;
            } else if (str5 == "liteapp") {
                c3708xc1f46f80.f14311x683188c = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.LITE_APP;
            } else if (str5 == "game") {
                c3708xc1f46f80.f14311x683188c = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.GAME;
            } else {
                c3708xc1f46f80.f14311x683188c = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.APP;
            }
            d0Var.f442207z = c3708xc1f46f80;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(context2, d0Var, new r33.c(fVar3, str3, t3Var2, h1Var));
            return;
        }
        if (i19 != 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CgiGetLaunchGameInfo", "GetLaunchGameInfo fail , errType error:%d", java.lang.Integer.valueOf(i17));
            java.util.HashMap hashMap5 = new java.util.HashMap();
            hashMap5.put("error", "GetLaunchGameInfo cgi fail, actionType error");
            this.f450496a.b(hashMap5);
            return;
        }
        m53.u2 u2Var = i2Var.f405319i;
        if (u2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CgiGetLaunchGameInfo", "GetLaunchGameInfo cgi fail, actionType is webview but info is nil");
            java.util.HashMap hashMap6 = new java.util.HashMap();
            hashMap6.put("error", "GetLaunchGameInfo cgi fail, actionType is webview but info is nil");
            this.f450496a.b(hashMap6);
            return;
        }
        r33.f fVar4 = this.f450498c;
        m53.t3 t3Var3 = i2Var.f405314d;
        m33.h1 h1Var2 = this.f450496a;
        fVar4.getClass();
        java.lang.String str6 = u2Var.f405623d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CgiGetLaunchGameInfo", "url is null");
            java.util.HashMap hashMap7 = new java.util.HashMap();
            hashMap7.put("error", "url is null");
            h1Var2.b(hashMap7);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiGetLaunchGameInfo", "GetLaunchGameInfo openWebview url: %s", str6);
            java.lang.String str7 = u2Var.f405627h;
            android.net.Uri parse = android.net.Uri.parse(str6);
            java.lang.String queryParameter = parse.getQueryParameter("not_in_game_luggage");
            android.os.Bundle bundle = new android.os.Bundle();
            if (queryParameter == null) {
                queryParameter = "";
            }
            if (queryParameter.equals("1") || !(parse.getHost() == null || parse.getHost().equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fxy)))) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", str6);
                j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "webview", ".ui.tools.WebViewUI", intent, null);
                h1Var2.a(new java.util.HashMap());
            } else {
                java.lang.String str8 = u2Var.f405624e;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str8)) {
                    parseColor = 0;
                } else {
                    try {
                        parseColor = android.graphics.Color.parseColor(str8);
                    } catch (java.lang.IllegalArgumentException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CgiGetLaunchGameInfo", e17.getMessage());
                        java.util.HashMap hashMap8 = new java.util.HashMap();
                        hashMap8.put("error", "invalid_color");
                        h1Var2.b(hashMap8);
                    }
                }
                java.lang.String str9 = u2Var.f405625f;
                java.lang.String str10 = u2Var.f405628i;
                bundle.putString("rawUrl", str6);
                bundle.putInt("customize_status_bar_color", parseColor);
                bundle.putString("status_bar_style", str9);
                bundle.putString("game_pre_inject_data", str10);
                java.lang.String str11 = u2Var.f405626g;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str11)) {
                    parseColor2 = 0;
                } else {
                    try {
                        parseColor2 = android.graphics.Color.parseColor(str11);
                    } catch (java.lang.IllegalArgumentException e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CgiGetLaunchGameInfo", e18.getMessage());
                        java.util.HashMap hashMap9 = new java.util.HashMap();
                        hashMap9.put("error", e18.getMessage());
                        h1Var2.b(hashMap9);
                    }
                }
                bundle.putInt("KHalfScreenBackGroundColor", parseColor2);
                m53.q3 q3Var = u2Var.f405631o;
                if (q3Var != null && (g3Var = q3Var.f405521f) != null) {
                    int i27 = g3Var.f405236d;
                    if (i27 == 1) {
                        bundle.putString("rawUrl", q3Var.f405520e);
                        bundle.putInt("KHalfScreenHeight", g3Var.f405238f);
                        bundle.putFloat("KHalfScreenHeightPercent", -1.0f);
                    } else if (i27 == 2) {
                        bundle.putString("rawUrl", q3Var.f405520e);
                        bundle.putInt("KHalfScreenHeight", 0);
                        bundle.putFloat("KHalfScreenHeightPercent", (float) g3Var.f405237e);
                    }
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
                    bundle.putString("game_open_html", str7);
                }
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtras(bundle);
                j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "webview", ".ui.tools.WebViewUI", intent2, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiGetLaunchGameInfo", "openWebview success " + str6);
                fVar4.a(4, t3Var3, h1Var2);
            }
        }
    }
}
