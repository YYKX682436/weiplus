package tb1;

/* loaded from: classes7.dex */
public class s0 extends gb1.f {

    /* renamed from: CTRL_INDEX */
    private static final int f76794x366c91de = 330;

    /* renamed from: NAME */
    public static final java.lang.String f76795x24728b = "removeCamera";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("cameraId", 0);
    }

    @Override // gb1.f
    public boolean J(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRemoveCamera", "onRemoveView cameraId=%d", java.lang.Integer.valueOf(i17));
        if (!(view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiRemoveCamera", "the view(%s) is not a instance of CoverViewContainer", java.lang.Integer.valueOf(i17));
            return false;
        }
        android.view.KeyEvent.Callback callback = (android.view.View) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) view).d(android.view.View.class);
        if (callback == null || !(callback instanceof tb1.a0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiRemoveCamera", "the camera view(%s) is null", java.lang.Integer.valueOf(i17));
            return false;
        }
        tb1.a0 a0Var = (tb1.a0) callback;
        tVar.I(a0Var);
        tVar.O(a0Var);
        tVar.K(a0Var);
        tb1.b.f498422a.b(a0Var.mo50746x72efd496(), true);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610) a0Var).i();
        return true;
    }
}
