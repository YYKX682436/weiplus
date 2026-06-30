package com.tencent.mm.plugin.appbrand.jsapi.profile;

/* loaded from: classes7.dex */
public final class p implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f82814a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82815b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.profile.q f82816c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f82818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82819f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82820g;

    public p(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.profile.q qVar, java.lang.String str, int i18, java.lang.String str2, java.lang.String str3) {
        this.f82814a = lVar;
        this.f82815b = i17;
        this.f82816c = qVar;
        this.f82817d = str;
        this.f82818e = i18;
        this.f82819f = str2;
        this.f82820g = str3;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileResult profileResult = (com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileResult) appBrandProxyUIProcessTask$ProcessResult;
        com.tencent.mm.plugin.appbrand.jsapi.profile.q qVar = this.f82816c;
        int i17 = this.f82815b;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f82814a;
        if (profileResult == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiProfile", "onReceiveResult get NULL result");
            qVar.getClass();
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, qVar.u(str, jSONObject));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiProfile", "onReceiveResult resultCode:%d", java.lang.Integer.valueOf(profileResult.f82765d));
        int i18 = profileResult.f82765d;
        if (i18 == 0) {
            lVar.a(i17, qVar.o("fail"));
            return;
        }
        if (i18 != 1) {
            if (i18 != 2) {
                lVar.a(i17, qVar.o("fail"));
                return;
            } else {
                lVar.a(i17, qVar.o("cancel"));
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str3 = this.f82817d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            intent.putExtra("key_add_contact_report_info", str3);
        }
        if ((profileResult.f82766e & 1) != 0) {
            intent.putExtra("Contact_Scene", this.f82818e);
        }
        java.lang.String tabTypeStr = this.f82819f;
        kotlin.jvm.internal.o.f(tabTypeStr, "$tabTypeStr");
        if ((tabTypeStr.length() > 0) && com.tencent.mm.sdk.platformtools.t8.D1(tabTypeStr, 0) == 2) {
            intent.putExtra("biz_profile_tab_type", 1);
        }
        intent.putExtra("Contact_User", this.f82820g);
        intent.putExtra("key_use_new_contact_profile", true);
        j45.l.j(lVar.getF147807d(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        lVar.a(i17, qVar.o("ok"));
    }
}
