package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc;

/* loaded from: classes7.dex */
public class g0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    private static final int f34077x366c91de = -2;

    /* renamed from: NAME */
    private static final java.lang.String f34078x24728b = "measureTextString";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("size");
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("label");
        if (optJSONObject == null || optJSONObject2 == null) {
            return o("fail:invalid data");
        }
        int j17 = ik1.w.j(optJSONObject, "width", Integer.MAX_VALUE);
        if (j17 < 0) {
            j17 = Integer.MAX_VALUE;
        }
        int j18 = ik1.w.j(optJSONObject, "height", Integer.MAX_VALUE);
        int i17 = j18 >= 0 ? j18 : Integer.MAX_VALUE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.b(lVar.mo50352x76847179() == null ? android.content.res.Resources.getSystem() : lVar.mo50352x76847179().getResources(), j17);
        if1.j.b(bVar, optJSONObject2);
        mm0.g a17 = bVar.f162208f.a();
        float f17 = 0.0f;
        int i18 = 0;
        while (true) {
            android.text.StaticLayout staticLayout = a17.f410144k;
            if (i18 >= staticLayout.getLineCount()) {
                float min = java.lang.Math.min(staticLayout.getHeight(), i17);
                java.util.HashMap hashMap = new java.util.HashMap(2);
                hashMap.put("width", java.lang.Float.valueOf(((float) java.lang.Math.ceil(f17)) / ik1.w.f()));
                hashMap.put("height", java.lang.Float.valueOf(min / ik1.w.f()));
                return p("ok", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.f0(this, hashMap));
            }
            f17 = java.lang.Math.max(f17, staticLayout.getLineWidth(i18));
            i18++;
        }
    }
}
