package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class b0 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e3.f34476x24728b;
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
        int i17;
        java.lang.Boolean bool;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseImage", "invoke");
        org.json.JSONObject jSONObject = bVar.f488130b.f426039c;
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("sourceType");
        if (optJSONArray != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseImage", "sourceType = " + optJSONArray.toString());
            i17 = 0;
            for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                if (optJSONArray.optString(i18).equals(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37635xb5a3973f)) {
                    i17 |= 1;
                } else if (optJSONArray.optString(i18).equals("camera")) {
                    i17 |= 2;
                }
            }
        } else {
            i17 = 0;
        }
        if (i17 == 0) {
            i17 = 3;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseImage", "real scene = %d", java.lang.Integer.valueOf(i17));
        if (i17 == 2) {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.app.Activity activity = (android.app.Activity) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).f488143d;
            ((sb0.f) jVar).getClass();
            if (!j35.u.a(activity, "android.permission.CAMERA", 113, "", "")) {
                bVar.c("android_permission_denied", null);
                return;
            }
        }
        int optInt = jSONObject.optInt("count", 0);
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("sizeType");
        java.lang.Boolean bool3 = bool2;
        if (optJSONArray2 != null) {
            for (int i19 = 0; i19 < optJSONArray2.length(); i19++) {
                if (optJSONArray2.optString(i19).equals("original")) {
                    bool2 = java.lang.Boolean.TRUE;
                } else if (optJSONArray2.optString(i19).equals("compressed")) {
                    bool3 = java.lang.Boolean.TRUE;
                }
            }
        }
        int i27 = 7;
        if (bool2.booleanValue() && !bool3.booleanValue()) {
            bool = java.lang.Boolean.TRUE;
        } else if (bool2.booleanValue() || !bool3.booleanValue()) {
            bool = java.lang.Boolean.FALSE;
            i27 = 8;
        } else {
            bool = java.lang.Boolean.FALSE;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_pick_local_pic_capture", i17);
        intent.putExtra("key_pick_local_pic_count", optInt);
        intent.putExtra("key_pick_local_pic_query_source_type", i27);
        intent.putExtra("key_pick_local_pic_send_raw", bool);
        intent.putExtra("query_media_type", 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseImage", "doChooseImage: realScene: %d, count: %d, querySourceType: %d, sendRaw: %b", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(i27), bool);
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).f488143d).m78545xde66c1f2(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.a0(this, bVar));
        j45.l.o(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).f488143d, "webview", ".ui.tools.OpenFileChooserUI", intent, hashCode() & 65535, false);
    }
}
