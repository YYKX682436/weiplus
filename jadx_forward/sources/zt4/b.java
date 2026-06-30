package zt4;

/* loaded from: classes9.dex */
public class b extends op5.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f557129d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f557130e;

    public b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(dm.i4.f66865x76d1ec5a, str2);
        hashMap.put("answer", str3);
        hashMap.put("payu_reference", str);
        m83032xb4c13117(hashMap);
    }

    @Override // op5.a
    public int H() {
        return 18;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f557129d = jSONObject.optBoolean("verified");
        this.f557130e = jSONObject.optString("payu_reference");
    }
}
