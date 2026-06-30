package yd1;

/* loaded from: classes7.dex */
public class o extends yd1.k {

    /* renamed from: CTRL_INDEX */
    public static final int f77537x366c91de = 686;

    /* renamed from: NAME */
    public static final java.lang.String f77538x24728b = "operateMediaContainer";

    @Override // yd1.k
    public void F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaContainer", "hy: %s %s", f77538x24728b, jSONObject.toString());
        java.lang.String optString = jSONObject.optString("operationType");
        if (optString.equalsIgnoreCase("create")) {
            ta1.q0 E = E(c0Var);
            yd1.l lVar = new yd1.l(this, c0Var, i17);
            E.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger createMediaContainer");
            E.f498198a.m77784x795fa299(new ta1.j(E, jSONObject, lVar));
            return;
        }
        if (!optString.equalsIgnoreCase(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47245x96f5d2e7)) {
            if (!optString.equalsIgnoreCase("remove")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaContainer", "hy: invalid operate type: %s", optString);
                c0Var.a(i17, o(java.lang.String.format("fail: not valid operate type: %s", optString)));
                return;
            } else {
                ta1.q0 E2 = E(c0Var);
                E2.f498198a.m77784x795fa299(new ta1.v(E2, jSONObject, new yd1.n(this, c0Var, i17)));
                return;
            }
        }
        int optInt = jSONObject.optInt("containerId");
        java.lang.String optString2 = jSONObject.optString("mimeType");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            c0Var.a(i17, o(java.lang.String.format("fail: parmas error %s", jSONObject.toString())));
            return;
        }
        java.lang.String str = "export_" + optInt + "_" + java.lang.System.currentTimeMillis() + "." + optString2;
        yd1.j C = C(c0Var, str, true);
        if (C != null) {
            java.lang.String str2 = C.f542536a;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(C.f542537b)) {
                try {
                    jSONObject.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, str2);
                    ta1.q0 E3 = E(c0Var);
                    E3.f498198a.m77784x795fa299(new ta1.t(E3, jSONObject, new yd1.m(this, C, c0Var, optString2, i17, str)));
                    return;
                } catch (org.json.JSONException e17) {
                    c0Var.a(i17, o(java.lang.String.format("fail: error %s", e17.getMessage())));
                    return;
                } catch (java.lang.Exception e18) {
                    c0Var.a(i17, o(java.lang.String.format("fail: error %s", e18.getMessage())));
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaContainer", "hy: %s, alloc file failed", f77538x24728b);
        c0Var.a(i17, o(java.lang.String.format("fail: internal create file failed", new java.lang.Object[0])));
    }
}
