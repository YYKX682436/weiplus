package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public class m implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 f221244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f221245e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.o f221246f;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.o oVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var, android.content.Context context) {
        this.f221246f = oVar;
        this.f221244d = q5Var;
        this.f221245e = context;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i17 == com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.o.f221252h) {
            if (i18 == -1) {
                java.lang.String stringExtra = intent.getStringExtra("key_video_info");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                    java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("CropImage_OutputPath_List");
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(stringArrayListExtra)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.o oVar = this.f221246f;
                        android.content.Context context = this.f221245e;
                        oVar.f221254f = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.n(oVar);
                        oVar.f221253e = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6v), true, false, oVar.f221254f);
                        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.l(this, stringArrayListExtra, intent));
                    } else if (intent.getBooleanExtra("key_game_haowan_text", false)) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        try {
                            jSONObject.put("type", 3);
                            jSONObject.put("appId", intent.getStringExtra("key_game_video_appid"));
                            jSONObject.put("appName", intent.getStringExtra("key_game_video_appname"));
                        } catch (org.json.JSONException unused) {
                        }
                        this.f221244d.a(null, jSONObject);
                    } else {
                        this.f221244d.a("cancel", null);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseHaowanMedia", "video, result: %s", stringExtra);
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        jSONObject2.put("type", 2);
                        if (intent.getBooleanExtra("key_game_video_encode_json_array", false)) {
                            jSONObject2.put("localIds", new org.json.JSONArray(stringExtra));
                        } else {
                            jSONObject2.put("localIds", stringExtra);
                        }
                        jSONObject2.put("appId", intent.getStringExtra("key_game_video_appid"));
                        jSONObject2.put("appName", intent.getStringExtra("key_game_video_appname"));
                        jSONObject2.put("transInfo", intent.getStringExtra("key_game_trans_info"));
                        jSONObject2.put("pageType", intent.getIntExtra("key_game_video_page_type", 0));
                    } catch (org.json.JSONException unused2) {
                    }
                    this.f221244d.a(null, jSONObject2);
                }
            } else {
                this.f221244d.a("cancel", null);
            }
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) this.f221245e).m78545xde66c1f2(null);
        }
    }
}
