package ct4;

/* loaded from: classes9.dex */
public class a extends at4.i {

    /* renamed from: b, reason: collision with root package name */
    public static ct4.a f303837b;

    @Override // at4.i
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c17 = super.c(jSONObject);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("cvv_length", jSONObject.optInt("cvv_length"));
            jSONObject2.put("information", jSONObject.optString("information"));
            jSONObject2.put("verified", jSONObject.optBoolean("verified"));
            jSONObject2.put("card_expiry", jSONObject.optString("card_expiry"));
            jSONObject2.put("is_credit", jSONObject.optString("bank_type").equals("CREDITCARD_PAYU"));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BankcardPayUWrapper", e17, "", new java.lang.Object[0]);
        }
        c17.f69234x26bd161e = jSONObject2.toString();
        c17.f69219x5aaf4976 = 1;
        c17.f69233x225aa2b6 = jSONObject.optString("description");
        c17.f69262x8bacf6de = jSONObject.optString("name_on_card");
        if ("CREDITCARD_PAYU".equals(jSONObject.optString("bank_type"))) {
            int i17 = c17.f69227x1d45800f;
            l75.e0 e0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c.A3;
            c17.f69227x1d45800f = i17 | 2;
        } else {
            int i18 = c17.f69227x1d45800f;
            l75.e0 e0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c.A3;
            c17.f69227x1d45800f = i18 | 8;
        }
        return c17;
    }
}
