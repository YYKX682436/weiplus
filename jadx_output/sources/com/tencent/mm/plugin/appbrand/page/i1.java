package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.b f86699d;

    public i1(com.tencent.mm.plugin.appbrand.page.o1 o1Var, com.tencent.luggage.sdk.jsapi.component.b bVar) {
        this.f86699d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = "";
        com.tencent.luggage.sdk.jsapi.component.b bVar = this.f86699d;
        java.lang.String str2 = bVar.getRuntime().u0().f47278x;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        android.content.Intent putExtra = new android.content.Intent(bVar.getF147807d(), (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.class).putExtra("key_username", str2);
        try {
            java.lang.String str3 = com.tencent.mm.plugin.appbrand.l.b(bVar.getAppId()).u0().f47276v;
            if (str3 != null) {
                str = str3;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandMenuHeaderDataHelper", "openSetting, get runtime by %s, e = %s", bVar.getAppId(), e17);
        }
        putExtra.putExtra("key_app_session_id", str);
        putExtra.putExtra("key_app_authorize_profile", true);
        j45.l.j(bVar.getF147807d(), "appbrand", ".ui.AppBrandAuthorizeUI", putExtra, null);
        com.tencent.mm.plugin.appbrand.report.v0.e(bVar.getAppId(), bVar.X1(), 34, "", com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
    }
}
