package ws4;

/* loaded from: classes9.dex */
public class a extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public final int f530740d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 f530741e;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, java.lang.String str6, java.lang.String str7) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetPaidOrderDetail", "do NetSceneGetPaidOrderDetail");
        this.f530740d = i17;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("appId", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? str : fp.s0.a(str));
        hashMap.put("timeStamp", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? str2 : fp.s0.a(str2));
        hashMap.put("nonceStr", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) ? str3 : fp.s0.a(str3));
        hashMap.put("package", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) ? str4 : fp.s0.a(str4));
        hashMap.put("reqKey", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5) ? str5 : fp.s0.a(str5));
        hashMap.put("payScene", fp.s0.a(i17 + ""));
        hashMap.put("signType", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6) ? str6 : fp.s0.a(str6));
        hashMap.put("paySign", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7) ? str7 : fp.s0.a(str7));
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return this.f530740d == 2 ? 2516 : 2570;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return this.f530740d == 2 ? 2516 : 2570;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return this.f530740d == 2 ? "/cgi-bin/mmpay-bin/tenpay/offlinegetpaidorderdetail" : "/cgi-bin/mmpay-bin/tenpay/getpaidorderdetail";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetPaidOrderDetail", "errCode: " + i17 + " errMsg: " + str);
        if (jSONObject == null || !m83019xecdab0dd()) {
            return;
        }
        if (this.f530741e == null) {
            this.f530741e = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05();
        }
        try {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("payresult");
            for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i18);
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity commodity = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity();
                commodity.f261247r = jSONObject2.getString(ya.b.f77506xba41a63c);
                commodity.f261239g = jSONObject2.optString("sp_name");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f530741e.f261214m)) {
                    this.f530741e.f261214m = jSONObject2.optString("fee_type");
                }
                this.f530741e.M.add(commodity);
            }
        } catch (org.json.JSONException unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = this.f530741e;
        this.f530741e = c19099x8d444f05;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.g(jSONObject, c19099x8d444f05);
        this.f530741e = c19099x8d444f05;
    }
}
