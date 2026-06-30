package com.tencent.mm.plugin.appbrand.backgroundfetch;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.PluginAppBrand.class})
/* loaded from: classes.dex */
public class g0 extends i95.w implements com.tencent.mm.plugin.appbrand.backgroundfetch.t1 {
    @Override // com.tencent.mm.plugin.appbrand.backgroundfetch.t1
    public boolean P2(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataTokenStorageIPC$WxappParams(str, str2), com.tencent.mm.plugin.appbrand.backgroundfetch.e0.class);
        return iPCBoolean != null && iPCBoolean.f68400d;
    }

    @Override // com.tencent.mm.plugin.appbrand.backgroundfetch.t1
    public boolean d(java.lang.String str) {
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(str), com.tencent.mm.plugin.appbrand.backgroundfetch.c0.class);
        return iPCBoolean != null && iPCBoolean.f68400d;
    }

    @Override // com.tencent.mm.plugin.appbrand.backgroundfetch.t1
    public com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataTokenParcel get(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataTokenParcel) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(str), com.tencent.mm.plugin.appbrand.backgroundfetch.d0.class);
    }
}
