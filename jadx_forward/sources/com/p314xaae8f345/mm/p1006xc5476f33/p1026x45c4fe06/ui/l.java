package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes4.dex */
public class l implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257 f171372d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257 activityC12636x4eed9257) {
        this.f171372d = activityC12636x4eed9257;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257 activityC12636x4eed9257 = this.f171372d;
        if (i17 != 0 || i18 != 0) {
            java.lang.String[] strArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257.Z;
            activityC12636x4eed9257.getClass();
            activityC12636x4eed9257.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u(activityC12636x4eed9257, false));
            return 0;
        }
        r45.dc7 dc7Var = (r45.dc7) oVar.f152244b.f152233a;
        if (dc7Var == null) {
            java.lang.String[] strArr2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257.Z;
            activityC12636x4eed9257.getClass();
            activityC12636x4eed9257.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u(activityC12636x4eed9257, false));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandAuthorizeUI", "WxaAppGetAuthInfoReq failed, response is null!");
        } else {
            r45.jw6 jw6Var = dc7Var.f453847d;
            int i19 = jw6Var.f459710d;
            java.lang.String str2 = jw6Var.f459711e;
            if (i19 == 0) {
                java.util.LinkedList linkedList = dc7Var.f453848e;
                activityC12636x4eed9257.f170834d = linkedList;
                activityC12636x4eed9257.E = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257.b7(linkedList);
                activityC12636x4eed9257.K = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257.a7(linkedList);
                r45.uf7 uf7Var = dc7Var.f453849f;
                activityC12636x4eed9257.f170835e = uf7Var;
                ck1.n0 n0Var = ck1.n0.f123887a;
                java.lang.String str3 = activityC12636x4eed9257.f170836f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.UserInfoRevokeRepository", "injectCachedUsageInfo, appId: " + str3);
                if (str3 != null && uf7Var != null) {
                    ((java.util.HashMap) ck1.n0.f123888b).put(str3, uf7Var);
                }
            } else {
                java.lang.String[] strArr3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257.Z;
                activityC12636x4eed9257.getClass();
                activityC12636x4eed9257.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u(activityC12636x4eed9257, false));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandAuthorizeUI", "WxaAppGetAuthInfoReq error %s", str2);
            }
        }
        activityC12636x4eed9257.L = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257.V6(activityC12636x4eed9257, activityC12636x4eed9257.f170834d, activityC12636x4eed9257.N, activityC12636x4eed9257.f170835e);
        return 0;
    }
}
