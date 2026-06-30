package ys4;

/* loaded from: classes9.dex */
public class j extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f546777d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f546778e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f546779f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f546780g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f546781h;

    public j(int i17, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("channel", i17 + "");
        m83032xb4c13117(hashMap);
        this.f546781h = str;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return 1630;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 1630;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/realnameguidequery";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 != 0 || jSONObject == null) {
            return;
        }
        this.f546777d = jSONObject.optString("guide_flag");
        this.f546778e = jSONObject.optString("guide_wording");
        this.f546779f = jSONObject.optString("left_button_wording");
        this.f546780g = jSONObject.optString("right_button_wording");
    }
}
