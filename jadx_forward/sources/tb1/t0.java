package tb1;

/* loaded from: classes7.dex */
public class t0 extends gb1.h {

    /* renamed from: CTRL_INDEX */
    private static final int f76796x366c91de = 331;

    /* renamed from: NAME */
    public static final java.lang.String f76797x24728b = "updateCamera";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("cameraId");
    }

    @Override // gb1.h
    public boolean K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateCamera", "onUpdateView : cameraId=%d", java.lang.Integer.valueOf(i17));
        if (!(view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiUpdateCamera", "the view(%s) is not a instance of CoverViewContainer", java.lang.Integer.valueOf(i17));
            return false;
        }
        android.view.KeyEvent.Callback callback = (android.view.View) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) view).d(android.view.View.class);
        if (callback == null || !(callback instanceof tb1.a0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiUpdateCamera", "the camera view(%s) is null", java.lang.Integer.valueOf(i17));
            return false;
        }
        tb1.a0 a0Var = (tb1.a0) callback;
        jSONObject.optInt("cameraId");
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15509x87ec77fa, "back");
        java.lang.String optString2 = jSONObject.optString("flash", "auto");
        boolean optBoolean = jSONObject.optBoolean("needOutput", false);
        a0Var.mo50749x52b73fda(tVar.mo48798x74292566());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b65610 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610) a0Var;
        c12042x78b65610.k(optString, false);
        a0Var.mo50754x52fbb0ae(optString2);
        a0Var.mo50757xc62f4b39(optBoolean);
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("position");
        int j17 = ik1.w.j(optJSONObject, "width", 0);
        int j18 = ik1.w.j(optJSONObject, "height", 0);
        boolean p17 = (j17 == 0 || j18 == 0) ? false : c12042x78b65610.p(j17, j18, false);
        tb1.y yVar = (tb1.y) tVar.q(tb1.y.class);
        if (yVar != null) {
            int[] a17 = ((uf1.h) yVar).a(tVar);
            if (a17.length == 2 && a17[0] > 0 && a17[1] > 0) {
                a0Var.mo50753xac31fcad(new android.util.Size(a17[0], a17[1]));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateCamera", "onUpdateView screen width: %d, screen height: %d", java.lang.Integer.valueOf(a17[0]), java.lang.Integer.valueOf(a17[1]));
            }
        }
        java.lang.String optString3 = jSONObject.optString("mode");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
            a0Var.mo50756x764d6925(optString3);
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("scanArea");
        if (optJSONArray != null && optJSONArray.length() == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateCamera", "scanAreaArray:%s, scanAreaArray.length:%d", optJSONArray, java.lang.Integer.valueOf(optJSONArray.length()));
            c12042x78b65610.n(ik1.w.c(optJSONArray.optInt(0)), ik1.w.c(optJSONArray.optInt(1)), ik1.w.c(optJSONArray.optInt(2)), ik1.w.c(optJSONArray.optInt(3)));
        }
        a0Var.mo50765x41786917(jSONObject.optInt("scanFreq"));
        if (p17) {
            c12042x78b65610.i();
            c12042x78b65610.h();
        } else {
            c12042x78b65610.r();
        }
        return true;
    }
}
