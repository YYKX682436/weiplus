package d05;

/* loaded from: classes9.dex */
public class b extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f307115d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f307116e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f307117f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f307118g = true;

    public b(java.lang.String str, int i17, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("passwd", str);
        hashMap.put("bank_type", str2);
        hashMap.put("check_pwd_scene", i17 + "");
        m83032xb4c13117(hashMap);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("check_pwd_scene", i17 + "");
        m83033x7c1e2016(hashMap2);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 63;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 != 0) {
            return;
        }
        this.f307115d = jSONObject.optString("session_key");
        if ("1".equals(jSONObject.optString("all_info"))) {
            this.f307118g = false;
            return;
        }
        this.f307118g = true;
        this.f307116e = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
        this.f307117f = jSONObject.optString("cre_id");
    }
}
