package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class rc extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.oc {

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f268033c;

    public rc(java.lang.String str) {
        super(str);
        this.f268033c = new java.util.ArrayList();
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                this.f267949a = true;
            }
            org.json.JSONArray jSONArray = str != null ? new org.json.JSONArray(str) : null;
            if (jSONArray != null) {
                c75.c.d(jSONArray, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.pc(this));
            }
        } catch (java.lang.RuntimeException e17) {
            this.f267950b = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShareCustomContent", "CustomData: RuntimeException, e = " + e17.getMessage());
        } catch (org.json.JSONException e18) {
            this.f267950b = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShareCustomContent", "CustomData: JSONException, e = " + e18.getMessage());
        }
    }

    public boolean a() {
        if (!this.f267949a) {
            return true;
        }
        if (this.f267950b) {
            return false;
        }
        for (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.qc qcVar : this.f268033c) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qcVar.f267994a) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qcVar.f267996c) || qcVar.f267997d == null) {
                return false;
            }
        }
        return true;
    }
}
