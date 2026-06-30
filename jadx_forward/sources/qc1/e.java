package qc1;

/* loaded from: classes7.dex */
public final class e extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f76431x366c91de = 70;

    /* renamed from: NAME */
    public static final java.lang.String f76432x24728b = "hideKeyboard";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.Integer num;
        try {
            num = java.lang.Integer.valueOf(jSONObject.getInt("inputId"));
        } catch (org.json.JSONException unused) {
            num = null;
        }
        ik1.h0.b(new qc1.d(this, lVar, num, i17));
    }
}
