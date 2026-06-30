package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public class rb implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.i9 f166654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k9 f166655e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f166656f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.tb f166657g;

    public rb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.tb tbVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.i9 i9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k9 k9Var, boolean z17) {
        this.f166657g = tbVar;
        this.f166654d = i9Var;
        this.f166655e = k9Var;
        this.f166656f = z17;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.tb tbVar = this.f166657g;
        int i17 = tbVar.f166715z;
        int i18 = tbVar.f166702m;
        int i19 = tbVar.f166701i;
        java.lang.String str = tbVar.f166700h;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PrepareStepCheckLaunchInfo", "checkIfNeedSyncLaunch secFlagForSinglePageMode:%d", java.lang.Integer.valueOf(i17));
            wg1.d.a(25, str, i19, i18);
            return java.lang.Boolean.TRUE;
        }
        int[] iArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b().f158755t;
        boolean z17 = false;
        int i27 = tbVar.f166705p;
        if (iArr != null && yo.a.a(iArr, i27)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PrepareStepCheckLaunchInfo", "checkIfNeedSyncLaunch, hit scene[%d] return true, appId[%s]", java.lang.Integer.valueOf(i27), str);
            wg1.d.a(21, str, i19, i18);
            return java.lang.Boolean.TRUE;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.i9 i9Var = this.f166654d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k9 k9Var = this.f166655e;
        if (!i9Var.get(k9Var, "appId")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PrepareStepCheckLaunchInfo", "checkIfNeedSyncLaunch, get NULL record, return true, appId[%s]", str);
            wg1.d.a(22, str, i19, i18);
            return java.lang.Boolean.TRUE;
        }
        if (k9Var != null && k9Var.f67124x7960ff7a != null) {
            z17 = true;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PrepareStepCheckLaunchInfo", "checkIfNeedSyncLaunch, get INVALID record, return true, appId[%s]", str);
            wg1.d.a(23, str, i19, i18);
            return java.lang.Boolean.TRUE;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a.d() && this.f166656f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PrepareStepCheckLaunchInfo", "checkIfNeedSyncLaunch, isLocalAssert, return true, appId[%s]", str);
            return java.lang.Boolean.TRUE;
        }
        r45.o54 o54Var = k9Var.f67125x2eee6aee;
        int i28 = o54Var == null ? -1 : o54Var.f463475d;
        if (1 != i28) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PrepareStepCheckLaunchInfo", "checkIfNeedSyncLaunch, cached infoLaunchAction[%d], return true, appId[%s]", java.lang.Integer.valueOf(i28), str);
            if (i28 == 2) {
                wg1.d.a(32, str, i19, i18);
            } else if (i28 == 3) {
                wg1.d.a(33, str, i19, i18);
            } else if (i28 == 4) {
                wg1.d.a(34, str, i19, i18);
            } else if (i28 == 5) {
                wg1.d.a(35, str, i19, i18);
            } else if (i28 != 6) {
                wg1.d.a(31, str, i19, i18);
            } else {
                wg1.d.a(36, str, i19, i18);
            }
            return java.lang.Boolean.TRUE;
        }
        if (k9Var.f67122x55ff97dc > 0) {
            long e17 = c01.id.e();
            if (k9Var.f67122x55ff97dc <= e17) {
                boolean e18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.h9.e();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PrepareStepCheckLaunchInfo", "checkIfNeedSyncLaunch, force update by expiredAtTimestampSeconds[%d], now[%d], appId[%s], isUnderWeakNet[%b]", java.lang.Long.valueOf(k9Var.f67122x55ff97dc), java.lang.Long.valueOf(e17), str, java.lang.Boolean.valueOf(e18));
                if (!e18) {
                    wg1.d.a(24, str, i19, i18);
                    return java.lang.Boolean.TRUE;
                }
                try {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7076x24b2a1a9 c7076x24b2a1a9 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7076x24b2a1a9();
                    c7076x24b2a1a9.f143847e = c7076x24b2a1a9.b("Appid", str, true);
                    c7076x24b2a1a9.f143848f = c7076x24b2a1a9.b("Username", tbVar.f166710u, true);
                    c7076x24b2a1a9.f143849g = i19;
                    c7076x24b2a1a9.f143850h = i18;
                    c7076x24b2a1a9.f143851i = 2L;
                    c7076x24b2a1a9.f143852j = 1L;
                    c7076x24b2a1a9.k();
                } catch (java.lang.Exception unused) {
                }
                return java.lang.Boolean.FALSE;
            }
        }
        return java.lang.Boolean.FALSE;
    }
}
