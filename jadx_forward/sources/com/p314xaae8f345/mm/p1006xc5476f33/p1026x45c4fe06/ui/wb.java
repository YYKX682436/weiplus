package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes8.dex */
public class wb implements com.p314xaae8f345.mm.p944x882e457a.e3 {
    public wb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12694x919e0e63 activityC12694x919e0e63) {
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandVoIPDeviceListAuthorizeUI", "WxaModVoipDeviceAuthResp errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 0 && i18 == 0) {
            if (((r45.ke7) oVar.f152244b.f152233a) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandVoIPDeviceListAuthorizeUI", "WxaModVoipDeviceAuthResp failed, response is null!");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandVoIPDeviceListAuthorizeUI", "WxaModVoipDeviceAuthResp success");
            }
        }
        return 0;
    }
}
