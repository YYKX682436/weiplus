package zt4;

/* loaded from: classes9.dex */
public class c extends op5.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f557131d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f557132e;

    public c(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        hashMap.put("payu_reference", str == null ? "" : str);
        m83032xb4c13117(hashMap);
    }

    @Override // op5.a
    public int H() {
        return 23;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f557131d = jSONObject.optString(dm.i4.f66865x76d1ec5a);
        this.f557132e = jSONObject.optString("description");
    }
}
