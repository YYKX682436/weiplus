package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public class v3 implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 f221292a;

    public v3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.w3 w3Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        this.f221292a = q5Var;
    }

    @Override // j35.a
    public void a(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        org.json.JSONObject jSONObject;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiRequestOverlayPermission", "float window permission granted");
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
        try {
            jSONObject = new org.json.JSONObject();
            jSONObject.put("ret", 0);
        } catch (org.json.JSONException unused) {
            jSONObject = null;
        }
        this.f221292a.a(null, jSONObject);
    }

    @Override // j35.a
    public void b(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        org.json.JSONObject jSONObject;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiRequestOverlayPermission", "onResultCancel ok:%b", java.lang.Boolean.valueOf(((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)));
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
        try {
            jSONObject = new org.json.JSONObject();
            jSONObject.put("ret", -1);
        } catch (org.json.JSONException unused) {
            jSONObject = null;
        }
        this.f221292a.a(null, jSONObject);
    }

    @Override // j35.a
    public void c(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        org.json.JSONObject jSONObject;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiRequestOverlayPermission", "float window permission refused");
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
        try {
            jSONObject = new org.json.JSONObject();
            jSONObject.put("ret", -1);
        } catch (org.json.JSONException unused) {
            jSONObject = null;
        }
        this.f221292a.a(null, jSONObject);
    }
}
