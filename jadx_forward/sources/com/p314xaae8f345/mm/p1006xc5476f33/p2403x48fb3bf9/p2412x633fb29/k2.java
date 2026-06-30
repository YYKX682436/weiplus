package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes7.dex */
public abstract class k2 {

    /* renamed from: a, reason: collision with root package name */
    public static long f264513a;

    /* renamed from: b, reason: collision with root package name */
    public static long f264514b;

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 v0Var, java.lang.String str, int i17, java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.u1 u1Var, boolean z17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l2 l2Var, android.content.Context context) {
        if (v0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OauthAuthorizeLogic", "doOauthAuthorizeConfirm invoker null");
            return;
        }
        f264514b = java.lang.System.currentTimeMillis();
        r45.ix4 ix4Var = new r45.ix4();
        ix4Var.f458924d = str;
        ix4Var.f458925e = i17;
        ix4Var.f458926f = new java.util.LinkedList(arrayList);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o2 o2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o2) l2Var;
        ix4Var.f458928h = o2Var.c();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = ix4Var;
        lVar.f152198b = new r45.jx4();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/oauth_authorize_confirm";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ld.f34430x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.v1(v0Var, u1Var, z17, context, o2Var));
    }

    public static void b(boolean z17, java.lang.String str, android.os.Bundle bundle, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l2 l2Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.u1 u1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthAuthorizeLogic", "onOauthAuthorizeConfirmSceneEnd suc: %b", java.lang.Boolean.valueOf(z17));
        if (context == null || ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context).isFinishing()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.n2 n2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.n2) u1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) n2Var.f263429a.get();
        if (e3Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3.e1(e3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ld.f34430x366c91de);
        }
        java.util.HashMap hashMap = (java.util.HashMap) n2Var.f263430b;
        if (hashMap.containsKey(java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ld.f34430x366c91de))) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hashMap.get(java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ld.f34430x366c91de)));
            hashMap.put(java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ld.f34430x366c91de), java.lang.Integer.valueOf(((java.lang.Number) r0).intValue() - 1));
        } else {
            hashMap.put(java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ld.f34430x366c91de), 0);
        }
        if (!z17) {
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.i2(context, str, l2Var));
        } else {
            if (bundle == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OauthAuthorizeLogic", "onOauthAuthorizeConfirmSceneEnd resp null");
                return;
            }
            java.lang.String string = bundle.getString("redirect_url");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OauthAuthorizeLogic", "onOauthAuthorizeConfirmSceneEnd redirect null");
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o2) l2Var).b(string, 9);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthAuthorizeLogic", "onOauthAuthorizeConfirmSceneEnd redirectUrl: %s", string);
            }
        }
    }

    public static void c(boolean z17, java.lang.String str, android.os.Bundle bundle, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 v0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l2 l2Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.u1 u1Var, int i17, int i18, android.app.Dialog dialog) {
        android.content.Context context2 = context;
        if (context2 instanceof android.content.MutableContextWrapper) {
            context2 = ((android.content.MutableContextWrapper) context2).getBaseContext();
        }
        android.content.Context context3 = context2;
        boolean z18 = bundle.getBoolean("is_tourist_oauth");
        java.lang.String string = bundle.getString("tourist_banner_wording");
        java.lang.String string2 = bundle.getString("redirect_url");
        java.lang.String d17 = d(bundle.getString("oauth_url"));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthAuthorizeLogic", "onOauthAuthorizeSceneEnd suc: %b, isTouristOauth:%b, appID:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), d17);
        hy4.b bVar = hy4.b.INSTANCE;
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o2 o2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o2) l2Var;
            o2Var.a();
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.z1(context3, str, o2Var));
            bVar.a(d17 == null ? "" : d17, f264513a, 2, 1, 0, 0, i18);
            bVar.b(1, (int) (java.lang.System.currentTimeMillis() - f264513a), i18);
            return;
        }
        boolean z19 = bundle.getBoolean("is_recent_has_auth");
        boolean z27 = bundle.getBoolean("is_silence_auth");
        if (z19 || z27) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o2 o2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o2) l2Var;
            o2Var2.a();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OauthAuthorizeLogic", "onOauthAuthorizeSceneEnd redirect null");
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthAuthorizeLogic", "onOauthAuthorizeSceneEnd isRecentHasAuth:%b isSilenceAuth:%b redirectUrl:%s", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z27), string2);
                ((r60.e) ((s60.e) i95.n0.c(s60.e.class))).wi(context3, com.p314xaae8f345.mm.p939x633fb29.p940x30579f.a.OPENSDK, d17, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.b2(o2Var2, d17, i18, string2));
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o2 o2Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o2) l2Var;
        if (o2Var3.e() && z18 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.c2(o2Var3, string2, string));
            return;
        }
        o2Var3.a();
        boolean z28 = bundle.getBoolean("is_use_new_page", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthAuthorizeLogic", "isUseNewPage = %b", java.lang.Boolean.valueOf(z28));
        if (z28) {
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.d2(o2Var3, context3, bundle, i17, dialog));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.g2 g2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.g2(context3, d17, o2Var3, i18, bundle, v0Var, u1Var, i17);
            if ((context3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) && ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context3).isFinishing()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthAuthorizeLogic", "showWebAuthorizeDialog isFinishing");
            } else {
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j2(context3, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m2.a((java.util.ArrayList) bundle.getSerializable("scope_list")), bundle.getString("appname"), bundle.getString("appicon_url"), g2Var));
            }
        }
        bVar.b(1, (int) (java.lang.System.currentTimeMillis() - f264513a), i18);
    }

    public static java.lang.String d(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        try {
            java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter("appid");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter)) {
                return queryParameter;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthAuthorizeLogic", "parseAppId try case not sensitive, oauthUrl:%s", str);
            return android.net.Uri.parse(str.toLowerCase()).getQueryParameter("appid");
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static boolean e(java.lang.String str, int i17) {
        if (6 == i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthAuthorizeLogic", "shouldNativeOauthIntercept from oauth");
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m2.f264546a == null && !com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m2.f264547b) {
            java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m2.b();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
                b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fya) + "/connect/oauth2/authorize";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m2.f264546a = b17.split(";");
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m2.f264547b = true;
        }
        java.lang.String[] strArr = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m2.f264546a;
        if (strArr == null || strArr.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthAuthorizeLogic", "isOauthHost sOauthHostPaths nil");
            return false;
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.String str2 = parse.getAuthority() + parse.getPath();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthAuthorizeLogic", "isOauthHost target nil");
            return false;
        }
        int i18 = 0;
        while (true) {
            java.lang.String[] strArr2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m2.f264546a;
            if (i18 >= strArr2.length) {
                return false;
            }
            if (str2.equalsIgnoreCase(strArr2[i18])) {
                return true;
            }
            i18++;
        }
    }
}
