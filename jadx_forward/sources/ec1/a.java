package ec1;

/* loaded from: classes7.dex */
public class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f69663x366c91de = 1372;

    /* renamed from: NAME */
    public static final java.lang.String f69664x24728b = "addToDesktop";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        int i18 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddDesktop", "data:%s", jSONObject);
        final boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.m48889xc55ddd52().getBoolean("key_sendtodesktop_no_more_show_permission_notify_dialog", false);
        final java.lang.String mo48798x74292566 = e9Var.mo48798x74292566();
        final android.app.Activity Z0 = e9Var.Z0();
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 c11813xf952a195 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195) e9Var.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195.class);
        final com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 c3897xbc286aa1 = (com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1) e9Var.t3().u0();
        final java.lang.String str3 = c3897xbc286aa1.f128811x;
        if (Z0 == null || android.text.TextUtils.isEmpty(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddDesktop", "performItemClick failed, context or username is null or nil.");
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, u(str2, jSONObject2));
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new java.lang.Runnable() { // from class: ec1.a$$a
            @Override // java.lang.Runnable
            public final void run() {
                ec1.a aVar = ec1.a.this;
                com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 c3897xbc286aa12 = c3897xbc286aa1;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 c11813xf952a1952 = c11813xf952a195;
                java.lang.String str5 = str3;
                android.content.Context context = Z0;
                java.lang.String str6 = mo48798x74292566;
                boolean z18 = z17;
                aVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.t9 t9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.t9(c3897xbc286aa12.f128812x0, c11813xf952a1952.Z, c3897xbc286aa12.f158812e, c11813xf952a1952.f387375e, str5);
                ae0.h hVar = (ae0.h) i95.n0.c(ae0.h.class);
                ec1.b bVar = new ec1.b(aVar);
                ((zd0.e) hVar).getClass();
                android.util.Pair j17 = xp1.d.j(context, str6, z18, true, bVar);
                int i19 = c11813xf952a1952.f387385r.f156932d;
                int intValue = ((java.lang.Integer) j17.first).intValue();
                int intValue2 = ((java.lang.Integer) j17.second).intValue();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.u9.f(context, t9Var, i19);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ec1.c(aVar, new java.util.concurrent.atomic.AtomicBoolean(false), context, t9Var, i19, intValue, intValue2, z18));
            }
        });
        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str != null ? str : "";
        java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        e9Var.a(i17, u(str2, jSONObject3));
    }
}
