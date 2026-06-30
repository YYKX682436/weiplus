package yd1;

/* loaded from: classes7.dex */
public class t extends yd1.k {

    /* renamed from: CTRL_INDEX */
    public static final int f77539x366c91de = 687;

    /* renamed from: NAME */
    public static final java.lang.String f77540x24728b = "operateMediaTrack";

    @Override // yd1.k
    public void F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaTrack", "hy: %s %s", f77540x24728b, jSONObject.toString());
        java.lang.String optString = jSONObject.optString("operationType");
        if (optString.equalsIgnoreCase("get")) {
            java.lang.String optString2 = jSONObject.optString(ya.b.f77502x92235c1b);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
                c0Var.a(i17, o(java.lang.String.format("fail: parmas error %s", jSONObject.toString())));
                return;
            }
            try {
                if (optString2.startsWith("wxfile://")) {
                    jSONObject.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, c0Var.t3().mo48802x59eafec1().mo49301x1d537609(optString2, false).o());
                } else {
                    jSONObject.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, optString2);
                }
                ta1.q0 E = E(c0Var);
                E.f498198a.m77784x795fa299(new ta1.l(E, jSONObject, new yd1.p(this, c0Var, i17)));
                return;
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaTrack", e17, "getMediaTrack fail, JSONException", new java.lang.Object[0]);
                c0Var.a(i17, o(java.lang.String.format("fail: error %s", e17.getMessage())));
                return;
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaTrack", e18, "getMediaTrack fail, Exception", new java.lang.Object[0]);
                c0Var.a(i17, o(java.lang.String.format("fail: error %s", e18.getMessage())));
                return;
            }
        }
        if (optString.equalsIgnoreCase("create")) {
            ta1.q0 E2 = E(c0Var);
            E2.f498198a.m77784x795fa299(new ta1.n(E2, jSONObject, new yd1.q(this, c0Var, i17)));
            return;
        }
        if (optString.equalsIgnoreCase("update")) {
            try {
                ta1.q0 E3 = E(c0Var);
                E3.f498198a.m77784x795fa299(new ta1.p(E3, jSONObject, new yd1.r(this, c0Var, i17)));
                return;
            } catch (java.lang.Exception e19) {
                c0Var.a(i17, o(java.lang.String.format("fail: error %s", e19.getMessage())));
                return;
            }
        }
        if (!optString.equalsIgnoreCase("remove")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaTrack", "hy: invalid operate type: %s", optString);
            c0Var.a(i17, o(java.lang.String.format("fail: not valid operate type: %s", optString)));
        } else {
            ta1.q0 E4 = E(c0Var);
            E4.f498198a.m77784x795fa299(new ta1.r(E4, jSONObject, new yd1.s(this, c0Var, i17)));
        }
    }
}
