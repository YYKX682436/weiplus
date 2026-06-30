package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class rb implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.i9 f85121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.k9 f85122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f85123f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.tb f85124g;

    public rb(com.tencent.mm.plugin.appbrand.launching.tb tbVar, com.tencent.mm.plugin.appbrand.launching.i9 i9Var, com.tencent.mm.plugin.appbrand.launching.k9 k9Var, boolean z17) {
        this.f85124g = tbVar;
        this.f85121d = i9Var;
        this.f85122e = k9Var;
        this.f85123f = z17;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        com.tencent.mm.plugin.appbrand.launching.tb tbVar = this.f85124g;
        int i17 = tbVar.f85182z;
        int i18 = tbVar.f85169m;
        int i19 = tbVar.f85168i;
        java.lang.String str = tbVar.f85167h;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PrepareStepCheckLaunchInfo", "checkIfNeedSyncLaunch secFlagForSinglePageMode:%d", java.lang.Integer.valueOf(i17));
            wg1.d.a(25, str, i19, i18);
            return java.lang.Boolean.TRUE;
        }
        int[] iArr = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().f77222t;
        boolean z17 = false;
        int i27 = tbVar.f85172p;
        if (iArr != null && yo.a.a(iArr, i27)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PrepareStepCheckLaunchInfo", "checkIfNeedSyncLaunch, hit scene[%d] return true, appId[%s]", java.lang.Integer.valueOf(i27), str);
            wg1.d.a(21, str, i19, i18);
            return java.lang.Boolean.TRUE;
        }
        com.tencent.mm.plugin.appbrand.launching.i9 i9Var = this.f85121d;
        com.tencent.mm.plugin.appbrand.launching.k9 k9Var = this.f85122e;
        if (!i9Var.get(k9Var, "appId")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PrepareStepCheckLaunchInfo", "checkIfNeedSyncLaunch, get NULL record, return true, appId[%s]", str);
            wg1.d.a(22, str, i19, i18);
            return java.lang.Boolean.TRUE;
        }
        if (k9Var != null && k9Var.field_jsapiInfo != null) {
            z17 = true;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PrepareStepCheckLaunchInfo", "checkIfNeedSyncLaunch, get INVALID record, return true, appId[%s]", str);
            wg1.d.a(23, str, i19, i18);
            return java.lang.Boolean.TRUE;
        }
        if (com.tencent.mm.plugin.appbrand.appcache.y7.f76065a.d() && this.f85123f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PrepareStepCheckLaunchInfo", "checkIfNeedSyncLaunch, isLocalAssert, return true, appId[%s]", str);
            return java.lang.Boolean.TRUE;
        }
        r45.o54 o54Var = k9Var.field_launchAction;
        int i28 = o54Var == null ? -1 : o54Var.f381942d;
        if (1 != i28) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PrepareStepCheckLaunchInfo", "checkIfNeedSyncLaunch, cached infoLaunchAction[%d], return true, appId[%s]", java.lang.Integer.valueOf(i28), str);
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
        if (k9Var.field_expiredAtTimestampSeconds > 0) {
            long e17 = c01.id.e();
            if (k9Var.field_expiredAtTimestampSeconds <= e17) {
                boolean e18 = com.tencent.mm.plugin.appbrand.launching.h9.e();
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PrepareStepCheckLaunchInfo", "checkIfNeedSyncLaunch, force update by expiredAtTimestampSeconds[%d], now[%d], appId[%s], isUnderWeakNet[%b]", java.lang.Long.valueOf(k9Var.field_expiredAtTimestampSeconds), java.lang.Long.valueOf(e17), str, java.lang.Boolean.valueOf(e18));
                if (!e18) {
                    wg1.d.a(24, str, i19, i18);
                    return java.lang.Boolean.TRUE;
                }
                try {
                    com.tencent.mm.autogen.mmdata.rpt.WeAppOpenForceSyncOrAsyncGetResourceStruct weAppOpenForceSyncOrAsyncGetResourceStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppOpenForceSyncOrAsyncGetResourceStruct();
                    weAppOpenForceSyncOrAsyncGetResourceStruct.f62314e = weAppOpenForceSyncOrAsyncGetResourceStruct.b("Appid", str, true);
                    weAppOpenForceSyncOrAsyncGetResourceStruct.f62315f = weAppOpenForceSyncOrAsyncGetResourceStruct.b("Username", tbVar.f85177u, true);
                    weAppOpenForceSyncOrAsyncGetResourceStruct.f62316g = i19;
                    weAppOpenForceSyncOrAsyncGetResourceStruct.f62317h = i18;
                    weAppOpenForceSyncOrAsyncGetResourceStruct.f62318i = 2L;
                    weAppOpenForceSyncOrAsyncGetResourceStruct.f62319j = 1L;
                    weAppOpenForceSyncOrAsyncGetResourceStruct.k();
                } catch (java.lang.Exception unused) {
                }
                return java.lang.Boolean.FALSE;
            }
        }
        return java.lang.Boolean.FALSE;
    }
}
