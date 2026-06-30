package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes4.dex */
public class l implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI f89839d;

    public l(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI) {
        this.f89839d = appBrandAuthorizeUI;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI = this.f89839d;
        if (i17 != 0 || i18 != 0) {
            java.lang.String[] strArr = com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.Z;
            appBrandAuthorizeUI.getClass();
            appBrandAuthorizeUI.runOnUiThread(new com.tencent.mm.plugin.appbrand.ui.u(appBrandAuthorizeUI, false));
            return 0;
        }
        r45.dc7 dc7Var = (r45.dc7) oVar.f70711b.f70700a;
        if (dc7Var == null) {
            java.lang.String[] strArr2 = com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.Z;
            appBrandAuthorizeUI.getClass();
            appBrandAuthorizeUI.runOnUiThread(new com.tencent.mm.plugin.appbrand.ui.u(appBrandAuthorizeUI, false));
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandAuthorizeUI", "WxaAppGetAuthInfoReq failed, response is null!");
        } else {
            r45.jw6 jw6Var = dc7Var.f372314d;
            int i19 = jw6Var.f378177d;
            java.lang.String str2 = jw6Var.f378178e;
            if (i19 == 0) {
                java.util.LinkedList linkedList = dc7Var.f372315e;
                appBrandAuthorizeUI.f89301d = linkedList;
                appBrandAuthorizeUI.E = com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.b7(linkedList);
                appBrandAuthorizeUI.K = com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.a7(linkedList);
                r45.uf7 uf7Var = dc7Var.f372316f;
                appBrandAuthorizeUI.f89302e = uf7Var;
                ck1.n0 n0Var = ck1.n0.f42354a;
                java.lang.String str3 = appBrandAuthorizeUI.f89303f;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.UserInfoRevokeRepository", "injectCachedUsageInfo, appId: " + str3);
                if (str3 != null && uf7Var != null) {
                    ((java.util.HashMap) ck1.n0.f42355b).put(str3, uf7Var);
                }
            } else {
                java.lang.String[] strArr3 = com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.Z;
                appBrandAuthorizeUI.getClass();
                appBrandAuthorizeUI.runOnUiThread(new com.tencent.mm.plugin.appbrand.ui.u(appBrandAuthorizeUI, false));
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandAuthorizeUI", "WxaAppGetAuthInfoReq error %s", str2);
            }
        }
        appBrandAuthorizeUI.L = true;
        com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.V6(appBrandAuthorizeUI, appBrandAuthorizeUI.f89301d, appBrandAuthorizeUI.N, appBrandAuthorizeUI.f89302e);
        return 0;
    }
}
