package zr4;

/* loaded from: classes9.dex */
public class c extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public double f556733d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f556734e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f556735f;

    public c(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("token", str);
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return 1603;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 123;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/webankloanordershow";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2;
        if (i17 == 0) {
            this.f556734e = jSONObject.optString("fee_type");
            this.f556733d = jSONObject.optDouble("total_fee") / 100.0d;
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("Array");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.f556735f = ((org.json.JSONObject) optJSONArray.opt(0)).optString("desc");
            }
            at4.t1 bj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).bj();
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("bindqueryresp");
            bj6.f95506a.clear();
            if (optJSONObject == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletRepaymentBankcardMgr", "parse from json error,json is null");
                return;
            }
            org.json.JSONArray optJSONArray2 = optJSONObject.optJSONArray("Array");
            if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletRepaymentBankcardMgr", "repayment bankcard list is null");
            } else {
                for (int i18 = 0; i18 < optJSONArray2.length(); i18++) {
                    at4.i a17 = at4.i.a();
                    try {
                        jSONObject2 = (org.json.JSONObject) optJSONArray2.get(i18);
                    } catch (org.json.JSONException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletRepaymentBankcardMgr", e17, "", new java.lang.Object[0]);
                        jSONObject2 = null;
                    }
                    if (jSONObject2 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c17 = a17.c(jSONObject2);
                        if (c17.v0()) {
                            c17.f69233x225aa2b6 = c17.f69217xaef0808c;
                        } else if (c17.w0()) {
                            c17.f69233x225aa2b6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkj, c17.f69217xaef0808c, c17.f69222x587fd4e1);
                        } else if (c17.F0()) {
                            c17.f69233x225aa2b6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l28, c17.f69217xaef0808c, c17.f69222x587fd4e1);
                        } else {
                            c17.f69233x225aa2b6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kl9, c17.f69217xaef0808c, c17.f69222x587fd4e1);
                        }
                        bj6.f95506a.add(c17);
                    }
                }
            }
            org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("user_info");
            if (optJSONObject2 != null) {
                bj6.f95507b = optJSONObject2.optString("last_card_bind_serialno");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletRepaymentBankcardMgr", "user_info is null");
            }
        }
    }
}
