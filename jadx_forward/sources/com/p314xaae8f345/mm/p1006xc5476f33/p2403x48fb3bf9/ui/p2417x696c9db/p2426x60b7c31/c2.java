package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266548e;

    public c2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, nw4.y2 y2Var) {
        this.f266548e = c1Var;
        this.f266547d = y2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        nw4.y2 y2Var = this.f266547d;
        boolean equals = y2Var.f422552i.equals("login");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266548e;
        if (equals) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e8 e8Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.R1;
            c1Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "doLogin!");
            java.util.LinkedList linkedList = new java.util.LinkedList();
            try {
                str2 = c1Var.f266531y.mo70208xad58292c();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "exception in get currentUrl %s", e17.getMessage());
                str2 = null;
            }
            java.lang.String c17 = c1Var.A.c(str2);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str3 = c17 == null ? "" : c17;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "appId is null!");
                c1Var.i5(y2Var, "doLogin:fail", null);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.a2) e8Var).a();
                return;
            } else {
                com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
                k80.e eVar = (k80.e) i95.n0.c(k80.e.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.g2 g2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.g2(c1Var, y2Var, e8Var, str3);
                ((j80.e) eVar).getClass();
                d17.g(new bl0.c(str3, linkedList, 0, "", "", 0, -1, g2Var));
                return;
            }
        }
        if (y2Var.f422552i.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o1.f33860x24728b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e8 e8Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.R1;
            c1Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "doOauthAuthorize!");
            java.lang.String str4 = (java.lang.String) y2Var.f422323a.get("scope");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "scope is null!");
                c1Var.i5(y2Var, "authorize:fail", null);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.a2) e8Var2).a();
                return;
            }
            try {
                str = c1Var.f266531y.mo70208xad58292c();
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "exception in get currentUrl %s", e18.getMessage());
                str = null;
            }
            java.lang.String c18 = c1Var.A.c(str);
            java.lang.String str5 = c18 == null ? "" : c18;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "appId is null!");
                c1Var.i5(y2Var, "authorize:fail", null);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.a2) e8Var2).a();
                return;
            }
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(str4);
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    linkedList2.add(jSONArray.optString(i17));
                }
                com.p314xaae8f345.mm.p944x882e457a.r1 d18 = gm0.j1.d();
                k80.e eVar2 = (k80.e) i95.n0.c(k80.e.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k2 k2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k2(c1Var, y2Var, e8Var2, str5);
                ((j80.e) eVar2).getClass();
                d18.g(new bl0.a(str5, null, linkedList2, 0, -1, false, k2Var));
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "Exception %s", e19.getMessage());
                c1Var.i5(y2Var, "authorize:fail", null);
            }
        }
    }
}
