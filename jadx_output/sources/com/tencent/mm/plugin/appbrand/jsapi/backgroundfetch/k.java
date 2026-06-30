package com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch;

/* loaded from: classes7.dex */
public class k extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 685;
    public static final java.lang.String NAME = "triggerBackgroundFetch";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = c0Var.t3().u0();
        java.lang.String str = u07.f77278d;
        java.lang.String str2 = u07.f47278x;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            c0Var.a(i17, o("fail"));
        } else {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.JsApiTriggerBackgroundFetch$TriggerBackgroundFetchParcel(str, str2), com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.j.class, new com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.h(this, c0Var, i17));
        }
    }
}
