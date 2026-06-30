package o44;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f424391a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f424392b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 f424393c;

    /* renamed from: d, reason: collision with root package name */
    public final f54.p f424394d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.C17730x4c10861f f424395e;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 activityC18007x6d5e9773, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.C17730x4c10861f c17730x4c10861f, f54.p pVar) {
        this.f424393c = activityC18007x6d5e9773;
        this.f424395e = c17730x4c10861f;
        this.f424394d = pVar;
    }

    public org.json.JSONArray a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCardCompStatJsonStr", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject b17 = b(1, false);
        if (b17 != null) {
            jSONArray.put(b17);
        }
        org.json.JSONObject b18 = b(2, false);
        if (b18 != null) {
            jSONArray.put(b18);
        }
        org.json.JSONObject b19 = b(1, true);
        if (b19 != null) {
            jSONArray.put(b19);
        }
        org.json.JSONObject b27 = b(2, true);
        if (b27 != null) {
            jSONArray.put(b27);
        }
        org.json.JSONObject b28 = b(4, false);
        if (b28 != null) {
            jSONArray.put(b28);
        }
        if (jSONArray.length() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardCompStatJsonStr", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
            return jSONArray;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardCompStatJsonStr", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        return null;
    }

    public final org.json.JSONObject b(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCardStatInfo", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        o44.a aVar = (o44.a) this.f424391a.get(c(i17, z17));
        org.json.JSONObject jSONObject = null;
        if (aVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardStatInfo", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toJsonObject", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper$CardStatInfo");
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HBCardStatistics", "toJsonObject exp=" + e17.toString());
        }
        if (aVar.f424387c > 0) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("subType", aVar.f424385a);
            jSONObject2.put("isDoubleCard", aVar.f424386b ? 1 : 0);
            int i18 = aVar.f424387c;
            if (i18 > 0) {
                jSONObject2.put("expCnt", i18);
            }
            int i19 = aVar.f424388d;
            if (i19 > 0) {
                jSONObject2.put("btnClkCnt", i19);
            }
            int i27 = aVar.f424389e;
            if (i27 > 0) {
                jSONObject2.put("linkClkCnt", i27);
            }
            if (aVar.f424385a != 1) {
                java.lang.String str = aVar.f424390f;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str == null) {
                    str = "";
                }
                jSONObject2.put("giveCardId", str);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toJsonObject", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper$CardStatInfo");
            jSONObject = jSONObject2;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardStatInfo", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
            return jSONObject;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toJsonObject", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper$CardStatInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardStatInfo", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        return jSONObject;
    }

    public final java.lang.String c(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getKey", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(z17 ? "3" : "");
        sb6.append(i17);
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getKey", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        return sb7;
    }

    public void d(int i17, boolean z17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCardBtnClick", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        java.lang.String c17 = c(i17, z17);
        java.util.HashMap hashMap = this.f424391a;
        o44.a aVar = (o44.a) hashMap.get(c17);
        if (aVar == null) {
            aVar = new o44.a(this);
            aVar.f424386b = z17;
            aVar.f424385a = i17;
            aVar.f424390f = this.f424394d.F;
            hashMap.put(c17, aVar);
        }
        if (i18 != 3) {
            aVar.f424388d++;
        } else {
            aVar.f424389e++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.C17730x4c10861f c17730x4c10861f = this.f424395e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adChannelClickReport", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        try {
            ab4.n0 A7 = this.f424393c.A7();
            java.lang.String j17 = A7.j();
            java.lang.String o17 = A7.o();
            int l17 = A7.l();
            java.lang.String e17 = A7.e();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (j17 == null) {
                j17 = "";
            }
            jSONObject.put("snsid", j17);
            if (o17 == null) {
                o17 = "";
            }
            jSONObject.put("uxinfo", o17);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, l17);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("btnType", i18);
            if (e17 == null) {
                e17 = "";
            }
            jSONObject2.put("canvasId", e17);
            c17730x4c10861f.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTwistCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            java.lang.String str = c17730x4c10861f.f244270x;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTwistCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            jSONObject2.put("twistCardId", str);
            org.json.JSONObject V = c17730x4c10861f.V();
            if (V != null) {
                jSONObject2.put("hbCard", V);
            }
            jSONObject.put("extInfo", jSONObject2);
            ca4.m0.a("canvas_hb_card_btn_click", jSONObject.toString());
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HBCardStatistics", "reportShakeActionResult, exp=" + e18.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adChannelClickReport", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCardBtnClick", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
    }

    public void e(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCardExposure", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        java.lang.String c17 = c(i17, z17);
        java.util.HashMap hashMap = this.f424391a;
        o44.a aVar = (o44.a) hashMap.get(c17);
        if (aVar == null) {
            aVar = new o44.a(this);
            aVar.f424386b = z17;
            aVar.f424385a = i17;
            aVar.f424390f = this.f424394d.F;
            hashMap.put(c17, aVar);
        }
        aVar.f424387c++;
        this.f424392b++;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCardExposure", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
    }
}
