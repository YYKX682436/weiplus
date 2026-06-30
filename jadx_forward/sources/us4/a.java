package us4;

/* loaded from: classes9.dex */
public class a extends op5.a {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f512106d;

    public a() {
        this("", true);
    }

    @Override // op5.a
    public int H() {
        return 1;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c I(org.json.JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c(1);
        c19091x9511676c.O2 = jSONObject.optInt("avail_balance") / 100.0d;
        c19091x9511676c.Q2 = jSONObject.optInt("fetch_balance") / 100.0d;
        c19091x9511676c.f69223x58802fcb = jSONObject.optString("balance_bank_type");
        c19091x9511676c.f69225xed6d60f6 = jSONObject.optString("balance_bind_serial");
        c19091x9511676c.f69239x93565523 = jSONObject.optString("balance_forbid_word");
        c19091x9511676c.f69233x225aa2b6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kmd);
        c19091x9511676c.f69227x1d45800f |= 8;
        return c19091x9511676c;
    }

    public final java.util.ArrayList J(org.json.JSONArray jSONArray) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArray != null && jSONArray.length() > 0) {
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                jSONObject.put("extra_bind_flag", "NORMAL");
                if (ct4.a.f303837b == null) {
                    ct4.a.f303837b = new ct4.a();
                }
                arrayList.add(ct4.a.f303837b.c(jSONObject));
            }
        }
        return arrayList;
    }

    public final at4.v1 K(org.json.JSONObject jSONObject) {
        at4.v1 v1Var = new at4.v1();
        if (jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        v1Var.f67049xff817ee4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(jSONObject.optString("is_reg"), 0);
        v1Var.f67066xeae73197 = jSONObject.optString("true_name");
        v1Var.f67061x82927589 = jSONObject.optString("main_card_bind_serialno");
        v1Var.f67045xe10fc5ac = jSONObject.optString("transfer_url");
        ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().D(v1Var.f67061x82927589);
        return v1Var;
    }

    @Override // op5.a, com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        return super.mo807x6c193ac1(sVar, u0Var);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetScenePayUQueryBoundBankcard", "hy: payu query bind on gy net end. errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), str);
        if (i17 != 0) {
            return;
        }
        try {
            long optLong = jSONObject.optLong("time_stamp");
            if (optLong > 0) {
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.f1.b("" + optLong);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetScenePayUQueryBoundBankcard", "no time_stamp in bindquerynew.");
            }
            at4.v1 K = K(jSONObject.getJSONObject("user_info"));
            K.f67065x3aaa9ebb = jSONObject.getJSONObject("switch_info").getInt("switch_bit");
            ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().C(K, J(jSONObject.optJSONArray("Array")), null, I(jSONObject.optJSONObject("balance_info")), null, null, null, null, 0, 0, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetScenePayUQueryBoundBankcard", e17, "", new java.lang.Object[0]);
        }
        if (!this.f512106d || ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
            return;
        }
        this.f39858xf5bc2045.mo815x76e0bfae(1000, -100869, "", this);
        this.f39866x381dd98a = true;
    }

    public a(java.lang.String str, boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("req_key", str);
        m83032xb4c13117(hashMap);
        this.f512106d = z17;
    }
}
