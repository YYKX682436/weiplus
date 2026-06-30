package yb3;

/* loaded from: classes9.dex */
public class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c6 {

    /* renamed from: h, reason: collision with root package name */
    public final int f542223h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f542224i;

    /* renamed from: m, reason: collision with root package name */
    public int f542225m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f542226n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f542227o;

    /* renamed from: p, reason: collision with root package name */
    public int f542228p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f542229q;

    public f() {
        this("");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/h5operationwxhb";
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2832;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o5
    /* renamed from: onGYNetEnd */
    public void mo66076x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigHK", "errCode: %s, errMsg: %s ，json：%s", java.lang.Integer.valueOf(i17), str, jSONObject.toString());
        if (i17 == 0) {
            this.f542225m = jSONObject.optInt("randomAmount");
            this.f542226n = jSONObject.optString("randomWishing");
            this.f542227o = jSONObject.optString("sceneName");
            jSONObject.optString("sceneBackgroup");
            this.f542228p = jSONObject.optInt("sceneSwitch");
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_HK_NEWYEAR_SWITCH_INT_SYNC, java.lang.Integer.valueOf(this.f542228p));
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_HK_NEWYEAR_NAME_STRING_SYNC, this.f542227o);
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("yearMess");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigHK", "yearMessJson is empty!");
            } else {
                this.f542229q = new java.util.LinkedList();
                for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i18);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f5 f5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f5();
                    f5Var.f226807a = optJSONObject.optInt("yearAmount", 0);
                    f5Var.f226808b = optJSONObject.optString("yearWish");
                    this.f542229q.add(f5Var);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c1 c1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c1();
            c1Var.f226717f = jSONObject.optString("groupHint");
            c1Var.f226718g = jSONObject.optString("personalHint");
            c1Var.f226716e = jSONObject.optLong("totalAmount", 200000L) / 100.0d;
            c1Var.f226715d = jSONObject.optInt("totalNum", 100);
            c1Var.f226719h = jSONObject.optLong("perPersonMaxValue", 20000L) / 100.0d;
            c1Var.f226720i = jSONObject.optLong("perGroupMaxValue", 20000L) / 100.0d;
            c1Var.f226721m = jSONObject.optLong("perMinValue", 1L) / 100.0d;
            c1Var.f226730v = jSONObject.optBoolean("enableExclusiveHb");
            c1Var.f226723o = jSONObject.optInt(ya.b.f77474x50f1e011);
            c1Var.f226724p = jSONObject.optString("currencyUint");
            c1Var.f226725q = jSONObject.optString("currencyWording");
            c1Var.f226726r = jSONObject.optString("foreignFaqUrl");
            c1Var.f226727s = jSONObject.optString("foreignHongBaoName");
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h4 Ai = hb3.o.Ni().Ai();
            Ai.f226844a = c1Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHKConfigManager", "setConfig maxTotalAmount:" + Ai.f226844a.f226716e + " maxTotalNum:" + Ai.f226844a.f226715d + " perGroupMaxValue:" + Ai.f226844a.f226720i + " perMinValue:" + Ai.f226844a.f226721m + " perPersonMaxValue:" + Ai.f226844a.f226719h);
            try {
                java.lang.String str2 = new java.lang.String(Ai.f226844a.mo14344x5f01b1f6(), com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a);
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_HK_CONFIG_STRING_SYNC, str2);
                gm0.j1.i();
                gm0.j1.u().c().i(true);
            } catch (java.io.UnsupportedEncodingException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyHKConfigManager", "save config exp, " + e17.getLocalizedMessage());
            } catch (java.io.IOException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyHKConfigManager", "save config exp, " + e18.getLocalizedMessage());
            }
            this.f542224i = c1Var.f226724p;
        }
    }

    public f(java.lang.String str) {
        this.f542223h = 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigHK", "request 2");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(ya.b.f77474x50f1e011, "2");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
            hashMap.put("chatroomUserCnt", ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str) + "");
        }
        m66103xb4c13117(hashMap);
    }
}
