package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes12.dex */
public class q7 implements w65.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.r7 f225289d;

    public q7(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.r7 r7Var) {
        this.f225289d = r7Var;
    }

    @Override // w65.o
    public void P2(w65.p pVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.r7 r7Var = this.f225289d;
        if (java.util.Objects.equals(r7Var.f225302g, pVar.f524896b.id())) {
            java.lang.String str = r7Var.f380556d;
            java.lang.Float valueOf = java.lang.Float.valueOf(pVar.f524898d);
            w65.q qVar = pVar.f524895a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StartDownloadChatFile", "apiName: %s, onWeTaskEvent %s, %s", str, qVar, valueOf);
            int ordinal = qVar.ordinal();
            if (ordinal == 2) {
                try {
                    int i17 = (int) pVar.f524898d;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("complete", false);
                    jSONObject.put("progress", i17);
                    r7Var.f224975e.f(jSONObject, true);
                    return;
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StartDownloadChatFile", "%s json exception: %s", r7Var.f380556d, e17.toString());
                    r7Var.f224975e.b("download progress json exception");
                    return;
                }
            }
            if (ordinal == 4) {
                try {
                    try {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        if (pVar.f524897c >= 0) {
                            jSONObject2.put("complete", true);
                        } else {
                            jSONObject2.put("pause", true);
                        }
                        r7Var.f224975e.f(jSONObject2, false);
                    } catch (org.json.JSONException e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StartDownloadChatFile", "%s json exception: %s", r7Var.f380556d, e18.toString());
                        r7Var.f224975e.b("download succeed json exception");
                    }
                    return;
                } finally {
                }
            }
            if (ordinal == 5 || ordinal == 6) {
                try {
                    try {
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        jSONObject3.put("pause", true);
                        r7Var.f224975e.f(jSONObject3, false);
                    } catch (org.json.JSONException e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StartDownloadChatFile", "%s json exception: %s", r7Var.f380556d, e19.toString());
                        r7Var.f224975e.b("download paused json exception");
                    }
                } finally {
                }
            }
        }
    }
}
