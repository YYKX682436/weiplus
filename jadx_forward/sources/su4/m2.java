package su4;

/* loaded from: classes8.dex */
public class m2 implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        su4.n2 n2Var;
        su4.n2 n2Var2 = su4.n2.Valid;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchConfigLogic", "errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (m1Var instanceof su4.y1) {
            gm0.j1.d().q(1948, su4.o2.f494566f);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6263xa2759cdc c6263xa2759cdc = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6263xa2759cdc();
            am.h20 h20Var = c6263xa2759cdc.f136513g;
            if (i17 == 0 && i18 == 0) {
                su4.y1 y1Var = (su4.y1) m1Var;
                r45.x97 x97Var = y1Var.f494677g;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchConfigLogic", "getWebSearchConfig onSceneEnd %s", x97Var.f471436d);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x97Var.f471436d)) {
                    java.lang.String str2 = y1Var.f494676f.f470527f;
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(x97Var.f471436d);
                        jSONObject.put(dm.i4.f66874x4c6b1f55, java.lang.System.currentTimeMillis());
                        java.lang.String jSONObject2 = jSONObject.toString();
                        gm0.j1.u().c().x(su4.o2.b(str2), jSONObject2);
                        try {
                            ((java.util.HashMap) su4.o2.f494562b).put(jSONObject2, new org.json.JSONObject(jSONObject2));
                        } catch (org.json.JSONException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchConfigLogic", e17, "", new java.lang.Object[0]);
                        }
                        n2Var = n2Var2;
                    } catch (org.json.JSONException unused) {
                        n2Var = su4.n2.Invalid;
                    }
                    if (n2Var == n2Var2) {
                        h20Var.getClass();
                    }
                }
                h20Var.getClass();
            } else {
                h20Var.getClass();
            }
            c6263xa2759cdc.e();
        }
    }
}
