package vs3;

/* loaded from: classes2.dex */
public class f extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f521426d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f521427e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f521428f = null;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f521429g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f521430h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f521431i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f521432m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f521433n;

    public f(java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.vk3();
        lVar.f152198b = new r45.wk3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getpayfunctionproductlist";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.e0.f34847x366c91de;
        lVar.f152201e = 228;
        lVar.f152202f = 1000000228;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f521427e = a17;
        r45.vk3 vk3Var = (r45.vk3) a17.f152243a.f152217a;
        this.f521429g = str;
        vk3Var.f469849d = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f521426d = u0Var;
        return mo9409x10f9447a(sVar, this.f521427e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.e0.f34847x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            r45.wk3 wk3Var = (r45.wk3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            java.lang.String str2 = wk3Var.f470760d;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                try {
                    this.f521428f = vs3.b.d(this.f521429g, new org.json.JSONObject(str2).getJSONArray("pay_product_list"));
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneGetPayFunctionProductList", e17, "", new java.lang.Object[0]);
                }
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wk3Var.f470761e)) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(wk3Var.f470761e);
                    this.f521430h = jSONObject.optString("balance_link");
                    this.f521432m = jSONObject.optString("recharge_link");
                    this.f521431i = jSONObject.optString("balance_wording");
                    this.f521433n = jSONObject.optString("recharge_wording");
                } catch (org.json.JSONException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneGetPayFunctionProductList", e18, "", new java.lang.Object[0]);
                }
            }
        }
        this.f521426d.mo815x76e0bfae(i18, i19, str, this);
    }
}
