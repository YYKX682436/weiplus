package d05;

/* loaded from: classes9.dex */
public class a extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f307110d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f307111e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f307112f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f307113g = false;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f307114h;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f307110d = hashMap;
        hashMap.put("session_key", str3);
        hashMap.put("bank_type", str4);
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, str);
        hashMap.put("cre_id", str2);
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 64;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 != 0) {
            return;
        }
        try {
            this.f307111e = jSONObject.optString("session_key");
            this.f307112f = "1".equals(jSONObject.getString("need_bind"));
            this.f307113g = "1".equals(jSONObject.getString("bank_user"));
            this.f307114h = jSONObject.optString("mobile_no");
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Micromsg.NetSceneTenpayCheckPwd", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: resend */
    public boolean mo8969xc84d8c3b() {
        super.mo8969xc84d8c3b();
        java.util.Map<java.lang.String, java.lang.String> map = this.f307110d;
        ((java.util.HashMap) map).put("retry", "1");
        m83032xb4c13117(map);
        return true;
    }
}
