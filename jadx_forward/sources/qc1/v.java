package qc1;

/* loaded from: classes7.dex */
public class v extends qc1.a {

    /* renamed from: CTRL_INDEX */
    public static final int f76445x366c91de = 1;

    /* renamed from: NAME */
    public static final java.lang.String f76446x24728b = "showKeyboard";

    public void H(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0 q0Var) {
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0 I(java.lang.ref.WeakReference weakReference, java.lang.String str, int i17) {
        return new qc1.t(this, weakReference, i17, str);
    }

    public final void J(int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
        try {
            int e17 = ik1.w.e(i18);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("inputId", i17);
                try {
                    jSONObject.put("height", e17);
                    v5Var.g("onKeyboardShow", jSONObject.toString());
                    v5Var.t2(e17);
                } catch (org.json.JSONException e18) {
                    throw new cl0.f(e18);
                }
            } catch (org.json.JSONException e19) {
                throw new cl0.f(e19);
            }
        } catch (cl0.f e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShowKeyboard", "", e27.getMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, org.json.JSONObject jSONObject, int i17) {
        int optInt;
        int optInt2 = jSONObject.optInt("cursor", -2);
        if (jSONObject.has("selectionStart") || jSONObject.has("selectionEnd")) {
            optInt2 = jSONObject.optInt("selectionStart", -2);
            optInt = jSONObject.optInt("selectionEnd", -2);
        } else {
            optInt = optInt2;
        }
        try {
            int i18 = jSONObject.getInt("inputId");
            if (!(this instanceof qc1.i)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new qc1.o(this, v5Var, i18, optInt2, optInt, i17));
                return;
            }
        } catch (org.json.JSONException unused) {
        }
        pl1.f fVar = new pl1.f();
        if (M(fVar, jSONObject, v5Var, i17)) {
            if (!jSONObject.has("inputId")) {
                int hashCode = (v5Var.hashCode() + "#" + java.lang.System.currentTimeMillis() + "#" + java.lang.System.nanoTime()).hashCode();
                fVar.Q = hashCode;
                J(hashCode, 0, v5Var);
            }
            ik1.h0.b(new qc1.p(this, v5Var, optInt2, optInt, c75.c.e(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306), fVar, i17));
        }
    }

    public final void L(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2 q2Var;
        if (v5Var == null || (q2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2) v5Var.t3().K1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2.class)) == null || !q2Var.g4()) {
            return;
        }
        J(i17, i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 240), v5Var);
    }

    public boolean M(pl1.f fVar, org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, int i17) {
        org.json.JSONObject optJSONObject;
        if (!G(fVar, jSONObject, v5Var, i17)) {
            return false;
        }
        fVar.P = jSONObject.optInt("parentId");
        fVar.Q = jSONObject.optInt("inputId");
        fVar.f438121b = java.lang.Integer.valueOf(java.lang.Math.max(0, fVar.f438121b.intValue()));
        java.lang.Integer num = fVar.f438122c;
        fVar.f438122c = java.lang.Integer.valueOf(num == null ? 0 : java.lang.Math.max(0, num.intValue()));
        fVar.R = jSONObject.optString("type", com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24);
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r1.f173175e.contains(fVar.R)) {
            v5Var.a(i17, o("fail:unsupported input type"));
            return false;
        }
        if (fVar.B == null) {
            fVar.B = java.lang.Boolean.TRUE;
        }
        fVar.S = jSONObject.optBoolean("password");
        fVar.F = java.lang.Boolean.valueOf(jSONObject.optBoolean("password"));
        if (jSONObject.has("showCoverView")) {
            fVar.G = java.lang.Boolean.valueOf(jSONObject.optBoolean("showCoverView", false));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h6.c(jSONObject, fVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l4.c(jSONObject, fVar);
        if ((!(this instanceof qc1.i)) && (optJSONObject = jSONObject.optJSONObject("dropdown")) != null) {
            pl1.a aVar = new pl1.a();
            optJSONObject.optInt("marginLeft");
            optJSONObject.optInt("marginRight");
            aVar.f438108a = optJSONObject.optString("width");
            org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("options");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                aVar.f438109b = new java.util.ArrayList();
                for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                    org.json.JSONObject optJSONObject2 = optJSONArray.optJSONObject(i18);
                    if (optJSONObject2 != null) {
                        java.lang.String optString = optJSONObject2.optString(dm.i4.f66865x76d1ec5a);
                        java.lang.String optString2 = optJSONObject2.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                        java.lang.String optString3 = optJSONObject2.optString("content");
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
                            pl1.b bVar = new pl1.b();
                            bVar.f438110a = optString;
                            bVar.f438111b = optString2;
                            bVar.f438112c = optString3;
                            aVar.f438109b.add(bVar);
                        }
                    }
                }
                fVar.V = aVar;
            }
        }
        return true;
    }
}
