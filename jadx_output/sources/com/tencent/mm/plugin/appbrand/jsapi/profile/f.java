package com.tencent.mm.plugin.appbrand.jsapi.profile;

/* loaded from: classes7.dex */
public final class f implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f82793a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82794b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.profile.g f82795c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82797e;

    public f(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.profile.g gVar, java.lang.String str, java.lang.String str2) {
        this.f82793a = lVar;
        this.f82794b = i17;
        this.f82795c = gVar;
        this.f82796d = str;
        this.f82797e = str2;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileResult profileResult = (com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileResult) appBrandProxyUIProcessTask$ProcessResult;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenUserProfile", "onReceiveResult resultCode:%d", java.lang.Integer.valueOf(profileResult.f82765d));
        int i17 = profileResult.f82765d;
        com.tencent.mm.plugin.appbrand.jsapi.profile.g gVar = this.f82795c;
        int i18 = this.f82794b;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f82793a;
        if (i17 == 0) {
            lVar.a(i18, gVar.o("fail"));
            return;
        }
        if (i17 != 1) {
            if (i17 != 2) {
                lVar.a(i18, gVar.o("fail"));
                return;
            } else {
                lVar.a(i18, gVar.o("cancel"));
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = this.f82796d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            intent.putExtra("key_add_contact_report_info", str);
        }
        if ((profileResult.f82766e & 1) != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenUserProfile", "onReceiveResult, fail:not user contact");
            lVar.a(i18, gVar.o("fail:not user contact"));
        } else {
            intent.putExtra("Contact_User", this.f82797e);
            j45.l.j(lVar.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
            lVar.a(i18, gVar.o("ok"));
        }
    }
}
