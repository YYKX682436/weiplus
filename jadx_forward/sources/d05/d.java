package d05;

/* loaded from: classes9.dex */
public class d extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public d05.k f307120d;

    public d(java.lang.String str, boolean z17, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("bind_serialno", str);
        hashMap.put("bank_type", str2);
        if (z17) {
            hashMap.put("query_method", "1");
        } else {
            hashMap.put("query_method", "0");
        }
        m83032xb4c13117(hashMap);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("banktype", str2);
        m83033x7c1e2016(hashMap2);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 57;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 != 0) {
            return;
        }
        try {
            d05.k kVar = new d05.k();
            this.f307120d = kVar;
            kVar.f307128a = jSONObject.optInt("credit_state");
            this.f307120d.f307129b = jSONObject.optInt("credit_amount") / 100.0d;
            this.f307120d.f307130c = jSONObject.optInt("credit_usable") / 100.0d;
            this.f307120d.f307131d = jSONObject.optInt("bill_amount") / 100.0d;
            d05.k kVar2 = this.f307120d;
            jSONObject.optInt("bill_date");
            kVar2.getClass();
            this.f307120d.f307132e = jSONObject.optInt("repay_amount") / 100.0d;
            d05.k kVar3 = this.f307120d;
            jSONObject.optInt("repay_minimum");
            kVar3.getClass();
            d05.k kVar4 = this.f307120d;
            boolean z17 = true;
            if (jSONObject.optInt("upgrade_amount") != 1) {
                z17 = false;
            }
            kVar4.f307133f = z17;
            d05.k kVar5 = this.f307120d;
            jSONObject.optInt("bill_month");
            kVar5.getClass();
            this.f307120d.f307134g = jSONObject.optString("repay_url");
            this.f307120d.f307135h = jSONObject.optString("repay_lasttime");
            this.f307120d.f307139l = jSONObject.optString("lasttime");
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("jump_url_array");
            if (jSONArray != null && jSONArray.length() > 0) {
                int length = jSONArray.length();
                for (int i18 = 0; i18 < length; i18++) {
                    org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i18);
                    java.lang.String string = jSONObject2.getString("jump_name");
                    if ("account_rights_url".equals(string)) {
                        this.f307120d.f307137j = jSONObject2.getString("jump_url");
                    } else if ("bill_url".equals(string)) {
                        this.f307120d.f307138k = jSONObject2.getString("jump_url");
                    } else if ("card_detail_url".equals(string)) {
                        this.f307120d.f307136i = jSONObject2.getString("jump_url");
                    } else if ("know_more_url".equals(string)) {
                        this.f307120d.f307140m = jSONObject2.getString("jump_url");
                    }
                }
            }
            org.json.JSONObject jSONObject3 = jSONObject.getJSONObject("appservice");
            if (jSONObject3 != null) {
                this.f307120d.f307141n = new d05.j();
                jSONObject3.getString("app_telephone");
                d05.j jVar = this.f307120d.f307141n;
                jSONObject3.getString("nickname");
                jVar.getClass();
                this.f307120d.f307141n.f307127a = jSONObject3.getString(dm.i4.f66875xa013b0d5);
                d05.j jVar2 = this.f307120d.f307141n;
                jSONObject3.getString("jump_url");
                jVar2.getClass();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Micromsg.NetSceneTenpayCheckPwd", e17, "", new java.lang.Object[0]);
        }
    }
}
