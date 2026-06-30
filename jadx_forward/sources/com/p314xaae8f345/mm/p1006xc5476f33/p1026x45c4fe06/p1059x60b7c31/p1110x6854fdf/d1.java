package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public final class d1 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.e1 f164656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f164657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f164658c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f164659d;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.e1 e1Var, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17) {
        this.f164656a = e1Var;
        this.f164657b = context;
        this.f164658c = e9Var;
        this.f164659d = i17;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.JsApiShareTextToGroup", "requestCode:" + i17 + " resultCode: " + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.e1 e1Var = this.f164656a;
        if (i17 != e1Var.f164662g) {
            return false;
        }
        int i19 = this.f164659d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f164658c;
        if (i18 == -1) {
            android.content.Context context = this.f164657b;
            if (context instanceof android.app.Activity) {
                j91.d dVar = (j91.d) e9Var.mo32091x9a3f0ba2().K1(j91.d.class);
                if (dVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t) dVar;
                    if (tVar.f()) {
                        tVar.l();
                    }
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6), null, context, null, null);
            }
            e1Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i19, e1Var.u(str2, jSONObject));
        } else if (i18 == 0) {
            e1Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 1);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            e9Var.a(i19, e1Var.u(str2, jSONObject2));
        }
        return true;
    }
}
