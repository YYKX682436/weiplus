package ss4;

/* loaded from: classes9.dex */
public class s extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f493663d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f493664e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f493665f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19093x748e2641 f493666g;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19093x748e2641 c19093x748e2641, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, long j18, java.lang.String str5, java.lang.String str6, int i17, int i18) {
        this.f493666g = c19093x748e2641;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.WXWebPage.f32847x4430964b, str);
        hashMap.put("award_id", str2);
        hashMap.put("send_record_id", str3);
        hashMap.put("user_record_id", str4);
        hashMap.put("activity_mch_id", j17 + "");
        hashMap.put("activity_type", j18 + "");
        hashMap.put("bank_type", str5 + "");
        hashMap.put("bank_serial", str6 + "");
        hashMap.put("bindbankscene", i17 + "");
        hashMap.put("realname_scene", i18 + "");
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return 1786;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 1786;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/sendbindcardaward";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (jSONObject == null || i17 != 0) {
            return;
        }
        this.f493663d = jSONObject.optString("result_code");
        this.f493664e = jSONObject.optString("result_msg");
        this.f493665f = jSONObject.optString("alert_wording");
    }
}
