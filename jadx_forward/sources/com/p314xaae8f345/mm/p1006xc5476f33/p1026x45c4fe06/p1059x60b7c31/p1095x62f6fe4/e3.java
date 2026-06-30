package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public final class e3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34475x366c91de = 29;

    /* renamed from: NAME */
    public static final java.lang.String f34476x24728b = "chooseImage";

    /* renamed from: g, reason: collision with root package name */
    public boolean f163314g = false;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12160x62e35647 f163315h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u f163316i;

    public static org.json.JSONArray C(java.util.ArrayList arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseImage", "data is null");
            return null;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            jSONArray.put(arrayList.get(i17));
        }
        return jSONArray;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar.mo48798x74292566() == null) {
            lVar.a(i17, o("fail"));
            return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.b(lVar.mo48798x74292566()).f167246f) {
            lVar.a(i17, o("cancel"));
            return;
        }
        android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
        if (mo50352x76847179 == null || !(mo50352x76847179 instanceof android.app.Activity)) {
            lVar.a(i17, o("fail"));
            return;
        }
        this.f163315h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12160x62e35647();
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("sourceType");
        java.lang.String optString = jSONObject.optString("sizeType");
        java.lang.String optString2 = jSONObject.optString("count");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseImage", "doChooseImage sourceType = %s, sizeType = %s, count = %s", optJSONArray, optString, optString2);
        if (optJSONArray == null || optJSONArray.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12160x62e35647 c12160x62e35647 = this.f163315h;
            c12160x62e35647.f163160f = true;
            c12160x62e35647.f163161g = true;
        } else {
            this.f163315h.f163160f = optJSONArray.toString().contains("camera");
            this.f163315h.f163161g = optJSONArray.toString().contains(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37635xb5a3973f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.a(lVar.mo48798x74292566()).f167246f = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(lVar.mo48798x74292566(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.l2(this, lVar));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            optString = "compressed";
        }
        this.f163315h.f163162h = optString.contains("compressed");
        this.f163315h.f163163i = optString.contains("original");
        this.f163315h.f163159e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(optString2, 9);
        this.f163315h.f163158d = lVar.mo48798x74292566();
        this.f163316i = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.m2(this, lVar, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12160x62e35647 c12160x62e356472 = this.f163315h;
        if (c12160x62e356472.f163160f && c12160x62e356472.f163161g) {
            ik1.h0.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p2(this, lVar, jSONObject, i17, mo50352x76847179));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseImage", "start select");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12160x62e35647 c12160x62e356473 = this.f163315h;
        if (c12160x62e356473.f163161g && !c12160x62e356473.f163160f && !E(lVar, jSONObject, i17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseImage", "requestExternalStoragePermission fail, abort");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12160x62e35647 c12160x62e356474 = this.f163315h;
        if (c12160x62e356474.f163161g || !c12160x62e356474.f163160f || D(lVar, jSONObject, i17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.b(mo50352x76847179, this.f163315h, this.f163316i);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseImage", "requestCameraPermission fail, abort");
        }
    }

    public final boolean D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        boolean z17;
        if (!this.f163314g) {
            si1.e1.a(lVar.mo48798x74292566(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.q2(this, lVar, i17));
            this.f163314g = true;
        }
        android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
        if (mo50352x76847179 == null || !(mo50352x76847179 instanceof android.app.Activity)) {
            lVar.a(i17, o("fail"));
            z17 = false;
        } else {
            z17 = nf.t.a((android.app.Activity) mo50352x76847179, lVar, "android.permission.CAMERA", 113, "", "");
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseImage", "requestCameraPermission fail, abort");
            return false;
        }
        si1.e1.c(lVar.mo48798x74292566());
        this.f163314g = false;
        return true;
    }

    public final boolean E(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        boolean z17;
        if (!this.f163314g) {
            si1.e1.a(lVar.mo48798x74292566(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.q2(this, lVar, i17));
            this.f163314g = true;
        }
        android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
        if (mo50352x76847179 == null || !(mo50352x76847179 instanceof android.app.Activity)) {
            lVar.a(i17, o("fail"));
            z17 = false;
        } else {
            z17 = android.os.Build.VERSION.SDK_INT >= 29 ? nf.t.a((android.app.Activity) mo50352x76847179, lVar, "android.permission.READ_EXTERNAL_STORAGE", 145, "", "") : nf.t.a((android.app.Activity) mo50352x76847179, lVar, "android.permission.WRITE_EXTERNAL_STORAGE", 145, "", "");
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseImage", "requestExternalStoragePermission fail, abort");
            return false;
        }
        si1.e1.c(lVar.mo48798x74292566());
        this.f163314g = false;
        return true;
    }
}
