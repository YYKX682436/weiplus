package yt4;

/* loaded from: classes9.dex */
public class d extends op5.a {
    public d(java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("payu_reference", str);
        hashMap.put("new_pin", str2);
        m83032xb4c13117(hashMap);
    }

    @Override // op5.a
    public int H() {
        return 19;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        jSONObject.optString("payu_reference");
    }
}
