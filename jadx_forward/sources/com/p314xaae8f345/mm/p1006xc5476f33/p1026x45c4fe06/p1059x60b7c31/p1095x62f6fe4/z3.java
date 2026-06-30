package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public final class z3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34511x366c91de = 193;

    /* renamed from: NAME */
    public static final java.lang.String f34512x24728b = "chooseMedia";

    /* renamed from: h, reason: collision with root package name */
    public static volatile boolean f163699h;

    /* renamed from: g, reason: collision with root package name */
    public boolean f163700g = false;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        boolean z17;
        if (f163699h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "chooseMedia sChoosingMedia is true, do not again");
            lVar.a(i17, o("cancel"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "chooseMedia %s", jSONObject);
        android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
        if (mo50352x76847179 == null || !(mo50352x76847179 instanceof android.app.Activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "chooseMedia fail,  pageContext is null");
            lVar.a(i17, o("fail:page context is null"));
            return;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "chooseMedia fail,  data is null");
            lVar.a(i17, o("fail:data is null"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "chooseMedia data:" + jSONObject.toString());
        if (jSONObject.optJSONArray("sourceType") == null || jSONObject.optJSONArray("sourceType").length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "sourceType is invalid param");
            str = "";
        } else {
            str = jSONObject.optJSONArray("sourceType").toString();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = "camera|album";
        }
        if (jSONObject.optJSONArray("mediaType") == null || jSONObject.optJSONArray("mediaType").length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "mediaType is invalid param");
            str2 = "";
        } else {
            str2 = jSONObject.optJSONArray("mediaType").toString();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str2 = "video|image";
        }
        int min = java.lang.Math.min(jSONObject.optInt("maxDuration", 10), 60);
        if (min < 3 || min > 60) {
            lVar.a(i17, o("fail:error maxDuration"));
            return;
        }
        java.lang.String optString = jSONObject.optString("camera");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            optString = "back";
        }
        int min2 = java.lang.Math.min(jSONObject.optInt("count", 20), 20);
        ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).getClass();
        java.lang.String str3 = "";
        boolean z18 = jSONObject.optBoolean("supportLivePhoto") && qp.b.f447211e;
        if (jSONObject.optJSONArray("sizeType") == null || jSONObject.optJSONArray("sizeType").length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "sizeType is invalid param");
        } else {
            str3 = jSONObject.optJSONArray("sizeType").toString();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            str3 = "original|compressed";
        }
        java.lang.String str4 = str3;
        boolean z19 = z18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "chooseMedia sourceType:%s, mediaType:%s, maxDuration:%d, camera:%s, count:%d, sizeType:%s, supportLivePhoto:%b", str, str2, java.lang.Integer.valueOf(min), optString, java.lang.Integer.valueOf(min2), str4, java.lang.Boolean.valueOf(z18));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12162xc2b17910 c12162xc2b17910 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12162xc2b17910();
        c12162xc2b17910.f163167d = lVar.mo48798x74292566();
        c12162xc2b17910.f163168e = str.contains(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37635xb5a3973f);
        c12162xc2b17910.f163169f = str.contains("camera");
        c12162xc2b17910.f163170g = str2.contains("image");
        c12162xc2b17910.f163171h = str2.contains("video");
        c12162xc2b17910.f163172i = str2.contains("mix");
        try {
            c12162xc2b17910.f163179s = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar).t3().E0()).D1;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "err" + e17.getMessage());
        }
        if (optString.contains("back")) {
            c12162xc2b17910.f163173m = false;
            z17 = true;
        } else if (optString.contains("front")) {
            z17 = true;
            c12162xc2b17910.f163173m = true;
        } else {
            z17 = true;
            c12162xc2b17910.f163173m = false;
        }
        c12162xc2b17910.f163174n = min;
        c12162xc2b17910.f163175o = min2;
        c12162xc2b17910.f163176p = z19;
        c12162xc2b17910.f163177q = str4.contains("compressed");
        c12162xc2b17910.f163178r = str4.contains("original");
        if (!this.f163700g) {
            si1.e1.a(lVar.mo48798x74292566(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.m3(this, lVar, jSONObject, i17, c12162xc2b17910));
            this.f163700g = z17;
        }
        if (c12162xc2b17910.f163168e && c12162xc2b17910.f163169f) {
            ik1.h0.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.f3(this, lVar, jSONObject, i17, c12162xc2b17910));
        } else {
            C(lVar, jSONObject, i17, c12162xc2b17910);
        }
    }

    public final void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12162xc2b17910 c12162xc2b17910) {
        boolean z17;
        boolean z18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "invokeInternalImpl");
        android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
        if (mo50352x76847179 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "chooseMedia fail,  pageContext is null");
            lVar.a(i17, o("fail:page context is null"));
            return;
        }
        if (c12162xc2b17910.f163168e && android.os.Build.VERSION.SDK_INT < 29) {
            android.content.Context mo50352x768471792 = lVar.mo50352x76847179();
            if (mo50352x768471792 == null || !(mo50352x768471792 instanceof android.app.Activity)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "chooseMedia fail, requestExternalStoragePermission pageContext is null");
                lVar.a(i17, o("fail"));
                z18 = false;
            } else {
                z18 = nf.t.a((android.app.Activity) mo50352x768471792, lVar, "android.permission.WRITE_EXTERNAL_STORAGE", 145, "", "");
            }
            if (!z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "chooseMedia requestExternalStoragePermission is fail");
                return;
            }
        }
        if (c12162xc2b17910.f163169f && (c12162xc2b17910.f163170g || c12162xc2b17910.f163171h)) {
            android.content.Context mo50352x768471793 = lVar.mo50352x76847179();
            if (mo50352x768471793 == null || !(mo50352x768471793 instanceof android.app.Activity)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "chooseMedia fail, requestCameraPermission pageContext is null");
                lVar.a(i17, o("fail"));
                z17 = false;
            } else {
                z17 = nf.t.a((android.app.Activity) mo50352x768471793, lVar, "android.permission.CAMERA", 119, "", "");
            }
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "chooseMedia requestCameraPermission is fail");
                return;
            }
        }
        if (c12162xc2b17910.f163169f) {
            boolean z19 = c12162xc2b17910.f163171h;
        }
        si1.e1.c(lVar.mo48798x74292566());
        this.f163700g = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "do chooseMedia");
        f163699h = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(lVar.mo48798x74292566(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.k3(this, lVar));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.l3 l3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.l3(this, lVar, i17);
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(mo50352x76847179, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, c12162xc2b17910, l3Var, null);
    }
}
