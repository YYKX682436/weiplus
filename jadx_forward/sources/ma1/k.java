package ma1;

/* loaded from: classes7.dex */
public final class k implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f406731a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f406732b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f406733c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ma1.m f406734d;

    public k(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i18, ma1.m mVar) {
        this.f406731a = i17;
        this.f406732b = c0Var;
        this.f406733c = i18;
        this.f406734d = mVar;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        jz5.f0 f0Var;
        if (i17 != this.f406731a) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsApiScreenRecorderShare", "on result callback, result code: %d", java.lang.Integer.valueOf(i18));
        ma1.m mVar = this.f406734d;
        int i19 = this.f406733c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f406732b;
        if (i18 == -1) {
            java.io.Serializable serializableExtra = intent.getSerializableExtra("k_ext_data");
            if (serializableExtra != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (java.util.Map.Entry entry : ((java.util.Map) serializableExtra).entrySet()) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("optionKey", ((java.lang.Number) entry.getKey()).intValue());
                    jSONObject2.put("errCode", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6.ShareResult) entry.getValue()).f171723d);
                    jSONObject2.put("errMsg", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6.ShareResult) entry.getValue()).f171724e);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("shareResult", jSONArray);
                mVar.getClass();
                java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                try {
                    jSONObject.put("errno", 0);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                c0Var.a(i19, mVar.u(str, jSONObject));
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                mVar.getClass();
                java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                java.lang.String str4 = str3 != null ? str3 : "";
                java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("errno", 4);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                c0Var.a(i19, mVar.u(str4, jSONObject3));
            }
        } else if (i18 != 0) {
            this.f406734d.F(this.f406732b, this.f406733c, 1, 804, "share video failed!");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsApiScreenRecorderShare", "user cancelled share!");
            java.util.Map hashMap = new java.util.HashMap(1);
            hashMap.put("errCode", 803);
            c0Var.a(i19, mVar.p("fail: user cancelled", hashMap));
        }
        return true;
    }
}
