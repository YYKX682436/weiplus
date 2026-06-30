package dp3;

/* loaded from: classes9.dex */
public class k extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f323748d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f323749e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f323750f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f323751g;

    public k(int i17, int i18, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("Limit", i17 + "");
        hashMap.put("Offset", i18 + "");
        hashMap.put("Extbuf", str);
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 105;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f323748d = new java.util.LinkedList();
        try {
            this.f323750f = jSONObject.getInt("TotalNum");
            jSONObject.getInt("RecNum");
            this.f323751g = jSONObject.optString("Extbuf");
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("UserRollList");
            if (jSONArray != null) {
                for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                    dp3.o oVar = new dp3.o();
                    org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i18);
                    oVar.f323765o = jSONObject2.optInt("PayType");
                    oVar.f323757d = jSONObject2.optString("Transid");
                    oVar.f323758e = jSONObject2.optDouble("TotalFee");
                    oVar.f323759f = jSONObject2.optString("GoodsName");
                    oVar.f323760g = jSONObject2.optInt("CreateTime");
                    oVar.f323762i = jSONObject2.optInt("ModifyTime");
                    oVar.f323763m = jSONObject2.optString("FeeType");
                    oVar.f323769s = jSONObject2.optString("AppThumbUrl");
                    oVar.f323761h = jSONObject2.optString("TradeStateName");
                    oVar.f323774x = jSONObject2.optString("StatusColor");
                    oVar.f323775y = jSONObject2.optString("FeeColor");
                    oVar.f323776z = jSONObject2.optDouble("ActualPayFee");
                    oVar.A = jSONObject2.optString("BillId");
                    this.f323748d.add(oVar);
                }
            }
            this.f323749e = new java.util.LinkedList();
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("month_info");
            if (optJSONArray != null) {
                for (int i19 = 0; i19 < optJSONArray.length(); i19++) {
                    org.json.JSONObject jSONObject3 = optJSONArray.getJSONObject(i19);
                    dp3.j jVar = new dp3.j();
                    jVar.f323745d = jSONObject3.optInt("year");
                    jVar.f323746e = jSONObject3.optInt("month");
                    jVar.f323747f = jSONObject3.optString("feetext");
                    this.f323749e.add(jVar);
                }
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetScenePatchQueryUserRoll", "Parse Json exp:" + e17.getLocalizedMessage());
        }
    }
}
