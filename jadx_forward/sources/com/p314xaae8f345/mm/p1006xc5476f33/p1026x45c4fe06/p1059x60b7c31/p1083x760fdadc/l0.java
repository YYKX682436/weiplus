package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc;

/* loaded from: classes7.dex */
public class l0 extends gb1.h {

    /* renamed from: CTRL_INDEX */
    private static final int f34087x366c91de = 810;

    /* renamed from: NAME */
    public static final java.lang.String f34088x24728b = "updateImagePreviewer";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("viewId");
    }

    @Override // gb1.h
    public boolean K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        float[] F;
        if (!(view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiUpdateImagePreviewer", "the view(%s) is not a instance of CoverViewContainer", java.lang.Integer.valueOf(i17));
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12076x94c2ea2d c12076x94c2ea2d = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12076x94c2ea2d) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) view).d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12076x94c2ea2d.class);
        if (c12076x94c2ea2d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiUpdateImagePreviewer", "the target view(%s) is null", java.lang.Integer.valueOf(i17));
            return false;
        }
        if1.t.a(view, jSONObject.optJSONObject("style"));
        try {
            if (jSONObject.has("position") && (F = F(jSONObject)) != null) {
                int i18 = (int) F[2];
                int i19 = (int) F[3];
                c12076x94c2ea2d.f162196p1 = i18;
                c12076x94c2ea2d.f162198x1 = i19;
            }
            if (jSONObject.has("scale")) {
                c12076x94c2ea2d.m50871x53aeca08((float) jSONObject.optDouble("scale"));
            }
            if (!jSONObject.has("urls")) {
                return true;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("urls");
            if (optJSONArray != null) {
                for (int i27 = 0; i27 < optJSONArray.length(); i27++) {
                    java.lang.String obj = optJSONArray.get(i27).toString();
                    if (!android.text.TextUtils.isEmpty(obj)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiUpdateImagePreviewer", "urls is empty");
            }
            if (arrayList.isEmpty()) {
                return true;
            }
            c12076x94c2ea2d.f(arrayList);
            return true;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiUpdateImagePreviewer", e17, "", new java.lang.Object[0]);
            return true;
        }
    }
}
