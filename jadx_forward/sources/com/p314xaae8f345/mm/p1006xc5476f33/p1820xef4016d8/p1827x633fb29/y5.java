package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class y5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.x5 {
    public y5(java.lang.String str, int i17, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("ver", str);
        gm0.j1.i();
        hashMap.put("walletType", java.lang.String.valueOf(gm0.j1.u().c().l(339975, null)));
        hashMap.put("hasSource", "" + i17);
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "20");
        hashMap.put("union_source", "0");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str2)) {
            hashMap.put("chatroomUserCnt", ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str2) + "");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "NetSceneLuckyMoneyGetConfigUnion request");
        m66103xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.x5, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/unionhb/operationunionhb";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.x5, com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4605;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.x5, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o5
    /* renamed from: onGYNetEnd */
    public void mo66076x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "errCode: %s, errMsg: %s ，json：%s", java.lang.Integer.valueOf(i17), str, jSONObject.toString());
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "hongbao operation fail, errCode:" + i17 + ", errMsg:" + str);
            return;
        }
        this.f227231m = jSONObject.optInt("randomAmount");
        this.f227229h = jSONObject.optString("randomWishing");
        this.f227232n = jSONObject.optString("notice");
        this.f227233o = jSONObject.optString("notice_url");
        this.f227230i = jSONObject.optInt("hasCanShareHongBao") == 1;
        jSONObject.optInt(ya.b.f77474x50f1e011);
        this.f227234p = 1;
        this.f227235q = jSONObject.optString("currencyUint");
        this.f227236r = jSONObject.optString("currencyWording");
        this.f227237s = jSONObject.optString("unique_id");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "currency=" + this.f227234p + ";currencyUint=" + this.f227235q + ";currencyWording=" + this.f227236r + ";uniqueId=" + this.f227237s);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c1 c1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c1();
        c1Var.f226717f = jSONObject.optString("groupHint");
        c1Var.f226718g = jSONObject.optString("personalHint");
        c1Var.f226715d = jSONObject.optInt("totalNum", 100);
        c1Var.f226716e = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j(jSONObject.optString("totalAmount", "0"), "100", 2, java.math.RoundingMode.HALF_UP);
        c1Var.f226719h = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j(jSONObject.optString("perPersonMaxValue", "0"), "100", 2, java.math.RoundingMode.HALF_UP);
        c1Var.f226720i = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j(jSONObject.optString("perGroupMaxValue", "0"), "100", 2, java.math.RoundingMode.HALF_UP);
        c1Var.f226721m = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j(jSONObject.optString("perMinValue", "0"), "100", 2, java.math.RoundingMode.HALF_UP);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "config.maxTotalAmount: %s, config.perPersonMaxValue: %s，config.perGroupMaxValue：%s , config.perMinValue:%s", java.lang.Double.valueOf(c1Var.f226716e), java.lang.Double.valueOf(c1Var.f226719h), java.lang.Double.valueOf(c1Var.f226720i), java.lang.Double.valueOf(c1Var.f226721m));
        c1Var.f226722n = jSONObject.optInt("payShowBGFlag");
        c1Var.f226723o = this.f227234p;
        c1Var.f226724p = this.f227235q;
        c1Var.f226725q = this.f227236r;
        c1Var.f226726r = jSONObject.optString("foreignFaqUrl");
        c1Var.f226727s = jSONObject.optString("foreignHongBaoName");
        c1Var.f226728t = jSONObject.optString("showSourceAndMac");
        c1Var.f226729u = jSONObject.optString("coverinfo");
        java.lang.String optString = jSONObject.optString("cover_jumpaction");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "cover_jumpaction: %s", optString);
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString);
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.q0 q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.q0();
                q0Var.f227083d = jSONObject2.optBoolean("is_show");
                q0Var.f227084e = jSONObject2.optString("wording");
                q0Var.f227085f = jSONObject2.optString("icon_url");
                q0Var.f227088i = jSONObject2.optString("action_app_username");
                q0Var.f227086g = jSONObject2.optInt("action_type", 0);
                q0Var.f227087h = jSONObject2.optString("action_url");
                c1Var.f226731w = q0Var;
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", e17, "", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "foreignFaqUrl: %s, foreignHongBaoName: %s", c1Var.f226726r, c1Var.f226727s);
        hb3.o.Ni().Di().i(c1Var);
        this.f227238t = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.g5.h(jSONObject.optJSONObject("operationHeader"));
        this.f227239u = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.g5.h(jSONObject.optJSONObject("operationTail"));
        this.f227240v = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.g5.h(jSONObject.optJSONObject("operationNext"));
        this.f227241w = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.g5.h(jSONObject.optJSONObject("operationMiddle"));
        int optInt = jSONObject.optInt("sceneSwitch");
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_NEWYEAR_UNION_SWITCH_INT_SYNC, java.lang.Integer.valueOf(optInt));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "sceneSwitch:" + optInt);
        this.f227243y = jSONObject.optInt("scenePicSwitch");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "scenePicSwitch:" + this.f227243y);
        int optInt2 = jSONObject.optInt("enableYearHbExpression");
        this.A = optInt2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "enableYearHbExpression:%s", java.lang.Integer.valueOf(optInt2));
        this.f227244z = jSONObject.optInt("enableSelfie");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "enableSelfIe:" + this.f227244z);
        this.B = jSONObject.optInt("enableNormalSelfie");
        this.C = jSONObject.optInt("enableNormalAllExpression");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "enableNormalSelfie:%s enableNormalAllExpression:%s", java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(this.C));
        int optInt3 = jSONObject.optInt("enableWeishiHb");
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_WEISHI_UNION_SWITCH_INT_SYNC, java.lang.Integer.valueOf(optInt3));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "weishiHbSwitch:" + optInt3);
        java.lang.String optString2 = jSONObject.optString("wishing");
        this.f227242x = optString2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "wishing: %s", optString2);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("yearMess");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "yearMessJson is empty!");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "yearMessJson length:" + optJSONArray.length());
            this.D = new java.util.LinkedList();
            for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i18);
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f5 f5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f5();
                f5Var.f226807a = optJSONObject.optInt("yearAmount", 0);
                f5Var.f226808b = optJSONObject.optString("yearWish");
                this.D.add(f5Var);
            }
        }
        K();
    }
}
