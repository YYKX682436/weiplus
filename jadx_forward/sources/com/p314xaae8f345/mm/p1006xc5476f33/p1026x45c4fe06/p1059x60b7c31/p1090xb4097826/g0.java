package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826;

/* loaded from: classes7.dex */
public final class g0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34294x366c91de = 1395;

    /* renamed from: NAME */
    public static final java.lang.String f34295x24728b = "openFinderChattingUI";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        if (jSONObject == null || e9Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenFinderChattingUI", "Invoke openFinderChattingUI with params " + jSONObject);
        java.lang.String optString = jSONObject.optString("toUsername");
        int optInt = jSONObject.optInt("sourceType", 0);
        android.content.Context f229340d = e9Var.getF229340d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f229340d, "getContext(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenFinderChattingUIProxy", "enterFinderChattingUI from main process");
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f542005a.l(f229340d, optString, optInt);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenFinderChattingUIProxy", "enterFinderChattingUI from appbrand process");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("userName", optString);
            jSONObject2.put("sourceType", optInt);
            java.lang.String jSONObject3 = jSONObject2.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12132xd6d4b1c5 c12132xd6d4b1c5 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12132xd6d4b1c5(jSONObject3);
            java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(f229340d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, c12132xd6d4b1c5, null, null);
        }
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        try {
            jSONObject4.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        e9Var.a(i17, u(str, jSONObject4));
    }
}
