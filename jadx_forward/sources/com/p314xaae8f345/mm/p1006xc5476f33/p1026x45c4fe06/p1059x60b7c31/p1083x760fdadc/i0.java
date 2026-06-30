package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc;

/* loaded from: classes7.dex */
public class i0 extends gb1.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34081x366c91de = 255;

    /* renamed from: NAME */
    public static final java.lang.String f34082x24728b = "removeImageView";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("viewId");
    }

    @Override // gb1.f
    public boolean J(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        tVar.M(jSONObject.optBoolean("independent", false)).a(i17);
        return true;
    }
}
