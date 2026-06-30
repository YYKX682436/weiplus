package z43;

/* loaded from: classes8.dex */
public class a0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    public final void A(org.json.JSONObject jSONObject) {
        int parseColor;
        int parseColor2;
        java.lang.String optString = jSONObject.optString("url");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiOpenGameUrlWithExtraWebView", "url is null");
            this.f224976f.a("url is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiOpenGameUrlWithExtraWebView", "url: %s", optString);
        java.lang.String optString2 = jSONObject.optString("html");
        android.net.Uri parse = android.net.Uri.parse(optString);
        java.lang.String queryParameter = parse.getQueryParameter("not_in_game_luggage");
        android.os.Bundle bundle = new android.os.Bundle();
        if (queryParameter == null) {
            queryParameter = "";
        }
        if (queryParameter.equals("1") || !(parse.getHost() == null || parse.getHost().equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fxy)))) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", optString);
            j45.l.j(c(), "webview", ".ui.tools.WebViewUI", intent, null);
            this.f224976f.d(false);
            return;
        }
        java.lang.String optString3 = jSONObject.optString("statusBarColor");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
            parseColor = 0;
        } else {
            try {
                parseColor = android.graphics.Color.parseColor(optString3);
            } catch (java.lang.IllegalArgumentException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiOpenGameUrlWithExtraWebView", e17.getMessage());
                this.f224976f.a("invalid_color");
                return;
            }
        }
        java.lang.String optString4 = jSONObject.optString("statusBarStyle");
        java.lang.String optString5 = jSONObject.optString("preInjectData");
        bundle.putString("rawUrl", optString);
        bundle.putInt("customize_status_bar_color", parseColor);
        bundle.putString("status_bar_style", optString4);
        bundle.putString("game_pre_inject_data", optString5);
        java.lang.String optString6 = jSONObject.optString("halfScreenBackGroundColor");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString6)) {
            parseColor2 = 0;
        } else {
            try {
                parseColor2 = android.graphics.Color.parseColor(optString6);
            } catch (java.lang.IllegalArgumentException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiOpenGameUrlWithExtraWebView", e18.getMessage());
                this.f224976f.a("invalid_color");
                return;
            }
        }
        bundle.putInt("KHalfScreenBackGroundColor", parseColor2);
        try {
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("jumpInfo");
            org.json.JSONObject jSONObject3 = jSONObject2.getJSONObject("halfScreen");
            int i17 = jSONObject3.getInt("type");
            if (i17 == 1) {
                bundle.putString("rawUrl", jSONObject2.getString("jumpUrl"));
                bundle.putInt("KHalfScreenHeight", jSONObject3.getInt("screenHeightDp"));
                bundle.putFloat("KHalfScreenHeightPercent", -1.0f);
            } else if (i17 == 2) {
                bundle.putString("rawUrl", jSONObject2.getString("jumpUrl"));
                bundle.putInt("KHalfScreenHeight", 0);
                bundle.putFloat("KHalfScreenHeightPercent", (float) jSONObject3.getDouble("screenHeightPercent"));
            }
        } catch (org.json.JSONException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiteAppJsApiOpenGameUrlWithExtraWebView", e19, "JSONException", new java.lang.Object[0]);
        }
        bundle.putBoolean("shouldCheckLimitedMode", java.lang.Boolean.valueOf(jSONObject.optBoolean("shouldCheckLimitedMode", true)).booleanValue());
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            bundle.putString("game_open_html", optString2);
        }
        bundle.putLong("liteAppUuid", this.f224975e.f380557a);
        bundle.putLong("liteAppPageId", this.f224975e.f380559c);
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtras(bundle);
        j45.l.j(c(), "webview", ".ui.tools.WebViewUI", intent2, null);
        this.f224976f.d(false);
    }

    public final void B(final org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("liteAppInfo");
        boolean optBoolean = jSONObject.optBoolean("transParentLiteApp");
        java.lang.String optString = jSONObject.optString("preInjectData");
        java.lang.String optString2 = jSONObject.optString("halfScreenBackGroundColor");
        int i17 = 0;
        boolean z17 = jSONObject.optInt("forceOpenLiteApp", 1) != 0;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            try {
                i17 = android.graphics.Color.parseColor(optString2);
            } catch (java.lang.IllegalArgumentException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiOpenGameUrlWithExtraWebView", e17.getMessage());
                this.f224976f.a("invalid_color");
                return;
            }
        }
        final java.lang.String optString3 = jSONObject.optString("url");
        java.lang.String queryParameter = android.net.Uri.parse(optString3).getQueryParameter("wechat_pkgid");
        final android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("pkgId", queryParameter);
        bundle.putString("appId", str);
        bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, str2);
        bundle.putString("query", str3);
        if (optJSONObject != null) {
            bundle.putBoolean("forbidRightGesture", optJSONObject.optBoolean("isForbidRightGesture"));
        }
        bundle.putBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63, optBoolean);
        bundle.putBoolean("forceOpenLiteApp", z17);
        bundle.putString("preInjectData", optString);
        bundle.putInt("KHalfScreenBackGroundColor", i17);
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("jumpInfo");
        org.json.JSONObject optJSONObject3 = optJSONObject2 != null ? optJSONObject2.optJSONObject("halfScreen") : null;
        if (optJSONObject3 != null) {
            bundle.putBoolean("isHalfScreen", true);
            try {
                bundle.putDouble("heightPercent", optJSONObject3.getDouble("screenHeightPercent"));
            } catch (org.json.JSONException unused) {
            }
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.C15887xf290520(bundle), com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.s2.class, new com.p314xaae8f345.mm.p794xb0fa9b5e.r() { // from class: z43.a0$$b
            @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
            public final void a(java.lang.Object obj) {
                z43.a0 a0Var = z43.a0.this;
                a0Var.getClass();
                long j17 = ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898) obj).f149938d;
                org.json.JSONObject jSONObject2 = jSONObject;
                if (j17 < 0) {
                    a0Var.A(jSONObject2);
                    return;
                }
                android.os.Bundle bundle2 = bundle;
                if (j17 > 0) {
                    bundle2.putLong(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14344xf03a9130, j17);
                }
                com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80();
                c3708xc1f46f80.f14311x683188c = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.GAME;
                jd.c cVar = a0Var.f224975e;
                c3708xc1f46f80.f14312x721f2ec7 = cVar.f380558b;
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo pageInfo = cVar.f380564h;
                c3708xc1f46f80.f14313x6711cad1 = pageInfo != null ? pageInfo.f37292xd01aac60 : "";
                bundle2.putParcelable("liteappReferrerInfo", c3708xc1f46f80);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiOpenGameUrlWithExtraWebView", "checkLiteApp success");
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(a0Var.c(), bundle2, false, false, new z43.b0(a0Var, jSONObject2));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiOpenGameUrlWithExtraWebView", "openLiteApp update pkg");
                java.lang.Object obj2 = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.f270034a;
                java.lang.String a17 = kh0.i.a(optString3);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                    return;
                }
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(a17);
                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8.f.a(linkedList, 4);
            }
        });
    }

    @Override // jd.b
    public void a(java.lang.String str, final org.json.JSONObject jSONObject, boolean z17) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("liteAppInfo");
        if (optJSONObject != null) {
            java.lang.String optString = optJSONObject.optString("appId");
            java.lang.String optString2 = optJSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            java.lang.String optString3 = optJSONObject.optString("query");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiOpenGameUrlWithExtraWebView", "openInLiteApp appId is null");
                A(jSONObject);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiOpenGameUrlWithExtraWebView", "openInLiteApp, appId : %s, path : %s, query : %s", optString, optString2, optString3);
                B(jSONObject, optString, optString2, optString3);
                return;
            }
        }
        if (!jSONObject.optBoolean("openLiteIfMatchUrlLiteConf", false)) {
            A(jSONObject);
            return;
        }
        java.lang.String optString4 = jSONObject.optString("url");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiOpenGameUrlWithExtraWebView", "url is null");
            this.f224976f.a("fail");
        } else {
            final android.net.Uri parse = android.net.Uri.parse(optString4);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("url", optString4);
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.n2.class, new com.p314xaae8f345.mm.p794xb0fa9b5e.r() { // from class: z43.a0$$a
                @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
                public final void a(java.lang.Object obj) {
                    android.os.Bundle bundle2 = (android.os.Bundle) obj;
                    z43.a0 a0Var = z43.a0.this;
                    org.json.JSONObject jSONObject2 = jSONObject;
                    if (bundle2 == null) {
                        a0Var.A(jSONObject2);
                    } else {
                        a0Var.getClass();
                        a0Var.B(jSONObject2, bundle2.getString("appId"), bundle2.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714), parse.getQuery());
                    }
                }
            });
        }
    }
}
