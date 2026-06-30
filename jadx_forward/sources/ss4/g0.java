package ss4;

/* loaded from: classes9.dex */
public class g0 extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f493592d;

    /* renamed from: e, reason: collision with root package name */
    public org.json.JSONObject f493593e;

    public g0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, long j17) {
        this.f493592d = "";
        this.f493592d = str;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.WXWebPage.f32847x4430964b, str);
        hashMap.put("award_id", str2);
        hashMap.put("send_record_id", str3);
        hashMap.put("user_record_id", str4);
        hashMap.put("req_key", str5);
        hashMap.put(ya.b.f77506xba41a63c, str6);
        hashMap.put("activity_mch_id", j17 + "");
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return 1979;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 1979;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/querypayaward";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: isBlock */
    public boolean mo8970x7a807183() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayQueryPayaward", "errcode %s errmsg %s json %s", java.lang.Integer.valueOf(i17), str, jSONObject);
        this.f493593e = jSONObject;
    }
}
