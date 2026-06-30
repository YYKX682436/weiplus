package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public final class i0 implements com.tencent.mm.plugin.appbrand.utils.q2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f83156a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f83157b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.j0 f83158c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelmulti.WxaInfo f83159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f83160e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f83161f;

    public i0(com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.share.j0 j0Var, com.tencent.mm.modelmulti.WxaInfo wxaInfo, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2) {
        this.f83156a = e9Var;
        this.f83157b = i17;
        this.f83158c = j0Var;
        this.f83159d = wxaInfo;
        this.f83160e = h0Var;
        this.f83161f = h0Var2;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.q2
    public void a(java.lang.String str, boolean z17) {
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mars.xlog.Log.i("Luggage.JsApiShareEmojiMessage", "shareEmojiMessage onPathResolve localPath: " + str + " isPathCreated:" + z17);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        int i17 = this.f83157b;
        com.tencent.mm.plugin.appbrand.jsapi.share.j0 j0Var = this.f83158c;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f83156a;
        if (K0) {
            j0Var.getClass();
            str3 = android.text.TextUtils.isEmpty(null) ? "imagePath is illegal" : null;
            str2 = str3 != null ? str3 : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", -1);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, j0Var.u(str2, jSONObject));
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.y1.f(str)) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiShareEmojiMessage", "shareEmojiMessage %s is not image", str);
            com.tencent.mm.vfs.w6.h(str);
            j0Var.getClass();
            str3 = android.text.TextUtils.isEmpty(null) ? "imagePath is illegal" : null;
            str2 = str3 != null ? str3 : "";
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", -1);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            e9Var.a(i17, j0Var.u(str2, jSONObject2));
            return;
        }
        android.app.Activity Z0 = e9Var.Z0();
        if (Z0 != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_File_Name", str);
            intent.putExtra("scene_from", 23);
            intent.putExtra("Retr_Msg_Type", 5);
            intent.putExtra("wxaInfo", this.f83159d);
            intent.putExtra("weAppSourceUserName", (java.lang.String) this.f83160e.f310123d);
            intent.putExtra("Select_Conv_User", (java.lang.String) this.f83161f.f310123d);
            nf.g.a(Z0).f(new com.tencent.mm.plugin.appbrand.jsapi.share.h0(j0Var, e9Var, Z0, i17));
            j45.l.v(Z0, ".ui.transmit.MsgRetransmitUI", intent, j0Var.f83164g);
            return;
        }
        com.tencent.mars.xlog.Log.w("Luggage.JsApiShareEmojiMessage", "shareEmojiMessage fail, context is null");
        j0Var.getClass();
        java.lang.String str6 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
        str2 = str6 != null ? str6 : "";
        java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 4);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        e9Var.a(i17, j0Var.u(str2, jSONObject3));
    }
}
