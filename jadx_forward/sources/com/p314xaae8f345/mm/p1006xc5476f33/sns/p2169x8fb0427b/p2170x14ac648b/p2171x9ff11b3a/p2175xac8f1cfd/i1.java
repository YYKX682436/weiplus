package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public class i1 implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ab4.v0 f246784a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.animation.ObjectAnimator f246785b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.v0 f246786c;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.v0 v0Var, ab4.v0 v0Var2, android.animation.ObjectAnimator objectAnimator) {
        this.f246786c = v0Var;
        this.f246784a = v0Var2;
        this.f246785b = objectAnimator;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.y1
    public void a(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPageStarted", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingNewH5Comp", "onPageStarted, cid is " + this.f246786c.z());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPageStarted", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.y1
    public boolean b(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("closeWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("closeWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.y1
    public boolean c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleUrlLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleUrlLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x1
    /* renamed from: callback */
    public boolean mo70210xf5bc2045(int i17, android.os.Bundle bundle) {
        boolean z17;
        org.json.JSONObject jSONObject;
        java.lang.String optString;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingNewH5Comp", "callback, actionCode=" + i17);
        final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.v0 v0Var = this.f246786c;
        switch (i17) {
            case 150:
                ab4.v0 v0Var2 = (ab4.v0) v0Var.y();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69992xb2e1e958(v0Var2.F, v0Var.u().o(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69855x1047b632(), bundle.getInt("sns_landing_pages_ad_vote_index"), 0, bundle.getString("sns_landing_pages_ad_vote_result"));
                break;
            case 151:
                try {
                    android.content.Intent intent = new android.content.Intent();
                    java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.b(bundle.getString("sns_landing_pages_ad_jumpurl"), "traceid=" + v0Var.u().m(), "aid=" + v0Var.u().c());
                    java.lang.String n17 = v0Var.u().n();
                    if (android.text.TextUtils.isEmpty(n17)) {
                        n17 = v0Var.u().o();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingNewH5Comp", "opJumpView, use orig_UxInfo:" + n17);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingNewH5Comp", "opJumpView, use updated_UxInfo:" + n17);
                    }
                    java.lang.String b18 = ca4.z0.b(b17, n17);
                    ca4.z0.c(intent, n17);
                    intent.putExtra("rawUrl", b18);
                    intent.putExtra("useJs", true);
                    intent.putExtra("type", -255);
                    ca4.z0.a(intent, 84);
                    j45.l.j(v0Var.f246582d, "webview", ".ui.tools.WebViewUI", intent, null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingNewH5Comp", "jumpUrl, finalUrl=" + b18);
                    break;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingNewH5Comp", "OptJump exp=" + e17.toString());
                    break;
                }
            case 152:
                java.lang.String string = bundle.getString("sns_landing_pages_h5_params");
                final java.lang.String string2 = bundle.getString("callbackId");
                v0Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingNewH5Comp", "handleJSAPI, params=" + string + ", callbackId=" + string2);
                    jSONObject = new org.json.JSONObject(string);
                    optString = jSONObject.optString("funcName");
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingNewH5Comp", "handleJSAPI, exp=" + th6.toString());
                }
                if ("opUpdateContentHeight".equals(optString)) {
                    int i18 = jSONObject.getInt("height");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adJuestHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.m1(v0Var, i18));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adJuestHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                } else {
                    if (!"opStartQRScan".equals(optString)) {
                        if ("opEndQRScan".equals(optString)) {
                            v0Var.c0(jSONObject.getString("scanUrl"), jSONObject.optInt("directJump"), jSONObject.optInt("syncQrImageDownload"), string2);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                        } else {
                            boolean equals = "opGetLocation".equals(optString);
                            yz5.q qVar = v0Var.D;
                            if (equals) {
                                java.lang.String optString2 = jSONObject.optString("type");
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleGeoLocation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                                eb4.s.c(string2, optString2, v0Var.f246582d, false, true, null, qVar);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleGeoLocation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                            } else if ("opGetDeviceInfo".equals(optString)) {
                                v0Var.X(string2);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                            } else if ("requestBindPhoneNumber".equals(optString)) {
                                v0Var.b0(string2, jSONObject);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                            } else {
                                boolean equals2 = "openWheelPicker".equals(optString);
                                android.content.Context context = v0Var.f246582d;
                                if (equals2) {
                                    fb4.e.a(context, string2, jSONObject, v0Var);
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                                } else if ("getCanAutoFillData".equals(optString)) {
                                    eb4.s.a(string2, qVar);
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                                } else if ("setCanAutoFillData".equals(optString)) {
                                    eb4.s.e(jSONObject.optString("status"), string2, qVar);
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                                } else {
                                    jz5.g gVar = eb4.g.f332419a;
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getJsapiMap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.AdJsApiPool");
                                    jz5.g gVar2 = eb4.g.f332419a;
                                    java.util.Map map = (java.util.Map) ((jz5.n) gVar2).mo141623x754a37bb();
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getJsapiMap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.AdJsApiPool");
                                    if (map.containsKey(optString)) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getJsapiMap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.AdJsApiPool");
                                        java.util.Map map2 = (java.util.Map) ((jz5.n) gVar2).mo141623x754a37bb();
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getJsapiMap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.AdJsApiPool");
                                        ((eb4.e) map2.get(optString)).a(jSONObject, context, new yz5.p() { // from class: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0$$a
                                            @Override // yz5.p
                                            /* renamed from: invoke */
                                            public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
                                                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.v0 v0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.v0.this;
                                                v0Var3.getClass();
                                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$handleJSAPI$0", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                                                java.util.HashMap hashMap = new java.util.HashMap((java.util.Map) obj2);
                                                v0Var3.Z(string2, (java.lang.String) obj, hashMap);
                                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$handleJSAPI$0", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                                                return jz5.f0.f384359a;
                                            }
                                        });
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                                    } else if ("opOpenFinderProfile".equals(optString)) {
                                        b54.e.d(context, string2, jSONObject, v0Var, v0Var.u());
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                                    } else if ("opFinderFollow".equals(optString)) {
                                        b54.e.c(string2, jSONObject, v0Var, v0Var.u());
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                                    } else if ("opQueryFinderFollowState".equals(optString)) {
                                        b54.e.e(string2, jSONObject, v0Var, v0Var.u());
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                                    } else if ("opJumpWeApp".equals(optString)) {
                                        v0Var.d0(string2, jSONObject);
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                                    } else {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingNewH5Comp", "handleJSAPI without processor! func=" + optString);
                                    }
                                }
                            }
                        }
                        z17 = true;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
                        return z17;
                    }
                    jSONObject.getString("scanUrl");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                z17 = false;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
                return z17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.y1
    public void d(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPageFinished", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPageFinished, cid is ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.v0 v0Var = this.f246786c;
        sb6.append(v0Var.z());
        sb6.append(", showLoadAnimation is ");
        ab4.v0 v0Var2 = this.f246784a;
        sb6.append(v0Var2 != null ? java.lang.Boolean.valueOf(v0Var2.f84435J) : "info is null");
        sb6.append(", mPageStartDisplay is ");
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.v0.O(v0Var));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingNewH5Comp", sb6.toString());
        if (v0Var2 != null && v0Var2.f84435J && !com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.v0.O(v0Var)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$102", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
            v0Var.f247091x = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$102", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
            this.f246785b.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPageFinished", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
    }
}
