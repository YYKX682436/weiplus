package o44;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f424419a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f424420b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f424421c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f424422d;

    /* renamed from: e, reason: collision with root package name */
    public int f424423e;

    /* renamed from: f, reason: collision with root package name */
    public long f424424f;

    public static o44.d a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseFromExtJson", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromExtJson", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int optInt = jSONObject.optInt("subCardType");
            if (optInt != 4) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromExtJson", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
                return null;
            }
            o44.d dVar = new o44.d();
            dVar.f424420b = jSONObject.optString("giveCardId");
            dVar.f424423e = optInt;
            dVar.f424421c = jSONObject.optString("senderUserName");
            dVar.f424422d = jSONObject.optString("senderNickName");
            dVar.f424424f = jSONObject.optLong("shareTime");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromExtJson", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
            return dVar;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShareGiveHBCardInfo", "toExtInfoJsonString, exp=" + e17.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromExtJson", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
            return null;
        }
    }

    public static o44.d b(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseFromXml", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
        if (map == null || map.size() == 0 || android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromXml", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
            return null;
        }
        java.lang.String str2 = str + ".giveHBCardInfo";
        if (!map.containsKey(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromXml", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
            return null;
        }
        o44.d dVar = new o44.d();
        java.lang.String str3 = (java.lang.String) map.get(str2 + ".twistCardId");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str3 == null) {
            str3 = "";
        }
        dVar.f424419a = str3;
        java.lang.String str4 = (java.lang.String) map.get(str2 + ".giveCardId");
        if (str4 == null) {
            str4 = "";
        }
        dVar.f424420b = str4;
        java.lang.String str5 = (java.lang.String) map.get(str2 + ".senderUserName");
        if (str5 == null) {
            str5 = "";
        }
        dVar.f424421c = str5;
        java.lang.String str6 = (java.lang.String) map.get(str2 + ".senderNickName");
        dVar.f424422d = str6 != null ? str6 : "";
        dVar.f424423e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str2 + ".subCardType"), 0);
        dVar.f424424f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) map.get(str2 + ".shareTime"));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromXml", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
        return dVar;
    }

    public java.lang.String c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toExtInfoJsonString", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("giveCardId", this.f424420b);
            jSONObject.put("subCardType", this.f424423e);
            jSONObject.put("cardType", 2);
            jSONObject.put("senderUserName", this.f424421c);
            jSONObject.put("senderNickName", this.f424422d);
            jSONObject.put("shareTime", this.f424424f);
            java.lang.String jSONObject2 = jSONObject.toString();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toExtInfoJsonString", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
            return jSONObject2;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShareGiveHBCardInfo", "toExtInfoJsonString, exp=" + e17.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toExtInfoJsonString", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
            return "";
        }
    }
}
