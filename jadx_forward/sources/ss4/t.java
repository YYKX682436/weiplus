package ss4;

/* loaded from: classes9.dex */
public class t extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Promotions f493667d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f493668e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f493669f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f493670g;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Promotions promotions, java.lang.String str, java.lang.String str2, long j17) {
        this.f493667d = promotions;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.WXWebPage.f32847x4430964b, promotions.f261312o + "");
        hashMap.put("award_id", promotions.f261314q + "");
        hashMap.put("send_record_id", promotions.f261315r + "");
        hashMap.put("user_record_id", promotions.f261316s + "");
        hashMap.put("req_key", str);
        hashMap.put(ya.b.f77506xba41a63c, str2);
        hashMap.put("activity_mch_id", j17 + "");
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.m.f34145x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.m.f34145x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/sendpayaward";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o.TAG, "onGYNetEnd, errCode: %s, errMsg: %s, json: %s", java.lang.Integer.valueOf(i17), str, jSONObject);
        if (jSONObject == null || i17 != 0) {
            return;
        }
        this.f493668e = jSONObject.optString("result_code");
        this.f493669f = jSONObject.optString("result_msg");
        this.f493670g = jSONObject.optString("alert_wording");
    }
}
