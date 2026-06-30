package vf1;

/* loaded from: classes7.dex */
public class i extends vf1.a {

    /* renamed from: CTRL_INDEX */
    private static final int f77304x366c91de = 807;

    /* renamed from: NAME */
    public static final java.lang.String f77305x24728b = "updateXWebCamera";

    /* JADX WARN: Multi-variable type inference failed */
    public boolean F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, android.view.Surface surface, tb1.b0 b0Var, org.json.JSONObject jSONObject) {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateXWebCamera", "update xweb camera view");
        if (b0Var == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiUpdateXWebCamera", "the camera view is null");
            return false;
        }
        jSONObject.optInt("cameraId");
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15509x87ec77fa, "back");
        java.lang.String optString2 = jSONObject.optString("flash", "auto");
        boolean optBoolean = jSONObject.optBoolean("needOutput", false);
        b0Var.mo50749x52b73fda(lVar.mo48798x74292566());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b65610 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610) b0Var;
        c12042x78b65610.k(optString, false);
        b0Var.mo50754x52fbb0ae(optString2);
        b0Var.mo50757xc62f4b39(optBoolean);
        if (surface != null) {
            b0Var.mo50766x1e648aba(surface);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateXWebCamera", "set a new surface when update camera");
            z17 = true;
        } else {
            z17 = false;
        }
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("position");
        int j17 = ik1.w.j(optJSONObject, "width", 0);
        int j18 = ik1.w.j(optJSONObject, "height", 0);
        boolean p17 = (j17 == 0 || j18 == 0) ? false : c12042x78b65610.p(j17, j18, false);
        if (lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) {
            int[] a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f5.a((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) lVar);
            b0Var.mo50753xac31fcad(new android.util.Size(a17[0], a17[1]));
        }
        java.lang.String optString3 = jSONObject.optString("mode");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
            b0Var.mo50756x764d6925(optString3);
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("scanArea");
        if (optJSONArray != null && optJSONArray.length() == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateXWebCamera", "scanAreaArray:%s, scanAreaArray.length:%d", optJSONArray, java.lang.Integer.valueOf(optJSONArray.length()));
            c12042x78b65610.n(ik1.w.c(optJSONArray.optInt(0)), ik1.w.c(optJSONArray.optInt(1)), ik1.w.c(optJSONArray.optInt(2)), ik1.w.c(optJSONArray.optInt(3)));
        }
        b0Var.mo50765x41786917(jSONObject.optInt("scanFreq"));
        if (p17 || z17) {
            c12042x78b65610.i();
            c12042x78b65610.h();
        } else {
            c12042x78b65610.r();
        }
        return true;
    }
}
