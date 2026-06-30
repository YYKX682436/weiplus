package com.tencent.mm.plugin.appbrand.location;

/* JADX INFO: Access modifiers changed from: package-private */
@mk0.a
/* loaded from: classes7.dex */
public class d implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.ipcinvoker.type.IPCString, com.tencent.mm.plugin.appbrand.location.AppBrandLocationReport$LocationInfoData> {
    private d() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        boolean z17;
        java.lang.String requestAppId = ((com.tencent.mm.ipcinvoker.type.IPCString) obj).f68406d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLocationReport", "QueryLocationCacheTask invoke appId:%s, currentAppIdInOfTemporary:%s", requestAppId, com.tencent.mm.plugin.appbrand.location.a.f85500b);
        kotlin.jvm.internal.o.g(requestAppId, "requestAppId");
        if (!com.tencent.mm.plugin.appbrand.location.a.f85510l || com.tencent.mm.sdk.platformtools.t8.K0(requestAppId) || com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.appbrand.location.a.f85500b)) {
            z17 = false;
        } else {
            java.lang.Object[] objArr = {requestAppId, com.tencent.mm.plugin.appbrand.location.a.f85500b};
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLocationInfoTemporaryStorage", "requestAppId:%s, appId:%s", objArr);
            z17 = requestAppId.equals(com.tencent.mm.plugin.appbrand.location.a.f85500b);
        }
        if (!z17) {
            if (rVar != null) {
                rVar.a(new com.tencent.mm.plugin.appbrand.location.AppBrandLocationReport$LocationInfoData());
                return;
            }
            return;
        }
        if (rVar != null) {
            com.tencent.mm.plugin.appbrand.location.AppBrandLocationReport$LocationInfoData appBrandLocationReport$LocationInfoData = new com.tencent.mm.plugin.appbrand.location.AppBrandLocationReport$LocationInfoData();
            appBrandLocationReport$LocationInfoData.f85488d = com.tencent.mm.plugin.appbrand.location.a.f85500b;
            appBrandLocationReport$LocationInfoData.f85489e = com.tencent.mm.plugin.appbrand.location.a.f85501c;
            appBrandLocationReport$LocationInfoData.f85490f = com.tencent.mm.plugin.appbrand.location.a.f85502d;
            appBrandLocationReport$LocationInfoData.f85491g = com.tencent.mm.plugin.appbrand.location.a.f85504f;
            appBrandLocationReport$LocationInfoData.f85492h = com.tencent.mm.plugin.appbrand.location.a.f85503e;
            appBrandLocationReport$LocationInfoData.f85493i = com.tencent.mm.plugin.appbrand.location.a.f85505g;
            appBrandLocationReport$LocationInfoData.f85494m = com.tencent.mm.plugin.appbrand.location.a.f85506h;
            appBrandLocationReport$LocationInfoData.f85495n = com.tencent.mm.plugin.appbrand.location.a.f85507i;
            appBrandLocationReport$LocationInfoData.f85496o = com.tencent.mm.plugin.appbrand.location.a.f85508j;
            appBrandLocationReport$LocationInfoData.f85497p = com.tencent.mm.plugin.appbrand.location.a.f85509k;
            appBrandLocationReport$LocationInfoData.f85498q = true;
            rVar.a(appBrandLocationReport$LocationInfoData);
            com.tencent.mm.plugin.appbrand.location.a.f85510l = false;
        }
    }
}
