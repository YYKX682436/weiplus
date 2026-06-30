package gb1;

/* loaded from: classes7.dex */
public abstract class f extends gb1.i {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        B(lVar, jSONObject, i17, lVar.mo50357xcd94f799());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            I(lVar, c0Var, jSONObject, i17);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new gb1.e(this, lVar, c0Var, jSONObject, i17));
        }
    }

    public final void I(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        boolean z17;
        if (!lVar.c(k(), c0Var)) {
            lVar.a(i17, "fail:interrupted");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseRemoveViewJsApi", "invoke JsApi(%s) failed, component view is null", k());
            str = android.text.TextUtils.isEmpty("fail:ComponentView is null.") ? "fail:internal error" : "fail:ComponentView is null.";
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str, jSONObject2));
            return;
        }
        if (E.mo51311x3eebbc35() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseRemoveViewJsApi", "fail, component custom view container is null");
            str = android.text.TextUtils.isEmpty("fail:remove view failed") ? "fail:internal error" : "fail:remove view failed";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i17, u(str, jSONObject3));
            return;
        }
        try {
            int H = H(jSONObject);
            boolean optBoolean = jSONObject.optBoolean("independent", false);
            android.view.View o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia) E.M(optBoolean)).o(H);
            if ((o17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) && jSONObject.has("draggable") && jSONObject.optBoolean("draggable", false)) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) o17).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505.C.remove(java.lang.Integer.valueOf(H));
            }
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia) E.M(optBoolean)).p(H) != null) {
                z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia) E.M(optBoolean)).r(H);
                if (z17) {
                    z17 = J(E, H, o17, jSONObject);
                }
            } else {
                z17 = false;
            }
            if (z17) {
                E.M(optBoolean).a(H);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRemoveViewJsApi", "remove view(parentId : %s, viewId : %s, r : %s)", java.lang.Integer.valueOf(jSONObject.optInt("parentId", 0)), java.lang.Integer.valueOf(H), java.lang.Boolean.valueOf(z17));
            lVar.a(i17, r(null, z17 ? jc1.f.f380445a : jc1.f.f380448d, null));
        } catch (org.json.JSONException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseRemoveViewJsApi", "get viewId error. exception : %s", e19);
            str = android.text.TextUtils.isEmpty("fail:view id do not exist") ? "fail:internal error" : "fail:view id do not exist";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 4);
            } catch (java.lang.Exception e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
            }
            lVar.a(i17, u(str, jSONObject4));
        }
    }

    public boolean J(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        return true;
    }
}
