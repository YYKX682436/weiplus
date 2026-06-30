package b64;

/* loaded from: classes4.dex */
public class u extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String optString;
        java.lang.String str2;
        int optInt;
        int optInt2;
        int optInt3;
        java.lang.String optString2;
        java.lang.String optString3;
        int optInt4;
        int optInt5;
        java.lang.String optString4;
        boolean optBoolean;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiOpenAdCanvas");
        try {
            optString = jSONObject.optString("canvasId");
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            str2 = "";
            if (optString == null) {
                optString = "";
            }
            java.lang.String optString5 = jSONObject.optString("uxInfo");
            if (optString5 != null) {
                str2 = optString5;
            }
            optInt = jSONObject.optInt("preLoad", 0);
            optInt2 = jSONObject.optInt("noStore", 0);
            optInt3 = jSONObject.optInt("openFirstSightVoice", 0);
            optString2 = jSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
            optString3 = jSONObject.optString("adInfoXml");
            optInt4 = jSONObject.optInt("fromOuterIndex");
            optInt5 = jSONObject.optInt(ya.b.f77502x92235c1b, 31);
            optString4 = jSONObject.optString("canvasDynamicInfo");
            optBoolean = jSONObject.optBoolean("halfPage", false);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiteAppJsApiOpenAdCanvas", th6, "open ad canvas", new java.lang.Object[0]);
        }
        if (this.f224976f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiOpenAdCanvas", "the invokeCallback is null!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiOpenAdCanvas");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiOpenAdCanvas", "data not has key canvasId");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1706, 26);
            this.f224976f.a("canvasId is null or nil");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiOpenAdCanvas");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1706, 27);
        if (!android.text.TextUtils.isEmpty(str2)) {
            ca4.m0.B(str2);
        } else if (!android.text.TextUtils.isEmpty(optString3)) {
            str2 = ca4.m0.Q(optString3);
        }
        java.lang.String str3 = str2;
        boolean z19 = true;
        if (optInt == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiOpenAdCanvas", "do preload");
            ((p34.t) ((p94.g0) i95.n0.c(p94.g0.class))).Ai(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(optString), str3, optString4, false, false);
        } else {
            java.lang.Object c17 = c();
            if (c17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiOpenAdCanvas", "the context is null ");
                this.f224976f.a("the context is null!!");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiOpenAdCanvas");
                return;
            }
            p94.v0 v0Var = new p94.v0();
            v0Var.f434446a = optBoolean;
            if (c17 instanceof m54.x) {
                boolean optBoolean2 = jSONObject.optBoolean("openInHalfScreen", false);
                m54.l u47 = ((m54.x) c17).u4();
                if (u47 != null) {
                    v0Var.f434446a = u47.s() && optBoolean2;
                    v0Var.f434447b = u47.s();
                    v0Var.f434449d = u47.r();
                }
            }
            v0Var.f434452g = optString4;
            v0Var.f434450e = optInt5;
            if (optInt3 != 1) {
                z19 = false;
            }
            v0Var.f434453h = z19;
            v0Var.f434451f = optString2;
            v0Var.f434454i = optInt2;
            v0Var.f434455j = optInt4;
            ((p34.t) ((p94.g0) i95.n0.c(p94.g0.class))).wi(c(), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(optString), str3, v0Var);
        }
        this.f224976f.d(false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiOpenAdCanvas");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("runModel", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiOpenAdCanvas");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("runModel", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiOpenAdCanvas");
        return 1;
    }
}
