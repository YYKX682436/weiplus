package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes12.dex */
public class u4 implements i40.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.v4 f225331a;

    public u4(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.v4 v4Var) {
        this.f225331a = v4Var;
    }

    @Override // i40.b
    public void a(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("PauseDownloadChatFile", "pauseDownloadChatFile onDownloadFailed, errorType: %d, errorCode: %d, errorMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        this.f225331a.f224975e.b("download failed.");
    }

    @Override // i40.b
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.v4 v4Var = this.f225331a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PauseDownloadChatFile", "pauseDownloadChatFile onDownloadPaused");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("pause", true);
            v4Var.f224975e.f(jSONObject, false);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("PauseDownloadChatFile", "pauseDownloadChatFile json exception: %s", e17.toString());
            v4Var.f224975e.b("download paused json exception");
        }
    }
}
