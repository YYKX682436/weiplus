package com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch;

@mk0.a
/* loaded from: classes7.dex */
class j implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.JsApiTriggerBackgroundFetch$TriggerBackgroundFetchParcel, com.tencent.mm.ipcinvoker.type.IPCString> {
    private j() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataTokenParcel appBrandBackgroundFetchDataTokenParcel;
        com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.JsApiTriggerBackgroundFetch$TriggerBackgroundFetchParcel jsApiTriggerBackgroundFetch$TriggerBackgroundFetchParcel = (com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.JsApiTriggerBackgroundFetch$TriggerBackgroundFetchParcel) obj;
        java.lang.String str2 = jsApiTriggerBackgroundFetch$TriggerBackgroundFetchParcel.f79839e;
        java.lang.String str3 = jsApiTriggerBackgroundFetch$TriggerBackgroundFetchParcel.f79838d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "forcePeriodFetchData, userName:%s, appId:%s", str2, str3);
        if (!com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "forcePeriodFetchData, not wifi network");
            str = "fail:not wifi network";
        } else if (i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundfetch.t1.class) == null || !((appBrandBackgroundFetchDataTokenParcel = ((com.tencent.mm.plugin.appbrand.backgroundfetch.t1) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundfetch.t1.class)).get(str2)) == null || com.tencent.mm.sdk.platformtools.t8.K0(appBrandBackgroundFetchDataTokenParcel.f76796e))) {
            ik1.h0.a().postToWorker(new com.tencent.mm.plugin.appbrand.backgroundfetch.c(str2, str3));
            str = "ok";
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "forcePeriodFetchData, app(%s) token is empty", str2);
            str = "fail:token not set";
        }
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString(str));
        }
    }
}
