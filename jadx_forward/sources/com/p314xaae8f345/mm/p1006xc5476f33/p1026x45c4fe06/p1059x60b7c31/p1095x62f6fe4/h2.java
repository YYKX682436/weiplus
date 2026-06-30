package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public final class h2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34483x366c91de = 1516;

    /* renamed from: NAME */
    private static final java.lang.String f34484x24728b = "bizChooseImage";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        boolean z17;
        java.lang.String str;
        int optInt;
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JSApiBizChooseImage", "invoke, env is null");
            return;
        }
        android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
        android.app.Activity activity = mo50352x76847179 instanceof android.app.Activity ? (android.app.Activity) mo50352x76847179 : null;
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JSApiBizChooseImage", "invoke, activity is null");
            java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str2, jSONObject2));
            return;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JSApiBizChooseImage", "invoke, data is null");
            str = android.text.TextUtils.isEmpty("fail:invalid data") ? "fail:jsapi invalid request data" : "fail:invalid data";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 101);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i17, u(str, jSONObject3));
            return;
        }
        if (((qk.r7) i95.n0.c(qk.r7.class)) != null) {
            z17 = qp.b.f447211e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JSApiBizChooseImage", "live photo core support");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JSApiBizChooseImage", "livePhotoCoreService is null");
            z17 = false;
        }
        boolean z18 = jSONObject.optBoolean("supportLivePhoto") && z17;
        if (jSONObject.has("count")) {
            int optInt2 = jSONObject.optInt("count");
            if (!(1 <= optInt2 && optInt2 < 21)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JSApiBizChooseImage", "invalid count " + jSONObject.optInt("count"));
                str = android.text.TextUtils.isEmpty("fail:invalid count") ? "fail:jsapi invalid request data" : "fail:invalid count";
                java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                try {
                    jSONObject4.put("errno", 101);
                } catch (java.lang.Exception e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                }
                lVar.a(i17, u(str, jSONObject4));
                return;
            }
            optInt = jSONObject.optInt("count");
        } else {
            optInt = 20;
        }
        boolean optBoolean = jSONObject.optBoolean("supportTextCover");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12159xc42d751 c12159xc42d751 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12159xc42d751(null, 0, false, false, 15, null);
        c12159xc42d751.f(optInt);
        c12159xc42d751.g(z18);
        java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
        c12159xc42d751.e(mo48798x74292566);
        c12159xc42d751.h(optBoolean);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.g2 g2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.g2(lVar, i17, this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JSApiBizChooseImage", "chooseMedia supportLivePhoto:%b, count:%d", java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(optInt));
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(activity, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, c12159xc42d751, g2Var, null);
    }
}
