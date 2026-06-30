package ss4;

/* loaded from: classes9.dex */
public class f0 extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 f493591d;

    public f0(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("trans_id", str);
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 3;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        int i18;
        if (jSONObject != null) {
            try {
                this.f493591d = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05();
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity commodity = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity();
                commodity.f261236d = jSONObject.getString("buy_uin");
                commodity.f261237e = jSONObject.getString("buy_name");
                commodity.f261238f = jSONObject.optString("sale_uin");
                commodity.f261239g = jSONObject.optString("sale_name");
                commodity.f261247r = jSONObject.getString("trans_id");
                commodity.f261240h = jSONObject.optString("goods_name");
                commodity.f261242m = jSONObject.optDouble("pay_num") / 100.0d;
                commodity.f261244o = jSONObject.getString("trade_state");
                commodity.f261245p = jSONObject.getString("trade_state_name");
                commodity.f261248s = jSONObject.getString("buy_bank_name");
                commodity.f261254y = jSONObject.optString("discount", "");
                commodity.f261246q = jSONObject.optInt("modify_timestamp");
                commodity.f261249t = jSONObject.optString("fee_type");
                commodity.f261250u = jSONObject.optString("appusername");
                commodity.f261252w = jSONObject.optString("app_telephone");
                commodity.f261243n = jSONObject.optDouble("original_total_fee", -1.0d) / 100.0d;
                commodity.f261249t = jSONObject.optString("fee_type", "");
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("subscribe_biz_info");
                if (optJSONObject != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Promotions promotions = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Promotions();
                    promotions.f261304d = 0;
                    promotions.f261306f = optJSONObject.optString("nickname");
                    java.lang.String optString = optJSONObject.optString(dm.i4.f66875xa013b0d5);
                    promotions.f261309i = optString;
                    commodity.f261251v = optString;
                    promotions.f261305e = optJSONObject.optString("logo_round_url");
                    promotions.f261308h = optJSONObject.optString("subscribe_biz_url");
                    i18 = optJSONObject.optInt("recommend_level");
                    commodity.f261255z = i18;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(promotions.f261306f)) {
                        commodity.H.add(promotions);
                    }
                } else {
                    i18 = 1;
                }
                org.json.JSONArray jSONArray = jSONObject.getJSONArray("activity_info");
                int length = jSONArray.length();
                for (int i19 = 0; i19 < length; i19++) {
                    org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i19);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Promotions promotions2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Promotions();
                    promotions2.f261304d = 1;
                    promotions2.f261305e = jSONObject2.optString("icon");
                    promotions2.f261306f = jSONObject2.optString("wording");
                    promotions2.f261308h = jSONObject2.optString("url");
                    promotions2.f261307g = jSONObject2.optString("btn_text");
                    promotions2.f261311n = jSONObject2.optInt("type");
                    promotions2.f261310m = jSONObject2.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                    promotions2.f261312o = jSONObject2.optLong(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.WXWebPage.f32847x4430964b);
                    promotions2.f261313p = jSONObject2.optInt("activity_type", 0);
                    promotions2.f261314q = jSONObject2.optInt("award_id");
                    promotions2.f261315r = jSONObject2.optInt("send_record_id");
                    promotions2.f261316s = jSONObject2.optInt("user_record_id");
                    promotions2.f261318u = jSONObject2.optString("activity_tinyapp_username");
                    promotions2.f261319v = jSONObject2.optString("activity_tinyapp_path");
                    promotions2.f261320w = jSONObject2.optLong("activity_mch_id");
                    promotions2.f261321x = jSONObject2.optInt("activity_tinyapp_version");
                    promotions2.f261322y = jSONObject2.optString("get_award_params");
                    promotions2.f261323z = jSONObject2.optString("query_award_status_params");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.d(promotions2, jSONObject2.optJSONObject("exposure_info"));
                    commodity.H.add(promotions2);
                }
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("discount_array");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    int length2 = optJSONArray.length();
                    commodity.A = new java.util.ArrayList();
                    for (int i27 = 0; i27 < length2; i27++) {
                        org.json.JSONObject optJSONObject2 = optJSONArray.optJSONObject(i27);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.DiscountInfo discountInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.DiscountInfo();
                        discountInfo.f261273d = optJSONObject2.optDouble("payment_amount");
                        discountInfo.f261274e = optJSONObject2.optString("favor_desc");
                        commodity.A.add(discountInfo);
                    }
                }
                commodity.B = jSONObject.optString("rateinfo");
                jSONObject.optString("discount_rateinfo");
                commodity.C = jSONObject.optString("original_feeinfo");
                this.f493591d.M = new java.util.ArrayList();
                this.f493591d.M.add(commodity);
                this.f493591d.C = jSONObject.optString("trade_state_name");
                this.f493591d.A = i18;
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneTenpayQueryOrderInfo", e17, "", new java.lang.Object[0]);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneTenpayQueryOrderInfo", e18, "", new java.lang.Object[0]);
            }
        }
    }

    public f0(java.lang.String str, int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("trans_id", str);
        hashMap.put("pay_type", "" + i17);
        m83032xb4c13117(hashMap);
    }
}
