package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public final class h0 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.j0 f164680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f164681b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f164682c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f164683d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.j0 j0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, android.app.Activity activity, int i17) {
        this.f164680a = j0Var;
        this.f164681b = e9Var;
        this.f164682c = activity;
        this.f164683d = i17;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.JsApiShareEmojiMessage", "requestCode:" + i17 + " resultCode: " + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.j0 j0Var = this.f164680a;
        if (i17 != j0Var.f164697g) {
            return false;
        }
        int i19 = this.f164683d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f164681b;
        if (i18 == -1) {
            j91.d dVar = (j91.d) e9Var.mo32091x9a3f0ba2().K1(j91.d.class);
            if (dVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t) dVar;
                if (tVar.f()) {
                    tVar.l();
                }
            }
            android.app.Activity activity = this.f164682c;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6), null, activity, null, null);
            j0Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i19, j0Var.u(str2, jSONObject));
        } else if (i18 == 0) {
            j0Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 1);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            e9Var.a(i19, j0Var.u(str2, jSONObject2));
        }
        return true;
    }
}
