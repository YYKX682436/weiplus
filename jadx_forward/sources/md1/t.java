package md1;

/* loaded from: classes13.dex */
public final class t implements com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ md1.u f407336a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f407337b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f407338c;

    public t(md1.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f407336a = uVar;
        this.f407337b = lVar;
        this.f407338c = i17;
    }

    public void a(int i17, java.lang.String str, java.lang.String str2, int i18, int i19) {
        java.lang.String str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceOperateVoIPView", "onCapture ret:" + i17 + ", path:" + str + ", errMsg:" + str2 + ", width:" + i18 + ", height:" + i19);
        int i27 = this.f407338c;
        md1.u uVar = this.f407336a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f407337b;
        if (i17 != 0 || str == null) {
            java.lang.String str4 = "fail:" + str2;
            uVar.getClass();
            str3 = android.text.TextUtils.isEmpty(str4) ? "fail:internal error" : str4;
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i27, uVar.u(str3, jSONObject));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String C = md1.u.C(uVar, lVar, str, true);
        if (C != null) {
            hashMap.put("tempImagePath", C);
            hashMap.put("width", java.lang.Integer.valueOf(i18));
            hashMap.put("height", java.lang.Integer.valueOf(i19));
            uVar.getClass();
            java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 0);
            lVar.a(i27, uVar.t("ok", hashMap));
            return;
        }
        uVar.getClass();
        str3 = android.text.TextUtils.isEmpty("fail:failed to create local id") ? "fail:internal error" : "fail:failed to create local id";
        java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 4);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        lVar.a(i27, uVar.u(str3, jSONObject2));
    }

    public void b(int i17, java.lang.String str) {
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceOperateVoIPView", "onStartRecord, ret:" + i17 + ", errMsg:" + str);
        md1.u uVar = this.f407336a;
        int i18 = this.f407338c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f407337b;
        if (i17 == 0) {
            uVar.getClass();
            java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str3 != null ? str3 : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i18, uVar.u(str2, jSONObject));
            return;
        }
        java.lang.String str5 = "fail:" + str;
        uVar.getClass();
        if (android.text.TextUtils.isEmpty(str5)) {
            str5 = "fail:internal error";
        }
        str2 = str5 != null ? str5 : "";
        java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 4);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        lVar.a(i18, uVar.u(str2, jSONObject2));
    }

    public void c(int i17, java.lang.String str, java.lang.String str2, int i18, int i19, boolean z17) {
        java.lang.String str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceOperateVoIPView", "onStopRecord ret %d, tempVideoPath %s, width %d, height %d, isSaveRecordPath %b", java.lang.Integer.valueOf(i17), str2, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(z17));
        int i27 = this.f407338c;
        md1.u uVar = this.f407336a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f407337b;
        if (i17 != 0) {
            java.lang.String str4 = "fail:" + str;
            uVar.getClass();
            str3 = android.text.TextUtils.isEmpty(str4) ? "fail:internal error" : str4;
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i27, uVar.u(str3, jSONObject));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        java.lang.String C = md1.u.C(uVar, lVar, str2, !z17);
        if (C != null) {
            hashMap.put("tempVideoPath", C);
            hashMap.put("height", java.lang.Integer.valueOf(i19));
            hashMap.put("width", java.lang.Integer.valueOf(i18));
            uVar.getClass();
            java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 0);
            lVar.a(i27, uVar.t("ok", hashMap));
            return;
        }
        uVar.getClass();
        str3 = android.text.TextUtils.isEmpty("fail:failed to create local id") ? "fail:internal error" : "fail:failed to create local id";
        java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 4);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        lVar.a(i27, uVar.u(str3, jSONObject2));
    }
}
