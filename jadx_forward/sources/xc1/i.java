package xc1;

/* loaded from: classes.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f534571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f534572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f534573f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h f534574g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f534575h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ xc1.l f534576i;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, org.json.JSONObject jSONObject, com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h hVar, java.lang.Object obj, xc1.l lVar) {
        this.f534571d = yVar;
        this.f534572e = i17;
        this.f534573f = jSONObject;
        this.f534574g = hVar;
        this.f534575h = obj;
        this.f534576i = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xc1.l lVar = this.f534576i;
        int i17 = this.f534572e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f534571d;
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invoke onWXAppResult, appId:");
            sb6.append(yVar.mo48798x74292566());
            sb6.append(", callbackId:");
            sb6.append(i17);
            sb6.append(" data:");
            sb6.append(this.f534573f);
            sb6.append(" receiver: ");
            com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h hVar = this.f534574g;
            java.lang.String name = hVar != null ? hVar.getClass().getName() : null;
            if (name == null) {
                name = "null";
            }
            sb6.append(name);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiNavigateBackNative", sb6.toString());
            if (hVar != null) {
                java.lang.Object obj = this.f534575h;
                java.lang.String obj2 = obj != null ? obj.toString() : null;
                if (obj2 == null) {
                    obj2 = "";
                }
                hVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(obj2));
            }
            lVar.getClass();
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i17, lVar.u(str, jSONObject));
        } catch (java.lang.Exception e18) {
            java.lang.String str3 = "fail " + e18.getMessage();
            lVar.getClass();
            if (android.text.TextUtils.isEmpty(str3)) {
                str3 = "fail:internal error";
            }
            java.lang.String str4 = str3 != null ? str3 : "";
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            yVar.a(i17, lVar.u(str4, jSONObject2));
        }
    }
}
