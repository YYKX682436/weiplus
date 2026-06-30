package com.tencent.mm.plugin.appbrand.jsapi.profile;

/* loaded from: classes7.dex */
public final class d implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f82785a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82786b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.profile.e f82787c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f82789e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82790f;

    public d(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.profile.e eVar, java.lang.String str, int i18, java.lang.String str2) {
        this.f82785a = lVar;
        this.f82786b = i17;
        this.f82787c = eVar;
        this.f82788d = str;
        this.f82789e = i18;
        this.f82790f = str2;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileResult profileResult = (com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileResult) appBrandProxyUIProcessTask$ProcessResult;
        com.tencent.mm.plugin.appbrand.jsapi.profile.e eVar = this.f82787c;
        int i17 = this.f82786b;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f82785a;
        if (profileResult == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenBizProfile", "onReceiveResult, null result");
            lVar.a(i17, eVar.o("fail"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenBizProfile", "onReceiveResult resultCode:%d", java.lang.Integer.valueOf(profileResult.f82765d));
        int i18 = profileResult.f82765d;
        if (i18 == 0) {
            lVar.a(i17, eVar.o("fail"));
            return;
        }
        if (i18 != 1) {
            if (i18 != 2) {
                lVar.a(i17, eVar.o("fail"));
                return;
            } else {
                lVar.a(i17, eVar.o("cancel"));
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = this.f82788d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            intent.putExtra("key_add_contact_report_info", str);
        }
        if (!((profileResult.f82766e & 1) != 0)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenBizProfile", "onReceiveResult, fail:not biz contact");
            lVar.a(i17, eVar.o("fail:not biz contact"));
            return;
        }
        intent.putExtra("Contact_Scene", this.f82789e);
        intent.putExtra("Contact_User", this.f82790f);
        intent.putExtra("key_use_new_contact_profile", true);
        lVar.j(new com.tencent.mm.plugin.appbrand.jsapi.profile.c(lVar, intent), 100L);
        lVar.a(i17, eVar.o("ok"));
    }
}
