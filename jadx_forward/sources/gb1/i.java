package gb1;

/* loaded from: classes7.dex */
public abstract class i extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {
    public void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
    }

    public final android.view.View D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        try {
            int H = H(jSONObject);
            boolean optBoolean = jSONObject.optBoolean("independent", false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t E = E(lVar, jSONObject);
            if (E == null) {
                throw new java.lang.IllegalArgumentException("ComponentView is null.");
            }
            android.view.View o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia) E.M(optBoolean)).o(H);
            if (o17 != null) {
                return o17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseViewOperateJsApi", "get view by viewId(%s) return null.", java.lang.Integer.valueOf(H));
            throw new java.lang.IllegalArgumentException("got 'null' when get view by the given viewId");
        } catch (org.json.JSONException unused) {
            throw new java.lang.IllegalArgumentException("view id do not exist");
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t E(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        gb1.k kVar = (gb1.k) lVar.q(gb1.k.class);
        if (kVar != null) {
            return kVar.Q(lVar, jSONObject);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseViewOperateJsApi", "getComponentView NULL IComponentConverter");
        return null;
    }

    public float[] F(org.json.JSONObject jSONObject) {
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONObject.optString("position"));
            float h17 = ik1.w.h(jSONObject2, "left", 0.0f);
            float h18 = ik1.w.h(jSONObject2, "top", 0.0f);
            float h19 = ik1.w.h(jSONObject2, "width", 0.0f);
            float h27 = ik1.w.h(jSONObject2, "height", 0.0f);
            float f17 = Float.NaN;
            if (!android.text.TextUtils.isEmpty("zIndex")) {
                double optDouble = jSONObject.optDouble("zIndex", Float.NaN);
                if (!java.lang.Double.isNaN(optDouble)) {
                    f17 = (float) optDouble;
                }
            }
            return new float[]{h17, h18, h19, h27, f17};
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public java.lang.Boolean G(org.json.JSONObject jSONObject) {
        return null;
    }

    public int H(org.json.JSONObject jSONObject) {
        throw new org.json.JSONException("viewId do not exist, override the method getViewId(data).");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public boolean z() {
        return true;
    }
}
