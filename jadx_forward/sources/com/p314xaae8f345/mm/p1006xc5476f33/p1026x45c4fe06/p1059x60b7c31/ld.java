package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class ld extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34430x366c91de = 1373;

    /* renamed from: NAME */
    public static final java.lang.String f34431x24728b = "showGuideDialogAfterClose";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        if (c0Var == null || jSONObject == null) {
            return;
        }
        int optInt = jSONObject.optInt("type", -1);
        if (optInt >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.s0.f169971a;
            if (optInt < ((java.util.List) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.s0.f169972b).mo141623x754a37bb()).size()) {
                java.lang.String mo48798x74292566 = c0Var.mo48798x74292566();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
                s0Var.a(mo48798x74292566, optInt, 1);
                java.lang.String str = c0Var.mo48798x74292566() + "_need_show_#" + optInt + "_guide_dialog";
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0 q0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = q0Var.a();
                if (a17 != null && a17.getBoolean(str, true)) {
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("key_appid", c0Var.mo48798x74292566());
                    bundle.putInt("key_type", optInt);
                    bundle.putString("key_app_icon", c0Var.t3().E0().f387376f);
                    com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(str2, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.jd.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.kd(c0Var, i17, this));
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a18 = q0Var.a();
                    if (a18 != null) {
                        a18.putBoolean(str, false);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowGuideDialogAfterClose", "illegal params");
        java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 101);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        c0Var.a(i17, u(str3, jSONObject2));
    }
}
