package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826;

/* loaded from: classes.dex */
public final class f1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34290x366c91de = 1275;

    /* renamed from: NAME */
    public static final java.lang.String f34291x24728b = "showLiveToast";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        if (e9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Finder.JsApiShowFinderLiveToast", "invoke, env is null");
            return;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Finder.JsApiShowFinderLiveToast", "invoke, data is null");
            e9Var.a(i17, o("fail:data is null"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Finder.JsApiShowFinderLiveToast", "JsApiShowFinderLiveToast json:" + jSONObject);
        java.lang.String optString = jSONObject.optString("toastContent");
        jSONObject.optInt("duration");
        java.lang.String optString2 = jSONObject.optString("icon");
        if (e9Var.getF229340d() != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.e1(optString2, e9Var, optString, jSONObject));
        }
    }
}
