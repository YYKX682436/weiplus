package qt4;

/* loaded from: classes9.dex */
public class a extends op5.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f448183d;

    public a(double d17, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("total_fee", "" + java.lang.Math.round(d17 * 100.0d));
        hashMap.put("fee_type", str);
        m83032xb4c13117(hashMap);
    }

    @Override // op5.a
    public int H() {
        return 20;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f448183d = jSONObject.optString("prepayid");
    }
}
