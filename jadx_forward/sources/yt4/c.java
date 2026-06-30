package yt4;

/* loaded from: classes9.dex */
public class c extends op5.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f547282d = "";

    public c(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("pin", str);
        m83032xb4c13117(hashMap);
    }

    @Override // op5.a
    public int H() {
        return 3;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f547282d = jSONObject.optString("payu_reference");
    }
}
