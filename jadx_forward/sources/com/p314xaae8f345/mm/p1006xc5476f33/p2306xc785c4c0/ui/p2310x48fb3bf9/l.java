package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9;

/* loaded from: classes8.dex */
public class l extends aw4.l {

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.HashSet f256749l;

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Set f256750m;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.j f256751e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.C19226x5a0e667d f256752f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.in6 f256753g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f256754h;

    /* renamed from: i, reason: collision with root package name */
    public final mf0.b0 f256755i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f256756j;

    /* renamed from: k, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.k0 f256757k;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        f256749l = hashSet;
        f256750m = new java.util.HashSet();
        hashSet.add("launchApplication");
        hashSet.add("openFinderView");
        hashSet.add("openWeApp");
    }

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.C19226x5a0e667d c19226x5a0e667d, r45.in6 in6Var, com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.j jVar, java.util.LinkedList linkedList, mf0.b0 b0Var) {
        super(null);
        this.f256754h = new java.util.LinkedList();
        this.f256756j = true;
        this.f256757k = ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).bj(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.e0(this));
        this.f256752f = c19226x5a0e667d;
        this.f256753g = in6Var;
        this.f256751e = jVar;
        this.f256754h = linkedList;
        this.f256755i = b0Var;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: checkHaoKanCommentPermission */
    public void m72299xb59edc24(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanCommentPermission, params = %s.", str);
        try {
            java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
            android.content.Context context = k17.get() != null ? (android.content.Context) k17.get() : null;
            if (context == null) {
                q("notifyHaoKanCommentPermission", false, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanCommentPermission, context = null.");
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).getBoolean("tophitory_show_comment_dialog", false)) {
                aw4.n0.f96434a.d(context, new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.b0(this), false);
            } else {
                q("notifyHaoKanCommentPermission", true, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanCommentPermission, isgrant no dilaog.");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "notifyReddot " + e17.getMessage());
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: checkHaoKanPermission */
    public void m72300x61cbebf9(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanPermission, params = %s.", str);
        java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
        android.content.Context context = k17.get() != null ? (android.content.Context) k17.get() : null;
        if (context == null) {
            q("notifyHaoKanPermission", false, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanPermission context = null.");
            return;
        }
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).getBoolean("tophitory_show_init_dialog", false)) {
                q("notifyHaoKanPermission", true, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanPermission, is grant no dilaog.");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.a0 a0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.a0(this);
                boolean Ai = ((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).Ai();
                aw4.m0 m0Var = aw4.n0.f96434a;
                if (Ai) {
                    java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574937on4);
                    java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574935on2);
                    ((sg0.w3) ((tg0.x1) i95.n0.c(tg0.x1.class))).getClass();
                    m0Var.b(context, a0Var, string2, string, true, "tophitory_show_init_dialog");
                } else {
                    tg0.x1 x1Var = (tg0.x1) i95.n0.c(tg0.x1.class);
                    java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k1c);
                    ((sg0.w3) x1Var).getClass();
                    m0Var.e(context, a0Var, string3);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "notifyReddot " + e17.getMessage());
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: createWebViewForFastLoad */
    public void m72301xd2c54f8e(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int optInt = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, -1);
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("itemShowTypes");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    int optInt2 = optJSONArray.optInt(i17, -1);
                    if (optInt2 != -1) {
                        arrayList.add(java.lang.Integer.valueOf(optInt2));
                    }
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.add(0);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "createWebViewForFastLoad openScene: %d, itemShowTypeList: %s", java.lang.Integer.valueOf(optInt), arrayList);
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).w(optInt, arrayList);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "createWebViewForFastLoad exception", new java.lang.Object[0]);
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: disposeUniformReddot */
    public java.lang.String m72302x40cf9a0d(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "disposeUniformReddot() called with: params = [" + str + "]");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "");
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("paths");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "disposeUniformReddot: path:%s,paths:%s", optString, optJSONArray);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N(optString);
            }
            if (optJSONArray != null) {
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    java.lang.String string = optJSONArray.getString(i17);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N(string);
                    }
                }
            }
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "disposeUniformReddot  exception", new java.lang.Object[0]);
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: doGoToRecVideoList */
    public java.lang.String m72303x443b0cd7(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "doGoToRecVideoList %s", str);
        try {
            r45.un6 p17 = pm4.w.p(new org.json.JSONObject(str));
            if (o() != null) {
                su4.r2.q(((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j) o()).f256519d, p17, 1);
            }
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "doGoToRecVideoList", new java.lang.Object[0]);
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: doNegFeedback */
    public void m72304xdfd64faa(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "doNegFeedback %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.has("filterDocid") && jSONObject.has("category")) {
                java.lang.String string = jSONObject.getString("filterDocid");
                ((wm4.p) ((wm4.o) i95.n0.c(wm4.o.class))).wi().a(jSONObject.getInt("category"), string);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "doNegFeedback", new java.lang.Object[0]);
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: downloadPageDataForFastLoad */
    public void m72305x58f1ad0a(java.lang.String str) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "downloadPageDataForFastLoad params: %s", str);
            org.json.JSONArray optJSONArray = new org.json.JSONObject(str).optJSONArray("itemList");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                    if (optJSONObject != null) {
                        java.lang.String optString = optJSONObject.optString("url", "");
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                            int optInt = optJSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, -1);
                            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
                            if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.e(optInt)) {
                                int optInt2 = optJSONObject.optInt("item_show_type", -1);
                                java.lang.String optString2 = optJSONObject.optString("brand_user_name", "");
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "downloadPageDataForFastLoad itemShowType: %d, openScene: %d, url: %s, brandUserName: %s", java.lang.Integer.valueOf(optInt2), java.lang.Integer.valueOf(optInt), optString, optString2);
                                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).c(optString, optInt2, optInt, optString2, new java.lang.Object[0]);
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TopStory.TopStoryWebViewJSApi", "downloadPageDataForFastLoad can not preload openScene: %d", java.lang.Integer.valueOf(optInt));
                            }
                        }
                    }
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TopStory.TopStoryWebViewJSApi", "downloadPageDataForFastLoad item list is empty");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "createWebViewForFastLoad exception", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @android.webkit.JavascriptInterface
    /* renamed from: extTransfer */
    public void m72306xbfdcf52c(java.lang.String str) {
        java.lang.Exception e17;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 c12965xc9712d2;
        org.json.JSONObject jSONObject;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "TopStoryTransfer extTransfer, paramsStr = %s", str);
        java.lang.String str3 = null;
        try {
            jSONObject = new org.json.JSONObject(str);
            str2 = jSONObject.optString("objectid", "");
            try {
                c12965xc9712d2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2();
            } catch (java.lang.Exception e18) {
                e17 = e18;
            }
        } catch (java.lang.Exception e19) {
            e17 = e19;
            str2 = "";
        }
        try {
            c12965xc9712d2.f175446d = 1;
            c12965xc9712d2.f175448f = jSONObject.optString("scope", "");
            r45.y24 y24Var = new r45.y24();
            c12965xc9712d2.f175450h = y24Var;
            y24Var.f472258d = jSONObject.optString("reqUrl", "");
            c12965xc9712d2.f175450h.f472259e = jSONObject.optString("reqBody", "");
            c12965xc9712d2.f175450h.f472260f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(jSONObject.optString("cgiCmdId", ""), 0);
            c12965xc9712d2.f175450h.f472262h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(jSONObject.optString(ya.b.f77491x8758c4e1, ""), 0);
            c12965xc9712d2.f175451i = jSONObject.optBoolean("is_security_check", false);
            java.lang.String optString = jSONObject.optString("debug_env", "");
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c && (c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274587b, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(optString), com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.n0.class)) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "getTransferDebugIPSync key: %s, result: %s", optString, c10756x2a5d7b2d.f149939d);
                str3 = c10756x2a5d7b2d.f149939d;
            }
            if (str3 == null) {
                str3 = "";
            }
            c12965xc9712d2.f175457r = str3;
            c12965xc9712d2.f175447e = "weixin://resourceid/TopStories/";
            try {
                java.lang.String optString2 = jSONObject.optString("header", "");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString2);
                    java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        java.lang.String next = keys.next();
                        java.lang.String optString3 = jSONObject2.optString(next, "");
                        r45.cw3 cw3Var = new r45.cw3();
                        cw3Var.f453393d = next;
                        cw3Var.f453394e = optString3;
                        c12965xc9712d2.f175450h.f472261g.push(cw3Var);
                    }
                }
            } catch (java.lang.Exception e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryWebViewJSApi", e27, "TopStoryTransfer extTransfer parseTransferRequestInfo exception", new java.lang.Object[0]);
            }
        } catch (java.lang.Exception e28) {
            e17 = e28;
            str3 = c12965xc9712d2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "TopStoryTransfer extTransfer", new java.lang.Object[0]);
            c12965xc9712d2 = str3;
            ((js1.m) ((zq1.f0) gm0.j1.s(zq1.f0.class))).c(c12965xc9712d2, new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.o0(this, str2));
        }
        ((js1.m) ((zq1.f0) gm0.j1.s(zq1.f0.class))).c(c12965xc9712d2, new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.o0(this, str2));
    }

    @android.webkit.JavascriptInterface
    /* renamed from: fetchNumReddot */
    public java.lang.String m72307x254c1ca4(java.lang.String str) {
        r45.qn6 qn6Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl fetchNumReddot %s", str);
        try {
            int s17 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().s();
            r45.qn6 r17 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().r();
            om4.p wi6 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi();
            synchronized (wi6.f427969d) {
                qn6Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(wi6.f427969d) ? null : (r45.qn6) wi6.f427969d.getFirst();
            }
            r(qn6Var.f465646d, r17.f465646d, qn6Var.f465659t, r17.f465659t, s17, r17.f465660u);
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: fetchReddot */
    public java.lang.String m72308x1e633672(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl fetchReddot %s", str);
        try {
            r45.qn6 qn6Var = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().f427967b;
            if (qn6Var != null) {
                s(qn6Var.f465646d, qn6Var.f465654o, qn6Var.f465651i);
            }
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: fetchSearchConfig */
    public void m72309xd080ae4(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "FetchSearchConfig invoked");
        su4.o2.f(null, yc1.p.f77525x366c91de, 0L, null, true);
    }

    @android.webkit.JavascriptInterface
    /* renamed from: fetchUniformReddot */
    public java.lang.String m72310x67bccd52(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "fetchUniformReddot() called with: params = [" + str + "]");
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                w(new org.json.JSONObject(str).optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, ""));
            }
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "fetchUniformReddot  exception", new java.lang.Object[0]);
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: fetchUniformReddotList */
    public java.lang.String m72311x7735f910(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "fetchUniformReddot() called with: params = [" + str + "]");
        try {
            tm4.a aVar = new tm4.a();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                org.json.JSONArray optJSONArray = new org.json.JSONObject(str).optJSONArray("pathList");
                new java.util.ArrayList();
                if (optJSONArray != null) {
                    for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                        aVar.j().add(cn4.a.f125210a.a(optJSONArray.getJSONObject(i17).getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714)));
                    }
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.d0(this, aVar));
            }
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "fetchUniformReddotList  exception", new java.lang.Object[0]);
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getSearchData */
    public java.lang.String m72312xc3e06d68(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "getSearchData %s", str);
        if (o() != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j) o()).W = true;
        }
        long c17 = c01.id.c();
        r45.in6 in6Var = this.f256753g;
        wm4.u.b(in6Var, "getSearchData", c17);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            r45.in6 in6Var2 = new r45.in6();
            java.util.LinkedList linkedList = in6Var2.f458723o;
            in6Var2.f458724p = in6Var.f458724p;
            in6Var2.f458719h = jSONObject.optString("query", "");
            in6Var2.f458718g = jSONObject.optInt("offset", 0);
            in6Var2.f458720i = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 21);
            in6Var2.f458716e = jSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "");
            in6Var2.f458717f = jSONObject.optString("subSessionId", "");
            in6Var2.f458715d = jSONObject.optString("searchId", "");
            in6Var2.f458722n = jSONObject.optString("requestId", "");
            in6Var2.f458727s = jSONObject.optInt("tagId", 0);
            in6Var2.f458728t = jSONObject.optString("navigationId", "");
            in6Var2.f458731w = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.b();
            in6Var2.D = jSONObject.optBoolean("directRequest", false);
            in6Var2.B = jSONObject.optString("homeMsgId", "");
            in6Var2.C = jSONObject.optString("redPointMsgId", "");
            java.lang.String optString = jSONObject.optString("extReqParams", "");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                org.json.JSONArray jSONArray = new org.json.JSONArray(optString);
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i17);
                    r45.x50 x50Var = new r45.x50();
                    x50Var.f471321d = jSONObject2.optString("key", "");
                    x50Var.f471322e = jSONObject2.optInt("uintValue", 0);
                    x50Var.f471323f = jSONObject2.optString("textValue", "");
                    linkedList.add(x50Var);
                }
            }
            java.util.LinkedList linkedList2 = this.f256754h;
            if (linkedList2 != null && !linkedList2.isEmpty()) {
                linkedList.addAll(linkedList2);
            }
            if (((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().p0().size() > 0) {
                in6Var2.A = new r45.o33();
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d : ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().p0()) {
                    int i18 = c12886x91aa2b6d.f174579d;
                    if (i18 == 2 || i18 == 50) {
                        java.lang.String g17 = c12886x91aa2b6d.g("rawUrl", "");
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
                            if (!g17.startsWith("https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/s")) {
                                if (g17.startsWith("http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/s")) {
                                }
                            }
                            r45.p33 p33Var = new r45.p33();
                            p33Var.f464228d = g17;
                            in6Var2.A.f463399d.add(p33Var);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "add float ball url %s", g17);
                        }
                    }
                }
            }
            int h17 = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8.C20681x433a1d48());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "channelId = %s directRequest = %s preRequestMode = %s", java.lang.Integer.valueOf(in6Var2.f458727s), java.lang.Boolean.valueOf(in6Var2.D), java.lang.Integer.valueOf(h17));
            com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.j jVar = this.f256751e;
            if (h17 == 1) {
                jVar.d(in6Var2, true, in6Var2.D, o() == null ? 0 : ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j) o()).K);
            } else {
                if (h17 == 2) {
                    in6Var2.D = false;
                }
                java.lang.String c18 = jVar.c(in6Var2);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c18) || in6Var2.D) {
                    jVar.d(in6Var2, true, in6Var2.D, o() == null ? 0 : ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j) o()).K);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "use cache callback");
                    u(c18);
                }
            }
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "getSearchData", new java.lang.Object[0]);
            return f().toString();
        }
    }

    @Override // aw4.l
    @android.webkit.JavascriptInterface
    /* renamed from: getSearchDisplayNameList */
    public java.lang.String mo9181x4dbc1c2d(java.lang.String str) {
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(new org.json.JSONObject(str).optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306));
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                java.lang.String str2 = "";
                java.lang.String string = jSONObject.has(dm.i4.f66865x76d1ec5a) ? jSONObject.getString(dm.i4.f66865x76d1ec5a) : "";
                if (jSONObject.has("userName")) {
                    str2 = jSONObject.getString("userName");
                }
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                java.lang.String e17 = c01.a2.e(str2);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put(dm.i4.f66865x76d1ec5a, string);
                jSONObject2.put("userName", str2);
                jSONObject2.put("displayName", e17);
                jSONArray2.put(jSONObject2);
            }
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("ret", 0);
            jSONObject3.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONArray2.toString());
            return jSONObject3.toString();
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryWebViewJSApi", e18, "getSearchDisplayNameList", new java.lang.Object[0]);
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getTopStoryTabConfig */
    public java.lang.String m72313x22d471c1(java.lang.String str) {
        return su4.o2.d("topstoryTopTabParam").toString();
    }

    @android.webkit.JavascriptInterface
    /* renamed from: hideNavBarShadow */
    public java.lang.String m72314xe73db392(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl hideNavBarShadow %s", str);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j) o();
            jVar.getClass();
            jVar.f256519d.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.s(jVar));
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @Override // aw4.l
    public int k() {
        return 2;
    }

    public final void n(java.lang.String str, java.util.HashMap hashMap) {
        final java.lang.String a17 = nw4.x2.a(str, hashMap, false, "");
        this.f256752f.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.topstory.ui.webview.l$$d
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l.this;
                lVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.b.a(lVar, "wxadInvoke", a17);
            }
        });
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.a o() {
        av4.j jVar = this.f95859a;
        if (jVar != null) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.a) jVar;
        }
        return null;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: observeUniformReddot */
    public java.lang.String m72315xd0167230(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "observeUniformReddot() called with: params = [" + str + "]");
        try {
            org.json.JSONArray optJSONArray = new org.json.JSONObject(str).optJSONArray("paths");
            java.util.Set set = f256750m;
            if (optJSONArray != null) {
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    ((java.util.HashSet) set).add(optJSONArray.getString(i17));
                }
            } else {
                ((java.util.HashSet) set).clear();
            }
            ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).ij(((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j) o()).f256519d, this.f256757k);
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "observeUniformReddot  exception", new java.lang.Object[0]);
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: onWebPageUrlExposed */
    public void m72316x488aa4f5(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("urlList");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int optInt = jSONObject.optInt("bizType", 0);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int length = optJSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                    if (optJSONObject != null) {
                        java.lang.String optString = optJSONObject.optString("url", "");
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                            zq1.i0 i0Var = new zq1.i0();
                            i0Var.f556516a = optString;
                            i0Var.f556524i = optJSONObject.optString("extInfo", "");
                            i0Var.f556518c = 213;
                            i0Var.f556525j = optJSONObject.optInt("bizScene", 0);
                            i0Var.f556517b = optJSONObject.optString("prefetchId", "");
                            arrayList.add(i0Var);
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "onWebPageUrlExposed bizType: %s, preAuthInfoList size: %s", java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(arrayList.size()));
                if (arrayList.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TopStory.TopStoryWebViewJSApi", "onWebPageUrlExposed preAuthList is empty");
                    return;
                } else if (optInt == 1) {
                    ((yq1.x0) ((zq1.m0) gm0.j1.s(zq1.m0.class))).i(arrayList);
                    return;
                } else {
                    ((yq1.x0) ((zq1.m0) gm0.j1.s(zq1.m0.class))).h(arrayList);
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TopStory.TopStoryWebViewJSApi", "onWebPageUrlExposed url list is empty");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "onWebPageUrlExposed exception", new java.lang.Object[0]);
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: openProfileWithOpenId */
    public java.lang.String m72317xc73d92ca(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "openProfileWithOpenId %s", str);
        try {
            java.lang.String string = new org.json.JSONObject(str).getString("openId");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                android.content.Context p17 = p();
                o11.g gVar = wm4.u.f528842a;
                sm4.d dVar = new sm4.d(string);
                gm0.j1.d().a(2830, new wm4.w(dVar, p17));
                gm0.j1.d().g(dVar);
            }
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x015e A[Catch: Exception -> 0x01f2, TryCatch #2 {Exception -> 0x01f2, blocks: (B:3:0x001f, B:11:0x0047, B:12:0x01e9, B:16:0x005e, B:20:0x0088, B:32:0x00ae, B:34:0x00b9, B:23:0x00c6, B:25:0x015e, B:26:0x0164, B:28:0x016a, B:30:0x0196, B:38:0x00c0, B:41:0x01a3), top: B:2:0x001f, inners: #1 }] */
    @android.webkit.JavascriptInterface
    /* renamed from: openSearchWebView */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m72318xf159c727(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l.m72318xf159c727(java.lang.String):java.lang.String");
    }

    @android.webkit.JavascriptInterface
    /* renamed from: openWeAppPage */
    public java.lang.String m72319x114daa78(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "openWeAppPage %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
            c12559xbdae8559.f169323f = 1115;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).aj(((lf0.f0) ((pm4.u) i95.n0.c(pm4.u.class))).wi(), jSONObject.getString("userName"), jSONObject.getString("appid"), jSONObject.optInt("debugMode", 0), 0, jSONObject.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714), c12559xbdae8559);
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "openWeAppPage", new java.lang.Object[0]);
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: openWowColikeSetting */
    public java.lang.String m72320xd0057ad8(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "openWowColikeSetting %s", str);
        try {
            wm4.u.t(((lf0.f0) ((pm4.u) i95.n0.c(pm4.u.class))).wi(), "normal");
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "openWowColikeSetting", new java.lang.Object[0]);
            return f().toString();
        }
    }

    public final android.content.Context p() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 abstractActivityC16711x120e7ae0;
        return (o() == null || (abstractActivityC16711x120e7ae0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j) o()).f256519d) == null) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : abstractActivityC16711x120e7ae0;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: postComments */
    public java.lang.String m72321xb8d43ab4(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl postComments %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            this.f256751e.getClass();
            gm0.j1.d().g(new sm4.f(jSONObject));
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: preloadLiteApp */
    public java.lang.String m72322xfcc6684a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "preloadLiteApp() called with: params = [" + str + "]");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("appId");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "preloadLiteApp fail. appId is null");
                return f().toString();
            }
            if (jSONObject.optBoolean("onlyUpdate", false)) {
                if (((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj(optString) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "preloadLiteApp update success.");
                    return g().toString();
                }
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj(optString, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "preloadLiteApp update success.");
                return g().toString();
            }
            if (jSONObject.optBoolean("onlyDownload", false)) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj(optString, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "preloadLiteApp download success.");
                return g().toString();
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Qj(p(), optString, jSONObject.has(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714) ? jSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714) : "", jSONObject.optBoolean("onlyPreLoadBaseLib", false) ? "updateBaseLibPath" : "preloadLiteApp");
            return g().toString();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "observeUniformReddot  exception", new java.lang.Object[0]);
            return f().toString();
        }
    }

    public final void q(java.lang.String str, boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "notifyJsEvent, fun = %s, granted = %s, dialogShowed = %s.", str, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.c0(this, z17, z18, str));
    }

    @android.webkit.JavascriptInterface
    /* renamed from: queryWebCommCgi */
    public java.lang.String m72323xaf232ecd(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl queryWebCommCgi %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("requestId", "");
            java.lang.String optString2 = jSONObject.optString("commReq", "");
            this.f256751e.getClass();
            gm0.j1.d().g(new sm4.a(optString, optString2));
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    public void r(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, java.lang.String str3) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("beginMsgId", str);
            jSONObject.put("endMsgId", str2);
            jSONObject.put("beginSeq", i17);
            jSONObject.put("endSeq", i18);
            jSONObject.put("reddotNum", i19);
            jSONObject.put("extInfo", str3);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.h0(this, jSONObject));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "notifyNumReddotChange " + e17.getMessage());
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: renderFinish */
    public java.lang.String m72324x156bb1c9(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "renderFinish %s", str);
        try {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j) o()).u();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "renderFinish error", new java.lang.Object[0]);
        }
        return g().toString();
    }

    public void s(java.lang.String str, long j17, int i17) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("msgId", str);
            jSONObject.put("latestTimeStamp", j17);
            jSONObject.put("reddotType", i17);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.i0(this, jSONObject));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "notifyReddot " + e17.getMessage());
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: searchDataHasResult */
    public java.lang.String m72325x27a0d605(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "searchDataHasResult %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int optInt = jSONObject.optInt("tagId", 0);
            int optInt2 = jSONObject.optInt("resultCount", 0);
            if (pm4.w.l(optInt)) {
                if (optInt2 > 0) {
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TOP_STORY_HAS_HAOKAN_RESULT_INT, 1);
                } else {
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TOP_STORY_HAS_HAOKAN_RESULT_INT, 0);
                }
            }
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "searchDataHasResult", new java.lang.Object[0]);
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: setComments */
    public java.lang.String m72326x52aa7c76(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl setComments %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            this.f256751e.getClass();
            gm0.j1.d().g(new sm4.j(jSONObject));
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: shareImage */
    public java.lang.String m72327x94347cbc(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl shareImage %s", str);
        try {
            java.lang.String optString = new org.json.JSONObject(str).optString("imagePath");
            if (android.text.TextUtils.isEmpty(optString)) {
                return f().toString();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 abstractActivityC16711x120e7ae0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j) o()).f256519d;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) abstractActivityC16711x120e7ae0, 1, false);
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.q(this);
            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.r(this, abstractActivityC16711x120e7ae0, optString);
            k0Var.f293387d = new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.s(this);
            k0Var.v();
            return g().toString();
        } catch (java.lang.Throwable unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: showNavBarShadow */
    public java.lang.String m72328xb864f0cd(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl showNavBarShadow %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String string = jSONObject.getString("color");
            java.lang.String substring = string.substring(1, string.length());
            int i17 = (int) (jSONObject.getDouble("alpha") * 255.0d);
            int parseInt = java.lang.Integer.parseInt(substring, 16);
            com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j) o();
            jVar.getClass();
            jVar.f256519d.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.r(jVar, parseInt, i17));
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: stage */
    public java.lang.String m72329x68ac2fe(java.lang.String str) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "stage %s", str);
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.keys() != null) {
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    long optLong = jSONObject.optLong(next);
                    r45.in6 in6Var = this.f256753g;
                    if (optLong < 0) {
                        wm4.u.b(in6Var, next, c01.id.c());
                    } else {
                        wm4.u.b(in6Var, next, optLong);
                    }
                }
            }
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "stage", new java.lang.Object[0]);
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: startSearchItemDetailPage */
    public java.lang.String m72330xd056593d(java.lang.String str) {
        boolean z17;
        android.content.Intent intent;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "startSearchItemDetailPage %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("jumpUrl", "");
            java.lang.String optString2 = jSONObject.optString("publishId", "");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("KPublisherId", optString2);
            intent2.putExtra("srcUsername", jSONObject.optString("srcUserName"));
            intent2.putExtra("geta8key_scene", 64);
            int optInt = jSONObject.optInt("openScene", 10000);
            int optInt2 = jSONObject.optInt("subScene", -1);
            int optInt3 = jSONObject.optInt("itemType", -1);
            intent2.putExtra(com.p314xaae8f345.mm.ui.w2.f292730j, optInt3);
            intent2.putExtra("KWebPrefetcherId", jSONObject.optString("prefetchId", ""));
            zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
            int currentTimeMillis = ((int) java.lang.System.currentTimeMillis()) / 1000;
            ((yq1.z) a0Var).getClass();
            java.lang.String a17 = ot0.g0.a(optString, optInt, optInt2, currentTimeMillis);
            intent2.putExtra("rawUrl", a17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "jump url = %s, publishId = %s", a17, optString2);
            if (optInt3 == 5) {
                android.os.Bundle bundle = new android.os.Bundle();
                ((qv.i) ((rv.q2) i95.n0.c(rv.q2.class))).getClass();
                ot0.l1 l1Var = new ot0.l1();
                l1Var.f430135m = jSONObject.optString("srcUserName");
                l1Var.f430136n = jSONObject.optString("srcDisplayName");
                ot0.s0 s0Var = l1Var.f430139q;
                s0Var.f430295e = a17;
                s0Var.f430294d = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                l1Var.f430139q.f430302n = jSONObject.optString("digest");
                l1Var.f430139q.f430299i = jSONObject.optString("cover");
                ot0.s0 s0Var2 = l1Var.f430139q;
                s0Var2.f430303o = optInt3;
                s0Var2.f430298h = jSONObject.optInt("pubTime");
                l1Var.f430139q.f430307q = jSONObject.optInt("duration");
                l1Var.f430139q.E = jSONObject.optInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15530xe0ce1e4b);
                l1Var.f430139q.F = jSONObject.optInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15529x1f26b122);
                l1Var.f430139q.G = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54503x6397ab9d);
                l1Var.b(bundle);
                intent2.putExtras(bundle);
                z17 = true;
            } else {
                z17 = false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "openScene:%s, subScene:%s, itemType:%s", java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(optInt2), java.lang.Integer.valueOf(optInt3));
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.e(7)) {
                intent = intent2;
                if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).E(((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j) o()).f256519d, a17, optInt3, z17, optInt, optInt2, intent2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "startSearchItemDetailPage jump to TmplWebview");
                    return g().toString();
                }
            } else {
                intent = intent2;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "startSearchItemDetailPage jump to WebViewUI");
            j45.l.j(((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j) o()).f256519d, "webview", ".ui.tools.WebViewUI", intent, null);
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "reportSearchRealTimeReport", new java.lang.Object[0]);
            return f().toString();
        }
    }

    public void t(java.lang.String str) {
        r45.in6 in6Var = this.f256753g;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("state", str);
            jSONObject.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, in6Var.f458716e);
            jSONObject.put("subSessionId", in6Var.f458717f);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, in6Var.f458720i);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.x(this, jSONObject));
        } catch (java.lang.Exception unused) {
        }
    }

    public void u(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("json", str);
            jSONObject.put("newQuery", this.f256756j);
            jSONObject.put("isCache", false);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.g0(this, jSONObject));
        } catch (java.lang.Exception unused) {
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: updateNumReddot */
    public java.lang.String m72331x8edecb75(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl updateNumReddot %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().k("", jSONObject.getLong("latestTimeStamp"), false, jSONObject.getInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54497x63979feb), true);
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "lxl updateNumReddot", new java.lang.Object[0]);
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: updateReddotTimeStamps */
    public java.lang.String m72332xd9c5465e(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "updateReddotTimeStamps %s", str);
        try {
            ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().J(new org.json.JSONObject(str).optLong("reddotTimeStamps", 0L));
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "updateReddotTimeStamps", new java.lang.Object[0]);
            return f().toString();
        }
    }

    public void v(java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "onTabSelected: %s, %s, %s, %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("tabInfo", str);
            jSONObject.put("contentReddot", i17);
            jSONObject.put("numberReddot", i18);
            jSONObject.put("msgId", str2);
            jSONObject.put("isByScroll", z17);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TopStory.TopStoryWebViewJSApi", "onTabSelected json exception: " + e17.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.b.a(this, "onTabSelected", jSONObject.toString());
    }

    public void w(java.lang.String str) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "onUniformReddotDataChanged() called with: path = [" + str + "]");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.f0(this, cn4.a.f125210a.a(str)));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "onUniformReddotDataChanged  exception", new java.lang.Object[0]);
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: webViewUIReady */
    public java.lang.String m72333x1b210d36(java.lang.String str) {
        r45.in6 in6Var = this.f256753g;
        try {
            if (this.f256756j) {
                this.f256756j = false;
                if (o() != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j) o();
                    jVar.X = true;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.p(jVar));
                }
                wm4.u.b(in6Var, "webViewUIReady", c01.id.c());
                if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8.C20680x69c2c23d()) == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", wm4.u.x(in6Var));
                }
            }
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: wxadInvoke */
    public void m72334x974ff45c(java.lang.String func, java.lang.String msg, final java.lang.String callbackId) {
        char c17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "invoke: func:%s, msg:%s, callbackId:%s", func, msg, callbackId);
        if (!f256749l.contains(func)) {
            android.content.Context p17 = p();
            mf0.b0 b0Var = this.f256755i;
            ((aa5.a) b0Var).f84223a.f422422c = p17;
            com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.y yVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.y(this);
            aa5.a aVar = (aa5.a) b0Var;
            aVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(func, "func");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackId, "callbackId");
            aVar.f84223a.c(nw4.z2.c(func, msg, callbackId), yVar);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "doFunc,func:%s,msg:%s,callbackId:%s", func, msg, callbackId);
        func.getClass();
        int hashCode = func.hashCode();
        if (hashCode == -1150858339) {
            if (func.equals("launchApplication")) {
                c17 = 0;
            }
            c17 = 65535;
        } else if (hashCode != -411577899) {
            if (hashCode == 1538465865 && func.equals("openWeApp")) {
                c17 = 2;
            }
            c17 = 65535;
        } else {
            if (func.equals("openFinderView")) {
                c17 = 1;
            }
            c17 = 65535;
        }
        if (c17 == 0) {
            ((uz.e2) ((vz.p1) i95.n0.c(vz.p1.class))).wi(p(), new org.json.JSONObject(msg), new vz.o1() { // from class: com.tencent.mm.plugin.topstory.ui.webview.l$$a
                @Override // vz.o1
                public final void d(int i17, java.lang.String str) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l.this;
                    lVar.getClass();
                    java.util.HashMap hashMap = new java.util.HashMap(1);
                    if (i17 == 0) {
                        hashMap.put("err_msg", "launchApplication:ok");
                    } else {
                        hashMap.put("err_msg", "launchApplication:fail." + str);
                    }
                    lVar.n(callbackId, hashMap);
                }
            });
            return;
        }
        if (c17 == 1) {
            final java.util.HashMap hashMap = new java.util.HashMap(2);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f542005a.F(p(), msg, new zy2.i5() { // from class: com.tencent.mm.plugin.topstory.ui.webview.l$$b
                @Override // zy2.i5
                public final void a(java.lang.Object obj) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "retMsg:%s", obj.toString());
                    if (obj.getClass() == android.util.Pair.class) {
                        android.util.Pair pair = (android.util.Pair) obj;
                        int intValue = ((java.lang.Integer) pair.first).intValue();
                        java.lang.String str = (java.lang.String) pair.second;
                        java.util.HashMap hashMap2 = hashMap;
                        if (intValue == 0) {
                            hashMap2.put("err_msg", "openFinderView:ok");
                            hashMap2.put("feed_read_info", str);
                        } else {
                            hashMap2.put("err_msg", "openFinderViewfail,retCode:" + intValue);
                        }
                    }
                }
            }, null);
            if (hashMap.size() < 1) {
                hashMap.put("err_msg", "openFinderView:ok");
            }
            n(callbackId, hashMap);
            return;
        }
        if (c17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TopStory.TopStoryWebViewJSApi", "func:%s not found", func);
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(msg);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
        android.content.Context p18 = p();
        am.nx nxVar = c6113xa3727625.f136390g;
        nxVar.f89004f = p18;
        nxVar.f88999a = jSONObject.optString("userName");
        nxVar.f89006h = jSONObject.optString("appId");
        nxVar.f89000b = jSONObject.optString("relativeURL");
        nxVar.f89007i = jSONObject.optInt("appVersion", 0);
        nxVar.f89002d = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1238);
        nxVar.f89003e = jSONObject.optString("sceneNote");
        nxVar.f89009k = jSONObject.optString("downloadURL");
        nxVar.f89001c = jSONObject.optInt("openType", 0);
        nxVar.f89010l = jSONObject.optString("checkSumMd5");
        nxVar.f89012n = false;
        nxVar.f89013o.f151950f = jSONObject.optString("extJsonInfo");
        nxVar.A = jSONObject.optString("privateExtraData");
        nxVar.E = jSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
        java.lang.String optString = jSONObject.optString("adUxInfo");
        nxVar.B = optString;
        if (android.text.TextUtils.isEmpty(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TopStory.TopStoryWebViewJSApi", "doOpenWeApp param lose adUxInfo");
        } else {
            qp3.a.c("WebViewUI", "openWeApp", nxVar.B, "topStory");
        }
        c6113xa3727625.e();
        java.util.HashMap hashMap2 = new java.util.HashMap(1);
        am.ox oxVar = c6113xa3727625.f136391h;
        if (oxVar.f89114a) {
            hashMap2.put("err_msg", "openWeApp:ok");
        } else {
            java.lang.String str = oxVar.f89115b;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            hashMap2.put("err_msg", "openWeApp:fail:".concat(str));
        }
        n(callbackId, hashMap2);
    }
}
