package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes8.dex */
public class wb implements com.tencent.mm.modelbase.e3 {
    public wb(com.tencent.mm.plugin.appbrand.ui.AppBrandVoIPDeviceListAuthorizeUI appBrandVoIPDeviceListAuthorizeUI) {
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandVoIPDeviceListAuthorizeUI", "WxaModVoipDeviceAuthResp errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 0 && i18 == 0) {
            if (((r45.ke7) oVar.f70711b.f70700a) == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandVoIPDeviceListAuthorizeUI", "WxaModVoipDeviceAuthResp failed, response is null!");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandVoIPDeviceListAuthorizeUI", "WxaModVoipDeviceAuthResp success");
            }
        }
        return 0;
    }
}
