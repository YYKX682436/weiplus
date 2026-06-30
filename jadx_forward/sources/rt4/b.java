package rt4;

/* loaded from: classes9.dex */
public class b extends op5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f481074d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2380x2e243d.p2381x633fb29.C19178xda56ba87 f481075e;

    public b(java.lang.String str) {
        this.f481074d = str;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("card_number", str);
        m83032xb4c13117(hashMap);
    }

    @Override // op5.a
    public int H() {
        return 22;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2380x2e243d.p2381x633fb29.C19178xda56ba87 c19178xda56ba87 = new com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2380x2e243d.p2381x633fb29.C19178xda56ba87();
        this.f481075e = c19178xda56ba87;
        c19178xda56ba87.f262761d = jSONObject.optString("bin");
        this.f481075e.f262762e = jSONObject.optString("bank_name");
        this.f481075e.f262763f = jSONObject.optString("issuer_type");
        this.f481075e.f262764g = jSONObject.optString("card_type");
        this.f481075e.f262765h = jSONObject.optString("payu_reference");
    }
}
