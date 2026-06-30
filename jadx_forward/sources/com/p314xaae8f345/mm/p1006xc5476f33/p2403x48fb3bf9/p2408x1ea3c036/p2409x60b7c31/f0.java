package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class f0 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.g0 f263838d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.g0 g0Var) {
        this.f263838d = g0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.g0 g0Var = this.f263838d;
        if (i17 == (g0Var.hashCode() & 65535)) {
            if (i18 != -1) {
                if (i18 != 0) {
                    g0Var.h("fail", null);
                    return;
                } else {
                    g0Var.h("cancel", null);
                    return;
                }
            }
            if (intent == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "mmOnActivityResult REQUEST_CHOOSE_MEDIA bundle is null,");
                g0Var.h("fail", null);
                return;
            }
            int intExtra = intent.getIntExtra("key_pick_local_media_callback_type", 0);
            if (intExtra != 1) {
                if (intExtra != 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "type:%d is error", java.lang.Integer.valueOf(intExtra));
                    g0Var.h("fail", null);
                    return;
                }
                java.lang.String stringExtra = intent.getStringExtra("key_pick_local_media_local_ids");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "chooseMedia localIds:%s", stringExtra);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "mmOnActivityResult REQUEST_CHOOSE_MEDIA image localIds is null");
                    g0Var.h("fail", null);
                    return;
                } else {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("type", 2);
                    hashMap.put("localIds", stringExtra);
                    g0Var.h("", hashMap);
                    return;
                }
            }
            java.lang.String stringExtra2 = intent.getStringExtra("key_pick_local_media_local_id");
            java.lang.String stringExtra3 = intent.getStringExtra("key_pick_local_media_thumb_local_id");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "video localId:%s", stringExtra2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "video thumbLocalId:%s", stringExtra3);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "mmOnActivityResult REQUEST_CHOOSE_MEDIA video localId is null");
                g0Var.h("fail", null);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.a(stringExtra2);
            if (a17 == null || !(a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19287x4a9b6f36)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "mmOnActivityResult REQUEST_CHOOSE_MEDIA nor the videoitem");
                g0Var.h("fail", null);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19287x4a9b6f36 c19287x4a9b6f36 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19287x4a9b6f36) a17;
            java.lang.String i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.i(stringExtra2, stringExtra3, c19287x4a9b6f36.f264287w, c19287x4a9b6f36.f264278q, c19287x4a9b6f36.f264277p, c19287x4a9b6f36.f264276o);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "after parse to json data : %s", i19);
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("type", 1);
            hashMap2.put("localIds", i19);
            g0Var.h("", hashMap2);
        }
    }
}
