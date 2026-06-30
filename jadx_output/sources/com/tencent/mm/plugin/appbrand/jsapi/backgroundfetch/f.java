package com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch;

@mk0.a
/* loaded from: classes.dex */
class f implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.JsApiSetBackgroundFetchToken$SetBackgroundFetchTokenParcel, com.tencent.mm.ipcinvoker.type.IPCBoolean> {
    private f() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.JsApiSetBackgroundFetchToken$SetBackgroundFetchTokenParcel jsApiSetBackgroundFetchToken$SetBackgroundFetchTokenParcel = (com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.JsApiSetBackgroundFetchToken$SetBackgroundFetchTokenParcel) obj;
        if (jsApiSetBackgroundFetchToken$SetBackgroundFetchTokenParcel != null) {
            java.lang.String str2 = jsApiSetBackgroundFetchToken$SetBackgroundFetchTokenParcel.f79836d;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && (str = jsApiSetBackgroundFetchToken$SetBackgroundFetchTokenParcel.f79837e) != null) {
                java.lang.String f17 = k91.k4.f(str2);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(f17) && i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundfetch.t1.class) != null) {
                    ((com.tencent.mm.plugin.appbrand.backgroundfetch.t1) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundfetch.t1.class)).P2(f17, str);
                    rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(true));
                    return;
                }
            }
        }
        rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
    }
}
