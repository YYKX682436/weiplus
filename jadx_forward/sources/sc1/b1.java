package sc1;

/* loaded from: classes7.dex */
public class b1 implements com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXSnapshotListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gb1.n f487182b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t f487183c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc1.c1 f487184d;

    public b1(sc1.c1 c1Var, gb1.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar) {
        this.f487184d = c1Var;
        this.f487182b = nVar;
        this.f487183c = tVar;
    }

    @Override // com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXSnapshotListener
    /* renamed from: onSnapshot */
    public void mo29892xb614f8c3(android.graphics.Bitmap bitmap) {
        java.lang.String str;
        if (bitmap == null || bitmap.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOperateLivePusher", "onSnapshot: bitmap nil");
            gb1.n nVar = this.f487182b;
            sc1.c1 c1Var = this.f487184d;
            c1Var.getClass();
            java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "fail:take snapshot fail" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 1107004);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            nVar.a(c1Var.u(str, jSONObject));
            return;
        }
        java.lang.String str4 = q75.c.d() + java.lang.String.format("%s%d.%s", "capture", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "jpg");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 90, android.graphics.Bitmap.CompressFormat.JPEG, str4, true);
            ik1.b0 b0Var = new ik1.b0();
            if (this.f487183c.mo50354x59eafec1().mo49619x6aa75256(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str4)), "jpg", true, b0Var) != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK) {
                gb1.n nVar2 = this.f487182b;
                sc1.c1 c1Var2 = this.f487184d;
                c1Var2.getClass();
                java.lang.String str5 = android.text.TextUtils.isEmpty(null) ? "fail:save to temp file after take snapshot fail" : null;
                str = str5 != null ? str5 : "";
                java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 1107006);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                nVar2.a(c1Var2.u(str, jSONObject2));
                return;
            }
            this.f487184d.getClass();
            if (!bitmap.isRecycled()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateLivePusher", "bitmap recycle " + bitmap.toString());
                bitmap.recycle();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateLivePusher", "onSnapshot: actualPath:%s path:%s", str4, b0Var.f373357a);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("tempImagePath", b0Var.f373357a);
            hashMap.put("width", java.lang.Integer.valueOf(width));
            hashMap.put("height", java.lang.Integer.valueOf(height));
            gb1.n nVar3 = this.f487182b;
            sc1.c1 c1Var3 = this.f487184d;
            c1Var3.getClass();
            java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 0);
            nVar3.a(c1Var3.t("ok", hashMap));
        } catch (java.io.IOException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOperateLivePusher", "onSnapshot: exception %s", e19.getMessage());
            gb1.n nVar4 = this.f487182b;
            sc1.c1 c1Var4 = this.f487184d;
            c1Var4.getClass();
            java.lang.String str8 = android.text.TextUtils.isEmpty(null) ? "fail:save to album after take snapshot fail" : null;
            str = str8 != null ? str8 : "";
            java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 1107005);
            } catch (java.lang.Exception e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
            }
            nVar4.a(c1Var4.u(str, jSONObject3));
        }
    }
}
