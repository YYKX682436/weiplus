package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class g0 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {

    /* renamed from: e, reason: collision with root package name */
    public sd.b f263846e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f263847f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.da f263848g = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.f0(this);

    @Override // sd.c
    public java.lang.String b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.z3.f34512x24728b;
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "invoke");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).f488143d;
        this.f263847f = abstractActivityC21394xb3d2c0cf;
        this.f263846e = bVar;
        if (abstractActivityC21394xb3d2c0cf == null) {
            h("fail", null);
            return;
        }
        org.json.JSONObject jSONObject = bVar.f488130b.f426039c;
        java.lang.String optString = jSONObject.optString("sourceType");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (optString == null) {
            optString = "";
        }
        java.lang.String optString2 = jSONObject.optString("mediaType", "");
        int min = java.lang.Math.min(jSONObject.optInt("maxDuration", 10), 10);
        java.lang.String optString3 = jSONObject.optString("camera", "");
        int optInt = jSONObject.optInt("count", 1);
        java.lang.String optString4 = jSONObject.optString("sizeType", "");
        boolean z18 = false;
        boolean z19 = false;
        for (java.lang.String str : optString2.length() == 0 ? new java.lang.String[0] : optString2.split("\\|")) {
            if ("image".equals(str)) {
                z19 = true;
            } else if (!"video".equals(str) && "livePhoto".equals(str)) {
                z18 = true;
            }
        }
        boolean z27 = z18 || "true".equals(jSONObject.optString("livePhoto", ""));
        boolean z28 = z18 && !z19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "doChooseMedia sourceType:%s, mediaType:%s, maxDuration:%d, camera:%s, count:%d, sizeType:%s livePhoto:%b livePhotoOnly:%b", optString, optString2, java.lang.Integer.valueOf(min), optString3, java.lang.Integer.valueOf(optInt), optString4, java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(z28));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_pick_local_pic_count", optInt);
        intent.putExtra("key_pick_local_media_duration", min <= 0 ? 10 : min);
        intent.putExtra("query_media_type", 3);
        intent.putExtra("key_pick_local_media_video_type", 2);
        intent.putExtra("key_pick_local_media_sight_type", optString2);
        ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).getClass();
        if (qp.b.f447211e && z27) {
            intent.putExtra("key_pick_local_media_localphoto", true);
            if (z28) {
                intent.putExtra("key_pick_local_media_livephoto_only", true);
            }
        }
        intent.putExtra("key_force_hide_edit_image_button", true);
        intent.putExtra("key_pick_local_pic_query_source_type", optString4.contains("original") ^ optString4.contains("compressed") ? 7 : 8);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(true ^ optString4.contains("compressed"));
        if (!optString4.contains("original") && !optString4.contains("compressed")) {
            valueOf = java.lang.Boolean.FALSE;
        }
        intent.putExtra("key_pick_local_pic_send_raw", valueOf);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            optString = "album|camera";
        }
        if (optString.contains(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37635xb5a3973f) && optString.contains("camera")) {
            new com.p314xaae8f345.mm.ui.p2740x696c9db.s6(this.f263847f).a(null, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.c0(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.d0(this, optString3, intent), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.e0(this));
            return;
        }
        if (optString.contains(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37635xb5a3973f)) {
            f(intent);
        } else if (optString.contains("camera")) {
            g(optString3, intent);
        } else {
            h("sourceType_error", null);
        }
    }

    public final void f(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "chooseMediaFromAlbum");
        intent.putExtra("key_pick_local_pic_capture", 4096);
        this.f263847f.m78545xde66c1f2(this.f263848g);
        j45.l.o(this.f263847f, "webview", ".ui.tools.OpenFileChooserUI", intent, hashCode() & 65535, false);
    }

    public final void g(java.lang.String str, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "chooseMediaFromCamera");
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f263847f;
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a(abstractActivityC21394xb3d2c0cf, "android.permission.CAMERA", 119, "", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", " checkPermission checkcamera[%b]", java.lang.Boolean.valueOf(a17));
        if (!a17) {
            h("no_user_permission", null);
            return;
        }
        intent.putExtra("key_pick_local_pic_capture", str.equals("front") ? 16 : 256);
        this.f263847f.m78545xde66c1f2(this.f263848g);
        j45.l.o(this.f263847f, "webview", ".ui.tools.OpenFileChooserUI", intent, hashCode() & 65535, false);
    }

    public final void h(java.lang.String str, java.util.HashMap hashMap) {
        sd.b bVar = this.f263846e;
        if (bVar != null) {
            bVar.b(str, hashMap);
        }
        this.f263846e = null;
        this.f263847f = null;
    }
}
