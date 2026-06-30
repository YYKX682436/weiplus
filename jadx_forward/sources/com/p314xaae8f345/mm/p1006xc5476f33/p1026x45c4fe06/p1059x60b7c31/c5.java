package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class c5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f33967x366c91de = 762;

    /* renamed from: NAME */
    private static final java.lang.String f33968x24728b = "createWebViewForFastLoad";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.util.ArrayList arrayList;
        int optInt = jSONObject != null ? jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811) : -1;
        org.json.JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray("itemShowTypes") : null;
        if (optJSONArray == null || optJSONArray.length() == 0) {
            arrayList = new java.util.ArrayList();
        } else {
            arrayList = new java.util.ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i18 = 0; i18 < length; i18++) {
                java.lang.Object obj = optJSONArray.get(i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                arrayList.add(java.lang.Integer.valueOf(obj instanceof java.lang.Integer ? ((java.lang.Number) obj).intValue() : obj instanceof java.lang.String ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) obj, 0) : -1));
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            if (((java.lang.Number) obj2).intValue() != -1) {
                arrayList2.add(obj2);
            }
        }
        java.util.List V0 = kz5.n0.V0(arrayList2);
        java.util.ArrayList arrayList3 = (java.util.ArrayList) V0;
        if (arrayList3.isEmpty()) {
            arrayList3.add(0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCreateWebViewForFastLoad", "createWebViewForFastLoad openScene: %d, itemShowTypeList: %s", java.lang.Integer.valueOf(optInt), V0);
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).w(optInt, V0);
        if (lVar != null) {
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str, jSONObject2));
        }
    }
}
