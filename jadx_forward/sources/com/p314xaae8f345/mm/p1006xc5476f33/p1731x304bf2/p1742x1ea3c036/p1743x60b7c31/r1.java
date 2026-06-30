package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public class r1 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f221275d;

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.s1 s1Var, sd.b bVar) {
        this.f221275d = bVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i17 == 510) {
            sd.b bVar = this.f221275d;
            if (i18 == -1) {
                int intExtra = intent.getIntExtra("webview_callback_err", 0);
                if (intExtra == 0) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("videoInfo", new org.json.JSONArray(intent.getStringExtra("key_video_info")).getJSONObject(0));
                    } catch (org.json.JSONException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLaunchGameVideoEditor", "json_err:%s", e17.getMessage());
                    }
                    bVar.e(jSONObject);
                } else if (intExtra == 1) {
                    bVar.c("cancel", null);
                } else if (intExtra == 2) {
                    bVar.c("download_err", null);
                }
            } else {
                bVar.c("cancel", null);
            }
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) bVar.f488129a).f488143d).m78545xde66c1f2(null);
        }
    }
}
