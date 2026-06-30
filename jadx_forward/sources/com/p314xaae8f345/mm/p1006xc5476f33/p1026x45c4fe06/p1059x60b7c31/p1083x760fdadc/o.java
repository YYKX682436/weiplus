package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc;

/* loaded from: classes7.dex */
public class o extends gb1.d {

    /* renamed from: CTRL_INDEX */
    private static final int f34093x366c91de = 809;

    /* renamed from: NAME */
    public static final java.lang.String f34094x24728b = "insertImagePreviewer";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("viewId");
    }

    @Override // gb1.d
    public android.view.View L(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) tVar;
        android.content.Context f229340d = v5Var.getF229340d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12076x94c2ea2d c12076x94c2ea2d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12076x94c2ea2d(f229340d, null);
        c12076x94c2ea2d.m50869x8504ebb(v5Var);
        c12076x94c2ea2d.m50872x279f85a2(jSONObject.optInt("viewId", 0));
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505(f229340d, c12076x94c2ea2d);
    }

    @Override // gb1.d
    public void N(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        float[] F;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12076x94c2ea2d c12076x94c2ea2d = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12076x94c2ea2d) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) view).d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12076x94c2ea2d.class);
        if (c12076x94c2ea2d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiInsertImagePreviewer", "onInsertView(viewId : %d) failed, targetView is null", java.lang.Integer.valueOf(i17));
            return;
        }
        if1.t.a(view, jSONObject.optJSONObject("style"));
        if1.d.a(c12076x94c2ea2d, jSONObject);
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
            if (jSONObject.has("urls")) {
                java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("urls");
                if (optJSONArray != null) {
                    for (int i27 = 0; i27 < optJSONArray.length(); i27++) {
                        java.lang.String obj = optJSONArray.get(i27).toString();
                        if (!android.text.TextUtils.isEmpty(obj)) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertImagePreviewer", "urls is empty");
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                c12076x94c2ea2d.m50870x76491f2c(arrayList);
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiInsertImagePreviewer", e17, "", new java.lang.Object[0]);
        }
    }
}
