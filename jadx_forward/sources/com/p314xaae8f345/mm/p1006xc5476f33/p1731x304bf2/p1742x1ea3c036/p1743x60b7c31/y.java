package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public class y extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "downloadGameVideo";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("videoUrl", "");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                q5Var.a("videoUrl is null", null);
                return;
            }
            java.lang.String optString2 = jSONObject.optString("thumbUrl", "");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
                q5Var.a("thumbUrl is null", null);
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("game_from", 11);
            intent.putExtra("video_url", optString);
            intent.putExtra("thumb_url", optString2);
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).m78545xde66c1f2(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.x(this, q5Var, context));
            j45.l.n(context, "game", ".media.GameVideoDownloadUI", intent, 1137);
        } catch (org.json.JSONException unused) {
            q5Var.a("fail", null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}
