package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class c3 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "previewVideo";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameJsApiPreviewVideo", "invoke");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f488130b.f426039c.optString(dm.i4.f66867x2a5c95c7))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameJsApiPreviewVideo", "data is invalid");
            bVar.c("invalid_data", null);
            return;
        }
        java.lang.String optString = bVar.f488130b.f426039c.optString(dm.i4.f66867x2a5c95c7);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameJsApiPreviewVideo", "localId:%s", optString);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).f488143d;
        abstractActivityC21394xb3d2c0cf.m78545xde66c1f2(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.b3(this, bVar, abstractActivityC21394xb3d2c0cf));
        android.content.Intent intent = new android.content.Intent();
        if ((optString == null ? "" : optString).trim().startsWith("weixin://bgmixid/")) {
            if (optString == null) {
                optString = "";
            }
            intent.putExtra("game_bg_mix_fake_local_id", optString.trim());
            j45.l.n(abstractActivityC21394xb3d2c0cf, "game", ".media.background.GameFakeVideoUI", intent, hashCode() & 65535);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.a(optString);
        if (a17 == null || android.text.TextUtils.isEmpty(a17.f264271g) || !com.p314xaae8f345.mm.vfs.w6.j(a17.f264271g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameJsApiPreviewVideo", "the item is null or the File item not exist for localId: %s", optString);
            bVar.c("fail", null);
        } else {
            intent.putExtra("key_video_path", a17.f264271g);
            j45.l.n(abstractActivityC21394xb3d2c0cf, "card", ".ui.CardGiftVideoUI", intent, hashCode() & 65535);
        }
    }
}
