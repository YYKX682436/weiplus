package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes.dex */
public final class o0 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.p0 f164175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f164176b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f164177c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f164178d;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.p0 p0Var, java.lang.ref.WeakReference weakReference, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17) {
        this.f164175a = p0Var;
        this.f164176b = weakReference;
        this.f164177c = c0Var;
        this.f164178d = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiQuickSendRedPacket", "on result, requestCode: %d, resultCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.p0 p0Var = this.f164175a;
        if (p0Var.f164182g != i17) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) this.f164176b.get();
        if (c0Var != null && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("KEY_FINISH_ACTIVITY_REASON");
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, "KEY_FINISH_ACTIVITY_FOR_BACK_PRESSED");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var2 = this.f164177c;
            int i19 = this.f164178d;
            if (b17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiQuickSendRedPacket", "[mmOnActivityResult] cancel");
                if (c0Var2 != null) {
                    p0Var.getClass();
                    str = android.text.TextUtils.isEmpty(null) ? "fail:quick send redpacket cancel select conversation" : null;
                    str2 = str != null ? str : "";
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("errno", 701117);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                    }
                    c0Var.a(i19, p0Var.u(str2, jSONObject));
                }
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, "KEY_FINISH_ACTIVITY_FOR_PAY_SUCCESS")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiQuickSendRedPacket", "[mmOnActivityResult] pay success");
                if (c0Var2 != null) {
                    p0Var.getClass();
                    str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                    str2 = str != null ? str : "";
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        jSONObject2.put("errno", 0);
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                    }
                    c0Var.a(i19, p0Var.u(str2, jSONObject2));
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("JsApiQuickSendRedPacket", "[mmOnActivityResult] unknow error");
                if (c0Var2 != null) {
                    p0Var.getClass();
                    str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
                    str2 = str != null ? str : "";
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    try {
                        jSONObject3.put("errno", 101);
                    } catch (java.lang.Exception e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                    }
                    c0Var.a(i19, p0Var.u(str2, jSONObject3));
                }
            }
        }
        return true;
    }
}
