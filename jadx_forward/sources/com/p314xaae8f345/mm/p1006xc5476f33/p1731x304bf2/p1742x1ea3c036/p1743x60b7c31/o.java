package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public class o extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f221251g = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.m.b(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.l.ONE_MONTH) + "haowan/";

    /* renamed from: h, reason: collision with root package name */
    public static final int f221252h = 62784;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f221253e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f221254f;

    @Override // sd.c
    public java.lang.String b() {
        return "chooseHaowanMedia";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        org.json.JSONObject e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.e(str);
        if (e17 == null) {
            q5Var.a("invalid_params", null);
            return;
        }
        int optInt = e17.optInt("mediaType", 3);
        e17.optString("mediaTag");
        int optInt2 = e17.optInt("limitCount", 9);
        int optInt3 = e17.optInt("galleryType");
        org.json.JSONArray optJSONArray = e17.optJSONArray("albumInfos");
        boolean optBoolean = e17.optBoolean("ignoreVideoPreview", true);
        int optInt4 = e17.optInt("sourceSceneId");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_can_select_video_and_pic", true);
        intent.putExtra("key_send_raw_image", false);
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).m78545xde66c1f2(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.m(this, q5Var, context));
        intent.putExtra("max_select_count", optInt2);
        intent.putExtra("query_source_type", 15);
        intent.putExtra("query_media_type", optInt);
        intent.putExtra("show_header_view", false);
        intent.addFlags(67108864);
        if (optJSONArray != null) {
            intent.putExtra("game_haowan_local_albums_info", optJSONArray.toString());
        }
        intent.putExtra("game_haowan_ignore_video_preview", optBoolean);
        intent.putExtra("game_haowan_source_scene_id", optInt4);
        int i17 = f221252h;
        if (optInt3 == 2) {
            j45.l.n(context, "game", ".media.GameTabGalleryUI", intent, i17);
        } else {
            if (optInt3 != 1) {
                q5Var.a("galleryType is invalid", null);
                return;
            }
            j45.l.n(context, "game", ".media.GamePublishGalleryUI", intent, i17);
        }
        ((android.app.Activity) context).overridePendingTransition(com.p314xaae8f345.mm.ui.uc.f292611a, com.p314xaae8f345.mm.ui.uc.f292612b);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}
